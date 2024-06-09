# Generate a C++ header where all constants are grouped in enums.

OUTPUT=vlcbdefs.hpp
echo "Generating $OUTPUT"

# first out put the header stuff
cat << EOF > $OUTPUT
/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by $0 from vlcb-defs.csv
 */
#ifndef __VLCBDEFS
#define __VLCBDEFS

#ifdef __cplusplus
extern "C" {
#endif

EOF

# now output the actual contents
# Set input field separator (IFS) to comma and carriage return for running on Windows.
while IFS=$',\r' read type name value comment 
do
    if [ "$type" = "comment" ]
    then
        echo -e "// $name\t$value\t$comment"
    elif [ -z "$type" ]
    then
        :
    else
        type=${type/#Cbus/Vlcb}
        if [ "$type" != "$prevType" ]
        then
            if [ -n "$prevType" ]
            then
                echo "};"
                echo ""
            fi
            echo "enum $type : unsigned char"
            echo "{"
            prevType=$type
        fi
        if [ "X$name" = "X" ]
        then
            echo -e "  // $value$comment" 
        else
            if [ -n "$comment" ]
            then
                comment=" // $comment"
            fi
            echo -e "  $name = $value,$comment"
        fi
    fi
done < vlcb-defs.csv >>$OUTPUT

if [ -n "prevType" ]
then
    echo "};" >>$OUTPUT
    echo ""   >>$OUTPUT
fi

# finally output the trailer stuff
cat << EOF >> $OUTPUT
#ifdef __cplusplus
}
#endif

#endif // __VLCBDEFS

EOF
