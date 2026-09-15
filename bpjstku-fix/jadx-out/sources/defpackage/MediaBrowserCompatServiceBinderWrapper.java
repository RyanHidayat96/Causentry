package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.exifinterface.media.ExifInterface;
import coil.compose.AsyncImagePainter$onRemembered$1$1;
import coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1;
import coil.size.Precision;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import com.google.android.libraries.places.internal.zzbla;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0002\u0018 B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ!\u0010\u0018\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0004\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001b*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\u0019\u001a\u00020\u0001*\u00020\"H\u0002¢\u0006\u0004\b\u0019\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R/\u00101\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00018C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b\u0019\u00100R\u001d\u0010 \u001a\u00020\r8C@CX\u0083\u008c\u0002¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00118C@CX\u0083\u008c\u0002¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u00107R$\u0010.\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001b8\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b\u0018\u00108\"\u0004\b \u0010\u001cR(\u00106\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\b\u0019\u00109\"\u0004\b\u0018\u00100R(\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0:8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b;\u0010<\"\u0004\b\u0019\u0010=R*\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010:8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010<\"\u0004\b \u0010=R\u001c\u0010*\u001a\u00020?8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b6\u0010@\"\u0004\b\u0019\u0010AR\u001c\u0010,\u001a\u00020B8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b3\u0010C\"\u0004\b\u0018\u0010DR\u001c\u0010>\u001a\u00020\u000e8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\bE\u0010F\"\u0004\b\u0018\u0010GR%\u0010E\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001b8F@CX\u0087\u008e\u0002¢\u0006\f\n\u0004\bH\u0010-\"\u0004\b1\u0010\u001cR+\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010-\u001a\u0004\b\u0019\u0010J\"\u0004\b \u0010KR+\u0010I\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b'\u0010L\"\u0004\b1\u0010MR\u0014\u0010P\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O"}, d2 = {"LMediaBrowserCompatServiceBinderWrapper;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "LnewUnratedRating;", "p0", "LwriteToParcel;", "p1", "<init>", "(LnewUnratedRating;LwriteToParcel;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "onRemembered", "()V", "onForgotten", "onAbandoned", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(LnewUnratedRating;)LnewUnratedRating;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "(LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;)V", "LgetOptionsList;", "(LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;)LgetOptionsList;", "LnewStarRating;", "TuitionPaymentFragmentbindingInflater1", "(LnewStarRating;)LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)Landroidx/compose/ui/graphics/painter/Painter;", "Lkotlinx/coroutines/CoroutineScope;", "cancelAll", "Lkotlinx/coroutines/CoroutineScope;", "b", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "Landroidx/compose/ui/geometry/Size;", "a", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "notify", "Landroidx/compose/runtime/MutableState;", "d", "()Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroidx/compose/runtime/MutableFloatState;", "g", "()F", "asBinder", "asInterface", "()Landroidx/compose/ui/graphics/ColorFilter;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Landroidx/compose/ui/graphics/painter/Painter;", "Lkotlin/Function1;", "INotificationSideChannelDefault", "Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "INotificationSideChannel", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/layout/ContentScale;", "(Landroidx/compose/ui/layout/ContentScale;)V", "Landroidx/compose/ui/graphics/FilterQuality;", "I", "(I)V", "onTransact", "Z", "(Z)V", "getInterfaceDescriptor", "cancel", "()LnewUnratedRating;", "(LnewUnratedRating;)V", "()LwriteToParcel;", "(LwriteToParcel;)V", "getIntrinsicSize-NH-jbRc", "()J", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaBrowserCompatServiceBinderWrapper extends Painter implements RememberObserver {
    private static int INotificationSideChannelStub;
    private static long INotificationSideChannelStubProxy;
    private static char RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Function1<TuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int write;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private Function1<? super TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit> asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private Painter asInterface;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final MutableState cancelAll;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private CoroutineScope b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final MutableState cancel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private boolean INotificationSideChannel;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$f = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {94, -1, 37, -59, 22, 11, 19, -41, 45, 13, 3, -7, 37, -22, 48, 9, 6, 15, 9, -23, 43, 8, -3, 6, 22, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
    private static final int $$e = 219;
    private static final byte[] $$a = {58, -103, 118, 14, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 53;
    private static int connect = 1;
    private static int MediaBrowserCompat = 0;
    private static int IconCompatParcelizer = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<Size> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Size.m4031boximpl(Size.INSTANCE.m4052getZeroNHjbRc()));

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final MutableState TuitionPaymentFragmentspecialinlinedviewModeldefault2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MutableFloatState TuitionPaymentFragmentbindingInflater1 = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final MutableState TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 d = TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    private Function1<? super TuitionPaymentFragmentspecialinlinedviewModeldefault3, ? extends TuitionPaymentFragmentspecialinlinedviewModeldefault3> g = TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private ContentScale a = ContentScale.INSTANCE.getFit();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int notify = DrawScope.INSTANCE.m4801getDefaultFilterQualityfv9h1I();

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    private final MutableState onTransact = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i)) | (~(i7 | i5));
        int i9 = (~i) | i6;
        int i10 = ~(i9 | i5);
        int i11 = (~(i | (~i5))) | (~i9);
        int i12 = i6 + i5 + i2 + (243328196 * i4) + (549715570 * i3);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i6) + 1264254976 + ((-1099560353) * i5) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i2) + (781713408 * i4) + (665583616 * i3) + (1005256704 * i13);
        int i15 = (i6 * 1467389705) + 421362043 + (i5 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i2 * 1467388771) + (i4 * (-1383267380)) + (i3 * 1030937622) + (i13 * 484507648);
        switch (i14 + (i15 * i15 * 1164771328)) {
            case 1:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                return b(objArr);
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            case 5:
                return d(objArr);
            case 6:
                return asInterface(objArr);
            default:
                return TuitionPaymentFragmentbindingInflater1(objArr);
        }
    }

    public static /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 123;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r0 = defpackage.MediaBrowserCompatServiceBinderWrapper.$$a
            int r1 = 53 - r7
            int r6 = r6 * 52
            int r6 = 56 - r6
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + (-10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatServiceBinderWrapper.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 15
            int r5 = r5 + 84
            int r7 = r7 * 21
            int r7 = 25 - r7
            int r6 = r6 * 31
            int r6 = r6 + 22
            byte[] r0 = defpackage.MediaBrowserCompatServiceBinderWrapper.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
        L28:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatServiceBinderWrapper.f(byte, short, byte, java.lang.Object[]):void");
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements onSessionReady {

        public static final class TuitionPaymentFragmentbindingInflater1 implements clampVideoBitrateIfNotSupported<onQueueTitleChanged> {
            private /* synthetic */ clampVideoBitrateIfNotSupported b;

            /* JADX INFO: renamed from: MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault2$TuitionPaymentFragmentbindingInflater1$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "p0", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass3<T> implements addSignalEosTimeoutIfNeeded {
                private /* synthetic */ addSignalEosTimeoutIfNeeded $TuitionPaymentFragmentspecialinlinedviewModeldefault1;

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // defpackage.addSignalEosTimeoutIfNeeded
                public final Object emit(Object obj, Continuation continuation) {
                    AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1;
                    if (continuation instanceof AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1) {
                        asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 = (AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1) continuation;
                        if ((asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label & Integer.MIN_VALUE) != 0) {
                            asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label -= Integer.MIN_VALUE;
                        } else {
                            asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 = new AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1(this, continuation);
                        }
                    } else {
                        asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 = new AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                    Object obj2 = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded = this.$TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        onQueueTitleChanged onqueuetitlechangedB = sendRequest.b(((Size) obj).m4048unboximpl());
                        if (onqueuetitlechangedB != null) {
                            asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label = 1;
                            if (addsignaleostimeoutifneeded.emit(onqueuetitlechangedB, asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }

                public AnonymousClass3(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
                    this.$TuitionPaymentFragmentspecialinlinedviewModeldefault1 = addsignaleostimeoutifneeded;
                }
            }

            public TuitionPaymentFragmentbindingInflater1(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported) {
                this.b = clampvideobitrateifnotsupported;
            }

            @Override // defpackage.clampVideoBitrateIfNotSupported
            public final Object collect(addSignalEosTimeoutIfNeeded<? super onQueueTitleChanged> addsignaleostimeoutifneeded, Continuation continuation) {
                Object objCollect = this.b.collect(new AnonymousClass3(addsignaleostimeoutifneeded), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }

        @Override // defpackage.onSessionReady
        public final Object b(Continuation<? super onQueueTitleChanged> continuation) {
            Object[] objArr = {MediaBrowserCompatServiceBinderWrapper.this};
            return lambdapause5androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1((lambdastop3androidxcameravideointernalencoderEncoderImpl) MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -443564746, 443564749)), continuation);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0004\b\t\u0007\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e"}, d2 = {"LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/painter/Painter;", "TuitionPaymentFragmentbindingInflater1", "()Landroidx/compose/ui/graphics/painter/Painter;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$b;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public abstract Painter TuitionPaymentFragmentbindingInflater1();

        public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
            private final Painter TuitionPaymentFragmentbindingInflater1;
            final newPercentageRating TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static final byte[] $$c = {25, -93, -120, -48};
            private static final int $$d = 206;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {31, -3, -46, 11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 19;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f171a = 0;
            private static int asBinder = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -5275070572426178168L;
            private static int b = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 2
                    int r7 = 53 - r7
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    byte[] r0 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                    int r9 = r9 * 4
                    int r9 = 84 - r9
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r9 = r8
                    r5 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L1b:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L2a
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L2a:
                    r3 = r0[r9]
                L2c:
                    int r8 = r8 + r3
                    int r9 = r9 + 1
                    int r8 = r8 + (-11)
                    r3 = r5
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(int, int, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                SessionProcessor sessionProcessor = new SessionProcessor();
                int length = cArr2.length;
                char[] cArr4 = new char[length];
                int length2 = cArr.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr2, 0, cArr4, 0, length);
                System.arraycopy(cArr, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr3.length;
                char[] cArr6 = new char[length3];
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i4 = $10 + 77;
                    $11 = i4 % 128;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8327);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1236;
                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 36;
                            byte b2 = (byte) ($$d & 3);
                            byte b3 = (byte) (b2 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, packedPositionChild, packedPositionChild2, -653973969, false, $$e(b2, b3, b3), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.myPid() >> 22), 2764 - ExpandableListView.getPackedPositionGroup(0L), 14 - ExpandableListView.getPackedPositionGroup(0L), 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.normalizeMetaState(0) + 43325), KeyEvent.getDeadChar(0, 0) + 253, 22 - (ViewConfiguration.getLongPressTimeout() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 65200), 2891 - KeyEvent.getDeadChar(0, 0), TextUtils.getOffsetBefore("", 0) + 17, 2012627446, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                        int i6 = $11 + 23;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            @Override // MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final Painter TuitionPaymentFragmentbindingInflater1() {
                int i = 2 % 2;
                int i2 = f171a + 65;
                int i3 = i2 % 128;
                asBinder = i3;
                int i4 = i2 % 2;
                Painter painter = this.TuitionPaymentFragmentbindingInflater1;
                int i5 = i3 + 81;
                f171a = i5 % 128;
                if (i5 % 2 == 0) {
                    return painter;
                }
                throw null;
            }

            public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Painter painter, newPercentageRating newpercentagerating) {
                super(null);
                this.TuitionPaymentFragmentbindingInflater1 = painter;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = newpercentagerating;
            }

            public final boolean equals(Object obj) throws Throwable {
                String str;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
                String str2 = "";
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 46400), 40 - (Process.myPid() >> 22), 20 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                }
                int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
                Object[] objArr = new Object[1];
                c(new char[]{21689, 35054, 49712, 4533}, new char[]{33472, 20540, 55516, 12626}, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ImageFormat.getBitsPerPixel(0) + 1, new char[]{11567, 49185, 1615, 18047, 51776, 4425, 63569, 11150, 16613, 42290, 23494, 47785, 8465, 50978, 45671, 60281, 35246, 62524, 61343, 52016, 7583, 25421}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                c(new char[]{21689, 35054, 49712, 4533}, new char[]{46594, 9082, 49259, 60562}, (char) (View.resolveSizeAndState(0, 0, 0) + 37568), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1797487285, new char[]{30080, 52520, 2396, 51884, 19789, 44882, 30951, 60411, 65074, 11174, 57100, 23587, 60605, 40465, 53571}, objArr2);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                long j = -1;
                long j2 = j ^ 3278606829588305380L;
                long jIdentityHashCode = System.identityHashCode(this);
                long j3 = jIdentityHashCode | (-1181349654846346393L);
                long j4 = (((long) (-464)) * 3278606829588305380L) + (((long) (-929)) * (-1181349654846346393L)) + (((long) (-465)) * (j2 | (j3 ^ j))) + (((long) 930) * ((j ^ (jIdentityHashCode | j2)) | (-1181349654846346393L))) + (((long) 465) * (j3 | j2));
                int i3 = 0;
                long j5 = jLongValue;
                while (true) {
                    int i4 = 5;
                    if (i3 == 10) {
                        String str3 = str2;
                        Object[] objArr3 = new Object[1];
                        c(new char[]{21689, 35054, 49712, 4533}, new char[]{46818, 17983, 34917, 30619}, (char) (39816 - (ViewConfiguration.getTapTimeout() >> 16)), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{44795, 29347, 25541, 37117, 2015, 36028, 61744, 21545, 23979, 16783, 28167, 43634, 47260, 19220, 40502, 15944}, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        c(new char[]{21689, 35054, 49712, 4533}, new char[]{31302, 22972, 47043, 22704}, (char) ((-16731977) - Color.rgb(0, 0, 0)), KeyEvent.getMaxKeyCode() >> 16, new char[]{20640, 34438, 2085, 1523, 31280, 54063, 60595, 52405, 2152, 15916, 7650, 41122, 51488, 23590, 9252, 51740}, objArr4);
                        int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr5 = {1457931123};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 46038), 1134 - View.resolveSizeAndState(0, 0, 0), 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -419564075, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr5), false};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int modifierMetaStateMask = 1030 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 16;
                                byte b2 = $$a[7];
                                byte b3 = b2;
                                Object[] objArr7 = new Object[1];
                                d(b2, b3, b3, objArr7);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, modifierMetaStateMask, modifierMetaStateMask2, 1298546779, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf((CharSequence) str3, '0', 0, 0) + 45994), 1165 - AndroidCharacter.getMirror('0'), 17 - TextUtils.getOffsetAfter(str3, 0)), Boolean.TYPE});
                            }
                            Object[] objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr6);
                            int i5 = ((int[]) objArr8[1])[0];
                            int i6 = ((int[]) objArr8[3])[0];
                            if (i6 == i5) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[0];
                            if (strArr != null) {
                                int i7 = asBinder + 37;
                                f171a = i7 % 128;
                                int i8 = 2;
                                int i9 = i7 % 2;
                                int i10 = 0;
                                while (i10 < strArr.length) {
                                    int i11 = asBinder + 37;
                                    f171a = i11 % 128;
                                    if (i11 % i8 != 0) {
                                        arrayList.add(strArr[i10]);
                                        i10 += 20;
                                    } else {
                                        arrayList.add(strArr[i10]);
                                        i10++;
                                    }
                                    i8 = 2;
                                }
                            }
                            Toast.makeText((Context) null, i6 / (((i6 - 1) * i6) % 2), 0).show();
                            break;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - TextUtils.getOffsetAfter(str2, 0)), 59 - (ViewConfiguration.getPressedStateDuration() >> 16), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i12 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
                    long j6 = j5;
                    int i13 = 0;
                    while (true) {
                        int i14 = asBinder + 27;
                        f171a = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 2 % i4;
                        }
                        int i16 = 0;
                        while (i16 != 8) {
                            i12 = (((((int) (j6 >> i16)) & 255) + (i12 << 6)) + (i12 << 16)) - i12;
                            i16++;
                            str2 = str2;
                        }
                        str = str2;
                        if (i13 != 0) {
                            break;
                        }
                        i13++;
                        j6 = j4;
                        str2 = str;
                        i4 = 5;
                    }
                    if (i12 == i2) {
                        break;
                    }
                    j5 -= 1024;
                    i3++;
                    str2 = str;
                }
                if (this == obj) {
                    int i17 = asBinder + 9;
                    f171a = i17 % 128;
                    int i18 = i17 % 2;
                    return true;
                }
                if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    return false;
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
                if (!Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1)) {
                    int i19 = asBinder + 23;
                    f171a = i19 % 128;
                    int i20 = i19 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    return true;
                }
                int i21 = asBinder + 23;
                f171a = i21 % 128;
                return i21 % 2 != 0;
            }

            public final int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = f171a + 89;
                int i3 = i2 % 128;
                asBinder = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Painter painter = this.TuitionPaymentFragmentbindingInflater1;
                if (painter == null) {
                    int i4 = i3 + 97;
                    f171a = i4 % 128;
                    iHashCode = i4 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = painter.hashCode();
                }
                return (iHashCode * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
            }

            public final String toString() {
                int i = 2 % 2;
                StringBuilder sb = new StringBuilder("Error(painter=");
                sb.append(this.TuitionPaymentFragmentbindingInflater1);
                sb.append(", result=");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                sb.append(')');
                String string = sb.toString();
                int i2 = f171a + 1;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return string;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0024  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r6, int r7, int r8) {
                /*
                    int r8 = r8 * 4
                    int r8 = 3 - r8
                    int r6 = 104 - r6
                    int r7 = r7 * 3
                    int r0 = 1 - r7
                    byte[] r1 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r1 != 0) goto L17
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L1b:
                    int r6 = r6 + 1
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L2a:
                    r3 = r1[r6]
                L2c:
                    int r8 = r8 + r3
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$e(int, int, int):java.lang.String");
            }
        }

        /* JADX INFO: renamed from: MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: collision with other inner class name */
        public static final class C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
            private final Painter TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private static final byte[] $$c = {117, -15, -81, 1};
            private static final int $$d = 207;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 113;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {60050, 60052, 60062, 60049, 60063, 60057, 60045, 60048, 60047, 60058, 60043, 60117, 60051, 60088, 60034, 60073, 60072, 60053, 60054, 60041, 60040, 60083, 60060, 60055, 60056};
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57188;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
                /*
                    int r9 = r9 * 3
                    int r9 = r9 + 84
                    int r8 = r8 + 4
                    int r7 = r7 * 15
                    int r7 = 53 - r7
                    byte[] r0 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r9
                    r4 = r2
                    r9 = r8
                    goto L2c
                L15:
                    r3 = r2
                L16:
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L2c:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3.a(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:38:0x013b  */
            /* JADX WARN: Code duplicated, block: B:39:0x0152  */
            /* JADX WARN: Code duplicated, block: B:42:0x019e A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:19:0x0091, B:21:0x009f, B:22:0x00d8, B:40:0x0154, B:42:0x019e, B:43:0x0218, B:47:0x022d, B:49:0x0269, B:51:0x02d8), top: B:70:0x0091 }] */
            /* JADX WARN: Code duplicated, block: B:46:0x022b  */
            /* JADX WARN: Code duplicated, block: B:49:0x0269 A[Catch: all -> 0x0383, TryCatch #0 {all -> 0x0383, blocks: (B:19:0x0091, B:21:0x009f, B:22:0x00d8, B:40:0x0154, B:42:0x019e, B:43:0x0218, B:47:0x022d, B:49:0x0269, B:51:0x02d8), top: B:70:0x0091 }] */
            /* JADX WARN: Code duplicated, block: B:50:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:53:0x02f9  */
            /* JADX WARN: Code duplicated, block: B:55:0x0301  */
            /* JADX WARN: Code duplicated, block: B:57:0x033f  */
            /* JADX WARN: Code duplicated, block: B:58:0x0343  */
            /* JADX WARN: Code duplicated, block: B:79:0x035c A[SYNTHETIC] */
            private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i4 = 2;
                int i5 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                long j = 0;
                char c = 3;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $10 + 71;
                        $11 = i7 % 128;
                        int i8 = i7 % i4;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 2267;
                                int i9 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                byte b3 = $$c[c];
                                byte b4 = (byte) (b3 - 1);
                                byte b5 = (byte) (-b3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, deadChar, i9, -1927765101, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i6++;
                            i4 = 2;
                            j = 0;
                            c = 3;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                try {
                    Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char size = (char) View.MeasureSpec.getSize(0);
                        int iBlue = 2267 - Color.blue(0);
                        int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                        byte b6 = $$c[3];
                        byte b7 = (byte) (b6 - 1);
                        byte b8 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, iBlue, packedPositionGroup, -1927765101, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        int i10 = $11 + 123;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b2);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            int i12 = $11 + 61;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                } else {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char bitsPerPixel = (char) (49266 - ImageFormat.getBitsPerPixel(0));
                                        int scrollBarSize = 3261 - (ViewConfiguration.getScrollBarSize() >> 8);
                                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30;
                                        byte b9 = $$c[3];
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, scrollBarSize, maximumFlingVelocity, -127612708, false, $$e((byte) (b9 - 1), (byte) (-b9), b9), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cResolveSizeAndState = (char) (22878 - View.resolveSizeAndState(0, 0, 0));
                                            int modifierMetaStateMask = 593 - ((byte) KeyEvent.getModifierMetaStateMask());
                                            int iIndexOf = 16 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                            byte b10 = $$c[3];
                                            byte b11 = (byte) (b10 - 1);
                                            byte b12 = (byte) (-b10);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, modifierMetaStateMask, iIndexOf, 1570859318, false, $$e(b11, b12, (byte) (b12 + 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i14 = $11 + 83;
                                        $10 = i14 % 128;
                                        int i15 = i14 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                        i3 = $11 + 11;
                                        $10 = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            int i18 = 2 / 5;
                                        }
                                    } else {
                                        int i19 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i20 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i19];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i20];
                                    }
                                }
                            } else {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                } else {
                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char bitsPerPixel2 = (char) (49266 - ImageFormat.getBitsPerPixel(0));
                                        int scrollBarSize2 = 3261 - (ViewConfiguration.getScrollBarSize() >> 8);
                                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30;
                                        byte b13 = $$c[3];
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel2, scrollBarSize2, maximumFlingVelocity2, -127612708, false, $$e((byte) (b13 - 1), (byte) (-b13), b13), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cResolveSizeAndState2 = (char) (22878 - View.resolveSizeAndState(0, 0, 0));
                                            int modifierMetaStateMask2 = 593 - ((byte) KeyEvent.getModifierMetaStateMask());
                                            int iIndexOf2 = 16 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                            byte b14 = $$c[3];
                                            byte b15 = (byte) (b14 - 1);
                                            byte b16 = (byte) (-b14);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState2, modifierMetaStateMask2, iIndexOf2, 1570859318, false, $$e(b15, b16, (byte) (b16 + 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        }
                                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                        int i110 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i110];
                                    } else if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                        int i111 = $11 + 83;
                                        $10 = i111 % 128;
                                        int i112 = i111 % 2;
                                        deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                        deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                        int i113 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                        int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i113];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                                        i3 = $11 + 11;
                                        $10 = i3 % 128;
                                        if (i3 % 2 != 0) {
                                            int i115 = 2 / 5;
                                        }
                                    } else {
                                        int i116 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                        int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i116];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                                    }
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                        }
                    }
                    for (int i22 = 0; i22 < i; i22++) {
                        int i23 = $11 + 15;
                        $10 = i23 % 128;
                        int i24 = i23 % 2;
                        cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                    }
                    objArr[0] = new String(cArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            @Override // MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final Painter TuitionPaymentFragmentbindingInflater1() {
                Painter painter;
                int i = 2 % 2;
                int i2 = b;
                int i3 = i2 + 27;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                if (i3 % 2 != 0) {
                    painter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i4 = 93 / 0;
                } else {
                    painter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                int i5 = i2 + 51;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return painter;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3(Painter painter) {
                super(null);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = painter;
            }

            public final int hashCode() throws Throwable {
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
                int i;
                Object[] objArr;
                int i2 = 2 % 2;
                int i3 = TuitionPaymentFragmentbindingInflater1 + 23;
                b = i3 % 128;
                int i4 = i3 % 2;
                Painter painter = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                    int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[5], bArr[28], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, scrollDefaultDelay, keyRepeatDelay, 986134021, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{7, 19, '\t', 24, 2, 1, 1, 14, 0, 21, 16, 21, '\n', 24, 7, 3, 23, 18, 21, 3, 22, '\t'}, (byte) (16 - View.combineMeasuredStates(0, 0)), TextUtils.getCapsMode("", 0, 0) + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{3, 22, 5, 14, 22, 0, 0, 19, 4, 7, 3, '\r', 3, 15, 13884}, (byte) (AndroidCharacter.getMirror('0') + '\r'), 15 - TextUtils.indexOf("", "", 0, 0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                    int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
                    int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    byte b4 = b2;
                    Object[] objArr5 = new Object[1];
                    a(b3, (byte) (b3 | 36), b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iResolveOpacity, threadPriority, 1596667560, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c3 = (char) (29945 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1755;
                        int i5 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23;
                        byte b5 = $$a[7];
                        byte b6 = b5;
                        Object[] objArr6 = new Object[1];
                        a(b6, (byte) (b6 | 88), b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, iCombineMeasuredStates, i5, 1599039318, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i6 = ~iUptimeMillis;
                    int i7 = (-982426426) + (((~((-288625219) | i6)) | (~((-10421) | iUptimeMillis)) | (~(364658430 | iUptimeMillis))) * 765) + (((~((-288635639) | i6)) | 288625218) * 1530) + (((~(iUptimeMillis | (-288635639))) | (~(i6 | 364658430))) * 765) + 74103751;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{4, '\b', 7, 5, '\r', 21, 7, 19, 21, '\f', 19, 11, 23, 5, 3, 17}, (byte) (KeyEvent.keyCodeFromString("") + 39), 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{1, 0, 7, 22, 5, 3, '\t', '\r', 24, 6, 22, '\n', 11, 3, 0, 3}, (byte) (118 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr10 = {-2014611547};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Drawable.resolveOpacity(0, 0) + 1726, Color.red(0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 74103751, false, true);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char capsMode = (char) (29944 - TextUtils.getCapsMode("", 0, 0));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                            int jumpTapTimeout = 23 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr11 = new Object[1];
                            a(b8, (byte) (b8 | 88), b7, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(capsMode, iLastIndexOf, jumpTapTimeout, 1599039318, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                        try {
                            Object[] objArr12 = new Object[1];
                            c(new char[]{7, 19, '\t', 24, 2, 1, 1, 14, 0, 21, 16, 21, '\n', 24, 7, 3, 23, 18, 21, 3, 22, '\t'}, (byte) (16 - View.getDefaultSize(0, 0)), TextUtils.indexOf("", "") + 22, objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            c(new char[]{3, 22, 5, 14, 22, 0, 0, 19, 4, 7, 3, '\r', 3, 15, 13884}, (byte) (TextUtils.getOffsetBefore("", 0) + 61), TextUtils.lastIndexOf("", '0') + 16, objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 1756;
                                int maximumFlingVelocity = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                byte b9 = $$a[7];
                                byte b10 = b9;
                                Object[] objArr14 = new Object[1];
                                a(b10, (byte) (b10 | 36), b9, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, iLastIndexOf2, maximumFlingVelocity, 1596667560, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                                int iAxisFromString = 1754 - MotionEvent.axisFromString("");
                                int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                                byte[] bArr2 = $$a;
                                Object[] objArr15 = new Object[1];
                                a(bArr2[5], bArr2[28], bArr2[7], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, iAxisFromString, i10, 986134021, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0];
                int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0];
                if (i12 == i11) {
                    int i13 = b + 93;
                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
                    objArr = new Object[]{new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i16 = ~iIdentityHashCode;
                    int i17 = i15 + 855644384 + ((~(69511057 | i16)) * 979) + ((iIdentityHashCode | 282113483) * (-979)) + (((~(iIdentityHashCode | 69511057)) | (~(i16 | 282113483))) * 979);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr[3])[0] = i19 ^ (i19 << 5);
                    i = 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4];
                    if (strArr != null) {
                        int i20 = b + 111;
                        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                        int i21 = i20 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
                    int i22 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[3])[0];
                    Object[] objArr16 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113[4]};
                    int i23 = (~System.identityHashCode(this)) | 585219490;
                    int i24 = i22 + (-1186192182) + (i23 * 495) + (((~i23) | 549458050) * 495);
                    int i25 = (i24 << 13) ^ i24;
                    int i26 = i25 ^ (i25 >>> 17);
                    ((int[]) objArr16[3])[0] = i26 ^ (i26 << 5);
                    int i27 = b + 5;
                    TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                    i = 2;
                    int i28 = i27 % 2;
                    objArr = objArr16;
                }
                if (painter != null) {
                    return painter.hashCode();
                }
                int i29 = TuitionPaymentFragmentbindingInflater1 + 121;
                b = i29 % 128;
                int i30 = i29 % i;
                int i31 = ((int[]) objArr[3])[0];
                int i32 = ((i31 * i31) - (~(-(1714430943 * i31)))) - 1;
                int i33 = -(i31 * (-510292489));
                int i34 = ((i32 & i33) + (i33 | i32)) - 122067015;
                int i35 = i34 >> 25;
                int i36 = (((i35 | (-255)) << 1) - (i35 ^ (-255))) / 128;
                int i37 = (i36 & 1) + (i36 | 1);
                int i38 = ((i34 | i37) << 1) - (i37 ^ i34);
                int i39 = i34 >> 27;
                int i40 = ((i39 ^ (-63)) + ((i39 & (-63)) << 1)) / 32;
                int i41 = (-(((i40 & 1) + (i40 | 1)) ^ i38)) + 8;
                int i42 = ((i41 >> 22) - 2047) / 1024;
                int i43 = (i42 & 1) + (i42 | 1);
                return 0 / ((i41 & (-((i43 ^ 1) + ((i43 & 1) << 1)))) * 1745);
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = b + 59;
                    TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                    return i2 % 2 == 0;
                }
                if (!(obj instanceof C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    int i3 = b + 93;
                    TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                    return i3 % 2 != 0;
                }
                if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    return true;
                }
                int i4 = b;
                int i5 = i4 + 99;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 11;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }

            public final String toString() {
                int i = 2 % 2;
                StringBuilder sb = new StringBuilder("Loading(painter=");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append(')');
                String string = sb.toString();
                int i2 = b + 33;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 22 / 0;
                }
                return string;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(short r7, int r8, byte r9) {
                /*
                    byte[] r0 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                    int r7 = r7 * 2
                    int r7 = r7 + 1
                    int r9 = r9 + 113
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r9
                    r4 = r2
                    r9 = r8
                    goto L29
                L13:
                    r3 = r2
                L14:
                    int r4 = r3 + 1
                    int r8 = r8 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    if (r4 != r7) goto L23
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L23:
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L29:
                    int r8 = r8 + r3
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$e(short, int, byte):java.lang.String");
            }
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "TuitionPaymentFragmentbindingInflater1", "()Landroidx/compose/ui/graphics/painter/Painter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
            public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

            @Override // MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final Painter TuitionPaymentFragmentbindingInflater1() {
                return null;
            }

            public final int hashCode() {
                return -1515560141;
            }

            private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                super(null);
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                    return false;
                }
                return true;
            }

            public final String toString() {
                return "TuitionPaymentFragmentspecialinlinedviewModeldefault1";
            }
        }

        public static final class b extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
            private final Painter TuitionPaymentFragmentbindingInflater1;
            private final isThumbUp TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            @Override // MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            public final Painter TuitionPaymentFragmentbindingInflater1() {
                return this.TuitionPaymentFragmentbindingInflater1;
            }

            public final isThumbUp b() {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }

            public b(Painter painter, isThumbUp isthumbup) {
                super(null);
                this.TuitionPaymentFragmentbindingInflater1 = painter;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = isthumbup;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, bVar.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }

            public final int hashCode() {
                return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Success(painter=");
                sb.append(this.TuitionPaymentFragmentbindingInflater1);
                sb.append(", result=");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append(')');
                return sb.toString();
            }
        }
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.alpha(0) + 8328), 1235 - ExpandableListView.getPackedPositionType(0L), Gravity.getAbsoluteGravity(0, 0) + 35, -653973969, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.normalizeMetaState(0), 2765 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, 1504416861, false, $$g(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43326 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 253, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (65200 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int bitsPerPixel = 2890 - ImageFormat.getBitsPerPixel(0);
                    int iBlue = 17 - Color.blue(0);
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    String str$$g = $$g(b5, b6, (byte) (b6 + 1));
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, bitsPerPixel, iBlue, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (INotificationSideChannelStubProxy ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) INotificationSideChannelStub) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i7 = $10 + 55;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements onShuffleModeChangedRemoved {
        private static final byte[] $$c = {119, -102, -34, -3};
        private static final int $$f = 103;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {101, 89, 94, -73, -2, 21, -2, 11, 6, 11, 24, -4, 5, 28, -6, -9, 43, 6, -3, 4, 11, 11, -10, 28, 21, 13, -7, 23, 10, -59, 58, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -11, 43, 6, -3, 4, 11, 11, -23, 40, 12, 7, -56, 22, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
        private static final int $$e = 102;
        private static final byte[] $$a = {5, -91, 77, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 99;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {1385079708, 396289178, -1266616244, 1679844029, 846282216, -464756812, -1262325498, -223084405, 441467364, 435806613, 1121205750, -1319355624, -816282061, 516923593, -655530475, 803615612, 1763280593, 2092861046};

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r0 = 53 - r7
                int r8 = r8 * 14
                int r8 = r8 + 84
                byte[] r1 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$a
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L15
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2e
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                int r6 = r6 + 1
                r4 = r1[r6]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-10)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1.a(byte, short, short, java.lang.Object[]):void");
        }

        private static void d(byte b, short s, short s2, Object[] objArr) {
            int i = b * 30;
            int i2 = 108 - (s2 * 24);
            byte[] bArr = $$d;
            int i3 = 70 - (s * 67);
            byte[] bArr2 = new byte[68 - i];
            int i4 = 67 - i;
            int i5 = -1;
            if (bArr == null) {
                i2 = (i4 + i2) - 9;
            }
            while (true) {
                i5++;
                i3++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i2 = (i2 + bArr[i3]) - 9;
            }
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            char c = '0';
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 1;
                    $10 = i8 % 128;
                    if (i8 % i2 != 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) i6;
                                byte b2 = b;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", c, i6)), TextUtils.lastIndexOf("", c) + 3292, (ViewConfiguration.getEdgeSlop() >> 16) + 31, 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3291 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i9 = $11 + 113;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 2;
                    c = '0';
                    i4 = -1870535734;
                    i6 = 0;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3291 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31, 1948206109, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i11++;
                    iArr5 = iArr5;
                    i5 = 1;
                }
                iArr5 = iArr6;
            }
            char c2 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i12 = $10 + 77;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                for (int i14 = 17; i14 > 1; i14--) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                    Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2559 - View.combineMeasuredStates(0, 0), (Process.myTid() >> 22) + 29, 683220507, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                }
                int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28880 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 348, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                int i17 = $10 + 101;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                c2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // defpackage.onShuffleModeChangedRemoved
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Drawable drawable) {
            Painter painterTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i = 2 % 2;
            MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = MediaBrowserCompatServiceBinderWrapper.this;
            if (drawable != null) {
                painterTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatServiceBinderWrapper, drawable);
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 / 2;
                }
            } else {
                painterTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            }
            Object[] objArr = {mediaBrowserCompatServiceBinderWrapper, new TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3(painterTuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1170380119, 1170380120);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.onShuffleModeChangedRemoved
        public final void TuitionPaymentFragmentbindingInflater1() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maxKeyCode = (char) (31533 - (KeyEvent.getMaxKeyCode() >> 16));
                int i4 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i5 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                byte[] bArr = $$a;
                byte b = bArr[37];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b & 52), bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, i4, i5, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{1417930383, 1224167483, -1524025511, 259342054, -536382159, 751610323, -1787932953, 865276684, 939500192, -1435813182, 1485174981, -1159494636, -1509551661, 1180629109}, 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{49492434, -1882704491, 519123107, 254567411, 2020573250, -1441981737, 189507346, 647157831, -2111483074, 574679537}, View.MeasureSpec.getSize(0) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char mode = (char) (View.MeasureSpec.getMode(0) + 31533);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 921;
                int defaultSize = 28 - View.getDefaultSize(0, 0);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[37];
                byte b3 = bArr2[80];
                Object[] objArr5 = new Object[1];
                a(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, minimumFlingVelocity, defaultSize, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                    int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) 51, (byte) (-bArr3[33]), bArr3[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, threadPriority, i8, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyPid = Process.myPid();
                int i9 = (((440064755 + (((-1639819364) | iMyPid) * 376)) + (((~((~iMyPid) | 631632700)) | (-1706949504)) * (-376))) + (((~(iMyPid | (-631632701))) | 1142446943) * 376)) - 1231201604;
                int i10 = (i9 << 13) ^ i9;
                int i11 = i10 ^ (i10 >>> 17);
                ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{-658138953, -1178027015, -1270688835, 1197799262, 1948894931, -1504411091, 417868314, 1492992435, 36900365, -543670586, -1788743929, 536308632, -969996952, 1432842954, 1274566384, -145601593}, KeyEvent.keyCodeFromString("") + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{-1299581904, 1737762792, -570242214, 371494164, 824631437, 859296410, -1809477044, -266745502, 1083574154, -2090471110, 554117636, -1447948063}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{1954093981, 1793246868, -368387855, 173021542, 1312186148, -1740480965, 747617133, -604320002, 317015633, -503381206}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{-17182316, -1592372053, 1289504585, 371375299, -1159954675, 1674852491, 189417713, -119331904, -1893637851, -1672570035}, 16 - TextUtils.getTrimmedLength(""), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1231201604};
                    byte[] bArr4 = $$d;
                    byte b4 = bArr4[41];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    Object[] objArr13 = new Object[1];
                    d(b5, b6, (byte) (b6 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr4[41];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    d(b8, (byte) (b8 - 1), b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 922;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 28;
                        byte[] bArr5 = $$a;
                        Object[] objArr16 = new Object[1];
                        a((byte) 51, (byte) (-bArr5[33]), bArr5[80], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, modifierMetaStateMask, longPressTimeout, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{1417930383, 1224167483, -1524025511, 259342054, -536382159, 751610323, -1787932953, 865276684, 939500192, -1435813182, 1485174981, -1159494636, -1509551661, 1180629109}, Color.alpha(0) + 22, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{49492434, -1882704491, 519123107, 254567411, 2020573250, -1441981737, 189507346, 647157831, -2111483074, 574679537}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 922;
                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 28;
                            byte[] bArr6 = $$a;
                            byte b9 = bArr6[37];
                            byte b10 = bArr6[80];
                            Object[] objArr19 = new Object[1];
                            a(b9, b10, b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarSize, iIndexOf, iIndexOf2, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cArgb = (char) (31533 - Color.argb(0, 0, 0, 0));
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                            int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[37];
                            Object[] objArr20 = new Object[1];
                            a(b11, (byte) (b11 & 52), bArr7[7], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cArgb, iResolveOpacity, threadPriority2, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[3])[0];
            if (i17 == i16) {
                int i18 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i19 = ~startElapsedRealtime;
                int i20 = i18 + (-276834192) + (((~((-1126137924) | i19)) | (~(1738526299 | startElapsedRealtime))) * (-831)) + ((~((-1090584580) | startElapsedRealtime)) * (-1662)) + (((~(startElapsedRealtime | 1126137923)) | (~(i19 | (-647941721))) | (~(647941720 | startElapsedRealtime))) * 831);
                int i21 = (i20 << 13) ^ i20;
                int i22 = i21 ^ (i21 >>> 17);
                ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                    TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                    int i24 = i23 % 2;
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i25 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = ~((-563955644) | (~iIdentityHashCode));
            int i27 = i25 + ((((1210056768 | i26) | (~(563955643 | iIdentityHashCode))) * (-338)) - 1543593189) + (((~(iIdentityHashCode | 1774012411)) | i26) * 338);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr22[0])[0] = i29 ^ (i29 << 5);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r7, byte r8, byte r9) {
            /*
                int r9 = r9 * 56
                int r9 = 122 - r9
                byte[] r0 = MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$c
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r7 = r7 * 4
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2a
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r7 = r7 + r3
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1.$$g(short, byte, byte):java.lang.String");
        }
    }

    public static final /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, newStarRating newstarrating) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(newstarrating);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1 = mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(newstarrating);
        int i3 = MediaBrowserCompat + 73;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentbindingInflater1;
    }

    public static final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Function1<TuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3> function1 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return function1;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 123;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompat + 57;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final /* synthetic */ Painter TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, Drawable drawable) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Painter painterTuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable);
        int i4 = MediaBrowserCompat + 89;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return painterTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        newUnratedRating newunratedrating = (newUnratedRating) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 21;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        newUnratedRating newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(newunratedrating);
        int i4 = MediaBrowserCompat + 123;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 1;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Size> lambdastop3androidxcameravideointernalencoderencoderimpl = mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 71;
        MediaBrowserCompat = i5 % 128;
        int i6 = i5 % 2;
        return lambdastop3androidxcameravideointernalencoderencoderimpl;
    }

    public MediaBrowserCompatServiceBinderWrapper(newUnratedRating newunratedrating, writeToParcel writetoparcel) {
        this.cancelAll = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(newunratedrating, null, 2, null);
        this.cancel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(writetoparcel, null, 2, null);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lkotlin/Function1;", "LMediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Function1<TuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault3> TuitionPaymentFragmentbindingInflater1() {
            return MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 51;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return (Painter) mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        }
        int i3 = 36 / 0;
        return (Painter) mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Painter painter) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(painter);
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(painter);
            throw null;
        }
    }

    private final float g() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 61;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        float floatValue = this.TuitionPaymentFragmentbindingInflater1.getFloatValue();
        int i4 = IconCompatParcelizer + 103;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return floatValue;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 25;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            mediaBrowserCompatServiceBinderWrapper.d = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return null;
        }
        mediaBrowserCompatServiceBinderWrapper.d = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Painter painter) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 27;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.asInterface = painter;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(painter);
            int i3 = 67 / 0;
        } else {
            this.asInterface = painter;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(painter);
        }
        int i4 = IconCompatParcelizer + 77;
        MediaBrowserCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1<? super TuitionPaymentFragmentspecialinlinedviewModeldefault3, ? extends TuitionPaymentFragmentspecialinlinedviewModeldefault3> function1) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 101;
        MediaBrowserCompat = i3 % 128;
        int i4 = i3 % 2;
        this.g = function1;
        int i5 = i2 + 7;
        MediaBrowserCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void TuitionPaymentFragmentbindingInflater1(Function1<? super TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit> function1) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = function1;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ContentScale contentScale) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        int i3 = i2 % 128;
        MediaBrowserCompat = i3;
        int i4 = i2 % 2;
        this.a = contentScale;
        int i5 = i3 + 101;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 101;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
        this.notify = i;
        int i6 = i3 + 113;
        MediaBrowserCompat = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 45;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        mediaBrowserCompatServiceBinderWrapper.INotificationSideChannel = zBooleanValue;
        if (i3 != 0) {
            return null;
        }
        int i4 = 67 / 0;
        return null;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public final long getIntrinsicSize() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 63;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Painter painter = (Painter) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1702995622, 1702995624);
        if (painter == null) {
            return Size.INSTANCE.m4051getUnspecifiedNHjbRc();
        }
        int i4 = IconCompatParcelizer + 47;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
        return painter.getIntrinsicSize();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0041 A[PHI: r1
  0x0041: PHI (r1v8 androidx.compose.ui.graphics.painter.Painter) = (r1v6 androidx.compose.ui.graphics.painter.Painter), (r1v11 androidx.compose.ui.graphics.painter.Painter) binds: [B:8:0x0070, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        Painter painter;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 37;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(Size.m4031boximpl(drawScope.mo4798getSizeNHjbRc()));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            painter = (Painter) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1702995622, 1702995624);
            int i3 = 13 / 0;
            if (painter != null) {
                painter.m4923drawx_KDEd0(drawScope, drawScope.mo4798getSizeNHjbRc(), g(), asInterface());
            }
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(Size.m4031boximpl(drawScope.mo4798getSizeNHjbRc()));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            painter = (Painter) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault4, iTuitionPaymentFragmentspecialinlinedviewModeldefault5, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault6, -1702995622, 1702995624);
            if (painter != null) {
                painter.m4923drawx_KDEd0(drawScope, drawScope.mo4798getSizeNHjbRc(), g(), asInterface());
            }
        }
        int i4 = IconCompatParcelizer + 111;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0283  */
    /* JADX WARN: Code duplicated, block: B:27:0x0285  */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 63;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MutableFloatState mutableFloatState = this.TuitionPaymentFragmentbindingInflater1;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31532);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 921;
            int gidForName = Process.getGidForName("") + 29;
            byte b = $$a[37];
            Object[] objArr2 = new Object[1];
            c(b, b, (byte) ($$b - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iMakeMeasureSpec, gidForName, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{48636, 24801, 13720, 64527}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{19159, 19259, 2200, 38346, 17289, 19372, 23660, 2676, 27625, 9919, 62670, 37414, 18858, 40101, 1328, 61861, 53726, 14098, 42107, 11071, 30930, 61946}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{39724, 55994, 52657, 41195}, (char) (TextUtils.getOffsetAfter("", 0) + 60365), View.MeasureSpec.getSize(0) - 1311065445, new char[]{28278, 3149, 64270, 35007, 28123, 22649, 61007, 30542, 7249, 30067, 16454, 54347, 51875, 26697, 29681}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (31533 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 921;
            int iMyTid = (Process.myTid() >> 22) + 28;
            byte[] bArr = $$a;
            byte b2 = bArr[80];
            Object[] objArr5 = new Object[1];
            c(b2, bArr[37], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, maxKeyCode, iMyTid, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                int iAlpha = 28 - Color.alpha(0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[80];
                Object[] objArr6 = new Object[1];
                c(b3, b3, bArr2[33], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iCombineMeasuredStates, iAlpha, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[3])[0];
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i5}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = 1440182092 + (((~((~iIdentityHashCode) | (-1026602229))) | 288367696) * (-245));
            int i7 = ~(iIdentityHashCode | (-1026602229));
            int i8 = i6 + (i7 * (-245)) + ((i7 | 747477415) * 245) + 609100501;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{8442, 62303, 15383, 43237}, (char) (TextUtils.indexOf("", "", 0, 0) + 58684), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{52070, 52282, 19788, 64039, 28701, 42968, 20602, 8650, 48449, 35883, 58699, 55956, 18291, 42556, 56588, 53455, 35905, 39453, 46845, 42282, 26030, 15419, 62248, 50867, '\'', 22846}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{54462, 2714, 30820, 35084}, (char) (3191 - MotionEvent.axisFromString("")), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{7417, 16064, 11689, 21478, 29518, 58417, 4611, 26362, 17137, 63639, 55269, 31077, 26333, 4978, 16920, 24223, 14677, 5649}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i11 = MediaBrowserCompat + 81;
                    IconCompatParcelizer = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 84 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{22580, 33709, 52659, 61551}, (char) (28621 - View.resolveSizeAndState(0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, new char[]{42034, 34954, 56524, 14243, 19815, 35858, 37855, 15114, 55814, 45932, 2064, 24786, 39160, 11959, 57957, 53657}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{37883, 38410, 22468, 29291}, (char) (ExpandableListView.getPackedPositionChild(0L) + 27480), Color.red(0), new char[]{58355, 16224, 35549, 30990, 15993, 30679, 53893, 37698, 13119, 40744, 26360, 11602, 12538, 33053, 50468, 6650}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i13 = MediaBrowserCompat + 19;
            IconCompatParcelizer = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 609100501};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[58];
                byte b5 = b4;
                Object[] objArr13 = new Object[1];
                f(b5, (byte) (b5 - 1), b4, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[58];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr14 = new Object[1];
                f(b7, b8, (byte) (b8 - 1), objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                    int iBlue = 921 - Color.blue(0);
                    int i15 = 28 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[80];
                    Object[] objArr15 = new Object[1];
                    c(b9, b9, bArr4[33], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatTimeout, iBlue, i15, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{48636, 24801, 13720, 64527}, (char) (Color.rgb(0, 0, 0) + 16777216), MotionEvent.axisFromString("") + 1, new char[]{19159, 19259, 2200, 38346, 17289, 19372, 23660, 2676, 27625, 9919, 62670, 37414, 18858, 40101, 1328, 61861, 53726, 14098, 42107, 11071, 30930, 61946}, objArr16);
                    Class<?> cls5 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{39724, 55994, 52657, 41195}, (char) (60364 - TextUtils.lastIndexOf("", '0')), (-1311065445) - KeyEvent.getDeadChar(0, 0), new char[]{28278, 3149, 64270, 35007, 28123, 22649, 61007, 30542, 7249, 30067, 16454, 54347, 51875, 26697, 29681}, objArr17);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (31533 - Gravity.getAbsoluteGravity(0, 0));
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 921;
                        int mirror = 'L' - AndroidCharacter.getMirror('0');
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[80];
                        Object[] objArr18 = new Object[1];
                        c(b10, bArr5[37], b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, offsetAfter, mirror, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31532);
                        int offsetAfter2 = 921 - TextUtils.getOffsetAfter("", 0);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                        byte b11 = $$a[37];
                        Object[] objArr19 = new Object[1];
                        c(b11, b11, (byte) ($$b - 1), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, offsetAfter2, tapTimeout, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i16 = IconCompatParcelizer + 51;
                    MediaBrowserCompat = i16 % 128;
                    int i17 = i16 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[3])[0];
        if (i19 != i18) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                while (i4 < strArr.length) {
                    int i20 = MediaBrowserCompat + 31;
                    IconCompatParcelizer = i20 % 128;
                    if (i20 % 2 == 0) {
                        arrayList.add(strArr[i4]);
                        i4 += 74;
                    } else {
                        arrayList.add(strArr[i4]);
                        i4++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i19));
        }
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[3])[0];
        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i22}, (String[]) objArr[4]};
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i23 = ~iUptimeMillis;
        int i24 = (~((-1650545510) | i23)) | 37770020;
        int i25 = ~(iUptimeMillis | 1736309623);
        int i26 = i21 + (((i24 | i25) * (-252)) - 1592777205) + ((i25 | (~(i23 | (-1612775490)))) * 252);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr20[0])[0] = i28 ^ (i28 << 5);
        mutableFloatState.setFloatValue(p0);
        int i29 = IconCompatParcelizer + 125;
        MediaBrowserCompat = i29 % 128;
        int i30 = i29 % 2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter p0) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setValue(p0);
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setValue(p0);
        }
        int i3 = MediaBrowserCompat + 97;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        RememberObserver rememberObserver;
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Object obj = this.asInterface;
        if (!(obj instanceof RememberObserver)) {
            int i2 = MediaBrowserCompat + 39;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            rememberObserver = null;
        } else {
            rememberObserver = (RememberObserver) obj;
        }
        if (rememberObserver != null) {
            int i4 = MediaBrowserCompat + 93;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            rememberObserver.onForgotten();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r1
  0x0025: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v15 java.lang.Object) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        Object obj;
        int i;
        RememberObserver rememberObserver;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 35;
        MediaBrowserCompat = i3 % 128;
        if (i3 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            obj = this.asInterface;
            int i4 = 81 / 0;
            if (obj instanceof RememberObserver) {
                i = IconCompatParcelizer + 35;
                MediaBrowserCompat = i % 128;
                rememberObserver = (RememberObserver) obj;
                if (i % 2 != 0) {
                    int i5 = 1 / 0;
                }
            } else {
                rememberObserver = null;
            }
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            obj = this.asInterface;
            if (obj instanceof RememberObserver) {
                i = IconCompatParcelizer + 35;
                MediaBrowserCompat = i % 128;
                rememberObserver = (RememberObserver) obj;
                if (i % 2 != 0) {
                    int i6 = 1 / 0;
                }
            } else {
                rememberObserver = null;
            }
        }
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
            int i7 = MediaBrowserCompat + 43;
            IconCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = IconCompatParcelizer + 79;
        MediaBrowserCompat = i9 % 128;
        int i10 = i9 % 2;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat;
        int i3 = i2 + 19;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        CoroutineScope coroutineScope = this.b;
        if (coroutineScope != null) {
            int i5 = i2 + 85;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineScope, (CancellationException) null);
        }
        this.b = null;
    }

    private final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault1(newUnratedRating p0) {
        int i = 2 % 2;
        newUnratedRating.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1 = p0.b(p0.INotificationSideChannel).TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        if (p0.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault3() == null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.handleMessage = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        }
        if (p0.getRemoteActionCompatParcelizer().getTuitionPaymentFragmentspecialinlinedviewModeldefault1() == null) {
            int i2 = IconCompatParcelizer + 83;
            MediaBrowserCompat = i2 % 128;
            if (i2 % 2 != 0) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.MediaBrowserCompatCallbackHandler = setSubscription.b(this.a);
                throw null;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.MediaBrowserCompatCallbackHandler = setSubscription.b(this.a);
        }
        if (p0.getRemoteActionCompatParcelizer().getD() != Precision.EXACT) {
            int i3 = IconCompatParcelizer + 9;
            MediaBrowserCompat = i3 % 128;
            if (i3 % 2 != 0) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.g = Precision.INEXACT;
                int i4 = 47 / 0;
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.g = Precision.INEXACT;
            }
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 p0) {
        RememberObserver rememberObserver;
        int i = 2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.d;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke = this.g.invoke(p0);
        TuitionPaymentFragmentbindingInflater1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke}, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1127860329, 1127860333);
        getOptionsList getoptionslistTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(getoptionslistTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null ? getoptionslistTuitionPaymentFragmentspecialinlinedviewModeldefault3 : tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke.TuitionPaymentFragmentbindingInflater1());
        if (this.b != null) {
            int i2 = MediaBrowserCompat + 13;
            IconCompatParcelizer = i2 % 128;
            RememberObserver rememberObserver2 = null;
            if (i2 % 2 == 0) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke.TuitionPaymentFragmentbindingInflater1();
                throw null;
            }
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1() != tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke.TuitionPaymentFragmentbindingInflater1()) {
                Object objTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                if (!(objTuitionPaymentFragmentbindingInflater1 instanceof RememberObserver)) {
                    rememberObserver = null;
                } else {
                    rememberObserver = (RememberObserver) objTuitionPaymentFragmentbindingInflater1;
                    int i3 = IconCompatParcelizer + 61;
                    MediaBrowserCompat = i3 % 128;
                    int i4 = i3 % 2;
                }
                if (rememberObserver != null) {
                    rememberObserver.onForgotten();
                    int i5 = IconCompatParcelizer + 43;
                    MediaBrowserCompat = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 5;
                    }
                }
                Object objTuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke.TuitionPaymentFragmentbindingInflater1();
                if (objTuitionPaymentFragmentbindingInflater2 instanceof RememberObserver) {
                    int i7 = IconCompatParcelizer + 105;
                    MediaBrowserCompat = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    rememberObserver2 = (RememberObserver) objTuitionPaymentFragmentbindingInflater2;
                }
                if (rememberObserver2 != null) {
                    rememberObserver2.onRemembered();
                }
            }
        }
        Function1<? super TuitionPaymentFragmentspecialinlinedviewModeldefault3, Unit> function1 = this.asBinder;
        if (function1 != null) {
            function1.invoke(tuitionPaymentFragmentspecialinlinedviewModeldefault3Invoke);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    private final getOptionsList TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3 p0, TuitionPaymentFragmentspecialinlinedviewModeldefault3 p1) {
        newPercentageRating newpercentageratingB;
        Painter painter;
        boolean z;
        int i = 2 % 2;
        Object obj = null;
        if (!(p1 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3.b)) {
            if (p1 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                newpercentageratingB = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) p1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            return null;
        }
        int i2 = MediaBrowserCompat + 85;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            newpercentageratingB = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) p1).b();
            int i3 = 92 / 0;
        } else {
            newpercentageratingB = ((TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) p1).b();
        }
        adjustVolume adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 = newpercentageratingB.getB().getMediaBrowserCompatCallbackHandler().TuitionPaymentFragmentspecialinlinedviewModeldefault2(sendRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1, newpercentageratingB);
        if (adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof onVolumeInfoChanged) {
            Painter painterTuitionPaymentFragmentbindingInflater1 = p0.TuitionPaymentFragmentbindingInflater1();
            if (p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                int i4 = MediaBrowserCompat + 57;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
                painter = painterTuitionPaymentFragmentbindingInflater1;
            } else {
                painter = null;
            }
            Painter painterTuitionPaymentFragmentbindingInflater2 = p1.TuitionPaymentFragmentbindingInflater1();
            ContentScale contentScale = this.a;
            onVolumeInfoChanged onvolumeinfochanged = (onVolumeInfoChanged) adjustvolumeTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i6 = onvolumeinfochanged.b;
            if (!(newpercentageratingB instanceof isThumbUp)) {
                z = true;
            } else {
                int i7 = MediaBrowserCompat + 31;
                IconCompatParcelizer = i7 % 128;
                if (i7 % 2 == 0) {
                    ((isThumbUp) newpercentageratingB).getA();
                    obj.hashCode();
                    throw null;
                }
                if (((isThumbUp) newpercentageratingB).getA()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return new getOptionsList(painter, painterTuitionPaymentFragmentbindingInflater2, contentScale, i6, z, onvolumeinfochanged.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return new MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1(r6.getTuitionPaymentFragmentspecialinlinedviewModeldefault2()), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r6 instanceof defpackage.newPercentageRating) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r6 = (defpackage.newPercentageRating) r6;
        r1 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r3 = defpackage.MediaBrowserCompatServiceBinderWrapper.IconCompatParcelizer + 95;
        defpackage.MediaBrowserCompatServiceBinderWrapper.MediaBrowserCompat = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        r1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r3 = new MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1, r6);
        r6 = defpackage.MediaBrowserCompatServiceBinderWrapper.IconCompatParcelizer + 97;
        defpackage.MediaBrowserCompatServiceBinderWrapper.MediaBrowserCompat = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r6 instanceof defpackage.isThumbUp) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r6 instanceof defpackage.isThumbUp) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r6 = (defpackage.isThumbUp) r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(defpackage.newStarRating r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.MediaBrowserCompatServiceBinderWrapper.IconCompatParcelizer
            int r1 = r1 + 27
            int r2 = r1 % 128
            defpackage.MediaBrowserCompatServiceBinderWrapper.MediaBrowserCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L17
            boolean r1 = r6 instanceof defpackage.isThumbUp
            r2 = 9
            int r2 = r2 / 0
            if (r1 == 0) goto L2d
            goto L1b
        L17:
            boolean r1 = r6 instanceof defpackage.isThumbUp
            if (r1 == 0) goto L2d
        L1b:
            isThumbUp r6 = (defpackage.isThumbUp) r6
            MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$b r0 = new MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$b
            android.graphics.drawable.Drawable r1 = r6.getTuitionPaymentFragmentspecialinlinedviewModeldefault2()
            androidx.compose.ui.graphics.painter.Painter r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1)
            r0.<init>(r1, r6)
            MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3 r0 = (MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3) r0
            return r0
        L2d:
            boolean r1 = r6 instanceof defpackage.newPercentageRating
            if (r1 == 0) goto L64
            newPercentageRating r6 = (defpackage.newPercentageRating) r6
            android.graphics.drawable.Drawable r1 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            r2 = 0
            if (r1 == 0) goto L4c
            int r3 = defpackage.MediaBrowserCompatServiceBinderWrapper.IconCompatParcelizer
            int r3 = r3 + 95
            int r4 = r3 % 128
            defpackage.MediaBrowserCompatServiceBinderWrapper.MediaBrowserCompat = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L48
            androidx.compose.ui.graphics.painter.Painter r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1)
            goto L4d
        L48:
            r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1)
            throw r2
        L4c:
            r1 = r2
        L4d:
            MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2 r3 = new MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault2
            r3.<init>(r1, r6)
            MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3 r3 = (MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3) r3
            int r6 = defpackage.MediaBrowserCompatServiceBinderWrapper.IconCompatParcelizer
            int r6 = r6 + 97
            int r1 = r6 % 128
            defpackage.MediaBrowserCompatServiceBinderWrapper.MediaBrowserCompat = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L60
            return r3
        L60:
            r2.hashCode()
            throw r2
        L64:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(newStarRating):MediaBrowserCompatServiceBinderWrapper$TuitionPaymentFragmentspecialinlinedviewModeldefault3");
    }

    private final Painter TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m4920BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.notify, 6, null);
        }
        processInMemoryCapture processinmemorycapture = new processInMemoryCapture(drawable.mutate());
        int i4 = MediaBrowserCompat + 83;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return processinmemorycapture;
    }

    static {
        write = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Function1() { // from class: MediaBrowserCompatSearchResultReceiver
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj);
            }
        };
        int i = connect + 75;
        write = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final ColorFilter asInterface() {
        ColorFilter colorFilter;
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 49;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            colorFilter = (ColorFilter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            int i3 = 10 / 0;
        } else {
            colorFilter = (ColorFilter) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        }
        int i4 = IconCompatParcelizer + 17;
        MediaBrowserCompat = i4 % 128;
        int i5 = i4 % 2;
        return colorFilter;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 65;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.onTransact.setValue(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            this.onTransact.setValue(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            throw null;
        }
    }

    public final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompat + 23;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        newUnratedRating newunratedrating = (newUnratedRating) this.cancelAll.getValue();
        int i3 = MediaBrowserCompat + 57;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return newunratedrating;
    }

    public final void TuitionPaymentFragmentbindingInflater1(newUnratedRating newunratedrating) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        this.cancelAll.setValue(newunratedrating);
        int i4 = MediaBrowserCompat + 113;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    public final writeToParcel b() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        writeToParcel writetoparcel = (writeToParcel) this.cancel.getValue();
        int i3 = MediaBrowserCompat + 81;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return writetoparcel;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(writeToParcel writetoparcel) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        MediaBrowserCompat = i2 % 128;
        if (i2 % 2 != 0) {
            this.cancel.setValue(writetoparcel);
            int i3 = 86 / 0;
        } else {
            this.cancel.setValue(writetoparcel);
        }
        int i4 = MediaBrowserCompat + 81;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        RememberObserver rememberObserver;
        MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        MediaBrowserCompat = i2 % 128;
        int i3 = i2 % 2;
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (mediaBrowserCompatServiceBinderWrapper.b == null) {
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(new getDataSpace(null).plus(Dispatchers.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
                mediaBrowserCompatServiceBinderWrapper.b = CoroutineScope;
                Object obj = mediaBrowserCompatServiceBinderWrapper.asInterface;
                if (obj instanceof RememberObserver) {
                    int i4 = MediaBrowserCompat + 23;
                    IconCompatParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                    rememberObserver = (RememberObserver) obj;
                } else {
                    rememberObserver = null;
                }
                if (rememberObserver != null) {
                    rememberObserver.onRemembered();
                }
                if (!mediaBrowserCompatServiceBinderWrapper.INotificationSideChannel) {
                    b.TuitionPaymentFragmentbindingInflater1(CoroutineScope, null, null, new AsyncImagePainter$onRemembered$1$1(mediaBrowserCompatServiceBinderWrapper, null), 3, null);
                } else {
                    newUnratedRating newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    Drawable drawableMediaBrowserCompat = newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault1.b(newunratedratingTuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannel).TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatServiceBinderWrapper.b().getTuitionPaymentFragmentbindingInflater1()).TuitionPaymentFragmentspecialinlinedviewModeldefault1().MediaBrowserCompat();
                    mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentspecialinlinedviewModeldefault3.C0004TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawableMediaBrowserCompat != null ? mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawableMediaBrowserCompat) : null));
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static final /* synthetic */ lambdastop3androidxcameravideointernalencoderEncoderImpl TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (lambdastop3androidxcameravideointernalencoderEncoderImpl) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{mediaBrowserCompatServiceBinderWrapper}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -443564746, 443564749);
    }

    public static final /* synthetic */ newUnratedRating b(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, newUnratedRating newunratedrating) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (newUnratedRating) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{mediaBrowserCompatServiceBinderWrapper, newunratedrating}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2461191, -2461185);
    }

    public static final /* synthetic */ void b(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{mediaBrowserCompatServiceBinderWrapper, tuitionPaymentFragmentspecialinlinedviewModeldefault3}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1170380119, 1170380120);
    }

    private final Painter d() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Painter) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1702995622, 1702995624);
    }

    private final void TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, tuitionPaymentFragmentspecialinlinedviewModeldefault3}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1127860329, 1127860333);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -912799434, 912799439);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        TuitionPaymentFragmentbindingInflater1(HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1862256908, -1862256908);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        INotificationSideChannelStubProxy = -6377398940819159759L;
        INotificationSideChannelStub = -981105359;
        RemoteActionCompatParcelizer = (char) 35878;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = defpackage.MediaBrowserCompatServiceBinderWrapper.$$c
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r8 = r8 + 102
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r6 = r6 + 1
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaBrowserCompatServiceBinderWrapper.$$g(int, int, byte):java.lang.String");
    }
}
