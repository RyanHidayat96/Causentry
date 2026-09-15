package com.bpjstku.data.notification;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.notification.model.request.NotificationActionRequest;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.data.notification.model.response.NotificationItem;
import com.bpjstku.data.notification.model.response.NotificationListItem;
import com.bpjstku.data.notification.remote.NotificationApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.initSession;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.setVideoStabilizationMode;
import defpackage.share;
import defpackage.unbind;
import defpackage.unbindChildren;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/notification/NotificationDataStore;", "Lcom/bpjstku/data/notification/NotificationRepository;", "Lcom/bpjstku/data/notification/remote/NotificationApi;", "p0", "<init>", "(Lcom/bpjstku/data/notification/remote/NotificationApi;)V", "Lcom/bpjstku/data/notification/model/request/NotificationListRequest;", "LderiveCodec;", "Lcom/bpjstku/data/notification/model/response/NotificationListItem;", "getNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationListRequest;)LderiveCodec;", "Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;", "Lcom/bpjstku/data/notification/model/response/NotificationItem;", "deleteNotification", "(Lcom/bpjstku/data/notification/model/request/NotificationActionRequest;)LderiveCodec;", "readNotification", "LmergeChildrenConfigs;", "dbService", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "webService", "Lcom/bpjstku/data/notification/remote/NotificationApi;", "getWebService", "()Lcom/bpjstku/data/notification/remote/NotificationApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationDataStore implements NotificationRepository {
    public static final int $stable = 8;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static int b;
    private final mergeChildrenConfigs dbService;
    private final NotificationApi webService;
    private static final byte[] $$c = {36, -74, -79, -21};
    private static final int $$f = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, -3, -46, 11, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -8, 15, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69};
    private static final int $$e = 61;
    private static final byte[] $$a = {114, -115, 48, 84, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 3;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.bpjstku.data.notification.NotificationDataStore.$$a
            int r5 = 93 - r5
            int r7 = r7 * 3
            int r7 = 84 - r7
            int r6 = r6 * 15
            int r1 = r6 + 38
            byte[] r1 = new byte[r1]
            int r6 = r6 + 37
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.notification.NotificationDataStore.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 15
            int r7 = r7 + 84
            int r9 = r9 * 3
            int r9 = r9 + 50
            byte[] r0 = com.bpjstku.data.notification.NotificationDataStore.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r5 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.notification.NotificationDataStore.d(byte, int, int, java.lang.Object[]):void");
    }

    public NotificationDataStore(NotificationApi notificationApi) {
        Intrinsics.checkNotNullParameter(notificationApi, "");
        this.webService = notificationApi;
    }

    /* JADX INFO: renamed from: getWebService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ unbindChildren m7660getWebService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationApi webService = getWebService();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return webService;
        }
        throw null;
    }

    public final mergeChildrenConfigs getDbService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        mergeChildrenConfigs mergechildrenconfigs = this.dbService;
        int i5 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mergechildrenconfigs;
        }
        throw null;
    }

    public final NotificationApi getWebService() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationApi notificationApi = this.webService;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return notificationApi;
    }

    private static final NotificationListItem getNotification$lambda$1(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (NotificationListItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.bpjstku.data.notification.NotificationRepository
    public final deriveCodec<NotificationListItem> getNotification(NotificationListRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<NotificationListItem>> notification = getWebService().getNotification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(notification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.notification.NotificationDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDataStore.$r8$lambda$jdgPuCOUZvDU7ScjTP7Ayy4nciU((NotificationListItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.notification.NotificationDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return NotificationDataStore.m7659$r8$lambda$gSYZWOe4dh6oYFxneDXy41eMU(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static final NotificationItem deleteNotification$lambda$3(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (NotificationItem) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        NotificationItem notificationItem = (NotificationItem) function1.invoke(obj);
        int i3 = 54 / 0;
        return notificationItem;
    }

    @Override // com.bpjstku.data.notification.NotificationRepository
    public final deriveCodec<NotificationItem> deleteNotification(NotificationActionRequest p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<NotificationItem>> derivecodecDeleteNotification = getWebService().deleteNotification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecDeleteNotification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.notification.NotificationDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDataStore.$r8$lambda$avEyptVYoYIhoUusd8M3oKWmVEE((NotificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.notification.NotificationDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return NotificationDataStore.$r8$lambda$tFby8CCJMVF_klNBwl2FCt1tols(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return api23Impl;
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = TuitionPaymentFragmentbindingInflater1;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1);
                        int size = View.MeasureSpec.getSize(i3) + 1270;
                        int packedPositionType = ExpandableListView.getPackedPositionType(j) + 18;
                        byte b2 = (byte) ($$f & 31);
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, size, packedPositionType, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            int i9 = $11 + 67;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char c2 = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i11 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 3225, Gravity.getAbsoluteGravity(0, 0) + 13, 2133916302, false, $$g((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                        int i13 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22;
                        byte length2 = (byte) $$c.length;
                        byte b5 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, jumpTapTimeout, i13, 387247676, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41240), 1704 - ((byte) KeyEvent.getModifierMetaStateMask()), 20 - MotionEvent.axisFromString(""), -1434471773, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                int i14 = $11 + 55;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 5 / 4;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i17 = 0;
            loop3: while (true) {
                setvideostabilizationmode.b = i17;
                while (true) {
                    if (setvideostabilizationmode.b >= i5) {
                        break loop3;
                    }
                    int i18 = $10 + 39;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] << iArr[4]);
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    }
                }
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i17 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0213  */
    /* JADX WARN: Code duplicated, block: B:28:0x0215  */
    @Override // com.bpjstku.data.notification.NotificationRepository
    public final deriveCodec<NotificationItem> readNotification(NotificationActionRequest p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyTid = (char) (Process.myTid() >> 22);
            int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
            int fadingEdgeLength = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            byte b2 = $$a[7];
            Object[] objArr2 = new Object[1];
            a((byte) 89, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, pressedStateDuration, fadingEdgeLength, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 0, 22}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 14}, false, new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
            int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a((byte) 52, bArr[28], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, jumpTapTimeout, deadChar, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b3, bArr2[28], b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i4, i5, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = ~iIdentityHashCode;
            int i7 = (((634227318 + (((~(i6 | (-714104095))) | 754414323) * (-1042))) + (((-714104095) | iIdentityHashCode) * 521)) + ((((~(iIdentityHashCode | (-754414324))) | 73868001) | (~(i6 | (-33557773)))) * 521)) - 1872516531;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new int[]{37, 26, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new int[]{63, 18, 0, 10}, false, new byte[]{0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 65 / 0;
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
            c(new int[]{81, 16, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new int[]{97, 16, 0, 8}, false, new byte[]{0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1872516531};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[35];
                byte b5 = (byte) (-b4);
                Object[] objArr13 = new Object[1];
                d(b4, b5, (byte) (b5 + 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr3[35];
                Object[] objArr14 = new Object[1];
                d((byte) (b6 - 1), (byte) (-bArr3[14]), b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRed = (char) Color.red(0);
                        int iArgb = Color.argb(0, 0, 0, 0) + 876;
                        int i12 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr4 = $$a;
                        byte b7 = bArr4[7];
                        Object[] objArr16 = new Object[1];
                        a(b7, bArr4[28], b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, iArgb, i12, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new int[]{0, 22, 0, 22}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new int[]{22, 15, 0, 14}, false, new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0}, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int i13 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int i14 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a((byte) 52, bArr5[28], bArr5[7], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cArgb, i13, i14, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                            int scrollBarSize = 876 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            byte b8 = $$a[7];
                            Object[] objArr20 = new Object[1];
                            a((byte) 89, b8, b8, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, scrollBarSize, maximumFlingVelocity, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[2])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 != i15) {
            throw new RuntimeException(String.valueOf(i16));
        }
        int i17 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = ~iIdentityHashCode2;
        int i19 = i17 + 2029882472 + (((-497104002) | i18) * (-369)) + (((~((-537578111) | i18)) | (-497267882)) * (-369)) + (((~(iIdentityHashCode2 | 537578110)) | (-1034682112) | (~(i18 | (-163881)))) * 369);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr21[1])[0] = i21 ^ (i21 << 5);
        int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
        int i23 = i22 % 2;
        deriveCodec<Response<NotificationItem>> notification = getWebService().readNotification(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(notification, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.notification.NotificationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDataStore.$r8$lambda$xQ6zz7WoXGPiOd2RuAO9Iwg5w9s((NotificationItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.notification.NotificationDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return NotificationDataStore.$r8$lambda$h0QKB7ovibg4DjvPEEnBeBlLVFE(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        int i24 = ((int[]) objArr21[1])[0];
        int i25 = i24 * i24;
        int i26 = -(1301580047 * i24);
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        int i28 = -(i24 * (-1295595765));
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = (i29 ^ (-2099048279)) + (((-2099048279) & i29) << 1);
        int i31 = i30 >> 21;
        int i32 = ((((i31 | (-4095)) << 1) - (i31 ^ (-4095))) / 2048) + 1;
        int i33 = (i30 & i32) + (i32 | i30);
        int i34 = i30 >> 28;
        int i35 = ((i34 ^ (-31)) + ((i34 & (-31)) << 1)) / 16;
        int i36 = (-(i33 ^ (((i35 | 1) << 1) - (i35 ^ 1)))) + 1;
        int i37 = (((i36 >> 22) - 2047) / 1024) + 1;
        Intrinsics.checkNotNullExpressionValue(api23Impl, "26;25;14;2;map(...)".substring(12331 / ((i36 & (-((i37 & 1) + (i37 | 1)))) * 1121)));
        return api23Impl;
    }

    private static final NotificationItem readNotification$lambda$5(Function1 function1, Object obj) {
        NotificationItem notificationItem;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            notificationItem = (NotificationItem) function1.invoke(obj);
            int i3 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            notificationItem = (NotificationItem) function1.invoke(obj);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return notificationItem;
    }

    public static /* synthetic */ NotificationItem $r8$lambda$avEyptVYoYIhoUusd8M3oKWmVEE(NotificationItem notificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationItem notificationItemDeleteNotification$lambda$2 = deleteNotification$lambda$2(notificationItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return notificationItemDeleteNotification$lambda$2;
    }

    /* JADX INFO: renamed from: $r8$lambda$g-SYZWO-e4dh6oYFxneDXy41eMU, reason: not valid java name */
    public static /* synthetic */ NotificationListItem m7659$r8$lambda$gSYZWOe4dh6oYFxneDXy41eMU(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationListItem notification$lambda$1 = getNotification$lambda$1(function1, obj);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return notification$lambda$1;
    }

    public static /* synthetic */ NotificationItem $r8$lambda$h0QKB7ovibg4DjvPEEnBeBlLVFE(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return readNotification$lambda$5(function1, obj);
        }
        readNotification$lambda$5(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ NotificationListItem $r8$lambda$jdgPuCOUZvDU7ScjTP7Ayy4nciU(NotificationListItem notificationListItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationListItem notification$lambda$0 = getNotification$lambda$0(notificationListItem);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return notification$lambda$0;
    }

    public static /* synthetic */ NotificationItem $r8$lambda$tFby8CCJMVF_klNBwl2FCt1tols(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationItem notificationItemDeleteNotification$lambda$3 = deleteNotification$lambda$3(function1, obj);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            return notificationItemDeleteNotification$lambda$3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ NotificationItem $r8$lambda$xQ6zz7WoXGPiOd2RuAO9Iwg5w9s(NotificationItem notificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            return readNotification$lambda$4(notificationItem);
        }
        readNotification$lambda$4(notificationItem);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        b = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        b = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
    }

    private static final NotificationItem deleteNotification$lambda$2(NotificationItem notificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(notificationItem, "");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return notificationItem;
    }

    private static final NotificationListItem getNotification$lambda$0(NotificationListItem notificationListItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(notificationListItem, "");
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return notificationListItem;
        }
        throw null;
    }

    private static final NotificationItem readNotification$lambda$4(NotificationItem notificationItem) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(notificationItem, "");
        if (i3 != 0) {
            return notificationItem;
        }
        throw null;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{59710, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59709, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59758, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59749, 59773, 59757, 59733, 59750, 59744, 59752, 59753, 59699, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749, 59747, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59710, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59723, 59757, 59773, 59768, 59751, 59746, 59695, 59743, 59745, 59750, 59742, 59730, 59746, 59759, 59756, 59757, 59759, 59746, 59770, 59749, 59749, 59773};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r5 = 105 - r5
            byte[] r1 = com.bpjstku.data.notification.NotificationDataStore.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.notification.NotificationDataStore.$$g(byte, byte, byte):java.lang.String");
    }
}
