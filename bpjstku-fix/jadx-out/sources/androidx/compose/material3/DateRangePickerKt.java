package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a°\u0001\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010.\u001a`\u0010/\u001a\u00020\f2\n\u00100\u001a\u000601j\u0002`22\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a½\u0001\u0010:\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010;\u001a\u0002072:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a°\u0001\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010A\u001a.\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010\u000b\u001a\u00020@2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020HH\u0002\u001aT\u0010J\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001ae\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c2\b\u0010P\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 H\u0002¢\u0006\u0002\u0010Q\u001a&\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerHeadlinePadding", "DateRangePickerTitlePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangePicker", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "selectedStartDateMillis", "", "selectedEndDateMillis", "displayedMonthMillis", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startDateMillis", "endDateMillis", "onDisplayedMonthChange", "Lkotlin/Function1;", "monthInMillis", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "SwitchableDateEntryContent", "displayMode", "SwitchableDateEntryContent-RN-2D1Q", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "VerticalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "rememberDateRangePickerState", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "updateDateSelection", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DateRangePickerKt {
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m999PaddingValuesa9UjIt4$default(Dp.m6935constructorimpl(24.0f), Dp.m6935constructorimpl(20.0f), 0.0f, Dp.m6935constructorimpl(8.0f), 4, null);
    private static final PaddingValues DateRangePickerTitlePadding = PaddingKt.m999PaddingValuesa9UjIt4$default(Dp.m6935constructorimpl(64.0f), 0.0f, Dp.m6935constructorimpl(12.0f), 0.0f, 10, null);
    private static final PaddingValues DateRangePickerHeadlinePadding = PaddingKt.m999PaddingValuesa9UjIt4$default(Dp.m6935constructorimpl(64.0f), 0.0f, Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(12.0f), 2, null);
    private static final float HeaderHeightOffset = Dp.m6935constructorimpl(60.0f);

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x0153  */
    /* JADX WARN: Code duplicated, block: B:108:0x0164  */
    /* JADX WARN: Code duplicated, block: B:111:0x0169  */
    /* JADX WARN: Code duplicated, block: B:112:0x0178 A[PHI: r0 r4 r6 r9 r11 r13
  0x0178: PHI (r0v8 androidx.compose.material3.DatePickerFormatter) = 
  (r0v1 androidx.compose.material3.DatePickerFormatter)
  (r0v0 androidx.compose.material3.DatePickerFormatter)
  (r0v0 androidx.compose.material3.DatePickerFormatter)
 binds: [B:110:0x0167, B:93:0x0101, B:94:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r4v25 int) = (r4v19 int), (r4v26 int), (r4v27 int) binds: [B:110:0x0167, B:93:0x0101, B:94:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r6v7 androidx.compose.ui.Modifier) = (r6v3 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier) binds: [B:110:0x0167, B:93:0x0101, B:94:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r9v14 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
  (r9v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
  (r9v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
  (r9v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
 binds: [B:110:0x0167, B:93:0x0101, B:94:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r11v22 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
  (r11v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
  (r11v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
  (r11v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
 binds: [B:110:0x0167, B:93:0x0101, B:94:0x0103] A[DONT_GENERATE, DONT_INLINE]
  0x0178: PHI (r13v8 boolean) = (r13v4 boolean), (r13v3 boolean), (r13v3 boolean) binds: [B:110:0x0167, B:93:0x0101, B:94:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x0186  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:127:0x0222  */
    /* JADX WARN: Code duplicated, block: B:131:0x0230  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0114  */
    public static final void DateRangePicker(final DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, boolean z, DatePickerColors datePickerColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        DatePickerColors datePickerColors2;
        final DatePickerColors datePickerColorsColors;
        Function2<? super Composer, ? super Integer, Unit> function4;
        boolean z3;
        Object objRememberedValue;
        int i10;
        Locale localeDefaultLocale;
        boolean zChanged;
        Object objRememberedValue2;
        ComposableLambda composableLambda;
        final Modifier modifier3;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function5;
        DatePickerFormatter datePickerFormatter2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        boolean zChangedInstance;
        final DatePickerFormatter datePickerFormatter3 = datePickerFormatter;
        Composer composerStartRestartGroup = composer.startRestartGroup(650830774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) != 0) {
                    i11 = 128;
                } else {
                    if ((i & 512) == 0) {
                        zChangedInstance = composerStartRestartGroup.changed(datePickerFormatter3);
                    } else {
                        zChangedInstance = composerStartRestartGroup.changedInstance(datePickerFormatter3);
                    }
                    if (zChangedInstance) {
                        i11 = 256;
                    } else {
                        i11 = 128;
                    }
                }
                i3 |= i11;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function2ComposableLambda = function2;
                    if (composerStartRestartGroup.changedInstance(function2ComposableLambda)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function2ComposableLambda2 = function3;
                        if (composerStartRestartGroup.changedInstance(function2ComposableLambda2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (composerStartRestartGroup.changed(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                datePickerColors2 = datePickerColors;
                                int i13 = composerStartRestartGroup.changed(datePickerColors2) ? 1048576 : 524288;
                                i3 |= i13;
                            } else {
                                datePickerColors2 = datePickerColors;
                            }
                            i3 |= i13;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                            } else {
                                if (i12 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 4) != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    i3 &= -897;
                                }
                                if (i4 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i14) {
                                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-162164694, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                                }
                                                DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }

                                        {
                                            super(2);
                                        }
                                    });
                                }
                                if (i6 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i14) {
                                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-185279404, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                                }
                                                DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }
                                    });
                                }
                                if (i8 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                    function4 = function2ComposableLambda;
                                    z3 = z2;
                                }
                                i10 = i3;
                                Function2<? super Composer, ? super Integer, Unit> function6 = function2ComposableLambda2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                                }
                                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                final CalendarModel calendarModel = (CalendarModel) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                if (z3) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i14) {
                                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1490010652, i14, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                                }
                                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                                composer2.startReplaceableGroup(-1467496949);
                                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                            m2032invokevCnGnXg(displayMode.getValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                        public final void m2032invokevCnGnXg(int i15) {
                                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i15);
                                                        }

                                                        {
                                                            super(1);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer2.endReplaceableGroup();
                                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }

                                        {
                                            super(2);
                                        }
                                    });
                                } else {
                                    composableLambda = null;
                                }
                                int i14 = i10 >> 6;
                                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function6, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i15) {
                                        if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-57534331, i15, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                            }
                                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                            composer2.startReplaceableGroup(-1467496213);
                                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                        invoke2(l, l2);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Long l, Long l2) {
                                                        try {
                                                            dateRangePickerState2.setSelection(l, l2);
                                                        } catch (IllegalArgumentException unused) {
                                                        }
                                                    }

                                                    {
                                                        super(2);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            Function2 function7 = (Function2) objRememberedValue3;
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(-1467495707);
                                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                            Object objRememberedValue4 = composer2.rememberedValue();
                                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                        invoke(l.longValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(long j) {
                                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                                    }

                                                    {
                                                        super(1);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue4);
                                            }
                                            composer2.endReplaceableGroup();
                                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function7, (Function1) objRememberedValue4, calendarModel, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i14 & 112) | (i14 & 896) | (i14 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function2ComposableLambda = function4;
                                modifier3 = modifier2;
                                z4 = z3;
                                function5 = function6;
                                datePickerFormatter2 = datePickerFormatter3;
                            }
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                            i10 = i3;
                            Function2<? super Composer, ? super Integer, Unit> function7 = function2ComposableLambda2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                            }
                            localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1155306707);
                            zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            final CalendarModel calendarModel2 = (CalendarModel) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            if (z3) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i15) {
                                        if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1490010652, i15, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                            }
                                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                            composer2.startReplaceableGroup(-1467496949);
                                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                        m2032invokevCnGnXg(displayMode.getValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                    public final void m2032invokevCnGnXg(int i16) {
                                                        dateRangePickerState2.mo2035setDisplayModevCnGnXg(i16);
                                                    }

                                                    {
                                                        super(1);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceableGroup();
                                            DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            } else {
                                composableLambda = null;
                            }
                            int i15 = i10 >> 6;
                            DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function7, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-57534331, i16, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                        }
                                        Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                        Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                        long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496213);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                    invoke2(l, l2);
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Long l, Long l2) {
                                                    try {
                                                        dateRangePickerState2.setSelection(l, l2);
                                                    } catch (IllegalArgumentException unused) {
                                                    }
                                                }

                                                {
                                                    super(2);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        Function2 function8 = (Function2) objRememberedValue3;
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(-1467495707);
                                        boolean zChanged3 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                        Object objRememberedValue4 = composer2.rememberedValue();
                                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                    invoke(l.longValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(long j) {
                                                    dateRangePickerState3.setDisplayedMonthMillis(j);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer2.endReplaceableGroup();
                                        DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function8, (Function1) objRememberedValue4, calendarModel2, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i15 & 112) | (i15 & 896) | (i15 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function2ComposableLambda = function4;
                            modifier3 = modifier2;
                            z4 = z3;
                            function5 = function7;
                            datePickerFormatter2 = datePickerFormatter3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            datePickerFormatter2 = datePickerFormatter3;
                            modifier3 = modifier2;
                            function5 = function2ComposableLambda2;
                            z4 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final DatePickerFormatter datePickerFormatter4 = datePickerFormatter2;
                            final Function2<? super Composer, ? super Integer, Unit> function8 = function2ComposableLambda;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter4, function8, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            datePickerColors2 = datePickerColors;
                            if (composerStartRestartGroup.changed(datePickerColors2)) {
                            }
                            i3 |= i13;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i16) {
                                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i16, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i16) {
                                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i16, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i16) {
                                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i16, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i16) {
                                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i16, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function9 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel3 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i16, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i17) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i17);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i16 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function9, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i17) {
                                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i17, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function10 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function10, (Function1) objRememberedValue4, calendarModel3, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i16 & 112) | (i16 & 896) | (i16 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function9;
                        datePickerFormatter2 = datePickerFormatter3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i17) {
                                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i17, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i17) {
                                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i17, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i17) {
                                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i17, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i17) {
                                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i17, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function10 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel4 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i17) {
                                    if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i17, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i18) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i18);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i17 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function10, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i18) {
                                if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i18, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function11 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11, (Function1) objRememberedValue4, calendarModel4, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i17 & 112) | (i17 & 896) | (i17 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function10;
                        datePickerFormatter2 = datePickerFormatter3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final DatePickerFormatter datePickerFormatter5 = datePickerFormatter2;
                        final Function2<? super Composer, ? super Integer, Unit> function11 = function2ComposableLambda;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i18) {
                                DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter5, function11, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                function2ComposableLambda2 = function3;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            datePickerColors2 = datePickerColors;
                            if (composerStartRestartGroup.changed(datePickerColors2)) {
                            }
                            i3 |= i13;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i18) {
                                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i18, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i18) {
                                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i18, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i18) {
                                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i18, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i18) {
                                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i18, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function12 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel5 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i18) {
                                    if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i18, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i19) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i19);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i18 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function12, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i19) {
                                if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i19, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function13 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function13, (Function1) objRememberedValue4, calendarModel5, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i18 & 112) | (i18 & 896) | (i18 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function12;
                        datePickerFormatter2 = datePickerFormatter3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i19) {
                                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i19, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i19) {
                                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i19, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i19) {
                                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i19, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i19) {
                                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i19, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function13 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel6 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i19) {
                                    if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i19, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i110) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i110);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i19 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function13, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i110) {
                                if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function14 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function14, (Function1) objRememberedValue4, calendarModel6, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i19 & 112) | (i19 & 896) | (i19 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function13;
                        datePickerFormatter2 = datePickerFormatter3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final DatePickerFormatter datePickerFormatter6 = datePickerFormatter2;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function2ComposableLambda;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i110) {
                                DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter6, function14, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        datePickerColors2 = datePickerColors;
                        if (composerStartRestartGroup.changed(datePickerColors2)) {
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i110) {
                                    if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i110) {
                                    if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i110) {
                                    if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i110) {
                                    if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel7 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i110) {
                                if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i111) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i111);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i110 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function15, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i111) {
                            if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function16 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function16, (Function1) objRememberedValue4, calendarModel7, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i110 & 112) | (i110 & 896) | (i110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function15;
                    datePickerFormatter2 = datePickerFormatter3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i111) {
                                    if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i111) {
                                    if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i111) {
                                    if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i111) {
                                    if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function16 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel8 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i111) {
                                if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i112) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i112);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i111 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function16, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i112) {
                            if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function17 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function17, (Function1) objRememberedValue4, calendarModel8, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i111 & 112) | (i111 & 896) | (i111 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function16;
                    datePickerFormatter2 = datePickerFormatter3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final DatePickerFormatter datePickerFormatter7 = datePickerFormatter2;
                    final Function2<? super Composer, ? super Integer, Unit> function17 = function2ComposableLambda;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i112) {
                            DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter7, function17, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            function2ComposableLambda = function2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function2ComposableLambda2 = function3;
                    if (composerStartRestartGroup.changedInstance(function2ComposableLambda2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            datePickerColors2 = datePickerColors;
                            if (composerStartRestartGroup.changed(datePickerColors2)) {
                            }
                            i3 |= i13;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i112) {
                                        if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i112) {
                                        if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i112) {
                                        if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i112) {
                                        if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function18 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel9 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i112) {
                                    if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i113) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i113);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i112 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function18, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i113) {
                                if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function19 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function19, (Function1) objRememberedValue4, calendarModel9, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i112 & 112) | (i112 & 896) | (i112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function18;
                        datePickerFormatter2 = datePickerFormatter3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i113) {
                                        if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i113) {
                                        if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i113) {
                                        if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i113) {
                                        if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function19 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel10 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i113) {
                                    if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i114) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i114);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i113 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function19, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i114) {
                                if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function110 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function110, (Function1) objRememberedValue4, calendarModel10, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i113 & 112) | (i113 & 896) | (i113 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function19;
                        datePickerFormatter2 = datePickerFormatter3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final DatePickerFormatter datePickerFormatter8 = datePickerFormatter2;
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function2ComposableLambda;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i114) {
                                DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter8, function110, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        datePickerColors2 = datePickerColors;
                        if (composerStartRestartGroup.changed(datePickerColors2)) {
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i114) {
                                    if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i114) {
                                    if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i114) {
                                    if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i114) {
                                    if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function111 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel11 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i114) {
                                if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i115) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i115);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i114 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function111, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i115) {
                            if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function112 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function112, (Function1) objRememberedValue4, calendarModel11, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i114 & 112) | (i114 & 896) | (i114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function111;
                    datePickerFormatter2 = datePickerFormatter3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i115) {
                                    if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i115) {
                                    if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i115) {
                                    if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i115) {
                                    if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function112 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel12 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i115) {
                                if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i116) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i116);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i115 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function112, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i116) {
                            if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function113 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function113, (Function1) objRememberedValue4, calendarModel12, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i115 & 112) | (i115 & 896) | (i115 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function112;
                    datePickerFormatter2 = datePickerFormatter3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final DatePickerFormatter datePickerFormatter9 = datePickerFormatter2;
                    final Function2<? super Composer, ? super Integer, Unit> function113 = function2ComposableLambda;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i116) {
                            DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter9, function113, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function2ComposableLambda2 = function3;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        datePickerColors2 = datePickerColors;
                        if (composerStartRestartGroup.changed(datePickerColors2)) {
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i116) {
                                    if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i116) {
                                    if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i116) {
                                    if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i116) {
                                    if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel13 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i116) {
                                if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i117) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i117);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i116 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function114, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i117) {
                            if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function115 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function115, (Function1) objRememberedValue4, calendarModel13, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i116 & 112) | (i116 & 896) | (i116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function114;
                    datePickerFormatter2 = datePickerFormatter3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i117) {
                                    if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i117) {
                                    if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i117) {
                                    if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i117) {
                                    if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function115 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel14 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i117) {
                                if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i118) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i118);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i117 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function115, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i118) {
                            if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function116 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function116, (Function1) objRememberedValue4, calendarModel14, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i117 & 112) | (i117 & 896) | (i117 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function115;
                    datePickerFormatter2 = datePickerFormatter3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final DatePickerFormatter datePickerFormatter10 = datePickerFormatter2;
                    final Function2<? super Composer, ? super Integer, Unit> function116 = function2ComposableLambda;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i118) {
                            DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter10, function116, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (composerStartRestartGroup.changed(datePickerColors2)) {
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i3 |= i13;
            } else {
                datePickerColors2 = datePickerColors;
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i118) {
                                if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i118) {
                                if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i118) {
                                if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i118) {
                                if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function117 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel15 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i118) {
                            if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i119) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i119);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i118 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function117, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i119) {
                        if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function118 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function118, (Function1) objRememberedValue4, calendarModel15, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i118 & 112) | (i118 & 896) | (i118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function117;
                datePickerFormatter2 = datePickerFormatter3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i119) {
                                if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i119) {
                                if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i119) {
                                if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i119) {
                                if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function118 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel16 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i119) {
                            if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i1110) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1110);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i119 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function118, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1110) {
                        if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i1110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function119 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function119, (Function1) objRememberedValue4, calendarModel16, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i119 & 112) | (i119 & 896) | (i119 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function118;
                datePickerFormatter2 = datePickerFormatter3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final DatePickerFormatter datePickerFormatter11 = datePickerFormatter2;
                final Function2<? super Composer, ? super Integer, Unit> function119 = function2ComposableLambda;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1110) {
                        DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter11, function119, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i11 = 128;
            } else {
                if ((i & 512) == 0) {
                    zChangedInstance = composerStartRestartGroup.changed(datePickerFormatter3);
                } else {
                    zChangedInstance = composerStartRestartGroup.changedInstance(datePickerFormatter3);
                }
                if (zChangedInstance) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
            }
            i3 |= i11;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function2ComposableLambda = function2;
                if (composerStartRestartGroup.changedInstance(function2ComposableLambda)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function2ComposableLambda2 = function3;
                    if (composerStartRestartGroup.changedInstance(function2ComposableLambda2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) == 0) {
                            datePickerColors2 = datePickerColors;
                            if (composerStartRestartGroup.changed(datePickerColors2)) {
                            }
                            i3 |= i13;
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1110) {
                                        if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i1110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1110) {
                                        if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i1110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1110) {
                                        if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i1110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1110) {
                                        if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i1110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function1110 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel17 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1110) {
                                    if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i1110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i1111) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1111);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i1110 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1110, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1111) {
                                if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i1111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function1111 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function1111, (Function1) objRememberedValue4, calendarModel17, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1110 & 112) | (i1110 & 896) | (i1110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function1110;
                        datePickerFormatter2 = datePickerFormatter3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1111) {
                                        if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i1111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1111) {
                                        if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i1111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        } else {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-1155307541);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1111) {
                                        if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-162164694, i1111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i6 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i1111) {
                                        if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-185279404, i1111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                            }
                                            DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }
                                });
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                function4 = function2ComposableLambda;
                                z3 = z2;
                            } else {
                                function4 = function2ComposableLambda;
                                z3 = z2;
                                datePickerColorsColors = datePickerColors2;
                            }
                        }
                        i10 = i3;
                        Function2<? super Composer, ? super Integer, Unit> function1111 = function2ComposableLambda2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                        }
                        localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1155306707);
                        zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final CalendarModel calendarModel18 = (CalendarModel) objRememberedValue2;
                        composerStartRestartGroup.endReplaceableGroup();
                        if (z3) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1111) {
                                    if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1490010652, i1111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                        composer2.startReplaceableGroup(-1467496949);
                                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                        Object objRememberedValue3 = composer2.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                    m2032invokevCnGnXg(displayMode.getValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                                public final void m2032invokevCnGnXg(int i1112) {
                                                    dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1112);
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer2.endReplaceableGroup();
                                        DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        } else {
                            composableLambda = null;
                        }
                        int i1111 = i10 >> 6;
                        DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1111, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1112) {
                                if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-57534331, i1112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                    }
                                    Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                    Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                    long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496213);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                                invoke2(l, l2);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Long l, Long l2) {
                                                try {
                                                    dateRangePickerState2.setSelection(l, l2);
                                                } catch (IllegalArgumentException unused) {
                                                }
                                            }

                                            {
                                                super(2);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function2 function1112 = (Function2) objRememberedValue3;
                                    composer2.endReplaceableGroup();
                                    composer2.startReplaceableGroup(-1467495707);
                                    boolean zChanged3 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                                invoke(l.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(long j) {
                                                dateRangePickerState3.setDisplayedMonthMillis(j);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer2.endReplaceableGroup();
                                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function1112, (Function1) objRememberedValue4, calendarModel18, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1111 & 112) | (i1111 & 896) | (i1111 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function2ComposableLambda = function4;
                        modifier3 = modifier2;
                        z4 = z3;
                        function5 = function1111;
                        datePickerFormatter2 = datePickerFormatter3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final DatePickerFormatter datePickerFormatter12 = datePickerFormatter2;
                        final Function2<? super Composer, ? super Integer, Unit> function1112 = function2ComposableLambda;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1112) {
                                DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter12, function1112, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        datePickerColors2 = datePickerColors;
                        if (composerStartRestartGroup.changed(datePickerColors2)) {
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1112) {
                                    if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1112) {
                                    if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1112) {
                                    if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1112) {
                                    if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function1113 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel19 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1112) {
                                if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i1112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i1113) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1113);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i1112 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1113, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1113) {
                            if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i1113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function1114 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function1114, (Function1) objRememberedValue4, calendarModel19, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1112 & 112) | (i1112 & 896) | (i1112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function1113;
                    datePickerFormatter2 = datePickerFormatter3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1113) {
                                    if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1113) {
                                    if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1113) {
                                    if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1113) {
                                    if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function1114 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel110 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1113) {
                                if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i1113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i1114) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1114);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i1113 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1114, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1114) {
                            if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i1114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function1115 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function1115, (Function1) objRememberedValue4, calendarModel110, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1113 & 112) | (i1113 & 896) | (i1113 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function1114;
                    datePickerFormatter2 = datePickerFormatter3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final DatePickerFormatter datePickerFormatter13 = datePickerFormatter2;
                    final Function2<? super Composer, ? super Integer, Unit> function1115 = function2ComposableLambda;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1114) {
                            DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter13, function1115, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            function2ComposableLambda2 = function3;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        datePickerColors2 = datePickerColors;
                        if (composerStartRestartGroup.changed(datePickerColors2)) {
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1114) {
                                    if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1114) {
                                    if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1114) {
                                    if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1114) {
                                    if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function1116 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel111 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1114) {
                                if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i1114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i1115) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1115);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i1114 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1116, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1115) {
                            if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i1115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function1117 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function1117, (Function1) objRememberedValue4, calendarModel111, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1114 & 112) | (i1114 & 896) | (i1114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function1116;
                    datePickerFormatter2 = datePickerFormatter3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1115) {
                                    if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1115) {
                                    if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1115) {
                                    if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1115) {
                                    if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function1117 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel112 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1115) {
                                if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i1115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i1116) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1116);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i1115 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1117, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1116) {
                            if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i1116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function1118 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function1118, (Function1) objRememberedValue4, calendarModel112, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1115 & 112) | (i1115 & 896) | (i1115 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function1117;
                    datePickerFormatter2 = datePickerFormatter3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final DatePickerFormatter datePickerFormatter14 = datePickerFormatter2;
                    final Function2<? super Composer, ? super Integer, Unit> function1118 = function2ComposableLambda;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1116) {
                            DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter14, function1118, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (composerStartRestartGroup.changed(datePickerColors2)) {
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i3 |= i13;
            } else {
                datePickerColors2 = datePickerColors;
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1116) {
                                if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i1116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1116) {
                                if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i1116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1116) {
                                if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i1116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1116) {
                                if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i1116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function1119 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel113 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1116) {
                            if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i1116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i1117) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1117);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i1116 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function1119, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1117) {
                        if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i1117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function11110 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11110, (Function1) objRememberedValue4, calendarModel113, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1116 & 112) | (i1116 & 896) | (i1116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function1119;
                datePickerFormatter2 = datePickerFormatter3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1117) {
                                if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i1117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1117) {
                                if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i1117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1117) {
                                if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i1117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1117) {
                                if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i1117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function11110 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel114 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1117) {
                            if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i1117, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i1118) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1118);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i1117 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11110, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1118) {
                        if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i1118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function11111 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11111, (Function1) objRememberedValue4, calendarModel114, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1117 & 112) | (i1117 & 896) | (i1117 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function11110;
                datePickerFormatter2 = datePickerFormatter3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final DatePickerFormatter datePickerFormatter15 = datePickerFormatter2;
                final Function2<? super Composer, ? super Integer, Unit> function11111 = function2ComposableLambda;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1118) {
                        DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter15, function11111, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        function2ComposableLambda = function2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function2ComposableLambda2 = function3;
                if (composerStartRestartGroup.changedInstance(function2ComposableLambda2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        datePickerColors2 = datePickerColors;
                        if (composerStartRestartGroup.changed(datePickerColors2)) {
                        }
                        i3 |= i13;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1118) {
                                    if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1118) {
                                    if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1118) {
                                    if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1118) {
                                    if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function11112 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel115 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1118) {
                                if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i1118, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i1119) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i1119);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i1118 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11112, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1119) {
                            if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i1119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function11113 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11113, (Function1) objRememberedValue4, calendarModel115, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1118 & 112) | (i1118 & 896) | (i1118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function11112;
                    datePickerFormatter2 = datePickerFormatter3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1119) {
                                    if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1119) {
                                    if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-1155307541);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1119) {
                                    if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-162164694, i1119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                {
                                    super(2);
                                }
                            });
                        }
                        if (i6 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i1119) {
                                    if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-185279404, i1119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                        }
                                        DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            });
                        }
                        if (i8 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                            function4 = function2ComposableLambda;
                            z3 = z2;
                        } else {
                            function4 = function2ComposableLambda;
                            z3 = z2;
                            datePickerColorsColors = datePickerColors2;
                        }
                    }
                    i10 = i3;
                    Function2<? super Composer, ? super Integer, Unit> function11113 = function2ComposableLambda2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                    }
                    localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1155306707);
                    zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final CalendarModel calendarModel116 = (CalendarModel) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    if (z3) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1119) {
                                if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1490010652, i1119, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                    }
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                    int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                    composer2.startReplaceableGroup(-1467496949);
                                    boolean zChanged2 = composer2.changed(dateRangePickerState);
                                    final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                                m2032invokevCnGnXg(displayMode.getValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                            public final void m2032invokevCnGnXg(int i11110) {
                                                dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11110);
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceableGroup();
                                    DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda = null;
                    }
                    int i1119 = i10 >> 6;
                    DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11113, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11110) {
                            if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-57534331, i11110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                                }
                                Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                                Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                                long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496213);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                            invoke2(l, l2);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Long l, Long l2) {
                                            try {
                                                dateRangePickerState2.setSelection(l, l2);
                                            } catch (IllegalArgumentException unused) {
                                            }
                                        }

                                        {
                                            super(2);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                Function2 function11114 = (Function2) objRememberedValue3;
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(-1467495707);
                                boolean zChanged3 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                            invoke(l.longValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(long j) {
                                            dateRangePickerState3.setDisplayedMonthMillis(j);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceableGroup();
                                DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11114, (Function1) objRememberedValue4, calendarModel116, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i1119 & 112) | (i1119 & 896) | (i1119 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2ComposableLambda = function4;
                    modifier3 = modifier2;
                    z4 = z3;
                    function5 = function11113;
                    datePickerFormatter2 = datePickerFormatter3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final DatePickerFormatter datePickerFormatter16 = datePickerFormatter2;
                    final Function2<? super Composer, ? super Integer, Unit> function11114 = function2ComposableLambda;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11110) {
                            DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter16, function11114, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z2 = z;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (composerStartRestartGroup.changed(datePickerColors2)) {
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i3 |= i13;
            } else {
                datePickerColors2 = datePickerColors;
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11110) {
                                if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11110) {
                                if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11110) {
                                if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11110) {
                                if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function11115 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel117 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11110) {
                            if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i11110, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i11111) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11111);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i11110 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11115, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11111) {
                        if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i11111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function11116 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11116, (Function1) objRememberedValue4, calendarModel117, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i11110 & 112) | (i11110 & 896) | (i11110 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function11115;
                datePickerFormatter2 = datePickerFormatter3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11111) {
                                if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11111) {
                                if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11111) {
                                if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11111) {
                                if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function11116 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel118 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11111) {
                            if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i11111, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i11112) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11112);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i11111 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11116, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11112) {
                        if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i11112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function11117 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11117, (Function1) objRememberedValue4, calendarModel118, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i11111 & 112) | (i11111 & 896) | (i11111 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function11116;
                datePickerFormatter2 = datePickerFormatter3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final DatePickerFormatter datePickerFormatter17 = datePickerFormatter2;
                final Function2<? super Composer, ? super Integer, Unit> function11117 = function2ComposableLambda;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11112) {
                        DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter17, function11117, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        function2ComposableLambda2 = function3;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (composerStartRestartGroup.changed(datePickerColors2)) {
                    }
                    i3 |= i13;
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i3 |= i13;
            } else {
                datePickerColors2 = datePickerColors;
            }
            if ((599187 & i3) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11112) {
                                if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11112) {
                                if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11112) {
                                if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11112) {
                                if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function11118 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel119 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11112) {
                            if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i11112, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i11113) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11113);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i11112 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11118, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11113) {
                        if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i11113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function11119 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function11119, (Function1) objRememberedValue4, calendarModel119, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i11112 & 112) | (i11112 & 896) | (i11112 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function11118;
                datePickerFormatter2 = datePickerFormatter3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11113) {
                                if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11113) {
                                if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-1155307541);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11113) {
                                if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-162164694, i11113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    }
                    if (i6 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11113) {
                                if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-185279404, i11113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                    }
                                    DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        });
                    }
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                        function4 = function2ComposableLambda;
                        z3 = z2;
                    } else {
                        function4 = function2ComposableLambda;
                        z3 = z2;
                        datePickerColorsColors = datePickerColors2;
                    }
                }
                i10 = i3;
                Function2<? super Composer, ? super Integer, Unit> function11119 = function2ComposableLambda2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
                }
                localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1155306707);
                zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final CalendarModel calendarModel1110 = (CalendarModel) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11113) {
                            if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1490010652, i11113, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                                int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                                composer2.startReplaceableGroup(-1467496949);
                                boolean zChanged2 = composer2.changed(dateRangePickerState);
                                final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                            m2032invokevCnGnXg(displayMode.getValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                        public final void m2032invokevCnGnXg(int i11114) {
                                            dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11114);
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda = null;
                }
                int i11113 = i10 >> 6;
                DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function11119, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11114) {
                        if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-57534331, i11114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                            }
                            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496213);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                        invoke2(l, l2);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Long l, Long l2) {
                                        try {
                                            dateRangePickerState2.setSelection(l, l2);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }

                                    {
                                        super(2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            Function2 function111110 = (Function2) objRememberedValue3;
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(-1467495707);
                            boolean zChanged3 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                        invoke(l.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(long j) {
                                        dateRangePickerState3.setDisplayedMonthMillis(j);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceableGroup();
                            DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function111110, (Function1) objRememberedValue4, calendarModel1110, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i11113 & 112) | (i11113 & 896) | (i11113 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2ComposableLambda = function4;
                modifier3 = modifier2;
                z4 = z3;
                function5 = function11119;
                datePickerFormatter2 = datePickerFormatter3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final DatePickerFormatter datePickerFormatter18 = datePickerFormatter2;
                final Function2<? super Composer, ? super Integer, Unit> function111110 = function2ComposableLambda;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11114) {
                        DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter18, function111110, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z2 = z;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                datePickerColors2 = datePickerColors;
                if (composerStartRestartGroup.changed(datePickerColors2)) {
                }
                i3 |= i13;
            } else {
                datePickerColors2 = datePickerColors;
            }
            i3 |= i13;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-1155307541);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11114) {
                            if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-162164694, i11114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                }
                if (i6 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11114) {
                            if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-185279404, i11114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    function4 = function2ComposableLambda;
                    z3 = z2;
                } else {
                    function4 = function2ComposableLambda;
                    z3 = z2;
                    datePickerColorsColors = datePickerColors2;
                }
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-1155307541);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11114) {
                            if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-162164694, i11114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                }
                if (i6 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11114) {
                            if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-185279404, i11114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    function4 = function2ComposableLambda;
                    z3 = z2;
                } else {
                    function4 = function2ComposableLambda;
                    z3 = z2;
                    datePickerColorsColors = datePickerColors2;
                }
            }
            i10 = i3;
            Function2<? super Composer, ? super Integer, Unit> function111111 = function2ComposableLambda2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
            }
            localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1155306707);
            zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CalendarModel calendarModel1111 = (CalendarModel) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            if (z3) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11114) {
                        if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1490010652, i11114, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496949);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                        m2032invokevCnGnXg(displayMode.getValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                    public final void m2032invokevCnGnXg(int i11115) {
                                        dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11115);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    {
                        super(2);
                    }
                });
            } else {
                composableLambda = null;
            }
            int i11114 = i10 >> 6;
            DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function111111, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11115) {
                    if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-57534331, i11115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                        }
                        Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                        Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                        long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                        composer2.startReplaceableGroup(-1467496213);
                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                    invoke2(l, l2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Long l, Long l2) {
                                    try {
                                        dateRangePickerState2.setSelection(l, l2);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }

                                {
                                    super(2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        Function2 function111112 = (Function2) objRememberedValue3;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1467495707);
                        boolean zChanged3 = composer2.changed(dateRangePickerState);
                        final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                    invoke(l.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    dateRangePickerState3.setDisplayedMonthMillis(j);
                                }

                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function111112, (Function1) objRememberedValue4, calendarModel1111, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i11114 & 112) | (i11114 & 896) | (i11114 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2ComposableLambda = function4;
            modifier3 = modifier2;
            z4 = z3;
            function5 = function111111;
            datePickerFormatter2 = datePickerFormatter3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-1155307541);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11115) {
                            if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-162164694, i11115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                }
                if (i6 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11115) {
                            if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-185279404, i11115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    function4 = function2ComposableLambda;
                    z3 = z2;
                } else {
                    function4 = function2ComposableLambda;
                    z3 = z2;
                    datePickerColorsColors = datePickerColors2;
                }
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-1155307541);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    datePickerFormatter3 = (DatePickerFormatter) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    i3 &= -897;
                }
                if (i4 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -162164694, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11115) {
                            if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-162164694, i11115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2025DateRangePickerTitlehOD91z4(dateRangePickerState.mo2034getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerTitlePadding), composer2, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                }
                if (i6 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -185279404, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11115) {
                            if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-185279404, i11115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                                }
                                DateRangePickerDefaults.INSTANCE.m2024DateRangePickerHeadlinev84Udv0(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo2034getDisplayModejFl4v0(), datePickerFormatter3, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.DateRangePickerHeadlinePadding), composer2, 221184, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    });
                }
                if (i8 != 0) {
                    z2 = true;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    datePickerColorsColors = DatePickerDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    function4 = function2ComposableLambda;
                    z3 = z2;
                } else {
                    function4 = function2ComposableLambda;
                    z3 = z2;
                    datePickerColorsColors = datePickerColors2;
                }
            }
            i10 = i3;
            Function2<? super Composer, ? super Integer, Unit> function111112 = function2ComposableLambda2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(650830774, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:105)");
            }
            localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1155306707);
            zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = CalendarModel_androidKt.createCalendarModel(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CalendarModel calendarModel1112 = (CalendarModel) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            if (z3) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1490010652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.4
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11115) {
                        if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1490010652, i11115, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:114)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                            int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                            composer2.startReplaceableGroup(-1467496949);
                            boolean zChanged2 = composer2.changed(dateRangePickerState);
                            final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = (Function1) new Function1<DisplayMode, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$4$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ Unit invoke(DisplayMode displayMode) {
                                        m2032invokevCnGnXg(displayMode.getValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke-vCnGnXg, reason: not valid java name */
                                    public final void m2032invokevCnGnXg(int i11116) {
                                        dateRangePickerState2.mo2035setDisplayModevCnGnXg(i11116);
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceableGroup();
                            DatePickerKt.m2013DisplayModeToggleButtontER2X8s(modifierPadding, iMo2034getDisplayModejFl4v0, (Function1) objRememberedValue3, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    {
                        super(2);
                    }
                });
            } else {
                composableLambda = null;
            }
            int i11115 = i10 >> 6;
            DatePickerKt.m2009DateEntryContainerau3_HiA(modifier2, function4, function111112, composableLambda, datePickerColorsColors, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont()), Dp.m6935constructorimpl(DatePickerModalTokens.INSTANCE.m2979getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -57534331, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.5
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11116) {
                    if ((i11116 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-57534331, i11116, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                        }
                        Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
                        Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
                        long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
                        int iMo2034getDisplayModejFl4v0 = dateRangePickerState.mo2034getDisplayModejFl4v0();
                        composer2.startReplaceableGroup(-1467496213);
                        boolean zChanged2 = composer2.changed(dateRangePickerState);
                        final DateRangePickerState dateRangePickerState2 = dateRangePickerState;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function2) new Function2<Long, Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Long l, Long l2) {
                                    invoke2(l, l2);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Long l, Long l2) {
                                    try {
                                        dateRangePickerState2.setSelection(l, l2);
                                    } catch (IllegalArgumentException unused) {
                                    }
                                }

                                {
                                    super(2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        Function2 function111113 = (Function2) objRememberedValue3;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1467495707);
                        boolean zChanged3 = composer2.changed(dateRangePickerState);
                        final DateRangePickerState dateRangePickerState3 = dateRangePickerState;
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePicker$5$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(Long l) {
                                    invoke(l.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    dateRangePickerState3.setDisplayedMonthMillis(j);
                                }

                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceableGroup();
                        DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, iMo2034getDisplayModejFl4v0, function111113, (Function1) objRememberedValue4, calendarModel1112, dateRangePickerState.getYearRange(), datePickerFormatter3, dateRangePickerState.getSelectableDates(), datePickerColorsColors, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }), composerStartRestartGroup, ((i10 >> 3) & 14) | 14155776 | (i11115 & 112) | (i11115 & 896) | (i11115 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2ComposableLambda = function4;
            modifier3 = modifier2;
            z4 = z3;
            function5 = function111112;
            datePickerFormatter2 = datePickerFormatter3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final DatePickerFormatter datePickerFormatter19 = datePickerFormatter2;
            final Function2<? super Composer, ? super Integer, Unit> function111113 = function2ComposableLambda;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePicker.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11116) {
                    DateRangePickerKt.DateRangePicker(dateRangePickerState, modifier3, datePickerFormatter19, function111113, function5, z4, datePickerColorsColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m2031rememberDateRangePickerStateIlFM19s(Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2012087461);
        final Long l4 = (i3 & 1) != 0 ? null : l;
        final Long l5 = (i3 & 2) != 0 ? null : l2;
        final Long l6 = (i3 & 4) != 0 ? l4 : l3;
        final IntRange yearRange = (i3 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        final int iM2052getPickerjFl4v0 = (i3 & 16) != 0 ? DisplayMode.INSTANCE.m2052getPickerjFl4v0() : i;
        final SelectableDates allDates = (i3 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        final Locale localeDefaultLocale = ActualAndroid_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.INSTANCE.Saver(allDates, localeDefaultLocale);
        composer.startReplaceableGroup(269010268);
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(l4)) || (i2 & 6) == 4;
        boolean z2 = (((i2 & 112) ^ 48) > 32 && composer.changed(l5)) || (i2 & 48) == 32;
        boolean z3 = (((i2 & 896) ^ 384) > 256 && composer.changed(l6)) || (i2 & 384) == 256;
        boolean zChangedInstance = composer.changedInstance(yearRange);
        boolean z4 = (((i2 & 57344) ^ 24576) > 16384 && composer.changed(iM2052getPickerjFl4v0)) || (i2 & 24576) == 16384;
        boolean z5 = (((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(allDates)) || (i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        boolean zChangedInstance2 = composer.changedInstance(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if ((z5 | z3 | z2 | z | zChangedInstance | z4 | zChangedInstance2) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<DateRangePickerStateImpl>() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DateRangePickerStateImpl invoke() {
                    return new DateRangePickerStateImpl(l4, l5, l6, yearRange, iM2052getPickerjFl4v0, allDates, localeDefaultLocale, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m3663rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m2027DateRangePickerStateHVP43zI$default(Locale locale, Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        if ((i2 & 8) != 0) {
            l3 = l;
        }
        if ((i2 & 16) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 32) != 0) {
            i = DisplayMode.INSTANCE.m2052getPickerjFl4v0();
        }
        if ((i2 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m2026DateRangePickerStateHVP43zI(locale, l, l2, l3, intRange, i, selectableDates);
    }

    /* JADX INFO: renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m2026DateRangePickerStateHVP43zI(Locale locale, Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l, l2, l3, intRange, i, selectableDates, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m2028SwitchableDateEntryContentRN2D1Q(final Long l, final Long l2, final long j, final int i, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-532789335);
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(calendarModel) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(intRange) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= (i2 & 134217728) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) != 306783378 || (i5 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i4, i5, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:680)");
            }
            CrossfadeKt.Crossfade(DisplayMode.m2044boximpl(i), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1026642619, true, new Function3<DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ Unit invoke(DisplayMode displayMode, Composer composer2, Integer num) {
                    m2033invokeQujVXRc(displayMode.getValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m2033invokeQujVXRc(int i6, Composer composer2, int i7) {
                    int i8;
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer2.changed(i6) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1026642619, i8, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:690)");
                        }
                        if (DisplayMode.m2047equalsimpl0(i6, DisplayMode.INSTANCE.m2052getPickerjFl4v0())) {
                            composer2.startReplaceableGroup(-1168744807);
                            DateRangePickerKt.DateRangePickerContent(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                            composer2.endReplaceableGroup();
                        } else if (DisplayMode.m2047equalsimpl0(i6, DisplayMode.INSTANCE.m2051getInputjFl4v0())) {
                            composer2.startReplaceableGroup(-1168744198);
                            DateRangeInputKt.DateRangeInputContent(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, 0);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(-1168743741);
                            composer2.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }
            }), composerStartRestartGroup, ((i4 >> 9) & 14) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    DateRangePickerKt.m2028SwitchableDateEntryContentRN2D1Q(l, l2, j, i, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DateRangePickerContent(final Long l, final Long l2, final long j, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-787063721);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:731)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(calendarModel.getMonth(j).indexIn(intRange), 0, composerStartRestartGroup, 0, 2);
            Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1004paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DatePickerKt.WeekDays(datePickerColors, calendarModel, composerStartRestartGroup, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            composer2 = composerStartRestartGroup;
            VerticalMonthsList(lazyListStateRememberLazyListState, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, ((i2 << 3) & PointerIconCompat.TYPE_TEXT) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (1879048192 & i2));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    DateRangePickerKt.DateRangePickerContent(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalMonthsList(final LazyListState lazyListState, final Long l, final Long l2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1257365001);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(l2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(selectableDates) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i2, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:769)");
            }
            final CalendarDate today = calendarModel.getToday();
            composerStartRestartGroup.startReplaceableGroup(1454981403);
            boolean zChanged = composerStartRestartGroup.changed(intRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(intRange.getFirst(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            int i3 = i2;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1090773432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1090773432, i4, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:780)");
                        }
                        composer3.startReplaceableGroup(773894976);
                        composer3.startReplaceableGroup(-492369756);
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
                        }
                        composer3.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                        composer3.endReplaceableGroup();
                        Strings.Companion companion = Strings.INSTANCE;
                        String strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer3, 0);
                        Strings.Companion companion2 = Strings.INSTANCE;
                        String strM2496getStringNWtq29 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer3, 0);
                        composer3.startReplaceableGroup(1645720805);
                        boolean zChanged2 = composer3.changed(l);
                        boolean zChanged3 = composer3.changed(l2);
                        boolean zChanged4 = composer3.changed(function2);
                        final Long l3 = l;
                        final Long l4 = l2;
                        final Function2<Long, Long, Unit> function3 = function2;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if ((zChanged2 | zChanged3 | zChanged4) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(Long l5) {
                                    invoke(l5.longValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    DateRangePickerKt.updateDateSelection(j, l3, l4, function3);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final Function1 function4 = (Function1) objRememberedValue3;
                        composer3.endReplaceableGroup();
                        final List listCustomScrollActions = DateRangePickerKt.customScrollActions(lazyListState, coroutineScope, strM2496getStringNWtq28, strM2496getStringNWtq29);
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }, new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(0.0f);
                                    }
                                }, false, 4, null));
                            }
                        }, 1, null);
                        LazyListState lazyListState2 = lazyListState;
                        composer3.startReplaceableGroup(1645721776);
                        boolean zChangedInstance = composer3.changedInstance(intRange);
                        boolean zChangedInstance2 = composer3.changedInstance(calendarModel);
                        boolean zChanged5 = composer3.changed(calendarMonth);
                        boolean zChangedInstance3 = composer3.changedInstance(datePickerFormatter);
                        boolean zChangedInstance4 = composer3.changedInstance(listCustomScrollActions);
                        boolean zChanged6 = composer3.changed(datePickerColors);
                        boolean zChanged7 = composer3.changed(l);
                        boolean zChanged8 = composer3.changed(l2);
                        boolean zChanged9 = composer3.changed(function4);
                        boolean zChanged10 = composer3.changed(today);
                        boolean zChanged11 = composer3.changed(selectableDates);
                        final IntRange intRange2 = intRange;
                        final CalendarModel calendarModel2 = calendarModel;
                        final CalendarMonth calendarMonth2 = calendarMonth;
                        final Long l5 = l;
                        final Long l6 = l2;
                        final CalendarDate calendarDate = today;
                        final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                        final SelectableDates selectableDates2 = selectableDates;
                        final DatePickerColors datePickerColors2 = datePickerColors;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if ((zChanged11 | zChangedInstance | zChangedInstance2 | zChanged5 | zChangedInstance3 | zChangedInstance4 | zChanged6 | zChanged7 | zChanged8 | zChanged9 | zChanged10) || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = (Function1) new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                    invoke2(lazyListScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(LazyListScope lazyListScope) {
                                    int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(intRange2);
                                    final CalendarModel calendarModel3 = calendarModel2;
                                    final CalendarMonth calendarMonth3 = calendarMonth2;
                                    final Long l7 = l5;
                                    final Long l8 = l6;
                                    final Function1<Long, Unit> function5 = function4;
                                    final CalendarDate calendarDate2 = calendarDate;
                                    final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                    final SelectableDates selectableDates3 = selectableDates2;
                                    final DatePickerColors datePickerColors3 = datePickerColors2;
                                    final List<CustomAccessibilityAction> list = listCustomScrollActions;
                                    LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                        @Override // kotlin.jvm.functions.Function4
                                        public final /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer4, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer4, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope lazyItemScope, int i5, Composer composer4, int i6) {
                                            int i7;
                                            SelectedRangeInfo selectedRangeInfo;
                                            if ((i6 & 6) == 0) {
                                                i7 = i6 | (composer4.changed(lazyItemScope) ? 4 : 2);
                                            } else {
                                                i7 = i6;
                                            }
                                            if ((i6 & 48) == 0) {
                                                i7 |= composer4.changed(i5) ? 32 : 16;
                                            }
                                            if ((i7 & 147) != 146 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1413501381, i7, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:812)");
                                                }
                                                final CalendarMonth calendarMonthPlusMonths = calendarModel3.plusMonths(calendarMonth3, i5);
                                                Modifier modifierFillParentMaxWidth$default = LazyItemScope.fillParentMaxWidth$default(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
                                                Long l9 = l7;
                                                Long l10 = l8;
                                                Function1<Long, Unit> function6 = function5;
                                                CalendarDate calendarDate3 = calendarDate2;
                                                final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                                SelectableDates selectableDates4 = selectableDates3;
                                                final DatePickerColors datePickerColors4 = datePickerColors3;
                                                final List<CustomAccessibilityAction> list2 = list;
                                                CalendarModel calendarModel4 = calendarModel3;
                                                composer4.startReplaceableGroup(-483455358);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                composer4.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillParentMaxWidth$default);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer4);
                                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer4, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont()), ComposableLambdaKt.composableLambda(composer4, 1622100276, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                        invoke(composer5, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer5, int i8) {
                                                        if ((i8 & 3) != 2 || !composer5.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1622100276, i8, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:825)");
                                                            }
                                                            DatePickerFormatter datePickerFormatter5 = datePickerFormatter4;
                                                            long startUtcTimeMillis = calendarMonthPlusMonths.getStartUtcTimeMillis();
                                                            String monthYear = datePickerFormatter5.formatMonthYear(Long.valueOf(startUtcTimeMillis), ActualAndroid_androidKt.defaultLocale(composer5, 0));
                                                            if (monthYear == null) {
                                                                monthYear = "-";
                                                            }
                                                            String str = monthYear;
                                                            Modifier modifierM590clickableXHw0xAI$default = ClickableKt.m590clickableXHw0xAI$default(PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, null, null, new Function0<Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1.1
                                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2() {
                                                                }

                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final /* bridge */ /* synthetic */ Unit invoke() {
                                                                    invoke2();
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }, 7, null);
                                                            composer5.startReplaceableGroup(413139989);
                                                            boolean zChangedInstance5 = composer5.changedInstance(list2);
                                                            final List<CustomAccessibilityAction> list3 = list2;
                                                            Object objRememberedValue5 = composer5.rememberedValue();
                                                            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$2$1
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                        invoke2(semanticsPropertyReceiver);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list3);
                                                                    }

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }
                                                                };
                                                                composer5.updateRememberedValue(objRememberedValue5);
                                                            }
                                                            composer5.endReplaceableGroup();
                                                            TextKt.m2654Text4IGK_g(str, SemanticsModifierKt.semantics$default(modifierM590clickableXHw0xAI$default, false, (Function1) objRememberedValue5, 1, null), datePickerColors4.getSubheadContentColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131064);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer5.skipToGroupEnd();
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }
                                                }), composer4, 48);
                                                composer4.startReplaceableGroup(-1455463505);
                                                if (l9 == null || l10 == null) {
                                                    selectedRangeInfo = null;
                                                } else {
                                                    composer4.startReplaceableGroup(-1455463352);
                                                    boolean zChanged12 = composer4.changed(l9);
                                                    boolean zChanged13 = composer4.changed(l10);
                                                    Object objRememberedValue5 = composer4.rememberedValue();
                                                    if ((zChanged12 | zChanged13) || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = SelectedRangeInfo.INSTANCE.calculateRangeInfo(calendarMonthPlusMonths, calendarModel4.getCanonicalDate(l9.longValue()), calendarModel4.getCanonicalDate(l10.longValue()));
                                                        composer4.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    selectedRangeInfo = (SelectedRangeInfo) objRememberedValue5;
                                                }
                                                composer4.endReplaceableGroup();
                                                DatePickerKt.Month(calendarMonthPlusMonths, function6, calendarDate3.getUtcTimeMillis(), l9, l10, selectedRangeInfo, datePickerFormatter4, selectableDates4, datePickerColors4, composer4, 0);
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }
                                    }), 6, null);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState2, null, false, null, null, null, false, (Function1) objRememberedValue4, composer3, 0, 252);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(1454985957);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            boolean z2 = (i3 & 57344) == 16384;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(calendarModel);
            composer2 = composerStartRestartGroup;
            boolean zChangedInstance2 = composer2.changedInstance(intRange);
            DateRangePickerKt$VerticalMonthsList$2$1 dateRangePickerKt$VerticalMonthsList$2$1RememberedValue = composer2.rememberedValue();
            if ((z | z2 | zChangedInstance | zChangedInstance2) || dateRangePickerKt$VerticalMonthsList$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                dateRangePickerKt$VerticalMonthsList$2$1RememberedValue = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, function1, calendarModel, intRange, null);
                composer2.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1RememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dateRangePickerKt$VerticalMonthsList$2$1RememberedValue, composer2, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    DateRangePickerKt.VerticalMonthsList(lazyListState, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j, Long l, Long l2, Function2<? super Long, ? super Long, Unit> function2) {
        if ((l == null && l2 == null) || (l != null && l2 != null)) {
            function2.invoke(Long.valueOf(j), null);
        } else if (l != null && j >= l.longValue()) {
            function2.invoke(l, Long.valueOf(j));
        } else {
            function2.invoke(Long.valueOf(j), null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* JADX INFO: renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m2030drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j) {
        float fM4043getWidthimpl;
        float f = contentDrawScope.mo694toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f2 = contentDrawScope.mo694toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f3 = contentDrawScope.mo694toPx0680j_4(DatePickerModalTokens.INSTANCE.m2972getDateStateLayerHeightD9Ej5fM());
        float f4 = (f2 - f3) / 2.0f;
        float fM4043getWidthimpl2 = (Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc()) - (f * 7.0f)) / 7.0f;
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int iM7055component1impl = IntOffset.m7055component1impl(gridStartCoordinates);
        int iM7056component2impl = IntOffset.m7056component2impl(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int iM7055component1impl2 = IntOffset.m7055component1impl(gridEndCoordinates);
        int iM7056component2impl2 = IntOffset.m7056component2impl(gridEndCoordinates);
        float f5 = f + fM4043getWidthimpl2;
        float f6 = fM4043getWidthimpl2 / 2.0f;
        float fM4043getWidthimpl3 = (iM7055component1impl * f5) + (selectedRangeInfo.getFirstIsSelectionStart() ? f / 2.0f : 0.0f) + f6;
        float f7 = (iM7056component2impl * f2) + f4;
        float f8 = iM7055component1impl2;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            f /= 2.0f;
        }
        float fM4043getWidthimpl4 = (f8 * f5) + f + f6;
        float f9 = iM7056component2impl2;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            fM4043getWidthimpl3 = Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc()) - fM4043getWidthimpl3;
            fM4043getWidthimpl4 = Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc()) - fM4043getWidthimpl4;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        long jOffset = OffsetKt.Offset(fM4043getWidthimpl3, f7);
        if (iM7056component2impl == iM7056component2impl2) {
            fM4043getWidthimpl = fM4043getWidthimpl4 - fM4043getWidthimpl3;
        } else {
            fM4043getWidthimpl = z ? -fM4043getWidthimpl3 : Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc()) - fM4043getWidthimpl3;
        }
        DrawScope.m4792drawRectnJ9OG0$default(contentDrawScope2, j, jOffset, SizeKt.Size(fM4043getWidthimpl, f3), 0.0f, null, null, 0, 120, null);
        if (iM7056component2impl != iM7056component2impl2) {
            for (int i = (iM7056component2impl2 - iM7056component2impl) - 1; i > 0; i--) {
                DrawScope.m4792drawRectnJ9OG0$default(contentDrawScope2, j, OffsetKt.Offset(0.0f, (i * f2) + f7), SizeKt.Size(Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc()), f3), 0.0f, null, null, 0, 120, null);
            }
            long jOffset2 = OffsetKt.Offset(contentDrawScope.getLayoutDirection() != LayoutDirection.Ltr ? Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc()) : 0.0f, (f9 * f2) + f4);
            if (z) {
                fM4043getWidthimpl4 -= Size.m4043getWidthimpl(contentDrawScope.mo4798getSizeNHjbRc());
            }
            DrawScope.m4792drawRectnJ9OG0$default(contentDrawScope2, j, jOffset2, SizeKt.Size(fM4043getWidthimpl4, f3), 0.0f, null, null, 0, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                if (lazyListState.getCanScrollBackward()) {
                    b.TuitionPaymentFragmentbindingInflater1(coroutineScope, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1064}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex();
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex - 1, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                if (lazyListState.getCanScrollForward()) {
                    b.TuitionPaymentFragmentbindingInflater1(coroutineScope, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            /* JADX INFO: renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1074}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex();
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, 1 + firstVisibleItemIndex, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        })});
    }
}
