package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDelegate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJR\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJH\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110!2\u0006\u0010\u0005\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020 2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$JG\u0010)\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020+2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170,H\u0001¢\u0006\u0004\b-\u0010.JC\u00101\u001a\u00020\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0007\u001a\u00020+2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170,2\b\u0010\u000e\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b1\u00102JW\u00106\u001a\u00020'2\u0006\u0010\u0005\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020+2\u0006\u0010\u000e\u001a\u0002042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170,2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00170,H\u0001¢\u0006\u0004\b6\u00107JW\u00108\u001a\u00020'2\u0006\u0010\u0005\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020+2\u0006\u0010\u000e\u001a\u0002042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170,2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u00170,H\u0001¢\u0006\u0004\b8\u00107JF\u0010=\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u0007\u001a\u00020:2\u0006\u0010\r\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00170,H\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<J/\u0010>\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020:H\u0001¢\u0006\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextRange;", "p0", "Landroidx/compose/ui/text/input/TransformedText;", "p1", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/text/input/TextFieldValue;", "p2", "p3", "Landroidx/compose/ui/text/input/OffsetMapping;", "p4", "Landroidx/compose/ui/text/TextLayoutResult;", "p5", "Landroidx/compose/ui/graphics/Paint;", "p6", "Landroidx/compose/ui/graphics/Color;", "p7", "", "draw-Q1vqE60$foundation_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;JJLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;J)V", "draw", "drawHighlight-Le-punE", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;)V", "drawHighlight", "Landroidx/compose/foundation/text/TextDelegate;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/Triple;", "", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "layout", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/input/TextInputSession;", "", "notifyFocusedRect$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V", "Landroidx/compose/ui/text/input/EditProcessor;", "Lkotlin/Function1;", "onBlur$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand$foundation_release", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/input/TextInputSession;)V", "Landroidx/compose/ui/text/input/TextInputService;", "Landroidx/compose/ui/text/input/ImeOptions;", "Landroidx/compose/ui/text/input/ImeAction;", "onFocus$foundation_release", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;", "restartInput$foundation_release", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/jvm/functions/Function1;)V", "setCursorOffset", "updateTextLayoutResult$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m1386layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m1389layout_EkL_Y$foundation_release(textDelegate, j, layoutDirection, textLayoutResult);
        }

        @JvmStatic
        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m1389layout_EkL_Y$foundation_release(TextDelegate p0, long p1, LayoutDirection p2, TextLayoutResult p3) {
            TextLayoutResult textLayoutResultM1376layoutNN6EwU = p0.m1376layoutNN6EwU(p1, p2, p3);
            return new Triple<>(Integer.valueOf(IntSize.m7106getWidthimpl(textLayoutResultM1376layoutNN6EwU.getSize())), Integer.valueOf(IntSize.m7105getHeightimpl(textLayoutResultM1376layoutNN6EwU.getSize())), textLayoutResultM1376layoutNN6EwU);
        }

        @JvmStatic
        /* JADX INFO: renamed from: draw-Q1vqE60$foundation_release, reason: not valid java name */
        public final void m1388drawQ1vqE60$foundation_release(Canvas p0, TextFieldValue p1, long p2, long p3, OffsetMapping p4, TextLayoutResult p5, Paint p6, long p7) {
            if (!TextRange.m6391getCollapsedimpl(p2)) {
                p6.mo4095setColor8_81llA(p7);
                m1385drawHighlightLepunE(p0, p2, p4, p5, p6);
            } else if (!TextRange.m6391getCollapsedimpl(p3)) {
                Color colorM4208boximpl = Color.m4208boximpl(p5.getLayoutInput().getStyle().m6427getColor0d7_KjU());
                if (colorM4208boximpl.m4228unboximpl() == 16) {
                    colorM4208boximpl = null;
                }
                long jM4228unboximpl = colorM4208boximpl != null ? colorM4208boximpl.m4228unboximpl() : Color.INSTANCE.m4244getBlack0d7_KjU();
                p6.mo4095setColor8_81llA(Color.m4217copywmQWz5c$default(jM4228unboximpl, Color.m4220getAlphaimpl(jM4228unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m1385drawHighlightLepunE(p0, p3, p4, p5, p6);
            } else if (!TextRange.m6391getCollapsedimpl(p1.getSelection())) {
                p6.mo4095setColor8_81llA(p7);
                m1385drawHighlightLepunE(p0, p1.getSelection(), p4, p5, p6);
            }
            TextPainter.INSTANCE.paint(p0, p5);
        }

        /* JADX INFO: renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m1385drawHighlightLepunE(Canvas p0, long p1, OffsetMapping p2, TextLayoutResult p3, Paint p4) {
            int iOriginalToTransformed = p2.originalToTransformed(TextRange.m6395getMinimpl(p1));
            int iOriginalToTransformed2 = p2.originalToTransformed(TextRange.m6394getMaximpl(p1));
            if (iOriginalToTransformed != iOriginalToTransformed2) {
                p0.drawPath(p3.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), p4);
            }
        }

        @JvmStatic
        public final void notifyFocusedRect$foundation_release(TextFieldValue p0, TextDelegate p1, TextLayoutResult p2, LayoutCoordinates p3, TextInputSession p4, boolean p5, OffsetMapping p6) {
            Rect rect;
            if (p5) {
                int iOriginalToTransformed = p6.originalToTransformed(TextRange.m6394getMaximpl(p0.getSelection()));
                if (iOriginalToTransformed < p2.getLayoutInput().getText().length()) {
                    rect = p2.getBoundingBox(iOriginalToTransformed);
                } else if (iOriginalToTransformed != 0) {
                    rect = p2.getBoundingBox(iOriginalToTransformed - 1);
                } else {
                    rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m7105getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(p1.getStyle(), p1.getDensity(), p1.getFontFamilyResolver(), null, 0, 24, null)));
                }
                long jMo5648localToRootMKHz9U = p3.mo5648localToRootMKHz9U(OffsetKt.Offset(rect.getLeft(), rect.getTop()));
                p4.notifyFocusedRect(RectKt.m4014Recttz77jQw(OffsetKt.Offset(Offset.m3974getXimpl(jMo5648localToRootMKHz9U), Offset.m3975getYimpl(jMo5648localToRootMKHz9U)), SizeKt.Size(rect.getWidth(), rect.getHeight())));
            }
        }

        @JvmStatic
        public final void updateTextLayoutResult$foundation_release(TextInputSession p0, TextFieldValue p1, OffsetMapping p2, TextLayoutResultProxy p3) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = p3.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = p3.getDecorationBoxCoordinates()) == null) {
                return;
            }
            p0.updateTextLayoutResult(p1, p2, p3.getValue(), new Function1<Matrix, Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(Matrix matrix) {
                    m1391invoke58bKbWc(matrix.m4484unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m1391invoke58bKbWc(float[] fArr) {
                    if (innerTextFieldCoordinates.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(innerTextFieldCoordinates).mo5652transformFromEL8BTi8(innerTextFieldCoordinates, fArr);
                    }
                }

                {
                    super(1);
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        @JvmStatic
        public final void onEditCommand$foundation_release(List<? extends EditCommand> p0, EditProcessor p1, Function1<? super TextFieldValue, Unit> p2, TextInputSession p3) {
            TextFieldValue textFieldValueApply = p1.apply(p0);
            if (p3 != null) {
                p3.updateState(null, textFieldValueApply);
            }
            p2.invoke(textFieldValueApply);
        }

        @JvmStatic
        /* JADX INFO: renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m1390setCursorOffsetULxng0E$foundation_release(long p0, TextLayoutResultProxy p1, EditProcessor p2, OffsetMapping p3, Function1<? super TextFieldValue, Unit> p4) {
            p4.invoke(TextFieldValue.m6643copy3r_uNRQ$default(p2.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(p3.transformedToOriginal(TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(p1, p0, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.text.input.TextInputSession] */
        @JvmStatic
        public final TextInputSession restartInput$foundation_release(TextInputService p0, TextFieldValue p1, final EditProcessor p2, ImeOptions p3, final Function1<? super TextFieldValue, Unit> p4, Function1<? super ImeAction, Unit> p5) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = p0.startInput(p1, p3, new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
                    invoke2(list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends EditCommand> list) {
                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(list, p2, p4, objectRef.element);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            }, p5);
            return (TextInputSession) objectRef.element;
        }

        @JvmStatic
        public final TextInputSession onFocus$foundation_release(TextInputService p0, TextFieldValue p1, EditProcessor p2, ImeOptions p3, Function1<? super TextFieldValue, Unit> p4, Function1<? super ImeAction, Unit> p5) {
            return restartInput$foundation_release(p0, p1, p2, p3, p4, p5);
        }

        @JvmStatic
        public final void onBlur$foundation_release(TextInputSession p0, EditProcessor p1, Function1<? super TextFieldValue, Unit> p2) {
            p2.invoke(TextFieldValue.m6643copy3r_uNRQ$default(p1.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            p0.dispose();
        }

        /* JADX INFO: renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m1387applyCompositionDecoration72CqOWE(long p0, TransformedText p1) {
            int iOriginalToTransformed = p1.getOffsetMapping().originalToTransformed(TextRange.m6397getStartimpl(p0));
            int iOriginalToTransformed2 = p1.getOffsetMapping().originalToTransformed(TextRange.m6392getEndimpl(p0));
            int iMin = Math.min(iOriginalToTransformed, iOriginalToTransformed2);
            int iMax = Math.max(iOriginalToTransformed, iOriginalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(p1.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), iMin, iMax);
            return new TransformedText(builder.toAnnotatedString(), p1.getOffsetMapping());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
