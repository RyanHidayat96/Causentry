package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzof;
import com.google.android.libraries.places.internal.zzow;
import com.google.android.libraries.places.internal.zzox;
import com.google.android.libraries.places.internal.zzoy;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends Fragment {
    public static final /* synthetic */ int zzb = 0;
    public zzc zza;
    private ImageView zzc;
    private ImageView zzd;
    private com.google.android.libraries.places.widget.model.zzi zze;
    private FrameLayout zzf;
    private zzoy zzg;
    private View zzh;
    private View zzi;

    public static final /* synthetic */ void zzd(zzj zzjVar) {
        ImageView imageView = zzjVar.zzc;
        FrameLayout frameLayout = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        imageView.setVisibility(8);
        FrameLayout frameLayout2 = zzjVar.zzf;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.setVisibility(0);
    }

    static /* synthetic */ void zzf(zzj zzjVar, View view) {
        zzjVar.zzi(false);
        zzjVar.zzb().onGoToPreviousImage();
        zzjVar.zzj();
    }

    static /* synthetic */ void zzg(zzj zzjVar, View view) {
        zzjVar.zzi(false);
        zzjVar.zzb().onGoToNextImage();
        zzjVar.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(boolean z) {
        View view = this.zzh;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setEnabled(z);
        View view3 = this.zzi;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        view2.setEnabled(z);
    }

    private final void zzj() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(true);
                }
            }, 300L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof zzc) {
            zzc zzcVar = (zzc) context;
            Intrinsics.checkNotNullParameter(zzcVar, "");
            this.zza = zzcVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.zze = (com.google.android.libraries.places.widget.model.zzi) zzof.zza(arguments, "page_data", com.google.android.libraries.places.widget.model.zzi.class);
        }
        if (this.zzg == null) {
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(requireContext());
            zzoxVarZza.zzb(zzmo.PLACES_UI_KIT);
            this.zzg = zzoxVarZza.zza();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewInflate = layoutInflater.inflate(R.layout.photo_viewer_fragment, viewGroup, false);
        this.zzd = (ImageView) viewInflate.findViewById(R.id.blurred_background_image);
        this.zzc = (ImageView) viewInflate.findViewById(R.id.photo_viewer_image);
        this.zzf = (FrameLayout) viewInflate.findViewById(R.id.loading_failed_ui);
        this.zzh = viewInflate.findViewById(R.id.previous_image_button);
        this.zzi = viewInflate.findViewById(R.id.next_image_button);
        View view = this.zzh;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzg
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view3) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view3);
                try {
                    zzj.zzf(this.zza, view3);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        View view3 = this.zzi;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            view2 = view3;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzd
            private static final byte[] $$c = {94, -56, 58, -24};
            private static final int $$f = 149;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {31, -3, -46, 11, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -55, -6, 1, -3, -12, 18, -12, 8, 1, -18, 13, 53, -64, -3, 10, -2, -8, Base64.padSymbol, -69, 12, -13, -5, 15, -15, -2, 69, -23, -38, 1, -3, -12, 18, -12, 40, -31, -18, 13, 17, -20, -13, -5, 15, -15, -2, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64};
            private static final int $$e = 148;
            private static final byte[] $$a = {21, 65, -9, -121, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 152;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
            private static int b = -981105359;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 438;

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 4
                    int r6 = 84 - r6
                    byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.zzd.$$a
                    int r7 = r7 * 15
                    int r7 = 53 - r7
                    int r8 = r8 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r6
                    r6 = r7
                    r4 = r2
                    goto L29
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                L29:
                    int r6 = r6 + r3
                    int r6 = r6 + (-11)
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.zzd.a(short, byte, short, java.lang.Object[]):void");
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
            private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 4
                    byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.zzd.$$d
                    int r8 = r8 * 15
                    int r8 = r8 + 84
                    int r6 = r6 * 23
                    int r6 = r6 + 38
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2e
                L15:
                    r3 = r2
                L16:
                    int r7 = r7 + 1
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
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + (-1)
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.zzd.d(short, byte, short, java.lang.Object[]):void");
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
                    int i4 = $10 + 63;
                    $11 = i4 % 128;
                    int i5 = i4 % i2;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - Color.argb(0, 0, 0, 0)), Color.red(0) + 1235, 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), -653973969, false, $$g(b2, b3, (byte) (b3 + 3)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        try {
                            Object[] objArr3 = {sessionProcessor};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ('0' - AndroidCharacter.getMirror('0')), 2764 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 13 - TextUtils.lastIndexOf("", '0', 0, 0), 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            try {
                                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.red(0)), 253 - View.MeasureSpec.getMode(0), Color.rgb(0, 0, 0) + 16777238, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                try {
                                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = (byte) (b6 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2891, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, 2012627446, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                    cArr4[iIntValue2] = sessionProcessor.b;
                                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                    int i6 = $11 + 1;
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
                    } catch (Throwable th4) {
                        Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view4) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view4);
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        int i4 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i5 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte[] bArr = $$a;
                        Object[] objArr2 = new Object[1];
                        a(bArr[7], bArr[28], bArr[5], objArr2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, i4, i5, -1650998592, false, (String) objArr2[0], null);
                    }
                    long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                    Object[] objArr3 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{47744, 44403, 45101, 37611}, (char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.getMode(0), new char[]{29949, 48018, 18597, 60868, 5495, 31936, 52288, 14601, 45959, 14804, 22011, 26773, 18472, 9949, 43871, 18453, 7692, 43708, 44000, 41182, 61170, 12359}, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{54850, 53385, 9870, 22319}, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 12069), (Process.myTid() >> 22) - 1898935850, new char[]{54322, 56330, 36067, 17187, 59224, 40893, 3161, 15102, 7229, 17751, 19679, 45557, 61439, 4855, 42210}, objArr4);
                    long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int i6 = 877 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        a(b2, b3, (byte) (b3 | 36), objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, i6, fadingEdgeLength, 2012020043, false, (String) objArr5[0], null);
                    }
                    try {
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            int i7 = TuitionPaymentFragmentbindingInflater1 + 113;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            int i8 = i7 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int i9 = 877 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                                byte b4 = $$a[7];
                                byte b5 = b4;
                                Object[] objArr6 = new Object[1];
                                a(b4, b5, (byte) (b5 | 88), objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, i9, iResolveSizeAndState, 2012931276, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i10 = ((((~(iIdentityHashCode | (-284026516))) * TypedValues.CycleType.TYPE_EASING) + 900776456) + (((~((~iIdentityHashCode) | (-284026516))) | 51386472) * TypedValues.CycleType.TYPE_EASING)) - 1243567539;
                            int i11 = (i10 << 13) ^ i10;
                            int i12 = i11 ^ (i11 >>> 17);
                            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
                        } else {
                            Object[] objArr8 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{4500, 64787, 'p', 44830}, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7679), (-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{30776, 27878, 30461, 7631, 9676, 10668, 22501, 54498, 18684, 1622, 51992, 30338, 57629, 62971, 26948, 28949, 40355, 16167, 44210, 5555, 12191, 16613, 16821, 28711, 58515, 46492}, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{29975, 24882, 7888, 9677}, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 52510), View.resolveSizeAndState(0, 0, 0), new char[]{28410, 50003, 57943, 28542, 12624, 6291, 40134, 38377, 46868, 43141, 65390, 1865, 62564, 13169, 42431, 63546, 50444, 17176}, objArr9);
                            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                            if (applicationContext != null) {
                                if (applicationContext instanceof ContextWrapper) {
                                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                                    TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        ((ContextWrapper) applicationContext).getBaseContext();
                                        throw null;
                                    }
                                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                        applicationContext = applicationContext.getApplicationContext();
                                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                                        int i15 = i14 % 2;
                                    } else {
                                        applicationContext = null;
                                    }
                                } else {
                                    applicationContext = applicationContext.getApplicationContext();
                                    int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
                                    TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                                    int i17 = i16 % 2;
                                }
                            }
                            Object[] objArr10 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{50353, 343, 21986, 34847}, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8020), (Process.getThreadPriority(0) + 20) >> 6, new char[]{65490, 1348, 22130, 12034, 40285, 36321, 32999, 57487, 4736, 17003, 7778, 27311, 18305, 58423, 19072, 34066}, objArr10);
                            Class<?> cls3 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            c(new char[]{0, 0, 0, 0}, new char[]{43730, 24184, 63432, 5384}, (char) (2294 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.getDefaultSize(0, 0), new char[]{41303, 17115, 58229, 59188, 41801, 4064, 5973, 454, 51780, 1017, 1546, 7465, 9517, 22039, 877, 63066}, objArr11);
                            try {
                                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1243567539};
                                byte[] bArr2 = $$d;
                                byte b6 = bArr2[5];
                                byte b7 = b6;
                                Object[] objArr13 = new Object[1];
                                d(b7, (byte) (-b7), b6, objArr13);
                                Class<?> cls4 = Class.forName((String) objArr13[0]);
                                byte b8 = bArr2[69];
                                byte b9 = b8;
                                Object[] objArr14 = new Object[1];
                                d(b9, (byte) (b9 | 59), b8, objArr14);
                                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                if (applicationContext != null) {
                                    int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                                    TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                                    int i19 = i18 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int iIndexOf = 876 - TextUtils.indexOf("", "", 0);
                                        int iGreen = 10 - Color.green(0);
                                        byte b10 = $$a[7];
                                        byte b11 = b10;
                                        Object[] objArr15 = new Object[1];
                                        a(b10, b11, (byte) (b11 | 88), objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iIndexOf, iGreen, 2012931276, false, (String) objArr15[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                    try {
                                        Object[] objArr16 = new Object[1];
                                        c(new char[]{0, 0, 0, 0}, new char[]{47744, 44403, 45101, 37611}, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString(""), new char[]{29949, 48018, 18597, 60868, 5495, 31936, 52288, 14601, 45959, 14804, 22011, 26773, 18472, 9949, 43871, 18453, 7692, 43708, 44000, 41182, 61170, 12359}, objArr16);
                                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                                        Object[] objArr17 = new Object[1];
                                        c(new char[]{0, 0, 0, 0}, new char[]{54850, 53385, 9870, 22319}, (char) (ImageFormat.getBitsPerPixel(0) + 12071), (-1898935849) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{54322, 56330, 36067, 17187, 59224, 40893, 3161, 15102, 7229, 17751, 19679, 45557, 61439, 4855, 42210}, objArr17);
                                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                        Long lValueOf = Long.valueOf(jLongValue2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                                            int i20 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                                            int i21 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                            byte b12 = $$a[7];
                                            byte b13 = b12;
                                            Object[] objArr18 = new Object[1];
                                            a(b12, b13, (byte) (b13 | 36), objArr18);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, i20, i21, 2012020043, false, (String) objArr18[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                            int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                                            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            byte[] bArr3 = $$a;
                                            Object[] objArr19 = new Object[1];
                                            a(bArr3[7], bArr3[28], bArr3[5], objArr19);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity, packedPositionGroup, threadPriority, -1650998592, false, (String) objArr19[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                    } catch (Exception unused) {
                                        throw new RuntimeException();
                                    }
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        int i22 = ((int[]) objArr[2])[0];
                        int i23 = ((int[]) objArr[0])[0];
                        if (i23 == i22) {
                            int i24 = ((int[]) objArr[1])[0];
                            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int iIdentityHashCode2 = System.identityHashCode(this);
                            int i25 = ~iIdentityHashCode2;
                            int i26 = i24 + (-1708631228) + (((~(423076399 | i25)) | (-463386629) | (~((-423076400) | iIdentityHashCode2))) * (-564)) + ((~(iIdentityHashCode2 | (-420913157))) * 1128) + (((~((-463386629) | i25)) | 2163243) * 564);
                            int i27 = (i26 << 13) ^ i26;
                            int i28 = i27 ^ (i27 >>> 17);
                            ((int[]) objArr20[1])[0] = i28 ^ (i28 << 5);
                        } else {
                            int[] iArr = new int[i23];
                            int i29 = i23 - 1;
                            iArr[i29] = 1;
                            Toast.makeText((Context) null, iArr[((i23 * i29) % 2) - 1], 1).show();
                            int i30 = ((int[]) objArr[1])[0];
                            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int iIdentityHashCode3 = System.identityHashCode(this);
                            int i31 = i30 + 1858126516 + (((~(548500634 | iIdentityHashCode3)) | 50891365) * 336) + (((~(iIdentityHashCode3 | 588810863)) | 10581136) * (-168)) + (((~((~iIdentityHashCode3) | 588810863)) | 548500634) * 168);
                            int i32 = (i31 << 13) ^ i31;
                            int i33 = i32 ^ (i32 >>> 17);
                            ((int[]) objArr21[1])[0] = i33 ^ (i33 << 5);
                        }
                        zzj.zzg(this.zza, view4);
                        ViewPortBuilder.b();
                        int i34 = TuitionPaymentFragmentbindingInflater1 + 55;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i34 % 128;
                        if (i34 % 2 == 0) {
                            throw null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ViewPortBuilder.b();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ViewPortBuilder.b();
                    throw th;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r5, short r6, byte r7) {
                /*
                    int r7 = 104 - r7
                    byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.zzd.$$c
                    int r5 = r5 * 2
                    int r1 = r5 + 1
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r4 = r7
                    r3 = r2
                    r7 = r5
                    goto L25
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r6 = r6 + 1
                    if (r3 != r5) goto L21
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L21:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L25:
                    int r7 = r7 + r4
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.zzd.$$g(int, short, byte):java.lang.String");
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        RequestManager requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(requireContext());
        com.google.android.libraries.places.widget.model.zzi zziVar = this.zze;
        ImageView imageView = null;
        if (zziVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            zziVar = null;
        }
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = requestManagerTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zziVar.zzb());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        RequestBuilder<Drawable> requestBuilderApply = requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.apply(RequestOptions.bitmapTransform(new zza(contextRequireContext, 25.0f, 0.125f)));
        ImageView imageView2 = this.zzd;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageView = imageView2;
        }
        requestBuilderApply.into(imageView);
        requireView().post(new Runnable() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zze
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj zzjVar = this.zza;
                b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(zzjVar), null, null, new zzi(zzjVar, null), 3, null);
            }
        });
    }

    public final zzc zzb() {
        zzc zzcVar = this.zza;
        if (zzcVar != null) {
            return zzcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzoy zza() {
        return this.zzg;
    }
}
