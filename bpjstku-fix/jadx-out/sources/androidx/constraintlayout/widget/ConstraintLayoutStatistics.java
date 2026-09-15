package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.Metrics;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes6.dex */
public class ConstraintLayoutStatistics {
    public static final int DURATION_OF_CHILD_MEASURES = 5;
    public static final int DURATION_OF_LAYOUT = 7;
    public static final int DURATION_OF_MEASURES = 6;
    public static final int NUMBER_OF_CHILD_MEASURES = 4;
    public static final int NUMBER_OF_CHILD_VIEWS = 3;
    public static final int NUMBER_OF_EQUATIONS = 9;
    public static final int NUMBER_OF_LAYOUTS = 1;
    public static final int NUMBER_OF_ON_MEASURES = 2;
    public static final int NUMBER_OF_SIMPLE_EQUATIONS = 10;
    public static final int NUMBER_OF_VARIABLES = 8;
    ConstraintLayout mConstraintLayout;
    private final Metrics mMetrics;
    private static int MAX_WORD = 25;
    private static final String WORD_PAD = new String(new char[MAX_WORD]).replace((char) 0, ' ');

    public ConstraintLayoutStatistics(ConstraintLayout constraintLayout) {
        this.mMetrics = new Metrics();
        attach(constraintLayout);
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        this.mMetrics = metrics;
        metrics.copy(constraintLayoutStatistics.mMetrics);
    }

    public void attach(ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.mMetrics);
        this.mConstraintLayout = constraintLayout;
    }

    public void detach() {
        ConstraintLayout constraintLayout = this.mConstraintLayout;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    public void reset() {
        this.mMetrics.reset();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ConstraintLayoutStatistics m7199clone() {
        return new ConstraintLayoutStatistics(this);
    }

    private String fmt(DecimalFormat decimalFormat, float f, int i) {
        String strReplace = new String(new char[i]).replace((char) 0, ' ');
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace);
        sb.append(decimalFormat.format(f));
        String string = sb.toString();
        return string.substring(string.length() - i);
    }

    public void logSummary(String str) {
        log(str);
    }

    private void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        log(decimalFormat, 5);
        log(decimalFormat, 7);
        log(decimalFormat, 6);
        log(1);
        log(2);
        log(3);
        log(4);
        log(8);
        log(9);
        log(10);
    }

    private String log(DecimalFormat decimalFormat, int i) {
        String strFmt = fmt(decimalFormat, getValue(i) * 1.0E-6f, 7);
        String strGeName = geName(i);
        StringBuilder sb = new StringBuilder();
        sb.append(WORD_PAD);
        sb.append(strGeName);
        String string = sb.toString();
        String strSubstring = string.substring(string.length() - MAX_WORD);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(" = ");
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CL Perf: ");
        sb3.append(string2);
        sb3.append(strFmt);
        return sb3.toString();
    }

    private String log(int i) {
        String string = Long.toString(getValue(i));
        String strGeName = geName(i);
        StringBuilder sb = new StringBuilder();
        sb.append(WORD_PAD);
        sb.append(strGeName);
        String string2 = sb.toString();
        String strSubstring = string2.substring(string2.length() - MAX_WORD);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(" = ");
        String string3 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CL Perf: ");
        sb3.append(string3);
        sb3.append(string);
        return sb3.toString();
    }

    private String compare(DecimalFormat decimalFormat, ConstraintLayoutStatistics constraintLayoutStatistics, int i) {
        String strFmt = fmt(decimalFormat, getValue(i) * 1.0E-6f, 7);
        StringBuilder sb = new StringBuilder();
        sb.append(strFmt);
        sb.append(" -> ");
        sb.append(fmt(decimalFormat, constraintLayoutStatistics.getValue(i) * 1.0E-6f, 7));
        sb.append("ms");
        String string = sb.toString();
        String strGeName = geName(i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(WORD_PAD);
        sb2.append(strGeName);
        String string2 = sb2.toString();
        String strSubstring = string2.substring(string2.length() - MAX_WORD);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strSubstring);
        sb3.append(" = ");
        String string3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("CL Perf: ");
        sb4.append(string3);
        sb4.append(string);
        return sb4.toString();
    }

    private String compare(ConstraintLayoutStatistics constraintLayoutStatistics, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(getValue(i));
        sb.append(" -> ");
        sb.append(constraintLayoutStatistics.getValue(i));
        String string = sb.toString();
        String strGeName = geName(i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(WORD_PAD);
        sb2.append(strGeName);
        String string2 = sb2.toString();
        String strSubstring = string2.substring(string2.length() - MAX_WORD);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strSubstring);
        sb3.append(" = ");
        String string3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("CL Perf: ");
        sb4.append(string3);
        sb4.append(string);
        return sb4.toString();
    }

    public void logSummary(String str, ConstraintLayoutStatistics constraintLayoutStatistics) {
        if (constraintLayoutStatistics == null) {
            log(str);
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
        compare(decimalFormat, constraintLayoutStatistics, 5);
        compare(decimalFormat, constraintLayoutStatistics, 7);
        compare(decimalFormat, constraintLayoutStatistics, 6);
        compare(constraintLayoutStatistics, 1);
        compare(constraintLayoutStatistics, 2);
        compare(constraintLayoutStatistics, 3);
        compare(constraintLayoutStatistics, 4);
        compare(constraintLayoutStatistics, 8);
        compare(constraintLayoutStatistics, 9);
        compare(constraintLayoutStatistics, 10);
    }

    public long getValue(int i) {
        switch (i) {
            case 1:
                return this.mMetrics.mNumberOfLayouts;
            case 2:
                return this.mMetrics.mMeasureCalls;
            case 3:
                return this.mMetrics.mChildCount;
            case 4:
                return this.mMetrics.mNumberOfMeasures;
            case 5:
                return this.mMetrics.measuresWidgetsDuration;
            case 6:
                return this.mMetrics.mMeasureDuration;
            case 7:
                return this.mMetrics.measuresLayoutDuration;
            case 8:
                return this.mMetrics.mVariables;
            case 9:
                return this.mMetrics.mEquations;
            case 10:
                return this.mMetrics.mSimpleEquations;
            default:
                return 0L;
        }
    }

    String geName(int i) {
        switch (i) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }
}
