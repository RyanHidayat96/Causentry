package androidx.compose.ui.text.android;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J+\u0010!\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0013H\u0017¢\u0006\u0004\b!\u0010\"J#\u0010!\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010#JA\u0010!\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010'\u001a\u00020\u0013H\u0017¢\u0006\u0004\b!\u0010(J9\u0010!\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010)J)\u0010*\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010*\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010,J?\u0010*\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013H\u0017¢\u0006\u0004\b*\u0010-J7\u0010*\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010.J\u000f\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u0010\u0015J\u0017\u00101\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u0010\u0019J\u001f\u00102\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$H\u0016¢\u0006\u0004\b7\u00103J\u0019\u00109\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u000208H\u0017¢\u0006\u0004\b<\u0010:J\u001f\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J\u001f\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010@J\u0017\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001dH\u0016¢\u0006\u0004\b>\u0010AJ\u0017\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010\u000bJ7\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010BJ/\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b>\u0010CJ/\u0010>\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b>\u0010DJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001dH\u0017¢\u0006\u0004\bE\u0010AJ\u0017\u0010E\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\bH\u0017¢\u0006\u0004\bE\u0010\u000bJ/\u0010E\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\bE\u0010CJ/\u0010E\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0017¢\u0006\u0004\bE\u0010DJ\u001f\u0010G\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020=H\u0017¢\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010IJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020FH\u0017¢\u0006\u0004\bJ\u0010IJ\u0011\u0010L\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010N\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020PH\u0017¢\u0006\u0004\bQ\u0010RJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u001dH\u0017¢\u0006\u0004\bQ\u0010AJ\u001f\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020PH\u0017¢\u0006\u0004\bQ\u0010SJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020FH\u0017¢\u0006\u0004\bQ\u0010IJ7\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020PH\u0017¢\u0006\u0004\bQ\u0010TJ/\u0010Q\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\bQ\u0010CJ\u0017\u0010V\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010V\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020U2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\bV\u0010XJ\u001f\u0010V\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020U2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\bV\u0010YJ7\u0010Z\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\bZ\u0010[JO\u0010Z\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020\t2\u0006\u0010]\u001a\u00020\u001eH\u0016¢\u0006\u0004\bZ\u0010^J/\u0010_\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b_\u0010`J1\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\ba\u0010bJ3\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\ba\u0010cJ3\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\ba\u0010dJY\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\t2\b\u0010f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\ba\u0010gJY\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\t2\b\u0010f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\ba\u0010hJ)\u0010a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u001f\u001a\u0002082\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\ba\u0010iJS\u0010k\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020j2\u0006\u0010&\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010e2\u0006\u0010\\\u001a\u00020\u00132\b\u0010]\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\bk\u0010lJ/\u0010m\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0013H\u0016¢\u0006\u0004\bo\u0010\u0019J\u0017\u0010o\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020pH\u0017¢\u0006\u0004\bo\u0010qJ\u001f\u0010o\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020rH\u0016¢\u0006\u0004\bo\u0010sJ\u001f\u0010o\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020tH\u0017¢\u0006\u0004\bo\u0010uJ\u001f\u0010o\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020p2\u0006\u0010\u001f\u001a\u00020tH\u0017¢\u0006\u0004\bo\u0010vJ7\u0010w\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\bw\u0010xJ/\u0010y\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020j2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010y\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020j2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\by\u0010{J\u001f\u0010|\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b|\u0010}J7\u0010|\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\b|\u0010xJ\u0017\u0010~\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001eH\u0016¢\u0006\u0004\b~\u0010\u007fJ-\u0010\u0081\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u0080\u00012\u0006\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J-\u0010\u0081\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u0080\u00012\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\"\u0010\u0084\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J*\u0010\u0086\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J3\u0010\u0088\u0001\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010j2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u0088\u0001\u0010zJ!\u0010\u0088\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020j2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u0088\u0001\u0010{J;\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u0089\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020j2\u0006\u0010&\u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J+\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u008c\u00012\u0006\u0010\u001f\u001a\u00020j2\u0006\u0010 \u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008d\u0001J!\u0010\u008e\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u008e\u0001\u0010}J\"\u0010\u008e\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J9\u0010\u008e\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0005\b\u008e\u0001\u0010xJ*\u0010\u0090\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J2\u0010\u0092\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001JJ\u0010\u0092\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0094\u0001JJ\u0010\u0095\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J:\u0010\u0095\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020j2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010%\u001a\u00020j2\u0006\u0010&\u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001JK\u0010\u0099\u0001\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020e2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020j2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0007\u0010'\u001a\u00030\u0098\u00012\u0006\u0010\\\u001a\u00020\u001eH\u0017¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001JC\u0010\u009b\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u0089\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J3\u0010\u009b\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u008c\u00012\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009d\u0001JC\u0010\u009b\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u008c\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009e\u0001JC\u0010\u009b\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u009f\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u009b\u0001\u0010 \u0001JK\u0010¡\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u0089\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020F2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J;\u0010¡\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u008c\u00012\u0006\u0010\u001f\u001a\u00020F2\u0006\u0010 \u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¡\u0001\u0010£\u0001J[\u0010¤\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u0089\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020$2\u0006\u0010]\u001a\u00020\t2\u0006\u0010f\u001a\u00020\u001eH\u0017¢\u0006\u0006\b¤\u0001\u0010¥\u0001J[\u0010¤\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030\u009f\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020$2\u0006\u0010]\u001a\u00020\t2\u0006\u0010f\u001a\u00020\u001eH\u0017¢\u0006\u0006\b¤\u0001\u0010¦\u0001J[\u0010¤\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030§\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020$2\u0006\u0010\\\u001a\u00020$2\u0006\u0010]\u001a\u00020\t2\u0006\u0010f\u001a\u00020\u001eH\u0017¢\u0006\u0006\b¤\u0001\u0010¨\u0001J}\u0010®\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030©\u00012\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020j2\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010j2\u0006\u0010'\u001a\u00020\u00132\b\u0010\\\u001a\u0004\u0018\u00010e2\u0006\u0010]\u001a\u00020\u00132\t\u0010f\u001a\u0005\u0018\u00010ª\u00012\u0007\u0010«\u0001\u001a\u00020\u00132\u0007\u0010¬\u0001\u001a\u00020\u00132\u0007\u0010\u00ad\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001b\u0010±\u0001\u001a\u00020\u00052\u0007\u0010\u0004\u001a\u00030°\u0001H\u0017¢\u0006\u0006\b±\u0001\u0010²\u0001R\u0019\u0010³\u0001\u001a\u00020\u00018\u0002@\u0002X\u0083.¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextAndroidCanvas;", "Landroid/graphics/Canvas;", "<init>", "()V", "p0", "", "setCanvas", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "p1", "p2", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "p3", "p4", "p5", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "restoreToCount", "translate", "(FF)V", "scale", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "getMatrix", "Landroid/graphics/Region$Op;", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "drawPicture", "(Landroid/graphics/Picture;)V", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "p6", "p7", "(FFFFFFZLandroid/graphics/Paint;)V", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "p8", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "Landroid/graphics/fonts/Font;", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "", "p9", "p10", "p11", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "nativeCanvas", "Landroid/graphics/Canvas;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextAndroidCanvas extends Canvas {
    public static final int $stable = 8;
    private Canvas nativeCanvas;

    public final void setCanvas(Canvas p0) {
        this.nativeCanvas = p0;
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(p0);
        if (clipBounds) {
            p0.set(0, 0, p0.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.setBitmap(p0);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.enableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.disableZ(canvas);
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getWidth();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.setDensity(p0);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayer(RectF p0, Paint p1, int p2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayer(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayer(p0, p1);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayer(float p0, float p1, float p2, float p3, Paint p4, int p5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayer(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float p0, float p1, float p2, float p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayer(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayerAlpha(RectF p0, int p1, int p2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayerAlpha(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF p0, int p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayerAlpha(p0, p1);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final int saveLayerAlpha(float p0, float p1, float p2, float p3, int p4, int p5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayerAlpha(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float p0, float p1, float p2, float p3, int p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.saveLayerAlpha(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.restoreToCount(p0);
    }

    @Override // android.graphics.Canvas
    public final void translate(float p0, float p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.translate(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void scale(float p0, float p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.scale(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.rotate(p0);
    }

    @Override // android.graphics.Canvas
    public final void skew(float p0, float p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.skew(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.concat(p0);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.setMatrix(p0);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void getMatrix(Matrix p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.getMatrix(p0);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(RectF p0, Region.Op p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(Rect p0, Region.Op p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipRect(float p0, float p1, float p2, float p3, Region.Op p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float p0, float p1, float p2, float p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int p0, int p1, int p2, int p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipRect(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF p0) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect p0) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float p0, float p1, float p2, float p3) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int p0, int p1, int p2, int p3) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatO.clipOutRect(canvas, p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean clipPath(Path p0, Region.Op p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipPath(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.clipPath(p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path p0) {
        CanvasCompatO canvasCompatO = CanvasCompatO.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatO.clipOutPath(canvas, p0);
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.setDrawFilter(p0);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(RectF p0, Canvas.EdgeType p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.quickReject(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF p0) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, p0);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(Path p0, Canvas.EdgeType p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.quickReject(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path p0) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, p0);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final boolean quickReject(float p0, float p1, float p2, float p3, Canvas.EdgeType p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvas.quickReject(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float p0, float p1, float p2, float p3) {
        CanvasCompatR canvasCompatR = CanvasCompatR.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        return canvasCompatR.quickReject(canvas, p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPicture(p0);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture p0, RectF p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPicture(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture p0, Rect p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPicture(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF p0, float p1, float p2, boolean p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawArc(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, Paint p7) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawArc(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int p0, int p1, int p2, int p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawARGB(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, float p1, float p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmap(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, Rect p1, RectF p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmap(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, Rect p1, Rect p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmap(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawBitmap(int[] p0, int p1, int p2, float p3, float p4, int p5, int p6, boolean p7, Paint p8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmap(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawBitmap(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, Paint p8) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmap(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, Matrix p1, Paint p2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmap(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap p0, int p1, int p2, float[] p3, int p4, int[] p5, int p6, Paint p7) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawBitmapMesh(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float p0, float p1, float p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawCircle(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawColor(p0);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long p0) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, p0);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int p0, PorterDuff.Mode p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawColor(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int p0, BlendMode p1) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long p0, BlendMode p1) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawColor(canvas, p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float p0, float p1, float p2, float p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawLine(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] p0, int p1, int p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawLines(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawLines(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawOval(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float p0, float p1, float p2, float p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawOval(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint p0) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPaint(p0);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch p0, Rect p1, Paint p2) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch p0, RectF p1, Paint p2) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatS.drawPatch(canvas, p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPath(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float p0, float p1, Paint p2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPoint(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] p0, int p1, int p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPoints(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPoints(p0, p1);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawPosText(char[] p0, int p1, int p2, float[] p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPosText(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    @Deprecated(message = "Deprecated in Java")
    public final void drawPosText(String p0, float[] p1, Paint p2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawPosText(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect p0, Paint p1) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float p0, float p1, float p2, float p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawRect(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int p0, int p1, int p2) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawRGB(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF p0, float p1, float p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawRoundRect(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, Paint p6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawRoundRect(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF p0, float p1, float p2, RectF p3, float p4, float p5, Paint p6) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF p0, float[] p1, RectF p2, float[] p3, Paint p4) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawDoubleRoundRect(canvas, p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] p0, int p1, float[] p2, int p3, int p4, Font p5, Paint p6) {
        CanvasCompatS canvasCompatS = CanvasCompatS.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatS.drawGlyphs(canvas, p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] p0, int p1, int p2, float p3, float p4, Paint p5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawText(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String p0, float p1, float p2, Paint p3) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawText(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String p0, int p1, int p2, float p3, float p4, Paint p5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawText(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence p0, int p1, int p2, float p3, float p4, Paint p5) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawText(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] p0, int p1, int p2, Path p3, float p4, float p5, Paint p6) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawTextOnPath(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String p0, Path p1, float p2, float p3, Paint p4) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawTextOnPath(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, Paint p8) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, Paint p8) {
        CanvasCompatM canvasCompatM = CanvasCompatM.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatM.drawTextRun(canvas, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, Paint p8) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawTextRun(canvas, p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode p0, int p1, float[] p2, int p3, float[] p4, int p5, int[] p6, int p7, short[] p8, int p9, int p10, Paint p11) {
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvas.drawVertices(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode p0) {
        CanvasCompatQ canvasCompatQ = CanvasCompatQ.INSTANCE;
        Canvas canvas = this.nativeCanvas;
        if (canvas == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            canvas = null;
        }
        canvasCompatQ.drawRenderNode(canvas, p0);
    }
}
