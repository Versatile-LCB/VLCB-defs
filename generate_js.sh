# Generate a JavaScript dictionary.

OUTPUT=vlcbdefs.js
echo "Generating $OUTPUT"

# first out put the header stuff
cat << EOF > $OUTPUT
// DO NOT EDIT THIS FILE.
// This file is automatically generated by $0 from vlcb-defs.csv
exports.VlcbDefs = {
EOF

# now output the actual contents
# Set input field separator (IFS) to comma and carriage return for running on Windows.
while IFS=$',\r' read type	name value comment 
do
    : "line=$type,$name,$value,$comment"
    if [ "$type" = "comment" ]
    then
        echo -e "// $name\t$value\t$comment"
    elif [ -z "$type" ]
    then
        :
    else
        type=${type/#Cbus/Vlcb}
        if [ "$type" = "$prevType" ]
        then
            if [ "$prevName" != "" ]
            then
                # Another item on the same type. Add a comma on previous line.
                echo ",$prevComment"
                prevName=
                prevComment=
            fi
        else
            if [ -n "$prevType" ]
            then
                echo "$prevComment"
                echo "  },"
            fi
            echo "  \"$type\" : {"
            prevType=$type
            prevName=
        fi
        if [ "X$name" = "X" ]
        then
            echo -e "    // $value$comment" 
        else
            if [ -n "$comment" ]
            then
                prevComment=" // $comment"
            else
                prevComment=
            fi
            echo -n "    \"$name\": $value"
            prevName=$name
      	fi
    fi
done < vlcb-defs.csv >>$OUTPUT

if [ -n "prevType" ]
then
    echo ""    >>$OUTPUT
    echo "  }" >>$OUTPUT
    echo "}"   >>$OUTPUT
fi
