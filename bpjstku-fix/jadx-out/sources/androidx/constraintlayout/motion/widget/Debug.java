package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.karumi.dexter.BuildConfig;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class Debug {
    public static void logStack(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String string = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sb = new StringBuilder(".(");
            sb.append(stackTrace[i2].getFileName());
            sb.append(":");
            sb.append(stackTrace[i2].getLineNumber());
            sb.append(") ");
            sb.append(stackTrace[i2].getMethodName());
            sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
        }
    }

    public static void printStack(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String string = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sb = new StringBuilder(".(");
            sb.append(stackTrace[i2].getFileName());
            sb.append(":");
            sb.append(stackTrace[i2].getLineNumber());
            sb.append(") ");
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
            PrintStream printStream = System.out;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(string);
            sb3.append(string2);
            sb3.append(string);
            printStream.println(sb3.toString());
        }
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        String string = sb.toString();
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("------------- ");
        sb2.append(cls.getName());
        sb2.append(" --------------------");
        printStream.println(sb2.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals(BuildConfig.VERSION_NAME)) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append("    ");
                    sb3.append(field.getName());
                    sb3.append(" ");
                    sb3.append(obj2);
                    printStream2.println(sb3.toString());
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream3 = System.out;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append("------------- ");
        sb4.append(cls.getSimpleName());
        sb4.append(" --------------------");
        printStream3.println(sb4.toString());
    }

    public static String getName(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return "?".concat(String.valueOf(i));
            }
        }
        return "UNKNOWN";
    }

    public static String getName(Context context, int[] iArr) {
        String string;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(iArr.length);
            sb.append("[");
            String string2 = sb.toString();
            int i = 0;
            while (i < iArr.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                sb2.append(i == 0 ? "" : " ");
                String string3 = sb2.toString();
                try {
                    string = context.getResources().getResourceEntryName(iArr[i]);
                } catch (Resources.NotFoundException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("? ");
                    sb3.append(iArr[i]);
                    sb3.append(" ");
                    string = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(string);
                string2 = sb4.toString();
                i++;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string2);
            sb5.append("]");
            return sb5.toString();
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i) {
        return getState(motionLayout, i, -1);
    }

    public static String getState(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        int length2 = (resourceEntryName.length() - i2) / length;
        StringBuilder sb = new StringBuilder();
        sb.append(CharBuffer.allocate(length2).toString().replace((char) 0, '.'));
        sb.append("_");
        return resourceEntryName.replaceAll(sb.toString(), "_");
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(stackTraceElement.getMethodName());
        sb.append("()");
        return sb.toString();
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static String getCallFrom(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(")");
        return sb.toString();
    }

    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        String string = sb.toString();
        int childCount = viewGroup.getChildCount();
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" children ");
        sb2.append(childCount);
        printStream.println(sb2.toString());
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            PrintStream printStream2 = System.out;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append("     ");
            sb3.append(getName(childAt));
            printStream2.println(sb3.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        PrintStream printStream3 = System.out;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(string);
                        sb4.append("       ");
                        sb4.append(field.getName());
                        sb4.append(" ");
                        sb4.append(obj);
                        printStream3.println(sb4.toString());
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(".(");
        sb.append(stackTraceElement.getFileName());
        sb.append(":");
        sb.append(stackTraceElement.getLineNumber());
        sb.append(") ");
        sb.append(str);
        sb.append("  ");
        String string = sb.toString();
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder(" >>>>>>>>>>>>>>>>>>. dump ");
        sb2.append(string);
        sb2.append("  ");
        sb2.append(layoutParams.getClass().getName());
        printStream.println(sb2.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append("       ");
                    sb3.append(name);
                    sb3.append(" ");
                    sb3.append(obj);
                    printStream2.println(sb3.toString());
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump ".concat(String.valueOf(string)));
    }
}
