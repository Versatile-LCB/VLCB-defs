PACKAGE=uk.org.merg.vlcb
JAVAPATH=`echo java/$PACKAGE|tr '.' '/'`
mkdir -p $JAVAPATH
# get the list of classes
for class in $(cat vlcb-defs.csv|cut -f1 -d ,|grep -v comment|sort|uniq | sed 's/^Cbus/Vlcb/')
do
	OUTPUT="$JAVAPATH/$class.java"
	echo "Generating $OUTPUT"
	# output the fixed part
	cat << EOF > $OUTPUT
/* DO NOT EDIT THIS FILE.
 * This file is automatically generated by $0 from vlcb-defs.csv
 */

package $PACKAGE;

EOF
	# output the comments
	grep '^comment' vlcb-defs.csv | cut -f2- -d , | sed 's!^!// !' |sed 's!,!!' | sed 's!,!!' >> $OUTPUT
	# output heading
	cat << EOF >> $OUTPUT

public enum $class {
EOF
	# capture the name and values into a variable
	BODY=`while IFS="," read type	name value comment
	do
    type=${type/#Cbus/Vlcb}
		if [ "$type" = "$class" ]; then
			if [ "X$name" = "X" ]; then
				echo -e "// $value$comment"
			else
				echo -e "\t$name($value),\t//$comment"
			fi
		fi
	done < vlcb-defs.csv`
	# change the ',' at the end of the last entry to ';'
	#echo "$BODY" | sed 's!\(.*\)),!\1);!' >>$OUTPUT
	# find the line to change
	CHANGE_LINE=`echo "$BODY" | grep -n '),' | tail -1 |cut -f1 -d ':'`
	# output the lines prior to that
	echo "$BODY"|head -n `expr $CHANGE_LINE - 1` >>$OUTPUT
	# output the remainder with the change
	echo "$BODY"|tail -n +$CHANGE_LINE | sed 's!),!);!' >> $OUTPUT


	# output trailer
	cat << EOF >> $OUTPUT

	private final int v;

	private $class(int v) {
		this.v = v;
	}

	public int value() {
		return v;
	}
}
EOF
done
