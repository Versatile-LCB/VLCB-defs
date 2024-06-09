#!/bin/bash
#set -x

OUTPUT=vlcbdefs.cs
echo "Generating $OUTPUT"
# first output the header stuff
cat << EOF > $OUTPUT
/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by $0 from vlcb-defs.csv
 */ 

namespace Merg.Vlcb
{

EOF

# output the comments
grep '^comment' vlcb-defs.csv | cut -f2- -d , | sed 's!^!    // !' |sed 's!,!!' | sed 's!,!!' >> $OUTPUT

cat << EOF >> $OUTPUT

    public static class VlcbDefs
    {
EOF

# Each type is a static nested class.
for class in $(cat vlcb-defs.csv|cut -f1 -d ,|grep -v comment|sort|uniq | sed 's/^Cbus/Vlcb/')
do
    echo "           VlcbDefs.$class"

    cat << EOF >> $OUTPUT
        public static class $class
        {
EOF

    # now output the actual contents
    while IFS="," read type name value comment
    do
    type=${type/#Cbus/Vlcb}
        if [ "$type" = $class ]; then
            if [ "X$name" = "X" ]; then
                echo -e "\t\t\t// $value$comment"
            else
                echo -e "\t\t\tpublic const int $name\t=  $value;\t// $comment"
            fi
        fi
    done < vlcb-defs.csv >> $OUTPUT

    cat << EOF >> $OUTPUT
        }

EOF
done

# finally output the trailer stuff
cat << EOF >> $OUTPUT
    }
}
EOF
