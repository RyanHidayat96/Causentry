package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.applyPixelShiftForYUV;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0002\u0013\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0017J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u001aJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u001dJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\r\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010\r\u001a\u00060\u001fR\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010\u0015\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010$\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010#\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0018\u0010,\u001a\u00020\u0002*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017"}, d2 = {"LapplyPixelShiftForYUV;", "LImageCaptureOutputFileOptionsBuilder;", "Ljava/io/File;", "p0", "LgetSaveCollection;", "p1", "Lcom/datadog/android/api/InternalLogger;", "p2", "LImageCaptureExternalSyntheticLambda5;", "p3", "<init>", "(Ljava/io/File;LgetSaveCollection;Lcom/datadog/android/api/InternalLogger;LImageCaptureExternalSyntheticLambda5;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Z)Ljava/io/File;", "", "TuitionPaymentFragmentbindingInflater1", "(Ljava/io/File;Z)J", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/util/List;)Ljava/util/List;", "b", "()Ljava/util/List;", "(Ljava/io/File;)Ljava/io/File;", "", "(Ljava/util/Set;)Ljava/io/File;", "()Ljava/io/File;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/io/File;J)Z", "()Z", "LgetSaveCollection;", "LapplyPixelShiftForYUV$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LapplyPixelShiftForYUV$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Lcom/datadog/android/api/InternalLogger;", "J", "asInterface", "g", "LImageCaptureExternalSyntheticLambda5;", "a", "asBinder", "Ljava/io/File;", "d", "onTransact", "cancelAll", "INotificationSideChannel"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class applyPixelShiftForYUV implements ImageCaptureOutputFileOptionsBuilder {
    private static int cancel;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private long b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long g;
    private File asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final getSaveCollection TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final File cancelAll;
    private long d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ImageCaptureExternalSyntheticLambda5 a;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final long asInterface;
    private static final byte[] $$c = {68, 83, 49, -116};
    private static final int $$f = 18;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 126, -84, 108, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -59, 6, 10, -13, 20, -14, 12, 7, -11, 72, -63, 7, 14, 1, 1, -11, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 3, 27, -5, 6, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
    private static final int $$e = 81;
    private static final byte[] $$a = {43, 23, 22, -14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 35;
    private static int INotificationSideChannelStubProxy = 0;
    private static int INotificationSideChannelDefault = 1;
    private static int INotificationSideChannel = 0;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i6) | i2);
        int i8 = ~((~i2) | i5);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i5) | i2));
        int i11 = i2 + i5 + i3 + (762724209 * i) + (1201824936 * i4);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i2) + 43253760 + (1339426419 * i5) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i3) + (1302855680 * i) + (1514143744 * i4) + (1905524736 * i12);
        int i14 = ((i2 * 162561953) - 555857873) + (i5 * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i3 * 162560975) + (i * 701011807) + (i4 * 237771736) + (i12 * (-223608832));
        return i13 + ((i14 * i14) * 703332352) != 1 ? TuitionPaymentFragmentbindingInflater1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.applyPixelShiftForYUV.$$a
            int r6 = r6 * 52
            int r6 = 53 - r6
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.applyPixelShiftForYUV.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 50
            int r7 = r7 * 49
            int r7 = 53 - r7
            byte[] r1 = defpackage.applyPixelShiftForYUV.$$d
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r0 = new byte[r0]
            int r6 = r6 + 49
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.applyPixelShiftForYUV.f(int, byte, byte, java.lang.Object[]):void");
    }

    public applyPixelShiftForYUV(File file, getSaveCollection getsavecollection, InternalLogger internalLogger, ImageCaptureExternalSyntheticLambda5 imageCaptureExternalSyntheticLambda5) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(imageCaptureExternalSyntheticLambda5, "");
        this.cancelAll = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getsavecollection;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.a = imageCaptureExternalSyntheticLambda5;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.g = MathKt.roundToLong(getsavecollection.g * 1.05d);
        this.asInterface = MathKt.roundToLong(getsavecollection.g * 0.95d);
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(File file) {
        int i = 2 % 2;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        if (StringsKt.toLongOrNull(name) != null) {
            int i2 = INotificationSideChannelStubProxy + 103;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = INotificationSideChannelStubProxy + 115;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return false;
    }

    public static final /* synthetic */ File TuitionPaymentFragmentspecialinlinedviewModeldefault3(applyPixelShiftForYUV applypixelshiftforyuv) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault;
        int i3 = i2 + 29;
        INotificationSideChannelStubProxy = i3 % 128;
        int i4 = i3 % 2;
        File file = applypixelshiftforyuv.cancelAll;
        int i5 = i2 + 21;
        INotificationSideChannelStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0177 A[PHI: r2
  0x0177: PHI (r2v13 java.io.File) = (r2v12 java.io.File), (r2v17 java.io.File) binds: [B:33:0x0175, B:30:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0181  */
    /* JADX WARN: Code duplicated, block: B:38:0x0195  */
    /* JADX WARN: Code duplicated, block: B:39:0x0197  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b1  */
    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0) throws Throwable {
        File file;
        File file2;
        long j;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z;
        boolean z2;
        File file3;
        int i = 2 % 2;
        File file4 = null;
        if (!((Boolean) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this}, -1095601241, SearchView9.b(), SearchView9.b(), 1095601241, SearchView9.b())).booleanValue()) {
            int i2 = INotificationSideChannelStubProxy + 119;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        if (System.currentTimeMillis() - this.b > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            int i4 = INotificationSideChannelDefault + 121;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            List<File> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            Iterator<T> it = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
            int i6 = INotificationSideChannelDefault + 25;
            INotificationSideChannelStubProxy = i6 % 128;
            int i7 = i6 % 2;
            final long jD = 0;
            while (!(!it.hasNext())) {
                jD += ImageCaptureOutputFileResults.d((File) it.next(), this.TuitionPaymentFragmentbindingInflater1);
            }
            final long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final long jLongValue = jD - j2;
            if (jLongValue > 0) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$freeSpaceIfNeeded$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "Too much disk space used (%d/%d): cleaning up to free %d bytes…", Arrays.copyOf(new Object[]{Long.valueOf(jD), Long.valueOf(j2), Long.valueOf(jLongValue)}, 3));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
                Iterator it2 = CollectionsKt.sorted(listTuitionPaymentFragmentspecialinlinedviewModeldefault1).iterator();
                while (it2.hasNext()) {
                    int i8 = INotificationSideChannelStubProxy + 69;
                    INotificationSideChannelDefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        file3 = (File) it2.next();
                        if (jLongValue > 0) {
                            jLongValue = (jLongValue - ((Long) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this, file3, true}, 333274945, SearchView9.b(), SearchView9.b(), -333274944, SearchView9.b())).longValue()) - ((Long) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this, TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3), false}, 333274945, SearchView9.b(), SearchView9.b(), -333274944, SearchView9.b())).longValue();
                            int i9 = INotificationSideChannelStubProxy + 85;
                            INotificationSideChannelDefault = i9 % 128;
                            int i10 = i9 % 2;
                        }
                    } else {
                        file3 = (File) it2.next();
                        if (jLongValue > 0) {
                            jLongValue = (jLongValue - ((Long) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this, file3, true}, 333274945, SearchView9.b(), SearchView9.b(), -333274944, SearchView9.b())).longValue()) - ((Long) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this, TuitionPaymentFragmentspecialinlinedviewModeldefault2(file3), false}, 333274945, SearchView9.b(), SearchView9.b(), -333274944, SearchView9.b())).longValue();
                            int i11 = INotificationSideChannelStubProxy + 85;
                            INotificationSideChannelDefault = i11 % 128;
                            int i12 = i11 % 2;
                        }
                    }
                }
            }
            this.b = System.currentTimeMillis();
        }
        if (p0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(true);
        }
        int i13 = INotificationSideChannelDefault + 15;
        INotificationSideChannelStubProxy = i13 % 128;
        if (i13 % 2 != 0) {
            file = (File) CollectionsKt.maxOrNull((Iterable) TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            int i14 = 77 / 0;
            if (file != null) {
                file2 = this.asBinder;
                j = this.d;
                if (Intrinsics.areEqual(file2, file)) {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, this.asInterface);
                    if (ImageCaptureOutputFileResults.d(file, this.TuitionPaymentFragmentbindingInflater1) < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = j < ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2 && z) {
                        int i15 = INotificationSideChannelStubProxy + 57;
                        INotificationSideChannelDefault = i15 % 128;
                        int i16 = i15 % 2;
                        if (z2) {
                            this.d = j + 1;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = System.currentTimeMillis();
                            file4 = file;
                        }
                    }
                }
            }
        } else {
            file = (File) CollectionsKt.maxOrNull((Iterable) TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            if (file != null) {
                file2 = this.asBinder;
                j = this.d;
                if (Intrinsics.areEqual(file2, file)) {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, this.asInterface);
                    if (ImageCaptureOutputFileResults.d(file, this.TuitionPaymentFragmentbindingInflater1) < this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (j < ((long) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b)) {
                    }
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i17 = INotificationSideChannelStubProxy + 57;
                        INotificationSideChannelDefault = i17 % 128;
                        int i18 = i17 % 2;
                        if (z2) {
                            this.d = j + 1;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = System.currentTimeMillis();
                            file4 = file;
                        }
                    }
                }
            }
        }
        return file4 == null ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(false) : file4;
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final List<File> b() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelDefault + 51;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        if (!((Boolean) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this}, -1095601241, iB2, SearchView9.b(), 1095601241, iB)).booleanValue()) {
            int i4 = INotificationSideChannelStubProxy + 59;
            INotificationSideChannelDefault = i4 % 128;
            if (i4 % 2 != 0) {
                return CollectionsKt.emptyList();
            }
            CollectionsKt.emptyList();
            throw null;
        }
        return CollectionsKt.sorted(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 3;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        if (((Boolean) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this}, -1095601241, iB2, SearchView9.b(), 1095601241, iB)).booleanValue()) {
            File file = this.cancelAll;
            int i4 = INotificationSideChannelDefault + 85;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            return file;
        }
        int i6 = INotificationSideChannelStubProxy + 69;
        INotificationSideChannelDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 30 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0159  */
    /* JADX WARN: Code duplicated, block: B:37:0x015a  */
    private static void e(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(cancel)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), Color.alpha(0) + 3291, 31 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 651, 44 - (ViewConfiguration.getPressedStateDuration() >> 16), -450685997, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 651 - TextUtils.indexOf("", "", 0), 44 - TextUtils.getTrimmedLength(""), -450685997, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            int i9 = $11 + 25;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File b(final File p0) {
        int i = 2 % 2;
        boolean z = true;
        int i2 = INotificationSideChannelDefault + 1;
        INotificationSideChannelStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!Intrinsics.areEqual(p0.getParent(), this.cancelAll.getPath())) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.DEBUG, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new BatchFileOrchestrator$getMetadataFile$1(p0, this), null, false, null);
        }
        String name = p0.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        if (StringsKt.toLongOrNull(name) != null) {
            int i4 = INotificationSideChannelDefault + 125;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            z = false;
        }
        if (z) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
        }
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$getMetadataFile$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String str = String.format(Locale.US, "The file provided is not a batch file: %s", Arrays.copyOf(new Object[]{p0.getPath()}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
        return null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        final applyPixelShiftForYUV applypixelshiftforyuv = (applyPixelShiftForYUV) objArr[0];
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(applypixelshiftforyuv.cancelAll, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1)) {
            if (!applypixelshiftforyuv.cancelAll.isDirectory()) {
                applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "The provided root file is not a directory: %s", Arrays.copyOf(new Object[]{applyPixelShiftForYUV.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0).getPath()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    {
                        super(0);
                    }
                }, null, false, null);
                return false;
            }
            if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault3(applypixelshiftforyuv.cancelAll, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1)) {
                return true;
            }
            applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "The provided root dir is not writable: %s", Arrays.copyOf(new Object[]{applyPixelShiftForYUV.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0).getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, null, false, null);
            return false;
        }
        synchronized (applypixelshiftforyuv.cancelAll) {
            if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(applypixelshiftforyuv.cancelAll, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1)) {
                return true;
            }
            if (ImageCaptureOutputFileResults.a(applypixelshiftforyuv.cancelAll, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1)) {
                return true;
            }
            applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator$isRootDirValid$3$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.US, "The provided root dir can't be created: %s", Arrays.copyOf(new Object[]{applyPixelShiftForYUV.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.this$0).getPath()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                {
                    super(0);
                }
            }, null, false, null);
            return false;
        }
    }

    private final File TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean p0) {
        int i = 2 % 2;
        File file = new File(this.cancelAll, String.valueOf(System.currentTimeMillis()));
        File file2 = this.asBinder;
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (file2 != null) {
            this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, new ImageCaptureExternalSyntheticLambda1(j, p0, this.d));
            int i2 = INotificationSideChannelStubProxy + 49;
            INotificationSideChannelDefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 % 5;
            }
        }
        this.asBinder = file;
        this.d = 1L;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = System.currentTimeMillis();
        int i4 = INotificationSideChannelStubProxy + 3;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(File p0, long p1) {
        int i = 2 % 2;
        int i2 = INotificationSideChannelStubProxy + 113;
        INotificationSideChannelDefault = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = p0.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        Long longOrNull = StringsKt.toLongOrNull(name);
        if ((longOrNull != null ? longOrNull.longValue() : 0L) >= jCurrentTimeMillis - p1) {
            return true;
        }
        int i4 = INotificationSideChannelStubProxy + 79;
        INotificationSideChannelDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements FileFilter {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            if (file == null) {
                return false;
            }
            return applyPixelShiftForYUV.TuitionPaymentFragmentspecialinlinedviewModeldefault1(file);
        }
    }

    @Override // defpackage.ImageCaptureOutputFileOptionsBuilder
    public final File b(Set<? extends File> p0) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        File file = null;
        Object obj = null;
        if (((Boolean) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this}, -1095601241, iB2, SearchView9.b(), 1095601241, iB)).booleanValue()) {
            List<File> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.sorted(TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
            this.b = System.currentTimeMillis();
            Iterator<T> it = listTuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
            while (it.hasNext()) {
                int i2 = INotificationSideChannelStubProxy + 73;
                INotificationSideChannelDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    p0.contains((File) it.next());
                    file.hashCode();
                    throw null;
                }
                Object next = it.next();
                File file2 = (File) next;
                if (!p0.contains(file2) && !TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, this.g)) {
                    obj = next;
                    break;
                }
            }
            file = (File) obj;
            int i3 = INotificationSideChannelDefault + 5;
            INotificationSideChannelStubProxy = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 26 / 0;
            }
        }
        return file;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        applyPixelShiftForYUV applypixelshiftforyuv = (applyPixelShiftForYUV) objArr[0];
        File file = (File) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1)) {
            long jD = ImageCaptureOutputFileResults.d(file, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1);
            if (!ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(file, applypixelshiftforyuv.TuitionPaymentFragmentbindingInflater1)) {
                int i2 = INotificationSideChannelStubProxy + 27;
                INotificationSideChannelDefault = i2 % 128;
                int i3 = i2 % 2;
                return 0L;
            }
            int i4 = INotificationSideChannelDefault + 65;
            INotificationSideChannelStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (zBooleanValue) {
                applypixelshiftforyuv.a.b(file, ImageCaptureBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE);
            }
            return Long.valueOf(jD);
        }
        int i6 = INotificationSideChannelDefault;
        int i7 = i6 + 43;
        INotificationSideChannelStubProxy = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 87;
        INotificationSideChannelStubProxy = i9 % 128;
        if (i9 % 2 == 0) {
            return 0L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<File> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        File file = this.cancelAll;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        InternalLogger internalLogger = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        File[] fileArr = (File[]) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, null, internalLogger, new Function1<File, File[]>() { // from class: com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final File[] invoke(File file2) {
                Intrinsics.checkNotNullParameter(file2, "");
                return file2.listFiles(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (fileArr == null) {
            int i2 = INotificationSideChannelStubProxy + 107;
            INotificationSideChannelDefault = i2 % 128;
            int i3 = i2 % 2;
            fileArr = new File[0];
        }
        List<File> list = ArraysKt.toList(fileArr);
        int i4 = INotificationSideChannelDefault + 97;
        INotificationSideChannelStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static File TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file) {
        int i = 2 % 2;
        String path = file.getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append("_metadata");
        File file2 = new File(sb.toString());
        int i2 = INotificationSideChannelDefault + 1;
        INotificationSideChannelStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return file2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final List<File> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<? extends File> p0) throws Throwable {
        Object[] objArr;
        long jLongValue;
        int i = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 37568);
            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
            int i2 = 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c((byte) (-b), bArr[7], (byte) (-b), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, iResolveSizeAndState, i2, -477065106, false, (String) objArr2[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(true, 153 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 21 - ImageFormat.getBitsPerPixel(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2, new char[]{1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(false, Color.rgb(0, 0, 0) + 16777372, (ViewConfiguration.getLongPressTimeout() >> 16) + 15, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr4);
        long jLongValue2 = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 37568);
            int iLastIndexOf = 624 - TextUtils.lastIndexOf("", '0', 0);
            int tapTimeout = 14 - (ViewConfiguration.getTapTimeout() >> 16);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, iLastIndexOf, tapTimeout, -976899241, false, (String) objArr5[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = INotificationSideChannelStubProxy + 3;
            INotificationSideChannelDefault = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 37567);
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 625;
                int i5 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b4, (byte) (-bArr2[5]), b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, packedPositionType, i5, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ((((~((-1031837163) | iIdentityHashCode)) | 276858080) * (-566)) - 388378552) + ((~(iIdentityHashCode | (-754979083))) * 566) + 1698785322;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            objArr = new Object[]{new int[]{i7}, new int[1], new int[]{i6}, strArr};
            int i11 = INotificationSideChannelStubProxy + 91;
            INotificationSideChannelDefault = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(false, 151 - TextUtils.lastIndexOf("", '0', 0), 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(false, Gravity.getAbsoluteGravity(0, 0) + 159, 18 - View.MeasureSpec.makeMeasureSpec(0, 0), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(false, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 151, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, 10 - TextUtils.lastIndexOf("", '0', 0), new char[]{'\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(false, (Process.myPid() >> 22) + ModuleDescriptor.MODULE_VERSION, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, TextUtils.getTrimmedLength("") + 6, new char[]{'\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(false, 125 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 64, 37 - Color.blue(0), new char[]{65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512, 65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29, 65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517, 65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(true, 122 - TextUtils.getCapsMode("", 0, 0), 65 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 54, new char[]{29, 65524, 65524, 30, 65524, 65518, 65518, 65519, 65522, 65521, '!', ' ', 65517, 65517, 28, ' ', 65519, 65516, 65520, 29, 65524, 65523, 65524, 65524, 65518, 65524, 29, 65519, 29, 65521, '!', 65522, 65520, 65518, 65521, 65518, 65517, 65519, '!', 65517, ' ', 29, 65515, '!', ' ', 65522, 29, 65520, 65515, 65521, 31, 28, 30, '!', 65521, 65515, 28, 65519, 65517, '!', 30, 65517, 65518, 65519}, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i13 = INotificationSideChannelStubProxy + 107;
            INotificationSideChannelDefault = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 1698785322};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[35];
                byte b6 = (byte) (b5 - 1);
                byte b7 = b5;
                Object[] objArr15 = new Object[1];
                f(b6, b7, b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr3[35];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr16 = new Object[1];
                f(b8, b9, b9, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr17[0])[0];
                int i16 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i17 = INotificationSideChannelStubProxy + 5;
                    INotificationSideChannelDefault = i17 % 128;
                    int i18 = i17 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarSize = (char) (37567 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 626;
                        int iMyTid = 14 - (Process.myTid() >> 22);
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[7];
                        Object[] objArr18 = new Object[1];
                        c(b10, (byte) (-bArr4[5]), b10, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarSize, packedPositionChild, iMyTid, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        e(true, 152 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "") + 22, 3 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        e(false, Color.red(0) + 156, Drawable.resolveOpacity(0, 0) + 15, 13 - View.combineMeasuredStates(0, 0), new char[]{65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5}, objArr20);
                        long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 37568);
                            int iKeyCodeFromString = 625 - KeyEvent.keyCodeFromString("");
                            int iIndexOf = TextUtils.indexOf("", "") + 14;
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr21 = new Object[1];
                            c(b11, b12, b12, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(gidForName, iKeyCodeFromString, iIndexOf, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 37567);
                            int keyRepeatDelay = 625 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i19 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b13 = bArr5[5];
                            Object[] objArr22 = new Object[1];
                            c((byte) (-b13), bArr5[7], (byte) (-b13), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(capsMode, keyRepeatDelay, i19, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i20 = INotificationSideChannelDefault + 103;
                INotificationSideChannelStubProxy = i20 % 128;
                int i21 = i20 % 2;
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            throw null;
        }
        int i22 = ((int[]) objArr[1])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int i25 = ~((~System.identityHashCode(this)) | 856490809);
        int i26 = i22 + ((34079280 | i25) * (-970)) + 1645635278 + ((i25 | 822411529) * 970);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr[1])[0] = i28 ^ (i28 << 5);
        Object[] objArr23 = {new int[]{i24}, new int[1], new int[]{i23}, strArr4};
        ArrayList arrayList2 = new ArrayList();
        for (File file : p0) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            Long longOrNull = StringsKt.toLongOrNull(name);
            if (longOrNull != null) {
                jLongValue = longOrNull.longValue();
            } else {
                int i29 = ((int[]) objArr23[1])[0];
                int i30 = i29 * i29;
                int i31 = -(278677511 * i29);
                int i32 = (((i30 & i31) + (i30 | i31)) - (~(-(i29 * 742099761)))) - 1;
                int i33 = (i32 ^ (-1382721776)) + (((-1382721776) & i32) << 1);
                int i34 = i33 >> 29;
                int i35 = ((i34 ^ (-15)) + ((i34 & (-15)) << 1)) / 8;
                int i36 = (i33 - (~((i35 & 1) + (i35 | 1)))) - 1;
                int i37 = ((i33 >> 16) - 131071) / 65536;
                int i38 = -(i36 ^ ((i37 ^ 1) + ((i37 & 1) << 1)));
                int i39 = (i38 ^ 3) + ((i38 & 3) << 1);
                int i40 = i39 >> 21;
                int i41 = (((i40 ^ (-4095)) + ((i40 & (-4095)) << 1)) / 2048) + 1;
                jLongValue = ((long) (372750 / (((-((i41 & 1) + (i41 | 1))) & i39) * 142))) - 875;
            }
            if (jLongValue < jCurrentTimeMillis - j) {
                int i42 = INotificationSideChannelStubProxy + 39;
                INotificationSideChannelDefault = i42 % 128;
                if (i42 % 2 == 0) {
                    ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(file, this.TuitionPaymentFragmentbindingInflater1);
                    throw null;
                }
                if (ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(file, this.TuitionPaymentFragmentbindingInflater1)) {
                    this.a.b(file, ImageCaptureBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                }
                if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2(file), this.TuitionPaymentFragmentbindingInflater1)) {
                    ImageCaptureOutputFileResults.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2(file), this.TuitionPaymentFragmentbindingInflater1);
                }
                file = null;
            }
            if (file != null) {
                arrayList2.add(file);
            }
        }
        ArrayList arrayList3 = arrayList2;
        int i43 = INotificationSideChannelDefault + 109;
        INotificationSideChannelStubProxy = i43 % 128;
        int i44 = i43 % 2;
        return arrayList3;
    }

    static {
        notify = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 51;
        notify = i % 128;
        int i2 = i % 2;
    }

    private final long TuitionPaymentFragmentbindingInflater1(File p0, boolean p1) {
        Object[] objArr = {this, p0, Boolean.valueOf(p1)};
        int iB = SearchView9.b();
        return ((Long) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), objArr, 333274945, SearchView9.b(), SearchView9.b(), -333274944, iB)).longValue();
    }

    private final boolean TuitionPaymentFragmentbindingInflater1() {
        int iB = SearchView9.b();
        int iB2 = SearchView9.b();
        return ((Boolean) TuitionPaymentFragmentbindingInflater1(SearchView9.b(), new Object[]{this}, -1095601241, iB2, SearchView9.b(), 1095601241, iB)).booleanValue();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        cancel = -83722409;
    }

    private static String $$g(int i, byte b, short s) {
        int i2 = 120 - s;
        byte[] bArr = $$c;
        int i3 = b * 4;
        int i4 = 4 - (i * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i2 = (-i2) + i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i4];
            i4++;
            i2 = (-i7) + i2;
            i5 = i6;
        }
    }
}
