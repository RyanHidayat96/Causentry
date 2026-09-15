package com.airbnb.lottie;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_common.zzin;
import com.google.mlkit.common.sdkinternal.zze;
import defpackage.MediaControllerCompatMediaControllerImplApi23;
import defpackage.MediaControllerCompatMediaControllerImplApi24;
import defpackage.MediaControllerCompatPlaybackInfo;
import defpackage.MediaSessionCompatCallbackCallbackHandler;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.onRemoveQueueItemAt;
import defpackage.onSetCaptioningEnabled;
import defpackage.onSkipToPrevious;
import defpackage.play;
import defpackage.playFromMediaId;
import defpackage.prepare;
import defpackage.prepareFromSearch;
import defpackage.prepareFromUri;
import defpackage.previous;
import defpackage.registerCallbackListener;
import defpackage.removeQueueItem;
import defpackage.removeQueueItemAt;
import defpackage.rewind;
import defpackage.seekTo;
import defpackage.sendCommand;
import defpackage.setCaptioningEnabled;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static int IconCompatParcelizer;
    private static long RemoteActionCompatParcelizer;
    private static final removeQueueItemAt<Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final prepare INotificationSideChannel;
    private final removeQueueItemAt<Throwable> INotificationSideChannelDefault;
    private boolean INotificationSideChannelStub;
    private boolean INotificationSideChannelStubProxy;
    private String TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private removeQueueItemAt<Throwable> f361a;
    private sendCommand<previous> asBinder;
    private previous asInterface;
    private boolean b;
    private boolean cancel;
    private boolean cancelAll;
    private boolean d;
    private int g;
    private RenderMode getInterfaceDescriptor;
    private final removeQueueItemAt<previous> notify;
    private Set<removeQueueItem> onTransact;
    private static final byte[] $$c = {87, 51, -85, 78};
    private static final int $$f = 190;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {7, 15, 25, 25, -12, 2, 63, -52, -14, 6, -9, -1, 9, -10, 71, -66, -2, 13, -14, 14, -9, -6, 19, -19, 11, -6, 1, 64, -64, -1, -5, 11, 3, -3, 6, 2, -19, 11, -6, 1, 64, -32, -33, -5, 11, 3, -3, 6, 2, -19, 11, -6, 1, 44, -45, -5, 0, 5, 2, 26, -21, 3, 0, -15, 80, -79, 3, 11, 2, -6, 8, -11, 72, 0, -69, -5, 2, 3, -5, 9, 1, 64, -69, -5, 4, 5, 2, -17, 80, -64, -1, -1, 5, -20, 9, -8, 80, -13, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 65};
    private static final int $$e = 241;
    private static final byte[] $$a = {117, 57, 101, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 241;
    private static int write = 0;
    private static int connect = 1;
    private static int MediaBrowserCompat = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = 53 - r7
            byte[] r0 = com.airbnb.lottie.LottieAnimationView.$$a
            int r8 = r8 + 4
            int r9 = r9 * 14
            int r9 = r9 + 84
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r0 = com.airbnb.lottie.LottieAnimationView.$$d
            int r6 = r6 * 42
            int r1 = r6 + 53
            int r7 = r7 * 94
            int r7 = 97 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 52
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.f(byte, byte, short, java.lang.Object[]):void");
    }

    static /* synthetic */ removeQueueItemAt TuitionPaymentFragmentbindingInflater1(LottieAnimationView lottieAnimationView) {
        int i = 2 % 2;
        int i2 = connect + 45;
        write = i2 % 128;
        int i3 = i2 % 2;
        removeQueueItemAt<Throwable> removequeueitemat = lottieAnimationView.f361a;
        if (i3 == 0) {
            return removequeueitemat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ removeQueueItemAt TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = write + 57;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        removeQueueItemAt<Throwable> removequeueitemat = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i3 + 17;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            return removequeueitemat;
        }
        throw null;
    }

    static /* synthetic */ int b(LottieAnimationView lottieAnimationView) {
        int i = 2 % 2;
        int i2 = write + 51;
        int i3 = i2 % 128;
        connect = i3;
        int i4 = i2 % 2;
        int i5 = lottieAnimationView.g;
        if (i4 == 0) {
            int i6 = 50 / 0;
        }
        int i7 = i3 + 93;
        write = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(RemoteActionCompatParcelizer ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 103;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 64838), (ViewConfiguration.getTapTimeout() >> 16) + 1356, (ViewConfiguration.getWindowTouchSlop() >> 8) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47774), (Process.myTid() >> 22) + 468, 13 - KeyEvent.getDeadChar(0, 0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $10 + 31;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    static {
        IconCompatParcelizer = 0;
        b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new removeQueueItemAt<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.4
            @Override // defpackage.removeQueueItemAt
            public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
                Throwable th2 = th;
                if (onSkipToPrevious.TuitionPaymentFragmentbindingInflater1(th2)) {
                    onSetCaptioningEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Unable to load composition.", th2);
                    return;
                }
                throw new IllegalStateException("Unable to parse composition", th2);
            }
        };
        int i = MediaBrowserCompat + 95;
        IconCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.notify = new removeQueueItemAt<previous>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // defpackage.removeQueueItemAt
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(previous previousVar) {
                LottieAnimationView.this.setComposition(previousVar);
            }
        };
        this.INotificationSideChannelDefault = new removeQueueItemAt<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // defpackage.removeQueueItemAt
            public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
                Throwable th2 = th;
                if (LottieAnimationView.b(LottieAnimationView.this) != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(LottieAnimationView.b(lottieAnimationView));
                }
                (LottieAnimationView.TuitionPaymentFragmentbindingInflater1(LottieAnimationView.this) == null ? LottieAnimationView.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : LottieAnimationView.TuitionPaymentFragmentbindingInflater1(LottieAnimationView.this)).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th2);
            }
        };
        this.g = 0;
        this.INotificationSideChannel = new prepare();
        this.cancelAll = false;
        this.INotificationSideChannelStubProxy = false;
        this.INotificationSideChannelStub = false;
        this.b = false;
        this.d = true;
        this.getInterfaceDescriptor = RenderMode.AUTOMATIC;
        this.onTransact = new HashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.notify = new removeQueueItemAt<previous>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // defpackage.removeQueueItemAt
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(previous previousVar) {
                LottieAnimationView.this.setComposition(previousVar);
            }
        };
        this.INotificationSideChannelDefault = new removeQueueItemAt<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // defpackage.removeQueueItemAt
            public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
                Throwable th2 = th;
                if (LottieAnimationView.b(LottieAnimationView.this) != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(LottieAnimationView.b(lottieAnimationView));
                }
                (LottieAnimationView.TuitionPaymentFragmentbindingInflater1(LottieAnimationView.this) == null ? LottieAnimationView.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : LottieAnimationView.TuitionPaymentFragmentbindingInflater1(LottieAnimationView.this)).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th2);
            }
        };
        this.g = 0;
        this.INotificationSideChannel = new prepare();
        this.cancelAll = false;
        this.INotificationSideChannelStubProxy = false;
        this.INotificationSideChannelStub = false;
        this.b = false;
        this.d = true;
        this.getInterfaceDescriptor = RenderMode.AUTOMATIC;
        this.onTransact = new HashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.notify = new removeQueueItemAt<previous>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // defpackage.removeQueueItemAt
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(previous previousVar) {
                LottieAnimationView.this.setComposition(previousVar);
            }
        };
        this.INotificationSideChannelDefault = new removeQueueItemAt<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            @Override // defpackage.removeQueueItemAt
            public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
                Throwable th2 = th;
                if (LottieAnimationView.b(LottieAnimationView.this) != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(LottieAnimationView.b(lottieAnimationView));
                }
                (LottieAnimationView.TuitionPaymentFragmentbindingInflater1(LottieAnimationView.this) == null ? LottieAnimationView.TuitionPaymentFragmentspecialinlinedviewModeldefault1() : LottieAnimationView.TuitionPaymentFragmentbindingInflater1(LottieAnimationView.this)).TuitionPaymentFragmentspecialinlinedviewModeldefault3(th2);
            }
        };
        this.g = 0;
        this.INotificationSideChannel = new prepare();
        this.cancelAll = false;
        this.INotificationSideChannelStubProxy = false;
        this.INotificationSideChannelStub = false;
        this.b = false;
        this.d = true;
        this.getInterfaceDescriptor = RenderMode.AUTOMATIC;
        this.onTransact = new HashSet();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059 A[DONT_INVERT, PHI: r1 r4 r5
  0x0059: PHI (r1v56 boolean) = (r1v55 boolean), (r1v76 boolean) binds: [B:10:0x0057, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r4v5 boolean) = (r4v4 boolean), (r4v13 boolean) binds: [B:10:0x0057, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r5v5 boolean) = (r5v4 boolean), (r5v9 boolean) binds: [B:10:0x0057, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x005c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AttributeSet attributeSet) {
        boolean zHasValue;
        boolean zHasValue2;
        boolean zHasValue3;
        int i = 2 % 2;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
        if (!isInEditMode()) {
            int i2 = connect + 41;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                this.d = typedArrayObtainStyledAttributes.getBoolean(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, false);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact);
                zHasValue2 = typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1348a);
                zHasValue3 = typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault);
                if (zHasValue) {
                    if (zHasValue2) {
                        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
                    }
                }
            } else {
                this.d = typedArrayObtainStyledAttributes.getBoolean(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact);
                zHasValue2 = typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1348a);
                zHasValue3 = typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault);
                if (zHasValue) {
                    if (zHasValue2) {
                        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
                    }
                }
            }
            if (zHasValue) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact, 0);
                if (resourceId != 0) {
                    int i3 = write + 33;
                    connect = i3 % 128;
                    if (i3 % 2 == 0) {
                        setAnimation(resourceId);
                        throw null;
                    }
                    setAnimation(resourceId);
                }
            } else if (zHasValue2) {
                int i4 = connect + 101;
                write = i4 % 128;
                int i5 = i4 % 2;
                String string = typedArrayObtainStyledAttributes.getString(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f1348a);
                if (string != null) {
                    setAnimation(string);
                }
            } else if (!(!zHasValue3)) {
                int i6 = write + 5;
                connect = i6 % 128;
                int i7 = i6 % 2;
                String string2 = typedArrayObtainStyledAttributes.getString(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelDefault);
                if (string2 != null) {
                    setAnimationFromUrl(string2);
                }
            }
            setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface, 0));
        }
        if (typedArrayObtainStyledAttributes.getBoolean(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, false)) {
            this.INotificationSideChannelStub = true;
            this.b = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.g, false)) {
            int i8 = write + 123;
            connect = i8 % 128;
            int i9 = i8 % 2;
            this.INotificationSideChannel.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel)) {
            int i10 = connect + 119;
            write = i10 % 128;
            int i11 = i10 % 2;
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel, -1));
        }
        if (!(!typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy))) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannelStubProxy, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder));
        setProgress(typedArrayObtainStyledAttributes.getFloat(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d, 0.0f));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, false);
        prepare prepareVar = this.INotificationSideChannel;
        if (prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != z) {
            int i12 = write + 1;
            connect = i12 % 128;
            if (i12 % 2 == 0) {
                prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
                int i13 = 94 / 0;
                if (prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    prepareVar.TuitionPaymentFragmentbindingInflater1();
                }
            } else {
                prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
                if (prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    prepareVar.TuitionPaymentFragmentbindingInflater1();
                }
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            int i14 = rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1(new MediaControllerCompatPlaybackInfo("**"), registerCallbackListener.TuitionPaymentFragmentbindingInflater1, (MediaSessionCompatCallbackCallbackHandler<ColorFilter>) new MediaSessionCompatCallbackCallbackHandler(new seekTo(typedArrayObtainStyledAttributes.getColor(2, 0))));
        }
        if (typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify)) {
            prepare prepareVar2 = this.INotificationSideChannel;
            prepareVar2.notify = typedArrayObtainStyledAttributes.getFloat(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.notify, 1.0f);
            prepareVar2.b();
        }
        if (typedArrayObtainStyledAttributes.hasValue(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll)) {
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(rewind.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll, RenderMode.AUTOMATIC.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = RenderMode.AUTOMATIC.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        if (getScaleType() != null) {
            this.INotificationSideChannel.getInterfaceDescriptor = getScaleType();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.INotificationSideChannel.INotificationSideChannelStubProxy = Boolean.valueOf(onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getContext()) != 0.0f).booleanValue();
        TuitionPaymentFragmentbindingInflater1();
        this.cancel = true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        sendCommand<previous> sendcommand = this.asBinder;
        if (sendcommand != null) {
            int i3 = write + 7;
            connect = i3 % 128;
            if (i3 % 2 == 0) {
                sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
                int i4 = 86 / 0;
            } else {
                sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 625;
            int i5 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 15;
            byte b = $$a[5];
            byte b2 = (byte) (-b);
            byte b3 = b;
            Object[] objArr2 = new Object[1];
            c(b2, b3, (byte) (-b3), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iMakeMeasureSpec, i5, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{64337, 23734, 13331, 64304, 64005, 14416, 64871, 55279, 26910, 43639, 28487, 17811, 57214, 54285, 55661, 43918, 19784, 17965, 19223, 6552, 46012, 61949, 9711, 35954, 8594, 25589}, View.MeasureSpec.getSize(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{61649, 23773, 62384, 61620, 40247, 14393, 15041, 45279, 25218, 43536, 43236, 8925, 54516, 54388, 7820, 52379, 18136, 18008, 36005}, TextUtils.indexOf("", ""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 625;
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
            byte[] bArr = $$a;
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b4, bArr[5], b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, absoluteGravity, packedPositionGroup, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (37567 - TextUtils.indexOf("", ""));
                int iIndexOf = 625 - TextUtils.indexOf("", "", 0);
                int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                c(b6, (byte) (b6 | 51), b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iIndexOf, i6, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int i9 = 1483453737 + (((~(i | 1428237735)) | (-395500386)) * (-465)) + ((1428237735 | (~((-395500386) | i))) * 930) + (((-43176513) | i) * 465) + 2022314709;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            objArr = new Object[]{iArr, new int[]{i11 ^ (i11 << 5)}, new int[]{i7}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{9898, 39039, 2814, 9931, 46254, 64665, 50058, 39236, 46309, 28350, 20906, 2872, 651, 4295, 59358, 58712, 37003, 33524, 30202, 22335, 28252, 13598, 6938, 49871, 64606, 42815, 43324, 48371, 18955, 18771}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{21301, 19721, 12818, 21334, 64585, 10740, 64368, 53667, 49520, 48079, 26966, 17328, 30469, 50609, 57134, 44536, 58678, 22400, 19734, 8152, 7130, 57455}, ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{59310, 10683, 54844, 59292, 40452, 19798, 8010, 46077, 30191, 57201, 36202, 8586, 50135, 41237, 15114, 53225, 20907, 13110, 43309, 32201, 44825, 33922, 51098, 59513, 15675, 5796, 30139, 38494, 35595, 63684, 58254, 1133, 6525, 19127, 4600, 45637, 30359, 56402, 35870, 8357, 50367, 44578, 14900, 52957, 21128, 12358, 43096, 31972, 41128, 33334, 50815, 60105, 15951, 6019, 29844, 39293, 35898, 63915, 58046, 1886, 6743, 19403, 4312, 46398, 26668, 56757, 36606, 8990}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            e(new char[]{32704, 26888, 45632, 32675, 14060, 3553, 31540, 6978, 60880, 40853, 59666, 35171, 23525, 57766, 24352, 26454, 51653, 29650, 52566, 54560, 14194, 50227, 41958, 16583, 42325, 22039, 4502, 16098, 4962, 47220, 34802, 44173, 33043, 2649, 30089, 6828, 61177, 40162, 59493, 34885, 23764, 61125, 24081, 26214, 51890, 28837, 52342, 54274, 14487, 49876, 41475, 16935, 42617, 22371, 4329, 12749, 5122, 47380, 34499, 45030, 33379, 2854, 29858, 7552, 61505, 40272, 60038, 35826}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr11);
            try {
                Object[] objArr12 = {applicationContext, new String[]{str, (String) objArr11[0]}, Integer.valueOf(i), 17, 2022314709};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[26];
                byte b8 = b7;
                Object[] objArr13 = new Object[1];
                f(b7, b8, b8, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                byte b9 = bArr2[56];
                byte b10 = b9;
                Object[] objArr14 = new Object[1];
                f(b9, b10, b10, objArr14);
                objArr = (Object[]) cls3.getMethod((String) objArr14[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i14 = write + 55;
                    connect = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cRed = (char) (Color.red(0) + 37567);
                        int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int touchSlop = 14 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr15 = new Object[1];
                        c(b12, (byte) (b12 | 51), b11, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRed, jumpTapTimeout, touchSlop, -973632554, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{64337, 23734, 13331, 64304, 64005, 14416, 64871, 55279, 26910, 43639, 28487, 17811, 57214, 54285, 55661, 43918, 19784, 17965, 19223, 6552, 46012, 61949, 9711, 35954, 8594, 25589}, TextUtils.getOffsetAfter("", 0), objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{61649, 23773, 62384, 61620, 40247, 14393, 15041, 45279, 25218, 43536, 43236, 8925, 54516, 54388, 7820, 52379, 18136, 18008, 36005}, ViewConfiguration.getLongPressTimeout() >> 16, objArr17);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 37567);
                            int i16 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 626;
                            int size = 14 - View.MeasureSpec.getSize(0);
                            byte[] bArr3 = $$a;
                            byte b13 = bArr3[7];
                            Object[] objArr18 = new Object[1];
                            c(b13, bArr3[5], b13, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, i16, size, -976899241, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRed2 = (char) (Color.red(0) + 37567);
                            int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 624;
                            int i18 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14;
                            byte b14 = $$a[5];
                            byte b15 = (byte) (-b14);
                            byte b16 = b14;
                            Object[] objArr19 = new Object[1];
                            c(b15, b16, (byte) (-b16), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed2, i17, i18, -477065106, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i19 = connect + 13;
                        write = i19 % 128;
                        int i20 = i19 % 2;
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
        int i21 = ((int[]) objArr[0])[0];
        int i22 = ((int[]) objArr[2])[0];
        if (i22 == i21) {
            int i23 = ((int[]) objArr[1])[0];
            int i24 = ((int[]) objArr[2])[0];
            int i25 = ((int[]) objArr[0])[0];
            new int[1][0] = i24;
            new int[1][0] = i25;
            int i26 = i23 + 846405268 + (((~((-270012738) | i)) | (~((~i) | 1553725383))) * (-318)) + (((~(278614983 | i)) | 1275110400) * (-318)) + (((~((-278614984) | i)) | (-1545123138)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            int[] iArr2 = {i28 ^ (i28 << 5)};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i29 = connect + 69;
                write = i29 % 128;
                int i30 = i29 % 2;
                for (String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            int[] iArr3 = new int[i22];
            int i31 = i22 - 1;
            iArr3[i31] = 1;
            Toast.makeText((Context) null, iArr3[((i22 * i31) % 2) - 1], 1).show();
            int i32 = ((int[]) objArr[1])[0];
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iIdentityHashCode = System.identityHashCode(this);
            int i35 = i32 + (-6184012) + (((~(iIdentityHashCode | 1008021659)) | (-815716462)) * (-668)) + ((1008021659 | (~((-815716462) | iIdentityHashCode))) * 1336) + ((iIdentityHashCode | (-9095269)) * 668);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[1])[0] = i37 ^ (i37 << 5);
            Object[] objArr20 = {new int[]{i34}, new int[1], new int[]{i33}, strArr3};
        }
        super.setImageResource(i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        int i = 2 % 2;
        sendCommand<previous> sendcommand = this.asBinder;
        if (sendcommand != null) {
            int i2 = connect + 121;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
                throw null;
            }
            sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
            this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
        }
        super.setImageDrawable(drawable);
        int i3 = write + 101;
        connect = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 sendCommand<previous>) = (r1v4 sendCommand<previous>), (r1v10 sendCommand<previous>) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        sendCommand<previous> sendcommand;
        int i = 2 % 2;
        int i2 = connect + 81;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            sendcommand = this.asBinder;
            int i3 = 34 / 0;
            if (sendcommand != null) {
                sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
                int i4 = write + 53;
                connect = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            sendcommand = this.asBinder;
            if (sendcommand != null) {
                sendcommand.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
                int i6 = write + 53;
                connect = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        int i = 2 % 2;
        int i2 = connect + 63;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            getDrawable();
            throw null;
        }
        Drawable drawable2 = getDrawable();
        prepare prepareVar = this.INotificationSideChannel;
        if (drawable2 != prepareVar) {
            super.invalidateDrawable(drawable);
            return;
        }
        super.invalidateDrawable(prepareVar);
        int i3 = connect + 51;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        int i = 2 % 2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
        savedState.b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        savedState.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.INotificationSideChannel.b.b();
        onRemoveQueueItemAt onremovequeueitemat = this.INotificationSideChannel.b;
        boolean z = true;
        if (onremovequeueitemat == null || !onremovequeueitemat.isRunning()) {
            int i2 = connect + 47;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
                if (!ViewCompat.isAttachedToWindow(this)) {
                    if (!this.INotificationSideChannelStub) {
                    }
                }
            } else if (!ViewCompat.isAttachedToWindow(this)) {
                if (!this.INotificationSideChannelStub) {
                }
            }
            int i4 = write + 101;
            connect = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        savedState.TuitionPaymentFragmentbindingInflater1 = z;
        savedState.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.INotificationSideChannel.asBinder;
        savedState.g = this.INotificationSideChannel.b.getRepeatMode();
        savedState.d = this.INotificationSideChannel.b.getRepeatCount();
        int i6 = connect + 91;
        write = i6 % 128;
        if (i6 % 2 == 0) {
            return savedState;
        }
        throw null;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 89;
        connect = i3 % 128;
        int i4 = i3 % 2;
        if (!(parcelable instanceof SavedState)) {
            int i5 = i2 + 107;
            connect = i5 % 128;
            if (i5 % 2 != 0) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            super.onRestoreInstanceState(parcelable);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        if (!TextUtils.isEmpty(str)) {
            int i6 = write + 107;
            connect = i6 % 128;
            int i7 = i6 % 2;
            setAnimation(this.TuitionPaymentFragmentbindingInflater1);
        }
        int i8 = savedState.b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8;
        if (i8 != 0) {
            setAnimation(i8);
            int i9 = write + 21;
            connect = i9 % 128;
            int i10 = i9 % 2;
        }
        setProgress(savedState.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (savedState.TuitionPaymentFragmentbindingInflater1) {
            if (isShown()) {
                this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                TuitionPaymentFragmentbindingInflater1();
            } else {
                this.cancelAll = true;
                int i11 = write + 31;
                connect = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        this.INotificationSideChannel.asBinder = savedState.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        setRepeatMode(savedState.g);
        setRepeatCount(savedState.d);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        int i2 = 2 % 2;
        if (this.cancel) {
            int i3 = write + 21;
            connect = i3 % 128;
            int i4 = i3 % 2;
            if (!isShown()) {
                onRemoveQueueItemAt onremovequeueitemat = this.INotificationSideChannel.b;
                if (onremovequeueitemat == null) {
                    int i5 = write + 37;
                    connect = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                } else {
                    if (onremovequeueitemat.isRunning()) {
                        this.b = false;
                        this.INotificationSideChannelStub = false;
                        this.INotificationSideChannelStubProxy = false;
                        this.cancelAll = false;
                        prepare prepareVar = this.INotificationSideChannel;
                        prepareVar.INotificationSideChannel.clear();
                        onRemoveQueueItemAt onremovequeueitemat2 = prepareVar.b;
                        Choreographer.getInstance().removeFrameCallback(onremovequeueitemat2);
                        onremovequeueitemat2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                        TuitionPaymentFragmentbindingInflater1();
                        this.INotificationSideChannelStubProxy = true;
                        return;
                    }
                    return;
                }
            }
            if (this.INotificationSideChannelStubProxy) {
                int i7 = connect + 63;
                write = i7 % 128;
                if (i7 % 2 != 0) {
                    isShown();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (isShown()) {
                    this.INotificationSideChannel.asInterface();
                    TuitionPaymentFragmentbindingInflater1();
                } else {
                    this.cancelAll = false;
                    this.INotificationSideChannelStubProxy = true;
                }
            } else if (this.cancelAll) {
                int i8 = connect + 121;
                write = i8 % 128;
                int i9 = i8 % 2;
                if (isShown()) {
                    this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    TuitionPaymentFragmentbindingInflater1();
                } else {
                    this.cancelAll = true;
                }
            }
            this.INotificationSideChannelStubProxy = false;
            this.cancelAll = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = write + 55;
        connect = i2 % 128;
        int i3 = i2 % 2;
        super.onAttachedToWindow();
        if (this.b || this.INotificationSideChannelStub) {
            if (isShown()) {
                this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                TuitionPaymentFragmentbindingInflater1();
            } else {
                this.cancelAll = true;
            }
            this.b = false;
            this.INotificationSideChannelStub = false;
            int i4 = write + 45;
            connect = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = write + 85;
        connect = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = connect + 21;
        write = i2 % 128;
        int i3 = i2 % 2;
        onRemoveQueueItemAt onremovequeueitemat = this.INotificationSideChannel.b;
        if (onremovequeueitemat == null) {
            int i4 = write + 51;
            connect = i4 % 128;
            int i5 = i4 % 2;
        } else if (onremovequeueitemat.isRunning()) {
            this.INotificationSideChannelStub = false;
            this.INotificationSideChannelStubProxy = false;
            this.cancelAll = false;
            prepare prepareVar = this.INotificationSideChannel;
            prepareVar.INotificationSideChannel.clear();
            prepareVar.b.cancel();
            TuitionPaymentFragmentbindingInflater1();
            this.INotificationSideChannelStub = true;
        }
        super.onDetachedFromWindow();
        int i6 = connect + 65;
        write = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 68 / 0;
        }
    }

    public void setCacheComposition(boolean z) {
        int i = 2 % 2;
        int i2 = connect;
        int i3 = i2 + 115;
        write = i3 % 128;
        int i4 = i3 % 2;
        this.d = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 39;
        write = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setAnimation(int i) {
        sendCommand<previous> sendcommandTuitionPaymentFragmentbindingInflater1;
        int i2 = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        Object obj = null;
        this.TuitionPaymentFragmentbindingInflater1 = null;
        if (this.d) {
            int i3 = write + 99;
            connect = i3 % 128;
            int i4 = i3 % 2;
            sendcommandTuitionPaymentFragmentbindingInflater1 = prepareFromUri.TuitionPaymentFragmentbindingInflater1(getContext(), i);
        } else {
            Object[] objArr = {getContext(), Integer.valueOf(i), null};
            sendcommandTuitionPaymentFragmentbindingInflater1 = (sendCommand) prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zze.b(), zze.b(), 262616839, zze.b(), objArr, zze.b(), -262616838);
            int i5 = connect + 23;
            write = i5 % 128;
            int i6 = i5 % 2;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendcommandTuitionPaymentFragmentbindingInflater1);
        int i7 = connect + 43;
        write = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public void setAnimation(String str) {
        sendCommand<previous> sendcommandB;
        int i = 2 % 2;
        int i2 = connect + 93;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
            if (this.d) {
                sendcommandB = prepareFromUri.b(getContext(), str);
                int i3 = write + 91;
                connect = i3 % 128;
                int i4 = i3 % 2;
            } else {
                Object[] objArr = {getContext(), str, null};
                int iB = zze.b();
                int iB2 = zze.b();
                sendcommandB = (sendCommand) prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, zze.b(), 2009335379, zze.b(), objArr, iB2, -2009335379);
            }
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            if (this.d) {
                sendcommandB = prepareFromUri.b(getContext(), str);
                int i5 = write + 91;
                connect = i5 % 128;
                int i6 = i5 % 2;
            } else {
                Object[] objArr2 = {getContext(), str, null};
                int iB3 = zze.b();
                int iB4 = zze.b();
                sendcommandB = (sendCommand) prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB3, zze.b(), 2009335379, zze.b(), objArr2, iB4, -2009335379);
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendcommandB);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        int i = 2 % 2;
        int i2 = write + 79;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setAnimationFromJson(str, null);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        int i5 = connect + 103;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setAnimationFromJson(String str, String str2) {
        int i = 2 % 2;
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
        int i2 = write + 79;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setAnimation(InputStream inputStream, String str) {
        int i = 2 % 2;
        int i2 = connect + 97;
        write = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStream, str));
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        int i5 = connect + 93;
        write = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setAnimationFromUrl(String str) {
        sendCommand<previous> sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = 2 % 2;
        if (this.d) {
            int i2 = connect + 115;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault2 = prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), str);
                int i3 = 85 / 0;
            } else {
                sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault2 = prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getContext(), str);
            }
        } else {
            sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault2 = prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getContext(), str, (String) null);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendcommandTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        int i4 = connect + 29;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setAnimationFromUrl(String str, String str2) {
        int i = 2 % 2;
        int i2 = connect + 97;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getContext(), str, str2));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepareFromUri.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getContext(), str, str2));
        int i3 = write + 57;
        connect = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setFailureListener(removeQueueItemAt<Throwable> removequeueitemat) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 103;
        connect = i3 % 128;
        int i4 = i3 % 2;
        this.f361a = removequeueitemat;
        int i5 = i2 + 87;
        connect = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setFallbackResource(int i) {
        int i2 = 2 % 2;
        int i3 = write + 13;
        connect = i3 % 128;
        int i4 = i3 % 2;
        this.g = i;
        if (i4 == 0) {
            throw null;
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(sendCommand<previous> sendcommand) {
        int i = 2 % 2;
        this.asInterface = null;
        Object[] objArr = {this.INotificationSideChannel};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -296234873, 296234873);
        sendCommand<previous> sendcommand2 = this.asBinder;
        if (sendcommand2 != null) {
            int i2 = connect + 51;
            write = i2 % 128;
            int i3 = i2 % 2;
            sendcommand2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.notify);
            this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.INotificationSideChannelDefault);
        }
        this.asBinder = sendcommand.b(this.notify).TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannelDefault);
        int i4 = connect + 97;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
    public void setComposition(previous previousVar) {
        boolean z;
        int i = 2 % 2;
        int i2 = connect + 107;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.setCallback(this);
        this.asInterface = previousVar;
        prepare prepareVar = this.INotificationSideChannel;
        boolean z2 = false;
        if (prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == previousVar) {
            int i4 = connect + 11;
            write = i4 % 128;
            int i5 = i4 % 2;
        } else {
            prepareVar.onTransact = false;
            prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{prepareVar}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -296234873, 296234873);
            prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = previousVar;
            prepareVar.TuitionPaymentFragmentbindingInflater1();
            onRemoveQueueItemAt onremovequeueitemat = prepareVar.b;
            if (onremovequeueitemat.TuitionPaymentFragmentbindingInflater1 == null) {
                int i6 = write + 89;
                connect = i6 % 128;
                if (i6 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            onremovequeueitemat.TuitionPaymentFragmentbindingInflater1 = previousVar;
            if (z) {
                int i7 = connect + 9;
                write = i7 % 128;
                if (i7 % 2 != 0) {
                    onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) Math.max(onremovequeueitemat.b, previousVar.onTransact), (int) Math.min(onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3, previousVar.TuitionPaymentFragmentbindingInflater1));
                    int i8 = 84 / 0;
                } else {
                    onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) Math.max(onremovequeueitemat.b, previousVar.onTransact), (int) Math.min(onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault3, previousVar.TuitionPaymentFragmentbindingInflater1));
                }
            } else {
                onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) previousVar.onTransact, (int) previousVar.TuitionPaymentFragmentbindingInflater1);
                int i9 = connect + 1;
                write = i9 % 128;
                int i10 = i9 % 2;
            }
            float f = onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            onremovequeueitemat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0.0f;
            onremovequeueitemat.TuitionPaymentFragmentbindingInflater1((int) f);
            onremovequeueitemat.TuitionPaymentFragmentbindingInflater1();
            prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3(prepareVar.b.getAnimatedFraction());
            prepareVar.notify = prepareVar.notify;
            prepareVar.b();
            prepareVar.b();
            Iterator it = new ArrayList(prepareVar.INotificationSideChannel).iterator();
            while (it.hasNext()) {
                ((prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault1) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                it.remove();
            }
            prepareVar.INotificationSideChannel.clear();
            previousVar.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = prepareVar.cancel;
            Drawable.Callback callback = prepareVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(prepareVar);
            }
            z2 = true;
        }
        TuitionPaymentFragmentbindingInflater1();
        if (getDrawable() != this.INotificationSideChannel || z2) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (removeQueueItem removequeueitem : this.onTransact) {
            }
        }
    }

    public void setMinFrame(int i) {
        int i2 = 2 % 2;
        int i3 = connect + 7;
        write = i3 % 128;
        int i4 = i3 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        int i5 = write + 33;
        connect = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMinProgress(float f) {
        int i = 2 % 2;
        int i2 = write + 85;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.b(f);
        int i4 = write + 43;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void setMaxFrame(int i) {
        int i2 = 2 % 2;
        int i3 = connect + 23;
        write = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
            throw null;
        }
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        int i4 = write + 31;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setMaxProgress(float f) {
        int i = 2 % 2;
        int i2 = write + 13;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1(f);
        int i4 = connect + 15;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setMinFrame(String str) {
        int i = 2 % 2;
        int i2 = write + 23;
        connect = i2 % 128;
        int i3 = i2 % 2;
        prepare prepareVar = this.INotificationSideChannel;
        if (i3 != 0) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{prepareVar, str}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -2099722673, 2099722676);
            return;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Object[]{prepareVar, str}, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -2099722673, 2099722676);
        int i4 = 8 / 0;
    }

    public void setMaxFrame(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = connect + 77;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        int i4 = write + 119;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setMinAndMaxFrame(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = connect + 95;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        int i4 = connect + 87;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = connect + 91;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentbindingInflater1(str, str2, z);
        int i4 = connect + 107;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setMinAndMaxFrame(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = connect + 19;
        write = i4 % 128;
        int i5 = i4 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2);
        int i6 = connect + 61;
        write = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setMinAndMaxProgress(float f, float f2) {
        int i = 2 % 2;
        int i2 = write + 17;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.INotificationSideChannel, Float.valueOf(f), Float.valueOf(f2)};
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        prepare.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr, zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzin.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1682163982, 1682163987);
        int i4 = write + 121;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    public void setSpeed(float f) {
        int i = 2 % 2;
        int i2 = write + 111;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.b.d = f;
        int i4 = connect + 3;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setRepeatMode(int i) {
        int i2 = 2 % 2;
        int i3 = write + 69;
        connect = i3 % 128;
        int i4 = i3 % 2;
        this.INotificationSideChannel.b.setRepeatMode(i);
        int i5 = write + 35;
        connect = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[RenderMode.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public void setRepeatCount(int i) {
        int i2 = 2 % 2;
        int i3 = write + 101;
        connect = i3 % 128;
        int i4 = i3 % 2;
        this.INotificationSideChannel.b.setRepeatCount(i);
        int i5 = write + 113;
        connect = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void setImageAssetsFolder(String str) {
        int i = 2 % 2;
        int i2 = write + 41;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            this.INotificationSideChannel.asBinder = str;
            int i3 = 13 / 0;
        } else {
            this.INotificationSideChannel.asBinder = str;
        }
        int i4 = write + 71;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean TuitionPaymentFragmentbindingInflater1;
        float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int b;
        int d;
        int g;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = parcel.readString();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = parcel.readFloat();
            this.TuitionPaymentFragmentbindingInflater1 = parcel.readInt() == 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = parcel.readString();
            this.g = parcel.readInt();
            this.d = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            parcel.writeFloat(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            parcel.writeInt(this.TuitionPaymentFragmentbindingInflater1 ? 1 : 0);
            parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            parcel.writeInt(this.g);
            parcel.writeInt(this.d);
        }
    }

    public void setImageAssetDelegate(play playVar) {
        int i = 2 % 2;
        prepare prepareVar = this.INotificationSideChannel;
        prepareVar.g = playVar;
        MediaControllerCompatMediaControllerImplApi23 mediaControllerCompatMediaControllerImplApi23 = prepareVar.asInterface;
        if (mediaControllerCompatMediaControllerImplApi23 != null) {
            int i2 = connect + 87;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                mediaControllerCompatMediaControllerImplApi23.TuitionPaymentFragmentbindingInflater1 = playVar;
                throw null;
            }
            mediaControllerCompatMediaControllerImplApi23.TuitionPaymentFragmentbindingInflater1 = playVar;
            int i3 = connect + 65;
            write = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = connect + 23;
        write = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setFontAssetDelegate(playFromMediaId playfrommediaid) {
        int i = 2 % 2;
        prepare prepareVar = this.INotificationSideChannel;
        prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = playfrommediaid;
        MediaControllerCompatMediaControllerImplApi24 mediaControllerCompatMediaControllerImplApi24 = prepareVar.d;
        if (mediaControllerCompatMediaControllerImplApi24 != null) {
            int i2 = write + 39;
            connect = i2 % 128;
            if (i2 % 2 == 0) {
                mediaControllerCompatMediaControllerImplApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = playfrommediaid;
                throw null;
            }
            mediaControllerCompatMediaControllerImplApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = playfrommediaid;
        }
        int i3 = write + 69;
        connect = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setTextDelegate(setCaptioningEnabled setcaptioningenabled) {
        int i = 2 % 2;
        int i2 = write + 91;
        connect = i2 % 128;
        int i3 = i2 % 2;
        prepare prepareVar = this.INotificationSideChannel;
        if (i3 == 0) {
            prepareVar.RemoteActionCompatParcelizer = setcaptioningenabled;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        prepareVar.RemoteActionCompatParcelizer = setcaptioningenabled;
    }

    public void setScale(float f) {
        int i = 2 % 2;
        prepare prepareVar = this.INotificationSideChannel;
        prepareVar.notify = f;
        prepareVar.b();
        if (getDrawable() == this.INotificationSideChannel) {
            int i2 = connect + 73;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                setImageDrawable(null);
                setImageDrawable(this.INotificationSideChannel);
                throw null;
            }
            setImageDrawable(null);
            setImageDrawable(this.INotificationSideChannel);
        }
        int i3 = connect + 57;
        write = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        int i = 2 % 2;
        int i2 = connect + 51;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.setScaleType(scaleType);
        prepare prepareVar = this.INotificationSideChannel;
        if (prepareVar != null) {
            prepareVar.getInterfaceDescriptor = scaleType;
            int i4 = connect + 3;
            write = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        }
    }

    public void setFrame(int i) {
        int i2 = 2 % 2;
        int i3 = connect + 35;
        write = i3 % 128;
        int i4 = i3 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        int i5 = write + 109;
        connect = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setProgress(float f) {
        int i = 2 % 2;
        int i2 = write + 65;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f);
        int i4 = write + 13;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        previous previousVar;
        int i = 2 % 2;
        int i2 = connect + 117;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            prepare prepareVar = this.INotificationSideChannel;
            prepareVar.cancel = z;
            previousVar = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = 51 / 0;
            if (previousVar == null) {
                return;
            }
        } else {
            prepare prepareVar2 = this.INotificationSideChannel;
            prepareVar2.cancel = z;
            previousVar = prepareVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (previousVar == null) {
                return;
            }
        }
        previousVar.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        int i4 = write + 75;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setSafeMode(boolean z) {
        int i = 2 % 2;
        int i2 = write + 93;
        connect = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.cancelAll = z;
        int i4 = write + 5;
        connect = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        int i = 2 % 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
        super.buildDrawingCache(z);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 1) {
            int i2 = write + 123;
            connect = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 45 / 0;
                if (getWidth() > 0) {
                    if (getHeight() > 0) {
                        int i4 = connect + 49;
                        write = i4 % 128;
                        int i5 = i4 % 2;
                        if (getLayerType() == 1) {
                            int i6 = connect + 1;
                            write = i6 % 128;
                            int i7 = i6 % 2;
                            if (getDrawingCache(z) == null) {
                                setRenderMode(RenderMode.HARDWARE);
                                int i8 = connect + 99;
                                write = i8 % 128;
                                int i9 = i8 % 2;
                            }
                        }
                    }
                }
            } else if (getWidth() > 0) {
                if (getHeight() > 0) {
                    int i10 = connect + 49;
                    write = i10 % 128;
                    int i11 = i10 % 2;
                    if (getLayerType() == 1) {
                        int i12 = connect + 1;
                        write = i12 % 128;
                        int i13 = i12 % 2;
                        if (getDrawingCache(z) == null) {
                            setRenderMode(RenderMode.HARDWARE);
                            int i14 = connect + 99;
                            write = i14 % 128;
                            int i15 = i14 % 2;
                        }
                    }
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3--;
        int i16 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i16 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i16 - 1;
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        int i = 2 % 2;
        int i2 = connect + 21;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.getInterfaceDescriptor = renderMode;
        TuitionPaymentFragmentbindingInflater1();
        int i4 = connect + 119;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = connect + 41;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.INotificationSideChannel.f1323a = z;
        int i4 = connect + 47;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r1.INotificationSideChannel > 4) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void TuitionPaymentFragmentbindingInflater1() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int[] r1 = com.airbnb.lottie.LottieAnimationView.AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            com.airbnb.lottie.RenderMode r2 = r6.getInterfaceDescriptor
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L4b
            int r3 = com.airbnb.lottie.LottieAnimationView.write
            int r4 = r3 + 43
            int r5 = r4 % 128
            com.airbnb.lottie.LottieAnimationView.connect = r5
            int r4 = r4 % r0
            if (r1 == r0) goto L4a
            r4 = 3
            if (r1 == r4) goto L1f
            goto L4a
        L1f:
            previous r1 = r6.asInterface
            if (r1 == 0) goto L34
            int r3 = r3 + 15
            int r5 = r3 % 128
            com.airbnb.lottie.LottieAnimationView.connect = r5
            int r3 = r3 % r0
            boolean r1 = r1.f1325a
            if (r1 == 0) goto L34
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r1 < r3) goto L3d
        L34:
            previous r1 = r6.asInterface
            if (r1 == 0) goto L4b
            int r1 = r1.INotificationSideChannel
            r3 = 4
            if (r1 <= r3) goto L4b
        L3d:
            int r1 = com.airbnb.lottie.LottieAnimationView.write
            int r1 = r1 + 99
            int r3 = r1 % 128
            com.airbnb.lottie.LottieAnimationView.connect = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L4a
            r0 = 5
            int r0 = r0 % r4
        L4a:
            r0 = r2
        L4b:
            int r1 = r6.getLayerType()
            if (r0 == r1) goto L55
            r1 = 0
            r6.setLayerType(r0, r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.TuitionPaymentFragmentbindingInflater1():void");
    }

    static void b() {
        RemoteActionCompatParcelizer = -644165624519291154L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 107
            byte[] r0 = com.airbnb.lottie.LottieAnimationView.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.$$g(int, short, byte):java.lang.String");
    }
}
