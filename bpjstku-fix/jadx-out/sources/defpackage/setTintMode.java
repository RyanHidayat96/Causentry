package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentEmployeesComplaintBinding;
import com.bpjstku.domain.complaint.model.TrackingComplaint;
import com.bpjstku.presentation.complaint.fragment.EmployeesComplaintFragment$bindingInflater$1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0011\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"LsetTintMode;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentEmployeesComplaintBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/List;", "b", "LsetEnterFadeDuration;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;", "", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setTintMode extends AutoValue_CameraState_StateError<FragmentEmployeesComplaintBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private List<TrackingComplaint> b = CollectionsKt.emptyList();
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: unwrap
        private static char[] TuitionPaymentFragmentbindingInflater1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {1, 115, -83, 116};
        private static final int $$d = 79;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {12, 11, -9, -106};
        private static final int $$b = 153;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int b = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 97
                byte[] r0 = defpackage.unwrap.$$a
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r7
                r9 = r8
                r5 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                int r8 = r8 + 1
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r8 = r8 + r3
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.unwrap.c(short, byte, byte, java.lang.Object[]):void");
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
            b = i2 % 128;
            int i3 = i2 % 2;
            setEnterFadeDuration setenterfadedurationTuitionPaymentFragmentbindingInflater1 = setTintMode.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i4 = b + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return setenterfadedurationTuitionPaymentFragmentbindingInflater1;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int i5 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2187;
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 40;
                        byte b2 = (byte) ($$c[0] - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i5, scrollBarFadeDuration, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char maxKeyCode = (char) (33017 - (KeyEvent.getMaxKeyCode() >> 16));
                            int i6 = 3012 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iIndexOf = 26 - TextUtils.indexOf("", "", 0);
                            byte b4 = (byte) ($$c[0] - 1);
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, i6, iIndexOf, 321985076, false, $$e(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char defaultSize = (char) (36505 - View.getDefaultSize(0, 0));
                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3376;
                                int gidForName = Process.getGidForName("") + 18;
                                byte b6 = $$c[0];
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, packedPositionGroup, gidForName, -968507904, false, $$e(b7, b7, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            int i7 = $10 + 11;
                            $11 = i7 % 128;
                            int i8 = i7 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i9 = $11 + 79;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    try {
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (36505 - TextUtils.indexOf("", "", 0));
                            int iRgb = (-16773840) - Color.rgb(0, 0, 0);
                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 17;
                            byte b8 = $$c[0];
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, iRgb, iResolveSizeAndState, -968507904, false, $$e(b9, b9, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        int i10 = 67 / 0;
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                } else {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRed = (char) (36505 - Color.red(0));
                        int iCombineMeasuredStates = 3376 - View.combineMeasuredStates(0, 0);
                        int minimumFlingVelocity = 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b10 = $$c[0];
                        byte b11 = (byte) (b10 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, iCombineMeasuredStates, minimumFlingVelocity, -968507904, false, $$e(b11, b11, b10), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr);
        }

        /* JADX WARN: Code duplicated, block: B:142:0x0b95  */
        /* JADX WARN: Code duplicated, block: B:251:0x1434  */
        /* JADX WARN: Code duplicated, block: B:253:0x146a  */
        /* JADX WARN: Code duplicated, block: B:254:0x1482  */
        /* JADX WARN: Code duplicated, block: B:258:0x1518  */
        /* JADX WARN: Code duplicated, block: B:261:0x1527 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:266:0x15fb A[LOOP:4: B:256:0x1515->B:266:0x15fb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:272:0x1673  */
        /* JADX WARN: Code duplicated, block: B:275:0x1682 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:280:0x177e A[LOOP:5: B:270:0x1670->B:280:0x177e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:285:0x17a4 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:289:0x187d A[Catch: all -> 0x029b, TRY_ENTER, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:291:0x188f A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:295:0x1967  */
        /* JADX WARN: Code duplicated, block: B:296:0x196e  */
        /* JADX WARN: Code duplicated, block: B:300:0x19b8 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:303:0x1a02 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:305:0x1a1a A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:309:0x1ab6  */
        /* JADX WARN: Code duplicated, block: B:310:0x1b02  */
        /* JADX WARN: Code duplicated, block: B:313:0x1b5c  */
        /* JADX WARN: Code duplicated, block: B:315:0x1b62  */
        /* JADX WARN: Code duplicated, block: B:319:0x264b  */
        /* JADX WARN: Code duplicated, block: B:322:0x265c A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:323:0x269f  */
        /* JADX WARN: Code duplicated, block: B:346:0x28ad  */
        /* JADX WARN: Code duplicated, block: B:361:0x2992 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:364:0x29de  */
        /* JADX WARN: Code duplicated, block: B:365:0x29e1 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:367:0x29f9 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:372:0x2ae7  */
        /* JADX WARN: Code duplicated, block: B:403:0x30dd  */
        /* JADX WARN: Code duplicated, block: B:406:0x331e  */
        /* JADX WARN: Code duplicated, block: B:408:0x332e  */
        /* JADX WARN: Code duplicated, block: B:411:0x3349 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:412:0x3397  */
        /* JADX WARN: Code duplicated, block: B:417:0x3446 A[LOOP:8: B:407:0x332c->B:417:0x3446, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:429:0x3514  */
        /* JADX WARN: Code duplicated, block: B:431:0x3527 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:434:0x352f A[Catch: all -> 0x3583, IOException -> 0x358e, TryCatch #24 {IOException -> 0x358e, all -> 0x3583, blocks: (B:426:0x350a, B:427:0x350d, B:432:0x3529, B:434:0x352f, B:436:0x3537, B:440:0x3540), top: B:529:0x350a }] */
        /* JADX WARN: Code duplicated, block: B:435:0x3535 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:436:0x3537 A[Catch: all -> 0x3583, IOException -> 0x358e, TryCatch #24 {IOException -> 0x358e, all -> 0x3583, blocks: (B:426:0x350a, B:427:0x350d, B:432:0x3529, B:434:0x352f, B:436:0x3537, B:440:0x3540), top: B:529:0x350a }] */
        /* JADX WARN: Code duplicated, block: B:438:0x353d  */
        /* JADX WARN: Code duplicated, block: B:440:0x3540 A[Catch: all -> 0x3583, IOException -> 0x358e, TRY_LEAVE, TryCatch #24 {IOException -> 0x358e, all -> 0x3583, blocks: (B:426:0x350a, B:427:0x350d, B:432:0x3529, B:434:0x352f, B:436:0x3537, B:440:0x3540), top: B:529:0x350a }] */
        /* JADX WARN: Code duplicated, block: B:443:0x355a A[LOOP:12: B:439:0x353e->B:443:0x355a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:450:0x3578  */
        /* JADX WARN: Code duplicated, block: B:451:0x357a  */
        /* JADX WARN: Code duplicated, block: B:454:0x3580  */
        /* JADX WARN: Code duplicated, block: B:465:0x3593  */
        /* JADX WARN: Code duplicated, block: B:469:0x35db  */
        /* JADX WARN: Code duplicated, block: B:470:0x35f0  */
        /* JADX WARN: Code duplicated, block: B:473:0x3615 A[Catch: all -> 0x029b, TryCatch #21 {all -> 0x029b, blocks: (B:10:0x0197, B:12:0x01a4, B:13:0x01e2, B:25:0x0337, B:27:0x0344, B:28:0x0382, B:35:0x0477, B:37:0x0484, B:38:0x04bc, B:62:0x06a6, B:64:0x06ac, B:65:0x06e7, B:122:0x09b6, B:124:0x09c3, B:126:0x0a0d, B:133:0x0b04, B:135:0x0b11, B:137:0x0b55, B:148:0x0c15, B:150:0x0c22, B:151:0x0c69, B:159:0x0d4d, B:161:0x0d5a, B:162:0x0d9b, B:171:0x0fb1, B:173:0x0fbe, B:174:0x1003, B:184:0x10e8, B:186:0x10f5, B:187:0x113e, B:259:0x151a, B:261:0x1527, B:262:0x1567, B:273:0x1675, B:275:0x1682, B:276:0x16c5, B:283:0x179e, B:285:0x17a4, B:286:0x17d9, B:289:0x187d, B:291:0x188f, B:292:0x18d0, B:298:0x19ab, B:300:0x19b8, B:301:0x19f9, B:303:0x1a02, B:305:0x1a1a, B:306:0x1a5e, B:359:0x2985, B:361:0x2992, B:362:0x29d5, B:379:0x2e7f, B:381:0x2e8c, B:382:0x2ecc, B:409:0x333c, B:411:0x3349, B:413:0x339d, B:471:0x3608, B:473:0x3615, B:474:0x3653, B:388:0x2fb7, B:390:0x2fc4, B:391:0x2ffc, B:365:0x29e1, B:367:0x29f9, B:368:0x2a40, B:320:0x264f, B:322:0x265c, B:324:0x26a1, B:331:0x26bd, B:333:0x26ca, B:335:0x2719, B:43:0x0597, B:45:0x05a4, B:46:0x05e5, B:52:0x062c, B:54:0x0639, B:55:0x067d), top: B:521:0x0197 }] */
        /* JADX WARN: Code duplicated, block: B:476:0x3717  */
        /* JADX WARN: Code duplicated, block: B:531:0x34fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:547:0x15ff A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:548:0x15ee A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:549:0x176a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:550:0x1787 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:556:0x346f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:557:0x343c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:559:0x3576 A[EDGE_INSN: B:559:0x3576->B:449:0x3576 BREAK  A[LOOP:9: B:427:0x350d->B:448:0x3573], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:565:0x3566 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:566:0x3564 A[SYNTHETIC] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            String str;
            int i5;
            String str2;
            int i6;
            int i7;
            String str3;
            int i8;
            BufferedInputStream bufferedInputStream;
            String str4;
            BufferedInputStream bufferedInputStream2;
            int i9;
            String str5;
            byte[] bArr;
            byte[] bArr2;
            byte b2;
            int i10;
            long j;
            int i11;
            String str6;
            int i12;
            int i13;
            int i14;
            int i15;
            BufferedInputStream bufferedInputStream3;
            long j2;
            BufferedInputStream bufferedInputStream4;
            int i16;
            byte[] bArr3;
            int i17;
            long j3;
            byte[] bArr4;
            int i18;
            int i19;
            int i20;
            String[] strArr;
            int i21;
            int i22;
            int i23;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j4;
            long j5;
            long j6;
            long j7;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            String[] strArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i30;
            int i31;
            int i32;
            int i33;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            Object objInvoke;
            String[][] strArr3;
            long j8;
            char c;
            StringBuilder sb;
            int i34;
            int i35;
            int i36;
            Object[] objArr;
            char c2;
            String[] strArr4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String str7;
            StringBuilder sb2;
            String str8;
            StringBuilder sb3;
            String str9;
            int i37;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            Object objInvoke2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
            int i38;
            String[] strArr5;
            int i39;
            String[][] strArr6;
            char c3;
            int i40;
            int i41;
            int i42;
            String str10;
            int i43;
            String str11;
            int i44;
            int bitsPerPixel;
            int i45;
            int i46;
            int i47;
            String str12;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
            String str13;
            byte[] bytes;
            int length;
            BufferedInputStream bufferedInputStream5;
            int i48;
            byte[] bArr5;
            int i49;
            int i50;
            boolean z;
            int i51;
            int i52;
            int i53;
            int i54;
            String str14;
            int i55;
            String[] strArr7;
            int length2;
            int i56;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
            String str15;
            long j9;
            int i57;
            int iNextInt;
            int i58;
            int i59;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
            long j10;
            int i60;
            int i61;
            int i62;
            int i63;
            int i64;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
            int i65;
            int i66;
            String[] strArr8;
            int i67;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i68;
            int i69;
            int i70;
            int i71;
            int i72;
            int i73;
            int i74;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
            int i75;
            int i76;
            int i77 = i;
            int i78 = 2 % 2;
            long j11 = 0;
            int i79 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i80 = 1;
            int i81 = ((i79 | 907) << 1) - (i79 ^ 907);
            int i82 = -ExpandableListView.getPackedPositionChild(0L);
            String str16 = "";
            Object[] objArr2 = new Object[1];
            a(i81, ((i82 | 7) << 1) - (i82 ^ 7), (char) KeyEvent.keyCodeFromString(""), objArr2);
            int i83 = 0;
            String str17 = (String) objArr2[0];
            new ArrayList();
            String[] strArr9 = new String[4];
            int capsMode = TextUtils.getCapsMode("", 0, 0);
            int i84 = -(-ExpandableListView.getPackedPositionChild(0L));
            int i85 = (i84 ^ 28) + ((i84 & 28) << 1);
            int i86 = -(KeyEvent.getMaxKeyCode() >> 16);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i87 = b;
            int i88 = (i87 ^ 99) + ((i87 & 99) << 1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i88 % 128;
            if (i88 % 2 != 0) {
                int i89 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i4 = (((960 << i86) + 1917) << (959 >>> ((~(i86 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2)) | (~(((-8810) ^ i89) | ((-8810) & i89)))))) % 7851;
            } else {
                int i90 = (i86 * 960) - 16886853;
                int i91 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i92 = ~(((-8810) ^ i91) | (i91 & (-8810)));
                int i93 = ~((i86 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i86 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i94 = -(-(((i92 ^ i93) | (i92 & i93)) * 959));
                int i95 = (i90 ^ i94) + ((i90 & i94) << 1);
                i4 = ((i95 | 8448790) << 1) - (8448790 ^ i95);
            }
            int i96 = ~(((-8810) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-8810) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            int i97 = ~(i86 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
            char c4 = (char) (i4 + (959 * ((i96 & i97) | (i96 ^ i97))));
            Object[] objArr3 = new Object[1];
            a(capsMode, i85, c4, objArr3);
            strArr9[0] = (String) objArr3[0];
            int i98 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i99 = (i98 & 27) + (i98 | 27);
            int i100 = -ExpandableListView.getPackedPositionType(0L);
            int i101 = (i100 ^ 25) + ((i100 & 25) << 1);
            int iMyTid = Process.myTid() >> 22;
            Object[] objArr4 = new Object[1];
            a(i99, i101, (char) (((iMyTid | 39601) << 1) - (iMyTid ^ 39601)), objArr4);
            strArr9[1] = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a(51 - (~(-View.MeasureSpec.getSize(0))), KeyEvent.getDeadChar(0, 0) + 18, (char) (0 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr5);
            strArr9[2] = (String) objArr5[0];
            int i102 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i103 = (i102 & 70) + (i102 | 70);
            int iMyTid2 = Process.myTid() >> 22;
            int i104 = iMyTid2 * 398;
            int i105 = ((i104 | (-11088)) << 1) - (i104 ^ (-11088));
            int i106 = ~iMyTid2;
            int i107 = ~i77;
            int i108 = ~((i106 ^ i107) | (i106 & i107));
            int i109 = ~iMyTid2;
            int i110 = ~((i109 ^ 28) | (i109 & 28));
            int i111 = (i108 ^ i110) | (i108 & i110);
            int i112 = ~((i107 ^ 28) | (i107 & 28));
            Object[] objArr6 = new Object[1];
            a(i103, i105 + (((i111 ^ i112) | (i112 & i111)) * (-397)) + ((~(i106 | 28)) * (-397)) + (((i110 & i77) | (i77 ^ i110) | (~((iMyTid2 & (-29)) | ((-29) ^ iMyTid2)))) * 397), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
            strArr9[3] = (String) objArr6[0];
            int i113 = 0;
            while (true) {
                if (i113 >= 4) {
                    str = str16;
                    i5 = i77;
                    break;
                }
                try {
                    Object[] objArr7 = {strArr9[i113]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char c5 = (char) ((Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)) - 1);
                        int mirror = 1041 - AndroidCharacter.getMirror('0');
                        int iIndexOf = 8 - TextUtils.indexOf(str16, str16, i83);
                        byte b3 = (byte) i83;
                        byte b4 = (byte) (b3 - 1);
                        Object[] objArr8 = new Object[i80];
                        c(b3, b4, (byte) (b4 + 1), objArr8);
                        String str18 = (String) objArr8[i83];
                        Class[] clsArr = new Class[i80];
                        clsArr[i83] = String.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(c5, mirror, iIndexOf, 349342683, false, str18, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr7)).longValue();
                    long j12 = -316251205;
                    long j13 = (((long) 491) * j12) + (((long) (-489)) * jLongValue);
                    str = str16;
                    String[] strArr10 = strArr9;
                    long j14 = -1;
                    long j15 = j12 ^ j14;
                    long j16 = jLongValue ^ j14;
                    long j17 = i77;
                    long j18 = 490;
                    long j19 = j13 + (((long) (-490)) * (j15 | j16 | (j17 ^ j14))) + ((((j16 | j17) ^ j14) | ((j16 | j12) ^ j14)) * j18) + (j18 * j15) + ((long) (-530827400));
                    int i114 = (~(1711817550 | i77)) | (-1716348751);
                    int i115 = ~i77;
                    int i116 = ~((-1141392135) | i115);
                    int i117 = ((int) (j19 >> 32)) & ((-2087802208) + ((i114 | i116) * (-470)) + (((~((-4531201) | i77)) | i116) * 470));
                    int i118 = ((int) j19) & (1870178541 + (((~(401921339 | i115)) | Integer.MIN_VALUE) * (-108)) + (((~(1839147749 | i77)) | 93585441 | (~((-1839147750) | i115))) * 54) + ((i77 | 93585441) * 54));
                    if (((i117 & i118) | (i117 ^ i118)) != 0) {
                        int i119 = (i113 ^ 190) + ((i113 & 190) << 1);
                        i5 = ((~i119) & i77) | (i119 & i115);
                        break;
                    }
                    int i120 = i113 + 49;
                    i113 = ((i120 | (-48)) << 1) - (i120 ^ (-48));
                    str16 = str;
                    strArr9 = strArr10;
                    i83 = 0;
                    i80 = 1;
                    j11 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i121 = 97 - (~(ViewConfiguration.getKeyRepeatDelay() >> 16));
            int i122 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int i123 = (i122 ^ 12) + ((i122 & 12) << 1);
            String str19 = str;
            int i124 = -(-TextUtils.indexOf(str19, str19));
            Object[] objArr9 = new Object[1];
            a(i121, i123, (char) ((i124 ^ 36873) + ((i124 & 36873) << 1)), objArr9);
            String str20 = (String) objArr9[0];
            int i125 = -(-ExpandableListView.getPackedPositionChild(0L));
            int i126 = ((i125 | 111) << 1) - (i125 ^ 111);
            int i127 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr10 = new Object[1];
            a(i126, (i127 & 13) + (i127 | 13), (char) KeyEvent.getDeadChar(0, 0), objArr10);
            String str21 = (String) objArr10[0];
            int i128 = -TextUtils.getOffsetBefore(str19, 0);
            int i129 = (i128 ^ 123) + ((i128 & 123) << 1);
            int trimmedLength = TextUtils.getTrimmedLength(str19);
            int i130 = (trimmedLength ^ 18) + ((trimmedLength & 18) << 1);
            int gidForName = Process.getGidForName(str19);
            Object[] objArr11 = new Object[1];
            a(i129, i130, (char) ((gidForName ^ 60439) + ((gidForName & 60439) << 1)), objArr11);
            String[] strArr11 = {str20, str21, (String) objArr11[0]};
            int i131 = 0;
            while (true) {
                if (i131 >= 3) {
                    str2 = str19;
                    i6 = i107;
                    i7 = i77;
                    break;
                }
                Object[] objArr12 = {strArr11[i131]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c6 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iIndexOf2 = 993 - TextUtils.indexOf(str19, str19);
                    int iIndexOf3 = 8 - TextUtils.indexOf(str19, str19, 0);
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    Object[] objArr13 = new Object[1];
                    c(b5, b6, (byte) (-b6), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c6, iIndexOf2, iIndexOf3, 410748506, false, (String) objArr13[0], new Class[]{String.class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr12)).longValue();
                long j20 = 797562629;
                String[] strArr12 = strArr11;
                long j21 = -397;
                str2 = str19;
                int i132 = i131;
                long j22 = -1;
                long j23 = j20 ^ j22;
                i6 = i107;
                long jMyPid = Process.myPid();
                long j24 = jMyPid ^ j22;
                long j25 = (j23 | j24) ^ j22;
                long j26 = (j23 | jLongValue2) ^ j22;
                long j27 = (((long) 398) * j20) + (((long) (-396)) * jLongValue2) + ((j25 | j26 | ((j24 | jLongValue2) ^ j22)) * j21) + (j21 * j26) + (((long) 397) * ((j22 ^ ((jLongValue2 ^ j22) | j20)) | jMyPid | j26)) + ((long) (-998480866));
                int i133 = (((~((-33558533) | i77)) | 1346962448) * 449) + 862846598;
                int i134 = ~i77;
                int i135 = ((int) (j27 >> 32)) & (i133 + ((1346962448 | (~((-33558533) | i134))) * 449));
                int i136 = ((int) j27) & (802172634 + ((2112715181 | i134) * (-369)) + (((~((-1030568366) | i134)) | 1827172520) * (-369)) + (((~(1030568365 | i77)) | 1082146816 | (~(i134 | (-285542662)))) * 369));
                if (((i135 & i136) | (i135 ^ i136)) != 0) {
                    i7 = i77 ^ (i132 + 270);
                    break;
                }
                i131 = i132 + 1;
                strArr11 = strArr12;
                str19 = str2;
                i107 = i6;
            }
            int i137 = (~(i77 & i5)) & (i77 | i5);
            int i138 = -i137;
            int i139 = ((i137 & i138) | (i137 ^ i138)) >> 31;
            int i140 = i7 & (~i139);
            int i141 = i5 & i139;
            int i142 = (i141 & i140) | (i140 ^ i141);
            String str22 = str2;
            int i143 = -TextUtils.indexOf(str22, str22);
            Object[] objArr14 = new Object[1];
            a((i143 ^ 141) + ((i143 & 141) << 1), Drawable.resolveOpacity(0, 0) + 14, (char) (Process.myTid() >> 22), objArr14);
            Object[] objArr15 = {(String) objArr14[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cMyPid = (char) (Process.myPid() >> 22);
                int iAxisFromString = MotionEvent.axisFromString(str22) + 994;
                int i144 = 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b7 = (byte) 0;
                byte b8 = (byte) (b7 - 1);
                Object[] objArr16 = new Object[1];
                c(b7, b8, (byte) (b8 & 6), objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid, iAxisFromString, i144, -545305915, false, (String) objArr16[0], new Class[]{String.class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr15)).longValue();
            long j28 = 569528643;
            long j29 = (((long) (-665)) * j28) + (((long) 334) * jLongValue3);
            long j30 = -1;
            long j31 = j28 ^ j30;
            long j32 = 333;
            long j33 = i77;
            long j34 = j33 ^ j30;
            long j35 = j29 + (((long) (-333)) * j31) + ((((j31 | j34) ^ j30) | ((jLongValue3 | j33) ^ j30)) * j32) + (j32 * (((j34 | jLongValue3) ^ j30) | ((j31 | j33) ^ j30))) + ((long) 50930641);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i145 = ~((-295764393) | iElapsedRealtime);
            int i146 = ((int) (j35 >> 32)) & ((-1898896126) + ((18434 | i145) * (-476)) + (i145 * 952) + ((~((~iElapsedRealtime) | (-295764393))) * 476));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i147 = ~iFreeMemory;
            int i148 = ((int) j35) & (1847023597 + (((~((-1163978176) | i147)) | 16785705) * 98) + (((~(i147 | (-1693762711))) | (-1163978176) | (~(1693762710 | iFreeMemory))) * (-49)) + (((~(iFreeMemory | (-1163978176))) | (-1710548416)) * 49));
            if (((i146 & i148) | (i146 ^ i148)) != 0) {
                i8 = (i77 & (-267)) | ((~i77) & 266);
                str3 = str22;
            } else {
                int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
                int i149 = (tapTimeout & ModuleDescriptor.MODULE_VERSION) + (tapTimeout | ModuleDescriptor.MODULE_VERSION);
                int i150 = -KeyEvent.getDeadChar(0, 0);
                str3 = str22;
                Object[] objArr17 = new Object[1];
                a(i149, (i150 ^ 24) + ((i150 & 24) << 1), (char) ((-TextUtils.indexOf((CharSequence) str3, '0')) - 1), objArr17);
                Object[] objArr18 = {(String) objArr17[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char absoluteGravity = (char) (33602 - Gravity.getAbsoluteGravity(0, 0));
                    int gidForName2 = Process.getGidForName(str3) + 3086;
                    int i151 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 - 1);
                    Object[] objArr19 = new Object[1];
                    c(b9, b10, (byte) (-b10), objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(absoluteGravity, gidForName2, i151, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
                }
                String str23 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr18);
                if (str23 == null || str23.isEmpty()) {
                    int i152 = 180 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i153 = -Color.red(0);
                    int i154 = (i153 ^ 24) + ((i153 & 24) << 1);
                    int i155 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Object[] objArr20 = new Object[1];
                    a(i152, i154, (char) ((i155 & 37655) + (i155 | 37655)), objArr20);
                    Object[] objArr21 = {(String) objArr20[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char gidForName3 = (char) (33601 - Process.getGidForName(str3));
                        int i156 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 26;
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr22 = new Object[1];
                        c(b11, b12, (byte) (-b12), objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(gidForName3, i156, packedPositionGroup, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
                    }
                    String str24 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr21);
                    i8 = (str24 == null || str24.isEmpty()) ? i77 : (~(i77 & 267)) & (i77 | 267);
                } else {
                    i8 = i77 ^ 267;
                }
            }
            int i157 = i77 ^ i142;
            int i158 = -i157;
            int i159 = ((i157 & i158) | (i157 ^ i158)) >> 31;
            int i160 = (i142 & i159) | (i8 & (~i159));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56827);
                int iArgb = 2814 - Color.argb(0, 0, 0, 0);
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 10;
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 - 1);
                Object[] objArr23 = new Object[1];
                c(b13, b14, (byte) (-b14), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(scrollBarFadeDuration, iArgb, bitsPerPixel2, -1639816125, false, (String) objArr23[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, null)).longValue();
            long j36 = 1085298388;
            long j37 = (((long) 860) * j36) + (((long) (-858)) * jLongValue4) + (((long) (-859)) * (j36 | j33));
            long j38 = 859;
            long j39 = jLongValue4 ^ j30;
            long j40 = j37 + ((((j34 | j36) ^ j30) | ((((j36 ^ j30) | j39) | j33) ^ j30)) * j38) + (j38 * (((j39 | j34) ^ j30) | ((j39 | j36) ^ j30))) + ((long) 1028058118);
            int i161 = ~((-1772234064) | i77);
            int iNextInt2 = new Random().nextInt();
            int i162 = (-547960197) + (((~(1959784142 | iNextInt2)) | (-522557733)) * (-318));
            int i163 = ~((-522557733) | iNextInt2);
            int i164 = ~iNextInt2;
            int i165 = (((int) (j40 >> 32)) & ((((689021002 | i161) * (-658)) - 2103093846) + ((i161 | 687874122) * 658))) | (((int) j40) & (i162 + ((i163 | (~((-1623877323) | i164))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iNextInt2 | (-1623877323))) | (~((-335906821) | i164))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)));
            int i166 = (i165 ^ (-1)) + (i165 << 1) + 200;
            int i167 = (i166 | i77) & (~(i77 & i166));
            int i168 = -i165;
            int i169 = ((i165 & i168) | (i165 ^ i168)) >> 31;
            int i170 = (~i169) & i77;
            int i171 = i169 & i167;
            int i172 = (i171 & i170) | (i170 ^ i171);
            int i173 = (~(i77 & i160)) & (i77 | i160);
            int i174 = -i173;
            int i175 = ((i173 & i174) | (i173 ^ i174)) >> 31;
            int i176 = i172 & (~i175);
            int i177 = i160 & i175;
            int i178 = (i177 & i176) | (i176 ^ i177);
            int i179 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i180 = (i179 & 203) + (i179 | 203);
            int i181 = -TextUtils.indexOf(str3, str3);
            int i182 = (i181 & 20) + (i181 | 20);
            int i183 = -(-(Process.myTid() >> 22));
            Object[] objArr24 = new Object[1];
            a(i180, i182, (char) ((i183 ^ 13432) + ((i183 & 13432) << 1)), objArr24);
            String str25 = (String) objArr24[0];
            int i184 = -Color.alpha(0);
            Object[] objArr25 = new Object[1];
            a((i184 & 223) + (i184 | 223), 6 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr25);
            byte[] bytes2 = ((String) objArr25[0]).getBytes();
            int length3 = bytes2.length;
            if (length3 == 0) {
                str4 = str17;
                i9 = 1;
            } else {
                try {
                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str25));
                    int i185 = 4096;
                    try {
                        try {
                            byte[] bArr6 = new byte[4096];
                            int i186 = 0;
                            int i187 = 0;
                            while (true) {
                                int i188 = bufferedInputStream2.read(bArr6, i186, i185);
                                if (i188 <= 0) {
                                    break;
                                }
                                int i189 = 0;
                                while (i187 < length3 && i189 < i188) {
                                    int i190 = i188;
                                    if (bArr6[i189] == bytes2[i187]) {
                                        i187++;
                                    } else {
                                        if (i187 != 0) {
                                            int i191 = i187 - 1;
                                            while (true) {
                                                if (i191 <= 0) {
                                                    str5 = str17;
                                                    bArr = bArr6;
                                                    i187 = 0;
                                                    break;
                                                }
                                                int i192 = 0;
                                                while (true) {
                                                    if (i192 >= i191) {
                                                        str5 = str17;
                                                        bArr = bArr6;
                                                        int i193 = b + 73;
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i193 % 128;
                                                        int i194 = i193 % 2;
                                                        i187 = i191;
                                                        break;
                                                    }
                                                    int i195 = b;
                                                    bArr2 = bArr6;
                                                    int i196 = (i195 ^ 101) + ((i195 & 101) << 1);
                                                    str4 = str17;
                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i196 % 128;
                                                    if (i196 % 2 != 0) {
                                                        try {
                                                            b2 = bytes2[i192];
                                                            i10 = i187 * i191;
                                                        } catch (IOException unused) {
                                                        }
                                                    } else {
                                                        b2 = bytes2[i192];
                                                        int i197 = -i191;
                                                        i10 = (i187 ^ i197) + ((i197 & i187) << 1);
                                                    }
                                                    if (b2 != bytes2[i10 + i192]) {
                                                        break;
                                                    }
                                                    i192 = ((i192 & 1) << 1) + (i192 ^ 1);
                                                    str17 = str4;
                                                    bArr6 = bArr2;
                                                }
                                                int i198 = (i191 & (-60)) + (i191 | (-60));
                                                i191 = (i198 & 59) + (i198 | 59);
                                                str17 = str4;
                                                bArr6 = bArr2;
                                            }
                                        }
                                        i188 = i190;
                                        str17 = str5;
                                        bArr6 = bArr;
                                    }
                                    str5 = str17;
                                    bArr = bArr6;
                                    i189++;
                                    i188 = i190;
                                    str17 = str5;
                                    bArr6 = bArr;
                                }
                                str17 = str17;
                                bArr6 = bArr6;
                                i185 = 4096;
                                i186 = 0;
                                if (bufferedInputStream2 != null) {
                                    try {
                                        bufferedInputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                i9 = 0;
                            }
                            str4 = str17;
                            i9 = (i187 == length3 ? 0 : 1) ^ 1;
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        } catch (IOException unused4) {
                            str4 = str17;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused6) {
                    str4 = str17;
                    bufferedInputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
            }
            int i199 = (~(i77 & 262)) & (i77 | 262);
            int i200 = -i9;
            int i201 = ((i9 & i200) | (i9 ^ i200)) >> 31;
            int i202 = (~i201) & i77;
            int i203 = i201 & i199;
            int i204 = (i203 & i202) | (i202 ^ i203);
            int i205 = (~i178) & i77;
            int i206 = ~i77;
            int i207 = i205 | (i178 & i206);
            int i208 = -i207;
            int i209 = ((i207 & i208) | (i207 ^ i208)) >> 31;
            int i210 = i204 & (~i209);
            int i211 = i178 & i209;
            int i212 = (i210 & i211) | (i210 ^ i211);
            Object[] objArr26 = new Object[1];
            a(227 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr26);
            String str26 = (String) objArr26[0];
            int i213 = -(-Color.argb(0, 0, 0, 0));
            int i214 = (i213 & 260) + (i213 | 260);
            int i215 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr27 = new Object[1];
            a(i214, (i215 & 22) + (i215 | 22), (char) Drawable.resolveOpacity(0, 0), objArr27);
            String str27 = (String) objArr27[0];
            int i216 = 282 - (~(-(-TextUtils.getCapsMode(str3, 0, 0))));
            int iRed = 28 - Color.red(0);
            int i217 = -Color.blue(0);
            Object[] objArr28 = new Object[1];
            a(i216, iRed, (char) (((i217 | 30273) << 1) - (i217 ^ 30273)), objArr28);
            String str28 = (String) objArr28[0];
            int i218 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i219 = (i218 ^ 312) + ((i218 & 312) << 1);
            int mirror2 = AndroidCharacter.getMirror('0') - '\"';
            int i220 = -(-TextUtils.lastIndexOf(str3, '0', 0));
            Object[] objArr29 = new Object[1];
            a(i219, mirror2, (char) ((i220 & 1) + (i220 | 1)), objArr29);
            String[] strArr13 = {str26, str27, str28, (String) objArr29[0]};
            int i221 = 0;
            while (true) {
                if (i221 >= 4) {
                    j = j33;
                    str3 = str3;
                    i11 = i77;
                    break;
                }
                Object[] objArr30 = {strArr13[i221]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int i222 = 994 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int packedPositionChild = 7 - ExpandableListView.getPackedPositionChild(0L);
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr31 = new Object[1];
                    c(b15, b16, (byte) (b16 & 6), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cResolveOpacity, i222, packedPositionChild, -545305915, false, (String) objArr31[0], new Class[]{String.class});
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr30)).longValue();
                long j41 = -587785730;
                j = j33;
                long j42 = j41 ^ j30;
                long j43 = (((long) (-716)) * j41) + (((long) 1435) * jLongValue5) + (((long) (-1434)) * (jLongValue5 | j42));
                long j44 = 717;
                long j45 = (j41 | jLongValue5) ^ j30;
                long j46 = j42 | (jLongValue5 ^ j30);
                long j47 = j43 + ((((j34 | jLongValue5) ^ j30) | j45 | ((j46 | j) ^ j30)) * j44) + (j44 * (((jLongValue5 | j) ^ j30) | ((j46 | j34) ^ j30) | j45)) + ((long) 1208245014);
                int i223 = ~((-126028016) | i206);
                int i224 = ((int) (j47 >> 32)) & ((-1009843654) + ((1563254426 | i223) * 764) + (((~(1563254426 | i206)) | (-1605328640)) * (-1528)) + ((i223 | (-1521374838)) * 764));
                int i225 = (int) Runtime.getRuntime().totalMemory();
                if ((i224 | (((int) j47) & (416960457 + (((~(1046031081 | i225)) | (-391195329)) * (-366)) + (((~(i225 | (-16777217))) | 671612969) * 366)))) != 0) {
                    int i226 = i221 + 252;
                    i11 = (~(i77 & i226)) & (i77 | i226);
                    break;
                }
                int i227 = i221 - 48;
                i221 = ((i227 | 49) << 1) - (i227 ^ 49);
                str3 = str3;
                strArr13 = strArr13;
                j33 = j;
            }
            int i228 = i77 ^ i212;
            int i229 = -i228;
            int i230 = ((i228 & i229) | (i228 ^ i229)) >> 31;
            int i231 = i11 & (~i230);
            int i232 = i212 & i230;
            int i233 = (i232 & i231) | (i231 ^ i232);
            int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
            Object[] objArr32 = new Object[1];
            a((keyRepeatTimeout ^ 325) + ((keyRepeatTimeout & 325) << 1), 12 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), (char) (8923 - ImageFormat.getBitsPerPixel(0)), objArr32);
            Object[] objArr33 = {(String) objArr32[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cAlpha = (char) (Color.alpha(0) + 33602);
                str6 = str3;
                int iIndexOf4 = TextUtils.indexOf((CharSequence) str6, '0') + 3086;
                int iLastIndexOf = TextUtils.lastIndexOf(str6, '0') + 27;
                byte b17 = (byte) 0;
                byte b18 = (byte) (b17 - 1);
                Object[] objArr34 = new Object[1];
                c(b17, b18, (byte) (-b18), objArr34);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cAlpha, iIndexOf4, iLastIndexOf, 1411172903, false, (String) objArr34[0], new Class[]{String.class});
            } else {
                str6 = str3;
            }
            String str29 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr33);
            if (str29 != null) {
                int i234 = -(-TextUtils.lastIndexOf(str6, '0', 0));
                Object[] objArr35 = new Object[1];
                a((i234 & 339) + (i234 | 339), 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr35);
                if (str29.contains((String) objArr35[0])) {
                    i12 = (i77 & (-251)) | (i206 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                } else {
                    i12 = i77;
                }
            } else {
                i12 = i77;
            }
            int i235 = (~(i77 & i233)) & (i77 | i233);
            int i236 = -i235;
            int i237 = ((i235 & i236) | (i235 ^ i236)) >> 31;
            int i238 = i12 & (~i237);
            int i239 = i233 & i237;
            int i240 = (i239 & i238) | (i238 ^ i239);
            int i241 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i242 = (i241 & 27) + (i241 | 27);
            b = i242 % 128;
            int i243 = i242 % 2;
            int maxKeyCode = KeyEvent.getMaxKeyCode();
            if (i243 == 0) {
                int i244 = -(-(maxKeyCode / 109));
                i13 = ((i244 | 1498) << 1) - (i244 ^ 1498);
                i14 = 127;
            } else {
                i13 = 347 - (maxKeyCode >> 16);
                i14 = 16;
            }
            int i245 = -TextUtils.indexOf((CharSequence) str6, '0');
            Object[] objArr36 = new Object[1];
            a(i13, ((i14 | i245) << 1) - (i14 ^ i245), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr36);
            String str30 = (String) objArr36[0];
            Object[] objArr37 = new Object[1];
            a(363 - (~ExpandableListView.getPackedPositionGroup(0L)), 5 - (~(-(-View.resolveSize(0, 0)))), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr37);
            Object[] objArr38 = {str30, (String) objArr37[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int iIndexOf5 = TextUtils.indexOf((CharSequence) str6, '0', 0) + 2386;
                int iIndexOf6 = 32 - TextUtils.indexOf(str6, str6);
                byte b19 = (byte) 0;
                byte b20 = (byte) (b19 - 1);
                Object[] objArr39 = new Object[1];
                c(b19, b20, (byte) (-b20), objArr39);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c7, iIndexOf5, iIndexOf6, -1207062455, false, (String) objArr39[0], new Class[]{String.class, String.class});
            }
            long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr38)).longValue();
            long j48 = 957179032;
            long j49 = -518;
            long j50 = (j49 * j48) + (j49 * jLongValue6);
            long j51 = 519;
            long j52 = (j48 ^ j30) | j34;
            long j53 = j50 + ((jLongValue6 | (j52 ^ j30)) * j51) + (((long) (-519)) * (((j52 | jLongValue6) ^ j30) | (((j48 | jLongValue6) | j) ^ j30))) + (j51 * (j48 | ((jLongValue6 | j) ^ j30))) + ((long) 1019864296);
            int i246 = ~(1830861132 | i206);
            int i247 = ((int) (j53 >> 32)) & ((((85991680 | i246) * (-374)) - 507769694) + ((i246 | 1744869452) * 374));
            int i248 = (int) j53;
            int i249 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            b = i249 % 128;
            if (i249 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i250 = i248 & ((-1704616964) + (((~(986301408 | iElapsedRealtime2)) | (-2144069622)) * 305) + (((~((~iElapsedRealtime2) | 986301408)) | (-1871439478)) * 305));
            int i251 = ((i247 & i250) | (i247 ^ i250)) != 0 ? (i77 & (-252)) | (i206 & 251) : i77;
            int i252 = ((~i240) & i77) | (i240 & i206);
            int i253 = -i252;
            int i254 = ((i252 & i253) | (i252 ^ i253)) >> 31;
            int i255 = i251 & (~i254);
            int i256 = i240 & i254;
            int i257 = (i256 & i255) | (i255 ^ i256);
            int i258 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i259 = (i258 & 370) + (i258 | 370);
            int i260 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int i261 = (i260 ^ 22) + ((i260 & 22) << 1);
            int iAxisFromString2 = MotionEvent.axisFromString(str6);
            Object[] objArr40 = new Object[1];
            a(i259, i261, (char) ((iAxisFromString2 ^ 26644) + ((iAxisFromString2 & 26644) << 1)), objArr40);
            Object[] objArr41 = {(String) objArr40[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char c8 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33603);
                int iRgb = Color.rgb(0, 0, 0) + 16780301;
                int gidForName4 = 25 - Process.getGidForName(str6);
                byte b21 = (byte) 0;
                byte b22 = (byte) (b21 - 1);
                Object[] objArr42 = new Object[1];
                c(b21, b22, (byte) (-b22), objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c8, iRgb, gidForName4, 1411172903, false, (String) objArr42[0], new Class[]{String.class});
            }
            String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr41)).toLowerCase();
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 394;
            int i262 = -Color.green(0);
            int i263 = (i262 ^ 4) + ((i262 & 4) << 1);
            int i264 = -((byte) KeyEvent.getModifierMetaStateMask());
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i265 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 48240) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 48240);
            int i266 = ~i264;
            int i267 = (((i264 * 628) - (-30294720)) - (~(-(-(((i265 ^ i266) | (i266 & i265)) * (-627)))))) - 1;
            int i268 = ~(((-48241) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-48241) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
            int i269 = ((i264 ^ i268) | (i268 & i264)) * (-627);
            int i270 = ((i267 | i269) << 1) - (i267 ^ i269);
            int i271 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i272 = ~((i271 & 48240) | (i271 ^ 48240));
            int i273 = ~((i264 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i264 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
            Object[] objArr43 = new Object[1];
            a(modifierMetaStateMask, i263, (char) (i270 + (((i273 & i272) | (i272 ^ i273)) * 627)), objArr43);
            int i274 = lowerCase.contains((String) objArr43[0]) ? (i77 & (-265)) | (i206 & 264) : i77;
            int i275 = (~(i77 & i257)) & (i77 | i257);
            int i276 = -i275;
            int i277 = ((i275 & i276) | (i275 ^ i276)) >> 31;
            int i278 = i274 & (~i277);
            int i279 = i257 & i277;
            int i280 = (i279 & i278) | (i278 ^ i279);
            Object[] objArr44 = new Object[1];
            a(397 - Color.alpha(0), 42 - View.combineMeasuredStates(0, 0), (char) ((-(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))) - 1), objArr44);
            int iBlue = 439 - Color.blue(0);
            int i281 = -(-(Process.myTid() >> 22));
            Object[] objArr45 = new Object[1];
            a(iBlue, ((i281 | 40) << 1) - (i281 ^ 40), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr45);
            int iIndexOf7 = TextUtils.indexOf(str6, str6) + 479;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 27;
            int i282 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            Object[] objArr46 = new Object[1];
            a(iIndexOf7, pressedStateDuration, (char) ((i282 ^ 7547) + ((i282 & 7547) << 1)), objArr46);
            int i283 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i284 = (i283 ^ TypedValues.PositionType.TYPE_SIZE_PERCENT) + ((i283 & TypedValues.PositionType.TYPE_SIZE_PERCENT) << 1);
            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int i285 = (minimumFlingVelocity & 27) + (minimumFlingVelocity | 27);
            int i286 = -(-TextUtils.lastIndexOf(str6, '0', 0, 0));
            Object[] objArr47 = new Object[1];
            a(i284, i285, (char) ((i286 & 1) + (i286 | 1)), objArr47);
            int i287 = -TextUtils.indexOf((CharSequence) str6, '0');
            int i288 = (i287 ^ 532) + ((i287 & 532) << 1);
            int i289 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i290 = ~((-28) | i289);
            int i291 = ~(i6 | 27);
            int i292 = (i289 * (-1939)) + 26217 + (((i290 & i291) | (i290 ^ i291)) * (-970));
            int i293 = ~i289;
            int i294 = (~((i293 ^ 27) | (i293 & 27))) * 1940;
            int i295 = ((i292 | i294) << 1) - (i292 ^ i294);
            int i296 = ~((i293 & (-28)) | (i293 ^ (-28)));
            int i297 = ~((i206 ^ 27) | (i206 & 27));
            int i298 = (i295 - (~(((i296 & i297) | (i296 ^ i297)) * 970))) - 1;
            int i299 = -TextUtils.lastIndexOf(str6, '0', 0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i300 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i301 = (i300 ^ 89) + ((i300 & 89) << 1);
            b = i301 % 128;
            int i302 = i301 % 2;
            int i303 = (784 * i299) + 782;
            int i304 = ~i299;
            int i305 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i306 = (i305 & i304) | (i304 ^ i305);
            int i307 = (~(i306 | (i306 ^ (-1)))) * (-783);
            int i308 = (i303 ^ i307) + ((i307 & i303) << 1);
            int i309 = i304 * 783;
            Object[] objArr48 = new Object[1];
            a(i288, i298, (char) ((i308 & i309) + (i309 | i308)), objArr48);
            int i310 = -KeyEvent.keyCodeFromString(str6);
            Object[] objArr49 = new Object[1];
            a(((i310 | 560) << 1) - (i310 ^ 560), 27 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr49);
            String[] strArr14 = {(String) objArr44[0], (String) objArr45[0], (String) objArr46[0], (String) objArr47[0], (String) objArr48[0], (String) objArr49[0]};
            int i311 = 0;
            while (true) {
                if (i311 >= 6) {
                    i15 = i77;
                    break;
                }
                Object[] objArr50 = {strArr14[i311]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33602);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 3086;
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                    byte b23 = (byte) 0;
                    byte b24 = (byte) (b23 - 1);
                    Object[] objArr51 = new Object[1];
                    c(b23, b24, (byte) (-b24), objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(windowTouchSlop, packedPositionChild2, scrollBarFadeDuration2, 1411172903, false, (String) objArr51[0], new Class[]{String.class});
                }
                String str31 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr50);
                if (str31 != null && !str31.isEmpty()) {
                    i15 = (~(i77 & 265)) & (i77 | 265);
                    break;
                }
                int i312 = (i311 ^ 29) + ((i311 & 29) << 1);
                i311 = (i312 & (-28)) + (i312 | (-28));
                int i313 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i314 = (i313 ^ 103) + ((i313 & 103) << 1);
                b = i314 % 128;
                if (i314 % 2 == 0) {
                    int i315 = 4 % 5;
                }
            }
            int i316 = (~(i77 & i280)) & (i77 | i280);
            int i317 = -i316;
            int i318 = ((i316 & i317) | (i316 ^ i317)) >> 31;
            int i319 = i15 & (~i318);
            int i320 = i280 & i318;
            int i321 = (i320 & i319) | (i319 ^ i320);
            int iMyTid3 = Process.myTid() >> 22;
            int i322 = (iMyTid3 * (-317)) + 110693;
            int i323 = ~iMyTid3;
            int i324 = ~((i323 ^ (-348)) | (i323 & (-348)) | i77);
            int i325 = (i206 ^ iMyTid3) | (i206 & iMyTid3);
            int i326 = ~((i325 & 347) | (i325 ^ 347));
            int i327 = ((i324 & i326) | (i324 ^ i326)) * (-318);
            int i328 = (i322 ^ i327) + ((i322 & i327) << 1);
            int i329 = ~(((-348) & iMyTid3) | ((-348) ^ iMyTid3));
            int i330 = ~(iMyTid3 | i77);
            int i331 = -(-(((i330 & i329) | (i329 ^ i330)) * (-318)));
            int i332 = (i328 & i331) + (i331 | i328);
            int i333 = ~((i323 ^ i77) | (i323 & i77));
            int i334 = i332 + (((i333 & (-348)) | ((-348) ^ i333)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i335 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
            Object[] objArr52 = new Object[1];
            a(i334, ((i335 | 17) << 1) - (i335 ^ 17), (char) KeyEvent.keyCodeFromString(str6), objArr52);
            String str32 = (String) objArr52[0];
            int iBlue2 = Color.blue(0) + 587;
            int i336 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr53 = new Object[1];
            a(iBlue2, (i336 & 7) + (i336 | 7), (char) (39532 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr53);
            Object[] objArr54 = {str32, (String) objArr53[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char c9 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int i337 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2385;
                int bitsPerPixel3 = 31 - ImageFormat.getBitsPerPixel(0);
                byte b25 = (byte) 0;
                byte b26 = (byte) (b25 - 1);
                Object[] objArr55 = new Object[1];
                c(b25, b26, (byte) (-b26), objArr55);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c9, i337, bitsPerPixel3, -1207062455, false, (String) objArr55[0], new Class[]{String.class, String.class});
            }
            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr54)).longValue();
            long j54 = 1617783093;
            long j55 = 988;
            long j56 = jLongValue7 ^ j30;
            long j57 = -988;
            long j58 = (((long) 989) * j54) + (((long) (-987)) * jLongValue7) + (((((j56 | j34) | j54) ^ j30) | (((j54 | jLongValue7) | j) ^ j30)) * j55) + ((j54 | j56) * j57) + (j55 * ((((j54 ^ j30) | j56) ^ j30) | ((j56 | j) ^ j30) | ((jLongValue7 | (j34 | j54)) ^ j30))) + ((long) 359260235);
            int i338 = ~((int) SystemClock.elapsedRealtime());
            int i339 = ((int) (j58 >> 32)) & (997962083 + ((~((-16913411) | i338)) * (-783)) + (((~(i338 | (-1134804748))) | 1722936137) * 783));
            int i340 = ((int) j58) & (104534247 + (((-1575743083) | i77) * 614) + (((~((-639684085) | i206)) | 570425748 | (~((-2076910495) | i206))) * (-1228)) + (((~((-69258337) | i206)) | (~((-1506484747) | i206))) * 614));
            if (((i339 & i340) | (i339 ^ i340)) != 0) {
                i16 = i77 ^ 260;
                j2 = j57;
            } else {
                int i341 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i342 = (i341 ^ 593) + ((i341 & 593) << 1);
                int i343 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr56 = new Object[1];
                a(i342, ((i343 | 13) << 1) - (i343 ^ 13), (char) ((-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))) - 1), objArr56);
                String str33 = (String) objArr56[0];
                int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i344 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i345 = ~((i344 & (-607)) | ((-607) ^ i344));
                int i346 = ((minimumFlingVelocity2 * (-112)) - 67872) + (((i345 & minimumFlingVelocity2) | (minimumFlingVelocity2 ^ i345)) * 226);
                int i347 = ~minimumFlingVelocity2;
                int i348 = ~(i347 | TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                int i349 = ~(i347 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                int i350 = (i349 & i348) | (i348 ^ i349);
                int i351 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i352 = (i351 & (-607)) | ((-607) ^ i351);
                int i353 = ~((minimumFlingVelocity2 & i352) | (i352 ^ minimumFlingVelocity2));
                int i354 = -(-(((i353 & i350) | (i350 ^ i353)) * (-113)));
                int i355 = (i346 & i354) + (i354 | i346);
                int i356 = (~((-607) | iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * 113;
                int i357 = ((i355 | i356) << 1) - (i356 ^ i355);
                int i358 = 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i359 = -AndroidCharacter.getMirror('0');
                Object[] objArr57 = new Object[1];
                a(i357, i358, (char) ((i359 & 43471) + (i359 | 43471)), objArr57);
                byte[] bytes3 = ((String) objArr57[0]).getBytes();
                int length4 = bytes3.length;
                if (length4 == 0) {
                    j2 = j57;
                } else {
                    try {
                        bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str33));
                        int i360 = b + 109;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i360 % 128;
                        int i361 = i360 % 2;
                        int i362 = 4096;
                        try {
                            try {
                                byte[] bArr7 = new byte[4096];
                                int i363 = 0;
                                while (true) {
                                    int i364 = bufferedInputStream4.read(bArr7, 0, i362);
                                    if (i364 <= 0) {
                                        break;
                                    }
                                    int i365 = 0;
                                    while (i363 < length4) {
                                        int i366 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i367 = (i366 ^ 25) + ((i366 & 25) << 1);
                                        b = i367 % 128;
                                        int i368 = i367 % 2;
                                        if (i365 >= i364) {
                                            break;
                                        }
                                        if (bArr7[i365] == bytes3[i363]) {
                                            i363 = (((i363 | 23) << 1) - (i363 ^ 23)) - 22;
                                        } else if (i363 != 0) {
                                            int i369 = i363 - 1;
                                            while (true) {
                                                if (i369 <= 0) {
                                                    bArr3 = bArr7;
                                                    i17 = i364;
                                                    j3 = j57;
                                                    i369 = 0;
                                                    break;
                                                }
                                                int i370 = 0;
                                                while (true) {
                                                    if (i370 >= i369) {
                                                        bArr3 = bArr7;
                                                        i17 = i364;
                                                        j3 = j57;
                                                        break;
                                                    }
                                                    byte b27 = bytes3[i370];
                                                    bArr4 = bArr7;
                                                    int i371 = -i369;
                                                    i18 = i364;
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                    j2 = j57;
                                                    int i372 = i371 * 934;
                                                    int i373 = -(-(i363 * (-932)));
                                                    int i374 = (i372 ^ i373) + ((i372 & i373) << 1);
                                                    int i375 = ~i363;
                                                    int i376 = ~i371;
                                                    int i377 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                    int i378 = ~((i376 ^ i377) | (i376 & i377));
                                                    int i379 = i374 + (((i375 ^ i378) | (i378 & i375)) * (-933));
                                                    int i380 = ~i363;
                                                    int i381 = ~((i380 ^ i377) | (i377 & i380));
                                                    int i382 = ~((i375 & i371) | (i375 ^ i371));
                                                    int i383 = ((i381 & i382) | (i381 ^ i382)) * 933;
                                                    int i384 = (i379 & i383) + (i379 | i383) + ((~(i371 | i363)) * 933);
                                                    try {
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i385 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i386 = ((i385 | 117) << 1) - (i385 ^ 117);
                                                        b = i386 % 128;
                                                        if (i386 % 2 == 0) {
                                                            int i387 = -i384;
                                                            i19 = (((i370 * 784) - (~(-((i387 & (-782)) + (i387 | (-782)))))) - 1) / ((~i384) * (-783));
                                                        } else {
                                                            int i388 = (i370 * 784) + (i384 * (-782));
                                                            int i389 = (~i384) * (-783);
                                                            i19 = (i388 ^ i389) + ((i388 & i389) << 1);
                                                        }
                                                        int i390 = ~i370;
                                                        int i391 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                        int i392 = (i390 ^ i391) | (i391 & i390);
                                                        int i393 = (-783) * (~((i392 ^ i384) | (i392 & i384)));
                                                        int i394 = (i19 & i393) + (i19 | i393);
                                                        int i395 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | i384);
                                                        int i396 = ((i395 & i390) | (i390 ^ i395)) * 783;
                                                        if (b27 != bytes3[(i394 & i396) + (i396 | i394)]) {
                                                            break;
                                                        }
                                                        int i397 = (i370 ^ 28) + ((i370 & 28) << 1);
                                                        i370 = (i397 & (-27)) + (i397 | (-27));
                                                        bArr7 = bArr4;
                                                        i364 = i18;
                                                        j57 = j2;
                                                        i363 = i363;
                                                    } catch (IOException unused7) {
                                                        if (bufferedInputStream4 != null) {
                                                            try {
                                                                bufferedInputStream4.close();
                                                            } catch (IOException unused8) {
                                                            }
                                                        }
                                                        i16 = i77;
                                                        int i398 = ((~i321) & i77) | (i321 & i206);
                                                        int i399 = (i398 | (-i398)) >> 31;
                                                        i20 = (i321 & i399) | (i16 & (~i399));
                                                        if ((i2 & 8) == 0) {
                                                            strArr8 = new String[3];
                                                            i67 = -TextUtils.getOffsetAfter(str6, 0);
                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i400 = i67 * (-947);
                                                            int i401 = (i400 ^ 583635) + ((i400 & 583635) << 1);
                                                            int i402 = ((~i67) | (~(((-616) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-616) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))) * (-948);
                                                            i68 = (i401 ^ i402) + ((i402 & i401) << 1);
                                                            i69 = ~i67;
                                                            i70 = b + 13;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i70 % 128;
                                                            if (i70 % 2 != 0) {
                                                                int i403 = (i69 & (-616)) | (i69 ^ (-616));
                                                                int i404 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                i71 = i68 << ((~((i404 & i403) | (i403 ^ i404))) - 948);
                                                                i72 = 948 / ((i67 & (-616)) | (i67 ^ (-616)));
                                                            } else {
                                                                int i405 = (i69 & (-616)) | (i69 ^ (-616));
                                                                int i406 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                int i407 = (~((i406 & i405) | (i405 ^ i406))) * (-948);
                                                                i71 = ((i68 | i407) << 1) - (i407 ^ i68);
                                                                i72 = ((i67 & (-616)) | (i67 ^ (-616))) * 948;
                                                            }
                                                            int i408 = i71 + i72;
                                                            char mirror3 = AndroidCharacter.getMirror('0');
                                                            Object[] objArr58 = new Object[1];
                                                            a(i408, (mirror3 ^ (-5)) + ((mirror3 & (-5)) << 1), (char) ExpandableListView.getPackedPositionType(0L), objArr58);
                                                            strArr8[0] = (String) objArr58[0];
                                                            Object[] objArr59 = new Object[1];
                                                            a((ViewConfiguration.getPressedStateDuration() >> 16) + 658, 41 - Drawable.resolveOpacity(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr59);
                                                            strArr8[1] = (String) objArr59[0];
                                                            int i409 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                            int i410 = ((i409 | 699) << 1) - (i409 ^ 699);
                                                            int i411 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            Object[] objArr60 = new Object[1];
                                                            a(i410, ((i411 | 38) << 1) - (i411 ^ 38), (char) (15463 - (KeyEvent.getMaxKeyCode() >> 16)), objArr60);
                                                            strArr8[2] = (String) objArr60[0];
                                                            i73 = 0;
                                                            while (true) {
                                                                if (i73 < 3) {
                                                                    i74 = i77;
                                                                    break;
                                                                }
                                                                Object[] objArr61 = {strArr8[i73]};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf(str6, '0', 0, 0) + 1);
                                                                    int mode = View.MeasureSpec.getMode(0) + 993;
                                                                    int iRed2 = 8 - Color.red(0);
                                                                    byte b28 = (byte) 0;
                                                                    byte b29 = (byte) (b28 - 1);
                                                                    Object[] objArr62 = new Object[1];
                                                                    c(b28, b29, (byte) (b29 + 1), objArr62);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf, mode, iRed2, 349342683, false, (String) objArr62[0], new Class[]{String.class});
                                                                }
                                                                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr61)).longValue();
                                                                long j59 = 409131659;
                                                                long j60 = (((long) 491) * j59) + (((long) (-489)) * jLongValue8);
                                                                long j61 = j59 ^ j30;
                                                                long j62 = jLongValue8 ^ j30;
                                                                long j63 = 490;
                                                                long j64 = j60 + (((long) (-490)) * (j61 | j62 | j34)) + ((((j62 | j) ^ j30) | ((j59 | j62) ^ j30)) * j63) + (j63 * j61) + ((long) (-1256210264));
                                                                int i412 = ~((-802407470) | i206);
                                                                i75 = ((int) (j64 >> 32)) & (((266576 | i412 | (~(802407469 | i77))) * (-338)) + 1527329098 + ((i412 | (~(802674045 | i77))) * 338));
                                                                int i413 = ~((int) Process.getStartElapsedRealtime());
                                                                i76 = ((int) j64) & ((((-1754753727) + (((~((-1477741073) | i413)) | 40514662) * (-828))) + ((i413 | (-1477741073)) * (-828))) - 496071744);
                                                                if (((i75 & i76) | (i75 ^ i76)) != 0) {
                                                                    int i414 = (i73 ^ 280) + ((i73 & 280) << 1);
                                                                    i74 = (~(i77 & i414)) & (i414 | i77);
                                                                    break;
                                                                }
                                                                i73++;
                                                            }
                                                            int i415 = i77 ^ i20;
                                                            int i416 = (i415 | (-i415)) >> 31;
                                                            i20 = (i20 & i416) | (i74 & (~i416));
                                                        }
                                                        int i417 = -MotionEvent.axisFromString(str6);
                                                        int i418 = -(-View.resolveSizeAndState(0, 0, 0));
                                                        int i419 = ((i418 | 41) << 1) - (i418 ^ 41);
                                                        int i420 = -Gravity.getAbsoluteGravity(0, 0);
                                                        Object[] objArr63 = new Object[1];
                                                        a((i417 & 736) + (i417 | 736), i419, (char) (((i420 | 52690) << 1) - (i420 ^ 52690)), objArr63);
                                                        String str34 = (String) objArr63[0];
                                                        int i421 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                        int i422 = (i421 & 778) + (i421 | 778);
                                                        int i423 = -KeyEvent.getDeadChar(0, 0);
                                                        int i424 = (i423 ^ 30) + ((i423 & 30) << 1);
                                                        int i425 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                        Object[] objArr64 = new Object[1];
                                                        a(i422, i424, (char) ((i425 ^ 37855) + ((i425 & 37855) << 1)), objArr64);
                                                        strArr = new String[]{str34, (String) objArr64[0]};
                                                        i21 = 0;
                                                        while (true) {
                                                            if (i21 < 2) {
                                                                i22 = i77;
                                                                break;
                                                            }
                                                            Object[] objArr65 = {strArr[i21]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                                char c10 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                                                                int iResolveSize = View.resolveSize(0, 0) + 993;
                                                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8;
                                                                byte b30 = (byte) 0;
                                                                byte b31 = (byte) (b30 - 1);
                                                                Object[] objArr66 = new Object[1];
                                                                c(b30, b31, (byte) (-b31), objArr66);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c10, iResolveSize, scrollDefaultDelay, 410748506, false, (String) objArr66[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr65)).longValue();
                                                            long j65 = 1616225122;
                                                            long j66 = jLongValue9 ^ j30;
                                                            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                            long j67 = (((long) 319) * j65) + (((long) (-317)) * jLongValue9) + (((long) (-318)) * (j66 | (((j65 ^ j30) | startElapsedRealtime) ^ j30)));
                                                            long j68 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                                            long j69 = startElapsedRealtime ^ j30;
                                                            long j70 = j67 + ((((j66 | startElapsedRealtime) ^ j30) | (((j69 | j65) | jLongValue9) ^ j30)) * j68) + (j68 * ((((j66 | j69) | j65) ^ j30) | ((startElapsedRealtime | (jLongValue9 | j65)) ^ j30))) + ((long) (-1817143359));
                                                            int iNextInt3 = new Random().nextInt(682780470);
                                                            i65 = ((int) (j70 >> 32)) & ((-2042405954) + (((~((-3475116) | (~iNextInt3))) | (-1433751296)) * (-591)) + ((iNextInt3 | (-3475116)) * 591));
                                                            int iNextInt4 = new Random().nextInt();
                                                            i66 = ((int) j70) & (397513505 + (((~(1777049171 | iNextInt4)) | 1080691714) * (-756)) + (((~iNextInt4) | 1777049171) * 756));
                                                            if (((i65 & i66) | (i65 ^ i66)) != 0) {
                                                                int i426 = i21 + 288;
                                                                i22 = ((~i426) & i77) | (i426 & i206);
                                                                int i427 = b;
                                                                int i428 = (i427 & 85) + (i427 | 85);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i428 % 128;
                                                                int i429 = i428 % 2;
                                                                break;
                                                            }
                                                            i21 = ((i21 & 1) << 1) + (i21 ^ 1);
                                                        }
                                                        int i430 = ((~i20) & i77) | (i20 & i206);
                                                        int i431 = -i430;
                                                        int i432 = ((i430 & i431) | (i430 ^ i431)) >> 31;
                                                        int i433 = i22 & (~i432);
                                                        int i434 = i20 & i432;
                                                        i23 = (i434 & i433) | (i433 ^ i434);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3526;
                                                            int i435 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            byte b32 = (byte) 0;
                                                            byte b33 = (byte) (b32 - 1);
                                                            Object[] objArr67 = new Object[1];
                                                            c(b32, b33, (byte) (-b33), objArr67);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout2, iNormalizeMetaState, i435, 980946500, false, (String) objArr67[0], new Class[0]);
                                                        }
                                                        long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                                                        long j71 = 1210889704;
                                                        j4 = 495;
                                                        j5 = -493;
                                                        long j72 = (j4 * j71) + (j5 * jLongValue10);
                                                        long j73 = jLongValue10 ^ j30;
                                                        j6 = 494;
                                                        long j74 = j71 ^ j30;
                                                        long jFreeMemory = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j30;
                                                        j7 = j72 + ((j71 | j73) * j2) + ((jLongValue10 | j74 | jFreeMemory) * j6) + ((((jLongValue10 | j71) ^ j30) | ((j74 | j73) ^ j30) | ((jFreeMemory | jLongValue10) ^ j30)) * j6) + ((long) (-1391212342));
                                                        i24 = ((int) (j7 >> 32)) & (797435786 + (((-25692417) | i206) * 184) + (((~(772879974 | i206)) | (-159918371)) * 184));
                                                        i25 = (int) Runtime.getRuntime().totalMemory();
                                                        i26 = (-71695567) + ((i25 | (-2145312380)) * 988);
                                                        i27 = ~i25;
                                                        if ((i24 | (((int) j7) & (i26 + (((~((-1808309796) | i27)) | 34080801) * (-1976)) + (((~(i25 | (-371083386))) | (-2145312380) | (~(371083385 | i27))) * 988)))) != 1) {
                                                            Object[] objArr68 = {1};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                int windowTouchSlop2 = 2673 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                int i436 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15;
                                                                byte b34 = (byte) 0;
                                                                byte b35 = (byte) (b34 - 1);
                                                                Object[] objArr69 = new Object[1];
                                                                c(b34, b35, (byte) (-b35), objArr69);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, windowTouchSlop2, i436, -1409439630, false, (String) objArr69[0], new Class[]{Integer.TYPE});
                                                            }
                                                            long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr68)).longValue();
                                                            long j75 = 69815762;
                                                            long j76 = 521;
                                                            long j77 = j75 ^ j30;
                                                            long j78 = ((jLongValue11 ^ j30) | j75) ^ j30;
                                                            long j79 = (((long) (-520)) * j75) + (((long) 522) * jLongValue11) + ((((j77 | jLongValue11) | j) ^ j30) * j76) + (((long) (-1042)) * j78) + (j76 * (((jLongValue11 | (j77 | j34)) ^ j30) | j78)) + ((long) 1797882918);
                                                            i30 = ((int) (j79 >> 32)) & (632284092 + (((~(337910500 | i77)) | (-1099315911)) * (-465)) + ((337910500 | (~((-1099315911) | i77))) * 930) + (((-1099046915) | i77) * 465));
                                                            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                                            int i437 = (~(61811623 | iFreeMemory2)) | (-1409231784);
                                                            int i438 = ~((~iFreeMemory2) | (-27994627));
                                                            i31 = ((int) j79) & (1943765989 + ((i437 | i438) * (-470)) + (((~(iFreeMemory2 | (-1347420161))) | i438) * 470));
                                                            if (((i30 & i31) | (i30 ^ i31)) != 0) {
                                                                i32 = (~(i77 & 220)) & (i77 | 220);
                                                            } else {
                                                                i32 = i77;
                                                            }
                                                            int i439 = (~(i77 & i23)) & (i77 | i23);
                                                            int i440 = -i439;
                                                            int i441 = ((i439 & i440) | (i439 ^ i440)) >> 31;
                                                            i33 = (i23 & i441) | (i32 & (~i441));
                                                            int i442 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                            int i443 = (i442 & 370) + (i442 | 370);
                                                            int iResolveOpacity = 23 - Drawable.resolveOpacity(0, 0);
                                                            int i444 = -MotionEvent.axisFromString(str6);
                                                            Object[] objArr70 = new Object[1];
                                                            a(i443, iResolveOpacity, (char) ((i444 & 26642) + (i444 | 26642)), objArr70);
                                                            Object[] objArr71 = {(String) objArr70[0]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 33602);
                                                                int iKeyCodeFromString = KeyEvent.keyCodeFromString(str6) + 3085;
                                                                int maximumFlingVelocity = 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                byte b36 = (byte) 0;
                                                                byte b37 = (byte) (b36 - 1);
                                                                Object[] objArr72 = new Object[1];
                                                                c(b36, b37, (byte) (-b37), objArr72);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType, iKeyCodeFromString, maximumFlingVelocity, 1411172903, false, (String) objArr72[0], new Class[]{String.class});
                                                            }
                                                            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr71);
                                                            try {
                                                                if (objInvoke != null) {
                                                                    Object[] objArr73 = {objInvoke, 42};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                                                        int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str6) + 3393;
                                                                        int mirror4 = '9' - AndroidCharacter.getMirror('0');
                                                                        byte b38 = (byte) 0;
                                                                        byte b39 = (byte) (b38 - 1);
                                                                        Object[] objArr74 = new Object[1];
                                                                        c(b38, b39, (byte) (-b39), objArr74);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(touchSlop, iKeyCodeFromString2, mirror4, 1203525406, false, (String) objArr74[0], new Class[]{String.class, Integer.TYPE});
                                                                    }
                                                                    long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr73)).longValue();
                                                                    long j80 = 833424170;
                                                                    long j81 = (j4 * j80) + (j5 * jLongValue12);
                                                                    long j82 = jLongValue12 ^ j30;
                                                                    long j83 = j80 ^ j30;
                                                                    long jFreeMemory2 = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j30;
                                                                    j10 = j81 + ((j80 | j82) * j2) + ((jLongValue12 | j83 | jFreeMemory2) * j6) + (j6 * (((jFreeMemory2 | jLongValue12) ^ j30) | ((j83 | j82) ^ j30) | ((jLongValue12 | j80) ^ j30))) + ((long) (-835494047));
                                                                    int i445 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    i60 = ((i445 | 29) << 1) - (i445 ^ 29);
                                                                    b = i60 % 128;
                                                                    if (i60 % 2 == 0) {
                                                                        int i446 = ~((int) SystemClock.elapsedRealtime());
                                                                        i61 = ((int) (j10 >> 97)) & (1844193994 + (((~(i446 | 111133008)) | (-1335874907)) * (-160)) + (((~(i446 | (-1326093403))) | 111133008) * 160));
                                                                        i62 = (int) j10;
                                                                        int i447 = ~new Random().nextInt(1561242732);
                                                                        i63 = 1491329174 + (((~(304988418 | i447)) | 1132237991) * (-983)) + (((~(i447 | 1132237991)) | 268517632) * 983);
                                                                    } else {
                                                                        int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                                                        i61 = ((int) (j10 >> 32)) & (1303314366 + (((~(1733011407 | iElapsedRealtime3)) | (~((~iElapsedRealtime3) | (-1124729478)))) * (-318)) + (((~((-1124770694) | iElapsedRealtime3)) | 41216) * (-318)) + (((~(iElapsedRealtime3 | 1124770693)) | 1732970191) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                                                        i62 = (int) j10;
                                                                        i63 = 1320243365 + (((~((-371071834) | i77)) | 336988760) * 1504) + ((~((-34083074) | i77)) * (-1504)) + 1512543408;
                                                                    }
                                                                    i64 = i62 & i63;
                                                                    if (((i61 & i64) | (i61 ^ i64)) == 1986687685) {
                                                                        strArr4 = null;
                                                                        j8 = j30;
                                                                    }
                                                                    int i448 = -(-KeyEvent.normalizeMetaState(0));
                                                                    int i449 = (i448 & 889) + (i448 | 889);
                                                                    int i450 = -(-TextUtils.lastIndexOf(str6, '0'));
                                                                    Object[] objArr75 = new Object[1];
                                                                    a(i449, ((i450 | 17) << 1) - (i450 ^ 17), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr75);
                                                                    Object[] objArr76 = {(String) objArr75[0]};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                        char cIndexOf = (char) (33602 - TextUtils.indexOf(str6, str6, 0));
                                                                        int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                                                                        int i451 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                                                                        byte b40 = (byte) 0;
                                                                        byte b41 = (byte) (b40 - 1);
                                                                        Object[] objArr77 = new Object[1];
                                                                        c(b40, b41, (byte) (-b41), objArr77);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, keyRepeatTimeout3, i451, 1411172903, false, (String) objArr77[0], new Class[]{String.class});
                                                                    }
                                                                    objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr76);
                                                                    if (objInvoke2 == null) {
                                                                        i38 = 0;
                                                                    } else {
                                                                        Object[] objArr78 = {objInvoke2, 42};
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                            char c11 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                            int iMyPid = (Process.myPid() >> 22) + 3393;
                                                                            int scrollBarSize = 9 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                                            byte b42 = (byte) 0;
                                                                            byte b43 = (byte) (b42 - 1);
                                                                            Object[] objArr79 = new Object[1];
                                                                            c(b42, b43, (byte) (-b43), objArr79);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c11, iMyPid, scrollBarSize, 1203525406, false, (String) objArr79[0], new Class[]{String.class, Integer.TYPE});
                                                                        }
                                                                        long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr78)).longValue();
                                                                        long j84 = 1451827883;
                                                                        long jFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                                                        long j85 = jLongValue13 ^ j8;
                                                                        long j86 = 676;
                                                                        long j87 = jFreeMemory3 ^ j8;
                                                                        long j88 = (((long) 677) * j84) + (((long) (-675)) * jLongValue13) + (((long) (-676)) * (j84 | jFreeMemory3 | j85)) + ((((j85 | j84) ^ j8) | ((j87 | j84) ^ j8)) * j86) + (j86 * ((((j84 ^ j8) | j85) ^ j8) | ((j85 | j87) ^ j8) | (((jLongValue13 | j84) | jFreeMemory3) ^ j8))) + ((long) (-1453897760));
                                                                        int i452 = ((int) (j88 >> 32)) & ((-827560772) + ((~((-631252227) | i77)) * 623) + ((i206 | 262160) * (-623)) + (((~((-1034108239) | i77)) | 631252226 | (~(403118172 | i77))) * 623));
                                                                        int i453 = ~(i206 | 2100271662);
                                                                        int i454 = ((int) j88) & ((((1342802440 | i453) * (-374)) - 1565934975) + ((i453 | 757469222) * 374));
                                                                        i38 = (i452 & i454) | (i452 ^ i454);
                                                                    }
                                                                    if (i38 != 1986687685) {
                                                                        i28 = i77;
                                                                        strArr5 = strArr4;
                                                                        i39 = i33;
                                                                    } else {
                                                                        i28 = i77;
                                                                        strArr5 = strArr4;
                                                                        i39 = i33;
                                                                    }
                                                                    int i455 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                    Object[] objArr80 = new Object[1];
                                                                    a(((i455 | 1950) << 1) - (i455 ^ 1950), '=' - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(0, 0), objArr80);
                                                                    int offsetAfter = TextUtils.getOffsetAfter(str6, 0);
                                                                    int i456 = (offsetAfter & 1963) + (offsetAfter | 1963);
                                                                    int i457 = -(Process.myTid() >> 22);
                                                                    int i458 = (i457 & 5) + (i457 | 5);
                                                                    int i459 = b + 109;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i459 % 128;
                                                                    int i460 = i459 % 2;
                                                                    Object[] objArr81 = new Object[1];
                                                                    a(i456, i458, (char) (54525 - (~Color.argb(0, 0, 0, 0))), objArr81);
                                                                    String[] strArr15 = {(String) objArr80[0], (String) objArr81[0]};
                                                                    int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                                                                    Object[] objArr82 = new Object[1];
                                                                    a((maxKeyCode2 & 1968) + (maxKeyCode2 | 1968), TextUtils.lastIndexOf(str6, '0', 0) + 16, (char) (Process.myTid() >> 22), objArr82);
                                                                    String str35 = (String) objArr82[0];
                                                                    int i461 = 1982 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                                                                    int i462 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                    Object[] objArr83 = new Object[1];
                                                                    a(i461, (i462 ^ 19) + ((i462 & 19) << 1), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr83);
                                                                    String str36 = (String) objArr83[0];
                                                                    int i463 = 2001 - (~View.getDefaultSize(0, 0));
                                                                    int i464 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                                    int i465 = ((i464 | 14) << 1) - (i464 ^ 14);
                                                                    int i466 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                    Object[] objArr84 = new Object[1];
                                                                    a(i463, i465, (char) (((i466 | 20937) << 1) - (i466 ^ 20937)), objArr84);
                                                                    int i467 = -(-Drawable.resolveOpacity(0, 0));
                                                                    Object[] objArr85 = new Object[1];
                                                                    a(((i467 | 2016) << 1) - (i467 ^ 2016), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, (char) (Process.myPid() >> 22), objArr85);
                                                                    String str37 = (String) objArr85[0];
                                                                    int iIndexOf8 = 2037 - TextUtils.indexOf(str6, str6, 0);
                                                                    int iRed3 = 10 - Color.red(0);
                                                                    int i468 = -KeyEvent.normalizeMetaState(0);
                                                                    Object[] objArr86 = new Object[1];
                                                                    a(iIndexOf8, iRed3, (char) ((i468 & 42564) + (i468 | 42564)), objArr86);
                                                                    int i469 = 2047 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                                    int iResolveSize2 = View.resolveSize(0, 0);
                                                                    int i470 = (iResolveSize2 * 450) - 4928;
                                                                    int i471 = ~iResolveSize2;
                                                                    int i472 = -(-(((~((i471 & 11) | (i471 ^ 11))) | (~(((-12) ^ iResolveSize2) | ((-12) & iResolveSize2) | i28))) * 449));
                                                                    int i473 = (i470 ^ i472) + ((i470 & i472) << 1);
                                                                    int i474 = ~iResolveSize2;
                                                                    int i475 = (i473 - (~(-(-((~(i474 | 11)) * (-1347)))))) - 1;
                                                                    int i476 = ~((i474 & 11) | (i474 ^ 11));
                                                                    int i477 = ~(iResolveSize2 | ((-12) ^ i206) | ((-12) & i206));
                                                                    int i478 = -(-(((i476 & i477) | (i476 ^ i477)) * 449));
                                                                    int i479 = (i475 & i478) + (i478 | i475);
                                                                    int i480 = -(-View.combineMeasuredStates(0, 0));
                                                                    Object[] objArr87 = new Object[1];
                                                                    a(i469, i479, (char) ((i480 ^ 32340) + ((i480 & 32340) << 1)), objArr87);
                                                                    String str38 = (String) objArr87[0];
                                                                    int bitsPerPixel4 = 586 - ImageFormat.getBitsPerPixel(0);
                                                                    int iIndexOf9 = TextUtils.indexOf(str6, str6, 0);
                                                                    int i481 = ((iIndexOf9 | 6) << 1) - (iIndexOf9 ^ 6);
                                                                    int i482 = -View.resolveSizeAndState(0, 0, 0);
                                                                    Object[] objArr88 = new Object[1];
                                                                    a(bitsPerPixel4, i481, (char) ((i482 ^ 39532) + ((i482 & 39532) << 1)), objArr88);
                                                                    int touchSlop2 = 2058 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                    int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                                    int i483 = -Gravity.getAbsoluteGravity(0, 0);
                                                                    Object[] objArr89 = new Object[1];
                                                                    a(touchSlop2, longPressTimeout, (char) (((i483 | 3641) << 1) - (i483 ^ 3641)), objArr89);
                                                                    String str39 = (String) objArr89[0];
                                                                    int i484 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                    int i485 = (i484 & 2037) + (i484 | 2037);
                                                                    int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                                    int i486 = ((maximumDrawingCacheSize | 10) << 1) - (maximumDrawingCacheSize ^ 10);
                                                                    c3 = 0;
                                                                    Object[] objArr90 = new Object[1];
                                                                    a(i485, i486, (char) (42564 - (~TextUtils.indexOf((CharSequence) str6, '0', 0))), objArr90);
                                                                    strArr6 = new String[][]{strArr15, new String[]{str35, str36, (String) objArr84[0]}, new String[]{str37, (String) objArr86[0]}, new String[]{str38, (String) objArr88[0]}, new String[]{str39, (String) objArr90[0]}};
                                                                    i40 = 0;
                                                                    i41 = 5;
                                                                    i42 = -1;
                                                                    loop7: while (true) {
                                                                        if (i40 < i41) {
                                                                            str10 = str6;
                                                                            i43 = i28;
                                                                            break;
                                                                        }
                                                                        String[] strArr16 = strArr6[i40];
                                                                        str14 = strArr16[c3];
                                                                        i55 = 1;
                                                                        strArr7 = (String[]) Arrays.copyOfRange(strArr16, 1, strArr16.length);
                                                                        length2 = strArr7.length;
                                                                        i56 = 0;
                                                                        while (i56 < length2) {
                                                                            int i487 = (i42 ^ 114) + ((i42 & 114) << i55);
                                                                            i42 = (i487 & (-113)) + (i487 | (-113));
                                                                            Object[] objArr91 = {str14, strArr7[i56]};
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                                char c12 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                                int mirror5 = 2433 - AndroidCharacter.getMirror('0');
                                                                                int pressedStateDuration2 = 32 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                                byte b44 = (byte) 0;
                                                                                byte b45 = (byte) (b44 - 1);
                                                                                Object[] objArr92 = new Object[1];
                                                                                c(b44, b45, (byte) (-b45), objArr92);
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c12, mirror5, pressedStateDuration2, -1207062455, false, (String) objArr92[0], new Class[]{String.class, String.class});
                                                                            }
                                                                            long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr91)).longValue();
                                                                            long j89 = 1937243375;
                                                                            str15 = str14;
                                                                            long j90 = 623;
                                                                            long j91 = jLongValue14 ^ j8;
                                                                            long j92 = j91 | j89;
                                                                            str10 = str6;
                                                                            j9 = (((long) 624) * j89) + (((long) (-622)) * jLongValue14) + (((j92 | j) ^ j8) * j90) + (((long) (-623)) * (j34 | (((j89 ^ j8) | jLongValue14) ^ j8))) + (j90 * ((j92 ^ j8) | ((j91 | j) ^ j8) | ((j89 | j) ^ j8))) + ((long) 39799953);
                                                                            int i488 = ~Process.myPid();
                                                                            i57 = ((int) (j9 >> 32)) & ((((-1453537304) + (((~(175994551 | i488)) | (-1613220963)) * (-933))) + (((~(i488 | (-1613220963))) | 2442274) * 933)) - 1284482807);
                                                                            iNextInt = new Random().nextInt(1982938085);
                                                                            if (((((int) j9) & ((-420073766) + (((~(997543263 | (~iNextInt))) | 439683146) * (-591)) + ((iNextInt | 997543263) * 591))) | i57) != 0) {
                                                                                DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                i43 = ((i42 & 170) + (i42 | 170)) ^ i28;
                                                                                break loop7;
                                                                            }
                                                                            int i489 = ((i56 | (-110)) << 1) - (i56 ^ (-110));
                                                                            i56 = (i489 & 111) + (i489 | 111);
                                                                            strArr7 = strArr7;
                                                                            str14 = str15;
                                                                            strArr6 = strArr6;
                                                                            length2 = length2;
                                                                            str6 = str10;
                                                                            i55 = 1;
                                                                        }
                                                                        i40 = (i40 & 1) + (i40 | 1);
                                                                        strArr6 = strArr6;
                                                                        c3 = 0;
                                                                        i41 = 5;
                                                                    }
                                                                    int i490 = i28 ^ i39;
                                                                    int i491 = -i490;
                                                                    int i492 = ((i490 & i491) | (i490 ^ i491)) >> 31;
                                                                    int i493 = i43 & (~i492);
                                                                    int i494 = i39 & i492;
                                                                    int i495 = (i493 ^ i494) | (i494 & i493);
                                                                    str11 = str10;
                                                                    int iIndexOf10 = TextUtils.indexOf(str11, str11, 0);
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                    int i496 = iIndexOf10 * (-381);
                                                                    int i497 = (i496 ^ 400512) + ((i496 & 400512) << 1);
                                                                    int i498 = ~iIndexOf10;
                                                                    int i499 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 2086) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 2086));
                                                                    Object[] objArr93 = new Object[1];
                                                                    a((((i497 + (i498 * (-191))) + (((iIndexOf10 & i499) | (iIndexOf10 ^ i499)) * 191)) - (~(((~(i498 | 2086)) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | 2086))) * 191))) - 1, 13 - (~(-(-Process.getGidForName(str11)))), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr93);
                                                                    str13 = (String) objArr93[0];
                                                                    Object[] objArr94 = new Object[1];
                                                                    a(2098 - (~(-KeyEvent.getDeadChar(0, 0))), 7 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr94);
                                                                    bytes = ((String) objArr94[0]).getBytes();
                                                                    length = bytes.length;
                                                                    if (length == 0) {
                                                                        i44 = i28 ^ 150;
                                                                    } else {
                                                                        try {
                                                                            bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str13));
                                                                            i48 = 4096;
                                                                            try {
                                                                                bArr5 = new byte[4096];
                                                                                i49 = 0;
                                                                                while (true) {
                                                                                    i50 = bufferedInputStream5.read(bArr5, 0, i48);
                                                                                    if (i50 > 0) {
                                                                                        break;
                                                                                    }
                                                                                    int i500 = b + 51;
                                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i500 % 128;
                                                                                    int i501 = i500 % 2;
                                                                                    DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                    DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                    i51 = 0;
                                                                                    while (i49 < length) {
                                                                                        if (bArr5[i51] == bytes[i49]) {
                                                                                            if (i49 != 0) {
                                                                                                i52 = (-2) - (i49 ^ (-1));
                                                                                                while (true) {
                                                                                                    if (i52 > 0) {
                                                                                                        i49 = 0;
                                                                                                        break;
                                                                                                    }
                                                                                                    i53 = 0;
                                                                                                    while (true) {
                                                                                                        if (i53 < i52) {
                                                                                                            i49 = i52;
                                                                                                            break;
                                                                                                        }
                                                                                                        int i502 = -i52;
                                                                                                        i54 = (i49 & i502) + (i502 | i49);
                                                                                                        if (bytes[i53] != bytes[((i54 | i53) << 1) - (i54 ^ i53)]) {
                                                                                                            break;
                                                                                                        }
                                                                                                        i53 = ((i53 & 1) << 1) + (i53 ^ 1);
                                                                                                    }
                                                                                                    i52 = (-2) - (~i52);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            i49 = (i49 | 1) + (i49 & 1);
                                                                                        }
                                                                                        i51 = ((i51 | 1) << 1) - (i51 ^ 1);
                                                                                    }
                                                                                    i48 = 4096;
                                                                                }
                                                                                if (i49 == length) {
                                                                                    z = true;
                                                                                } else {
                                                                                    z = false;
                                                                                }
                                                                                try {
                                                                                    bufferedInputStream5.close();
                                                                                } catch (IOException unused9) {
                                                                                }
                                                                                if (z) {
                                                                                    i44 = i28 ^ 150;
                                                                                } else {
                                                                                    i44 = i28;
                                                                                }
                                                                            } catch (IOException unused10) {
                                                                                if (bufferedInputStream5 != null) {
                                                                                    try {
                                                                                        bufferedInputStream5.close();
                                                                                    } catch (IOException unused11) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                if (bufferedInputStream5 != null) {
                                                                                    try {
                                                                                        bufferedInputStream5.close();
                                                                                    } catch (IOException unused12) {
                                                                                    }
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (IOException unused13) {
                                                                            bufferedInputStream5 = null;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            bufferedInputStream5 = null;
                                                                        }
                                                                    }
                                                                    int i503 = i28 ^ i495;
                                                                    int i504 = -i503;
                                                                    int i505 = ((i503 & i504) | (i503 ^ i504)) >> 31;
                                                                    int i506 = i44 & (~i505);
                                                                    int i507 = i495 & i505;
                                                                    int i508 = (i506 & i507) | (i506 ^ i507);
                                                                    int i509 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    int i510 = ((i509 | 123) << 1) - (i509 ^ 123);
                                                                    b = i510 % 128;
                                                                    int i511 = i510 % 2;
                                                                    bitsPerPixel = 2106 - ImageFormat.getBitsPerPixel(0);
                                                                    int i512 = -View.MeasureSpec.getSize(0);
                                                                    i45 = ((i512 | 47) << 1) - (i512 ^ 47);
                                                                    int i513 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                    i46 = (i513 & 83) + (i513 | 83);
                                                                    b = i46 % 128;
                                                                    if (i46 % 2 == 0) {
                                                                        Object[] objArr95 = new Object[1];
                                                                        a(bitsPerPixel, i45, (char) (46557 / TextUtils.indexOf((CharSequence) str11, (char) 26)), objArr95);
                                                                        str12 = (String) objArr95[0];
                                                                        i47 = 0;
                                                                    } else {
                                                                        int i514 = -TextUtils.indexOf((CharSequence) str11, '0');
                                                                        char c13 = (char) ((i514 ^ 46557) + ((46557 & i514) << 1));
                                                                        Object[] objArr96 = new Object[1];
                                                                        a(bitsPerPixel, i45, c13, objArr96);
                                                                        i47 = 0;
                                                                        str12 = (String) objArr96[0];
                                                                    }
                                                                    Object[] objArr97 = {str12};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                        char deadChar = (char) KeyEvent.getDeadChar(i47, i47);
                                                                        int iIndexOf11 = TextUtils.indexOf(str11, str11) + 993;
                                                                        int i515 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7;
                                                                        byte b46 = (byte) 0;
                                                                        byte b47 = (byte) (b46 - 1);
                                                                        Object[] objArr98 = new Object[1];
                                                                        c(b46, b47, (byte) (b47 + 1), objArr98);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar, iIndexOf11, i515, 349342683, false, (String) objArr98[0], new Class[]{String.class});
                                                                    }
                                                                    long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr97)).longValue();
                                                                    long j93 = -710532123;
                                                                    long j94 = -712;
                                                                    long j95 = jLongValue15 ^ j8;
                                                                    long j96 = (j34 | j93) ^ j8;
                                                                    long j97 = (((long) (-711)) * j93) + (((long) 713) * jLongValue15) + ((((j95 | j93) ^ j8) | j96) * j94) + (j94 * ((((j95 | j34) | j93) ^ j8) | (((jLongValue15 | j93) | j) ^ j8))) + (((long) 712) * (j95 | j96)) + ((long) (-136546482));
                                                                    int i516 = ((int) (j97 >> 32)) & (112162949 + (((~(1045118418 | i206)) | (-1812622467)) * (-602)) + (((~(1045118418 | i28)) | (-2118876627) | (~(i206 | (-738864259)))) * (-301)) + ((~(i206 | (-1812622467))) * 301));
                                                                    int i517 = ((int) j97) & ((-1648223513) + ((1233496469 | i28) * 614) + (((~(1309867659 | i206)) | 25493780 | (~(i206 | (-127358751)))) * (-1228)) + (((~(1335361439 | i206)) | (~(i206 | (-101864971)))) * 614));
                                                                    int i518 = ((i516 & i517) | (i516 ^ i517)) * 263;
                                                                    int i519 = (i518 & i206) | ((~i518) & i28);
                                                                    int i520 = (~(i28 & i508)) & (i28 | i508);
                                                                    int i521 = -i520;
                                                                    int i522 = ((i520 & i521) | (i520 ^ i521)) >> 31;
                                                                    int i523 = i519 & (~i522);
                                                                    int i524 = i508 & i522;
                                                                    i23 = (i524 & i523) | (i523 ^ i524);
                                                                    strArr2 = strArr5;
                                                                    i29 = 5;
                                                                }
                                                                int iIndexOf12 = TextUtils.indexOf(str11, str11, 0);
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i4910 = iIndexOf12 * (-381);
                                                                int i4911 = (i4910 ^ 400512) + ((i4910 & 400512) << 1);
                                                                int i4912 = ~iIndexOf12;
                                                                int i4913 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ 2086) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 2086));
                                                                Object[] objArr99 = new Object[1];
                                                                a((((i4911 + (i4912 * (-191))) + (((iIndexOf12 & i4913) | (iIndexOf12 ^ i4913)) * 191)) - (~(((~(i4912 | 2086)) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | 2086))) * 191))) - 1, 13 - (~(-(-Process.getGidForName(str11)))), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr99);
                                                                str13 = (String) objArr99[0];
                                                                Object[] objArr910 = new Object[1];
                                                                a(2098 - (~(-KeyEvent.getDeadChar(0, 0))), 7 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr910);
                                                                bytes = ((String) objArr910[0]).getBytes();
                                                                length = bytes.length;
                                                                if (length == 0) {
                                                                    i44 = i28 ^ 150;
                                                                } else {
                                                                    bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str13));
                                                                    i48 = 4096;
                                                                    bArr5 = new byte[4096];
                                                                    i49 = 0;
                                                                    while (true) {
                                                                        i50 = bufferedInputStream5.read(bArr5, 0, i48);
                                                                        if (i50 > 0) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        int i5010 = b + 51;
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5010 % 128;
                                                                        int i5011 = i5010 % 2;
                                                                        DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        i51 = 0;
                                                                        while (i49 < length) {
                                                                            if (bArr5[i51] == bytes[i49]) {
                                                                                if (i49 != 0) {
                                                                                    i52 = (-2) - (i49 ^ (-1));
                                                                                    while (true) {
                                                                                        if (i52 > 0) {
                                                                                            i49 = 0;
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        i53 = 0;
                                                                                        while (true) {
                                                                                            if (i53 < i52) {
                                                                                                i49 = i52;
                                                                                                break;
                                                                                                break;
                                                                                            }
                                                                                            int i5012 = -i52;
                                                                                            i54 = (i49 & i5012) + (i5012 | i49);
                                                                                            if (bytes[i53] != bytes[((i54 | i53) << 1) - (i54 ^ i53)]) {
                                                                                                break;
                                                                                            }
                                                                                            i53 = ((i53 & 1) << 1) + (i53 ^ 1);
                                                                                        }
                                                                                        i52 = (-2) - (~i52);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i49 = (i49 | 1) + (i49 & 1);
                                                                            }
                                                                            i51 = ((i51 | 1) << 1) - (i51 ^ 1);
                                                                        }
                                                                        i48 = 4096;
                                                                    }
                                                                    if (i49 == length) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    bufferedInputStream5.close();
                                                                    if (z) {
                                                                        i44 = i28 ^ 150;
                                                                    } else {
                                                                        i44 = i28;
                                                                    }
                                                                }
                                                            } catch (Exception unused14) {
                                                                i44 = i28 ^ 151;
                                                            }
                                                            int i525 = -ExpandableListView.getPackedPositionGroup(0L);
                                                            Object[] objArr100 = new Object[1];
                                                            a((i525 ^ 370) + ((i525 & 370) << 1), 23 - Color.green(0), (char) (26642 - TextUtils.indexOf((CharSequence) str6, '0', 0, 0)), objArr100);
                                                            String str40 = (String) objArr100[0];
                                                            int i526 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int i527 = (i526 ^ 808) + ((i526 & 808) << 1);
                                                            int i528 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            Object[] objArr101 = new Object[1];
                                                            a(i527, (i528 ^ 9) + ((i528 & 9) << 1), (char) (Gravity.getAbsoluteGravity(0, 0) + 42075), objArr101);
                                                            String str41 = (String) objArr101[0];
                                                            Object[] objArr102 = new Object[1];
                                                            a(818 - TextUtils.indexOf(str6, str6), 6 - (~(-ExpandableListView.getPackedPositionGroup(0L))), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr102);
                                                            String str42 = (String) objArr102[0];
                                                            Object[] objArr103 = new Object[1];
                                                            a(824 - (~(-TextUtils.indexOf(str6, str6, 0))), 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.indexOf(str6, str6, 0), objArr103);
                                                            int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                                            int i529 = (edgeSlop & 833) + (edgeSlop | 833);
                                                            int i530 = -ExpandableListView.getPackedPositionChild(0L);
                                                            int i531 = (i530 ^ 16) + ((i530 & 16) << 1);
                                                            int i532 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                            Object[] objArr104 = new Object[1];
                                                            a(i529, i531, (char) ((i532 & 30075) + (i532 | 30075)), objArr104);
                                                            String str43 = (String) objArr104[0];
                                                            int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                                            int i533 = ((keyRepeatDelay | 850) << 1) - (keyRepeatDelay ^ 850);
                                                            int i534 = -(Process.myPid() >> 22);
                                                            int i535 = (i534 & 7) + (i534 | 7);
                                                            int i536 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i537 = ~(((-1731) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-1731) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                            int i538 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                            int i539 = (i538 & i536) | (i538 ^ i536);
                                                            int i540 = (((i536 * (-405)) + 704110) - (~(-(-((i537 | (~((i539 & 1730) | (i539 ^ 1730)))) * (-406)))))) - 1;
                                                            int i541 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                            int i542 = ((-1731) & i541) | ((-1731) ^ i541);
                                                            int i543 = (i540 - (~((~((i542 & i536) | (i542 ^ i536))) * (-406)))) - 1;
                                                            int i544 = ~i536;
                                                            int i545 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i544) | (i544 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                            int i546 = ~((i541 ^ 1730) | (i541 & 1730));
                                                            int i547 = ((i545 & i546) | (i545 ^ i546)) * 406;
                                                            Object[] objArr105 = new Object[1];
                                                            a(i533, i535, (char) ((i543 & i547) + (i547 | i543)), objArr105);
                                                            String str44 = (String) objArr105[0];
                                                            Object[] objArr106 = new Object[1];
                                                            a(856 - (~(-TextUtils.indexOf(str6, str6))), 6 - (~(-(-View.combineMeasuredStates(0, 0)))), (char) ((-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))) - 1), objArr106);
                                                            String str45 = (String) objArr106[0];
                                                            int i548 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                                            Object[] objArr107 = new Object[1];
                                                            a((i548 & 863) + (i548 | 863), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 31661), objArr107);
                                                            String str46 = (String) objArr107[0];
                                                            Object[] objArr108 = new Object[1];
                                                            a(875 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, (char) ((-2) - ((-MotionEvent.axisFromString(str6)) ^ (-1))), objArr108);
                                                            int i549 = 888 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                            int i550 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                            Object[] objArr109 = new Object[1];
                                                            a(i549, (i550 & 16) + (i550 | 16), (char) (Process.myPid() >> 22), objArr109);
                                                            String str47 = (String) objArr109[0];
                                                            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                            int i551 = (fadingEdgeLength ^ TypedValues.Custom.TYPE_DIMENSION) + ((fadingEdgeLength & TypedValues.Custom.TYPE_DIMENSION) << 1);
                                                            int iAlpha = Color.alpha(0);
                                                            Object[] objArr110 = new Object[1];
                                                            a(i551, (iAlpha ^ 3) + ((iAlpha & 3) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr110);
                                                            String str48 = (String) objArr110[0];
                                                            char mirror6 = AndroidCharacter.getMirror('0');
                                                            int i552 = ((mirror6 | 868) << 1) - (mirror6 ^ 868);
                                                            int i553 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                            Object[] objArr111 = new Object[1];
                                                            a(i552, (i553 & 22) + (i553 | 22), (char) View.MeasureSpec.getMode(0), objArr111);
                                                            String str49 = (String) objArr111[0];
                                                            int i554 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int iLastIndexOf2 = TextUtils.lastIndexOf(str6, '0', 0, 0);
                                                            int i555 = ((iLastIndexOf2 | 26) << 1) - (iLastIndexOf2 ^ 26);
                                                            int i556 = -Process.getGidForName(str6);
                                                            Object[] objArr112 = new Object[1];
                                                            a((i554 ^ 938) + ((i554 & 938) << 1), i555, (char) ((i556 ^ 6065) + ((i556 & 6065) << 1)), objArr112);
                                                            String str50 = (String) objArr112[0];
                                                            int scrollBarSize2 = 963 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                            int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                                                            int i557 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                                            Object[] objArr113 = new Object[1];
                                                            a(scrollBarSize2, windowTouchSlop3, (char) (((i557 | 27446) << 1) - (i557 ^ 27446)), objArr113);
                                                            j8 = j30;
                                                            int i558 = i6;
                                                            int i559 = 989 - (~(-TextUtils.lastIndexOf(str6, '0', 0, 0)));
                                                            int i560 = -View.getDefaultSize(0, 0);
                                                            int i561 = (i560 * (-947)) + 10439;
                                                            int i562 = ~i560;
                                                            int i563 = ~(((-12) ^ i77) | ((-12) & i77));
                                                            int i564 = ((i563 & i562) | (i562 ^ i563)) * (-948);
                                                            int i565 = (i561 & i564) + (i561 | i564);
                                                            int i566 = (i562 ^ (-12)) | (i562 & (-12));
                                                            int i567 = (i565 - (~((~((i558 & i566) | (i566 ^ i558))) * (-948)))) - 1;
                                                            int i568 = ((i560 ^ (-12)) | (i560 & (-12))) * 948;
                                                            int i569 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                            Object[] objArr114 = new Object[1];
                                                            a(i559, ((i567 | i568) << 1) - (i568 ^ i567), (char) (((i569 | 33983) << 1) - (i569 ^ 33983)), objArr114);
                                                            String str51 = (String) objArr114[0];
                                                            int i570 = 1003 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                            int i571 = 7 - (~(ViewConfiguration.getFadingEdgeLength() >> 16));
                                                            int iResolveSize3 = View.resolveSize(0, 0);
                                                            Object[] objArr115 = new Object[1];
                                                            a(i570, i571, (char) (((iResolveSize3 | 14996) << 1) - (iResolveSize3 ^ 14996)), objArr115);
                                                            String str52 = (String) objArr115[0];
                                                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + PointerIconCompat.TYPE_ALIAS;
                                                            int i572 = -TextUtils.getOffsetBefore(str6, 0);
                                                            Object[] objArr116 = new Object[1];
                                                            a(absoluteGravity2, ((i572 | 6) << 1) - (i572 ^ 6), (char) TextUtils.indexOf(str6, str6, 0), objArr116);
                                                            String str53 = (String) objArr116[0];
                                                            int i573 = 1015 - (~(ViewConfiguration.getTouchSlop() >> 8));
                                                            int iAxisFromString3 = MotionEvent.axisFromString(str6);
                                                            Object[] objArr117 = new Object[1];
                                                            a(i573, ((iAxisFromString3 | 7) << 1) - (iAxisFromString3 ^ 7), (char) KeyEvent.normalizeMetaState(0), objArr117);
                                                            int i574 = -ImageFormat.getBitsPerPixel(0);
                                                            int i575 = ((i574 | PointerIconCompat.TYPE_GRABBING) << 1) - (i574 ^ PointerIconCompat.TYPE_GRABBING);
                                                            int i576 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                            Object[] objArr118 = new Object[1];
                                                            a(i575, ((i576 | 16) << 1) - (i576 ^ 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 54008), objArr118);
                                                            String str54 = (String) objArr118[0];
                                                            Object[] objArr119 = new Object[1];
                                                            a(856 - (~(-(-TextUtils.getCapsMode(str6, 0, 0)))), 5 - (~(-TextUtils.lastIndexOf(str6, '0', 0, 0))), (char) Color.blue(0), objArr119);
                                                            String str55 = (String) objArr119[0];
                                                            char mirror7 = AndroidCharacter.getMirror('0');
                                                            Object[] objArr120 = new Object[1];
                                                            a((mirror7 ^ 777) + ((mirror7 & 777) << 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, (char) TextUtils.indexOf(str6, str6, 0), objArr120);
                                                            Object[] objArr121 = new Object[1];
                                                            a(1038 - ExpandableListView.getPackedPositionGroup(0L), 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (58813 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr121);
                                                            String str56 = (String) objArr121[0];
                                                            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1052;
                                                            int i577 = -View.getDefaultSize(0, 0);
                                                            Object[] objArr122 = new Object[1];
                                                            a(minimumFlingVelocity3, (i577 ^ 1) + ((i577 & 1) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr122);
                                                            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1053;
                                                            int i578 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                            Object[] objArr123 = new Object[1];
                                                            a(fadingEdgeLength2, (i578 ^ 9) + ((i578 & 9) << 1), (char) Color.blue(0), objArr123);
                                                            String str57 = (String) objArr123[0];
                                                            int i579 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            int i580 = (i579 & 1063) + (i579 | 1063);
                                                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 1;
                                                            int maxKeyCode3 = KeyEvent.getMaxKeyCode() >> 16;
                                                            Object[] objArr124 = new Object[1];
                                                            a(i580, packedPositionType2, (char) ((maxKeyCode3 & 49617) + (maxKeyCode3 | 49617)), objArr124);
                                                            int i581 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                                                            int i582 = (i581 ^ 1064) + ((i581 & 1064) << 1);
                                                            int i583 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                            int i584 = (i583 ^ 16) + ((i583 & 16) << 1);
                                                            int i585 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            Object[] objArr125 = new Object[1];
                                                            a(i582, i584, (char) ((i585 ^ 1) + ((i585 & 1) << 1)), objArr125);
                                                            int iLastIndexOf3 = TextUtils.lastIndexOf(str6, '0', 0);
                                                            int i586 = (iLastIndexOf3 & TypedValues.Custom.TYPE_REFERENCE) + (iLastIndexOf3 | TypedValues.Custom.TYPE_REFERENCE);
                                                            int i587 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            Object[] objArr126 = new Object[1];
                                                            a(i586, ((i587 | 3) << 1) - (i587 ^ 3), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr126);
                                                            int i588 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 850;
                                                            int iLastIndexOf4 = TextUtils.lastIndexOf(str6, '0') + 8;
                                                            int i589 = -Color.blue(0);
                                                            Object[] objArr127 = new Object[1];
                                                            a(i588, iLastIndexOf4, (char) ((i589 & 1730) + (i589 | 1730)), objArr127);
                                                            int i590 = 1077 - (~(-MotionEvent.axisFromString(str6)));
                                                            int i591 = 7 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                                                            int keyRepeatTimeout4 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                                            Object[] objArr128 = new Object[1];
                                                            a(i590, i591, (char) ((keyRepeatTimeout4 ^ 14478) + ((keyRepeatTimeout4 & 14478) << 1)), objArr128);
                                                            int i592 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                            int i593 = (i592 ^ 863) + ((i592 & 863) << 1);
                                                            int gidForName5 = 10 - Process.getGidForName(str6);
                                                            int i594 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            Object[] objArr129 = new Object[1];
                                                            a(i593, gidForName5, (char) (((i594 | 31661) << 1) - (i594 ^ 31661)), objArr129);
                                                            String str58 = (String) objArr129[0];
                                                            int i595 = b;
                                                            int i596 = (i595 ^ 17) + ((i595 & 17) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i596 % 128;
                                                            int i597 = i596 % 2;
                                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 875;
                                                            int i598 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            Object[] objArr130 = new Object[1];
                                                            a(iCombineMeasuredStates, ((i598 | 13) << 1) - (i598 ^ 13), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr130);
                                                            String[] strArr17 = {(String) objArr125[0], (String) objArr126[0], (String) objArr127[0], (String) objArr128[0], str58, (String) objArr130[0]};
                                                            int i599 = -(-TextUtils.getOffsetAfter(str6, 0));
                                                            int i600 = (i599 & 1087) + (i599 | 1087);
                                                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                            Object[] objArr131 = new Object[1];
                                                            a(i600, ((jumpTapTimeout | 20) << 1) - (jumpTapTimeout ^ 20), (char) ((-TextUtils.indexOf((CharSequence) str6, '0')) - 1), objArr131);
                                                            String str59 = (String) objArr131[0];
                                                            int i601 = 1108 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            int i602 = -(-ExpandableListView.getPackedPositionGroup(0L));
                                                            Object[] objArr132 = new Object[1];
                                                            a(i601, (i602 & 19) + (i602 | 19), (char) Drawable.resolveOpacity(0, 0), objArr132);
                                                            String str60 = (String) objArr132[0];
                                                            int i603 = 1125 - (~TextUtils.indexOf(str6, str6, 0, 0));
                                                            int iAxisFromString4 = MotionEvent.axisFromString(str6);
                                                            int i604 = (iAxisFromString4 ^ 32) + ((iAxisFromString4 & 32) << 1);
                                                            int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                            Object[] objArr133 = new Object[1];
                                                            a(i603, i604, (char) ((scrollDefaultDelay2 ^ 53949) + ((scrollDefaultDelay2 & 53949) << 1)), objArr133);
                                                            String str61 = (String) objArr133[0];
                                                            Object[] objArr134 = new Object[1];
                                                            a(1156 - (~(-(-TextUtils.getOffsetAfter(str6, 0)))), TextUtils.lastIndexOf(str6, '0') + 27, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45649), objArr134);
                                                            String str62 = (String) objArr134[0];
                                                            int threadPriority = Process.getThreadPriority(0);
                                                            int i605 = ((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6;
                                                            int i606 = ((i605 | 1183) << 1) - (i605 ^ 1183);
                                                            int i607 = -(Process.myTid() >> 22);
                                                            Object[] objArr135 = new Object[1];
                                                            a(i606, ((i607 | 23) << 1) - (i607 ^ 23), (char) View.combineMeasuredStates(0, 0), objArr135);
                                                            String str63 = (String) objArr135[0];
                                                            int i608 = 1204 - (~(-TextUtils.indexOf((CharSequence) str6, '0', 0)));
                                                            int i609 = -ExpandableListView.getPackedPositionType(0L);
                                                            Object[] objArr136 = new Object[1];
                                                            a(i608, (i609 ^ 33) + ((i609 & 33) << 1), (char) Drawable.resolveOpacity(0, 0), objArr136);
                                                            int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                            int i610 = ((longPressTimeout2 | 1239) << 1) - (longPressTimeout2 ^ 1239);
                                                            int i611 = 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                                            int i612 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                            Object[] objArr137 = new Object[1];
                                                            a(i610, i611, (char) ((i612 ^ (-1)) + (i612 << 1)), objArr137);
                                                            String str64 = (String) objArr137[0];
                                                            int iIndexOf13 = TextUtils.indexOf((CharSequence) str6, '0');
                                                            int i613 = (iIndexOf13 & 819) + (iIndexOf13 | 819);
                                                            int i614 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6;
                                                            int i615 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            Object[] objArr138 = new Object[1];
                                                            a(i613, i614, (char) ((i615 ^ 1) + ((i615 & 1) << 1)), objArr138);
                                                            int packedPositionChild3 = 1251 - ExpandableListView.getPackedPositionChild(0L);
                                                            int i616 = -Color.green(0);
                                                            int i617 = (i616 & 30) + (i616 | 30);
                                                            int iRed4 = Color.red(0);
                                                            Object[] objArr139 = new Object[1];
                                                            a(packedPositionChild3, i617, (char) ((iRed4 ^ 12531) + ((iRed4 & 12531) << 1)), objArr139);
                                                            String str65 = (String) objArr139[0];
                                                            int i618 = -TextUtils.indexOf(str6, str6);
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i619 = (i618 * (-445)) - 570490;
                                                            int i620 = ~i618;
                                                            int i621 = ~(i620 | (-1283));
                                                            int i622 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                            int i623 = ~((i622 & (-1283)) | ((-1283) ^ i622));
                                                            int i624 = -(-(((i621 & i623) | (i621 ^ i623)) * 446));
                                                            int i625 = (i619 ^ i624) + ((i619 & i624) << 1);
                                                            int i626 = ~((i620 ^ 1282) | (i620 & 1282));
                                                            int i627 = ((-1283) & i618) | ((-1283) ^ i618);
                                                            int i628 = -(-(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i627) | (i627 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) | i626) * 446));
                                                            int i629 = ~i618;
                                                            int i630 = (((i625 | i628) << 1) - (i628 ^ i625)) + ((~((i629 & (-1283)) | (i629 ^ (-1283)))) * 446);
                                                            int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                                                            int iRed5 = Color.red(0);
                                                            Object[] objArr140 = new Object[1];
                                                            a(i630, (edgeSlop2 ^ 11) + ((edgeSlop2 & 11) << 1), (char) ((iRed5 ^ 13433) + ((iRed5 & 13433) << 1)), objArr140);
                                                            int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                            Object[] objArr141 = new Object[1];
                                                            a((doubleTapTimeout ^ 1293) + ((doubleTapTimeout & 1293) << 1), ((iResolveSizeAndState | 19) << 1) - (iResolveSizeAndState ^ 19), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr141);
                                                            String str66 = (String) objArr141[0];
                                                            int i631 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                            int i632 = (i631 & 1312) + (i631 | 1312);
                                                            int i633 = -ExpandableListView.getPackedPositionChild(0L);
                                                            int i634 = ((i633 | 4) << 1) - (i633 ^ 4);
                                                            int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                                                            Object[] objArr142 = new Object[1];
                                                            a(i632, i634, (char) ((packedPositionChild4 ^ 20934) + ((packedPositionChild4 & 20934) << 1)), objArr142);
                                                            int i635 = -(-Color.rgb(0, 0, 0));
                                                            Object[] objArr143 = new Object[1];
                                                            a((i635 ^ 16778533) + ((i635 & 16778533) << 1), 18 - (~ExpandableListView.getPackedPositionGroup(0L)), (char) Color.argb(0, 0, 0, 0), objArr143);
                                                            Object[] objArr144 = new Object[1];
                                                            a(TextUtils.getCapsMode(str6, 0, 0) + 1336, 14 - (~(-TextUtils.indexOf((CharSequence) str6, '0', 0))), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr144);
                                                            int i636 = 1351 - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                                                            int i637 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                                            Object[] objArr145 = new Object[1];
                                                            a(i636, (i637 & 18) + (i637 | 18), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr145);
                                                            int windowTouchSlop4 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                            int i638 = (windowTouchSlop4 & 1371) + (windowTouchSlop4 | 1371);
                                                            int iLastIndexOf5 = 18 - TextUtils.lastIndexOf(str6, '0');
                                                            int mode2 = View.MeasureSpec.getMode(0);
                                                            Object[] objArr146 = new Object[1];
                                                            a(i638, iLastIndexOf5, (char) ((mode2 & 4698) + (mode2 | 4698)), objArr146);
                                                            int iMyTid4 = (Process.myTid() >> 22) + 1390;
                                                            int pressedStateDuration3 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                            int i639 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                            Object[] objArr147 = new Object[1];
                                                            a(iMyTid4, pressedStateDuration3, (char) ((i639 ^ 37773) + ((i639 & 37773) << 1)), objArr147);
                                                            int i640 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                            int i641 = -TextUtils.indexOf(str6, str6, 0, 0);
                                                            Object[] objArr148 = new Object[1];
                                                            a((i640 ^ 1413) + ((i640 & 1413) << 1), ((i641 | 21) << 1) - (i641 ^ 21), (char) (25078 - View.getDefaultSize(0, 0)), objArr148);
                                                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1434;
                                                            int i642 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            int i643 = (i642 ^ 24) + ((i642 & 24) << 1);
                                                            int i644 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                            Object[] objArr149 = new Object[1];
                                                            a(doubleTapTimeout2, i643, (char) ((i644 ^ 1) + ((i644 & 1) << 1)), objArr149);
                                                            String str67 = str4;
                                                            int i645 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                            int i646 = ((i645 | 1458) << 1) - (i645 ^ 1458);
                                                            int i647 = -(-TextUtils.indexOf((CharSequence) str6, '0', 0));
                                                            int i648 = ((i647 | 29) << 1) - (i647 ^ 29);
                                                            int i649 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                            Object[] objArr150 = new Object[1];
                                                            a(i646, i648, (char) ((i649 ^ (-1)) + (i649 << 1)), objArr150);
                                                            int i650 = 1485 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                                                            int i651 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            int i652 = i651 * (-167);
                                                            int i653 = (i652 ^ (-4509)) + ((i652 & (-4509)) << 1);
                                                            int i654 = ~i651;
                                                            int i655 = ~((i654 & (-28)) | (i654 ^ (-28)));
                                                            int i656 = ~(((-28) ^ i77) | ((-28) & i77));
                                                            int i657 = ((i655 & i656) | (i655 ^ i656)) * 336;
                                                            int i658 = ((i653 | i657) << 1) - (i657 ^ i653);
                                                            int i659 = ~(i651 | 27);
                                                            int i660 = ~((i651 ^ i77) | (i651 & i77));
                                                            int i661 = -(-(((i659 & i660) | (i659 ^ i660)) * (-168)));
                                                            int i662 = ((i658 | i661) << 1) - (i661 ^ i658);
                                                            int i663 = ~((i206 & i651) | (i206 ^ i651));
                                                            int i664 = (((-28) & i663) | ((-28) ^ i663)) * 168;
                                                            int i665 = (i662 & i664) + (i664 | i662);
                                                            int iIndexOf14 = TextUtils.indexOf((CharSequence) str6, '0');
                                                            Object[] objArr151 = new Object[1];
                                                            a(i650, i665, (char) (((iIndexOf14 | 62379) << 1) - (iIndexOf14 ^ 62379)), objArr151);
                                                            Object[] objArr152 = new Object[1];
                                                            a(1512 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, (char) TextUtils.indexOf(str6, str6), objArr152);
                                                            int mirror8 = 1592 - AndroidCharacter.getMirror('0');
                                                            int i666 = -(-TextUtils.indexOf((CharSequence) str6, '0'));
                                                            Object[] objArr153 = new Object[1];
                                                            a(mirror8, (i666 & 28) + (i666 | 28), (char) View.resolveSizeAndState(0, 0, 0), objArr153);
                                                            int i667 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                            int i668 = ((i667 | 1571) << 1) - (i667 ^ 1571);
                                                            int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 32;
                                                            int i669 = -(-TextUtils.indexOf((CharSequence) str6, '0'));
                                                            Object[] objArr154 = new Object[1];
                                                            a(i668, longPressTimeout3, (char) ((i669 & 1) + (i669 | 1)), objArr154);
                                                            c = 0;
                                                            strArr3 = new String[][]{new String[]{str40, str41, str42, (String) objArr103[0]}, new String[]{str43, str44, str45, str46, (String) objArr108[0]}, new String[]{str47, str48, str4, str49, str50, (String) objArr113[0]}, new String[]{str51, str52, str53, (String) objArr117[0]}, new String[]{str54, str55, (String) objArr120[0]}, new String[]{str56, (String) objArr122[0]}, new String[]{str57, (String) objArr124[0]}, strArr17, new String[]{str59, str60, str61, str62, str63, (String) objArr136[0], str4}, new String[]{str64, (String) objArr138[0]}, new String[]{str65, (String) objArr140[0]}, new String[]{str66, (String) objArr142[0]}, new String[]{(String) objArr143[0]}, new String[]{(String) objArr144[0]}, new String[]{(String) objArr145[0]}, new String[]{(String) objArr146[0]}, new String[]{(String) objArr147[0]}, new String[]{(String) objArr148[0]}, new String[]{(String) objArr149[0], str67}, new String[]{(String) objArr150[0], str67}, new String[]{(String) objArr151[0], str67}, new String[]{(String) objArr152[0], str67}, new String[]{(String) objArr153[0], str67}, new String[]{(String) objArr154[0], str67}};
                                                            int i670 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                            Object[] objArr155 = new Object[1];
                                                            a((i670 ^ 1603) + ((i670 & 1603) << 1), 1 - Color.blue(0), (char) (43362 - Process.getGidForName(str6)), objArr155);
                                                            sb = new StringBuilder((String) objArr155[0]);
                                                            i34 = i77;
                                                            i35 = 0;
                                                            int i671 = 0;
                                                            while (i35 < 24) {
                                                                String[] strArr18 = strArr3[i35];
                                                                Object[] objArr156 = {strArr18[c]};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                    char maxKeyCode4 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 33602);
                                                                    int iResolveOpacity2 = 3085 - Drawable.resolveOpacity(0, 0);
                                                                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 26;
                                                                    byte b48 = (byte) 0;
                                                                    byte b49 = (byte) (b48 - 1);
                                                                    Object[] objArr157 = new Object[1];
                                                                    c(b48, b49, (byte) (-b49), objArr157);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode4, iResolveOpacity2, iResolveOpacity3, 1411172903, false, (String) objArr157[0], new Class[]{String.class});
                                                                }
                                                                str7 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr156);
                                                                String[] strArr19 = (String[]) Arrays.copyOfRange(strArr18, 1, strArr18.length);
                                                                if (str7 != null) {
                                                                    i33 = i33;
                                                                    sb2 = sb;
                                                                    i34 = i34;
                                                                } else {
                                                                    i33 = i33;
                                                                    sb2 = sb;
                                                                    i34 = i34;
                                                                }
                                                                i35 = (i35 ^ 1) + ((i35 & 1) << 1);
                                                                i33 = i33;
                                                                sb = sb2;
                                                                strArr3 = strArr3;
                                                                c = 0;
                                                            }
                                                            int i672 = i33;
                                                            StringBuilder sb4 = sb;
                                                            int i673 = i34;
                                                            int scrollBarFadeDuration3 = 1607 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                            int i674 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            Object[] objArr158 = new Object[1];
                                                            a(scrollBarFadeDuration3, (i674 & 1) + (i674 | 1), (char) Color.blue(0), objArr158);
                                                            sb4.append((String) objArr158[0]);
                                                            int i675 = b;
                                                            i36 = (i675 ^ 35) + ((i675 & 35) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i36 % 128;
                                                            if (i36 % 2 != 0) {
                                                                c2 = 0;
                                                                objArr = new Object[]{new int[]{i77}, new String[0]};
                                                            } else {
                                                                c2 = 0;
                                                                objArr = new Object[]{new int[]{i77}, new String[0]};
                                                            }
                                                            int i676 = i77 ^ i672;
                                                            int i677 = -i676;
                                                            int i678 = ((i676 & i677) | (i676 ^ i677)) >> 31;
                                                            int i679 = ((int[]) objArr[c2])[c2] & (~i678);
                                                            int i680 = i672 & i678;
                                                            int i681 = (i679 & i680) | (i679 ^ i680);
                                                            String[] strArr20 = (String[]) objArr[1];
                                                            int i682 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                                                            b = i682 % 128;
                                                            int i683 = i682 % 2;
                                                            strArr4 = strArr20;
                                                            i33 = i681;
                                                            int i4410 = -(-KeyEvent.normalizeMetaState(0));
                                                            int i4411 = (i4410 & 889) + (i4410 | 889);
                                                            int i4510 = -(-TextUtils.lastIndexOf(str6, '0'));
                                                            Object[] objArr710 = new Object[1];
                                                            a(i4411, ((i4510 | 17) << 1) - (i4510 ^ 17), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr710);
                                                            Object[] objArr711 = {(String) objArr710[0]};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                                char cIndexOf2 = (char) (33602 - TextUtils.indexOf(str6, str6, 0));
                                                                int keyRepeatTimeout5 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                                                                int i4511 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                                                                byte b410 = (byte) 0;
                                                                byte b411 = (byte) (b410 - 1);
                                                                Object[] objArr712 = new Object[1];
                                                                c(b410, b411, (byte) (-b411), objArr712);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, keyRepeatTimeout5, i4511, 1411172903, false, (String) objArr712[0], new Class[]{String.class});
                                                            }
                                                            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr711);
                                                            if (objInvoke2 == null) {
                                                                i38 = 0;
                                                            } else {
                                                                Object[] objArr713 = {objInvoke2, 42};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                                    char c14 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                    int iMyPid2 = (Process.myPid() >> 22) + 3393;
                                                                    int scrollBarSize3 = 9 - (ViewConfiguration.getScrollBarSize() >> 8);
                                                                    byte b412 = (byte) 0;
                                                                    byte b413 = (byte) (b412 - 1);
                                                                    Object[] objArr714 = new Object[1];
                                                                    c(b412, b413, (byte) (-b413), objArr714);
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c14, iMyPid2, scrollBarSize3, 1203525406, false, (String) objArr714[0], new Class[]{String.class, Integer.TYPE});
                                                                }
                                                                long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr713)).longValue();
                                                                long j810 = 1451827883;
                                                                long jFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
                                                                long j811 = jLongValue16 ^ j8;
                                                                long j812 = 676;
                                                                long j813 = jFreeMemory4 ^ j8;
                                                                long j814 = (((long) 677) * j810) + (((long) (-675)) * jLongValue16) + (((long) (-676)) * (j810 | jFreeMemory4 | j811)) + ((((j811 | j810) ^ j8) | ((j813 | j810) ^ j8)) * j812) + (j812 * ((((j810 ^ j8) | j811) ^ j8) | ((j811 | j813) ^ j8) | (((jLongValue16 | j810) | jFreeMemory4) ^ j8))) + ((long) (-1453897760));
                                                                int i4512 = ((int) (j814 >> 32)) & ((-827560772) + ((~((-631252227) | i77)) * 623) + ((i206 | 262160) * (-623)) + (((~((-1034108239) | i77)) | 631252226 | (~(403118172 | i77))) * 623));
                                                                int i4513 = ~(i206 | 2100271662);
                                                                int i4514 = ((int) j814) & ((((1342802440 | i4513) * (-374)) - 1565934975) + ((i4513 | 757469222) * 374));
                                                                i38 = (i4512 & i4514) | (i4512 ^ i4514);
                                                            }
                                                            if (i38 != 1986687685) {
                                                                i28 = i77;
                                                                strArr5 = strArr4;
                                                                i39 = i33;
                                                            } else {
                                                                i28 = i77;
                                                                strArr5 = strArr4;
                                                                i39 = i33;
                                                            }
                                                            int i4515 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            Object[] objArr810 = new Object[1];
                                                            a(((i4515 | 1950) << 1) - (i4515 ^ 1950), '=' - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(0, 0), objArr810);
                                                            int offsetAfter2 = TextUtils.getOffsetAfter(str6, 0);
                                                            int i4516 = (offsetAfter2 & 1963) + (offsetAfter2 | 1963);
                                                            int i4517 = -(Process.myTid() >> 22);
                                                            int i4518 = (i4517 & 5) + (i4517 | 5);
                                                            int i4519 = b + 109;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4519 % 128;
                                                            int i4610 = i4519 % 2;
                                                            Object[] objArr811 = new Object[1];
                                                            a(i4516, i4518, (char) (54525 - (~Color.argb(0, 0, 0, 0))), objArr811);
                                                            String[] strArr110 = {(String) objArr810[0], (String) objArr811[0]};
                                                            int maxKeyCode5 = KeyEvent.getMaxKeyCode() >> 16;
                                                            Object[] objArr812 = new Object[1];
                                                            a((maxKeyCode5 & 1968) + (maxKeyCode5 | 1968), TextUtils.lastIndexOf(str6, '0', 0) + 16, (char) (Process.myTid() >> 22), objArr812);
                                                            String str310 = (String) objArr812[0];
                                                            int i4611 = 1982 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                                                            int i4612 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            Object[] objArr813 = new Object[1];
                                                            a(i4611, (i4612 ^ 19) + ((i4612 & 19) << 1), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr813);
                                                            String str311 = (String) objArr813[0];
                                                            int i4613 = 2001 - (~View.getDefaultSize(0, 0));
                                                            int i4614 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                                                            int i4615 = ((i4614 | 14) << 1) - (i4614 ^ 14);
                                                            int i4616 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                            Object[] objArr814 = new Object[1];
                                                            a(i4613, i4615, (char) (((i4616 | 20937) << 1) - (i4616 ^ 20937)), objArr814);
                                                            int i4617 = -(-Drawable.resolveOpacity(0, 0));
                                                            Object[] objArr815 = new Object[1];
                                                            a(((i4617 | 2016) << 1) - (i4617 ^ 2016), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, (char) (Process.myPid() >> 22), objArr815);
                                                            String str312 = (String) objArr815[0];
                                                            int iIndexOf15 = 2037 - TextUtils.indexOf(str6, str6, 0);
                                                            int iRed6 = 10 - Color.red(0);
                                                            int i4618 = -KeyEvent.normalizeMetaState(0);
                                                            Object[] objArr816 = new Object[1];
                                                            a(iIndexOf15, iRed6, (char) ((i4618 & 42564) + (i4618 | 42564)), objArr816);
                                                            int i4619 = 2047 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                            int iResolveSize4 = View.resolveSize(0, 0);
                                                            int i4710 = (iResolveSize4 * 450) - 4928;
                                                            int i4711 = ~iResolveSize4;
                                                            int i4712 = -(-(((~((i4711 & 11) | (i4711 ^ 11))) | (~(((-12) ^ iResolveSize4) | ((-12) & iResolveSize4) | i28))) * 449));
                                                            int i4713 = (i4710 ^ i4712) + ((i4710 & i4712) << 1);
                                                            int i4714 = ~iResolveSize4;
                                                            int i4715 = (i4713 - (~(-(-((~(i4714 | 11)) * (-1347)))))) - 1;
                                                            int i4716 = ~((i4714 & 11) | (i4714 ^ 11));
                                                            int i4717 = ~(iResolveSize4 | ((-12) ^ i206) | ((-12) & i206));
                                                            int i4718 = -(-(((i4716 & i4717) | (i4716 ^ i4717)) * 449));
                                                            int i4719 = (i4715 & i4718) + (i4718 | i4715);
                                                            int i4810 = -(-View.combineMeasuredStates(0, 0));
                                                            Object[] objArr817 = new Object[1];
                                                            a(i4619, i4719, (char) ((i4810 ^ 32340) + ((i4810 & 32340) << 1)), objArr817);
                                                            String str313 = (String) objArr817[0];
                                                            int bitsPerPixel5 = 586 - ImageFormat.getBitsPerPixel(0);
                                                            int iIndexOf16 = TextUtils.indexOf(str6, str6, 0);
                                                            int i4811 = ((iIndexOf16 | 6) << 1) - (iIndexOf16 ^ 6);
                                                            int i4812 = -View.resolveSizeAndState(0, 0, 0);
                                                            Object[] objArr818 = new Object[1];
                                                            a(bitsPerPixel5, i4811, (char) ((i4812 ^ 39532) + ((i4812 & 39532) << 1)), objArr818);
                                                            int touchSlop3 = 2058 - (ViewConfiguration.getTouchSlop() >> 8);
                                                            int longPressTimeout4 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                                            int i4813 = -Gravity.getAbsoluteGravity(0, 0);
                                                            Object[] objArr819 = new Object[1];
                                                            a(touchSlop3, longPressTimeout4, (char) (((i4813 | 3641) << 1) - (i4813 ^ 3641)), objArr819);
                                                            String str314 = (String) objArr819[0];
                                                            int i4814 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                            int i4815 = (i4814 & 2037) + (i4814 | 2037);
                                                            int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                                            int i4816 = ((maximumDrawingCacheSize2 | 10) << 1) - (maximumDrawingCacheSize2 ^ 10);
                                                            c3 = 0;
                                                            Object[] objArr911 = new Object[1];
                                                            a(i4815, i4816, (char) (42564 - (~TextUtils.indexOf((CharSequence) str6, '0', 0))), objArr911);
                                                            strArr6 = new String[][]{strArr110, new String[]{str310, str311, (String) objArr814[0]}, new String[]{str312, (String) objArr816[0]}, new String[]{str313, (String) objArr818[0]}, new String[]{str314, (String) objArr911[0]}};
                                                            i40 = 0;
                                                            i41 = 5;
                                                            i42 = -1;
                                                            loop7: while (true) {
                                                                if (i40 < i41) {
                                                                    str10 = str6;
                                                                    i43 = i28;
                                                                    break;
                                                                }
                                                                String[] strArr111 = strArr6[i40];
                                                                str14 = strArr111[c3];
                                                                i55 = 1;
                                                                strArr7 = (String[]) Arrays.copyOfRange(strArr111, 1, strArr111.length);
                                                                length2 = strArr7.length;
                                                                i56 = 0;
                                                                while (i56 < length2) {
                                                                    int i4817 = (i42 ^ 114) + ((i42 & 114) << i55);
                                                                    i42 = (i4817 & (-113)) + (i4817 | (-113));
                                                                    Object[] objArr912 = {str14, strArr7[i56]};
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                                        char c15 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                        int mirror9 = 2433 - AndroidCharacter.getMirror('0');
                                                                        int pressedStateDuration4 = 32 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                        byte b414 = (byte) 0;
                                                                        byte b415 = (byte) (b414 - 1);
                                                                        Object[] objArr913 = new Object[1];
                                                                        c(b414, b415, (byte) (-b415), objArr913);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c15, mirror9, pressedStateDuration4, -1207062455, false, (String) objArr913[0], new Class[]{String.class, String.class});
                                                                    }
                                                                    long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr912)).longValue();
                                                                    long j815 = 1937243375;
                                                                    str15 = str14;
                                                                    long j98 = 623;
                                                                    long j99 = jLongValue17 ^ j8;
                                                                    long j910 = j99 | j815;
                                                                    str10 = str6;
                                                                    j9 = (((long) 624) * j815) + (((long) (-622)) * jLongValue17) + (((j910 | j) ^ j8) * j98) + (((long) (-623)) * (j34 | (((j815 ^ j8) | jLongValue17) ^ j8))) + (j98 * ((j910 ^ j8) | ((j99 | j) ^ j8) | ((j815 | j) ^ j8))) + ((long) 39799953);
                                                                    int i4818 = ~Process.myPid();
                                                                    i57 = ((int) (j9 >> 32)) & ((((-1453537304) + (((~(175994551 | i4818)) | (-1613220963)) * (-933))) + (((~(i4818 | (-1613220963))) | 2442274) * 933)) - 1284482807);
                                                                    iNextInt = new Random().nextInt(1982938085);
                                                                    if (((((int) j9) & ((-420073766) + (((~(997543263 | (~iNextInt))) | 439683146) * (-591)) + ((iNextInt | 997543263) * 591))) | i57) != 0) {
                                                                        DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        i43 = ((i42 & 170) + (i42 | 170)) ^ i28;
                                                                        break loop7;
                                                                    }
                                                                    int i4819 = ((i56 | (-110)) << 1) - (i56 ^ (-110));
                                                                    i56 = (i4819 & 111) + (i4819 | 111);
                                                                    strArr7 = strArr7;
                                                                    str14 = str15;
                                                                    strArr6 = strArr6;
                                                                    length2 = length2;
                                                                    str6 = str10;
                                                                    i55 = 1;
                                                                }
                                                                i40 = (i40 & 1) + (i40 | 1);
                                                                strArr6 = strArr6;
                                                                c3 = 0;
                                                                i41 = 5;
                                                            }
                                                            int i4914 = i28 ^ i39;
                                                            int i4915 = -i4914;
                                                            int i4916 = ((i4914 & i4915) | (i4914 ^ i4915)) >> 31;
                                                            int i4917 = i43 & (~i4916);
                                                            int i4918 = i39 & i4916;
                                                            int i4919 = (i4917 ^ i4918) | (i4918 & i4917);
                                                            str11 = str10;
                                                            int i5013 = i28 ^ i4919;
                                                            int i5014 = -i5013;
                                                            int i5015 = ((i5013 & i5014) | (i5013 ^ i5014)) >> 31;
                                                            int i5016 = i44 & (~i5015);
                                                            int i5017 = i4919 & i5015;
                                                            int i5018 = (i5016 & i5017) | (i5016 ^ i5017);
                                                            int i5019 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            int i5110 = ((i5019 | 123) << 1) - (i5019 ^ 123);
                                                            b = i5110 % 128;
                                                            int i5111 = i5110 % 2;
                                                            bitsPerPixel = 2106 - ImageFormat.getBitsPerPixel(0);
                                                            int i5112 = -View.MeasureSpec.getSize(0);
                                                            i45 = ((i5112 | 47) << 1) - (i5112 ^ 47);
                                                            int i5113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            i46 = (i5113 & 83) + (i5113 | 83);
                                                            b = i46 % 128;
                                                            if (i46 % 2 == 0) {
                                                                Object[] objArr914 = new Object[1];
                                                                a(bitsPerPixel, i45, (char) (46557 / TextUtils.indexOf((CharSequence) str11, (char) 26)), objArr914);
                                                                str12 = (String) objArr914[0];
                                                                i47 = 0;
                                                            } else {
                                                                int i5114 = -TextUtils.indexOf((CharSequence) str11, '0');
                                                                char c16 = (char) ((i5114 ^ 46557) + ((46557 & i5114) << 1));
                                                                Object[] objArr915 = new Object[1];
                                                                a(bitsPerPixel, i45, c16, objArr915);
                                                                i47 = 0;
                                                                str12 = (String) objArr915[0];
                                                            }
                                                            Object[] objArr916 = {str12};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                                char deadChar2 = (char) KeyEvent.getDeadChar(i47, i47);
                                                                int iIndexOf17 = TextUtils.indexOf(str11, str11) + 993;
                                                                int i5115 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7;
                                                                byte b416 = (byte) 0;
                                                                byte b417 = (byte) (b416 - 1);
                                                                Object[] objArr917 = new Object[1];
                                                                c(b416, b417, (byte) (b417 + 1), objArr917);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar2, iIndexOf17, i5115, 349342683, false, (String) objArr917[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr916)).longValue();
                                                            long j911 = -710532123;
                                                            long j912 = -712;
                                                            long j913 = jLongValue18 ^ j8;
                                                            long j914 = (j34 | j911) ^ j8;
                                                            long j915 = (((long) (-711)) * j911) + (((long) 713) * jLongValue18) + ((((j913 | j911) ^ j8) | j914) * j912) + (j912 * ((((j913 | j34) | j911) ^ j8) | (((jLongValue18 | j911) | j) ^ j8))) + (((long) 712) * (j913 | j914)) + ((long) (-136546482));
                                                            int i5116 = ((int) (j915 >> 32)) & (112162949 + (((~(1045118418 | i206)) | (-1812622467)) * (-602)) + (((~(1045118418 | i28)) | (-2118876627) | (~(i206 | (-738864259)))) * (-301)) + ((~(i206 | (-1812622467))) * 301));
                                                            int i5117 = ((int) j915) & ((-1648223513) + ((1233496469 | i28) * 614) + (((~(1309867659 | i206)) | 25493780 | (~(i206 | (-127358751)))) * (-1228)) + (((~(1335361439 | i206)) | (~(i206 | (-101864971)))) * 614));
                                                            int i5118 = ((i5116 & i5117) | (i5116 ^ i5117)) * 263;
                                                            int i5119 = (i5118 & i206) | ((~i5118) & i28);
                                                            int i5210 = (~(i28 & i5018)) & (i28 | i5018);
                                                            int i5211 = -i5210;
                                                            int i5212 = ((i5210 & i5211) | (i5210 ^ i5211)) >> 31;
                                                            int i5213 = i5119 & (~i5212);
                                                            int i5214 = i5018 & i5212;
                                                            i23 = (i5214 & i5213) | (i5213 ^ i5214);
                                                            strArr2 = strArr5;
                                                            i29 = 5;
                                                        } else {
                                                            i28 = i77;
                                                            i29 = 5;
                                                            strArr2 = null;
                                                        }
                                                        Object[] objArr159 = new Object[i29];
                                                        objArr159[0] = new int[1];
                                                        objArr159[1] = new int[]{i23};
                                                        objArr159[3] = new int[]{i28};
                                                        int i684 = (~(i28 & i23)) & (i28 | i23);
                                                        int i685 = -i684;
                                                        int i686 = (((i684 & i685) | (i684 ^ i685)) >> 31) & 16;
                                                        int i687 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
                                                        b = i687 % 128;
                                                        int i688 = i687 % 2;
                                                        objArr159[4] = strArr2;
                                                        objArr159[2] = null;
                                                        int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                                                        int i689 = ~((-37781789) | iFreeMemory3);
                                                        int i690 = ~iFreeMemory3;
                                                        int i691 = 1708380563 + ((i689 | (~((-1077152801) | i690))) * 920) + (((~((-659145056) | i690)) | 37781788) * 920) + (((~(iFreeMemory3 | (-1077152801))) | (~((-37781789) | i690)) | (~((-621363268) | iFreeMemory3))) * 920);
                                                        int i692 = -(-i686);
                                                        int i693 = i3 + (i691 ^ i692) + ((i692 & i691) << 1);
                                                        int i694 = i693 << 13;
                                                        int i695 = (i693 | i694) & (~(i693 & i694));
                                                        int i696 = i695 >>> 17;
                                                        int i697 = ((~i695) & i696) | ((~i696) & i695);
                                                        int i698 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i699 = ((i698 | 91) << 1) - (i698 ^ 91);
                                                        b = i699 % 128;
                                                        int i700 = i699 % 2;
                                                        ((int[]) objArr159[0])[0] = i697 ^ (i697 << 5);
                                                        return objArr159;
                                                    }
                                                }
                                                i369--;
                                                bArr7 = bArr4;
                                                i364 = i18;
                                                j57 = j2;
                                                i363 = i363;
                                            }
                                            i363 = i369;
                                            bArr7 = bArr3;
                                            i364 = i17;
                                            j57 = j3;
                                        }
                                        i365 = (i365 ^ 1) + ((i365 & 1) << 1);
                                        bArr7 = bArr7;
                                        i364 = i364;
                                        j57 = j57;
                                        i363 = i363;
                                    }
                                    bArr7 = bArr7;
                                    j57 = j57;
                                    i363 = i363;
                                    i362 = 4096;
                                }
                                j2 = j57;
                                boolean z2 = i363 == length4;
                                try {
                                    bufferedInputStream4.close();
                                } catch (IOException unused15) {
                                }
                                if (!z2) {
                                    i16 = i77;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                bufferedInputStream3 = bufferedInputStream4;
                                if (bufferedInputStream3 != null) {
                                    try {
                                        bufferedInputStream3.close();
                                    } catch (IOException unused16) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused17) {
                            j2 = j57;
                        }
                    } catch (IOException unused18) {
                        j2 = j57;
                        bufferedInputStream4 = null;
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedInputStream3 = null;
                    }
                }
                i16 = i77 ^ 261;
            }
            int i3910 = ((~i321) & i77) | (i321 & i206);
            int i3911 = (i3910 | (-i3910)) >> 31;
            i20 = (i321 & i3911) | (i16 & (~i3911));
            if ((i2 & 8) == 0) {
                strArr8 = new String[3];
                i67 = -TextUtils.getOffsetAfter(str6, 0);
                iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i4010 = i67 * (-947);
                int i4011 = (i4010 ^ 583635) + ((i4010 & 583635) << 1);
                int i4012 = ((~i67) | (~(((-616) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-616) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))) * (-948);
                i68 = (i4011 ^ i4012) + ((i4012 & i4011) << 1);
                i69 = ~i67;
                i70 = b + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i70 % 128;
                if (i70 % 2 != 0) {
                    int i4013 = (i69 & (-616)) | (i69 ^ (-616));
                    int i4014 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i71 = i68 << ((~((i4014 & i4013) | (i4013 ^ i4014))) - 948);
                    i72 = 948 / ((i67 & (-616)) | (i67 ^ (-616)));
                } else {
                    int i4015 = (i69 & (-616)) | (i69 ^ (-616));
                    int i4016 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i4017 = (~((i4016 & i4015) | (i4015 ^ i4016))) * (-948);
                    i71 = ((i68 | i4017) << 1) - (i4017 ^ i68);
                    i72 = ((i67 & (-616)) | (i67 ^ (-616))) * 948;
                }
                int i4018 = i71 + i72;
                char mirror10 = AndroidCharacter.getMirror('0');
                Object[] objArr510 = new Object[1];
                a(i4018, (mirror10 ^ (-5)) + ((mirror10 & (-5)) << 1), (char) ExpandableListView.getPackedPositionType(0L), objArr510);
                strArr8[0] = (String) objArr510[0];
                Object[] objArr511 = new Object[1];
                a((ViewConfiguration.getPressedStateDuration() >> 16) + 658, 41 - Drawable.resolveOpacity(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr511);
                strArr8[1] = (String) objArr511[0];
                int i4019 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i4110 = ((i4019 | 699) << 1) - (i4019 ^ 699);
                int i4111 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr610 = new Object[1];
                a(i4110, ((i4111 | 38) << 1) - (i4111 ^ 38), (char) (15463 - (KeyEvent.getMaxKeyCode() >> 16)), objArr610);
                strArr8[2] = (String) objArr610[0];
                i73 = 0;
                while (true) {
                    if (i73 < 3) {
                        i74 = i77;
                        break;
                    }
                    Object[] objArr611 = {strArr8[i73]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str6, '0', 0, 0) + 1);
                        int mode3 = View.MeasureSpec.getMode(0) + 993;
                        int iRed7 = 8 - Color.red(0);
                        byte b210 = (byte) 0;
                        byte b211 = (byte) (b210 - 1);
                        Object[] objArr612 = new Object[1];
                        c(b210, b211, (byte) (b211 + 1), objArr612);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cLastIndexOf2, mode3, iRed7, 349342683, false, (String) objArr612[0], new Class[]{String.class});
                    }
                    long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr611)).longValue();
                    long j510 = 409131659;
                    long j610 = (((long) 491) * j510) + (((long) (-489)) * jLongValue19);
                    long j611 = j510 ^ j30;
                    long j612 = jLongValue19 ^ j30;
                    long j613 = 490;
                    long j614 = j610 + (((long) (-490)) * (j611 | j612 | j34)) + ((((j612 | j) ^ j30) | ((j510 | j612) ^ j30)) * j613) + (j613 * j611) + ((long) (-1256210264));
                    int i4112 = ~((-802407470) | i206);
                    i75 = ((int) (j614 >> 32)) & (((266576 | i4112 | (~(802407469 | i77))) * (-338)) + 1527329098 + ((i4112 | (~(802674045 | i77))) * 338));
                    int i4113 = ~((int) Process.getStartElapsedRealtime());
                    i76 = ((int) j614) & ((((-1754753727) + (((~((-1477741073) | i4113)) | 40514662) * (-828))) + ((i4113 | (-1477741073)) * (-828))) - 496071744);
                    if (((i75 & i76) | (i75 ^ i76)) != 0) {
                        int i4114 = (i73 ^ 280) + ((i73 & 280) << 1);
                        i74 = (~(i77 & i4114)) & (i4114 | i77);
                        break;
                    }
                    i73++;
                }
                int i4115 = i77 ^ i20;
                int i4116 = (i4115 | (-i4115)) >> 31;
                i20 = (i20 & i4116) | (i74 & (~i4116));
            }
            int i4117 = -MotionEvent.axisFromString(str6);
            int i4118 = -(-View.resolveSizeAndState(0, 0, 0));
            int i4119 = ((i4118 | 41) << 1) - (i4118 ^ 41);
            int i4210 = -Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr613 = new Object[1];
            a((i4117 & 736) + (i4117 | 736), i4119, (char) (((i4210 | 52690) << 1) - (i4210 ^ 52690)), objArr613);
            String str315 = (String) objArr613[0];
            int i4211 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i4212 = (i4211 & 778) + (i4211 | 778);
            int i4213 = -KeyEvent.getDeadChar(0, 0);
            int i4214 = (i4213 ^ 30) + ((i4213 & 30) << 1);
            int i4215 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            Object[] objArr614 = new Object[1];
            a(i4212, i4214, (char) ((i4215 ^ 37855) + ((i4215 & 37855) << 1)), objArr614);
            strArr = new String[]{str315, (String) objArr614[0]};
            i21 = 0;
            while (true) {
                if (i21 < 2) {
                    i22 = i77;
                    break;
                }
                Object[] objArr615 = {strArr[i21]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c17 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                    int iResolveSize5 = View.resolveSize(0, 0) + 993;
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8;
                    byte b310 = (byte) 0;
                    byte b311 = (byte) (b310 - 1);
                    Object[] objArr616 = new Object[1];
                    c(b310, b311, (byte) (-b311), objArr616);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c17, iResolveSize5, scrollDefaultDelay3, 410748506, false, (String) objArr616[0], new Class[]{String.class});
                }
                long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr615)).longValue();
                long j615 = 1616225122;
                long j616 = jLongValue20 ^ j30;
                long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                long j617 = (((long) 319) * j615) + (((long) (-317)) * jLongValue20) + (((long) (-318)) * (j616 | (((j615 ^ j30) | startElapsedRealtime2) ^ j30)));
                long j618 = TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                long j619 = startElapsedRealtime2 ^ j30;
                long j710 = j617 + ((((j616 | startElapsedRealtime2) ^ j30) | (((j619 | j615) | jLongValue20) ^ j30)) * j618) + (j618 * ((((j616 | j619) | j615) ^ j30) | ((startElapsedRealtime2 | (jLongValue20 | j615)) ^ j30))) + ((long) (-1817143359));
                int iNextInt5 = new Random().nextInt(682780470);
                i65 = ((int) (j710 >> 32)) & ((-2042405954) + (((~((-3475116) | (~iNextInt5))) | (-1433751296)) * (-591)) + ((iNextInt5 | (-3475116)) * 591));
                int iNextInt6 = new Random().nextInt();
                i66 = ((int) j710) & (397513505 + (((~(1777049171 | iNextInt6)) | 1080691714) * (-756)) + (((~iNextInt6) | 1777049171) * 756));
                if (((i65 & i66) | (i65 ^ i66)) != 0) {
                    int i4216 = i21 + 288;
                    i22 = ((~i4216) & i77) | (i4216 & i206);
                    int i4217 = b;
                    int i4218 = (i4217 & 85) + (i4217 | 85);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4218 % 128;
                    int i4219 = i4218 % 2;
                    break;
                }
                i21 = ((i21 & 1) << 1) + (i21 ^ 1);
            }
            int i4310 = ((~i20) & i77) | (i20 & i206);
            int i4311 = -i4310;
            int i4312 = ((i4310 & i4311) | (i4310 ^ i4311)) >> 31;
            int i4313 = i22 & (~i4312);
            int i4314 = i20 & i4312;
            i23 = (i4314 & i4313) | (i4313 ^ i4314);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatTimeout6 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 3526;
                int i4315 = 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                byte b312 = (byte) 0;
                byte b313 = (byte) (b312 - 1);
                Object[] objArr617 = new Object[1];
                c(b312, b313, (byte) (-b313), objArr617);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout6, iNormalizeMetaState2, i4315, 980946500, false, (String) objArr617[0], new Class[0]);
            }
            long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j711 = 1210889704;
            j4 = 495;
            j5 = -493;
            long j712 = (j4 * j711) + (j5 * jLongValue110);
            long j713 = jLongValue110 ^ j30;
            j6 = 494;
            long j714 = j711 ^ j30;
            long jFreeMemory5 = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j30;
            j7 = j712 + ((j711 | j713) * j2) + ((jLongValue110 | j714 | jFreeMemory5) * j6) + ((((jLongValue110 | j711) ^ j30) | ((j714 | j713) ^ j30) | ((jFreeMemory5 | jLongValue110) ^ j30)) * j6) + ((long) (-1391212342));
            i24 = ((int) (j7 >> 32)) & (797435786 + (((-25692417) | i206) * 184) + (((~(772879974 | i206)) | (-159918371)) * 184));
            i25 = (int) Runtime.getRuntime().totalMemory();
            i26 = (-71695567) + ((i25 | (-2145312380)) * 988);
            i27 = ~i25;
            if ((i24 | (((int) j7) & (i26 + (((~((-1808309796) | i27)) | 34080801) * (-1976)) + (((~(i25 | (-371083386))) | (-2145312380) | (~(371083385 | i27))) * 988)))) != 1) {
                Object[] objArr618 = {1};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int windowTouchSlop5 = 2673 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i4316 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15;
                    byte b314 = (byte) 0;
                    byte b315 = (byte) (b314 - 1);
                    Object[] objArr619 = new Object[1];
                    c(b314, b315, (byte) (-b315), objArr619);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec2, windowTouchSlop5, i4316, -1409439630, false, (String) objArr619[0], new Class[]{Integer.TYPE});
                }
                long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr618)).longValue();
                long j715 = 69815762;
                long j716 = 521;
                long j717 = j715 ^ j30;
                long j718 = ((jLongValue111 ^ j30) | j715) ^ j30;
                long j719 = (((long) (-520)) * j715) + (((long) 522) * jLongValue111) + ((((j717 | jLongValue111) | j) ^ j30) * j716) + (((long) (-1042)) * j718) + (j716 * (((jLongValue111 | (j717 | j34)) ^ j30) | j718)) + ((long) 1797882918);
                i30 = ((int) (j719 >> 32)) & (632284092 + (((~(337910500 | i77)) | (-1099315911)) * (-465)) + ((337910500 | (~((-1099315911) | i77))) * 930) + (((-1099046915) | i77) * 465));
                int iFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
                int i4317 = (~(61811623 | iFreeMemory4)) | (-1409231784);
                int i4318 = ~((~iFreeMemory4) | (-27994627));
                i31 = ((int) j719) & (1943765989 + ((i4317 | i4318) * (-470)) + (((~(iFreeMemory4 | (-1347420161))) | i4318) * 470));
                if (((i30 & i31) | (i30 ^ i31)) != 0) {
                    i32 = (~(i77 & 220)) & (i77 | 220);
                } else {
                    i32 = i77;
                }
                int i4319 = (~(i77 & i23)) & (i77 | i23);
                int i4412 = -i4319;
                int i4413 = ((i4319 & i4412) | (i4319 ^ i4412)) >> 31;
                i33 = (i23 & i4413) | (i32 & (~i4413));
                int i4414 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i4415 = (i4414 & 370) + (i4414 | 370);
                int iResolveOpacity4 = 23 - Drawable.resolveOpacity(0, 0);
                int i4416 = -MotionEvent.axisFromString(str6);
                Object[] objArr715 = new Object[1];
                a(i4415, iResolveOpacity4, (char) ((i4416 & 26642) + (i4416 | 26642)), objArr715);
                Object[] objArr716 = {(String) objArr715[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char packedPositionType3 = (char) (ExpandableListView.getPackedPositionType(0L) + 33602);
                    int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str6) + 3085;
                    int maximumFlingVelocity2 = 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte b316 = (byte) 0;
                    byte b317 = (byte) (b316 - 1);
                    Object[] objArr717 = new Object[1];
                    c(b316, b317, (byte) (-b317), objArr717);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionType3, iKeyCodeFromString3, maximumFlingVelocity2, 1411172903, false, (String) objArr717[0], new Class[]{String.class});
                }
                objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr716);
                if (objInvoke != null) {
                    Object[] objArr718 = {objInvoke, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char touchSlop4 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iKeyCodeFromString4 = KeyEvent.keyCodeFromString(str6) + 3393;
                        int mirror11 = '9' - AndroidCharacter.getMirror('0');
                        byte b318 = (byte) 0;
                        byte b319 = (byte) (b318 - 1);
                        Object[] objArr719 = new Object[1];
                        c(b318, b319, (byte) (-b319), objArr719);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(touchSlop4, iKeyCodeFromString4, mirror11, 1203525406, false, (String) objArr719[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr718)).longValue();
                    long j816 = 833424170;
                    long j817 = (j4 * j816) + (j5 * jLongValue112);
                    long j818 = jLongValue112 ^ j30;
                    long j819 = j816 ^ j30;
                    long jFreeMemory6 = ((long) ((int) Runtime.getRuntime().freeMemory())) ^ j30;
                    j10 = j817 + ((j816 | j818) * j2) + ((jLongValue112 | j819 | jFreeMemory6) * j6) + (j6 * (((jFreeMemory6 | jLongValue112) ^ j30) | ((j819 | j818) ^ j30) | ((jLongValue112 | j816) ^ j30))) + ((long) (-835494047));
                    int i4417 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i60 = ((i4417 | 29) << 1) - (i4417 ^ 29);
                    b = i60 % 128;
                    if (i60 % 2 == 0) {
                        int i4418 = ~((int) SystemClock.elapsedRealtime());
                        i61 = ((int) (j10 >> 97)) & (1844193994 + (((~(i4418 | 111133008)) | (-1335874907)) * (-160)) + (((~(i4418 | (-1326093403))) | 111133008) * 160));
                        i62 = (int) j10;
                        int i4419 = ~new Random().nextInt(1561242732);
                        i63 = 1491329174 + (((~(304988418 | i4419)) | 1132237991) * (-983)) + (((~(i4419 | 1132237991)) | 268517632) * 983);
                    } else {
                        int iElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                        i61 = ((int) (j10 >> 32)) & (1303314366 + (((~(1733011407 | iElapsedRealtime4)) | (~((~iElapsedRealtime4) | (-1124729478)))) * (-318)) + (((~((-1124770694) | iElapsedRealtime4)) | 41216) * (-318)) + (((~(iElapsedRealtime4 | 1124770693)) | 1732970191) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                        i62 = (int) j10;
                        i63 = 1320243365 + (((~((-371071834) | i77)) | 336988760) * 1504) + ((~((-34083074) | i77)) * (-1504)) + 1512543408;
                    }
                    i64 = i62 & i63;
                    if (((i61 & i64) | (i61 ^ i64)) == 1986687685) {
                        strArr4 = null;
                        j8 = j30;
                    }
                    int i44110 = -(-KeyEvent.normalizeMetaState(0));
                    int i44111 = (i44110 & 889) + (i44110 | 889);
                    int i45110 = -(-TextUtils.lastIndexOf(str6, '0'));
                    Object[] objArr7110 = new Object[1];
                    a(i44111, ((i45110 | 17) << 1) - (i45110 ^ 17), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr7110);
                    Object[] objArr7111 = {(String) objArr7110[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf3 = (char) (33602 - TextUtils.indexOf(str6, str6, 0));
                        int keyRepeatTimeout7 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                        int i45111 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                        byte b418 = (byte) 0;
                        byte b419 = (byte) (b418 - 1);
                        Object[] objArr7112 = new Object[1];
                        c(b418, b419, (byte) (-b419), objArr7112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, keyRepeatTimeout7, i45111, 1411172903, false, (String) objArr7112[0], new Class[]{String.class});
                    }
                    objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7111);
                    if (objInvoke2 == null) {
                        i38 = 0;
                    } else {
                        Object[] objArr7113 = {objInvoke2, 42};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c18 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iMyPid3 = (Process.myPid() >> 22) + 3393;
                            int scrollBarSize4 = 9 - (ViewConfiguration.getScrollBarSize() >> 8);
                            byte b4110 = (byte) 0;
                            byte b4111 = (byte) (b4110 - 1);
                            Object[] objArr7114 = new Object[1];
                            c(b4110, b4111, (byte) (-b4111), objArr7114);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c18, iMyPid3, scrollBarSize4, 1203525406, false, (String) objArr7114[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7113)).longValue();
                        long j8110 = 1451827883;
                        long jFreeMemory7 = (int) Runtime.getRuntime().freeMemory();
                        long j8111 = jLongValue113 ^ j8;
                        long j8112 = 676;
                        long j8113 = jFreeMemory7 ^ j8;
                        long j8114 = (((long) 677) * j8110) + (((long) (-675)) * jLongValue113) + (((long) (-676)) * (j8110 | jFreeMemory7 | j8111)) + ((((j8111 | j8110) ^ j8) | ((j8113 | j8110) ^ j8)) * j8112) + (j8112 * ((((j8110 ^ j8) | j8111) ^ j8) | ((j8111 | j8113) ^ j8) | (((jLongValue113 | j8110) | jFreeMemory7) ^ j8))) + ((long) (-1453897760));
                        int i45112 = ((int) (j8114 >> 32)) & ((-827560772) + ((~((-631252227) | i77)) * 623) + ((i206 | 262160) * (-623)) + (((~((-1034108239) | i77)) | 631252226 | (~(403118172 | i77))) * 623));
                        int i45113 = ~(i206 | 2100271662);
                        int i45114 = ((int) j8114) & ((((1342802440 | i45113) * (-374)) - 1565934975) + ((i45113 | 757469222) * 374));
                        i38 = (i45112 & i45114) | (i45112 ^ i45114);
                    }
                    if (i38 != 1986687685 || i38 == -1514516938) {
                        i28 = i77;
                        strArr5 = strArr4;
                        i39 = i33;
                    } else {
                        int iIndexOf18 = TextUtils.indexOf((CharSequence) str6, '0', 0);
                        int i701 = -(ViewConfiguration.getEdgeSlop() >> 16);
                        Object[] objArr160 = new Object[1];
                        a(((iIndexOf18 | 1609) << 1) - (iIndexOf18 ^ 1609), (i701 ^ 14) + ((i701 & 14) << 1), (char) (60782 - (~(-TextUtils.lastIndexOf(str6, '0', 0)))), objArr160);
                        String str68 = (String) objArr160[0];
                        int scrollBarSize5 = 1622 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i702 = -TextUtils.getOffsetAfter(str6, 0);
                        Object[] objArr161 = new Object[1];
                        a(scrollBarSize5, ((i702 | 26) << 1) - (i702 ^ 26), (char) KeyEvent.normalizeMetaState(0), objArr161);
                        String str69 = (String) objArr161[0];
                        int i703 = 1647 - (~(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int i704 = -Drawable.resolveOpacity(0, 0);
                        int i705 = (i704 & 17) + (i704 | 17);
                        int i706 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i707 = i706 * 934;
                        int i708 = (i707 ^ (-19060332)) + ((i707 & (-19060332)) << 1);
                        int i709 = ~i706;
                        int i710 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                        int i711 = ~((i709 & i710) | (i709 ^ i710));
                        int i712 = i708 + (((i711 & (-20452)) | ((-20452) ^ i711)) * (-933));
                        int i713 = ~(i710 | (-20452));
                        int i714 = ~(((-20452) & i706) | ((-20452) ^ i706));
                        int i715 = ((i713 & i714) | (i713 ^ i714)) * 933;
                        int i716 = (i712 ^ i715) + ((i715 & i712) << 1);
                        int i717 = -(-((~((i706 & 20451) | (i706 ^ 20451))) * 933));
                        Object[] objArr162 = new Object[1];
                        a(i703, i705, (char) ((i716 ^ i717) + ((i717 & i716) << 1)), objArr162);
                        String str70 = (String) objArr162[0];
                        int i718 = -(-KeyEvent.normalizeMetaState(0));
                        int i719 = ((i718 | 1665) << 1) - (i718 ^ 1665);
                        int i720 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i721 = ((i720 | 16) << 1) - (i720 ^ 16);
                        int i722 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        Object[] objArr163 = new Object[1];
                        a(i719, i721, (char) (((i722 | 20086) << 1) - (i722 ^ 20086)), objArr163);
                        String str71 = (String) objArr163[0];
                        int i723 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i724 = (i723 ^ 1682) + ((i723 & 1682) << 1);
                        int threadPriority2 = Process.getThreadPriority(0);
                        int i725 = 14 - (~((((threadPriority2 | 20) << 1) - (threadPriority2 ^ 20)) >> 6));
                        int i726 = -(-TextUtils.indexOf(str6, str6, 0, 0));
                        Object[] objArr164 = new Object[1];
                        a(i724, i725, (char) ((i726 & 64595) + (i726 | 64595)), objArr164);
                        String str72 = (String) objArr164[0];
                        int iBlue3 = Color.blue(0);
                        int i727 = (iBlue3 ^ 1697) + ((iBlue3 & 1697) << 1);
                        int i728 = 37 - (~(-(-Process.getGidForName(str6))));
                        int i729 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                        Object[] objArr165 = new Object[1];
                        a(i727, i728, (char) ((i729 ^ 23145) + ((i729 & 23145) << 1)), objArr165);
                        String str73 = (String) objArr165[0];
                        int i730 = -TextUtils.lastIndexOf(str6, '0', 0);
                        Object[] objArr166 = new Object[1];
                        a((i730 & 1733) + (i730 | 1733), Color.alpha(0) + 12, (char) (0 - (~ExpandableListView.getPackedPositionChild(0L))), objArr166);
                        String str74 = (String) objArr166[0];
                        int i731 = -Gravity.getAbsoluteGravity(0, 0);
                        int i732 = (i731 ^ 1746) + ((i731 & 1746) << 1);
                        int i733 = 12 - (~(-(-Color.green(0))));
                        int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                        Object[] objArr167 = new Object[1];
                        a(i732, i733, (char) ((jumpTapTimeout2 ^ 30771) + ((jumpTapTimeout2 & 30771) << 1)), objArr167);
                        String str75 = (String) objArr167[0];
                        int i734 = 1758 - (~View.MeasureSpec.getMode(0));
                        int i735 = -TextUtils.indexOf(str6, str6, 0, 0);
                        Object[] objArr168 = new Object[1];
                        a(i734, (i735 & 22) + (i735 | 22), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr168);
                        String str76 = (String) objArr168[0];
                        int defaultSize = View.getDefaultSize(0, 0);
                        int i736 = (defaultSize ^ 1781) + ((defaultSize & 1781) << 1);
                        int iIndexOf19 = TextUtils.indexOf(str6, str6, 0);
                        Object[] objArr169 = new Object[1];
                        a(i736, (iIndexOf19 ^ 31) + ((iIndexOf19 & 31) << 1), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 62720), objArr169);
                        String str77 = (String) objArr169[0];
                        int i737 = -TextUtils.getTrimmedLength(str6);
                        int i738 = (i737 & 1812) + (i737 | 1812);
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 12;
                        int i739 = -(-ExpandableListView.getPackedPositionChild(0L));
                        Object[] objArr170 = new Object[1];
                        a(i738, tapTimeout2, (char) ((i739 ^ 1) + ((i739 & 1) << 1)), objArr170);
                        String str78 = (String) objArr170[0];
                        int iLastIndexOf6 = 1823 - TextUtils.lastIndexOf(str6, '0', 0, 0);
                        int i740 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                        int i741 = (i740 ^ 12) + ((i740 & 12) << 1);
                        int touchSlop5 = ViewConfiguration.getTouchSlop() >> 8;
                        Object[] objArr171 = new Object[1];
                        a(iLastIndexOf6, i741, (char) ((touchSlop5 & 40206) + (touchSlop5 | 40206)), objArr171);
                        String str79 = (String) objArr171[0];
                        int i742 = -(-TextUtils.indexOf(str6, str6));
                        int i743 = -(-TextUtils.lastIndexOf(str6, '0', 0, 0));
                        Object[] objArr172 = new Object[1];
                        a(((i742 | 1836) << 1) - (i742 ^ 1836), (i743 & 13) + (i743 | 13), (char) ((-1) - TextUtils.lastIndexOf(str6, '0', 0, 0)), objArr172);
                        String str80 = (String) objArr172[0];
                        int i744 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        Object[] objArr173 = new Object[1];
                        a(((i744 | 1848) << 1) - (i744 ^ 1848), 11 - Process.getGidForName(str6), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr173);
                        String str81 = (String) objArr173[0];
                        int i745 = 1859 - (~(-ExpandableListView.getPackedPositionGroup(0L)));
                        int i746 = 11 - (~(-(-TextUtils.indexOf(str6, str6, 0))));
                        int i747 = -((byte) KeyEvent.getModifierMetaStateMask());
                        Object[] objArr174 = new Object[1];
                        a(i745, i746, (char) ((i747 ^ (-1)) + (i747 << 1)), objArr174);
                        String str82 = (String) objArr174[0];
                        int i748 = 1871 - (~Color.argb(0, 0, 0, 0));
                        int i749 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i750 = ((i749 | 14) << 1) - (i749 ^ 14);
                        int i751 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Object[] objArr175 = new Object[1];
                        a(i748, i750, (char) ((i751 & 54483) + (i751 | 54483)), objArr175);
                        String str83 = (String) objArr175[0];
                        int fadingEdgeLength3 = 1886 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i752 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr176 = new Object[1];
                        a(fadingEdgeLength3, (i752 ^ 12) + ((i752 & 12) << 1), (char) TextUtils.getTrimmedLength(str6), objArr176);
                        String str84 = (String) objArr176[0];
                        int capsMode2 = TextUtils.getCapsMode(str6, 0, 0);
                        Object[] objArr177 = new Object[1];
                        a(((capsMode2 | 1898) << 1) - (capsMode2 ^ 1898), 24 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr177);
                        String str85 = (String) objArr177[0];
                        Object[] objArr178 = new Object[1];
                        a(1921 - TextUtils.indexOf((CharSequence) str6, '0', 0), 27 - (~(-TextUtils.getCapsMode(str6, 0, 0))), (char) Gravity.getAbsoluteGravity(0, 0), objArr178);
                        String[] strArr21 = {str68, str69, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, (String) objArr178[0]};
                        int i753 = 0;
                        while (true) {
                            if (i753 >= 19) {
                                i58 = i33;
                                i28 = i77;
                                strArr5 = strArr4;
                                i59 = -1;
                                break;
                            }
                            String str86 = strArr21[i753];
                            Object[] objArr179 = {str86};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                                char cMyPid2 = (char) (Process.myPid() >> 22);
                                int maxKeyCode6 = 993 - (KeyEvent.getMaxKeyCode() >> 16);
                                int absoluteGravity3 = 8 - Gravity.getAbsoluteGravity(0, 0);
                                byte b50 = (byte) 0;
                                byte b51 = (byte) (b50 - 1);
                                Object[] objArr180 = new Object[1];
                                c(b50, b51, (byte) (b51 & 6), objArr180);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cMyPid2, maxKeyCode6, absoluteGravity3, -545305915, false, (String) objArr180[0], new Class[]{String.class});
                            }
                            long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr179)).longValue();
                            long j100 = -980874225;
                            String[] strArr22 = strArr21;
                            long j101 = 764;
                            strArr5 = strArr4;
                            int i754 = i753;
                            long jMaxMemory = ((long) ((int) Runtime.getRuntime().maxMemory())) ^ j8;
                            long j102 = (jMaxMemory | j100) ^ j8;
                            i58 = i33;
                            long j103 = ((j100 ^ j8) | jLongValue21) ^ j8;
                            long j104 = (((long) 765) * j100) + (((long) (-1527)) * jLongValue21) + ((jLongValue21 | j102) * j101) + (((long) (-1528)) * (j103 | ((jMaxMemory | jLongValue21) ^ j8))) + (j101 * (j103 | (((jLongValue21 ^ j8) | j100) ^ j8) | j102)) + ((long) 1601333509);
                            int i755 = (int) Runtime.getRuntime().totalMemory();
                            int i756 = ~i755;
                            int i757 = ~((-848819106) | i756);
                            int i758 = ((int) (j104 >> 32)) & (77843354 + ((147712 | i757) * (-712)) + (((~(i755 | (-848671394))) | (~(i756 | (-147713)))) * (-712)) + ((2008921779 | i757) * 712));
                            int i759 = ~((int) Runtime.getRuntime().maxMemory());
                            int i760 = ((int) j104) & (1492048719 + (((-537544993) | i759) * 494) + (((~(i759 | (-940199777))) | (-631916842)) * 494));
                            if (((i758 & i760) | (i758 ^ i760)) != 0) {
                                i28 = i;
                            } else {
                                int i761 = -(ViewConfiguration.getTapTimeout() >> 16);
                                int i762 = ((i761 | 1872) << 1) - (i761 ^ 1872);
                                int iLastIndexOf7 = 13 - TextUtils.lastIndexOf(str6, '0', 0, 0);
                                int iRgb2 = Color.rgb(0, 0, 0);
                                Object[] objArr181 = new Object[1];
                                a(i762, iLastIndexOf7, (char) ((iRgb2 & 16831699) + (iRgb2 | 16831699)), objArr181);
                                if (str86.equals((String) objArr181[0])) {
                                    Object[] objArr182 = {str86};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                        char longPressTimeout5 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                                        int iMakeMeasureSpec = 993 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                        int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8;
                                        byte b52 = (byte) 0;
                                        byte b53 = (byte) (b52 - 1);
                                        Object[] objArr183 = new Object[1];
                                        c(b52, b53, (byte) (b53 + 1), objArr183);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(longPressTimeout5, iMakeMeasureSpec, scrollBarFadeDuration4, 349342683, false, (String) objArr183[0], new Class[]{String.class});
                                    }
                                    long jLongValue22 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr182)).longValue();
                                    long j105 = 518594632;
                                    long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    long j106 = elapsedCpuTime ^ j8;
                                    long j107 = 164;
                                    long j108 = jLongValue22 ^ j8;
                                    long j109 = (((long) 165) * j105) + (((long) (-163)) * jLongValue22) + (((long) (-328)) * (j105 | ((j106 | jLongValue22) ^ j8))) + ((j105 | elapsedCpuTime) * j107) + (j107 * (((jLongValue22 | (j105 | j106)) ^ j8) | (((j105 ^ j8) | j108) ^ j8) | ((j108 | elapsedCpuTime) ^ j8))) + ((long) (-1365673237));
                                    int i763 = ~(i206 | (-1799976815));
                                    i28 = i;
                                    int i764 = ((int) (j109 >> 32)) & (1611722730 + ((1078019336 | i763) * (-712)) + (((~(i206 | (-1078019337))) | (~((-721957479) | i28))) * (-712)) + ((i763 | 1057764070) * 712));
                                    int i765 = ((int) j109) & (411482452 + ((~(i206 | (-344081))) * (-783)) + (((~(i206 | (-540003003))) | 897223407) * 783));
                                    if (((i764 & i765) | (i764 ^ i765)) != 0) {
                                    }
                                } else {
                                    i28 = i;
                                }
                                i753 = i754 + 1;
                                strArr21 = strArr22;
                                i77 = i28;
                                strArr4 = strArr5;
                                i33 = i58;
                            }
                            i59 = i754;
                            break;
                        }
                        int i766 = i59 + 130;
                        int i767 = (i766 | i28) & (~(i28 & i766));
                        int i768 = ~i59;
                        int i769 = (i768 | (-i768)) >> 31;
                        int i770 = (~i769) & i28;
                        int i771 = i767 & i769;
                        int i772 = (i771 & i770) | (i770 ^ i771);
                        int i773 = i28 ^ i58;
                        int i774 = b + 123;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i774 % 128;
                        int i775 = i773 | (-i773);
                        int i776 = i774 % 2 != 0 ? i775 % 88 : i775 >> 31;
                        i39 = (i772 & (~i776)) | (i58 & i776);
                    }
                    int i45115 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr8110 = new Object[1];
                    a(((i45115 | 1950) << 1) - (i45115 ^ 1950), '=' - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(0, 0), objArr8110);
                    int offsetAfter3 = TextUtils.getOffsetAfter(str6, 0);
                    int i45116 = (offsetAfter3 & 1963) + (offsetAfter3 | 1963);
                    int i45117 = -(Process.myTid() >> 22);
                    int i45118 = (i45117 & 5) + (i45117 | 5);
                    int i45119 = b + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i45119 % 128;
                    int i46110 = i45119 % 2;
                    Object[] objArr8111 = new Object[1];
                    a(i45116, i45118, (char) (54525 - (~Color.argb(0, 0, 0, 0))), objArr8111);
                    String[] strArr112 = {(String) objArr8110[0], (String) objArr8111[0]};
                    int maxKeyCode7 = KeyEvent.getMaxKeyCode() >> 16;
                    Object[] objArr8112 = new Object[1];
                    a((maxKeyCode7 & 1968) + (maxKeyCode7 | 1968), TextUtils.lastIndexOf(str6, '0', 0) + 16, (char) (Process.myTid() >> 22), objArr8112);
                    String str316 = (String) objArr8112[0];
                    int i46111 = 1982 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                    int i46112 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Object[] objArr8113 = new Object[1];
                    a(i46111, (i46112 ^ 19) + ((i46112 & 19) << 1), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr8113);
                    String str317 = (String) objArr8113[0];
                    int i46113 = 2001 - (~View.getDefaultSize(0, 0));
                    int i46114 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                    int i46115 = ((i46114 | 14) << 1) - (i46114 ^ 14);
                    int i46116 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    Object[] objArr8114 = new Object[1];
                    a(i46113, i46115, (char) (((i46116 | 20937) << 1) - (i46116 ^ 20937)), objArr8114);
                    int i46117 = -(-Drawable.resolveOpacity(0, 0));
                    Object[] objArr8115 = new Object[1];
                    a(((i46117 | 2016) << 1) - (i46117 ^ 2016), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, (char) (Process.myPid() >> 22), objArr8115);
                    String str318 = (String) objArr8115[0];
                    int iIndexOf110 = 2037 - TextUtils.indexOf(str6, str6, 0);
                    int iRed8 = 10 - Color.red(0);
                    int i46118 = -KeyEvent.normalizeMetaState(0);
                    Object[] objArr8116 = new Object[1];
                    a(iIndexOf110, iRed8, (char) ((i46118 & 42564) + (i46118 | 42564)), objArr8116);
                    int i46119 = 2047 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                    int iResolveSize6 = View.resolveSize(0, 0);
                    int i47110 = (iResolveSize6 * 450) - 4928;
                    int i47111 = ~iResolveSize6;
                    int i47112 = -(-(((~((i47111 & 11) | (i47111 ^ 11))) | (~(((-12) ^ iResolveSize6) | ((-12) & iResolveSize6) | i28))) * 449));
                    int i47113 = (i47110 ^ i47112) + ((i47110 & i47112) << 1);
                    int i47114 = ~iResolveSize6;
                    int i47115 = (i47113 - (~(-(-((~(i47114 | 11)) * (-1347)))))) - 1;
                    int i47116 = ~((i47114 & 11) | (i47114 ^ 11));
                    int i47117 = ~(iResolveSize6 | ((-12) ^ i206) | ((-12) & i206));
                    int i47118 = -(-(((i47116 & i47117) | (i47116 ^ i47117)) * 449));
                    int i47119 = (i47115 & i47118) + (i47118 | i47115);
                    int i48110 = -(-View.combineMeasuredStates(0, 0));
                    Object[] objArr8117 = new Object[1];
                    a(i46119, i47119, (char) ((i48110 ^ 32340) + ((i48110 & 32340) << 1)), objArr8117);
                    String str319 = (String) objArr8117[0];
                    int bitsPerPixel6 = 586 - ImageFormat.getBitsPerPixel(0);
                    int iIndexOf111 = TextUtils.indexOf(str6, str6, 0);
                    int i48111 = ((iIndexOf111 | 6) << 1) - (iIndexOf111 ^ 6);
                    int i48112 = -View.resolveSizeAndState(0, 0, 0);
                    Object[] objArr8118 = new Object[1];
                    a(bitsPerPixel6, i48111, (char) ((i48112 ^ 39532) + ((i48112 & 39532) << 1)), objArr8118);
                    int touchSlop6 = 2058 - (ViewConfiguration.getTouchSlop() >> 8);
                    int longPressTimeout6 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i48113 = -Gravity.getAbsoluteGravity(0, 0);
                    Object[] objArr8119 = new Object[1];
                    a(touchSlop6, longPressTimeout6, (char) (((i48113 | 3641) << 1) - (i48113 ^ 3641)), objArr8119);
                    String str3110 = (String) objArr8119[0];
                    int i48114 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i48115 = (i48114 & 2037) + (i48114 | 2037);
                    int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                    int i48116 = ((maximumDrawingCacheSize3 | 10) << 1) - (maximumDrawingCacheSize3 ^ 10);
                    c3 = 0;
                    Object[] objArr918 = new Object[1];
                    a(i48115, i48116, (char) (42564 - (~TextUtils.indexOf((CharSequence) str6, '0', 0))), objArr918);
                    strArr6 = new String[][]{strArr112, new String[]{str316, str317, (String) objArr8114[0]}, new String[]{str318, (String) objArr8116[0]}, new String[]{str319, (String) objArr8118[0]}, new String[]{str3110, (String) objArr918[0]}};
                    i40 = 0;
                    i41 = 5;
                    i42 = -1;
                    loop7: while (true) {
                        if (i40 < i41) {
                            str10 = str6;
                            i43 = i28;
                            break;
                        }
                        String[] strArr113 = strArr6[i40];
                        str14 = strArr113[c3];
                        i55 = 1;
                        strArr7 = (String[]) Arrays.copyOfRange(strArr113, 1, strArr113.length);
                        length2 = strArr7.length;
                        i56 = 0;
                        while (i56 < length2) {
                            int i48117 = (i42 ^ 114) + ((i42 & 114) << i55);
                            i42 = (i48117 & (-113)) + (i48117 | (-113));
                            Object[] objArr919 = {str14, strArr7[i56]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char c19 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int mirror12 = 2433 - AndroidCharacter.getMirror('0');
                                int pressedStateDuration5 = 32 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte b4112 = (byte) 0;
                                byte b4113 = (byte) (b4112 - 1);
                                Object[] objArr9110 = new Object[1];
                                c(b4112, b4113, (byte) (-b4113), objArr9110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c19, mirror12, pressedStateDuration5, -1207062455, false, (String) objArr9110[0], new Class[]{String.class, String.class});
                            }
                            long jLongValue114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr919)).longValue();
                            long j8115 = 1937243375;
                            str15 = str14;
                            long j916 = 623;
                            long j917 = jLongValue114 ^ j8;
                            long j918 = j917 | j8115;
                            str10 = str6;
                            j9 = (((long) 624) * j8115) + (((long) (-622)) * jLongValue114) + (((j918 | j) ^ j8) * j916) + (((long) (-623)) * (j34 | (((j8115 ^ j8) | jLongValue114) ^ j8))) + (j916 * ((j918 ^ j8) | ((j917 | j) ^ j8) | ((j8115 | j) ^ j8))) + ((long) 39799953);
                            int i48118 = ~Process.myPid();
                            i57 = ((int) (j9 >> 32)) & ((((-1453537304) + (((~(175994551 | i48118)) | (-1613220963)) * (-933))) + (((~(i48118 | (-1613220963))) | 2442274) * 933)) - 1284482807);
                            iNextInt = new Random().nextInt(1982938085);
                            if (((((int) j9) & ((-420073766) + (((~(997543263 | (~iNextInt))) | 439683146) * (-591)) + ((iNextInt | 997543263) * 591))) | i57) != 0) {
                                DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                i43 = ((i42 & 170) + (i42 | 170)) ^ i28;
                                break loop7;
                            }
                            int i48119 = ((i56 | (-110)) << 1) - (i56 ^ (-110));
                            i56 = (i48119 & 111) + (i48119 | 111);
                            strArr7 = strArr7;
                            str14 = str15;
                            strArr6 = strArr6;
                            length2 = length2;
                            str6 = str10;
                            i55 = 1;
                        }
                        i40 = (i40 & 1) + (i40 | 1);
                        strArr6 = strArr6;
                        c3 = 0;
                        i41 = 5;
                    }
                    int i49110 = i28 ^ i39;
                    int i49111 = -i49110;
                    int i49112 = ((i49110 & i49111) | (i49110 ^ i49111)) >> 31;
                    int i49113 = i43 & (~i49112);
                    int i49114 = i39 & i49112;
                    int i49115 = (i49113 ^ i49114) | (i49114 & i49113);
                    str11 = str10;
                    int iIndexOf112 = TextUtils.indexOf(str11, str11, 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i49116 = iIndexOf112 * (-381);
                    int i49117 = (i49116 ^ 400512) + ((i49116 & 400512) << 1);
                    int i49118 = ~iIndexOf112;
                    int i49119 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 ^ 2086) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & 2086));
                    Object[] objArr920 = new Object[1];
                    a((((i49117 + (i49118 * (-191))) + (((iIndexOf112 & i49119) | (iIndexOf112 ^ i49119)) * 191)) - (~(((~(i49118 | 2086)) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | 2086))) * 191))) - 1, 13 - (~(-(-Process.getGidForName(str11)))), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr920);
                    str13 = (String) objArr920[0];
                    Object[] objArr9111 = new Object[1];
                    a(2098 - (~(-KeyEvent.getDeadChar(0, 0))), 7 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9111);
                    bytes = ((String) objArr9111[0]).getBytes();
                    length = bytes.length;
                    if (length == 0) {
                        i44 = i28 ^ 150;
                    } else {
                        bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str13));
                        i48 = 4096;
                        bArr5 = new byte[4096];
                        i49 = 0;
                        while (true) {
                            i50 = bufferedInputStream5.read(bArr5, 0, i48);
                            if (i50 > 0) {
                                break;
                                break;
                            }
                            int i50110 = b + 51;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i50110 % 128;
                            int i50111 = i50110 % 2;
                            DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i51 = 0;
                            while (i49 < length && i51 < i50) {
                                if (bArr5[i51] == bytes[i49]) {
                                    if (i49 != 0) {
                                        i52 = (-2) - (i49 ^ (-1));
                                        while (true) {
                                            if (i52 > 0) {
                                                i49 = 0;
                                                break;
                                                break;
                                            }
                                            i53 = 0;
                                            while (true) {
                                                if (i53 < i52) {
                                                    i49 = i52;
                                                    break;
                                                    break;
                                                }
                                                int i50112 = -i52;
                                                i54 = (i49 & i50112) + (i50112 | i49);
                                                if (bytes[i53] != bytes[((i54 | i53) << 1) - (i54 ^ i53)]) {
                                                    break;
                                                }
                                                i53 = ((i53 & 1) << 1) + (i53 ^ 1);
                                            }
                                            i52 = (-2) - (~i52);
                                        }
                                    }
                                } else {
                                    i49 = (i49 | 1) + (i49 & 1);
                                }
                                i51 = ((i51 | 1) << 1) - (i51 ^ 1);
                            }
                            i48 = 4096;
                        }
                        if (i49 == length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bufferedInputStream5.close();
                        if (z) {
                            i44 = i28 ^ 150;
                        } else {
                            i44 = i28;
                        }
                    }
                    int i50113 = i28 ^ i49115;
                    int i50114 = -i50113;
                    int i50115 = ((i50113 & i50114) | (i50113 ^ i50114)) >> 31;
                    int i50116 = i44 & (~i50115);
                    int i50117 = i49115 & i50115;
                    int i50118 = (i50116 & i50117) | (i50116 ^ i50117);
                    int i50119 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i51110 = ((i50119 | 123) << 1) - (i50119 ^ 123);
                    b = i51110 % 128;
                    int i51111 = i51110 % 2;
                    bitsPerPixel = 2106 - ImageFormat.getBitsPerPixel(0);
                    int i51112 = -View.MeasureSpec.getSize(0);
                    i45 = ((i51112 | 47) << 1) - (i51112 ^ 47);
                    int i51113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i46 = (i51113 & 83) + (i51113 | 83);
                    b = i46 % 128;
                    if (i46 % 2 == 0) {
                        Object[] objArr9112 = new Object[1];
                        a(bitsPerPixel, i45, (char) (46557 / TextUtils.indexOf((CharSequence) str11, (char) 26)), objArr9112);
                        str12 = (String) objArr9112[0];
                        i47 = 0;
                    } else {
                        int i51114 = -TextUtils.indexOf((CharSequence) str11, '0');
                        char c110 = (char) ((i51114 ^ 46557) + ((46557 & i51114) << 1));
                        Object[] objArr9113 = new Object[1];
                        a(bitsPerPixel, i45, c110, objArr9113);
                        i47 = 0;
                        str12 = (String) objArr9113[0];
                    }
                    Object[] objArr9114 = {str12};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char deadChar3 = (char) KeyEvent.getDeadChar(i47, i47);
                        int iIndexOf113 = TextUtils.indexOf(str11, str11) + 993;
                        int i51115 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7;
                        byte b4114 = (byte) 0;
                        byte b4115 = (byte) (b4114 - 1);
                        Object[] objArr9115 = new Object[1];
                        c(b4114, b4115, (byte) (b4115 + 1), objArr9115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar3, iIndexOf113, i51115, 349342683, false, (String) objArr9115[0], new Class[]{String.class});
                    }
                    long jLongValue115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr9114)).longValue();
                    long j919 = -710532123;
                    long j9110 = -712;
                    long j9111 = jLongValue115 ^ j8;
                    long j9112 = (j34 | j919) ^ j8;
                    long j9113 = (((long) (-711)) * j919) + (((long) 713) * jLongValue115) + ((((j9111 | j919) ^ j8) | j9112) * j9110) + (j9110 * ((((j9111 | j34) | j919) ^ j8) | (((jLongValue115 | j919) | j) ^ j8))) + (((long) 712) * (j9111 | j9112)) + ((long) (-136546482));
                    int i51116 = ((int) (j9113 >> 32)) & (112162949 + (((~(1045118418 | i206)) | (-1812622467)) * (-602)) + (((~(1045118418 | i28)) | (-2118876627) | (~(i206 | (-738864259)))) * (-301)) + ((~(i206 | (-1812622467))) * 301));
                    int i51117 = ((int) j9113) & ((-1648223513) + ((1233496469 | i28) * 614) + (((~(1309867659 | i206)) | 25493780 | (~(i206 | (-127358751)))) * (-1228)) + (((~(1335361439 | i206)) | (~(i206 | (-101864971)))) * 614));
                    int i51118 = ((i51116 & i51117) | (i51116 ^ i51117)) * 263;
                    int i51119 = (i51118 & i206) | ((~i51118) & i28);
                    int i5215 = (~(i28 & i50118)) & (i28 | i50118);
                    int i5216 = -i5215;
                    int i5217 = ((i5215 & i5216) | (i5215 ^ i5216)) >> 31;
                    int i5218 = i51119 & (~i5217);
                    int i5219 = i50118 & i5217;
                    i23 = (i5219 & i5218) | (i5218 ^ i5219);
                    strArr2 = strArr5;
                    i29 = 5;
                }
                int i5220 = -ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr1010 = new Object[1];
                a((i5220 ^ 370) + ((i5220 & 370) << 1), 23 - Color.green(0), (char) (26642 - TextUtils.indexOf((CharSequence) str6, '0', 0, 0)), objArr1010);
                String str410 = (String) objArr1010[0];
                int i5221 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i5222 = (i5221 ^ 808) + ((i5221 & 808) << 1);
                int i5223 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr1011 = new Object[1];
                a(i5222, (i5223 ^ 9) + ((i5223 & 9) << 1), (char) (Gravity.getAbsoluteGravity(0, 0) + 42075), objArr1011);
                String str411 = (String) objArr1011[0];
                Object[] objArr1012 = new Object[1];
                a(818 - TextUtils.indexOf(str6, str6), 6 - (~(-ExpandableListView.getPackedPositionGroup(0L))), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr1012);
                String str412 = (String) objArr1012[0];
                Object[] objArr1013 = new Object[1];
                a(824 - (~(-TextUtils.indexOf(str6, str6, 0))), 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.indexOf(str6, str6, 0), objArr1013);
                int edgeSlop3 = ViewConfiguration.getEdgeSlop() >> 16;
                int i5224 = (edgeSlop3 & 833) + (edgeSlop3 | 833);
                int i5310 = -ExpandableListView.getPackedPositionChild(0L);
                int i5311 = (i5310 ^ 16) + ((i5310 & 16) << 1);
                int i5312 = -(ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr1014 = new Object[1];
                a(i5224, i5311, (char) ((i5312 & 30075) + (i5312 | 30075)), objArr1014);
                String str413 = (String) objArr1014[0];
                int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                int i5313 = ((keyRepeatDelay2 | 850) << 1) - (keyRepeatDelay2 ^ 850);
                int i5314 = -(Process.myPid() >> 22);
                int i5315 = (i5314 & 7) + (i5314 | 7);
                int i5316 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i5317 = ~(((-1731) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14) | ((-1731) & iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                int i5318 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                int i5319 = (i5318 & i5316) | (i5318 ^ i5316);
                int i5410 = (((i5316 * (-405)) + 704110) - (~(-(-((i5317 | (~((i5319 & 1730) | (i5319 ^ 1730)))) * (-406)))))) - 1;
                int i5411 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                int i5412 = ((-1731) & i5411) | ((-1731) ^ i5411);
                int i5413 = (i5410 - (~((~((i5412 & i5316) | (i5412 ^ i5316))) * (-406)))) - 1;
                int i5414 = ~i5316;
                int i5415 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & i5414) | (i5414 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                int i5416 = ~((i5411 ^ 1730) | (i5411 & 1730));
                int i5417 = ((i5415 & i5416) | (i5415 ^ i5416)) * 406;
                Object[] objArr1015 = new Object[1];
                a(i5313, i5315, (char) ((i5413 & i5417) + (i5417 | i5413)), objArr1015);
                String str414 = (String) objArr1015[0];
                Object[] objArr1016 = new Object[1];
                a(856 - (~(-TextUtils.indexOf(str6, str6))), 6 - (~(-(-View.combineMeasuredStates(0, 0)))), (char) ((-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))) - 1), objArr1016);
                String str415 = (String) objArr1016[0];
                int i5418 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                Object[] objArr1017 = new Object[1];
                a((i5418 & 863) + (i5418 | 863), 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 31661), objArr1017);
                String str416 = (String) objArr1017[0];
                Object[] objArr1018 = new Object[1];
                a(875 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, (char) ((-2) - ((-MotionEvent.axisFromString(str6)) ^ (-1))), objArr1018);
                int i5419 = 888 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                int i5510 = -(ViewConfiguration.getTapTimeout() >> 16);
                Object[] objArr1019 = new Object[1];
                a(i5419, (i5510 & 16) + (i5510 | 16), (char) (Process.myPid() >> 22), objArr1019);
                String str417 = (String) objArr1019[0];
                int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength() >> 16;
                int i5511 = (fadingEdgeLength4 ^ TypedValues.Custom.TYPE_DIMENSION) + ((fadingEdgeLength4 & TypedValues.Custom.TYPE_DIMENSION) << 1);
                int iAlpha2 = Color.alpha(0);
                Object[] objArr1110 = new Object[1];
                a(i5511, (iAlpha2 ^ 3) + ((iAlpha2 & 3) << 1), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr1110);
                String str418 = (String) objArr1110[0];
                char mirror13 = AndroidCharacter.getMirror('0');
                int i5512 = ((mirror13 | 868) << 1) - (mirror13 ^ 868);
                int i5513 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                Object[] objArr1111 = new Object[1];
                a(i5512, (i5513 & 22) + (i5513 | 22), (char) View.MeasureSpec.getMode(0), objArr1111);
                String str419 = (String) objArr1111[0];
                int i5514 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iLastIndexOf8 = TextUtils.lastIndexOf(str6, '0', 0, 0);
                int i5515 = ((iLastIndexOf8 | 26) << 1) - (iLastIndexOf8 ^ 26);
                int i5516 = -Process.getGidForName(str6);
                Object[] objArr1112 = new Object[1];
                a((i5514 ^ 938) + ((i5514 & 938) << 1), i5515, (char) ((i5516 ^ 6065) + ((i5516 & 6065) << 1)), objArr1112);
                String str510 = (String) objArr1112[0];
                int scrollBarSize6 = 963 - (ViewConfiguration.getScrollBarSize() >> 8);
                int windowTouchSlop6 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                int i5517 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                Object[] objArr1113 = new Object[1];
                a(scrollBarSize6, windowTouchSlop6, (char) (((i5517 | 27446) << 1) - (i5517 ^ 27446)), objArr1113);
                j8 = j30;
                int i5518 = i6;
                int i5519 = 989 - (~(-TextUtils.lastIndexOf(str6, '0', 0, 0)));
                int i5610 = -View.getDefaultSize(0, 0);
                int i5611 = (i5610 * (-947)) + 10439;
                int i5612 = ~i5610;
                int i5613 = ~(((-12) ^ i77) | ((-12) & i77));
                int i5614 = ((i5613 & i5612) | (i5612 ^ i5613)) * (-948);
                int i5615 = (i5611 & i5614) + (i5611 | i5614);
                int i5616 = (i5612 ^ (-12)) | (i5612 & (-12));
                int i5617 = (i5615 - (~((~((i5518 & i5616) | (i5616 ^ i5518))) * (-948)))) - 1;
                int i5618 = ((i5610 ^ (-12)) | (i5610 & (-12))) * 948;
                int i5619 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr1114 = new Object[1];
                a(i5519, ((i5617 | i5618) << 1) - (i5618 ^ i5617), (char) (((i5619 | 33983) << 1) - (i5619 ^ 33983)), objArr1114);
                String str511 = (String) objArr1114[0];
                int i5710 = 1003 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i5711 = 7 - (~(ViewConfiguration.getFadingEdgeLength() >> 16));
                int iResolveSize7 = View.resolveSize(0, 0);
                Object[] objArr1115 = new Object[1];
                a(i5710, i5711, (char) (((iResolveSize7 | 14996) << 1) - (iResolveSize7 ^ 14996)), objArr1115);
                String str512 = (String) objArr1115[0];
                int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + PointerIconCompat.TYPE_ALIAS;
                int i5712 = -TextUtils.getOffsetBefore(str6, 0);
                Object[] objArr1116 = new Object[1];
                a(absoluteGravity4, ((i5712 | 6) << 1) - (i5712 ^ 6), (char) TextUtils.indexOf(str6, str6, 0), objArr1116);
                String str513 = (String) objArr1116[0];
                int i5713 = 1015 - (~(ViewConfiguration.getTouchSlop() >> 8));
                int iAxisFromString5 = MotionEvent.axisFromString(str6);
                Object[] objArr1117 = new Object[1];
                a(i5713, ((iAxisFromString5 | 7) << 1) - (iAxisFromString5 ^ 7), (char) KeyEvent.normalizeMetaState(0), objArr1117);
                int i5714 = -ImageFormat.getBitsPerPixel(0);
                int i5715 = ((i5714 | PointerIconCompat.TYPE_GRABBING) << 1) - (i5714 ^ PointerIconCompat.TYPE_GRABBING);
                int i5716 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr1118 = new Object[1];
                a(i5715, ((i5716 | 16) << 1) - (i5716 ^ 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 54008), objArr1118);
                String str514 = (String) objArr1118[0];
                Object[] objArr1119 = new Object[1];
                a(856 - (~(-(-TextUtils.getCapsMode(str6, 0, 0)))), 5 - (~(-TextUtils.lastIndexOf(str6, '0', 0, 0))), (char) Color.blue(0), objArr1119);
                String str515 = (String) objArr1119[0];
                char mirror14 = AndroidCharacter.getMirror('0');
                Object[] objArr1210 = new Object[1];
                a((mirror14 ^ 777) + ((mirror14 & 777) << 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, (char) TextUtils.indexOf(str6, str6, 0), objArr1210);
                Object[] objArr1211 = new Object[1];
                a(1038 - ExpandableListView.getPackedPositionGroup(0L), 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (58813 - (~(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))), objArr1211);
                String str516 = (String) objArr1211[0];
                int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1052;
                int i5717 = -View.getDefaultSize(0, 0);
                Object[] objArr1212 = new Object[1];
                a(minimumFlingVelocity4, (i5717 ^ 1) + ((i5717 & 1) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1212);
                int fadingEdgeLength5 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1053;
                int i5718 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr1213 = new Object[1];
                a(fadingEdgeLength5, (i5718 ^ 9) + ((i5718 & 9) << 1), (char) Color.blue(0), objArr1213);
                String str517 = (String) objArr1213[0];
                int i5719 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i5810 = (i5719 & 1063) + (i5719 | 1063);
                int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 1;
                int maxKeyCode8 = KeyEvent.getMaxKeyCode() >> 16;
                Object[] objArr1214 = new Object[1];
                a(i5810, packedPositionType4, (char) ((maxKeyCode8 & 49617) + (maxKeyCode8 | 49617)), objArr1214);
                int i5811 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i5812 = (i5811 ^ 1064) + ((i5811 & 1064) << 1);
                int i5813 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                int i5814 = (i5813 ^ 16) + ((i5813 & 16) << 1);
                int i5815 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                Object[] objArr1215 = new Object[1];
                a(i5812, i5814, (char) ((i5815 ^ 1) + ((i5815 & 1) << 1)), objArr1215);
                int iLastIndexOf9 = TextUtils.lastIndexOf(str6, '0', 0);
                int i5816 = (iLastIndexOf9 & TypedValues.Custom.TYPE_REFERENCE) + (iLastIndexOf9 | TypedValues.Custom.TYPE_REFERENCE);
                int i5817 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr1216 = new Object[1];
                a(i5816, ((i5817 | 3) << 1) - (i5817 ^ 3), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1216);
                int i5818 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 850;
                int iLastIndexOf10 = TextUtils.lastIndexOf(str6, '0') + 8;
                int i5819 = -Color.blue(0);
                Object[] objArr1217 = new Object[1];
                a(i5818, iLastIndexOf10, (char) ((i5819 & 1730) + (i5819 | 1730)), objArr1217);
                int i5910 = 1077 - (~(-MotionEvent.axisFromString(str6)));
                int i5911 = 7 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))));
                int keyRepeatTimeout8 = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                Object[] objArr1218 = new Object[1];
                a(i5910, i5911, (char) ((keyRepeatTimeout8 ^ 14478) + ((keyRepeatTimeout8 & 14478) << 1)), objArr1218);
                int i5912 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i5913 = (i5912 ^ 863) + ((i5912 & 863) << 1);
                int gidForName6 = 10 - Process.getGidForName(str6);
                int i5914 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr1219 = new Object[1];
                a(i5913, gidForName6, (char) (((i5914 | 31661) << 1) - (i5914 ^ 31661)), objArr1219);
                String str518 = (String) objArr1219[0];
                int i5915 = b;
                int i5916 = (i5915 ^ 17) + ((i5915 & 17) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5916 % 128;
                int i5917 = i5916 % 2;
                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 875;
                int i5918 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr1310 = new Object[1];
                a(iCombineMeasuredStates2, ((i5918 | 13) << 1) - (i5918 ^ 13), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1310);
                String[] strArr114 = {(String) objArr1215[0], (String) objArr1216[0], (String) objArr1217[0], (String) objArr1218[0], str518, (String) objArr1310[0]};
                int i5919 = -(-TextUtils.getOffsetAfter(str6, 0));
                int i6010 = (i5919 & 1087) + (i5919 | 1087);
                int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout() >> 16;
                Object[] objArr1311 = new Object[1];
                a(i6010, ((jumpTapTimeout3 | 20) << 1) - (jumpTapTimeout3 ^ 20), (char) ((-TextUtils.indexOf((CharSequence) str6, '0')) - 1), objArr1311);
                String str519 = (String) objArr1311[0];
                int i6011 = 1108 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i6012 = -(-ExpandableListView.getPackedPositionGroup(0L));
                Object[] objArr1312 = new Object[1];
                a(i6011, (i6012 & 19) + (i6012 | 19), (char) Drawable.resolveOpacity(0, 0), objArr1312);
                String str610 = (String) objArr1312[0];
                int i6013 = 1125 - (~TextUtils.indexOf(str6, str6, 0, 0));
                int iAxisFromString6 = MotionEvent.axisFromString(str6);
                int i6014 = (iAxisFromString6 ^ 32) + ((iAxisFromString6 & 32) << 1);
                int scrollDefaultDelay4 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                Object[] objArr1313 = new Object[1];
                a(i6013, i6014, (char) ((scrollDefaultDelay4 ^ 53949) + ((scrollDefaultDelay4 & 53949) << 1)), objArr1313);
                String str611 = (String) objArr1313[0];
                Object[] objArr1314 = new Object[1];
                a(1156 - (~(-(-TextUtils.getOffsetAfter(str6, 0)))), TextUtils.lastIndexOf(str6, '0') + 27, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45649), objArr1314);
                String str612 = (String) objArr1314[0];
                int threadPriority3 = Process.getThreadPriority(0);
                int i6015 = ((threadPriority3 ^ 20) + ((threadPriority3 & 20) << 1)) >> 6;
                int i6016 = ((i6015 | 1183) << 1) - (i6015 ^ 1183);
                int i6017 = -(Process.myTid() >> 22);
                Object[] objArr1315 = new Object[1];
                a(i6016, ((i6017 | 23) << 1) - (i6017 ^ 23), (char) View.combineMeasuredStates(0, 0), objArr1315);
                String str613 = (String) objArr1315[0];
                int i6018 = 1204 - (~(-TextUtils.indexOf((CharSequence) str6, '0', 0)));
                int i6019 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr1316 = new Object[1];
                a(i6018, (i6019 ^ 33) + ((i6019 & 33) << 1), (char) Drawable.resolveOpacity(0, 0), objArr1316);
                int longPressTimeout7 = ViewConfiguration.getLongPressTimeout() >> 16;
                int i6110 = ((longPressTimeout7 | 1239) << 1) - (longPressTimeout7 ^ 1239);
                int i6111 = 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i6112 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr1317 = new Object[1];
                a(i6110, i6111, (char) ((i6112 ^ (-1)) + (i6112 << 1)), objArr1317);
                String str614 = (String) objArr1317[0];
                int iIndexOf114 = TextUtils.indexOf((CharSequence) str6, '0');
                int i6113 = (iIndexOf114 & 819) + (iIndexOf114 | 819);
                int i6114 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6;
                int i6115 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr1318 = new Object[1];
                a(i6113, i6114, (char) ((i6115 ^ 1) + ((i6115 & 1) << 1)), objArr1318);
                int packedPositionChild5 = 1251 - ExpandableListView.getPackedPositionChild(0L);
                int i6116 = -Color.green(0);
                int i6117 = (i6116 & 30) + (i6116 | 30);
                int iRed9 = Color.red(0);
                Object[] objArr1319 = new Object[1];
                a(packedPositionChild5, i6117, (char) ((iRed9 ^ 12531) + ((iRed9 & 12531) << 1)), objArr1319);
                String str615 = (String) objArr1319[0];
                int i6118 = -TextUtils.indexOf(str6, str6);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i6119 = (i6118 * (-445)) - 570490;
                int i6210 = ~i6118;
                int i6211 = ~(i6210 | (-1283));
                int i6212 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                int i6213 = ~((i6212 & (-1283)) | ((-1283) ^ i6212));
                int i6214 = -(-(((i6211 & i6213) | (i6211 ^ i6213)) * 446));
                int i6215 = (i6119 ^ i6214) + ((i6119 & i6214) << 1);
                int i6216 = ~((i6210 ^ 1282) | (i6210 & 1282));
                int i6217 = ((-1283) & i6118) | ((-1283) ^ i6118);
                int i6218 = -(-(((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & i6217) | (i6217 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15))) | i6216) * 446));
                int i6219 = ~i6118;
                int i6310 = (((i6215 | i6218) << 1) - (i6218 ^ i6215)) + ((~((i6219 & (-1283)) | (i6219 ^ (-1283)))) * 446);
                int edgeSlop4 = ViewConfiguration.getEdgeSlop() >> 16;
                int iRed10 = Color.red(0);
                Object[] objArr1410 = new Object[1];
                a(i6310, (edgeSlop4 ^ 11) + ((edgeSlop4 & 11) << 1), (char) ((iRed10 ^ 13433) + ((iRed10 & 13433) << 1)), objArr1410);
                int doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0);
                Object[] objArr1411 = new Object[1];
                a((doubleTapTimeout3 ^ 1293) + ((doubleTapTimeout3 & 1293) << 1), ((iResolveSizeAndState2 | 19) << 1) - (iResolveSizeAndState2 ^ 19), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr1411);
                String str616 = (String) objArr1411[0];
                int i6311 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i6312 = (i6311 & 1312) + (i6311 | 1312);
                int i6313 = -ExpandableListView.getPackedPositionChild(0L);
                int i6314 = ((i6313 | 4) << 1) - (i6313 ^ 4);
                int packedPositionChild6 = ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr1412 = new Object[1];
                a(i6312, i6314, (char) ((packedPositionChild6 ^ 20934) + ((packedPositionChild6 & 20934) << 1)), objArr1412);
                int i6315 = -(-Color.rgb(0, 0, 0));
                Object[] objArr1413 = new Object[1];
                a((i6315 ^ 16778533) + ((i6315 & 16778533) << 1), 18 - (~ExpandableListView.getPackedPositionGroup(0L)), (char) Color.argb(0, 0, 0, 0), objArr1413);
                Object[] objArr1414 = new Object[1];
                a(TextUtils.getCapsMode(str6, 0, 0) + 1336, 14 - (~(-TextUtils.indexOf((CharSequence) str6, '0', 0))), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1414);
                int i6316 = 1351 - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                int i6317 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                Object[] objArr1415 = new Object[1];
                a(i6316, (i6317 & 18) + (i6317 | 18), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr1415);
                int windowTouchSlop7 = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i6318 = (windowTouchSlop7 & 1371) + (windowTouchSlop7 | 1371);
                int iLastIndexOf11 = 18 - TextUtils.lastIndexOf(str6, '0');
                int mode4 = View.MeasureSpec.getMode(0);
                Object[] objArr1416 = new Object[1];
                a(i6318, iLastIndexOf11, (char) ((mode4 & 4698) + (mode4 | 4698)), objArr1416);
                int iMyTid5 = (Process.myTid() >> 22) + 1390;
                int pressedStateDuration6 = 23 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int i6319 = -(ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr1417 = new Object[1];
                a(iMyTid5, pressedStateDuration6, (char) ((i6319 ^ 37773) + ((i6319 & 37773) << 1)), objArr1417);
                int i6410 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i6411 = -TextUtils.indexOf(str6, str6, 0, 0);
                Object[] objArr1418 = new Object[1];
                a((i6410 ^ 1413) + ((i6410 & 1413) << 1), ((i6411 | 21) << 1) - (i6411 ^ 21), (char) (25078 - View.getDefaultSize(0, 0)), objArr1418);
                int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1434;
                int i6412 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i6413 = (i6412 ^ 24) + ((i6412 & 24) << 1);
                int i6414 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr1419 = new Object[1];
                a(doubleTapTimeout4, i6413, (char) ((i6414 ^ 1) + ((i6414 & 1) << 1)), objArr1419);
                String str617 = str4;
                int i6415 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i6416 = ((i6415 | 1458) << 1) - (i6415 ^ 1458);
                int i6417 = -(-TextUtils.indexOf((CharSequence) str6, '0', 0));
                int i6418 = ((i6417 | 29) << 1) - (i6417 ^ 29);
                int i6419 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                Object[] objArr1510 = new Object[1];
                a(i6416, i6418, (char) ((i6419 ^ (-1)) + (i6419 << 1)), objArr1510);
                int i6510 = 1485 - (~(-(ViewConfiguration.getKeyRepeatDelay() >> 16)));
                int i6511 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i6512 = i6511 * (-167);
                int i6513 = (i6512 ^ (-4509)) + ((i6512 & (-4509)) << 1);
                int i6514 = ~i6511;
                int i6515 = ~((i6514 & (-28)) | (i6514 ^ (-28)));
                int i6516 = ~(((-28) ^ i77) | ((-28) & i77));
                int i6517 = ((i6515 & i6516) | (i6515 ^ i6516)) * 336;
                int i6518 = ((i6513 | i6517) << 1) - (i6517 ^ i6513);
                int i6519 = ~(i6511 | 27);
                int i6610 = ~((i6511 ^ i77) | (i6511 & i77));
                int i6611 = -(-(((i6519 & i6610) | (i6519 ^ i6610)) * (-168)));
                int i6612 = ((i6518 | i6611) << 1) - (i6611 ^ i6518);
                int i6613 = ~((i206 & i6511) | (i206 ^ i6511));
                int i6614 = (((-28) & i6613) | ((-28) ^ i6613)) * 168;
                int i6615 = (i6612 & i6614) + (i6614 | i6612);
                int iIndexOf115 = TextUtils.indexOf((CharSequence) str6, '0');
                Object[] objArr1511 = new Object[1];
                a(i6510, i6615, (char) (((iIndexOf115 | 62379) << 1) - (iIndexOf115 ^ 62379)), objArr1511);
                Object[] objArr1512 = new Object[1];
                a(1512 - (~(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, (char) TextUtils.indexOf(str6, str6), objArr1512);
                int mirror15 = 1592 - AndroidCharacter.getMirror('0');
                int i6616 = -(-TextUtils.indexOf((CharSequence) str6, '0'));
                Object[] objArr1513 = new Object[1];
                a(mirror15, (i6616 & 28) + (i6616 | 28), (char) View.resolveSizeAndState(0, 0, 0), objArr1513);
                int i6617 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i6618 = ((i6617 | 1571) << 1) - (i6617 ^ 1571);
                int longPressTimeout8 = (ViewConfiguration.getLongPressTimeout() >> 16) + 32;
                int i6619 = -(-TextUtils.indexOf((CharSequence) str6, '0'));
                Object[] objArr1514 = new Object[1];
                a(i6618, longPressTimeout8, (char) ((i6619 & 1) + (i6619 | 1)), objArr1514);
                c = 0;
                strArr3 = new String[][]{new String[]{str410, str411, str412, (String) objArr1013[0]}, new String[]{str413, str414, str415, str416, (String) objArr1018[0]}, new String[]{str417, str418, str4, str419, str510, (String) objArr1113[0]}, new String[]{str511, str512, str513, (String) objArr1117[0]}, new String[]{str514, str515, (String) objArr1210[0]}, new String[]{str516, (String) objArr1212[0]}, new String[]{str517, (String) objArr1214[0]}, strArr114, new String[]{str519, str610, str611, str612, str613, (String) objArr1316[0], str4}, new String[]{str614, (String) objArr1318[0]}, new String[]{str615, (String) objArr1410[0]}, new String[]{str616, (String) objArr1412[0]}, new String[]{(String) objArr1413[0]}, new String[]{(String) objArr1414[0]}, new String[]{(String) objArr1415[0]}, new String[]{(String) objArr1416[0]}, new String[]{(String) objArr1417[0]}, new String[]{(String) objArr1418[0]}, new String[]{(String) objArr1419[0], str617}, new String[]{(String) objArr1510[0], str617}, new String[]{(String) objArr1511[0], str617}, new String[]{(String) objArr1512[0], str617}, new String[]{(String) objArr1513[0], str617}, new String[]{(String) objArr1514[0], str617}};
                int i6710 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                Object[] objArr1515 = new Object[1];
                a((i6710 ^ 1603) + ((i6710 & 1603) << 1), 1 - Color.blue(0), (char) (43362 - Process.getGidForName(str6)), objArr1515);
                sb = new StringBuilder((String) objArr1515[0]);
                i34 = i77;
                i35 = 0;
                int i6711 = 0;
                while (i35 < 24) {
                    String[] strArr115 = strArr3[i35];
                    Object[] objArr1516 = {strArr115[c]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maxKeyCode9 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 33602);
                        int iResolveOpacity5 = 3085 - Drawable.resolveOpacity(0, 0);
                        int iResolveOpacity6 = Drawable.resolveOpacity(0, 0) + 26;
                        byte b420 = (byte) 0;
                        byte b421 = (byte) (b420 - 1);
                        Object[] objArr1517 = new Object[1];
                        c(b420, b421, (byte) (-b421), objArr1517);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode9, iResolveOpacity5, iResolveOpacity6, 1411172903, false, (String) objArr1517[0], new Class[]{String.class});
                    }
                    str7 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1516);
                    String[] strArr116 = (String[]) Arrays.copyOfRange(strArr115, 1, strArr115.length);
                    if (str7 != null || str7.isEmpty()) {
                        i33 = i33;
                        sb2 = sb;
                    } else {
                        if (strArr115.length != 1) {
                            Object[] objArr184 = {str7, strArr116};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1514294371);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                char cLastIndexOf3 = (char) (TextUtils.lastIndexOf(str6, '0', 0, 0) + 1);
                                int i777 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3357;
                                int edgeSlop5 = (ViewConfiguration.getEdgeSlop() >> 16) + 18;
                                byte b54 = (byte) 0;
                                byte b55 = (byte) (b54 - 1);
                                Object[] objArr185 = new Object[1];
                                c(b54, b55, (byte) (-b55), objArr185);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cLastIndexOf3, i777, edgeSlop5, -1092817996, false, (String) objArr185[0], new Class[]{String.class, String[].class});
                            }
                            long jLongValue23 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr184)).longValue();
                            long j110 = 1871565819;
                            long j111 = 220;
                            sb3 = sb;
                            long j112 = (int) Runtime.getRuntime().totalMemory();
                            long j113 = j112 ^ j8;
                            str9 = str6;
                            str8 = str7;
                            long j114 = (((long) 221) * j110) + (((long) (-219)) * jLongValue23) + (((((j110 ^ j8) | (jLongValue23 ^ j8)) ^ j8) | (((j113 | j110) | jLongValue23) ^ j8)) * j111) + (((long) (-440)) * (j110 | ((j113 | jLongValue23) ^ j8))) + (j111 * (j112 | j110 | jLongValue23)) + ((long) 271416519);
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i778 = ((int) (j114 >> 32)) & (501358106 + (((~((-2050089590) | startUptimeMillis)) | 1513120309) * 336) + (((~((-612863179) | startUptimeMillis)) | 75893898) * (-168)) + (((~((~startUptimeMillis) | (-612863179))) | (-2050089590)) * 168));
                            int iMyPid4 = Process.myPid();
                            int i779 = ((int) j114) & (1153123995 + (((~iMyPid4) | 1449032634) * 1444) + (((~(iMyPid4 | 559551241)) | (~((-1996777652) | iMyPid4)) | 1443129522) * (-1444)) + 1770457754);
                            if (((i778 & i779) | (i778 ^ i779)) == 0) {
                                str6 = str9;
                                sb2 = sb3;
                            }
                            i35 = (i35 ^ 1) + ((i35 & 1) << 1);
                            i33 = i33;
                            sb = sb2;
                            strArr3 = strArr3;
                            c = 0;
                        } else {
                            i33 = i33;
                            str8 = str7;
                            sb3 = sb;
                            str9 = str6;
                        }
                        int i780 = (i35 ^ 10) + ((i35 & 10) << 1);
                        i34 = (~(i77 & i780)) & (i780 | i77);
                        i6711++;
                        if (i6711 > 1) {
                            int i781 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int i782 = (i781 ^ 1603) + ((i781 & 1603) << 1);
                            int i783 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                            str6 = str9;
                            i37 = 0;
                            Object[] objArr186 = new Object[1];
                            a(i782, ((i783 | 2) << 1) - (i783 ^ 2), (char) (TextUtils.lastIndexOf(str6, '0', 0) + 56442), objArr186);
                            sb2 = sb3;
                            sb2.append((String) objArr186[0]);
                        } else {
                            str6 = str9;
                            sb2 = sb3;
                            i37 = 0;
                        }
                        sb2.append(strArr115[i37]);
                        int iResolveSizeAndState3 = View.resolveSizeAndState(i37, i37, i37);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i784 = (iResolveSizeAndState3 * 450) - 719488;
                        int i785 = ~iResolveSizeAndState3;
                        int i786 = ~((i785 & 1606) | (i785 ^ 1606));
                        int i787 = ((-1607) ^ iResolveSizeAndState3) | ((-1607) & iResolveSizeAndState3);
                        int i788 = ~((i787 & iTuitionPaymentFragmentspecialinlinedviewModeldefault16) | (i787 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault16));
                        int i789 = ((i788 & i786) | (i786 ^ i788)) * 449;
                        int i790 = (i784 ^ i789) + ((i784 & i789) << 1) + (i786 * (-1347));
                        int i791 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
                        int i792 = (i791 & (-1607)) | ((-1607) ^ i791);
                        int i793 = ~((iResolveSizeAndState3 & i792) | (i792 ^ iResolveSizeAndState3));
                        int i794 = ((i793 & i786) | (i786 ^ i793)) * 449;
                        int i795 = (i790 ^ i794) + ((i794 & i790) << 1);
                        int i796 = -ExpandableListView.getPackedPositionChild(0L);
                        int i797 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        Object[] objArr187 = new Object[1];
                        a(i795, i796, (char) (((i797 | 33012) << 1) - (i797 ^ 33012)), objArr187);
                        sb2.append((String) objArr187[0]);
                        sb2.append(str8);
                        i35 = (i35 ^ 1) + ((i35 & 1) << 1);
                        i33 = i33;
                        sb = sb2;
                        strArr3 = strArr3;
                        c = 0;
                    }
                    i34 = i34;
                    i35 = (i35 ^ 1) + ((i35 & 1) << 1);
                    i33 = i33;
                    sb = sb2;
                    strArr3 = strArr3;
                    c = 0;
                }
                int i6712 = i33;
                StringBuilder sb5 = sb;
                int i6713 = i34;
                int scrollBarFadeDuration5 = 1607 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i6714 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                Object[] objArr1518 = new Object[1];
                a(scrollBarFadeDuration5, (i6714 & 1) + (i6714 | 1), (char) Color.blue(0), objArr1518);
                sb5.append((String) objArr1518[0]);
                int i6715 = b;
                i36 = (i6715 ^ 35) + ((i6715 & 35) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i36 % 128;
                if (i36 % 2 != 0 ? i6711 <= 2 : i6711 <= 4) {
                    c2 = 0;
                    objArr = new Object[]{new int[]{i77}, new String[0]};
                } else {
                    c2 = 0;
                    String[] strArr23 = {sb5.toString()};
                    ((int[]) objArr[0])[0] = i6713;
                    objArr = new Object[]{new int[1], strArr23};
                }
                int i6716 = i77 ^ i6712;
                int i6717 = -i6716;
                int i6718 = ((i6716 & i6717) | (i6716 ^ i6717)) >> 31;
                int i6719 = ((int[]) objArr[c2])[c2] & (~i6718);
                int i6810 = i6712 & i6718;
                int i6811 = (i6719 & i6810) | (i6719 ^ i6810);
                String[] strArr24 = (String[]) objArr[1];
                int i6812 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                b = i6812 % 128;
                int i6813 = i6812 % 2;
                strArr4 = strArr24;
                i33 = i6811;
                int i44112 = -(-KeyEvent.normalizeMetaState(0));
                int i44113 = (i44112 & 889) + (i44112 | 889);
                int i451110 = -(-TextUtils.lastIndexOf(str6, '0'));
                Object[] objArr7115 = new Object[1];
                a(i44113, ((i451110 | 17) << 1) - (i451110 ^ 17), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr7115);
                Object[] objArr7116 = {(String) objArr7115[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cIndexOf4 = (char) (33602 - TextUtils.indexOf(str6, str6, 0));
                    int keyRepeatTimeout9 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                    int i451111 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                    byte b4116 = (byte) 0;
                    byte b4117 = (byte) (b4116 - 1);
                    Object[] objArr7117 = new Object[1];
                    c(b4116, b4117, (byte) (-b4117), objArr7117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf4, keyRepeatTimeout9, i451111, 1411172903, false, (String) objArr7117[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7116);
                if (objInvoke2 == null) {
                    i38 = 0;
                } else {
                    Object[] objArr7118 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c111 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iMyPid5 = (Process.myPid() >> 22) + 3393;
                        int scrollBarSize7 = 9 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b4118 = (byte) 0;
                        byte b4119 = (byte) (b4118 - 1);
                        Object[] objArr7119 = new Object[1];
                        c(b4118, b4119, (byte) (-b4119), objArr7119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c111, iMyPid5, scrollBarSize7, 1203525406, false, (String) objArr7119[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7118)).longValue();
                    long j8116 = 1451827883;
                    long jFreeMemory8 = (int) Runtime.getRuntime().freeMemory();
                    long j8117 = jLongValue116 ^ j8;
                    long j8118 = 676;
                    long j8119 = jFreeMemory8 ^ j8;
                    long j81110 = (((long) 677) * j8116) + (((long) (-675)) * jLongValue116) + (((long) (-676)) * (j8116 | jFreeMemory8 | j8117)) + ((((j8117 | j8116) ^ j8) | ((j8119 | j8116) ^ j8)) * j8118) + (j8118 * ((((j8116 ^ j8) | j8117) ^ j8) | ((j8117 | j8119) ^ j8) | (((jLongValue116 | j8116) | jFreeMemory8) ^ j8))) + ((long) (-1453897760));
                    int i451112 = ((int) (j81110 >> 32)) & ((-827560772) + ((~((-631252227) | i77)) * 623) + ((i206 | 262160) * (-623)) + (((~((-1034108239) | i77)) | 631252226 | (~(403118172 | i77))) * 623));
                    int i451113 = ~(i206 | 2100271662);
                    int i451114 = ((int) j81110) & ((((1342802440 | i451113) * (-374)) - 1565934975) + ((i451113 | 757469222) * 374));
                    i38 = (i451112 & i451114) | (i451112 ^ i451114);
                }
                if (i38 != 1986687685) {
                    i28 = i77;
                    strArr5 = strArr4;
                    i39 = i33;
                } else {
                    i28 = i77;
                    strArr5 = strArr4;
                    i39 = i33;
                }
                int i451115 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr81110 = new Object[1];
                a(((i451115 | 1950) << 1) - (i451115 ^ 1950), '=' - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(0, 0), objArr81110);
                int offsetAfter4 = TextUtils.getOffsetAfter(str6, 0);
                int i451116 = (offsetAfter4 & 1963) + (offsetAfter4 | 1963);
                int i451117 = -(Process.myTid() >> 22);
                int i451118 = (i451117 & 5) + (i451117 | 5);
                int i451119 = b + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i451119 % 128;
                int i461110 = i451119 % 2;
                Object[] objArr81111 = new Object[1];
                a(i451116, i451118, (char) (54525 - (~Color.argb(0, 0, 0, 0))), objArr81111);
                String[] strArr117 = {(String) objArr81110[0], (String) objArr81111[0]};
                int maxKeyCode10 = KeyEvent.getMaxKeyCode() >> 16;
                Object[] objArr81112 = new Object[1];
                a((maxKeyCode10 & 1968) + (maxKeyCode10 | 1968), TextUtils.lastIndexOf(str6, '0', 0) + 16, (char) (Process.myTid() >> 22), objArr81112);
                String str3111 = (String) objArr81112[0];
                int i461111 = 1982 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                int i461112 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr81113 = new Object[1];
                a(i461111, (i461112 ^ 19) + ((i461112 & 19) << 1), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr81113);
                String str3112 = (String) objArr81113[0];
                int i461113 = 2001 - (~View.getDefaultSize(0, 0));
                int i461114 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                int i461115 = ((i461114 | 14) << 1) - (i461114 ^ 14);
                int i461116 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr81114 = new Object[1];
                a(i461113, i461115, (char) (((i461116 | 20937) << 1) - (i461116 ^ 20937)), objArr81114);
                int i461117 = -(-Drawable.resolveOpacity(0, 0));
                Object[] objArr81115 = new Object[1];
                a(((i461117 | 2016) << 1) - (i461117 ^ 2016), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21, (char) (Process.myPid() >> 22), objArr81115);
                String str3113 = (String) objArr81115[0];
                int iIndexOf116 = 2037 - TextUtils.indexOf(str6, str6, 0);
                int iRed11 = 10 - Color.red(0);
                int i461118 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr81116 = new Object[1];
                a(iIndexOf116, iRed11, (char) ((i461118 & 42564) + (i461118 | 42564)), objArr81116);
                int i461119 = 2047 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                int iResolveSize8 = View.resolveSize(0, 0);
                int i471110 = (iResolveSize8 * 450) - 4928;
                int i471111 = ~iResolveSize8;
                int i471112 = -(-(((~((i471111 & 11) | (i471111 ^ 11))) | (~(((-12) ^ iResolveSize8) | ((-12) & iResolveSize8) | i28))) * 449));
                int i471113 = (i471110 ^ i471112) + ((i471110 & i471112) << 1);
                int i471114 = ~iResolveSize8;
                int i471115 = (i471113 - (~(-(-((~(i471114 | 11)) * (-1347)))))) - 1;
                int i471116 = ~((i471114 & 11) | (i471114 ^ 11));
                int i471117 = ~(iResolveSize8 | ((-12) ^ i206) | ((-12) & i206));
                int i471118 = -(-(((i471116 & i471117) | (i471116 ^ i471117)) * 449));
                int i471119 = (i471115 & i471118) + (i471118 | i471115);
                int i481110 = -(-View.combineMeasuredStates(0, 0));
                Object[] objArr81117 = new Object[1];
                a(i461119, i471119, (char) ((i481110 ^ 32340) + ((i481110 & 32340) << 1)), objArr81117);
                String str3114 = (String) objArr81117[0];
                int bitsPerPixel7 = 586 - ImageFormat.getBitsPerPixel(0);
                int iIndexOf117 = TextUtils.indexOf(str6, str6, 0);
                int i481111 = ((iIndexOf117 | 6) << 1) - (iIndexOf117 ^ 6);
                int i481112 = -View.resolveSizeAndState(0, 0, 0);
                Object[] objArr81118 = new Object[1];
                a(bitsPerPixel7, i481111, (char) ((i481112 ^ 39532) + ((i481112 & 39532) << 1)), objArr81118);
                int touchSlop7 = 2058 - (ViewConfiguration.getTouchSlop() >> 8);
                int longPressTimeout9 = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int i481113 = -Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr81119 = new Object[1];
                a(touchSlop7, longPressTimeout9, (char) (((i481113 | 3641) << 1) - (i481113 ^ 3641)), objArr81119);
                String str3115 = (String) objArr81119[0];
                int i481114 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i481115 = (i481114 & 2037) + (i481114 | 2037);
                int maximumDrawingCacheSize4 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                int i481116 = ((maximumDrawingCacheSize4 | 10) << 1) - (maximumDrawingCacheSize4 ^ 10);
                c3 = 0;
                Object[] objArr9116 = new Object[1];
                a(i481115, i481116, (char) (42564 - (~TextUtils.indexOf((CharSequence) str6, '0', 0))), objArr9116);
                strArr6 = new String[][]{strArr117, new String[]{str3111, str3112, (String) objArr81114[0]}, new String[]{str3113, (String) objArr81116[0]}, new String[]{str3114, (String) objArr81118[0]}, new String[]{str3115, (String) objArr9116[0]}};
                i40 = 0;
                i41 = 5;
                i42 = -1;
                loop7: while (true) {
                    if (i40 < i41) {
                        str10 = str6;
                        i43 = i28;
                        break;
                    }
                    String[] strArr118 = strArr6[i40];
                    str14 = strArr118[c3];
                    i55 = 1;
                    strArr7 = (String[]) Arrays.copyOfRange(strArr118, 1, strArr118.length);
                    length2 = strArr7.length;
                    i56 = 0;
                    while (i56 < length2) {
                        int i481117 = (i42 ^ 114) + ((i42 & 114) << i55);
                        i42 = (i481117 & (-113)) + (i481117 | (-113));
                        Object[] objArr9117 = {str14, strArr7[i56]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char c112 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int mirror16 = 2433 - AndroidCharacter.getMirror('0');
                            int pressedStateDuration7 = 32 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            byte b41110 = (byte) 0;
                            byte b41111 = (byte) (b41110 - 1);
                            Object[] objArr9118 = new Object[1];
                            c(b41110, b41111, (byte) (-b41111), objArr9118);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c112, mirror16, pressedStateDuration7, -1207062455, false, (String) objArr9118[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue117 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9117)).longValue();
                        long j81111 = 1937243375;
                        str15 = str14;
                        long j9114 = 623;
                        long j9115 = jLongValue117 ^ j8;
                        long j9116 = j9115 | j81111;
                        str10 = str6;
                        j9 = (((long) 624) * j81111) + (((long) (-622)) * jLongValue117) + (((j9116 | j) ^ j8) * j9114) + (((long) (-623)) * (j34 | (((j81111 ^ j8) | jLongValue117) ^ j8))) + (j9114 * ((j9116 ^ j8) | ((j9115 | j) ^ j8) | ((j81111 | j) ^ j8))) + ((long) 39799953);
                        int i481118 = ~Process.myPid();
                        i57 = ((int) (j9 >> 32)) & ((((-1453537304) + (((~(175994551 | i481118)) | (-1613220963)) * (-933))) + (((~(i481118 | (-1613220963))) | 2442274) * 933)) - 1284482807);
                        iNextInt = new Random().nextInt(1982938085);
                        if (((((int) j9) & ((-420073766) + (((~(997543263 | (~iNextInt))) | 439683146) * (-591)) + ((iNextInt | 997543263) * 591))) | i57) != 0) {
                            DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            i43 = ((i42 & 170) + (i42 | 170)) ^ i28;
                            break loop7;
                        }
                        int i481119 = ((i56 | (-110)) << 1) - (i56 ^ (-110));
                        i56 = (i481119 & 111) + (i481119 | 111);
                        strArr7 = strArr7;
                        str14 = str15;
                        strArr6 = strArr6;
                        length2 = length2;
                        str6 = str10;
                        i55 = 1;
                    }
                    i40 = (i40 & 1) + (i40 | 1);
                    strArr6 = strArr6;
                    c3 = 0;
                    i41 = 5;
                }
                int i491110 = i28 ^ i39;
                int i491111 = -i491110;
                int i491112 = ((i491110 & i491111) | (i491110 ^ i491111)) >> 31;
                int i491113 = i43 & (~i491112);
                int i491114 = i39 & i491112;
                int i491115 = (i491113 ^ i491114) | (i491114 & i491113);
                str11 = str10;
                int iIndexOf118 = TextUtils.indexOf(str11, str11, 0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i491116 = iIndexOf118 * (-381);
                int i491117 = (i491116 ^ 400512) + ((i491116 & 400512) << 1);
                int i491118 = ~iIndexOf118;
                int i491119 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault17 ^ 2086) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault17 & 2086));
                Object[] objArr921 = new Object[1];
                a((((i491117 + (i491118 * (-191))) + (((iIndexOf118 & i491119) | (iIndexOf118 ^ i491119)) * 191)) - (~(((~(i491118 | 2086)) | (~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | 2086))) * 191))) - 1, 13 - (~(-(-Process.getGidForName(str11)))), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr921);
                str13 = (String) objArr921[0];
                Object[] objArr9119 = new Object[1];
                a(2098 - (~(-KeyEvent.getDeadChar(0, 0))), 7 - TextUtils.indexOf((CharSequence) str11, '0', 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9119);
                bytes = ((String) objArr9119[0]).getBytes();
                length = bytes.length;
                if (length == 0) {
                    i44 = i28 ^ 150;
                } else {
                    bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str13));
                    i48 = 4096;
                    bArr5 = new byte[4096];
                    i49 = 0;
                    while (true) {
                        i50 = bufferedInputStream5.read(bArr5, 0, i48);
                        if (i50 > 0) {
                            break;
                            break;
                        }
                        int i501110 = b + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i501110 % 128;
                        int i501111 = i501110 % 2;
                        DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        i51 = 0;
                        while (i49 < length) {
                            if (bArr5[i51] == bytes[i49]) {
                                if (i49 != 0) {
                                    i52 = (-2) - (i49 ^ (-1));
                                    while (true) {
                                        if (i52 > 0) {
                                            i49 = 0;
                                            break;
                                            break;
                                        }
                                        i53 = 0;
                                        while (true) {
                                            if (i53 < i52) {
                                                i49 = i52;
                                                break;
                                                break;
                                            }
                                            int i501112 = -i52;
                                            i54 = (i49 & i501112) + (i501112 | i49);
                                            if (bytes[i53] != bytes[((i54 | i53) << 1) - (i54 ^ i53)]) {
                                                break;
                                            }
                                            i53 = ((i53 & 1) << 1) + (i53 ^ 1);
                                        }
                                        i52 = (-2) - (~i52);
                                    }
                                }
                            } else {
                                i49 = (i49 | 1) + (i49 & 1);
                            }
                            i51 = ((i51 | 1) << 1) - (i51 ^ 1);
                        }
                        i48 = 4096;
                    }
                    if (i49 == length) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bufferedInputStream5.close();
                    if (z) {
                        i44 = i28 ^ 150;
                    } else {
                        i44 = i28;
                    }
                }
                int i501113 = i28 ^ i491115;
                int i501114 = -i501113;
                int i501115 = ((i501113 & i501114) | (i501113 ^ i501114)) >> 31;
                int i501116 = i44 & (~i501115);
                int i501117 = i491115 & i501115;
                int i501118 = (i501116 & i501117) | (i501116 ^ i501117);
                int i501119 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i511110 = ((i501119 | 123) << 1) - (i501119 ^ 123);
                b = i511110 % 128;
                int i511111 = i511110 % 2;
                bitsPerPixel = 2106 - ImageFormat.getBitsPerPixel(0);
                int i511112 = -View.MeasureSpec.getSize(0);
                i45 = ((i511112 | 47) << 1) - (i511112 ^ 47);
                int i511113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                i46 = (i511113 & 83) + (i511113 | 83);
                b = i46 % 128;
                if (i46 % 2 == 0) {
                    Object[] objArr91110 = new Object[1];
                    a(bitsPerPixel, i45, (char) (46557 / TextUtils.indexOf((CharSequence) str11, (char) 26)), objArr91110);
                    str12 = (String) objArr91110[0];
                    i47 = 0;
                } else {
                    int i511114 = -TextUtils.indexOf((CharSequence) str11, '0');
                    char c113 = (char) ((i511114 ^ 46557) + ((46557 & i511114) << 1));
                    Object[] objArr91111 = new Object[1];
                    a(bitsPerPixel, i45, c113, objArr91111);
                    i47 = 0;
                    str12 = (String) objArr91111[0];
                }
                Object[] objArr91112 = {str12};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char deadChar4 = (char) KeyEvent.getDeadChar(i47, i47);
                    int iIndexOf119 = TextUtils.indexOf(str11, str11) + 993;
                    int i511115 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7;
                    byte b41112 = (byte) 0;
                    byte b41113 = (byte) (b41112 - 1);
                    Object[] objArr91113 = new Object[1];
                    c(b41112, b41113, (byte) (b41113 + 1), objArr91113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(deadChar4, iIndexOf119, i511115, 349342683, false, (String) objArr91113[0], new Class[]{String.class});
                }
                long jLongValue118 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr91112)).longValue();
                long j9117 = -710532123;
                long j9118 = -712;
                long j9119 = jLongValue118 ^ j8;
                long j91110 = (j34 | j9117) ^ j8;
                long j91111 = (((long) (-711)) * j9117) + (((long) 713) * jLongValue118) + ((((j9119 | j9117) ^ j8) | j91110) * j9118) + (j9118 * ((((j9119 | j34) | j9117) ^ j8) | (((jLongValue118 | j9117) | j) ^ j8))) + (((long) 712) * (j9119 | j91110)) + ((long) (-136546482));
                int i511116 = ((int) (j91111 >> 32)) & (112162949 + (((~(1045118418 | i206)) | (-1812622467)) * (-602)) + (((~(1045118418 | i28)) | (-2118876627) | (~(i206 | (-738864259)))) * (-301)) + ((~(i206 | (-1812622467))) * 301));
                int i511117 = ((int) j91111) & ((-1648223513) + ((1233496469 | i28) * 614) + (((~(1309867659 | i206)) | 25493780 | (~(i206 | (-127358751)))) * (-1228)) + (((~(1335361439 | i206)) | (~(i206 | (-101864971)))) * 614));
                int i511118 = ((i511116 & i511117) | (i511116 ^ i511117)) * 263;
                int i511119 = (i511118 & i206) | ((~i511118) & i28);
                int i52110 = (~(i28 & i501118)) & (i28 | i501118);
                int i52111 = -i52110;
                int i52112 = ((i52110 & i52111) | (i52110 ^ i52111)) >> 31;
                int i52113 = i511119 & (~i52112);
                int i52114 = i501118 & i52112;
                i23 = (i52114 & i52113) | (i52113 ^ i52114);
                strArr2 = strArr5;
                i29 = 5;
            } else {
                i28 = i77;
                i29 = 5;
                strArr2 = null;
            }
            Object[] objArr1519 = new Object[i29];
            objArr1519[0] = new int[1];
            objArr1519[1] = new int[]{i23};
            objArr1519[3] = new int[]{i28};
            int i6814 = (~(i28 & i23)) & (i28 | i23);
            int i6815 = -i6814;
            int i6816 = (((i6814 & i6815) | (i6814 ^ i6815)) >> 31) & 16;
            int i6817 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            b = i6817 % 128;
            int i6818 = i6817 % 2;
            objArr1519[4] = strArr2;
            objArr1519[2] = null;
            int iFreeMemory5 = (int) Runtime.getRuntime().freeMemory();
            int i6819 = ~((-37781789) | iFreeMemory5);
            int i6910 = ~iFreeMemory5;
            int i6911 = 1708380563 + ((i6819 | (~((-1077152801) | i6910))) * 920) + (((~((-659145056) | i6910)) | 37781788) * 920) + (((~(iFreeMemory5 | (-1077152801))) | (~((-37781789) | i6910)) | (~((-621363268) | iFreeMemory5))) * 920);
            int i6912 = -(-i6816);
            int i6913 = i3 + (i6911 ^ i6912) + ((i6912 & i6911) << 1);
            int i6914 = i6913 << 13;
            int i6915 = (i6913 | i6914) & (~(i6913 & i6914));
            int i6916 = i6915 >>> 17;
            int i6917 = ((~i6915) & i6916) | ((~i6916) & i6915);
            int i6918 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i6919 = ((i6918 | 91) << 1) - (i6918 ^ 91);
            b = i6919 % 128;
            int i7010 = i6919 % 2;
            ((int[]) objArr1519[0])[0] = i6917 ^ (i6917 << 5);
            return objArr1519;
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("\u0093Ú\u008c\u0094\u00ad\u009aÎ\u008cïÎ\b\u008b)\u0084Jºk¹\u0084¾¥®Æ±ç¡\u0000ë!ÒBÚcÁ\u009cÒ½ÊÞÙÿâ\u0018Ã9èZö{ì\u0094ëµ\u0012+\u00024L\u0015BvTW\u0016°S\u0091\\òbÓa<f\u001dv~i_y¸3\u0099\u001bú\u000fÛ\r$\u001d\u0005(f\u0016G9 6\u0081 â*Ã1±³®ý\u008fóìåÍ§*â\u000bíhÓIÐ¦×\u0087ÇäØÅÈ\"\u0082\u0003©`®A¢¾ª±³®ê\u008fïìàÍ§*è\u000bíhÛIÁ¦Ý\u0087Ëä\u0084ÅÇ\"²\u0003¶`³Aª¾ \u009fµü«Ý§:\u0097\u001b\u0093x\u009bY\u0090¶\u0084\u0097lôb!º>õ\u001fë|ù]®ºè\u009bìø\u0098ÙÍ6Ê\u0017ÈtÒ±³®ü\u008fâìðÍ§*ö\u000bëhÒI\u009a¦Á\u0087ÜäÄÅÐ]¥Bücä\u0000æ!ÿÆáçð\u0084\u0086¥ðJákõ\bÒ)ÀÎ®ï\u0088\u008c \u00ad®R¾±³®ý\u008f÷ìçÍé*ª\u000b¬hÜIÄ¦Ä\u0087ÇäÅÅÆ\"²±î®ö\u008f¸ìñÍç*ê\u000böh\u0091IÆ¦Ô\u0087ÊäÙÅÏ\"´\u0003¾`\u0088A¢¾¬\u009f²ü\u009cÝ\u009c:\u009b\u001b\u0081xÞ\"ù=á\u001c¯\u007fæ^ð¹ý\u0098áû\u0086ÚÑ5Ã\u0014ÝwÎVØ±£\u0090©ó\u009fÒµ-»\f¥o\u008bN\u008b©\u008c\u0088\u0096ëÊ\u0085Ë\u009a\u0092»\u0097Ø\u0098ù\u0084\u001e\u0098?\u0097\\è} \u0092 ³´Ðüñ´\u0016Ì7ÀTÁuÖ\u008a\u009f«ÍÈÔ±þ®ð\u008fñìýÍç*ý±³®ê\u008fïìàÍü*à\u000bïh\u0090IÖ¦Ø\u0087Àä\u0084ÅÎ\"¸\u0003·`¢A\u009a¾\u0084\u009fëü\u00adÝ\u009d:\u0098\u001b\u0087xÂY\u0087¶\u008e\u0097pôoÕb2b\u0013f±³®ê\u008fïìàÍü*à\u000bïh\u0090IÖ¦Ø\u0087Àä\u0084ÅÎ\"¸\u0003·`¢A\u009a¾\u0084\u009fëü³Ý\u008a:\u009a\u001b\u0082ÇòØ«ù®\u009a¡»½\\¡}®\u001eÑ?\u0099Ð\u0099ñ\u008d\u0092Å³\u008dTõuù\u0016ø7èÈåéò\u008aÔ«ôLÄmÁ\u000eÁ/ÕÀ\u008eá,\u00825±³®ý\u008fóìåÍ§*ë\u000bçhÒIÁ¦Ö\u0087ÛäÎÅÓ\"©\u00932\u008c*\u00addÎ-ï!\b0)2J\u0007kF\u0084\u0005¥\u001dÆ\u0004ç\b±ò®ü\u008f÷ìàÍí*«\u000bìhÚIÀ±³®é\u008fäìüÍë*ª\u000bähÖIØ¦Ô\u0087ÝäÒÅÓ\"©\u0003¿`ºA¿±ò®ü\u008fûìæÍû*ãÙýÆåç«\u0084ð¥éBùcõ\u0000Ù!ÄÎÖï\u0093\u008cÕ\u00adÒJ k¼\b¢)¾Ö¹÷¡\u0094¥µ\u0099R\u0083s\u0093\r\u008a\u0012\u008d3\u0089P\u009b±ì®ü\u008fäìàÍá*ö\u000böh\u0091IÇ¦È\u0087Ýä\u0085ÅÂ\"¹\u0003ô`³A©¾«\u009f³ü¤ÝÖ:\u0092\u001b\u0082x\u009aYÊ¶\u0087\u0097\u007fôpÕu2R\u0013mpwQINf¯D\u008cVíFÊA+G\b-i1F#±ì®ü\u008fäìàÍá*ö\u000böh\u0091IÇ¦È\u0087Ýä\u0085ÅÂ\"¹\u0003ô`³A©¾«\u009f³ü¤ÝÖ:\u0092\u001b\u0082x\u009aYÊ¶\u0087\u0097\u007fôpÕu2R\u0013mpwQINf¯@\u008cVíFÊA+M\b-¬\u0097³\u0087\u0092\u009fñ\u009bÐ\u009a7\u008d\u0016\u008duêT¼»³\u009a¦ùþØ¹?Â\u001e\u008f}È\\Ò£Ð\u0082ÈáßÀ\u00ad'ü\u0006æeºDü«ë\u008a\f±ì®ü\u008fäìàÍá*ö\u000böh\u0091IÇ¦È\u0087Ýä\u0085ÅÂ\"¹\u0003ô`³A©¾«\u009f³ü¤ÝÖ:\u0087\u001b\u009dxÁY\u0088¶\u0080\u0097}±ì®ü\u008fäìàÍá*ö\u000böh\u0091IÇ¦È\u0087Ýä\u0085ÅÂ\"¹\u0003ô`³A©¾«\u009f³ü¤ÝÖ:\u0087\u001b\u009dxÁY\u0089¶\u0082\u0097}±ì®ü\u008fäìàÍá*ö\u000böh\u0091IÇ¦È\u0087Ýä\u0085ÅÂ\"¹\u0003ô`³A©¾«\u009f³ü¤ÝÖ:\u0087\u001b\u009dxÁY\u0089¶\u008f\u0097}+\u00864\u0097\u0015\u0095v\u0087W\u0097°\u008f±³®é\u008fäìüÍë*ª\u000bïhÐIÐ¦Ä\u0087ÂäÎÅÓ\u0018u\u0007d&fEtdp\u0083o¢xÁSà_±³®ê\u008fïìàÍü*à\u000bïh\u0090IÒ¦Ã\u0087ÏäÆÅÅ\"ª\u0003µ`¥A§¾æ\u009f±üªÝ\u0096:\u0091\u001b\u009dx\u0098Y\u0097¶Ì\u0097môbÕc2y\u0013opjQcNJ¯S\u008cAí^Ê@+P\bqi>F0§<±³®ï\u008fóìýÍì*ê\u000bðh\u0090IØ¦Ø\u0087Ìä\u009dÅ\u0094\"ò\u0003²` Aã¾¨\u009f³ü§Ý\u0091:\u009a\u001bÜx\u009fY\u0096¶\u0088\u0097sôzÕb2t\u0013$ppQUNW¯R\u008c\\í_ÊV+\f\b,i;\u008dÔ\u0092\u0088³\u0094Ð\u009añ\u008b\u0016\u008d7\u0097T÷u¿\u009a¿»«Øúùó\u001e\u0095?Õ\\Ç}\u0084\u0082Æ£ÖÀÇáð\u0006ÿ'åDçeð\u008aã«\u000bÈRé\u0000\u000e\u0003/\u0003L\u0004m4r)\u0093\"°zÑ<ö-|ac8B=!2\u0000.ç2Æ=¥B\u0084\nk\nJ\u001e)O\bFï Îk\u00adi\u008cqsnRp1N\u0010K÷NÖDµQ\u0094i{ZZ¢9½\u0018§ÿ\u00adÞ¾½´\u009c\u008d\u0083\u008ebÉA\u0082 \u008a\u0007\u0087æÞÅþ¤é\"l=#\u001c=\u007f/^x¹3\u00983û\tÚ\u001f5A\u0014\u0018w\u001aV\u0016±v\u0090+ókÒ\u007f-y\floxNT©O\u0088_ëFÊR%]\u0004¤gêF½¡±\u0015\u0080\n§+£H±i¾\u008e±¯\u00adÌ\u008dí\u0080\u0002\u0084±é®÷\u008fýìýÍç*ò\u000bì±ÿ®ñ\u008fäìüÍå*ì\u000b÷hÒÄ\u0095Û\u008dúÃ\u0099\u0098¸\u0081_\u0091~\u009d\u001d±<¬Ó¾òû\u0091´°¾WÐvÈ\u0015Ï4Ò·(¨9\u0089;ê)Ër,q\r0±û®ü\u008føìöÍú*ì\u000báÊVÕQôU\u0097[¶WQApL\u0013M2aÝ$ü5±û®ü\u008føìöÍú*ì\u000báhàIÌ¦\u0089\u0087\u0098äôÅ\u0096\"é±î®ö\u008f¸ìãÍú*ê\u000bæhÊI×¦Å\u0087\u0080äÆÅÏ\"¹\u0003¿`»±ï®ý\u008fý±ù®ô\u008fãìÿÍé*ñ\u000bíhÍ±Ý®é\u008fæì³ÍÚ*ð\u000bìhËIÝ¦Ü\u0087Ëä\u008bÅÆ\"²\u0003¨`÷A\u008f¾¡\u009f´ü¬Ý\u0095:\u0090¦o¹E\u0098@ûSÚU=^\u001cT\u007f-^U±G\u0090Wó9Òp5\u001a\u0014\u0001w\tV\n©[\u0088\u0012ë\u001eÊ8-g\f8oeN`ÚëÅÁäÄ\u0087×¦ÑAÚ`Ð\u0003©\"ÑÍÃìÓ\u008f½®ôI\u009eh\u0085\u000b\u008d*\u008eÕßô\u0096\u0097\u009a¶¼Qãp¼\u0013á2äÝ\u0088ü\u001e\u009f\u00195Q*I\u000b\u0007hDIV®H\u008fYìwÍj\"|\u0003t\u008bo\u0094bµnÖc÷z\u0010x1eRC±ê®û\u008fùìëÍ°*³±î®ø\u008føìðÍà*ðc\u0016|\u000e]@>\u001b\u001f\u0002ø\u0012Ù\u001eº2\u009b/t=Ux61\u0017*ðDÑL²KTPKHj\u0006\tF(SÏIîR\u008dd¬fC!ba\u0001p sÇ\u0016±\u00ad±î®ö\u008f¸ìàÍí*æ\u000b÷hÍIÑp}±î®ö\u008f¸ìñÍý*ì\u000bîhÛI\u009a¦Á\u0087ÜäÄÅÄ\"¨\u0003¹`£\u0089t\u0096b·tÔqõY\u0012s34P\u0007±î®ö\u008f¸ìñÍý*ì\u000bîhÛI\u009a¦×\u0087ÇäÅÅÇ\"¸\u0003¨`§A¾¾ \u009f¨ü·±û®ü\u008føìöÍú*ì\u000báh\u0090IÇ¦Õ\u0087Åä\u0084ÅÇ\"¸\u0003´`²A¾¾ \u009f¥cF|A]E>K\u001fGøQÙ\\º]\u009bqt4U%69\u0017nð\u0004Ñ\f²5\u0093\tlLMM.Q\u000f\"è-É!ª7\u008b+d5EÀ&ù\u0007Õà\u0088Á\u0081\u0003©\u001c®=ª^¤\u007f¨\u0098¾¹³ÚÂû\u0081\u0014\u008c5\u0093V\u009ew\u009e\u0090ê±×Òöóú\fð-»NöoÏ\u0088É©ÅÊÏëß\u0004Ð±û®ü\u008føìöÍú*ì\u000báh\u0090IÂ¦Ó\u0087ÁäÓÅ\u0098\"ë\u0003ª`øAº¾«\u009f©ü»ÝÀ:Ã\u001b\u0082±û®ö\u008fùìôÍä*à\u000b\u00adhÌIÐ¦Ú\u0087ñäÌÅÐ\"µ\u0003µ`¹A©¾\u0096\u009f¾üûÝÎ:Ú\u001b\u0095x\u008aY\u008a¶\u0084\u0097lôrÕs2R\u0013rp?Q\n±î®ö\u008f¸ìñÍç*ê\u000böhÓIÛ¦Ð\u0087ÊäÎÅÒ\u0081\u001d\u009e\u0005¿KÜ\u0002ý\u0014\u001a\u0019;\u0005X%y*\u0096#·:Ô=õ}\u0012L3\\PMqS\u008e^¯\u001bÌVíb\nh+fHyie\u0086b§\u009fÄ\u0081å\u008d\u0002\u008a\u0085¤\u009a\u008e»\u008bØ\u0098ù\u009e\u001e\u0095?\u009f\\ë}µ\u0092ð³á±î®ö\u008f¸ìñÍý*ì\u000bîhÛI\u009a¦Õ\u0087ÇäØÅÐ\"±\u0003»`®Aâ¾ \u009f¢à-ÿ9Þ ½\"\u009c`±õ®÷\u008fÿìçÍ¦*ö\u000bôhÜI\u009a¦À\u0087ËäÆÅÕ\"ð\u0003ª`¥A£¾¹\u009fµ±í®ü\u008fûìæÍ¦*í\u000bõh\u0091IÙ¦Ð\u0087ÇäÅÅË\"¸\u0003£`¤±í®ü\u008fûìæÍ¦*ö\u000bäh\u0091IÒ¦Ð\u0087ÅäÎÅÿ\"¾\u0003»`ºA©¾»\u009f§£·¼¦\u009d¡þ¼ßü8¬\u0019¾zË[\u0082´\u0088\u0095\u0090ö®×\u009e0â\u0011îrþSÿ¬ç\u008då\"c={\u001c5\u007fu^`¹z\u0098aûWÚU5\u0012\u0014BwHVI±\"\u00908ó3Ò%-j\f:o+N\u0018©\r\u0088\u001bÐ\u0018Ï\u0000îN\u008d\u0007¬\u0011K\u001cj\u0000\tg(3Ç\"æ5\u0085(¤xCJbZ\u0001E eßQþQ\u009dX¼k±î®ö\u008f¸ìüÍì*è\u000b¬hÝIÁ¦Ø\u0087ÂäÏÅ\u008e\"»\u0003³`¹A«¾¬\u009f´ü³Ý\u008a:\u009c\u001b\u009cx\u009b±î®ö\u008f¸ìãÍú*ê\u000bæhÊI×¦Å\u0087\u0080äÉÅÕ\"´\u0003¶`³Aâ¾¯\u009f¯ü\u00adÝ\u009f:\u0090\u001b\u0080x\u009fY\u0096¶\u0088\u0097pôoBD]\\|\u0012\u001fJ>[Ù\\ø\\\u009bpºsU5tf\u0017t6cÑ\u001bð\u0014\u0093S²\u0000M\nl\u0002\u000f\u000e.7É-è(\u008b7ª'E%dÀ±î®ö\u008f¸ìàÍñ*ö\u000böhÚIÙ¦î\u0087ËäÓÅÔ\"ó\u0003¸`¢A¥¾¥\u009f¢üíÝ\u009e:\u009c\u001b\u009cx\u0088Y\u0081¶\u0093\u0097nôiÕy2c\u0013~±î®ö\u008f¸ìåÍí*ë\u000bæhÐIÆ¦\u009f\u0087ÌäÞÅÉ\"±\u0003¾`ùAª¾ \u009f¨ü¤Ý\u009d:\u0087\u001b\u0082x\u009dY\u008d¶\u008f\u0097j±î®ö\u008f¸ìåÍí*ë\u000bæhÐIÆ¦î\u0087ÊäÇÅË\"°\u0003ô`µA¹¾ \u009fªü§ÝÖ:\u0093\u001b\u009bx\u0081Y\u0083¶\u0084\u0097lôkÕb2d\u0013dps\u0018×mÉrÀ1S±µ\\ÃC\u008db\u0083\u0001\u0095 ×Ç\u0084æ\u0097\u0085¢¤±K\u009ej®\t²( ÏÈ±³®ý\u008fóìåÍ§*ö\u000bíhÜIß¦Ô\u0087Úä\u0084ÅÂ\"¼\u0003©`²A®¾¨\u009f¨ü§Ý§:\u0092\u001b\u0097x\u0081Y\u009d¶\u0085þPá\u001eÀ\u0010£\u0006\u0082De\u0015D\u000e'?\u0006<é7È9«g\u008a$m[LW/M\u000eKÿÄà\u008aÁ\u0084¢\u0092\u0083Ðd\u0081E\u009a&«\u0007¨è£É\u00adªó\u008b¦lÏMÀ.Õ\u000fßMàR¹s¼\u0010³1ôÖ§÷´\u0094\u0081µ\u0092Z½{\u0089\u0018\u008a9\u0092ÞíÿìëÛô\u0082Õ\u0087¶\u0088\u0097\u0094p\u0088Q\u00872ø\u0013°ü°Ý¤¾ì\u009f¤xÜYÐ:Ü\u001bûäÌÅÏ¦Ç\u0087ü`òAù\"Ø\u0003èììÍ\u0014®\u0006\u008f\u001fh:I\u0013*\n\u000b9\u0014$õpÖ(·/±³®ý\u008fóìåÍ§*ç\u000bñhËIë¦Ö\u0087ÞäØÉ\u0080ÖÎ÷À\u0094Öµ\u0094RÔsÂ\u0010ø1ØÞöÿô\u009cõ½ö±³®ý\u008fóìåÍ§*ö\u000bíhÜIß¦Ô\u0087Úä\u0084ÅÂ\"®\u0003®`±A£¾¥\u009f¢ü¦Ý\u008a:\u0091D³[êzï\u0019à8üßàþï\u009d\u0090¼ØSØrÌ\u0011\u00840Ì×´ö¸\u0095µ´¿K½j \t¬(\u0094Ï\u0091î\u0097\u008d\u009d¬»C\u008bbp\u0001r >Ç~æe±³®ý\u008fóìåÍ§*ç\u000bñhËIÕ¦Ò\u0087ÍäÎ,½3ó\u0012ýqëP©·é\u0096ÿõÅÔÝ;Æ\u001aÒyÊ±³®ý\u008fóìåÍ§*ç\u000bñhËIÙ¦Ô\u0087ÉäÅ±³®ý\u008fóìåÍ§*ç\u000bñhËIÛ¦Ã\u0087ÇäÎ±³®ý\u008fóìåÍ§*ç\u000bñhËIÂ¦Ü\u0087ÝäÌe`z.[ 86\u0019tþ4ß\"¼\u0018\u009d\u0017r\u0005S\u001c0\u0011\u0011\u0003öm±³®ý\u008fóìåÍ§*ç\u000bñhËIë¦Ø\u0087ÃäÎ±³®ý\u008f÷ìçÍé*ª\u000bæhÐIÃ¦ß\u0087ÂäÄÅÁ\"¹\u0003©`øAâ¾±\u009f¤üìÝ\u009a:\u0086\u001b\u0086x\u0084±³®ô\u008føìçÍ§*ò\u000bëhÑIÐ¦Þ\u0087ÙäØÅ\u008f\"\u009f\u0003©`£A\u009f¾¡\u009f§ü±Ý\u009d:\u0091\u001b´x\u0080Y\u0088¶\u0085\u0097{ôi±³®é\u008fäìüÍë*ª\u000bëhÐIÄ¦Þ\u0087ÜäßÅÓeRz\u0001[\u000e8M\u0019L±³®é\u008fäìüÍë*ª\u000bñhÚIØ¦×\u0087\u0081äÆÅÁ\"\u00ad\u0003©±û®ë\u008f÷ìÿÍä*ê\u000báh\u0091IÓ¦Þ\u0087ÂäÏÅÆ\"´\u0003©`¿Aâ¾º\u009f©à9ÿ9Þ=½\u001d\u009c\r{\tZ\u00189)\u0018\u001f÷\u000bÖ\u0013µL\u0094\u001as{±³®ü\u008fâìðÍ§*è\u000bçhÛIÝ¦Ð\u0087ñäÈÅÏ\"¹\u0003¿`´A¿¾ç\u009f¾ü®Ý\u0094\u0017º\b±)§J²k¿\u008cµ\u00ad§Î\u0098ï\u009b\u0000\u0086ÏçÐ¨ñ¶\u0092¤³óT¼u¹\u0016\u009e7\u008eØ\u0091ù\u0089¿\u008a Ä\u0081ÎâÞÃÐ$\u0093\u0005ßféGú¨æ\u0089ûêýËø,\u0080\r\u0090nÁOÛ°\u0094\u0091\u008fòÕÓ 4¼\u0015»v¥Wó¸ \u0099JúN±³®é\u008fäìüÍë*ª\u000báhÏIÁ¦Ø\u0087ÀäÍÅÏ±Û®ö\u008fúì÷Íî*ì\u000bñh×\u0004m\u001b#:)Y9x7\u009ft¾1Ý\bü\u0019\u0013\f2_Q\u0005p\f\u0097l¶bÕ`ô~\u000br*kI2hE\u008f^®^Í\u001eì\n\u0003\u0010\"£Aª`£\u0087ý¦¹Å°ä\u0081û\u0095\u001a\u00879\u009bX\u009f\u007f\u0089\u009e\u0088½¯Üçóê\u0012ý1àP÷wÎ\u0096Á".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            TuitionPaymentFragmentbindingInflater1 = cArr;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 344202204622335641L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r5, byte r6, int r7) {
            /*
                byte[] r0 = defpackage.unwrap.$$c
                int r7 = r7 * 3
                int r7 = r7 + 109
                int r6 = r6 * 4
                int r6 = 4 - r6
                int r5 = r5 * 3
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L18
                r3 = r6
                r4 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L26:
                r3 = r0[r6]
            L28:
                int r6 = r6 + 1
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.unwrap.$$e(byte, byte, int):java.lang.String");
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getWrite() {
        return R.layout.fragment_employees_complaint;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentEmployeesComplaintBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return EmployeesComplaintFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        asInterface().btnBack.setOnClickListener(new View.OnClickListener() { // from class: DrawableContainerCompatApi21Impl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setTintMode.b(this.TuitionPaymentFragmentbindingInflater1, view);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.b = arguments != null ? arguments.getParcelableArrayList("trackingComplaint") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvTrackingComplaint;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((setEnterFadeDuration) this.TuitionPaymentFragmentbindingInflater1.getValue());
        FragmentEmployeesComplaintBinding fragmentEmployeesComplaintBindingAsInterface = asInterface();
        List<TrackingComplaint> list = this.b;
        if (list == null || list.isEmpty()) {
            fragmentEmployeesComplaintBindingAsInterface.imgEmpty.setVisibility(0);
            fragmentEmployeesComplaintBindingAsInterface.rvTrackingComplaint.setVisibility(8);
            fragmentEmployeesComplaintBindingAsInterface.tvEmptyEmployeeComplaint.setVisibility(0);
            fragmentEmployeesComplaintBindingAsInterface.tvEmptyEmployeeComplaint.setText("Pengaduan ketidaksesuaian data tenaga kerja tidak ditemukan");
            return;
        }
        fragmentEmployeesComplaintBindingAsInterface.imgEmpty.setVisibility(8);
        fragmentEmployeesComplaintBindingAsInterface.tvEmptyEmployeeComplaint.setVisibility(8);
        fragmentEmployeesComplaintBindingAsInterface.rvTrackingComplaint.setVisibility(0);
        ((setEnterFadeDuration) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
    }

    /* JADX INFO: renamed from: setTintMode$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LsetTintMode$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "Lcom/bpjstku/domain/complaint/model/TrackingComplaint;", "p0", "LsetTintMode;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/util/List;)LsetTintMode;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setTintMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<TrackingComplaint> p0) {
            setTintMode settintmode = new setTintMode();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("trackingComplaint", (ArrayList) p0);
            settintmode.setArguments(bundle);
            return settintmode;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ setEnterFadeDuration TuitionPaymentFragmentbindingInflater1(final setTintMode settintmode) {
        Context contextRequireContext = settintmode.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setEnterFadeDuration(contextRequireContext, new ArrayList(), new Function1() { // from class: DrawableContainerCompatBlockInvalidateCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (TrackingComplaint) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setTintMode settintmode, TrackingComplaint trackingComplaint) {
        Intrinsics.checkNotNullParameter(trackingComplaint, "");
        unscheduleDrawable.Companion companion = unscheduleDrawable.INSTANCE;
        unscheduleDrawable unscheduledrawableTuitionPaymentFragmentbindingInflater1 = unscheduleDrawable.Companion.TuitionPaymentFragmentbindingInflater1(trackingComplaint.b);
        unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(settintmode.getResources().getDisplayMetrics().heightPixels));
        FragmentManager childFragmentManager = settintmode.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            unscheduledrawableTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, unscheduledrawableTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(setTintMode settintmode, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            BaseActivity baseActivity = settintmode.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }
}
