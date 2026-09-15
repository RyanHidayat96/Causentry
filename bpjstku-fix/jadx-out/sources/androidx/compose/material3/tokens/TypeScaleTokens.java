package androidx.compose.material3.tokens;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0003\b\u0090\u0001\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u001d\u0010\u001b\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u001d\u0010\u001d\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010#\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u001d\u0010%\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR\u001d\u0010'\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016R\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010-\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR\u001d\u0010/\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\rR\u001d\u00101\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\rR\u001a\u00103\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0014\u001a\u0004\b4\u0010\u0016R\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u00107\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u001d\u00109\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010\u000b\u001a\u0004\b:\u0010\rR\u001d\u0010;\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\rR\u001a\u0010=\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0014\u001a\u0004\b>\u0010\u0016R\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010A\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\rR\u001d\u0010C\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bC\u0010\u000b\u001a\u0004\bD\u0010\rR\u001d\u0010E\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bE\u0010\u000b\u001a\u0004\bF\u0010\rR\u001a\u0010G\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0014\u001a\u0004\bH\u0010\u0016R\u001a\u0010I\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001d\u0010K\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bK\u0010\u000b\u001a\u0004\bL\u0010\rR\u001d\u0010M\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bM\u0010\u000b\u001a\u0004\bN\u0010\rR\u001d\u0010O\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\bP\u0010\rR\u001a\u0010Q\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0014\u001a\u0004\bR\u0010\u0016R\u001a\u0010S\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u001d\u0010U\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\bV\u0010\rR\u001d\u0010W\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bW\u0010\u000b\u001a\u0004\bX\u0010\rR\u001d\u0010Y\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bY\u0010\u000b\u001a\u0004\bZ\u0010\rR\u001a\u0010[\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\u0014\u001a\u0004\b\\\u0010\u0016R\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u001d\u0010_\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b_\u0010\u000b\u001a\u0004\b`\u0010\rR\u001d\u0010a\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\ba\u0010\u000b\u001a\u0004\bb\u0010\rR\u001d\u0010c\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bc\u0010\u000b\u001a\u0004\bd\u0010\rR\u001a\u0010e\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\u0014\u001a\u0004\bf\u0010\u0016R\u001a\u0010g\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u001d\u0010i\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bi\u0010\u000b\u001a\u0004\bj\u0010\rR\u001d\u0010k\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bk\u0010\u000b\u001a\u0004\bl\u0010\rR\u001d\u0010m\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bm\u0010\u000b\u001a\u0004\bn\u0010\rR\u001a\u0010o\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010\u0014\u001a\u0004\bp\u0010\u0016R\u001a\u0010q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\bR\u001d\u0010s\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bs\u0010\u000b\u001a\u0004\bt\u0010\rR\u001d\u0010u\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bu\u0010\u000b\u001a\u0004\bv\u0010\rR\u001d\u0010w\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bw\u0010\u000b\u001a\u0004\bx\u0010\rR\u001a\u0010y\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010\u0014\u001a\u0004\bz\u0010\u0016R\u001a\u0010{\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR\u001d\u0010}\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b}\u0010\u000b\u001a\u0004\b~\u0010\rR\u001e\u0010\u007f\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\r\n\u0004\b\u007f\u0010\u000b\u001a\u0005\b\u0080\u0001\u0010\rR \u0010\u0081\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u000b\u001a\u0005\b\u0082\u0001\u0010\rR\u001d\u0010\u0083\u0001\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0014\u001a\u0005\b\u0084\u0001\u0010\u0016R\u001d\u0010\u0085\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0006\u001a\u0005\b\u0086\u0001\u0010\bR \u0010\u0087\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u000b\u001a\u0005\b\u0088\u0001\u0010\rR \u0010\u0089\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u000b\u001a\u0005\b\u008a\u0001\u0010\rR \u0010\u008b\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u000b\u001a\u0005\b\u008c\u0001\u0010\rR\u001d\u0010\u008d\u0001\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0014\u001a\u0005\b\u008e\u0001\u0010\u0016R\u001d\u0010\u008f\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0006\u001a\u0005\b\u0090\u0001\u0010\bR \u0010\u0091\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u000b\u001a\u0005\b\u0092\u0001\u0010\rR \u0010\u0093\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u000b\u001a\u0005\b\u0094\u0001\u0010\rR \u0010\u0095\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u000b\u001a\u0005\b\u0096\u0001\u0010\rR\u001d\u0010\u0097\u0001\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0014\u001a\u0005\b\u0098\u0001\u0010\u0016R\u001d\u0010\u0099\u0001\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR \u0010\u009b\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u000b\u001a\u0005\b\u009c\u0001\u0010\rR \u0010\u009d\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u000b\u001a\u0005\b\u009e\u0001\u0010\rR \u0010\u009f\u0001\u001a\u00020\t8\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u000b\u001a\u0005\b \u0001\u0010\rR\u001d\u0010¡\u0001\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0014\u001a\u0005\b¢\u0001\u0010\u0016\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/material3/tokens/TypeScaleTokens;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/GenericFontFamily;", "BodyLargeFont", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBodyLargeFont", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Landroidx/compose/ui/unit/TextUnit;", "BodyLargeLineHeight", "J", "getBodyLargeLineHeight-XSAIIZE", "()J", "BodyLargeSize", "getBodyLargeSize-XSAIIZE", "BodyLargeTracking", "getBodyLargeTracking-XSAIIZE", "Landroidx/compose/ui/text/font/FontWeight;", "BodyLargeWeight", "Landroidx/compose/ui/text/font/FontWeight;", "getBodyLargeWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "BodyMediumFont", "getBodyMediumFont", "BodyMediumLineHeight", "getBodyMediumLineHeight-XSAIIZE", "BodyMediumSize", "getBodyMediumSize-XSAIIZE", "BodyMediumTracking", "getBodyMediumTracking-XSAIIZE", "BodyMediumWeight", "getBodyMediumWeight", "BodySmallFont", "getBodySmallFont", "BodySmallLineHeight", "getBodySmallLineHeight-XSAIIZE", "BodySmallSize", "getBodySmallSize-XSAIIZE", "BodySmallTracking", "getBodySmallTracking-XSAIIZE", "BodySmallWeight", "getBodySmallWeight", "DisplayLargeFont", "getDisplayLargeFont", "DisplayLargeLineHeight", "getDisplayLargeLineHeight-XSAIIZE", "DisplayLargeSize", "getDisplayLargeSize-XSAIIZE", "DisplayLargeTracking", "getDisplayLargeTracking-XSAIIZE", "DisplayLargeWeight", "getDisplayLargeWeight", "DisplayMediumFont", "getDisplayMediumFont", "DisplayMediumLineHeight", "getDisplayMediumLineHeight-XSAIIZE", "DisplayMediumSize", "getDisplayMediumSize-XSAIIZE", "DisplayMediumTracking", "getDisplayMediumTracking-XSAIIZE", "DisplayMediumWeight", "getDisplayMediumWeight", "DisplaySmallFont", "getDisplaySmallFont", "DisplaySmallLineHeight", "getDisplaySmallLineHeight-XSAIIZE", "DisplaySmallSize", "getDisplaySmallSize-XSAIIZE", "DisplaySmallTracking", "getDisplaySmallTracking-XSAIIZE", "DisplaySmallWeight", "getDisplaySmallWeight", "HeadlineLargeFont", "getHeadlineLargeFont", "HeadlineLargeLineHeight", "getHeadlineLargeLineHeight-XSAIIZE", "HeadlineLargeSize", "getHeadlineLargeSize-XSAIIZE", "HeadlineLargeTracking", "getHeadlineLargeTracking-XSAIIZE", "HeadlineLargeWeight", "getHeadlineLargeWeight", "HeadlineMediumFont", "getHeadlineMediumFont", "HeadlineMediumLineHeight", "getHeadlineMediumLineHeight-XSAIIZE", "HeadlineMediumSize", "getHeadlineMediumSize-XSAIIZE", "HeadlineMediumTracking", "getHeadlineMediumTracking-XSAIIZE", "HeadlineMediumWeight", "getHeadlineMediumWeight", "HeadlineSmallFont", "getHeadlineSmallFont", "HeadlineSmallLineHeight", "getHeadlineSmallLineHeight-XSAIIZE", "HeadlineSmallSize", "getHeadlineSmallSize-XSAIIZE", "HeadlineSmallTracking", "getHeadlineSmallTracking-XSAIIZE", "HeadlineSmallWeight", "getHeadlineSmallWeight", "LabelLargeFont", "getLabelLargeFont", "LabelLargeLineHeight", "getLabelLargeLineHeight-XSAIIZE", "LabelLargeSize", "getLabelLargeSize-XSAIIZE", "LabelLargeTracking", "getLabelLargeTracking-XSAIIZE", "LabelLargeWeight", "getLabelLargeWeight", "LabelMediumFont", "getLabelMediumFont", "LabelMediumLineHeight", "getLabelMediumLineHeight-XSAIIZE", "LabelMediumSize", "getLabelMediumSize-XSAIIZE", "LabelMediumTracking", "getLabelMediumTracking-XSAIIZE", "LabelMediumWeight", "getLabelMediumWeight", "LabelSmallFont", "getLabelSmallFont", "LabelSmallLineHeight", "getLabelSmallLineHeight-XSAIIZE", "LabelSmallSize", "getLabelSmallSize-XSAIIZE", "LabelSmallTracking", "getLabelSmallTracking-XSAIIZE", "LabelSmallWeight", "getLabelSmallWeight", "TitleLargeFont", "getTitleLargeFont", "TitleLargeLineHeight", "getTitleLargeLineHeight-XSAIIZE", "TitleLargeSize", "getTitleLargeSize-XSAIIZE", "TitleLargeTracking", "getTitleLargeTracking-XSAIIZE", "TitleLargeWeight", "getTitleLargeWeight", "TitleMediumFont", "getTitleMediumFont", "TitleMediumLineHeight", "getTitleMediumLineHeight-XSAIIZE", "TitleMediumSize", "getTitleMediumSize-XSAIIZE", "TitleMediumTracking", "getTitleMediumTracking-XSAIIZE", "TitleMediumWeight", "getTitleMediumWeight", "TitleSmallFont", "getTitleSmallFont", "TitleSmallLineHeight", "getTitleSmallLineHeight-XSAIIZE", "TitleSmallSize", "getTitleSmallSize-XSAIIZE", "TitleSmallTracking", "getTitleSmallTracking-XSAIIZE", "TitleSmallWeight", "getTitleSmallWeight"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypeScaleTokens {
    public static final int $stable = 0;
    private static final long DisplayLargeTracking;
    private static final FontWeight DisplayLargeWeight;
    private static final GenericFontFamily DisplayMediumFont;
    private static final long DisplayMediumLineHeight;
    private static final long DisplayMediumSize;
    private static final long DisplayMediumTracking;
    private static final FontWeight DisplayMediumWeight;
    private static final GenericFontFamily DisplaySmallFont;
    private static final long DisplaySmallLineHeight;
    private static final long DisplaySmallSize;
    private static final long DisplaySmallTracking;
    private static final FontWeight DisplaySmallWeight;
    private static final GenericFontFamily HeadlineLargeFont;
    private static final long HeadlineLargeLineHeight;
    private static final long HeadlineLargeSize;
    private static final long HeadlineLargeTracking;
    private static final FontWeight HeadlineLargeWeight;
    private static final GenericFontFamily HeadlineMediumFont;
    private static final long HeadlineMediumLineHeight;
    private static final long HeadlineMediumSize;
    private static final long HeadlineMediumTracking;
    private static final FontWeight HeadlineMediumWeight;
    private static final GenericFontFamily HeadlineSmallFont;
    private static final long HeadlineSmallLineHeight;
    private static final long HeadlineSmallSize;
    private static final long HeadlineSmallTracking;
    private static final FontWeight HeadlineSmallWeight;
    private static final GenericFontFamily LabelLargeFont;
    private static final long LabelLargeLineHeight;
    private static final long LabelLargeSize;
    private static final long LabelLargeTracking;
    private static final FontWeight LabelLargeWeight;
    private static final GenericFontFamily LabelMediumFont;
    private static final long LabelMediumLineHeight;
    private static final long LabelMediumSize;
    private static final long LabelMediumTracking;
    private static final FontWeight LabelMediumWeight;
    private static final GenericFontFamily LabelSmallFont;
    private static final long LabelSmallLineHeight;
    private static final long LabelSmallSize;
    private static final long LabelSmallTracking;
    private static final FontWeight LabelSmallWeight;
    private static final GenericFontFamily TitleLargeFont;
    private static final long TitleLargeLineHeight;
    private static final long TitleLargeSize;
    private static final long TitleLargeTracking;
    private static final FontWeight TitleLargeWeight;
    private static final GenericFontFamily TitleMediumFont;
    private static final long TitleMediumLineHeight;
    private static final long TitleMediumSize;
    private static final long TitleMediumTracking;
    private static final FontWeight TitleMediumWeight;
    private static final GenericFontFamily TitleSmallFont;
    private static final long TitleSmallLineHeight;
    private static final long TitleSmallSize;
    private static final long TitleSmallTracking;
    private static final FontWeight TitleSmallWeight;
    public static final TypeScaleTokens INSTANCE = new TypeScaleTokens();
    private static final GenericFontFamily BodyLargeFont = TypefaceTokens.INSTANCE.getPlain();
    private static final long BodyLargeLineHeight = TextUnitKt.getSp(24.0d);
    private static final long BodyLargeSize = TextUnitKt.getSp(16);
    private static final long BodyLargeTracking = TextUnitKt.getSp(0.5d);
    private static final FontWeight BodyLargeWeight = TypefaceTokens.INSTANCE.getWeightRegular();
    private static final GenericFontFamily BodyMediumFont = TypefaceTokens.INSTANCE.getPlain();
    private static final long BodyMediumLineHeight = TextUnitKt.getSp(20.0d);
    private static final long BodyMediumSize = TextUnitKt.getSp(14);
    private static final long BodyMediumTracking = TextUnitKt.getSp(0.2d);
    private static final FontWeight BodyMediumWeight = TypefaceTokens.INSTANCE.getWeightRegular();
    private static final GenericFontFamily BodySmallFont = TypefaceTokens.INSTANCE.getPlain();
    private static final long BodySmallLineHeight = TextUnitKt.getSp(16.0d);
    private static final long BodySmallSize = TextUnitKt.getSp(12);
    private static final long BodySmallTracking = TextUnitKt.getSp(0.4d);
    private static final FontWeight BodySmallWeight = TypefaceTokens.INSTANCE.getWeightRegular();
    private static final GenericFontFamily DisplayLargeFont = TypefaceTokens.INSTANCE.getBrand();
    private static final long DisplayLargeLineHeight = TextUnitKt.getSp(64.0d);
    private static final long DisplayLargeSize = TextUnitKt.getSp(57);

    private TypeScaleTokens() {
    }

    static {
        long sp = TextUnitKt.getSp(0.2d);
        TextUnitKt.m7142checkArithmeticR2X_6o(sp);
        DisplayLargeTracking = TextUnitKt.pack(TextUnit.m7127getRawTypeimpl(sp), -TextUnit.m7129getValueimpl(sp));
        DisplayLargeWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        DisplayMediumFont = TypefaceTokens.INSTANCE.getBrand();
        DisplayMediumLineHeight = TextUnitKt.getSp(52.0d);
        DisplayMediumSize = TextUnitKt.getSp(45);
        DisplayMediumTracking = TextUnitKt.getSp(0.0d);
        DisplayMediumWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        DisplaySmallFont = TypefaceTokens.INSTANCE.getBrand();
        DisplaySmallLineHeight = TextUnitKt.getSp(44.0d);
        DisplaySmallSize = TextUnitKt.getSp(36);
        DisplaySmallTracking = TextUnitKt.getSp(0.0d);
        DisplaySmallWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        HeadlineLargeFont = TypefaceTokens.INSTANCE.getBrand();
        HeadlineLargeLineHeight = TextUnitKt.getSp(40.0d);
        HeadlineLargeSize = TextUnitKt.getSp(32);
        HeadlineLargeTracking = TextUnitKt.getSp(0.0d);
        HeadlineLargeWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        HeadlineMediumFont = TypefaceTokens.INSTANCE.getBrand();
        HeadlineMediumLineHeight = TextUnitKt.getSp(36.0d);
        HeadlineMediumSize = TextUnitKt.getSp(28);
        HeadlineMediumTracking = TextUnitKt.getSp(0.0d);
        HeadlineMediumWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        HeadlineSmallFont = TypefaceTokens.INSTANCE.getBrand();
        HeadlineSmallLineHeight = TextUnitKt.getSp(32.0d);
        HeadlineSmallSize = TextUnitKt.getSp(24);
        HeadlineSmallTracking = TextUnitKt.getSp(0.0d);
        HeadlineSmallWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        LabelLargeFont = TypefaceTokens.INSTANCE.getPlain();
        LabelLargeLineHeight = TextUnitKt.getSp(20.0d);
        LabelLargeSize = TextUnitKt.getSp(14);
        LabelLargeTracking = TextUnitKt.getSp(0.1d);
        LabelLargeWeight = TypefaceTokens.INSTANCE.getWeightMedium();
        LabelMediumFont = TypefaceTokens.INSTANCE.getPlain();
        LabelMediumLineHeight = TextUnitKt.getSp(16.0d);
        LabelMediumSize = TextUnitKt.getSp(12);
        LabelMediumTracking = TextUnitKt.getSp(0.5d);
        LabelMediumWeight = TypefaceTokens.INSTANCE.getWeightMedium();
        LabelSmallFont = TypefaceTokens.INSTANCE.getPlain();
        LabelSmallLineHeight = TextUnitKt.getSp(16.0d);
        LabelSmallSize = TextUnitKt.getSp(11);
        LabelSmallTracking = TextUnitKt.getSp(0.5d);
        LabelSmallWeight = TypefaceTokens.INSTANCE.getWeightMedium();
        TitleLargeFont = TypefaceTokens.INSTANCE.getBrand();
        TitleLargeLineHeight = TextUnitKt.getSp(28.0d);
        TitleLargeSize = TextUnitKt.getSp(22);
        TitleLargeTracking = TextUnitKt.getSp(0.0d);
        TitleLargeWeight = TypefaceTokens.INSTANCE.getWeightRegular();
        TitleMediumFont = TypefaceTokens.INSTANCE.getPlain();
        TitleMediumLineHeight = TextUnitKt.getSp(24.0d);
        TitleMediumSize = TextUnitKt.getSp(16);
        TitleMediumTracking = TextUnitKt.getSp(0.2d);
        TitleMediumWeight = TypefaceTokens.INSTANCE.getWeightMedium();
        TitleSmallFont = TypefaceTokens.INSTANCE.getPlain();
        TitleSmallLineHeight = TextUnitKt.getSp(20.0d);
        TitleSmallSize = TextUnitKt.getSp(14);
        TitleSmallTracking = TextUnitKt.getSp(0.1d);
        TitleSmallWeight = TypefaceTokens.INSTANCE.getWeightMedium();
    }

    public final GenericFontFamily getBodyLargeFont() {
        return BodyLargeFont;
    }

    /* JADX INFO: renamed from: getBodyLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3395getBodyLargeLineHeightXSAIIZE() {
        return BodyLargeLineHeight;
    }

    /* JADX INFO: renamed from: getBodyLargeSize-XSAIIZE, reason: not valid java name */
    public final long m3396getBodyLargeSizeXSAIIZE() {
        return BodyLargeSize;
    }

    /* JADX INFO: renamed from: getBodyLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m3397getBodyLargeTrackingXSAIIZE() {
        return BodyLargeTracking;
    }

    public final FontWeight getBodyLargeWeight() {
        return BodyLargeWeight;
    }

    public final GenericFontFamily getBodyMediumFont() {
        return BodyMediumFont;
    }

    /* JADX INFO: renamed from: getBodyMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3398getBodyMediumLineHeightXSAIIZE() {
        return BodyMediumLineHeight;
    }

    /* JADX INFO: renamed from: getBodyMediumSize-XSAIIZE, reason: not valid java name */
    public final long m3399getBodyMediumSizeXSAIIZE() {
        return BodyMediumSize;
    }

    /* JADX INFO: renamed from: getBodyMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m3400getBodyMediumTrackingXSAIIZE() {
        return BodyMediumTracking;
    }

    public final FontWeight getBodyMediumWeight() {
        return BodyMediumWeight;
    }

    public final GenericFontFamily getBodySmallFont() {
        return BodySmallFont;
    }

    /* JADX INFO: renamed from: getBodySmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3401getBodySmallLineHeightXSAIIZE() {
        return BodySmallLineHeight;
    }

    /* JADX INFO: renamed from: getBodySmallSize-XSAIIZE, reason: not valid java name */
    public final long m3402getBodySmallSizeXSAIIZE() {
        return BodySmallSize;
    }

    /* JADX INFO: renamed from: getBodySmallTracking-XSAIIZE, reason: not valid java name */
    public final long m3403getBodySmallTrackingXSAIIZE() {
        return BodySmallTracking;
    }

    public final FontWeight getBodySmallWeight() {
        return BodySmallWeight;
    }

    public final GenericFontFamily getDisplayLargeFont() {
        return DisplayLargeFont;
    }

    /* JADX INFO: renamed from: getDisplayLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3404getDisplayLargeLineHeightXSAIIZE() {
        return DisplayLargeLineHeight;
    }

    /* JADX INFO: renamed from: getDisplayLargeSize-XSAIIZE, reason: not valid java name */
    public final long m3405getDisplayLargeSizeXSAIIZE() {
        return DisplayLargeSize;
    }

    /* JADX INFO: renamed from: getDisplayLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m3406getDisplayLargeTrackingXSAIIZE() {
        return DisplayLargeTracking;
    }

    public final FontWeight getDisplayLargeWeight() {
        return DisplayLargeWeight;
    }

    public final GenericFontFamily getDisplayMediumFont() {
        return DisplayMediumFont;
    }

    /* JADX INFO: renamed from: getDisplayMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3407getDisplayMediumLineHeightXSAIIZE() {
        return DisplayMediumLineHeight;
    }

    /* JADX INFO: renamed from: getDisplayMediumSize-XSAIIZE, reason: not valid java name */
    public final long m3408getDisplayMediumSizeXSAIIZE() {
        return DisplayMediumSize;
    }

    /* JADX INFO: renamed from: getDisplayMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m3409getDisplayMediumTrackingXSAIIZE() {
        return DisplayMediumTracking;
    }

    public final FontWeight getDisplayMediumWeight() {
        return DisplayMediumWeight;
    }

    public final GenericFontFamily getDisplaySmallFont() {
        return DisplaySmallFont;
    }

    /* JADX INFO: renamed from: getDisplaySmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3410getDisplaySmallLineHeightXSAIIZE() {
        return DisplaySmallLineHeight;
    }

    /* JADX INFO: renamed from: getDisplaySmallSize-XSAIIZE, reason: not valid java name */
    public final long m3411getDisplaySmallSizeXSAIIZE() {
        return DisplaySmallSize;
    }

    /* JADX INFO: renamed from: getDisplaySmallTracking-XSAIIZE, reason: not valid java name */
    public final long m3412getDisplaySmallTrackingXSAIIZE() {
        return DisplaySmallTracking;
    }

    public final FontWeight getDisplaySmallWeight() {
        return DisplaySmallWeight;
    }

    public final GenericFontFamily getHeadlineLargeFont() {
        return HeadlineLargeFont;
    }

    /* JADX INFO: renamed from: getHeadlineLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3413getHeadlineLargeLineHeightXSAIIZE() {
        return HeadlineLargeLineHeight;
    }

    /* JADX INFO: renamed from: getHeadlineLargeSize-XSAIIZE, reason: not valid java name */
    public final long m3414getHeadlineLargeSizeXSAIIZE() {
        return HeadlineLargeSize;
    }

    /* JADX INFO: renamed from: getHeadlineLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m3415getHeadlineLargeTrackingXSAIIZE() {
        return HeadlineLargeTracking;
    }

    public final FontWeight getHeadlineLargeWeight() {
        return HeadlineLargeWeight;
    }

    public final GenericFontFamily getHeadlineMediumFont() {
        return HeadlineMediumFont;
    }

    /* JADX INFO: renamed from: getHeadlineMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3416getHeadlineMediumLineHeightXSAIIZE() {
        return HeadlineMediumLineHeight;
    }

    /* JADX INFO: renamed from: getHeadlineMediumSize-XSAIIZE, reason: not valid java name */
    public final long m3417getHeadlineMediumSizeXSAIIZE() {
        return HeadlineMediumSize;
    }

    /* JADX INFO: renamed from: getHeadlineMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m3418getHeadlineMediumTrackingXSAIIZE() {
        return HeadlineMediumTracking;
    }

    public final FontWeight getHeadlineMediumWeight() {
        return HeadlineMediumWeight;
    }

    public final GenericFontFamily getHeadlineSmallFont() {
        return HeadlineSmallFont;
    }

    /* JADX INFO: renamed from: getHeadlineSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3419getHeadlineSmallLineHeightXSAIIZE() {
        return HeadlineSmallLineHeight;
    }

    /* JADX INFO: renamed from: getHeadlineSmallSize-XSAIIZE, reason: not valid java name */
    public final long m3420getHeadlineSmallSizeXSAIIZE() {
        return HeadlineSmallSize;
    }

    /* JADX INFO: renamed from: getHeadlineSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m3421getHeadlineSmallTrackingXSAIIZE() {
        return HeadlineSmallTracking;
    }

    public final FontWeight getHeadlineSmallWeight() {
        return HeadlineSmallWeight;
    }

    public final GenericFontFamily getLabelLargeFont() {
        return LabelLargeFont;
    }

    /* JADX INFO: renamed from: getLabelLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3422getLabelLargeLineHeightXSAIIZE() {
        return LabelLargeLineHeight;
    }

    /* JADX INFO: renamed from: getLabelLargeSize-XSAIIZE, reason: not valid java name */
    public final long m3423getLabelLargeSizeXSAIIZE() {
        return LabelLargeSize;
    }

    /* JADX INFO: renamed from: getLabelLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m3424getLabelLargeTrackingXSAIIZE() {
        return LabelLargeTracking;
    }

    public final FontWeight getLabelLargeWeight() {
        return LabelLargeWeight;
    }

    public final GenericFontFamily getLabelMediumFont() {
        return LabelMediumFont;
    }

    /* JADX INFO: renamed from: getLabelMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3425getLabelMediumLineHeightXSAIIZE() {
        return LabelMediumLineHeight;
    }

    /* JADX INFO: renamed from: getLabelMediumSize-XSAIIZE, reason: not valid java name */
    public final long m3426getLabelMediumSizeXSAIIZE() {
        return LabelMediumSize;
    }

    /* JADX INFO: renamed from: getLabelMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m3427getLabelMediumTrackingXSAIIZE() {
        return LabelMediumTracking;
    }

    public final FontWeight getLabelMediumWeight() {
        return LabelMediumWeight;
    }

    public final GenericFontFamily getLabelSmallFont() {
        return LabelSmallFont;
    }

    /* JADX INFO: renamed from: getLabelSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3428getLabelSmallLineHeightXSAIIZE() {
        return LabelSmallLineHeight;
    }

    /* JADX INFO: renamed from: getLabelSmallSize-XSAIIZE, reason: not valid java name */
    public final long m3429getLabelSmallSizeXSAIIZE() {
        return LabelSmallSize;
    }

    /* JADX INFO: renamed from: getLabelSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m3430getLabelSmallTrackingXSAIIZE() {
        return LabelSmallTracking;
    }

    public final FontWeight getLabelSmallWeight() {
        return LabelSmallWeight;
    }

    public final GenericFontFamily getTitleLargeFont() {
        return TitleLargeFont;
    }

    /* JADX INFO: renamed from: getTitleLargeLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3431getTitleLargeLineHeightXSAIIZE() {
        return TitleLargeLineHeight;
    }

    /* JADX INFO: renamed from: getTitleLargeSize-XSAIIZE, reason: not valid java name */
    public final long m3432getTitleLargeSizeXSAIIZE() {
        return TitleLargeSize;
    }

    /* JADX INFO: renamed from: getTitleLargeTracking-XSAIIZE, reason: not valid java name */
    public final long m3433getTitleLargeTrackingXSAIIZE() {
        return TitleLargeTracking;
    }

    public final FontWeight getTitleLargeWeight() {
        return TitleLargeWeight;
    }

    public final GenericFontFamily getTitleMediumFont() {
        return TitleMediumFont;
    }

    /* JADX INFO: renamed from: getTitleMediumLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3434getTitleMediumLineHeightXSAIIZE() {
        return TitleMediumLineHeight;
    }

    /* JADX INFO: renamed from: getTitleMediumSize-XSAIIZE, reason: not valid java name */
    public final long m3435getTitleMediumSizeXSAIIZE() {
        return TitleMediumSize;
    }

    /* JADX INFO: renamed from: getTitleMediumTracking-XSAIIZE, reason: not valid java name */
    public final long m3436getTitleMediumTrackingXSAIIZE() {
        return TitleMediumTracking;
    }

    public final FontWeight getTitleMediumWeight() {
        return TitleMediumWeight;
    }

    public final GenericFontFamily getTitleSmallFont() {
        return TitleSmallFont;
    }

    /* JADX INFO: renamed from: getTitleSmallLineHeight-XSAIIZE, reason: not valid java name */
    public final long m3437getTitleSmallLineHeightXSAIIZE() {
        return TitleSmallLineHeight;
    }

    /* JADX INFO: renamed from: getTitleSmallSize-XSAIIZE, reason: not valid java name */
    public final long m3438getTitleSmallSizeXSAIIZE() {
        return TitleSmallSize;
    }

    /* JADX INFO: renamed from: getTitleSmallTracking-XSAIIZE, reason: not valid java name */
    public final long m3439getTitleSmallTrackingXSAIIZE() {
        return TitleSmallTracking;
    }

    public final FontWeight getTitleSmallWeight() {
        return TitleSmallWeight;
    }
}
