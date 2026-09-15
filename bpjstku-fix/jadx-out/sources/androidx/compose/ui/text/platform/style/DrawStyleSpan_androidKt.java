package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/StrokeJoin;", "Landroid/graphics/Paint$Join;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "toAndroidJoin", "Landroidx/compose/ui/graphics/StrokeCap;", "Landroid/graphics/Paint$Cap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidCap"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DrawStyleSpan_androidKt {
    /* JADX INFO: renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m6688toAndroidJoinWw9F2mQ(int i) {
        if (StrokeJoin.m4595equalsimpl0(i, StrokeJoin.INSTANCE.m4600getMiterLxFBmk8())) {
            return Paint.Join.MITER;
        }
        if (StrokeJoin.m4595equalsimpl0(i, StrokeJoin.INSTANCE.m4601getRoundLxFBmk8())) {
            return Paint.Join.ROUND;
        }
        return StrokeJoin.m4595equalsimpl0(i, StrokeJoin.INSTANCE.m4599getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* JADX INFO: renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m6687toAndroidCapBeK7IIE(int i) {
        if (StrokeCap.m4585equalsimpl0(i, StrokeCap.INSTANCE.m4589getButtKaPHkGw())) {
            return Paint.Cap.BUTT;
        }
        if (StrokeCap.m4585equalsimpl0(i, StrokeCap.INSTANCE.m4590getRoundKaPHkGw())) {
            return Paint.Cap.ROUND;
        }
        return StrokeCap.m4585equalsimpl0(i, StrokeCap.INSTANCE.m4591getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
