package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditCommand;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a(\u0010\u0014\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a&\u0010\u0018\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0018\u001a\u00020\u0011*\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001a\u001a2\u0010\u0018\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a<\u0010#\u001a\u00020\u0005*\u0004\u0018\u00010\u001f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a.\u0010)\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a.\u0010)\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010*\u001a:\u0010)\u001a\u00020\u0005*\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020$2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020%2\u0006\u0010 \u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010/\u001a\u00020\u0005*\u00020\u00152\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020%2\u0006\u0010 \u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a6\u0010/\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020%2\u0006\u0010 \u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u00100\u001a\u001b\u00102\u001a\u000201*\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u000201*\u00020\u0011H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00106\u001a\u000201*\u00020\u0011H\u0002¢\u0006\u0004\b6\u00105\u001a\u0013\u00107\u001a\u000201*\u00020\u0011H\u0002¢\u0006\u0004\b7\u00105\u001a\u0013\u00108\u001a\u000201*\u00020\u0011H\u0002¢\u0006\u0004\b8\u00105\u001a\u001b\u00109\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0011H\u0002¢\u0006\u0004\b9\u0010:\u001a\u0013\u0010<\u001a\u00020\u000f*\u00020;H\u0002¢\u0006\u0004\b<\u0010=\"\u0014\u0010>\u001a\u00020\u00118\u0002X\u0083T¢\u0006\u0006\n\u0004\b>\u0010?\"\u0014\u0010@\u001a\u00020\u00118\u0002X\u0083T¢\u0006\u0006\n\u0004\b@\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "Landroidx/compose/ui/text/input/EditCommand;", "p0", "compoundEditCommand", "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/TextRange;", "p1", "enclosure-pWDy79M", "(JJ)J", "enclosure", "", "adjustHandwritingDeleteGestureRange-72CqOWE", "(JLjava/lang/CharSequence;)J", "adjustHandwritingDeleteGestureRange", "Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/platform/ViewConfiguration;", "", "getLineForHandwritingGesture-d-4ec7I", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getLineForHandwritingGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getOffsetForHandwritingGesture-d-4ec7I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getOffsetForHandwritingGesture", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/layout/LayoutCoordinates;", "p2", "getOffsetForHandwritingGesture-ubNVwUQ", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/text/TextLayoutResult;", "p3", "getRangeForRemoveSpaceGesture-5iVPX68", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J", "getRangeForRemoveSpaceGesture", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextGranularity;", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForScreenRect-OH9lIzo", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRect", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRect-O048IG0", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRects-O048IG0", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRects", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "", "isBiDiBoundary", "(Landroidx/compose/ui/text/TextLayoutResult;I)Z", "isNewline", "(I)Z", "isPunctuation", "isWhitespace", "isWhitespaceExceptNewline", "rangeOfWhitespaces", "(Ljava/lang/CharSequence;I)J", "Landroid/graphics/PointF;", "toOffset", "(Landroid/graphics/PointF;)J", "LINE_FEED_CODE_POINT", "I", "NBSP_CODE_POINT"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HandwritingGesture_androidKt {
    private static final int LINE_FEED_CODE_POINT = 10;
    private static final int NBSP_CODE_POINT = 160;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m1482adjustHandwritingDeleteGestureRange72CqOWE(long j, CharSequence charSequence) {
        int iM6397getStartimpl = TextRange.m6397getStartimpl(j);
        int iM6392getEndimpl = TextRange.m6392getEndimpl(j);
        int iCodePointBefore = iM6397getStartimpl > 0 ? Character.codePointBefore(charSequence, iM6397getStartimpl) : 10;
        int iCodePointAt = iM6392getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM6392getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM6397getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM6397getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM6397getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRangeKt.TextRange(iM6397getStartimpl, iM6392getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j;
        }
        do {
            iM6392getEndimpl += Character.charCount(iCodePointAt);
            if (iM6392getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM6392getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRangeKt.TextRange(iM6397getStartimpl, iM6392getEndimpl);
    }

    private static final boolean isNewline(int i) {
        int type = Character.getType(i);
        return type == 14 || type == 13 || i == 10;
    }

    private static final boolean isWhitespace(int i) {
        return Character.isWhitespace(i) || i == NBSP_CODE_POINT;
    }

    private static final boolean isWhitespaceExceptNewline(int i) {
        return isWhitespace(i) && !isNewline(i);
    }

    private static final boolean isPunctuation(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        return OffsetKt.Offset(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1491getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        return m1489getRangeForScreenRectO048IG0(layoutResult != null ? layoutResult.getMultiParagraph() : null, rect, textLayoutState.getTextLayoutNodeCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1493getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long jM1491getRangeForScreenRectOH9lIzo = m1491getRangeForScreenRectOH9lIzo(textLayoutState, rect, i, textInclusionStrategy);
        if (TextRange.m6391getCollapsedimpl(jM1491getRangeForScreenRectOH9lIzo)) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        long jM1491getRangeForScreenRectOH9lIzo2 = m1491getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i, textInclusionStrategy);
        return TextRange.m6391getCollapsedimpl(jM1491getRangeForScreenRectOH9lIzo2) ? TextRange.INSTANCE.m6402getZerod9O1mEE() : m1483enclosurepWDy79M(jM1491getRangeForScreenRectOH9lIzo, jM1491getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m1490getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m1489getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m1492getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long jM1490getRangeForScreenRectOH9lIzo = m1490getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i, textInclusionStrategy);
        if (TextRange.m6391getCollapsedimpl(jM1490getRangeForScreenRectOH9lIzo)) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        long jM1490getRangeForScreenRectOH9lIzo2 = m1490getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i, textInclusionStrategy);
        return TextRange.m6391getCollapsedimpl(jM1490getRangeForScreenRectOH9lIzo2) ? TextRange.INSTANCE.m6402getZerod9O1mEE() : m1483enclosurepWDy79M(jM1490getRangeForScreenRectOH9lIzo, jM1490getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i += CodepointHelpers_jvmKt.charCount(iCodePointAt);
        }
        return TextRangeKt.TextRange(iCharCount, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1486getOffsetForHandwritingGestured4ec7I(TextLayoutState textLayoutState, long j, ViewConfiguration viewConfiguration) {
        MultiParagraph multiParagraph;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (multiParagraph = layoutResult.getMultiParagraph()) == null) {
            return -1;
        }
        return m1487getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m1485getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m1487getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        if (i == textLayoutResult.getLineStart(lineForOffset) || i == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) {
            return textLayoutResult.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i);
        }
        return textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    /* JADX INFO: renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m1489getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i, TextInclusionStrategy textInclusionStrategy) {
        if (multiParagraph == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        return multiParagraph.m6239getRangeForRect86BmAI(rect.m4011translatek4lQ0M(layoutCoordinates.mo5651screenToLocalMKHz9U(Offset.INSTANCE.m3990getZeroF1C5BW0())), i, textInclusionStrategy);
    }

    /* JADX INFO: renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m1487getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo5651screenToLocalMKHz9U;
        int iM1484getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM1484getLineForHandwritingGestured4ec7I = m1484getLineForHandwritingGestured4ec7I(multiParagraph, (jMo5651screenToLocalMKHz9U = layoutCoordinates.mo5651screenToLocalMKHz9U(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m6238getOffsetForPositionk4lQ0M(Offset.m3968copydBAh8RU$default(jMo5651screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM1484getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM1484getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m1488getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        long jMo5651screenToLocalMKHz9U = layoutCoordinates.mo5651screenToLocalMKHz9U(j);
        long jMo5651screenToLocalMKHz9U2 = layoutCoordinates.mo5651screenToLocalMKHz9U(j2);
        int iM1484getLineForHandwritingGestured4ec7I = m1484getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo5651screenToLocalMKHz9U, viewConfiguration);
        int iM1484getLineForHandwritingGestured4ec7I2 = m1484getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo5651screenToLocalMKHz9U2, viewConfiguration);
        if (iM1484getLineForHandwritingGestured4ec7I == -1) {
            if (iM1484getLineForHandwritingGestured4ec7I2 == -1) {
                return TextRange.INSTANCE.m6402getZerod9O1mEE();
            }
            iM1484getLineForHandwritingGestured4ec7I = iM1484getLineForHandwritingGestured4ec7I2;
        } else if (iM1484getLineForHandwritingGestured4ec7I2 != -1) {
            iM1484getLineForHandwritingGestured4ec7I = Math.min(iM1484getLineForHandwritingGestured4ec7I, iM1484getLineForHandwritingGestured4ec7I2);
        }
        float lineTop = (textLayoutResult.getLineTop(iM1484getLineForHandwritingGestured4ec7I) + textLayoutResult.getLineBottom(iM1484getLineForHandwritingGestured4ec7I)) / 2.0f;
        return textLayoutResult.getMultiParagraph().m6239getRangeForRect86BmAI(new Rect(Math.min(Offset.m3974getXimpl(jMo5651screenToLocalMKHz9U), Offset.m3974getXimpl(jMo5651screenToLocalMKHz9U2)), lineTop - 0.1f, Math.max(Offset.m3974getXimpl(jMo5651screenToLocalMKHz9U), Offset.m3974getXimpl(jMo5651screenToLocalMKHz9U2)), lineTop + 0.1f), TextGranularity.INSTANCE.m6359getCharacterDRrd7Zo(), TextInclusionStrategy.INSTANCE.getAnyOverlap());
    }

    /* JADX INFO: renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m1484getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Offset.m3975getYimpl(j));
        if (Offset.m3975getYimpl(j) < multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin || Offset.m3975getYimpl(j) > multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin || Offset.m3974getXimpl(j) < (-handwritingGestureLineMargin) || Offset.m3974getXimpl(j) > multiParagraph.getWidth() + handwritingGestureLineMargin) {
            return -1;
        }
        return lineForVerticalPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.ui.text.input.EditCommand
            public final void applyTo(androidx.compose.ui.text.input.EditingBuffer p0) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(p0);
                }
            }
        };
    }

    /* JADX INFO: renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m1483enclosurepWDy79M(long j, long j2) {
        return TextRangeKt.TextRange(Math.min(TextRange.m6397getStartimpl(j), TextRange.m6397getStartimpl(j)), Math.max(TextRange.m6392getEndimpl(j2), TextRange.m6392getEndimpl(j2)));
    }
}
