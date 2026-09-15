package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u008e\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J-\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"H\u0001¢\u0006\u0004\b$\u0010%J5\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\"H\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\"2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"H\u0001¢\u0006\u0004\b-\u0010.J-\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"H\u0001¢\u0006\u0004\b/\u0010%J#\u00101\u001a\u00020\u001b*\u0004\u0018\u00010\u001b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b00H\u0001¢\u0006\u0004\b1\u00102R\u001d\u00103\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u00107\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u001a\u00109\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\u001d\u0010?\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u001d\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u00106R\u001d\u0010C\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u001d\u0010E\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u001d\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u00106R\u001d\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\bJ\u00106R\u001d\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u00106R\u001d\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u00106R\u001d\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bO\u00104\u001a\u0004\bP\u00106R\u001d\u0010Q\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bR\u00106R\u001d\u0010S\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bS\u00104\u001a\u0004\bT\u00106R\u001d\u0010U\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bU\u00104\u001a\u0004\bV\u00106R\u001d\u0010W\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bW\u00104\u001a\u0004\bX\u00106R\u001d\u0010Y\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bY\u00104\u001a\u0004\bZ\u00106R\u001d\u0010[\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b[\u00104\u001a\u0004\b\\\u00106R\u001d\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b]\u00104\u001a\u0004\b^\u00106R\u001d\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b_\u00104\u001a\u0004\b`\u00106R\u001d\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\ba\u00104\u001a\u0004\bb\u00106R\u001d\u0010c\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bc\u00104\u001a\u0004\bd\u00106R\u001d\u0010e\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\be\u00104\u001a\u0004\bf\u00106R\u001d\u0010g\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bg\u00104\u001a\u0004\bh\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "Landroidx/compose/ui/graphics/Color;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "Landroidx/compose/material3/TextFieldColors;", "p24", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-tNwlRmA", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;)Landroidx/compose/material3/DatePickerColors;", "copy", "", "Landroidx/compose/runtime/State;", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "yearContainerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "yearContentColor$material3_release", "Lkotlin/Function0;", "takeOrElse$material3_release", "(Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function0;)Landroidx/compose/material3/TextFieldColors;", "containerColor", "J", "getContainerColor-0d7_KjU", "()J", "currentYearContentColor", "getCurrentYearContentColor-0d7_KjU", "dateTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "getDateTextFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "dayContentColor", "getDayContentColor-0d7_KjU", "dayInSelectionRangeContainerColor", "getDayInSelectionRangeContainerColor-0d7_KjU", "dayInSelectionRangeContentColor", "getDayInSelectionRangeContentColor-0d7_KjU", "disabledDayContentColor", "getDisabledDayContentColor-0d7_KjU", "disabledSelectedDayContainerColor", "getDisabledSelectedDayContainerColor-0d7_KjU", "disabledSelectedDayContentColor", "getDisabledSelectedDayContentColor-0d7_KjU", "disabledSelectedYearContainerColor", "getDisabledSelectedYearContainerColor-0d7_KjU", "disabledSelectedYearContentColor", "getDisabledSelectedYearContentColor-0d7_KjU", "disabledYearContentColor", "getDisabledYearContentColor-0d7_KjU", "dividerColor", "getDividerColor-0d7_KjU", "headlineContentColor", "getHeadlineContentColor-0d7_KjU", "navigationContentColor", "getNavigationContentColor-0d7_KjU", "selectedDayContainerColor", "getSelectedDayContainerColor-0d7_KjU", "selectedDayContentColor", "getSelectedDayContentColor-0d7_KjU", "selectedYearContainerColor", "getSelectedYearContainerColor-0d7_KjU", "selectedYearContentColor", "getSelectedYearContentColor-0d7_KjU", "subheadContentColor", "getSubheadContentColor-0d7_KjU", "titleContentColor", "getTitleContentColor-0d7_KjU", "todayContentColor", "getTodayContentColor-0d7_KjU", "todayDateBorderColor", "getTodayDateBorderColor-0d7_KjU", "weekdayContentColor", "getWeekdayContentColor-0d7_KjU", "yearContentColor", "getYearContentColor-0d7_KjU"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    private DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors) {
        this.containerColor = j;
        this.titleContentColor = j2;
        this.headlineContentColor = j3;
        this.weekdayContentColor = j4;
        this.subheadContentColor = j5;
        this.navigationContentColor = j6;
        this.yearContentColor = j7;
        this.disabledYearContentColor = j8;
        this.currentYearContentColor = j9;
        this.selectedYearContentColor = j10;
        this.disabledSelectedYearContentColor = j11;
        this.selectedYearContainerColor = j12;
        this.disabledSelectedYearContainerColor = j13;
        this.dayContentColor = j14;
        this.disabledDayContentColor = j15;
        this.selectedDayContentColor = j16;
        this.disabledSelectedDayContentColor = j17;
        this.selectedDayContainerColor = j18;
        this.disabledSelectedDayContainerColor = j19;
        this.todayContentColor = j20;
        this.todayDateBorderColor = j21;
        this.dayInSelectionRangeContainerColor = j22;
        this.dayInSelectionRangeContentColor = j23;
        this.dividerColor = j24;
        this.dateTextFieldColors = textFieldColors;
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* JADX INFO: renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* JADX INFO: renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    /* JADX INFO: renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    /* JADX INFO: renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* JADX INFO: renamed from: getYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getYearContentColor() {
        return this.yearContentColor;
    }

    /* JADX INFO: renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledYearContentColor() {
        return this.disabledYearContentColor;
    }

    /* JADX INFO: renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCurrentYearContentColor() {
        return this.currentYearContentColor;
    }

    /* JADX INFO: renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedYearContentColor() {
        return this.selectedYearContentColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedYearContentColor() {
        return this.disabledSelectedYearContentColor;
    }

    /* JADX INFO: renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedYearContainerColor() {
        return this.selectedYearContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedYearContainerColor() {
        return this.disabledSelectedYearContainerColor;
    }

    /* JADX INFO: renamed from: getDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayContentColor() {
        return this.dayContentColor;
    }

    /* JADX INFO: renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledDayContentColor() {
        return this.disabledDayContentColor;
    }

    /* JADX INFO: renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDayContentColor() {
        return this.selectedDayContentColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDayContentColor() {
        return this.disabledSelectedDayContentColor;
    }

    /* JADX INFO: renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDayContainerColor() {
        return this.selectedDayContainerColor;
    }

    /* JADX INFO: renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDayContainerColor() {
        return this.disabledSelectedDayContainerColor;
    }

    /* JADX INFO: renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTodayContentColor() {
        return this.todayContentColor;
    }

    /* JADX INFO: renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* JADX INFO: renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContentColor() {
        return this.dayInSelectionRangeContentColor;
    }

    /* JADX INFO: renamed from: getDividerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    public final TextFieldColors takeOrElse$material3_release(TextFieldColors textFieldColors, Function0<TextFieldColors> function0) {
        return textFieldColors == null ? function0.invoke() : textFieldColors;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    public final State<Color> dayContentColor$material3_release(boolean z, boolean z2, boolean z3, boolean z4, Composer composer, int i) {
        long j;
        State<Color> stateM435animateColorAsStateeuL9pac;
        composer.startReplaceableGroup(-1233694918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:890)");
        }
        if (z2 && z4) {
            j = this.selectedDayContentColor;
        } else if (z2 && !z4) {
            j = this.disabledSelectedDayContentColor;
        } else if (z3 && z4) {
            j = this.dayInSelectionRangeContentColor;
        } else if (z3 && !z4) {
            j = this.disabledDayContentColor;
        } else if (z) {
            j = this.todayContentColor;
        } else if (z4) {
            j = this.dayContentColor;
        } else {
            j = this.disabledDayContentColor;
        }
        long j2 = j;
        if (z3) {
            composer.startReplaceableGroup(379022200);
            stateM435animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m4208boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(379022258);
            stateM435animateColorAsStateeuL9pac = SingleValueAnimationKt.m435animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM435animateColorAsStateeuL9pac;
    }

    public final State<Color> dayContainerColor$material3_release(boolean z, boolean z2, boolean z3, Composer composer, int i) {
        long jM4253getTransparent0d7_KjU;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceableGroup(-1240482658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:924)");
        }
        if (z) {
            jM4253getTransparent0d7_KjU = z2 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor;
        } else {
            jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
        }
        long j = jM4253getTransparent0d7_KjU;
        if (z3) {
            composer.startReplaceableGroup(1577421952);
            stateRememberUpdatedState = SingleValueAnimationKt.m435animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1577422116);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4208boximpl(j), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public final State<Color> yearContentColor$material3_release(boolean z, boolean z2, boolean z3, Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(874111097);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:952)");
        }
        if (z2 && z3) {
            j = this.selectedYearContentColor;
        } else if (z2 && !z3) {
            j = this.disabledSelectedYearContentColor;
        } else if (z) {
            j = this.currentYearContentColor;
        } else if (z3) {
            j = this.yearContentColor;
        } else {
            j = this.disabledYearContentColor;
        }
        State<Color> stateM435animateColorAsStateeuL9pac = SingleValueAnimationKt.m435animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM435animateColorAsStateeuL9pac;
    }

    public final State<Color> yearContainerColor$material3_release(boolean z, boolean z2, Composer composer, int i) {
        long jM4253getTransparent0d7_KjU;
        composer.startReplaceableGroup(-1306331107);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:974)");
        }
        if (z) {
            jM4253getTransparent0d7_KjU = z2 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor;
        } else {
            jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
        }
        State<Color> stateM435animateColorAsStateeuL9pac = SingleValueAnimationKt.m435animateColorAsStateeuL9pac(jM4253getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM435animateColorAsStateeuL9pac;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) p0;
        return Color.m4219equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m4219equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m4219equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m4219equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m4219equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m4219equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m4219equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m4219equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m4219equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m4219equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m4219equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m4219equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m4219equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m4219equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m4219equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m4219equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m4219equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m4219equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m4219equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m4219equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m4219equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m4219equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    public final int hashCode() {
        int iM4225hashCodeimpl = Color.m4225hashCodeimpl(this.containerColor);
        int iM4225hashCodeimpl2 = Color.m4225hashCodeimpl(this.titleContentColor);
        int iM4225hashCodeimpl3 = Color.m4225hashCodeimpl(this.headlineContentColor);
        int iM4225hashCodeimpl4 = Color.m4225hashCodeimpl(this.weekdayContentColor);
        int iM4225hashCodeimpl5 = Color.m4225hashCodeimpl(this.subheadContentColor);
        int iM4225hashCodeimpl6 = Color.m4225hashCodeimpl(this.yearContentColor);
        int iM4225hashCodeimpl7 = Color.m4225hashCodeimpl(this.disabledYearContentColor);
        int iM4225hashCodeimpl8 = Color.m4225hashCodeimpl(this.currentYearContentColor);
        int iM4225hashCodeimpl9 = Color.m4225hashCodeimpl(this.selectedYearContentColor);
        int iM4225hashCodeimpl10 = Color.m4225hashCodeimpl(this.disabledSelectedYearContentColor);
        int iM4225hashCodeimpl11 = Color.m4225hashCodeimpl(this.selectedYearContainerColor);
        int iM4225hashCodeimpl12 = Color.m4225hashCodeimpl(this.disabledSelectedYearContainerColor);
        int iM4225hashCodeimpl13 = Color.m4225hashCodeimpl(this.dayContentColor);
        int iM4225hashCodeimpl14 = Color.m4225hashCodeimpl(this.disabledDayContentColor);
        int iM4225hashCodeimpl15 = Color.m4225hashCodeimpl(this.selectedDayContentColor);
        int iM4225hashCodeimpl16 = Color.m4225hashCodeimpl(this.disabledSelectedDayContentColor);
        int iM4225hashCodeimpl17 = Color.m4225hashCodeimpl(this.selectedDayContainerColor);
        int iM4225hashCodeimpl18 = Color.m4225hashCodeimpl(this.disabledSelectedDayContainerColor);
        int iM4225hashCodeimpl19 = Color.m4225hashCodeimpl(this.todayContentColor);
        return (((((((((((((((((((((((((((((((((((((((((iM4225hashCodeimpl * 31) + iM4225hashCodeimpl2) * 31) + iM4225hashCodeimpl3) * 31) + iM4225hashCodeimpl4) * 31) + iM4225hashCodeimpl5) * 31) + iM4225hashCodeimpl6) * 31) + iM4225hashCodeimpl7) * 31) + iM4225hashCodeimpl8) * 31) + iM4225hashCodeimpl9) * 31) + iM4225hashCodeimpl10) * 31) + iM4225hashCodeimpl11) * 31) + iM4225hashCodeimpl12) * 31) + iM4225hashCodeimpl13) * 31) + iM4225hashCodeimpl14) * 31) + iM4225hashCodeimpl15) * 31) + iM4225hashCodeimpl16) * 31) + iM4225hashCodeimpl17) * 31) + iM4225hashCodeimpl18) * 31) + iM4225hashCodeimpl19) * 31) + Color.m4225hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m4225hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m4225hashCodeimpl(this.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m1979copytNwlRmA(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7, long p8, long p9, long p10, long p11, long p12, long p13, long p14, long p15, long p16, long p17, long p18, long p19, long p20, long p21, long p22, long p23, TextFieldColors p24) {
        return new DatePickerColors(p0 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.containerColor : p0, p1 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.titleContentColor : p1, p2 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.headlineContentColor : p2, p3 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.weekdayContentColor : p3, p4 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.subheadContentColor : p4, p5 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.navigationContentColor : p5, p6 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.yearContentColor : p6, p7 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledYearContentColor : p7, p8 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.currentYearContentColor : p8, p9 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedYearContentColor : p9, p10 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledSelectedYearContentColor : p10, p11 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedYearContainerColor : p11, p12 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledSelectedYearContainerColor : p12, p13 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.dayContentColor : p13, p14 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledDayContentColor : p14, p15 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedDayContentColor : p15, p16 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledSelectedDayContentColor : p16, p17 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.selectedDayContainerColor : p17, p18 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.disabledSelectedDayContainerColor : p18, p19 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.todayContentColor : p19, p20 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.todayDateBorderColor : p20, p21 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.dayInSelectionRangeContainerColor : p21, p22 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.dayInSelectionRangeContentColor : p22, p23 == Color.INSTANCE.m4254getUnspecified0d7_KjU() ? this.dividerColor : p23, takeOrElse$material3_release(p24, new Function0<TextFieldColors>() { // from class: androidx.compose.material3.DatePickerColors$copy$25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldColors invoke() {
                return this.this$0.getDateTextFieldColors();
            }

            {
                super(0);
            }
        }), null);
    }

    public /* synthetic */ DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, textFieldColors);
    }
}
