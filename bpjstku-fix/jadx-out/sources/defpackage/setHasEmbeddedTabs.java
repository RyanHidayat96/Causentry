package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentBpjstkuBranchOfficeMapBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.presentation.branchoffice.BpjstkuBranchOfficeMapFragment$bindingInflater$1;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\r8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010\u001c\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"LsetHasEmbeddedTabs;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentBpjstkuBranchOfficeMapBinding;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "<init>", "()V", "", "g", "cancelAll", "b_", "cancel", "onTransact", "INotificationSideChannel", "Lcom/google/android/gms/maps/GoogleMap;", "p0", "onMapReady", "(Lcom/google/android/gms/maps/GoogleMap;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/google/android/gms/maps/GoogleMap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/domain/branchoffice/model/Office;", "b", "Lcom/bpjstku/domain/branchoffice/model/Office;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1", "", "I", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setHasEmbeddedTabs extends AutoValue_CameraState_StateError<FragmentBpjstkuBranchOfficeMapBinding> implements OnMapReadyCallback {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private GoogleMap TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_bpjstku_branch_office_map;
    private Office b;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
    }

    /* JADX INFO: renamed from: setHasEmbeddedTabs$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LsetHasEmbeddedTabs$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/branchoffice/model/Office;", "p0", "LsetHasEmbeddedTabs;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/branchoffice/model/Office;)LsetHasEmbeddedTabs;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {94, 6, -99, -107};
        private static final int $$f = 214;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {27, -8, 5, 78, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 17, 3, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
        private static final int $$e = 149;
        private static final byte[] $$a = {15, -9, 64, -81, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$b = 225;
        private static int g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1371a = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1747948967;
        private static int b = -1934795641;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 991117755;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {-116, 112, -121, -83, 82, -116, 117, -123, 126, -94, -95, 63, ByteCompanionObject.MIN_VALUE, -59, 78, ByteCompanionObject.MAX_VALUE, 126, 121, -118, 114, -119, -105, 107, -102, 103, 100, -109, 124, -127, -112, -99, 108, 96, -102, 104, -123, 122, 117, -116, -110, 93, -125, -115, 117, -117, 115, -105, -92, -107, 56, -122, -119, -75, 76, 125, 124, 123, -120, 112, -117, -120, 113, -126, 100, -119, -115, -118, -117, 119, 88, -70, 113, 126, -124, 119, -118, 101, -84, 85, -91, 94, -126, -127, 99, 93, -87, 81, -102, 105, 79, -79, 83, 53, -63, 24, -17, -63, 38, 45, -5, 49, 63, -63, 50, Base64.padSymbol, 53, -49, -26, -26, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 84
                int r8 = r8 * 52
                int r0 = 53 - r8
                int r6 = r6 * 52
                int r6 = 55 - r6
                byte[] r1 = defpackage.setHasEmbeddedTabs.Companion.$$a
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L25:
                int r6 = r6 + 1
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setHasEmbeddedTabs.Companion.c(short, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r0 = 53 - r8
                byte[] r1 = defpackage.setHasEmbeddedTabs.Companion.$$d
                int r7 = r7 * 48
                int r7 = 51 - r7
                int r6 = r6 * 15
                int r6 = r6 + 84
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r7
                r7 = r8
                r4 = r2
                goto L31
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L2b
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2b:
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L31:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r7 + 3
                r7 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setHasEmbeddedTabs.Companion.e(short, short, int, java.lang.Object[]):void");
        }

        private Companion() {
        }

        private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                long j = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), Color.green(0) + 2267, View.combineMeasuredStates(0, 0) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                if (z) {
                    int i7 = $10 + 87;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $11 + 69;
                            $10 = i10 % 128;
                            if (i10 % i5 != 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char c = (char) (1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 3358;
                                    int i11 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 18;
                                    byte length2 = (byte) $$c.length;
                                    byte b5 = (byte) (length2 - 4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveSizeAndState, i11, -1054011043, false, $$g(length2, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int packedPositionChild = 3357 - ExpandableListView.getPackedPositionChild(0L);
                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 18;
                                    byte length3 = (byte) $$c.length;
                                    byte b6 = (byte) (length3 - 4);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, packedPositionChild, tapTimeout, -1054011043, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i9++;
                            }
                            i5 = 2;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), View.combineMeasuredStates(0, 0) + 2267, Color.blue(0) + 33, 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i12 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L));
                    if (z) {
                        int i13 = $10 + 57;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i12 + i4;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 1;
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - KeyEvent.normalizeMetaState(0)), ImageFormat.getBitsPerPixel(0) + 2856, 13 - (ViewConfiguration.getPressedStateDuration() >> 16), -1529949196, false, $$g(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i15 = 0; i15 < length4; i15++) {
                            int i16 = $10 + 39;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i18 = $10 + 31;
                        $11 = i18 % 128;
                        if (i18 % 2 == 0) {
                            throw null;
                        }
                        if (z2) {
                            byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0292  */
        public final setHasEmbeddedTabs TuitionPaymentFragmentspecialinlinedviewModeldefault3(Office p0) throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            setHasEmbeddedTabs sethasembeddedtabs = new setHasEmbeddedTabs();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int i2 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i3 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                Object[] objArr3 = new Object[1];
                c(b2, (byte) (bArr[0] - 1), b2, objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i2, i3, 252381699, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr4 = new Object[1];
            d((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1212277508, TextUtils.getOffsetBefore("", 0) - 75, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 98), 461190847 - Drawable.resolveOpacity(0, 0), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1212277512, (-82) - (Process.myPid() >> 22), (short) TextUtils.getOffsetBefore("", 0), (byte) ((-119) - KeyEvent.getDeadChar(0, 0)), 461190868 - Color.red(0), objArr5);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 876;
                int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, offsetBefore, iKeyCodeFromString, 2009631821, false, (String) objArr6[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c2 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int size = 876 - View.MeasureSpec.getSize(0);
                    int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr3 = $$a;
                    Object[] objArr7 = new Object[1];
                    c(bArr3[7], bArr3[10], bArr3[5], objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, size, maxKeyCode, 256017550, false, (String) objArr7[0], null);
                }
                Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                int i4 = (int) Runtime.getRuntime().totalMemory();
                int i5 = ~i4;
                int i6 = (~((-494974392) | i5)) | 75505685;
                int i7 = ~(i4 | (-35195457));
                int i8 = (-710541566) + ((i6 | i7) * (-502)) + ((i7 | (~(i5 | (-419468707)))) * TypedValues.PositionType.TYPE_DRAWPATH) + 1590581441;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr9 = new Object[1];
                d(Color.blue(0) + 1212277508, (-71) - TextUtils.indexOf("", "", 0), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 95), 461190882 - Color.argb(0, 0, 0, 0), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                Object[] objArr10 = new Object[1];
                d(1212277509 - MotionEvent.axisFromString(""), (-79) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (TextUtils.getOffsetAfter("", 0) - 111), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 461190907, objArr10);
                Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i11 = g + 119;
                        f1371a = i11 % 128;
                        int i12 = i11 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            int i13 = f1371a + 35;
                            g = i13 % 128;
                            int i14 = i13 % 2;
                            applicationContext = null;
                        }
                    }
                }
                Object[] objArr11 = new Object[1];
                d((KeyEvent.getMaxKeyCode() >> 16) + 1212277517, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 81, (short) ((-1) - TextUtils.lastIndexOf("", '0')), (byte) (66 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 461190924, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1212277516, (-81) - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-46) - TextUtils.getOffsetAfter("", 0)), 461190939 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                int i15 = g + 101;
                f1371a = i15 % 128;
                int i16 = i15 % 2;
                try {
                    Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 1590581441};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[45];
                    byte b6 = b5;
                    Object[] objArr14 = new Object[1];
                    e(b5, b6, b6, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    byte b7 = (byte) (bArr4[45] - 1);
                    byte b8 = b7;
                    Object[] objArr15 = new Object[1];
                    e(b7, b8, b8, objArr15);
                    Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 876;
                            int gidForName = 9 - Process.getGidForName("");
                            byte[] bArr5 = $$a;
                            Object[] objArr17 = new Object[1];
                            c(bArr5[7], bArr5[10], bArr5[5], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, offsetAfter, gidForName, 256017550, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                        try {
                            Object[] objArr18 = new Object[1];
                            d(TextUtils.indexOf("", "", 0) + 1212277508, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 75, (short) TextUtils.getOffsetAfter("", 0), (byte) (Drawable.resolveOpacity(0, 0) + 98), MotionEvent.axisFromString("") + 461190848, objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            d(1212277512 - ((Process.getThreadPriority(0) + 20) >> 6), (-81) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) View.combineMeasuredStates(0, 0), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 119), KeyEvent.getDeadChar(0, 0) + 461190868, objArr19);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                int i17 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                                int i18 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                byte[] bArr6 = $$a;
                                byte b9 = bArr6[5];
                                byte b10 = bArr6[7];
                                Object[] objArr20 = new Object[1];
                                c(b9, b10, b10, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, i17, i18, 2009631821, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                int i19 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                                int capsMode = 10 - TextUtils.getCapsMode("", 0, 0);
                                byte[] bArr7 = $$a;
                                byte b11 = bArr7[5];
                                Object[] objArr21 = new Object[1];
                                c(b11, (byte) (bArr7[0] - 1), b11, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionType, i19, capsMode, 252381699, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            if (i21 == i20) {
                int i22 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i23 = i22 + 252085446 + (((-813958185) | iIdentityHashCode) * (-381)) + (((~((~iIdentityHashCode) | (-847578729))) | 107551317) * 381) + 880422792;
                int i24 = (i23 << 13) ^ i23;
                int i25 = i24 ^ (i24 >>> 17);
                ((int[]) objArr2[1])[0] = i25 ^ (i25 << 5);
            } else {
                Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
                int i26 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i27 = ~iIdentityHashCode2;
                int i28 = (-1521646458) + (((~((-836485535) | i27)) | 809681170) * (-1188));
                int i29 = (~(iIdentityHashCode2 | 836485534)) | 809681170;
                int i30 = ~(876795763 | i27);
                int i31 = i26 + i28 + ((i29 | i30) * 594) + (((~(836485534 | i27)) | (-903600128) | i30) * 594);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr2[1])[0] = i33 ^ (i33 << 5);
            }
            Bundle bundle = new Bundle();
            int i34 = ((int[]) objArr2[1])[0];
            int i35 = i34 * i34;
            int i36 = -(1561984887 * i34);
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            int i38 = -(i34 * (-1442287749));
            int i39 = ((i37 & i38) + (i38 | i37)) - 1189660879;
            int i40 = i39 >> 27;
            int i41 = (((i40 | (-63)) << 1) - (i40 ^ (-63))) / 32;
            int i42 = ((i41 | 1) << 1) - (i41 ^ 1);
            int i43 = (i39 & i42) + (i42 | i39);
            int i44 = i39 >> 20;
            int i45 = ((i44 ^ (-8191)) + ((i44 & (-8191)) << 1)) / 4096;
            int i46 = (-((((i45 | 1) << 1) - (i45 ^ 1)) ^ i43)) + 1;
            int i47 = i46 >> 20;
            int i48 = ((i47 & (-8191)) + (i47 | (-8191))) / 4096;
            int i49 = (i48 ^ 1) + ((i48 & 1) << 1);
            bundle.putParcelable("30|branch_location".substring(4428 / ((i46 & (-(((i49 | 1) << 1) - (i49 ^ 1)))) * 1476)), p0);
            sethasembeddedtabs.setArguments(bundle);
            return sethasembeddedtabs;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r7, byte r8, int r9) {
            /*
                byte[] r0 = defpackage.setHasEmbeddedTabs.Companion.$$c
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r9 = r9 * 2
                int r9 = r9 + 1
                int r7 = r7 + 117
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                r6 = r8
                r8 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L26:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2b:
                int r3 = -r3
                int r8 = r8 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.setHasEmbeddedTabs.Companion.$$g(int, byte, int):java.lang.String");
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentBpjstkuBranchOfficeMapBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return BpjstkuBranchOfficeMapFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.b = arguments != null ? (Office) arguments.getParcelable("branch_location") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.mapBranchOffice);
        Intrinsics.checkNotNull(fragmentFindFragmentById, "");
        ((SupportMapFragment) fragmentFindFragmentById).getMapAsync(this);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Office office = this.b;
        if (office != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p0;
            LatLng latLng = new LatLng(office.b, office.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            GoogleMap googleMap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            GoogleMap googleMap2 = null;
            if (googleMap == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                googleMap = null;
            }
            googleMap.addMarker(new MarkerOptions().position(latLng).title(office.TuitionPaymentFragmentbindingInflater1).icon(BitmapDescriptorFactory.fromResource(2131231288)));
            GoogleMap googleMap3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (googleMap3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                googleMap3 = null;
            }
            googleMap3.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16.0f));
            GoogleMap googleMap4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (googleMap4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                googleMap2 = googleMap4;
            }
            googleMap2.setMapType(1);
            if (ActivityCompat.checkSelfPermission(requireContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
                requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1);
            }
        }
    }
}
