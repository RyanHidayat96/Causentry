package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.mlkit_common.zzlr;
import defpackage.ExperimentalAudioApi;
import defpackage.ExperimentalPersistentRecording;
import defpackage.FallbackStrategyRuleStrategy;
import defpackage.FileDescriptorOutputOptions;
import defpackage.FileDescriptorOutputOptionsBuilder;
import defpackage.FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder;
import defpackage.FileOutputOptions;
import defpackage.FileOutputOptionsBuilder;
import defpackage.FileOutputOptionsFileOutputOptionsInternal;
import defpackage.FileOutputOptionsFileOutputOptionsInternalBuilder;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.deInitSession;
import defpackage.findNearestHigherSupportedEncoderProfilesFor;
import defpackage.findNearestHigherSupportedQualityFor;
import defpackage.getProfiles;
import defpackage.higherQualityOrLowerThan;
import defpackage.higherQualityThan;
import defpackage.initSession;
import defpackage.isQualitySupported;
import defpackage.lowerQualityOrHigherThan;
import defpackage.lowerQualityThan;
import defpackage.newSequentialExecutor;
import defpackage.outputFormatToMuxerFormat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public class Picasso {
    public static final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AnonymousClass3(Looper.getMainLooper());
    private static volatile Picasso onTransact = null;
    private FileOutputOptionsBuilder INotificationSideChannel;
    private Map<Object, findNearestHigherSupportedEncoderProfilesFor> INotificationSideChannelStub;
    private Map<ImageView, lowerQualityOrHigherThan> INotificationSideChannelStubProxy;
    public final Bitmap.Config TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f871a;
    public final ReferenceQueue<Object> asBinder;
    public final List<FileOutputOptions> asInterface;
    final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b;
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2 cancel;
    private lowerQualityThan cancelAll;
    public volatile boolean d;
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 g;
    private isQualitySupported notify;

    public enum Priority {
        LOW,
        NORMAL,
        /* JADX INFO: Fake field, exist only in values array */
        HIGH
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: com.squareup.picasso.Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault1.4
            @Override // com.squareup.picasso.Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder b(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
                return fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder;
            }
        };

        FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder b(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    /* JADX INFO: renamed from: com.squareup.picasso.Picasso$3, reason: invalid class name */
    public static final class AnonymousClass3 extends Handler {
        public AnonymousClass3(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor = (findNearestHigherSupportedEncoderProfilesFor) message.obj;
                if (findnearesthighersupportedencoderprofilesfor.f902a.d) {
                    outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "canceled", findnearesthighersupportedencoderprofilesfor.d.b(), "target got garbage collected");
                }
                Picasso picasso = findnearesthighersupportedencoderprofilesfor.f902a;
                Reference reference = findnearesthighersupportedencoderprofilesfor.onTransact;
                picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3(reference != null ? reference.get() : null);
                return;
            }
            if (i != 8) {
                if (i == 13) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor2 = (findNearestHigherSupportedEncoderProfilesFor) list.get(i2);
                        Picasso picasso2 = findnearesthighersupportedencoderprofilesfor2.f902a;
                        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MemoryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(findnearesthighersupportedencoderprofilesfor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) ? picasso2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(findnearesthighersupportedencoderprofilesfor2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null;
                        if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                            picasso2.b(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1, LoadedFrom.MEMORY, findnearesthighersupportedencoderprofilesfor2, null);
                            if (picasso2.d) {
                                String strB = findnearesthighersupportedencoderprofilesfor2.d.b();
                                StringBuilder sb = new StringBuilder("from ");
                                sb.append(LoadedFrom.MEMORY);
                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "completed", strB, sb.toString());
                            }
                        } else {
                            picasso2.TuitionPaymentFragmentbindingInflater1(findnearesthighersupportedencoderprofilesfor2);
                            if (picasso2.d) {
                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Main", "resumed", findnearesthighersupportedencoderprofilesfor2.d.b());
                            }
                        }
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Unknown handler message received: ");
                sb2.append(message.what);
                throw new AssertionError(sb2.toString());
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ExperimentalAudioApi experimentalAudioApi = (ExperimentalAudioApi) list2.get(i3);
                Picasso picasso3 = experimentalAudioApi.d;
                findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor3 = experimentalAudioApi.TuitionPaymentFragmentbindingInflater1;
                List<findNearestHigherSupportedEncoderProfilesFor> list3 = experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                boolean z = (list3 == null || list3.isEmpty()) ? false : true;
                if (findnearesthighersupportedencoderprofilesfor3 != null || z) {
                    Uri uri = experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelDefault;
                    Exception exc = experimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Bitmap bitmap = experimentalAudioApi.INotificationSideChannel;
                    LoadedFrom loadedFrom = experimentalAudioApi.asInterface;
                    if (findnearesthighersupportedencoderprofilesfor3 != null) {
                        picasso3.b(bitmap, loadedFrom, findnearesthighersupportedencoderprofilesfor3, exc);
                    }
                    if (z) {
                        int size3 = list3.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            picasso3.b(bitmap, loadedFrom, list3.get(i4), exc);
                        }
                    }
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = picasso3.b;
                }
            }
        }

        public static /* synthetic */ void b() {
            newSequentialExecutor.b[0] = Class.forName("com.midtrans.sdk.corekit.models.snap.payment.GoPayPaymentRequest").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault1");
        }
    }

    private Picasso(Context context, lowerQualityThan lowerqualitythan, isQualitySupported isqualitysupported, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, List<FileOutputOptions> list, FileOutputOptionsBuilder fileOutputOptionsBuilder, Bitmap.Config config, boolean z, boolean z2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        this.cancelAll = lowerqualitythan;
        this.notify = isqualitysupported;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.g = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentbindingInflater1 = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new FileOutputOptionsFileOutputOptionsInternalBuilder(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new ExperimentalPersistentRecording(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new getProfiles(context));
        arrayList.add(new findNearestHigherSupportedQualityFor(context));
        arrayList.add(new higherQualityThan(context));
        arrayList.add(new NetworkRequestHandler(lowerqualitythan.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fileOutputOptionsBuilder));
        this.asInterface = Collections.unmodifiableList(arrayList);
        this.INotificationSideChannel = fileOutputOptionsBuilder;
        this.INotificationSideChannelStub = new WeakHashMap();
        this.INotificationSideChannelStubProxy = new WeakHashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        this.d = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.asBinder = referenceQueue;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(referenceQueue, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.cancel = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.start();
    }

    public static class TuitionPaymentFragmentbindingInflater1 {
        private static short[] INotificationSideChannel;
        higherQualityOrLowerThan TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 f872a;
        ExecutorService asBinder;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface;
        isQualitySupported b;
        boolean d;
        List<FileOutputOptions> g;
        private static final byte[] $$a = {1, 115, -83, 116};
        private static final int $$b = 109;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getInterfaceDescriptor = 0;
        private static int INotificationSideChannelStub = 1;
        private static int onTransact = 376783537;
        private static int notify = -1934795592;
        private static int cancel = -595813472;
        private static byte[] cancelAll = {24, -2, 28, -15, 46, 29, 28, 27, -24, 16, -53, -30, 8, -59, 35, 20, -11, 27, -57, -62, 90, 29, 28, 27, -24, 16, -53, -30, 9, -19, -19, 23, -31, -32, 19, -29, 17, -60, -58, -26, 29, 59, -52, 24, -26, 29, 91, -84, 32, 18, 25, -14, -43, 83, -29, -19, 17, 27, -12, 24, 20, -93, 80, -15, 13, -13, 17, 26, -11, 23, -32, 25, -54, -13, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, 30, -22, -11, 15, 24, -32, 16, -18, -28, -9, 58, -23, 24, -21, 24, -32, 21, -21, -14, 14, 24, -32, 16, -18, -28, -9, -60, 39, 27, -92, 92, -32, -17, 23, -32, 25, -22, -45, 44, 29, 28, 27, -24, 16, -21, -17, 29, -31, 48, -31, -27, 29, -9, -28, -3, 7, 23, -11, 24, 28, -27, 27, 19, -28, -21, -60, -13, 92, -28, -21, -28, -45, 83, -29, -19, 17, 27, -12, 24, 20, -93, 43, 13, -13, 17, -2, 9, -26, -41, 58, 23, 29, -47, 53, 29, -19, 23, -31, -32, 19, -29, 17, -60, -58, -26, 29, 59, 2, -9, 24, 29, -18, 11, -60, 57, -23, 24, -26, -26, -26, -26, -26, -26, -26, -26, -26};
        private static char[] INotificationSideChannelStubProxy = {57190, 60047, 60088, 60057, 60046, 60061, 57188, 57187, 60102, 57193, 60053, 60110, 57195, 57194, 57184, 60117, 60056, 60072, 60054, 60107, 60063, 60085, 57192, 57186, 60084, 60086, 60050, 60040, 60043, 60090, 60095, 60045, 57191, 60062, 57189, 60119, 60075, 60123, 60078, 60048, 60041, 60049, 60067, 60058, 60098, 60060, 60052, 60082, 60034};
        private static char INotificationSideChannelDefault = 57190;

        private static void c(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(notify)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2268;
                    int iMyPid = 33 - (Process.myPid() >> 22);
                    byte[] bArr = $$a;
                    byte b2 = bArr[0];
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iLastIndexOf, iMyPid, 1387473586, false, $$c((byte) (b2 - 1), (byte) (-b2), (byte) bArr.length), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                int i5 = iIntValue == -1 ? 1 : 0;
                long j = 0;
                if (i5 != 0) {
                    int i6 = $10;
                    int i7 = i6 + 7;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    byte[] bArr2 = cancelAll;
                    if (bArr2 != null) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        int i8 = i6 + 29;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = 0;
                        while (i10 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3358;
                                int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 19;
                                byte b3 = $$a[0];
                                byte b4 = (byte) (b3 - 1);
                                byte b5 = (byte) (-b3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iCombineMeasuredStates, i11, -1054011043, false, $$c(b4, b5, (byte) (b5 & 8)), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i10++;
                            j = 0;
                        }
                        bArr2 = bArr3;
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = cancelAll;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(onTransact)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int scrollBarSize = 2267 - (ViewConfiguration.getScrollBarSize() >> 8);
                                int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                                byte[] bArr5 = $$a;
                                byte b6 = bArr5[0];
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarSize, i12, 1387473586, false, $$c((byte) (b6 - 1), (byte) (-b6), (byte) bArr5.length), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) notify) ^ 3046761265686732006L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        iIntValue = (short) (((short) (((long) INotificationSideChannel[i3 + ((int) (((long) onTransact) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) notify) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i13 = $11 + 35;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) onTransact) ^ 3046761265686732006L)) + i5;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(cancel), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (55903 - TextUtils.lastIndexOf("", '0', 0));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2855;
                        int iLastIndexOf2 = 12 - TextUtils.lastIndexOf("", '0', 0);
                        byte b7 = $$a[0];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = (byte) (-b7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, packedPositionGroup, iLastIndexOf2, -1529949196, false, $$c(b8, b9, (byte) (b9 & 5)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr6 = cancelAll;
                    if (bArr6 != null) {
                        int length2 = bArr6.length;
                        byte[] bArr7 = new byte[length2];
                        for (int i15 = 0; i15 < length2; i15++) {
                            bArr7[i15] = (byte) (((long) bArr6[i15]) ^ 3046761265686732006L);
                        }
                        bArr6 = bArr7;
                    }
                    boolean z = bArr6 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            byte[] bArr8 = cancelAll;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr8[i16]) ^ 3046761265686732006L)) + s)) ^ b));
                        } else {
                            short[] sArr = INotificationSideChannel;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
            int i2;
            char c;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = INotificationSideChannelStubProxy;
            int i4 = 1770390596;
            if (cArr2 != null) {
                int i5 = $11 + 1;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int i8 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2266;
                            int iRed = 33 - Color.red(0);
                            byte b2 = $$a[0];
                            byte b3 = (byte) (b2 - 1);
                            byte b4 = (byte) (-b2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, i8, iRed, -1927765101, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i7++;
                        i4 = 1770390596;
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
            Object[] objArr3 = {Integer.valueOf(INotificationSideChannelDefault)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            char c2 = '\b';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 33;
                byte b5 = $$a[0];
                byte b6 = (byte) (b5 - 1);
                byte b7 = (byte) (-b5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(fadingEdgeLength, keyRepeatDelay, windowTouchSlop, -1927765101, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i9 = $10 + 83;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                } else {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        c = c2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = deinitsession;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = deinitsession;
                        objArr4[9] = deinitsession;
                        objArr4[c2] = Integer.valueOf(cCharValue);
                        objArr4[7] = deinitsession;
                        objArr4[6] = deinitsession;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = deinitsession;
                        objArr4[3] = deinitsession;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = deinitsession;
                        objArr4[0] = deinitsession;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cCombineMeasuredStates = (char) (49267 - View.combineMeasuredStates(0, 0));
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 3261;
                            int iRed2 = 30 - Color.red(0);
                            byte b8 = $$a[0];
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, iKeyCodeFromString, iRed2, -127612708, false, $$c((byte) (b8 - 1), (byte) (-b8), b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i10 = $10 + 97;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22877);
                                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 594;
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 17;
                                byte b9 = $$a[0];
                                byte b10 = (byte) (b9 - 1);
                                byte b11 = (byte) (-b9);
                                c = '\b';
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iIndexOf, packedPositionType, 1570859318, false, $$c(b10, b11, (byte) (b11 + 4)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                c = '\b';
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            c = '\b';
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                            } else {
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    c2 = c;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public TuitionPaymentFragmentbindingInflater1(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context.getApplicationContext();
            int i = INotificationSideChannelStub + 17;
            getInterfaceDescriptor = i % 128;
            int i2 = i % 2;
        }

        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int iB;
            int i7;
            int i8;
            Object obj;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            short scrollBarSize;
            byte jumpTapTimeout;
            int touchSlop;
            int i14 = 2 % 2;
            if (context != null) {
                int i15 = INotificationSideChannelStub;
                int i16 = ((i15 | 121) << 1) - (i15 ^ 121);
                getInterfaceDescriptor = i16 % 128;
                int i17 = i16 % 2;
                try {
                    int i18 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr = new Object[1];
                    c((i18 & (-1355925252)) + (i18 | (-1355925252)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 64, (short) ExpandableListView.getPackedPositionGroup(0L), (byte) TextUtils.indexOf("", "", 0, 0), 1697112488 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), objArr);
                    try {
                        Object[] objArr2 = {(String) objArr[0]};
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                        int i19 = iLastIndexOf * 866;
                        int i20 = INotificationSideChannelStub + 67;
                        getInterfaceDescriptor = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i21 = (i19 % (-27648)) % ((-865) << ((~((~iLastIndexOf) | (~i))) | 1355925210));
                            int i22 = -(~((iLastIndexOf ^ i) | (iLastIndexOf & i)));
                            i6 = i21 << (((i22 | 865) << 1) - (i22 ^ 865));
                        } else {
                            int i23 = ((i19 | (-1006689504)) << 1) - (i19 ^ (-1006689504));
                            int i24 = ~iLastIndexOf;
                            int i25 = ~i;
                            int i26 = ~((i24 & i25) | (i24 ^ i25));
                            int i27 = -(-(((i26 & 1355925210) | (1355925210 ^ i26)) * (-865)));
                            int i28 = (i23 & i27) + (i27 | i23);
                            int i29 = (~((iLastIndexOf ^ i) | (iLastIndexOf & i))) * 865;
                            i6 = ((i28 | i29) << 1) - (i29 ^ i28);
                        }
                        int i30 = ~i;
                        int i31 = ~((1355925210 & i30) | (1355925210 ^ i30));
                        int i32 = ~((iLastIndexOf & i30) | (i30 ^ iLastIndexOf));
                        int i33 = 865 * ((i32 & i31) | (i31 ^ i32));
                        int i34 = ((i6 | i33) << 1) - (i6 ^ i33);
                        int i35 = -ExpandableListView.getPackedPositionChild(0L);
                        int i36 = ((i35 | (-57)) << 1) - (i35 ^ (-57));
                        int threadPriority = Process.getThreadPriority(0);
                        int iB2 = zzlr.b();
                        int i37 = -(-(threadPriority * (-613)));
                        int i38 = (~(((-21) ^ threadPriority) | ((-21) & threadPriority))) | iB2;
                        int i39 = ~threadPriority;
                        int i40 = (((12300 | i37) << 1) - (12300 ^ i37)) + ((i38 | (~((i39 ^ 20) | (i39 & 20)))) * 614);
                        int i41 = ~iB2;
                        int i42 = ~((-21) | i41);
                        int i43 = ~(((-21) ^ threadPriority) | ((-21) & threadPriority));
                        int i44 = (i42 & i43) | (i42 ^ i43);
                        int i45 = ~((i41 ^ threadPriority) | (i41 & threadPriority));
                        int i46 = i40 + (((i44 & i45) | (i44 ^ i45)) * (-1228));
                        int i47 = (-21) | i39;
                        int i48 = ~((i41 & i47) | (i47 ^ i41));
                        int i49 = ~iB2;
                        int i50 = (i49 & 20) | (i49 ^ 20);
                        int i51 = ~((i50 & threadPriority) | (i50 ^ threadPriority));
                        Object[] objArr3 = new Object[1];
                        c(i34, i36, (short) (((i46 - (~(-(-(((i48 & i51) | (i48 ^ i51)) * 614))))) - 1) >> 6), (byte) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1697112519, objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                        int i52 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i53 = (i52 & 31) + (i52 | 31);
                        char[] cArr = {1, '\t', '-', 24, Typography.amp, 21, 15, Typography.dollar, '\r', 17, '\'', '/', 27, 19, '%', 0, 22, 7, 31, '\b', 19, ')', '/', 25, 16, ')', 31, Typography.quote, 4, 5, 13931};
                        int i54 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                        Object[] objArr4 = new Object[1];
                        e(i53, cArr, (byte) (((i54 | 111) << 1) - (i54 ^ 111)), objArr4);
                        try {
                            Object[] objArr5 = {(String) objArr4[0]};
                            int mode = View.MeasureSpec.getMode(0);
                            int i55 = ((mode | (-1355925212)) << 1) - ((-1355925212) ^ mode);
                            int i56 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i57 = ((i56 | (-55)) << 1) - (i56 ^ (-55));
                            short sMyPid = (short) (Process.myPid() >> 22);
                            byte maximumFlingVelocity = (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                            int i58 = getInterfaceDescriptor;
                            int i59 = (i58 ^ 123) + ((i58 & 123) << 1);
                            INotificationSideChannelStub = i59 % 128;
                            int i60 = -iCombineMeasuredStates;
                            if (i59 % 2 == 0) {
                                iB = zzlr.b();
                                i7 = (-716) % i60;
                            } else {
                                iB = zzlr.b();
                                i7 = (i60 * (-716)) + 110007933;
                            }
                            int i61 = ~i60;
                            int i62 = -(-((1697112519 | i61) * (-1434)));
                            int i63 = (i7 ^ i62) + ((i62 & i7) << 1);
                            int i64 = ~iB;
                            int i65 = ~((i64 ^ 1697112519) | (i64 & 1697112519));
                            int i66 = ~((i60 ^ 1697112519) | (i60 & 1697112519));
                            int i67 = (i65 ^ i66) | (i66 & i65);
                            int i68 = (i61 ^ (-1697112520)) | (i61 & (-1697112520));
                            int i69 = ~((i68 ^ iB) | (i68 & iB));
                            int i70 = i63 + (((i67 ^ i69) | (i67 & i69)) * 717);
                            int i71 = ~i60;
                            int i72 = (i71 & (-1697112520)) | (i71 ^ (-1697112520));
                            int i73 = ~((i64 & i72) | (i72 ^ i64));
                            int i74 = getInterfaceDescriptor + 93;
                            INotificationSideChannelStub = i74 % 128;
                            int i75 = i74 % 2;
                            int i76 = ~(i60 | 1697112519);
                            int i77 = 717 * ((i73 & i76) | (i73 ^ i76) | (~((1697112519 ^ iB) | (1697112519 & iB))));
                            Object[] objArr6 = new Object[1];
                            c(i55, i57, sMyPid, maximumFlingVelocity, ((i70 | i77) << 1) - (i70 ^ i77), objArr6);
                            Class<?> cls = Class.forName((String) objArr6[0]);
                            int i78 = getInterfaceDescriptor + 21;
                            INotificationSideChannelStub = i78 % 128;
                            int i79 = i78 % 2;
                            Object objNewInstance2 = cls.getDeclaredConstructor(String.class).newInstance(objArr5);
                            try {
                                int iRed = Color.red(0) - 1355925221;
                                int i80 = (-72) - (~(-Color.alpha(0)));
                                short s = (short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                byte capsMode = (byte) TextUtils.getCapsMode("", 0, 0);
                                int i81 = -(Process.myTid() >> 22);
                                int i82 = ((i81 | 1697112556) << 1) - (i81 ^ 1697112556);
                                Object[] objArr7 = new Object[1];
                                c(iRed, i80, s, capsMode, i82, objArr7);
                                Class<?> cls2 = Class.forName((String) objArr7[0]);
                                int i83 = 16 - (~Color.alpha(0));
                                char[] cArr2 = {'/', 31, '\b', '+', ',', 15, Typography.dollar, '.', '/', 31, 22, '.', '\b', '-', '/', 31, 13902};
                                int i84 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr8 = new Object[1];
                                e(i83, cArr2, (byte) ((i84 & 102) + (i84 | 102)), objArr8);
                                Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                                try {
                                    int i85 = (-1355925222) - (~(-(-(ViewConfiguration.getKeyRepeatDelay() >> 16))));
                                    int i86 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    int i87 = (i86 & (-71)) + (i86 | (-71));
                                    short scrollBarFadeDuration = (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                    int i88 = -(-Process.getGidForName(""));
                                    Object[] objArr9 = new Object[1];
                                    c(i85, i87, scrollBarFadeDuration, (byte) ((iLastIndexOf2 ^ 1) + ((iLastIndexOf2 & 1) << 1)), (i88 & 1697112557) + (i88 | 1697112557), objArr9);
                                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                                    int i89 = -ImageFormat.getBitsPerPixel(0);
                                    int iB3 = zzlr.b();
                                    int i90 = getInterfaceDescriptor;
                                    int i91 = (i90 ^ 77) + ((i90 & 77) << 1);
                                    INotificationSideChannelStub = i91 % 128;
                                    int i92 = i91 % 2;
                                    int i93 = i89 * (-1939);
                                    int i94 = (i93 ^ 1951575136) + ((i93 & 1951575136) << 1);
                                    int i95 = ~((1355925215 ^ i89) | (1355925215 & i89));
                                    int i96 = ~iB3;
                                    int i97 = ~((i96 ^ (-1355925216)) | (i96 & (-1355925216)));
                                    int i98 = i90 + 51;
                                    INotificationSideChannelStub = i98 % 128;
                                    if (i98 % 2 == 0) {
                                        int i99 = ~i89;
                                        i8 = (i94 / ((-970) % ((i95 ^ i97) | (i95 & i97)))) << (1940 << (~((i99 & (-1355925216)) | (i99 ^ (-1355925216)))));
                                    } else {
                                        int i100 = ((i95 ^ i97) | (i95 & i97)) * (-970);
                                        int i101 = (i94 ^ i100) + ((i100 & i94) << 1);
                                        int i102 = ~i89;
                                        int i103 = (~((i102 & (-1355925216)) | (i102 ^ (-1355925216)))) * 1940;
                                        i8 = ((i101 | i103) << 1) - (i103 ^ i101);
                                    }
                                    int i104 = ~i89;
                                    int i105 = 970 * ((~((i104 & 1355925215) | (i104 ^ 1355925215))) | (~((i96 & (-1355925216)) | (i96 ^ (-1355925216)))));
                                    int i106 = (i8 ^ i105) + ((i105 & i8) << 1);
                                    int i107 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int i108 = (i107 ^ (-80)) + ((i107 & (-80)) << 1);
                                    short sRed = (short) Color.red(0);
                                    byte deadChar = (byte) KeyEvent.getDeadChar(0, 0);
                                    int trimmedLength = TextUtils.getTrimmedLength("");
                                    int i109 = INotificationSideChannelStub;
                                    int i110 = (i109 & 71) + (i109 | 71);
                                    getInterfaceDescriptor = i110 % 128;
                                    int i111 = i110 % 2;
                                    int i112 = ~trimmedLength;
                                    int i113 = ~i;
                                    int i114 = ((trimmedLength * 934) - 1160957768) + ((-933) * ((-1697112579) | (~(i112 | i113))));
                                    int i115 = ~(((-1697112579) ^ i113) | ((-1697112579) & i113));
                                    Object obj2 = objNewInstance2;
                                    int i116 = ~((-1697112579) | trimmedLength);
                                    int i117 = ((i115 ^ i116) | (i116 & i115)) * 933;
                                    int i118 = ((i114 | i117) << 1) - (i117 ^ i114);
                                    int i119 = -(-((~((1697112578 & trimmedLength) | (trimmedLength ^ 1697112578))) * 933));
                                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                                    Object[] objArr10 = new Object[1];
                                    c(i106, i108, sRed, deadChar, i120, objArr10);
                                    try {
                                        Object[] objArr11 = {cls3.getMethod((String) objArr10[0], null).invoke(context, null), 64};
                                        int i121 = -Color.blue(0);
                                        int i122 = (i121 & (-1355925221)) + (i121 | (-1355925221));
                                        int i123 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                        int iB4 = zzlr.b();
                                        int i124 = (i123 * (-51)) - 3233;
                                        int i125 = ~iB4;
                                        int i126 = -(-((~((i125 ^ i123) | (i125 & i123) | (-61))) * 52));
                                        int i127 = (i124 & i126) + (i124 | i126);
                                        int i128 = ~((60 & i125) | (60 ^ i125));
                                        int i129 = ~((60 & i123) | (60 ^ i123));
                                        int i130 = (i128 & i129) | (i128 ^ i129);
                                        int i131 = ~iB4;
                                        int i132 = ~((i131 ^ i123) | (i131 & i123));
                                        int i133 = ((i130 & i132) | (i130 ^ i132)) * (-52);
                                        int i134 = (i127 & i133) + (i133 | i127);
                                        int i135 = ~i123;
                                        int i136 = INotificationSideChannelStub + 31;
                                        getInterfaceDescriptor = i136 % 128;
                                        int i137 = i136 % 2;
                                        int i138 = ~((i131 & i135) | (i135 ^ i131));
                                        int i139 = ~((i135 & (-61)) | (i135 ^ (-61)));
                                        int i140 = (i134 - (~(52 * ((i139 & i138) | (i138 ^ i139))))) - 1;
                                        short sIndexOf = (short) TextUtils.indexOf("", "", 0, 0);
                                        byte bResolveSize = (byte) View.resolveSize(0, 0);
                                        int i141 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                                        Object[] objArr12 = new Object[1];
                                        c(i122, i140, sIndexOf, bResolveSize, (i141 & 1697112591) + (i141 | 1697112591), objArr12);
                                        Class<?> cls4 = Class.forName((String) objArr12[0]);
                                        byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                        int i142 = (modifierMetaStateMask ^ 15) + ((modifierMetaStateMask & 15) << 1);
                                        char[] cArr3 = {'/', 31, '\b', '+', ',', 15, Typography.dollar, '.', '/', 31, '-', '\f', 4, '/'};
                                        int i143 = INotificationSideChannelStub;
                                        int i144 = (i143 & 19) + (i143 | 19);
                                        getInterfaceDescriptor = i144 % 128;
                                        int i145 = i144 % 2;
                                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                        Object[] objArr13 = new Object[1];
                                        e(i142, cArr3, (byte) ((iIndexOf ^ 124) + ((iIndexOf & 124) << 1)), objArr13);
                                        Object objInvoke2 = cls4.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                        int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                        int iB5 = zzlr.b();
                                        zzlr.b();
                                        int i146 = (-1939) * offsetBefore;
                                        int i147 = (i146 & 29130) + (i146 | 29130);
                                        int i148 = ~(((-31) & offsetBefore) | ((-31) ^ offsetBefore));
                                        int i149 = ~iB5;
                                        int i150 = (i148 | (~((i149 ^ 30) | (i149 & 30)))) * (-970);
                                        int i151 = ~offsetBefore;
                                        int i152 = (i147 & i150) + (i150 | i147) + ((~((i151 ^ 30) | (i151 & 30))) * 1940);
                                        int i153 = INotificationSideChannelStub;
                                        int i154 = (i153 ^ 107) + ((i153 & 107) << 1);
                                        getInterfaceDescriptor = i154 % 128;
                                        int i155 = i154 % 2;
                                        int i156 = 970 * ((~((i149 & 30) | (i149 ^ 30))) | (~(i151 | (-31))));
                                        int i157 = ((i152 | i156) << 1) - (i156 ^ i152);
                                        Object[] objArr14 = new Object[1];
                                        e(i157, new char[]{'-', '\b', 19, ')', '/', 25, 14, 16, 18, ',', '\b', 3, 31, '\f', '\b', 22, ' ', 14, 22, '+', ',', 15, Typography.dollar, '.', '/', 31, '-', '\f', 4, '/'}, (byte) (122 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr14);
                                        Class<?> cls5 = Class.forName((String) objArr14[0]);
                                        int i158 = 9 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                                        char[] cArr4 = {21, 27, 3, 17, 1, '\b', 5, '\'', Typography.quote, 26};
                                        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                        int i159 = INotificationSideChannelStub;
                                        int i160 = (i159 & 23) + (i159 | 23);
                                        getInterfaceDescriptor = i160 % 128;
                                        int i161 = i160 % 2;
                                        int i162 = ~(((-95) ^ i113) | ((-95) & i113));
                                        int i163 = ~((-95) | maxKeyCode);
                                        int i164 = (i162 & i163) | (i162 ^ i163);
                                        int i165 = ~((i30 ^ maxKeyCode) | (i30 & maxKeyCode));
                                        int i166 = ((maxKeyCode * 465) - 43522) + (((i164 & i165) | (i164 ^ i165)) * 464);
                                        int i167 = ~maxKeyCode;
                                        int i168 = (i167 & i) | (i ^ i167);
                                        int i169 = i166 + (((i168 & (-95)) | (i168 ^ (-95))) * (-464));
                                        int i170 = ~(((-95) & maxKeyCode) | ((-95) ^ maxKeyCode));
                                        int i171 = ~((maxKeyCode & i) | (maxKeyCode ^ i));
                                        int i172 = ((i171 & i170) | (i170 ^ i171)) * 464;
                                        Object[] objArr15 = new Object[1];
                                        e(i158, cArr4, (byte) ((i169 & i172) + (i172 | i169)), objArr15);
                                        Object[] objArr16 = (Object[]) cls5.getField((String) objArr15[0]).get(objInvoke2);
                                        int length = objArr16.length;
                                        int i173 = 0;
                                        while (true) {
                                            if (i173 < length) {
                                                int i174 = INotificationSideChannelStub;
                                                int i175 = (i174 ^ 113) + ((i174 & 113) << 1);
                                                getInterfaceDescriptor = i175 % 128;
                                                if (i175 % 2 != 0) {
                                                    obj = objArr16[i173];
                                                    int i176 = -(-View.resolveSize(1, 1));
                                                    int i177 = (i176 & (-1355925230)) + (i176 | (-1355925230));
                                                    i9 = 84;
                                                    i10 = i177;
                                                    i11 = 1;
                                                } else {
                                                    obj = objArr16[i173];
                                                    int i178 = -View.resolveSize(0, 0);
                                                    int i179 = ((i178 | (-1355925230)) << 1) - (i178 ^ (-1355925230));
                                                    i9 = -89;
                                                    i10 = i179;
                                                    i11 = 0;
                                                }
                                                int iBlue = Color.blue(i11);
                                                int iB6 = zzlr.b();
                                                int i180 = getInterfaceDescriptor + 95;
                                                INotificationSideChannelStub = i180 % 128;
                                                int i181 = i180 % 2;
                                                int i182 = ~iBlue;
                                                int i183 = ~iB6;
                                                Object[] objArr17 = objArr16;
                                                int i184 = ~((i182 ^ i183) | (i182 & i183));
                                                int i185 = ~((i182 ^ i9) | (i182 & i9));
                                                int i186 = (i184 ^ i185) | (i184 & i185);
                                                int i187 = ~i9;
                                                int i188 = i187 | iBlue;
                                                int i189 = length;
                                                int i190 = ~((i188 ^ iB6) | (i188 & iB6));
                                                int i191 = (((iBlue * 714) + (i9 * (-712))) - (~(-(-(((i186 ^ i190) | (i186 & i190)) * (-713)))))) - 1;
                                                int i192 = (i187 ^ iBlue) | (i187 & iBlue);
                                                int i193 = (~((i192 & iB6) | (i192 ^ iB6))) * 1426;
                                                int i194 = (i191 ^ i193) + ((i193 & i191) << 1);
                                                int i195 = ~i9;
                                                int i196 = (~((i195 & i183) | (i195 ^ i183))) * 713;
                                                int i197 = (i194 ^ i196) + ((i196 & i194) << 1);
                                                short deadChar2 = (short) KeyEvent.getDeadChar(0, 0);
                                                byte offsetBefore2 = (byte) TextUtils.getOffsetBefore("", 0);
                                                int i198 = -ExpandableListView.getPackedPositionChild(0L);
                                                int i199 = (i198 ^ 1697112622) + ((i198 & 1697112622) << 1);
                                                Object[] objArr18 = new Object[1];
                                                c(i10, i197, deadChar2, offsetBefore2, i199, objArr18);
                                                try {
                                                    Object[] objArr19 = {(String) objArr18[0]};
                                                    int i200 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    int i201 = i200 * (-494);
                                                    int i202 = (i201 ^ (-187843942)) + ((i201 & (-187843942)) << 1);
                                                    int i203 = (~(((-1355925211) & i200) | (i200 ^ (-1355925211)))) * (-495);
                                                    int i204 = (i202 & i203) + (i203 | i202);
                                                    int i205 = -(-(((i200 ^ i30) | (i200 & i30)) * 495));
                                                    int i206 = (i204 ^ i205) + ((i205 & i204) << 1);
                                                    int i207 = ~((~i200) | 1355925210);
                                                    int i208 = ~((i200 & i30) | (i30 ^ i200));
                                                    int i209 = -(-(((i208 & i207) | (i207 ^ i208)) * 495));
                                                    int i210 = (i206 & i209) + (i209 | i206);
                                                    int i211 = -TextUtils.indexOf("", "");
                                                    int i212 = (i211 ^ (-57)) + ((i211 & (-57)) << 1);
                                                    int i213 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    int i214 = ~i213;
                                                    int i215 = ~(i214 | i);
                                                    int i216 = ~((i30 ^ i213) | (i30 & i213));
                                                    int i217 = (i213 * (-919)) + 919 + (((i215 & i216) | (i215 ^ i216)) * 920);
                                                    int i218 = ~i213;
                                                    int i219 = (i217 - (~(-(-(((~(i218 | i113)) | (~i218)) * 920))))) - 1;
                                                    int i220 = ~((i214 & i30) | (i214 ^ i30));
                                                    int i221 = ~(((-1) ^ i) | i);
                                                    int i222 = (i220 & i221) | (i220 ^ i221);
                                                    int i223 = ~((i213 & i) | (i213 ^ i));
                                                    int i224 = -(-(((i223 & i222) | (i222 ^ i223)) * 920));
                                                    short s2 = (short) (((i219 | i224) << 1) - (i224 ^ i219));
                                                    int i225 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                    int i226 = -Gravity.getAbsoluteGravity(0, 0);
                                                    int i227 = i226 * (-1335);
                                                    int i228 = ((i227 | 1897243935) << 1) - (i227 ^ 1897243935);
                                                    int i229 = (i226 ^ i) | (i226 & i);
                                                    int i230 = ~i229;
                                                    int i231 = (((-1697112628) ^ i230) | (i230 & (-1697112628))) * (-668);
                                                    int i232 = (i228 & i231) + (i228 | i231);
                                                    int i233 = -(-((i226 | (~((-1697112628) | i))) * 1336));
                                                    int i234 = (i232 & i233) + (i233 | i232) + ((((-1697112628) & i229) | (i229 ^ (-1697112628))) * 668);
                                                    Object[] objArr20 = new Object[1];
                                                    c(i210, i212, s2, (byte) ((i225 ^ (-1)) + (i225 << 1)), i234, objArr20);
                                                    Class<?> cls6 = Class.forName((String) objArr20[0]);
                                                    int i235 = -View.getDefaultSize(0, 0);
                                                    Object[] objArr21 = new Object[1];
                                                    e((i235 & 11) + (i235 | 11), new char[]{'/', 31, 5, '+', '\r', 24, '\b', 1, '\t', 17, 13940}, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 117), objArr21);
                                                    Object objInvoke3 = cls6.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                                                    try {
                                                        int iRed2 = Color.red(0);
                                                        int iB7 = zzlr.b();
                                                        int i236 = iRed2 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                                        int i237 = (i236 & 32695) + (i236 | 32695);
                                                        int i238 = (iRed2 ^ 65) | (iRed2 & 65);
                                                        int i239 = i238 * (-502);
                                                        int i240 = ((i237 | i239) << 1) - (i237 ^ i239);
                                                        int i241 = ~iRed2;
                                                        int i242 = ~((i241 ^ (-66)) | (i241 & (-66)));
                                                        int i243 = i173;
                                                        int i244 = ~iB7;
                                                        int i245 = ~((i241 ^ i244) | (i241 & i244));
                                                        int i246 = (i242 ^ i245) | (i245 & i242);
                                                        int i247 = ~((i238 ^ iB7) | (i238 & iB7));
                                                        int i248 = -(-(((i246 ^ i247) | (i246 & i247)) * (-502)));
                                                        int i249 = ~iRed2;
                                                        int i250 = (i244 & i249) | (i249 ^ i244);
                                                        Object[] objArr22 = new Object[1];
                                                        e(27 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), new char[]{'-', '\b', 19, ')', '/', 25, 14, 16, 18, ',', '\b', 3, 31, '\f', '\b', 22, ' ', 14, 16, 18, 24, '/', '\b', '-', 2, 5, '/', '('}, (byte) (((((i240 | i248) << 1) - (i240 ^ i248)) - (~(((~((i250 & 65) | (i250 ^ 65))) | (~(iB7 | i238))) * TypedValues.PositionType.TYPE_DRAWPATH))) - 1), objArr22);
                                                        Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                        int i251 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1355925203;
                                                        int i252 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                        int i253 = (i252 ^ (-83)) + ((i252 & (-83)) << 1);
                                                        short s3 = (short) (0 - (~(-(-TextUtils.lastIndexOf("", '0', 0, 0)))));
                                                        byte mode2 = (byte) View.MeasureSpec.getMode(0);
                                                        int i254 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        Object[] objArr23 = new Object[1];
                                                        c(i251, i253, s3, mode2, (i254 & 1697112664) + (i254 | 1697112664), objArr23);
                                                        try {
                                                            Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr23[0], null).invoke(obj, null))};
                                                            Object[] objArr25 = new Object[1];
                                                            c(TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 1355925211, (-58) - (~(-(-ExpandableListView.getPackedPositionGroup(0L)))), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), 1697112626 - (~(-(-TextUtils.indexOf("", "", 0)))), objArr25);
                                                            Class<?> cls8 = Class.forName((String) objArr25[0]);
                                                            int trimmedLength2 = TextUtils.getTrimmedLength("");
                                                            int i255 = (trimmedLength2 * 522) - 9880;
                                                            int i256 = -(-(((~(i113 | 19)) | trimmedLength2) * (-1042)));
                                                            int i257 = ((i255 | i256) << 1) - (i255 ^ i256);
                                                            int i258 = -(-(((i ^ 19) | (i & 19)) * 521));
                                                            int i259 = ((i257 | i258) << 1) - (i258 ^ i257);
                                                            int i260 = ~((~trimmedLength2) | (-20));
                                                            int i261 = ~trimmedLength2;
                                                            int i262 = ~((i261 & i) | (i261 ^ i));
                                                            int i263 = (i260 & i262) | (i260 ^ i262);
                                                            int i264 = (trimmedLength2 & i30) | (i30 ^ trimmedLength2);
                                                            int i265 = ~((i264 & 19) | (i264 ^ 19));
                                                            int i266 = -(-(((i265 & i263) | (i263 ^ i265)) * 521));
                                                            int i267 = (i259 ^ i266) + ((i266 & i259) << 1);
                                                            char[] cArr5 = {'/', 31, '\f', 31, Typography.dollar, '/', 5, 29, 5, 30, Typography.dollar, 5, '!', '\f', 23, 19, 1, '\b', 13850};
                                                            int i268 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                            int i269 = (i268 * 465) - 12038;
                                                            int i270 = ~(((-27) ^ i30) | ((-27) & i30));
                                                            int i271 = ~(((-27) ^ i268) | ((-27) & i268));
                                                            int i272 = (i270 ^ i271) | (i271 & i270);
                                                            int i273 = ~((i30 ^ i268) | (i30 & i268));
                                                            int i274 = ((i272 ^ i273) | (i272 & i273)) * 464;
                                                            int i275 = (i269 & i274) + (i269 | i274);
                                                            int i276 = (~i268) | i;
                                                            int i277 = -(-(((i276 & (-27)) | (i276 ^ (-27))) * (-464)));
                                                            int i278 = (i275 & i277) + (i277 | i275);
                                                            int i279 = ~(((-27) ^ i268) | ((-27) & i268));
                                                            int i280 = ~(i268 | i);
                                                            int i281 = ((i280 & i279) | (i279 ^ i280)) * 464;
                                                            Object[] objArr26 = new Object[1];
                                                            e(i267, cArr5, (byte) ((i278 ^ i281) + ((i281 & i278) << 1)), objArr26);
                                                            Object objInvoke4 = cls8.getMethod((String) objArr26[0], InputStream.class).invoke(objInvoke3, objArr24);
                                                            try {
                                                                int threadPriority2 = Process.getThreadPriority(0);
                                                                int iB8 = zzlr.b();
                                                                int i282 = threadPriority2 * (-209);
                                                                int i283 = ((-4180) ^ i282) + ((i282 & (-4180)) << 1);
                                                                int i284 = ~threadPriority2;
                                                                int i285 = (~(((-21) ^ i284) | ((-21) & i284))) * 210;
                                                                int i286 = ((i283 | i285) << 1) - (i283 ^ i285);
                                                                int i287 = ~iB8;
                                                                int i288 = ~((i287 & i284) | (i284 ^ i287));
                                                                int i289 = ~(((-21) ^ iB8) | ((-21) & iB8));
                                                                int i290 = i286 + (((i288 & i289) | (i288 ^ i289)) * 210);
                                                                int i291 = ~iB8;
                                                                int i292 = ~(threadPriority2 | (i291 & (-21)) | ((-21) ^ i291));
                                                                int i293 = (i284 & 20) | (i284 ^ 20);
                                                                int i294 = ~((iB8 & i293) | (i293 ^ iB8));
                                                                int i295 = ((i292 & i294) | (i292 ^ i294)) * 210;
                                                                int i296 = -(((i290 & i295) + (i295 | i290)) >> 6);
                                                                int i297 = ((i296 | 34) << 1) - (i296 ^ 34);
                                                                char[] cArr6 = {Typography.dollar, '0', 29, '-', 20, 22, 30, 19, 5, '\'', 22, 5, '+', 20, 19, 30, Typography.dollar, 5, 14, '+', '\f', 18, 2, '\t', '(', '/', 5, 22, '\f', '!', 15, ',', 5, 29};
                                                                int threadPriority3 = Process.getThreadPriority(0);
                                                                int iB9 = zzlr.b();
                                                                int i298 = -(-(threadPriority3 * (-103)));
                                                                int i299 = (((-2060) | i298) << 1) - (i298 ^ (-2060));
                                                                int i300 = ~threadPriority3;
                                                                int i301 = ~(((-21) ^ i300) | (i300 & (-21)));
                                                                int i302 = ~threadPriority3;
                                                                int i303 = ~((i302 ^ iB9) | (i302 & iB9));
                                                                int i304 = i299 + (((i301 ^ i303) | (i301 & i303)) * 104);
                                                                int i305 = (~iB9) | 20;
                                                                int i306 = -(-((~((threadPriority3 & i305) | (i305 ^ threadPriority3))) * (-104)));
                                                                byte b = (byte) (((((((i304 | i306) << 1) - (i306 ^ i304)) - (~(((iB9 & 20) | (iB9 ^ 20)) * 104))) - 1) >> 6) + 106);
                                                                Object[] objArr27 = new Object[1];
                                                                e(i297, cArr6, b, objArr27);
                                                                Class<?> cls9 = Class.forName((String) objArr27[0]);
                                                                int i307 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                                Object[] objArr28 = new Object[1];
                                                                c((i307 & (-1355925214)) + (i307 | (-1355925214)), (-71) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) TextUtils.getOffsetBefore("", 0), (byte) View.getDefaultSize(0, 0), 1697112672 - (~View.combineMeasuredStates(0, 0)), objArr28);
                                                                if (!objNewInstance.equals(cls9.getMethod((String) objArr28[0], null).invoke(objInvoke4, null))) {
                                                                    int i308 = getInterfaceDescriptor;
                                                                    int i309 = i308 + 21;
                                                                    INotificationSideChannelStub = i309 % 128;
                                                                    int i310 = i309 % 2;
                                                                    int i311 = i308 + 11;
                                                                    INotificationSideChannelStub = i311 % 128;
                                                                    int i312 = i311 % 2;
                                                                    try {
                                                                        int iRgb = Color.rgb(0, 0, 0) + 16777250;
                                                                        char[] cArr7 = {Typography.dollar, '0', 29, '-', 20, 22, 30, 19, 5, '\'', 22, 5, '+', 20, 19, 30, Typography.dollar, 5, 14, '+', '\f', 18, 2, '\t', '(', '/', 5, 22, '\f', '!', 15, ',', 5, 29};
                                                                        int i313 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                        int iB10 = zzlr.b();
                                                                        int i314 = i313 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                                                        int i315 = (i314 & 52815) + (i314 | 52815);
                                                                        int i316 = getInterfaceDescriptor;
                                                                        int i317 = (i316 ^ 115) + ((i316 & 115) << 1);
                                                                        INotificationSideChannelStub = i317 % 128;
                                                                        if (i317 % 2 == 0) {
                                                                            i12 = i315 + (((i313 ^ 105) | (i313 & 105)) * (-502));
                                                                        } else {
                                                                            int i318 = (i313 | 105) * (-502);
                                                                            i12 = (i315 ^ i318) + ((i315 & i318) << 1);
                                                                        }
                                                                        int i319 = ~i313;
                                                                        int i320 = ~((i319 & (-106)) | (i319 ^ (-106)));
                                                                        int i321 = ~i313;
                                                                        int i322 = ~iB10;
                                                                        int i323 = ~((i321 ^ i322) | (i321 & i322));
                                                                        int i324 = (i320 ^ i323) | (i320 & i323);
                                                                        int i325 = ~(i313 | 105 | iB10);
                                                                        int i326 = (i12 - (~(-(-((-502) * ((i324 ^ i325) | (i324 & i325))))))) - 1;
                                                                        int i327 = ~i313;
                                                                        int i328 = (i327 & i322) | (i327 ^ i322);
                                                                        int i329 = ~((i328 & 105) | (i328 ^ 105));
                                                                        int i330 = (i313 ^ 105) | (i313 & 105);
                                                                        int i331 = ~((i330 & iB10) | (i330 ^ iB10));
                                                                        int i332 = -(-(((i329 & i331) | (i329 ^ i331)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                                        Object[] objArr29 = new Object[1];
                                                                        e(iRgb, cArr7, (byte) ((i326 & i332) + (i326 | i332)), objArr29);
                                                                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                                                                        int i333 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                                                        int i334 = ((i333 | (-1355925216)) << 1) - (i333 ^ (-1355925216));
                                                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                                                        int i335 = INotificationSideChannelStub;
                                                                        int i336 = (i335 ^ 89) + ((i335 & 89) << 1);
                                                                        getInterfaceDescriptor = i336 % 128;
                                                                        int i337 = -iNormalizeMetaState;
                                                                        int i338 = i337 | (-71);
                                                                        if (i336 % 2 != 0) {
                                                                            i13 = (i338 << 1) - (i337 ^ (-71));
                                                                            scrollBarSize = (short) (ViewConfiguration.getScrollBarSize() - 43);
                                                                            jumpTapTimeout = (byte) (ViewConfiguration.getJumpTapTimeout() >>> 113);
                                                                            touchSlop = ViewConfiguration.getTouchSlop() - 21;
                                                                        } else {
                                                                            i13 = (i338 << 1) - (i337 ^ (-71));
                                                                            scrollBarSize = (short) (ViewConfiguration.getScrollBarSize() >> 8);
                                                                            jumpTapTimeout = (byte) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                            touchSlop = ViewConfiguration.getTouchSlop() >> 8;
                                                                        }
                                                                        int i339 = i13;
                                                                        Object[] objArr30 = new Object[1];
                                                                        c(i334, i339, scrollBarSize, jumpTapTimeout, 1697112672 - (~touchSlop), objArr30);
                                                                        Object objInvoke5 = cls10.getMethod((String) objArr30[0], null).invoke(objInvoke4, null);
                                                                        Object obj3 = obj2;
                                                                        if (!obj3.equals(objInvoke5)) {
                                                                            i173 = i243 + 1;
                                                                            obj2 = obj3;
                                                                            objArr16 = objArr17;
                                                                            length = i189;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                int i340 = i ^ 1;
                                                                Object[] objArr31 = new Object[4];
                                                                int[] iArr = new int[1];
                                                                objArr31[0] = iArr;
                                                                int[] iArr2 = new int[1];
                                                                objArr31[1] = iArr2;
                                                                int[] iArr3 = new int[1];
                                                                objArr31[2] = iArr3;
                                                                int i341 = getInterfaceDescriptor;
                                                                int i342 = (i341 & 11) + (i341 | 11);
                                                                int i343 = i342 % 128;
                                                                INotificationSideChannelStub = i343;
                                                                int i344 = i342 % 2;
                                                                iArr[0] = i;
                                                                iArr3[0] = i340;
                                                                objArr31[3] = null;
                                                                int i345 = (-875256932) + ((45096982 | i30) * 1324) + (((~(850572726 | i)) | (~((-810262498) | i))) * (-1324));
                                                                int i346 = i343 + 79;
                                                                getInterfaceDescriptor = i346 % 128;
                                                                int i347 = i346 % 2;
                                                                int i348 = -(-(i345 + 1336705152));
                                                                int i349 = (i2 & i348) + (i2 | i348);
                                                                int i350 = i349 << 13;
                                                                int i351 = (i350 | i349) & (~(i349 & i350));
                                                                int i352 = i351 >>> 17;
                                                                int i353 = (i351 | i352) & (~(i351 & i352));
                                                                int i354 = i353 << 5;
                                                                iArr2[0] = (i353 | i354) & (~(i353 & i354));
                                                                return objArr31;
                                                            } catch (Throwable th2) {
                                                                Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th3) {
                                                            Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (Throwable th4) {
                                                        Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (Throwable th5) {
                                                    Throwable cause5 = th5.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                Throwable cause8 = th8.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th9;
                        }
                    } catch (Throwable th10) {
                        Throwable cause10 = th10.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th10;
                    }
                } catch (Throwable unused) {
                }
            }
            int[] iArr4 = new int[1];
            int i355 = getInterfaceDescriptor + 115;
            int i356 = i355 % 128;
            INotificationSideChannelStub = i356;
            int i357 = i355 % 2;
            Object[] objArr32 = {new int[]{i}, iArr4, new int[]{i}, null};
            int i358 = (-1694420508) + (((~((-193007975) | i)) | 152697745) * (-318));
            int i359 = ~(152697745 | i);
            int i360 = ~i;
            int i361 = i358 + ((i359 | (~((-1632914) | i360))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(194640887 | i360)) | (~((-1632914) | i))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i362 = i356 + 71;
            getInterfaceDescriptor = i362 % 128;
            if (i362 % 2 != 0) {
                i3 = (55 % 0) << ((-107) % i361);
                i4 = ~(((-1) ^ i361) | i361);
            } else {
                i3 = i361 * (-107);
                i360 = ~i;
                i4 = 0;
            }
            int i363 = (i356 & 41) + (i356 | 41);
            int i364 = i363 % 128;
            getInterfaceDescriptor = i364;
            if (i363 % 2 != 0) {
                int i365 = ~((i360 & i361) | (i360 ^ i361));
                i5 = i3 << ((-108) / ((i365 & i4) | (i4 ^ i365)));
            } else {
                int i366 = (-108) * ((~((i360 & i361) | (i360 ^ i361))) | i4);
                i5 = ((i3 | i366) << 1) - (i3 ^ i366);
            }
            int i367 = ~(((-1) ^ i) | i);
            int i368 = ~(~i361);
            int i369 = (i367 & i368) | (i367 ^ i368);
            int i370 = ~(~i);
            int i371 = 54 * ((i369 & i370) | (i369 ^ i370));
            int i372 = (i5 & i371) + (i5 | i371);
            int i373 = ~(~i361);
            int i374 = ((i & i373) | (i ^ i373)) * 54;
            int i375 = (i364 ^ 39) + ((i364 & 39) << 1);
            INotificationSideChannelStub = i375 % 128;
            if (i375 % 2 == 0) {
                int i376 = i2 * (i372 + i374);
                int i377 = i376 * 111;
                int i378 = ((~i376) & i377) | ((~i377) & i376);
                int i379 = i378 / 93;
                int i380 = (i378 | i379) & (~(i378 & i379));
                iArr4[0] = i380 ^ (i380 / 3);
            } else {
                int i381 = -(-i374);
                int i382 = (i372 ^ i381) + ((i381 & i372) << 1);
                int i383 = ((i2 | i382) << 1) - (i2 ^ i382);
                int i384 = i383 << 13;
                int i385 = (i383 | i384) & (~(i383 & i384));
                int i386 = i385 >>> 17;
                int i387 = (i385 | i386) & (~(i385 & i386));
                iArr4[0] = i387 ^ (i387 << 5);
            }
            return objArr32;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(byte r7, int r8, byte r9) {
            /*
                int r9 = r9 + 113
                byte[] r0 = com.squareup.picasso.Picasso.TuitionPaymentFragmentbindingInflater1.$$a
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L27
            L12:
                r3 = r2
            L13:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r7) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L22:
                r3 = r0[r8]
                r6 = r3
                r3 = r9
                r9 = r6
            L27:
                int r9 = -r9
                int r9 = r9 + r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Picasso.TuitionPaymentFragmentbindingInflater1.$$c(byte, int, byte):java.lang.String");
        }
    }

    public final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = this.notify.TuitionPaymentFragmentbindingInflater1(str);
        if (bitmapTuitionPaymentFragmentbindingInflater1 != null) {
            this.INotificationSideChannel.asBinder.sendEmptyMessage(0);
            return bitmapTuitionPaymentFragmentbindingInflater1;
        }
        this.INotificationSideChannel.asBinder.sendEmptyMessage(1);
        return bitmapTuitionPaymentFragmentbindingInflater1;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesforRemove = this.INotificationSideChannelStub.remove(obj);
        if (findnearesthighersupportedencoderprofilesforRemove != null) {
            findnearesthighersupportedencoderprofilesforRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Handler handler = this.cancelAll.asInterface;
            handler.sendMessage(handler.obtainMessage(2, findnearesthighersupportedencoderprofilesforRemove));
        }
        if (obj instanceof ImageView) {
            lowerQualityOrHigherThan lowerqualityorhigherthanRemove = this.INotificationSideChannelStubProxy.remove((ImageView) obj);
            if (lowerqualityorhigherthanRemove == null) {
                return;
            }
            FileOutputOptionsFileOutputOptionsInternal fileOutputOptionsFileOutputOptionsInternal = lowerqualityorhigherthanRemove.b;
            lowerqualityorhigherthanRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            WeakReference<ImageView> weakReference = lowerqualityorhigherthanRemove.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends Thread {
        private final ReferenceQueue<Object> TuitionPaymentFragmentbindingInflater1;
        private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.TuitionPaymentFragmentbindingInflater1 = referenceQueue;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    findNearestHigherSupportedEncoderProfilesFor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (findNearestHigherSupportedEncoderProfilesFor.TuitionPaymentFragmentspecialinlinedviewModeldefault2) this.TuitionPaymentFragmentbindingInflater1.remove(1000L);
                    Message messageObtainMessage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.obtainMessage();
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(new Runnable() { // from class: com.squareup.picasso.Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(e2);
                        }
                    });
                    return;
                }
            }
        }
    }

    public static Picasso b() {
        if (onTransact == null) {
            synchronized (Picasso.class) {
                if (onTransact == null) {
                    if (PicassoProvider.context == null) {
                        throw new IllegalStateException("context == null");
                    }
                    TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(PicassoProvider.context);
                    Context context = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 == null) {
                        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 = new FallbackStrategyRuleStrategy(context);
                    }
                    if (tuitionPaymentFragmentbindingInflater1.b == null) {
                        tuitionPaymentFragmentbindingInflater1.b = new FileDescriptorOutputOptions(context);
                    }
                    if (tuitionPaymentFragmentbindingInflater1.asBinder == null) {
                        tuitionPaymentFragmentbindingInflater1.asBinder = new FileDescriptorOutputOptionsBuilder();
                    }
                    if (tuitionPaymentFragmentbindingInflater1.f872a == null) {
                        tuitionPaymentFragmentbindingInflater1.f872a = TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    }
                    FileOutputOptionsBuilder fileOutputOptionsBuilder = new FileOutputOptionsBuilder(tuitionPaymentFragmentbindingInflater1.b);
                    onTransact = new Picasso(context, new lowerQualityThan(context, tuitionPaymentFragmentbindingInflater1.asBinder, TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.b, fileOutputOptionsBuilder), tuitionPaymentFragmentbindingInflater1.b, tuitionPaymentFragmentbindingInflater1.asInterface, tuitionPaymentFragmentbindingInflater1.f872a, tuitionPaymentFragmentbindingInflater1.g, fileOutputOptionsBuilder, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater1.d);
                }
            }
        }
        return onTransact;
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);

        public final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    final void b(Bitmap bitmap, LoadedFrom loadedFrom, findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor, Exception exc) {
        if (findnearesthighersupportedencoderprofilesfor.b) {
            return;
        }
        if (!findnearesthighersupportedencoderprofilesfor.cancel) {
            Map<Object, findNearestHigherSupportedEncoderProfilesFor> map = this.INotificationSideChannelStub;
            Reference reference = findnearesthighersupportedencoderprofilesfor.onTransact;
            map.remove(reference == null ? null : reference.get());
        }
        if (bitmap == null) {
            findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exc);
            if (this.d) {
                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "errored", findnearesthighersupportedencoderprofilesfor.d.b(), exc.getMessage());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap, loadedFrom);
        if (this.d) {
            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "completed", findnearesthighersupportedencoderprofilesfor.d.b(), "from ".concat(String.valueOf(loadedFrom)));
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor) {
        Reference reference = findnearesthighersupportedencoderprofilesfor.onTransact;
        Object obj = reference == null ? null : reference.get();
        if (obj != null && this.INotificationSideChannelStub.get(obj) != findnearesthighersupportedencoderprofilesfor) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
            this.INotificationSideChannelStub.put(obj, findnearesthighersupportedencoderprofilesfor);
        }
        Handler handler = this.cancelAll.asInterface;
        handler.sendMessage(handler.obtainMessage(1, findnearesthighersupportedencoderprofilesfor));
    }
}
