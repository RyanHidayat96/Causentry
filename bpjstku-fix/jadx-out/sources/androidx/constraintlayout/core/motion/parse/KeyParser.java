package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class KeyParser {

    interface DataType {
        int get(int i);
    }

    interface Ids {
        int get(String str);
    }

    private static TypedBundle parse(String str, Ids ids, DataType dataType) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject cLObject = CLParser.parse(str);
            int size = cLObject.size();
            for (int i = 0; i < size; i++) {
                CLKey cLKey = (CLKey) cLObject.get(i);
                String strContent = cLKey.content();
                CLElement value = cLKey.getValue();
                int i2 = ids.get(strContent);
                if (i2 == -1) {
                    PrintStream printStream = System.err;
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown type ");
                    sb.append(strContent);
                    printStream.println(sb.toString());
                } else {
                    int i3 = dataType.get(i2);
                    if (i3 == 1) {
                        typedBundle.add(i2, cLObject.getBoolean(i));
                    } else if (i3 == 2) {
                        typedBundle.add(i2, value.getInt());
                        PrintStream printStream2 = System.out;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("parse ");
                        sb2.append(strContent);
                        sb2.append(" INT_MASK > ");
                        sb2.append(value.getInt());
                        printStream2.println(sb2.toString());
                    } else if (i3 == 4) {
                        typedBundle.add(i2, value.getFloat());
                        PrintStream printStream3 = System.out;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("parse ");
                        sb3.append(strContent);
                        sb3.append(" FLOAT_MASK > ");
                        sb3.append(value.getFloat());
                        printStream3.println(sb3.toString());
                    } else if (i3 == 8) {
                        typedBundle.add(i2, value.content());
                        PrintStream printStream4 = System.out;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("parse ");
                        sb4.append(strContent);
                        sb4.append(" STRING_MASK > ");
                        sb4.append(value.content());
                        printStream4.println(sb4.toString());
                    }
                }
            }
        } catch (CLParsingException e2) {
            PrintStream printStream5 = System.err;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(e2.toString());
            sb5.append("\n");
            sb5.append(Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream5.println(sb5.toString());
        }
        return typedBundle;
    }

    public static TypedBundle parseAttributes(String str) {
        return parse(str, new Ids() { // from class: androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(String str2) {
                return TypedValues.AttributesType.getId(str2);
            }
        }, new DataType() { // from class: androidx.constraintlayout.core.motion.parse.KeyParser$$ExternalSyntheticLambda1
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i) {
                return TypedValues.AttributesType.getType(i);
            }
        });
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }
}
