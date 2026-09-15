package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.R;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
class MediaControllerCompatApi21 {

    public interface Callback {
        void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5);

        void onExtrasChanged(Bundle bundle);

        void onMetadataChanged(Object obj);

        void onPlaybackStateChanged(Object obj);

        void onQueueChanged(List<?> list);

        void onQueueTitleChanged(CharSequence charSequence);

        void onSessionDestroyed();

        void onSessionEvent(String str, Bundle bundle);
    }

    public static Object fromToken(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }

    public static void registerCallback(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    public static void unregisterCallback(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }

    public static void setMediaController(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    public static Object getMediaController(Activity activity) {
        return activity.getMediaController();
    }

    public static Object getSessionToken(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    public static Object getTransportControls(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    public static Object getPlaybackState(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    public static Object getMetadata(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    public static List<Object> getQueue(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    public static CharSequence getQueueTitle(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    public static Bundle getExtras(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    public static int getRatingType(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    public static long getFlags(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    public static Object getPlaybackInfo(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    public static PendingIntent getSessionActivity(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static void setVolumeTo(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    public static void adjustVolume(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    public static class TransportControls {
        private static short[] asBinder;
        private static final byte[] $$a = {42, -104, -68, 105};
        private static final int $$b = 83;
        private static int $10 = 0;
        private static int $11 = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f257a = 0;
        private static int asInterface = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -809538459702141182L;
        private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1969390730;
        private static int b = -1934795573;
        private static int d = -1921662874;
        private static byte[] g = {126, 23, 117, 24, 115, 14, 9, -68, 24, -19, 117, 24, 115, -18, 41, 44, ByteCompanionObject.MAX_VALUE, 124, 113, -32, 104, -31, -42, 121, -63, 124, -42, -33, 115, 121, -63, 113, -45, -51, -38, 103, -56, 121, -109, -49, -58, 96, -99, -43, 101, -61, -55, -8, -65, -54, -99, -54, -101, -45, 100, -54, -59, 97, -101, -45, 99, -63, -41, -58, -73, -106, -102, 23, 95, -45, -50, 102, -45, -104, -51, -94, -113, -100, -97, -102, -53, 99, -54, 117, 2, 89, -26, 0, 120, 8, 114, 124, 109, 92, Base64.padSymbol, 1, -68, -60, 120, 117, 13, 120, 3, 126, 73, 52, 7, 4, 1, 112, 8, 113, -47, -68, -126, -50, -36, -68, -56, -127, -71, 60, 74, 62, 97, 8, 54, 29, 17, 38, 28, 20, 89, 44, 121, -3, 8, 54, 10, 44, 18, 32, 29, -26, -124, -23, -19, -108, -22, -30, -107, -102, -75, -99, -98, -20, -54, -67, 45, -107, -102, -107, -94, 34, -110, -100, -32, -22, -123, -23, -27, 82, -38, -4, -126, -32, -26, -26, -26, -26, -26, -26, -26, -26, -26};

        private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
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
                int i3 = $10 + 49;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.resolveSize(0, 0) + 8328), 1235 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, -653973969, false, $$c((byte) ($$b & 63), b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.alpha(0) + 2764, 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1504416861, false, $$c((byte) ($$b & 61), b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - ExpandableListView.getPackedPositionType(0L)), 253 - TextUtils.getTrimmedLength(""), 22 - TextUtils.getCapsMode("", 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - Drawable.resolveOpacity(0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 2892, TextUtils.lastIndexOf("", '0') + 18, 2012627446, false, $$c((byte) ($$b & 62), b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i5 = $10 + 111;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
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

        public static void play(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 65;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).play();
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static void pause(Object obj) {
            int i = 2 % 2;
            int i2 = f257a + 9;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).pause();
            int i4 = asInterface + 73;
            f257a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
        }

        public static void stop(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 15;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).stop();
            if (i3 != 0) {
                int i4 = 35 / 0;
            }
            int i5 = asInterface + 67;
            f257a = i5 % 128;
            int i6 = i5 % 2;
        }

        public static void seekTo(Object obj, long j) {
            int i = 2 % 2;
            int i2 = f257a + 117;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).seekTo(j);
            int i4 = f257a + 75;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void fastForward(Object obj) {
            int i = 2 % 2;
            int i2 = f257a + 41;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).fastForward();
            int i4 = f257a + 69;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static void rewind(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 41;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).rewind();
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static void skipToNext(Object obj) {
            int i = 2 % 2;
            int i2 = f257a + 85;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).skipToNext();
            int i4 = asInterface + 19;
            f257a = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void skipToPrevious(Object obj) {
            int i = 2 % 2;
            int i2 = asInterface + 95;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).skipToPrevious();
            int i4 = asInterface + 109;
            f257a = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 80 / 0;
            }
        }

        public static void setRating(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = f257a + 25;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
            if (i3 != 0) {
                return;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public static void playFromMediaId(Object obj, String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = asInterface + 83;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
            if (i3 != 0) {
                int i4 = 33 / 0;
            }
            int i5 = f257a + 87;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static void playFromSearch(Object obj, String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = asInterface + 101;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public static void skipToQueueItem(Object obj, long j) {
            int i = 2 % 2;
            int i2 = asInterface + 105;
            f257a = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).skipToQueueItem(j);
            int i4 = f257a + 9;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void sendCustomAction(Object obj, String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = f257a + 123;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
            int i4 = asInterface + 73;
            f257a = i4 % 128;
            int i5 = i4 % 2;
        }

        private TransportControls() {
        }

        private static void e(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i7 = 2268 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i8 = 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte length = (byte) $$a.length;
                    byte b3 = (byte) (length - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i7, i8, 1387473586, false, $$c(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i9 = $11 + 13;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i11 = $11;
                    int i12 = i11 + 13;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr = g;
                    if (bArr != null) {
                        int i14 = i11 + 119;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i16])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 3357 - TextUtils.indexOf((CharSequence) "", '0', 0), 17 - Process.getGidForName(""), -1054011043, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i16] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        }
                        int i17 = $11 + 61;
                        $10 = i17 % 128;
                        i5 = 2;
                        int i18 = i17 % 2;
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = g;
                        Object[] objArr4 = new Object[i5];
                        objArr4[1] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        objArr4[0] = Integer.valueOf(i);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int packedPositionGroup = 2267 - ExpandableListView.getPackedPositionGroup(0L);
                            int scrollDefaultDelay = 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte length3 = (byte) $$a.length;
                            byte b6 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, packedPositionGroup, scrollDefaultDelay, 1387473586, false, $$c(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asBinder[i + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    int i19 = $11 + 51;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i4;
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(d), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 55905);
                        int i21 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2855;
                        int maximumFlingVelocity = 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte b7 = (byte) ($$b & 15);
                        byte b8 = (byte) (b7 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i21, maximumFlingVelocity, -1529949196, false, $$c(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = g;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        for (int i22 = 0; i22 < length4; i22++) {
                            bArr5[i22] = (byte) (((long) bArr4[i22]) ^ 3046761265686732006L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (!z) {
                            short[] sArr = asBinder;
                            int i23 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i23 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i23]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            byte[] bArr6 = g;
                            int i24 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i24 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i24]) ^ 3046761265686732006L)) + s)) ^ b2));
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r17v7 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v106 */
        /* JADX WARN: Type inference failed for: r2v107, types: [java.io.ByteArrayInputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v110, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v112, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v209 */
        /* JADX WARN: Type inference failed for: r2v216 */
        /* JADX WARN: Type inference failed for: r2v217 */
        /* JADX WARN: Type inference failed for: r2v218 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v66 */
        /* JADX WARN: Type inference failed for: r2v86 */
        /* JADX WARN: Type inference failed for: r4v166, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r8v216 */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
            int i3;
            ?? r2;
            int i4;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5;
            String str;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            ?? byteArrayInputStream = i2;
            int i12 = 2 % 2;
            int i13 = asInterface + 55;
            int i14 = i13 % 128;
            f257a = i14;
            int i15 = i13 % 2;
            if (context != null) {
                int i16 = (i14 ^ 99) + ((i14 & 99) << 1);
                asInterface = i16 % 128;
                int i17 = i16 % 2;
                try {
                    char[] cArr = {23091, 39146, 7292, 21437};
                    char[] cArr2 = {33661, 50100, 30370, 48787};
                    int i18 = -AndroidCharacter.getMirror('0');
                    char c = (char) ((i18 & 37798) + (i18 | 37798));
                    int i19 = f257a;
                    int i20 = (i19 ^ 15) + ((i19 & 15) << 1);
                    asInterface = i20 % 128;
                    if (i20 % 2 == 0) {
                        i4 = -(AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    } else {
                        i4 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                    int i21 = i4 * 71;
                    int i22 = ~i4;
                    int i23 = (i22 ^ (-1564232573)) | (i22 & (-1564232573));
                    int i24 = (i21 ^ 557865137) + ((i21 & 557865137) << 1) + (((~i23) | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | (-1564232573)))) * (-140));
                    int i25 = i4 | (-1564232573);
                    int i26 = (i25 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i25 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    int i27 = ~i;
                    int i28 = ((i27 ^ 161579028) | (i27 & 161579028)) * 1324;
                    int i29 = ((2127794883 | i28) << 1) - (2127794883 ^ i28);
                    int i30 = ~((1235874260 ^ i) | (1235874260 & i));
                    int i31 = ~((736201781 ^ i) | (736201781 & i));
                    int i32 = ((i30 ^ i31) | (i30 & i31)) * (-1324);
                    int i33 = (i29 ^ i32) + ((i29 & i32) << 1) + 662012886;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i34 = ~((243061899 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (243061899 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i35 = -(-((((-2147278016) ^ i34) | ((-2147278016) & i34)) * 576));
                    int i36 = (412911676 ^ i35) + ((412911676 & i35) << 1);
                    int i37 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i38 = ~((243061899 ^ i37) | (i37 & 243061899) | (-2140429368));
                    if (i33 <= i36 + (((6848648 ^ i38) | (i38 & 6848648)) * 576) + 118444032) {
                        i5 = i24 >>> (70 / (~i26));
                        int i39 = ~i4;
                        i23 = (i39 ^ (-1564232573)) | (i39 & (-1564232573));
                    } else {
                        i5 = (i24 - (~(-(-((~i26) * 70))))) - 1;
                    }
                    int i40 = ~i23;
                    int i41 = ~(1564232572 | i4);
                    int i42 = (i40 & i41) | (i40 ^ i41);
                    int i43 = asInterface;
                    int i44 = ((i43 | 59) << 1) - (i43 ^ 59);
                    f257a = i44 % 128;
                    if (i44 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        c(cArr, cArr2, c, i5 / (69 - (~(-(i42 | (~(i4 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)))))), new char[]{27820, 56780, 19862, 40045, 9275, 53549, 11992, 49321, 12525, 26937, 38199, 19912, 475, 32248, 22652, 27073, 47802, 58624, 49277, 19323, 18812, 18586, 52761, 16491, 49027, Typography.less, 11685, 541, 19290, 5716, 51615}, objArr);
                        str = (String) objArr[0];
                    } else {
                        int i45 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i46 = 70 * ((i42 & i45) | (i42 ^ i45));
                        Object[] objArr2 = new Object[1];
                        c(cArr, cArr2, c, (i5 ^ i46) + ((i5 & i46) << 1), new char[]{27820, 56780, 19862, 40045, 9275, 53549, 11992, 49321, 12525, 26937, 38199, 19912, 475, 32248, 22652, 27073, 47802, 58624, 49277, 19323, 18812, 18586, 52761, 16491, 49027, Typography.less, 11685, 541, 19290, 5716, 51615}, objArr2);
                        str = (String) objArr2[0];
                    }
                    int i47 = f257a + 85;
                    asInterface = i47 % 128;
                    if (i47 % 2 == 0) {
                        int i48 = 5 % 5;
                    }
                    try {
                        int threadPriority = Process.getThreadPriority(0);
                        Object[] objArr3 = new Object[1];
                        c(new char[]{23091, 39146, 7292, 21437}, new char[]{55733, 53066, 614, 34360}, (char) (((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6), (-2) - ((-TextUtils.indexOf((CharSequence) "", '0')) ^ (-1)), new char[]{55691, 29785, 44979, 45082, 49219, 59539, 37794, 59511, 46095, 6602, 15841, 38759, 4872, 14135, 43096, 56501, 57584, 38485, 64191, 1155, 38909, 6916, 16449, 54137, 51024, 2176, 53572, 30873, 58914, 15177, 8918, 16218, 7625, 55026, 62132, 16203, 23212, 9161}, objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(str);
                        int i49 = -TextUtils.indexOf("", "", 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i50 = i49 * 399;
                        int i51 = (i50 ^ 23238558) + ((i50 & 23238558) << 1);
                        int i52 = ~i49;
                        int i53 = ((-58243) ^ i49) | ((-58243) & i49);
                        int i54 = (~i53) | (~((i52 & 58242) | (i52 ^ 58242)));
                        int i55 = ~(((-58243) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | ((-58243) & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i56 = ((i51 + (((i54 ^ i55) | (i54 & i55)) * 398)) - (~(-(-(((i49 ^ 58242) | (i49 & 58242)) * (-1194)))))) - 1;
                        int i57 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i58 = ~((i57 & (-58243)) | ((-58243) ^ i57));
                        int i59 = ~i49;
                        int i60 = (~((i59 & 58242) | (i59 ^ 58242))) | i58;
                        int i61 = ~i53;
                        int i62 = -(-(((i60 & i61) | (i60 ^ i61)) * 398));
                        char c2 = (char) ((i56 ^ i62) + ((i62 & i56) << 1));
                        int i63 = -(-TextUtils.getCapsMode("", 0, 0));
                        Object[] objArr4 = new Object[1];
                        c(new char[]{23091, 39146, 7292, 21437}, new char[]{61009, 60759, 33376, 38627}, c2, ((i63 | 1626167278) << 1) - (i63 ^ 1626167278), new char[]{4715, 48349, 35675, 24407, 17665, 29943, 43799, 15953, 55533, 43860, 24613, 26976, 19937, 44171, 51760, 23562, 1959, 61608, 24788, 30750, 24149, 36340, 28523, 3257, 33063, 28096, 17612, 63080, 47705, 42520, 38804}, objArr4);
                        try {
                            Object[] objArr5 = {(String) objArr4[0]};
                            Object[] objArr6 = new Object[1];
                            c(new char[]{23091, 39146, 7292, 21437}, new char[]{55733, 53066, 614, 34360}, (char) View.getDefaultSize(0, 0), MotionEvent.axisFromString("") + 1, new char[]{55691, 29785, 44979, 45082, 49219, 59539, 37794, 59511, 46095, 6602, 15841, 38759, 4872, 14135, 43096, 56501, 57584, 38485, 64191, 1155, 38909, 6916, 16449, 54137, 51024, 2176, 53572, 30873, 58914, 15177, 8918, 16218, 7625, 55026, 62132, 16203, 23212, 9161}, objArr6);
                            Object objNewInstance2 = Class.forName((String) objArr6[0]).getDeclaredConstructor(String.class).newInstance(objArr5);
                            int i64 = asInterface + 121;
                            f257a = i64 % 128;
                            int i65 = i64 % 2;
                            try {
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i66 = iKeyCodeFromString * (-167);
                                int i67 = ((i66 | (-157929868)) << 1) - (i66 ^ (-157929868));
                                int i68 = f257a;
                                int i69 = (i68 & 31) + (31 | i68);
                                asInterface = i69 % 128;
                                if (i69 % 2 == 0) {
                                    int i70 = ~iKeyCodeFromString;
                                    int i71 = ~((i70 & (-103819157)) | (i70 ^ (-103819157)));
                                    int i72 = ~(((-103819157) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-103819157) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    i6 = i67 - (((i71 & i72) | (i71 ^ i72)) + 336);
                                    i7 = (103819156 & iKeyCodeFromString) | (iKeyCodeFromString ^ 103819156);
                                } else {
                                    int i73 = ~iKeyCodeFromString;
                                    int i74 = ~((i73 & (-103819157)) | (i73 ^ (-103819157)));
                                    int i75 = ~(((-103819157) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-103819157) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                    i6 = i67 + (((i74 & i75) | (i74 ^ i75)) * 336);
                                    i7 = 103819156 | iKeyCodeFromString;
                                }
                                int i76 = ~i7;
                                int i77 = ~((iKeyCodeFromString ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iKeyCodeFromString & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                int i78 = (-168) * ((i76 & i77) | (i76 ^ i77));
                                int i79 = ((i6 | i78) << 1) - (i78 ^ i6);
                                int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i81 = ~((iKeyCodeFromString & i80) | (i80 ^ iKeyCodeFromString));
                                int i82 = -(-((((-103819157) & i81) | ((-103819157) ^ i81)) * 168));
                                int i83 = (i79 & i82) + (i82 | i79);
                                int i84 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int i85 = (i84 & (-30972958)) + (i84 | (-30972958));
                                int i86 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                short s = (short) ((i86 & (-78)) + (i86 | (-78)));
                                int i87 = -(-Color.argb(0, 0, 0, 0));
                                Object[] objArr7 = new Object[1];
                                e(i83, i85, s, (i87 & (-22)) + (i87 | (-22)), (byte) ((-73) - (Process.myTid() >> 22)), objArr7);
                                Class<?> cls = Class.forName((String) objArr7[0]);
                                int i88 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i89 = ((i88 | 103819177) << 1) - (i88 ^ 103819177);
                                int iResolveSizeAndState = (-30972953) - View.resolveSizeAndState(0, 0, 0);
                                int i90 = -View.MeasureSpec.getMode(0);
                                short s2 = (short) ((i90 ^ (-102)) + ((i90 & (-102)) << 1));
                                int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i91 = offsetAfter * (-575);
                                int i92 = (i91 ^ 16100) + ((i91 & 16100) << 1);
                                int i93 = ~offsetAfter;
                                int i94 = ~((i93 ^ 27) | (i93 & 27));
                                int i95 = ~((27 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (27 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                                int i96 = (i94 & i95) | (i94 ^ i95);
                                int i97 = f257a + 33;
                                asInterface = i97 % 128;
                                int i98 = i97 % 2;
                                int i99 = i96 * 576;
                                int i100 = ((i92 | i99) << 1) - (i92 ^ i99);
                                int i101 = ~((i93 & (-28)) | (i93 ^ (-28)));
                                int i102 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                int i103 = ~((i102 & 27) | (27 ^ i102) | offsetAfter);
                                int i104 = ((i103 & i101) | (i101 ^ i103)) * 576;
                                int i105 = ((i100 | i104) << 1) - (i104 ^ i100);
                                int i106 = ~offsetAfter;
                                int i107 = (i105 - (~((~((i106 & 27) | (i106 ^ 27))) * 576))) - 1;
                                int i108 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                Object[] objArr8 = new Object[1];
                                e(i89, iResolveSizeAndState, s2, i107, (byte) (((i108 | (-57)) << 1) - (i108 ^ (-57))), objArr8);
                                Object objInvoke = cls.getMethod((String) objArr8[0], null).invoke(context, null);
                                try {
                                    int threadPriority2 = Process.getThreadPriority(0);
                                    int i109 = 103819155 - (~(-(((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6)));
                                    int i110 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i111 = (i110 ^ (-30972959)) + ((i110 & (-30972959)) << 1);
                                    int i112 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                    short s3 = (short) ((i112 & (-78)) + (i112 | (-78)));
                                    int i113 = (-22) - (~(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                    int i114 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    Object[] objArr9 = new Object[1];
                                    e(i109, i111, s3, i113, (byte) ((i114 ^ (-73)) + ((i114 & (-73)) << 1)), objArr9);
                                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                                    int i115 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                    int i116 = (i115 & 103819194) + (i115 | 103819194);
                                    int i117 = (-14195738) - (~Color.rgb(0, 0, 0));
                                    int i118 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                                    short s4 = (short) (((i118 | (-85)) << 1) - (i118 ^ (-85)));
                                    int i119 = (-32) - (~(-Color.blue(0)));
                                    int iMyPid = Process.myPid() >> 22;
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i120 = (iMyPid * 319) + 12680;
                                    int i121 = ~iMyPid;
                                    Object obj = objNewInstance2;
                                    int i122 = f257a + 41;
                                    Object obj2 = objNewInstance;
                                    int i123 = i122 % 128;
                                    asInterface = i123;
                                    int i124 = i122 % 2;
                                    int i125 = ~((i121 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i121 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i126 = -(-((-318) * ((39 ^ i125) | (i125 & 39))));
                                    int i127 = (i120 & i126) + (i126 | i120);
                                    int i128 = ~((39 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (39 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i129 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                    int i130 = ~((i129 ^ iMyPid) | (i129 & iMyPid) | (-40));
                                    int i131 = (i127 - (~(((i128 ^ i130) | (i130 & i128)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))) - 1;
                                    int i132 = i129 | 39;
                                    int i133 = ~((i132 & iMyPid) | (i132 ^ iMyPid));
                                    int i134 = (iMyPid & (-40)) | (iMyPid ^ (-40));
                                    int i135 = (i123 ^ 83) + ((i123 & 83) << 1);
                                    f257a = i135 % 128;
                                    int i136 = i135 % 2;
                                    int i137 = ~((i134 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i134 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                    int i138 = TypedValues.AttributesType.TYPE_PIVOT_TARGET * ((i133 & i137) | (i133 ^ i137));
                                    byte b2 = (byte) ((i131 ^ i138) + ((i138 & i131) << 1));
                                    try {
                                        Object[] objArr10 = new Object[1];
                                        e(i116, i117, s4, i119, b2, objArr10);
                                        byteArrayInputStream = 2;
                                        try {
                                            Object[] objArr11 = {cls2.getMethod((String) objArr10[0], null).invoke(context, null), 64};
                                            int iGreen = Color.green(0);
                                            int i139 = (iGreen & 103819207) + (iGreen | 103819207);
                                            int i140 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i141 = i140 * 273;
                                            int i142 = (i141 & (-196262703)) + (i141 | (-196262703));
                                            int i143 = ~i140;
                                            int i144 = asInterface + 115;
                                            f257a = i144 % 128;
                                            int i145 = i144 % 2;
                                            int i146 = (i143 & 30972958) | (i143 ^ 30972958);
                                            int i147 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                            int i148 = ~((i146 & i147) | (i146 ^ i147));
                                            int i149 = (i140 ^ (-30972959)) | (i140 & (-30972959));
                                            int i150 = ~((i149 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i149 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                            int i151 = (-272) * ((i148 & i150) | (i148 ^ i150));
                                            int i152 = ((i142 | i151) << 1) - (i142 ^ i151);
                                            int i153 = ~i140;
                                            int i154 = ~((i153 ^ (-30972959)) | (i153 & (-30972959)));
                                            int i155 = ~((i153 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i153 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                            int i156 = ((i155 & i154) | (i154 ^ i155)) * (-272);
                                            int i157 = ~((i140 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i140 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                            int i158 = (i152 ^ i156) + ((i152 & i156) << 1) + (((i157 & (-30972959)) | ((-30972959) ^ i157)) * 272);
                                            short s5 = (short) ((-88) - (~(-TextUtils.indexOf("", ""))));
                                            int iGreen2 = Color.green(0);
                                            int i159 = iGreen2 * (-183);
                                            int i160 = (i159 & (-2220)) + (i159 | (-2220));
                                            int i161 = ~iGreen2;
                                            int i162 = ~((i161 ^ (-12)) | (i161 & (-12)));
                                            int i163 = ~(i27 | (-12));
                                            int i164 = -(-(((i162 & i163) | (i162 ^ i163)) * 184));
                                            int i165 = (i160 ^ i164) + ((i160 & i164) << 1);
                                            int i166 = ~((iGreen2 & 11) | (11 ^ iGreen2));
                                            int i167 = ((i166 & i) | (i ^ i166)) * (-184);
                                            int i168 = (((i165 & i167) + (i167 | i165)) - (~(-(-((~((i161 ^ i27) | (i161 & i27))) * 184))))) - 1;
                                            int defaultSize = View.getDefaultSize(0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i169 = f257a;
                                            int i170 = (i169 & 29) + (i169 | 29);
                                            asInterface = i170 % 128;
                                            int i171 = i170 % 2;
                                            int i172 = ~defaultSize;
                                            int i173 = (((defaultSize * (-716)) - 57400) - (~((((-40) ^ i172) | ((-40) & i172)) * (-1434)))) - 1;
                                            int i174 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                            int i175 = ~((i174 ^ (-40)) | (i174 & (-40)));
                                            int i176 = (defaultSize ^ (-40)) | (defaultSize & (-40));
                                            int i177 = ~i176;
                                            int i178 = (i175 ^ i177) | (i175 & i177);
                                            int i179 = (~defaultSize) | 39;
                                            int i180 = ~((i179 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i179 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                            int i181 = ((i180 & i178) | (i178 ^ i180)) * 717;
                                            int i182 = (i173 & i181) + (i181 | i173);
                                            int i183 = (i172 ^ 39) | (39 & i172);
                                            int i184 = ~((i183 & i174) | (i183 ^ i174));
                                            int i185 = ~i176;
                                            byte b3 = (byte) ((i182 - (~(-(-((((i184 & i185) | (i184 ^ i185)) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-40)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ (-40))))) * 717))))) - 1);
                                            Object[] objArr12 = new Object[1];
                                            e(i139, i158, s5, i168, b3, objArr12);
                                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                                            Object[] objArr13 = new Object[1];
                                            c(new char[]{23091, 39146, 7292, 21437}, new char[]{55536, 5432, 23271, 50989}, (char) (11609 - ExpandableListView.getPackedPositionChild(0L)), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{49593, 4942, 15534, 15941, 20861, 48614, 40265, 54165, 15989, 24051, 5603, 56496, 4149, 6020}, objArr13);
                                            byteArrayInputStream = objInvoke;
                                            Object objInvoke2 = cls3.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(byteArrayInputStream, objArr11);
                                            try {
                                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 103819240;
                                                int i186 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                int i187 = (i186 & (-30972959)) + (i186 | (-30972959));
                                                int i188 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                                Object[] objArr14 = new Object[1];
                                                e(packedPositionChild, i187, (short) ((i188 ^ 62) + ((i188 & 62) << 1)), View.MeasureSpec.makeMeasureSpec(0, 0) - 15, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 37), objArr14);
                                                Class<?> cls4 = Class.forName((String) objArr14[0]);
                                                int i189 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                                int i190 = (i189 ^ 103819268) + ((i189 & 103819268) << 1);
                                                int i191 = (-30972942) - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
                                                short sBlue = (short) (56 - Color.blue(0));
                                                int iAxisFromString = MotionEvent.axisFromString("");
                                                Object[] objArr15 = new Object[1];
                                                e(i190, i191, sBlue, ((iAxisFromString | (-34)) << 1) - (iAxisFromString ^ (-34)), (byte) (96 - (~(-KeyEvent.normalizeMetaState(0)))), objArr15);
                                                Object[] objArr16 = (Object[]) cls4.getField((String) objArr15[0]).get(objInvoke2);
                                                int i192 = 0;
                                                byteArrayInputStream = objArr16.length;
                                                while (true) {
                                                    if (i192 < byteArrayInputStream) {
                                                        Object obj3 = objArr16[i192];
                                                        int mode = View.MeasureSpec.getMode(0);
                                                        int i193 = (mode ^ 103819277) + ((103819277 & mode) << 1);
                                                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 30972968;
                                                        int i194 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        short s6 = (short) (((i194 | (-65)) << 1) - (i194 ^ (-65)));
                                                        int i195 = -(-TextUtils.getOffsetAfter("", 0));
                                                        int i196 = (i195 & (-40)) + (i195 | (-40));
                                                        int i197 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i198 = ((i197 * 495) - (-55216)) + (((i197 ^ 111) | (i197 & 111)) * (-988));
                                                        int i199 = f257a + 23;
                                                        asInterface = i199 % 128;
                                                        if (i199 % 2 == 0) {
                                                            int i200 = ~i197;
                                                            int i201 = (i200 ^ (-112)) | (i200 & (-112));
                                                            int i202 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                            i8 = i198 * (494 << ((i201 ^ i202) | (i201 & i202)));
                                                        } else {
                                                            int i203 = ~i197;
                                                            int i204 = (i203 & (-112)) | (i203 ^ (-112));
                                                            int i205 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                            int i206 = -(-(((i204 ^ i205) | (i204 & i205)) * 494));
                                                            i8 = ((i198 | i206) << 1) - (i198 ^ i206);
                                                        }
                                                        int i207 = ~i197;
                                                        int i208 = ~((i207 & 111) | (i207 ^ 111));
                                                        int i209 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                                        int i210 = ~((i209 & (-112)) | (i209 ^ (-112)));
                                                        int i211 = -(-(494 * ((~((i197 & (-112)) | (i197 ^ (-112)))) | (i210 & i208) | (i208 ^ i210))));
                                                        Object[] objArr17 = new Object[1];
                                                        e(i193, maximumDrawingCacheSize, s6, i196, (byte) (((i8 | i211) << 1) - (i211 ^ i8)), objArr17);
                                                        try {
                                                            Object[] objArr18 = {(String) objArr17[0]};
                                                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                                                            int defaultSize2 = View.getDefaultSize(0, 0);
                                                            Object[] objArr19 = new Object[1];
                                                            c(new char[]{23091, 39146, 7292, 21437}, new char[]{10034, 458, 4366, 30586}, cArgb, ((defaultSize2 | 234998311) << 1) - (234998311 ^ defaultSize2), new char[]{2088, 47428, 40221, 54696, 17803, 51005, 49210, 7598, 3665, 27012, 14511, 53458, 64261, 56725, 38845, 56023, 18952, 42315, 45186, 39645, 46450, 28788, 59388, 27940, 60604, 7629, 'z', 56021, 39348, 46710, 37887, 37682, 52636, 13114, 57335, 20686, 9347}, objArr19);
                                                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                                                            char[] cArr3 = {23091, 39146, 7292, 21437};
                                                            char[] cArr4 = {21717, 41652, 14122, 8874};
                                                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                            int i212 = -Color.red(0);
                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                            int i213 = ~i212;
                                                            Object[] objArr20 = objArr16;
                                                            int i214 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                            ?? r17 = byteArrayInputStream;
                                                            int i215 = ~(i213 | i214);
                                                            int i216 = i192;
                                                            int i217 = ~((-715306069) | i212);
                                                            int i218 = (i215 ^ i217) | (i215 & i217);
                                                            int i219 = ~((i212 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i212 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                            int i220 = ((i212 * (-337)) - (-1970588476)) + (((i218 ^ i219) | (i218 & i219)) * (-338));
                                                            int i221 = asInterface + 95;
                                                            f257a = i221 % 128;
                                                            int i222 = i221 % 2;
                                                            int i223 = 338 * (~((i213 ^ 715306068) | (i213 & 715306068)));
                                                            int i224 = (i220 & i223) + (i220 | i223);
                                                            int i225 = ~((i214 & i213) | (i213 ^ i214));
                                                            int i226 = ~((715306068 & i212) | (i212 ^ 715306068) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                                            int i227 = ((i225 & i226) | (i225 ^ i226)) * 338;
                                                            int i228 = ((i224 | i227) << 1) - (i227 ^ i224);
                                                            Object[] objArr21 = new Object[1];
                                                            c(cArr3, cArr4, windowTouchSlop, i228, new char[]{46020, 49463, 9719, 32207, 51831, 39353, 31308, 1494, 62810, 53122, 46059}, objArr21);
                                                            byteArrayInputStream = 0;
                                                            Object objInvoke3 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr18);
                                                            try {
                                                                int i229 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                Object[] objArr22 = new Object[1];
                                                                c(new char[]{23091, 39146, 7292, 21437}, new char[]{41750, 24509, 57820, 58863}, (char) (((i229 | 61410) << 1) - (i229 ^ 61410)), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{57592, 13808, 8288, 19848, 741, 24877, 17416, 53040, 22018, 38586, 40706, 63244, 61838, 1660, 15982, 29241, 23634, 11668, 12572, 57302, 45113, 34836, 15199, 14664, 49535, 59720, 25884, 30378}, objArr22);
                                                                Class<?> cls6 = Class.forName((String) objArr22[0]);
                                                                char threadPriority3 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                                int i230 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                                                Object[] objArr23 = new Object[1];
                                                                c(new char[]{23091, 39146, 7292, 21437}, new char[]{17011, 62882, 29066, 42663}, threadPriority3, (i230 & (-1963613631)) + (i230 | (-1963613631)), new char[]{16178, 36461, 30358, 1572, 60235, 22946, 53482, 32823, 12343, 53686, 39351}, objArr23);
                                                                byteArrayInputStream = new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr23[0], null).invoke(obj3, null));
                                                                try {
                                                                    byteArrayInputStream = new Object[]{byteArrayInputStream};
                                                                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                                                    int i231 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                                                    Object[] objArr24 = new Object[1];
                                                                    c(new char[]{23091, 39146, 7292, 21437}, new char[]{10034, 458, 4366, 30586}, cLastIndexOf, (i231 & 234998311) + (i231 | 234998311), new char[]{2088, 47428, 40221, 54696, 17803, 51005, 49210, 7598, 3665, 27012, 14511, 53458, 64261, 56725, 38845, 56023, 18952, 42315, 45186, 39645, 46450, 28788, 59388, 27940, 60604, 7629, 'z', 56021, 39348, 46710, 37887, 37682, 52636, 13114, 57335, 20686, 9347}, objArr24);
                                                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                                                    int i232 = -(-Color.red(0));
                                                                    int i233 = ((i232 | 103819281) << 1) - (i232 ^ 103819281);
                                                                    int i234 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                    int i235 = ((i234 | (-30972952)) << 1) - (i234 ^ (-30972952));
                                                                    int size = View.MeasureSpec.getSize(0);
                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                    int i236 = (-90710) - (~(-(-(size * (-963)))));
                                                                    int i237 = ~size;
                                                                    int i238 = ~((92 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (92 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                                                    int i239 = -(-(((i237 & i238) | (i237 ^ i238)) * (-964)));
                                                                    int i240 = (i236 ^ i239) + ((i239 & i236) << 1);
                                                                    int i241 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                                    int i242 = -(-(((~((i241 & 92) | (92 ^ i241))) | (~((size & 92) | (92 ^ size)))) * (-964)));
                                                                    short s7 = (short) ((i240 & i242) + (i242 | i240));
                                                                    int i243 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                                    int i244 = ~i243;
                                                                    int i245 = ~(i244 | i27);
                                                                    int i246 = (((i243 * 236) - 11775) - (~(((i245 & (-25)) | (i245 ^ (-25))) * (-235)))) - 1;
                                                                    int i247 = ~(i244 | i);
                                                                    int i248 = -(-(((i247 & (-25)) | (i247 ^ (-25))) * (-470)));
                                                                    int i249 = (i246 ^ i248) + ((i246 & i248) << 1);
                                                                    int i250 = ~((i243 & 24) | (24 ^ i243));
                                                                    int i251 = (i244 ^ (-25)) | (i244 & (-25));
                                                                    int i252 = ~((i251 & i) | (i251 ^ i));
                                                                    int i253 = ((i250 & i252) | (i250 ^ i252)) * 235;
                                                                    int i254 = (i249 & i253) + (i253 | i249);
                                                                    int i255 = -Color.blue(0);
                                                                    int i256 = i255 * (-115);
                                                                    int i257 = ((((i256 & (-11040)) + (i256 | (-11040))) - (~(-(-((~(((i27 ^ i255) | (i27 & i255)) | 96)) * (-116)))))) - 1) + (((i255 ^ i) | (i255 & i)) * 116);
                                                                    int i258 = ~i255;
                                                                    int i259 = -(-(((~((i258 & (-97)) | (i258 ^ (-97)))) | (~((-97) | i))) * 116));
                                                                    byte b4 = (byte) (((i257 | i259) << 1) - (i259 ^ i257));
                                                                    Object[] objArr25 = new Object[1];
                                                                    e(i233, i235, s7, i254, b4, objArr25);
                                                                    Object objInvoke4 = cls7.getMethod((String) objArr25[0], InputStream.class).invoke(objInvoke3, byteArrayInputStream);
                                                                    try {
                                                                        byteArrayInputStream = View.resolveSizeAndState(0, 0, 0);
                                                                        int i260 = byteArrayInputStream * 217;
                                                                        int i261 = (i260 & (-846312805)) + (i260 | (-846312805));
                                                                        int i262 = -(-((~((byteArrayInputStream ^ i) | (byteArrayInputStream & i))) * 216));
                                                                        int i263 = ((i261 | i262) << 1) - (i262 ^ i261);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i264 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                                                        int i265 = (-720727762) + (((i264 & 543745012) | (543745012 ^ i264)) * 495);
                                                                        int i266 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                                                        int i267 = ((~((i266 & 543745012) | (i266 ^ 543745012))) | 4768132) * 495;
                                                                        int i268 = (i265 ^ i267) + ((i267 & i265) << 1);
                                                                        int i269 = (1879189792 & i27) | (i27 ^ 1879189792);
                                                                        int i270 = 518711698 - (~(-(-(((i269 & (-2063597502)) | (i269 ^ (-2063597502))) * 1444))));
                                                                        int i271 = ~(2016029101 | i);
                                                                        int i272 = (i271 & (-2063597502)) | ((-2063597502) ^ i271);
                                                                        int i273 = ~(1926758192 | i);
                                                                        if (i268 <= (i270 - (~(((i272 & i273) | (i272 ^ i273)) * (-1444)))) - 1620279) {
                                                                            int i274 = ((-103819300) & byteArrayInputStream) | (byteArrayInputStream ^ (-103819300));
                                                                            int i275 = ~i;
                                                                            int i276 = ~(byteArrayInputStream | i275);
                                                                            i9 = (i263 >> ((-216) % ((i274 & i275) | (i274 ^ i275)))) >> (216 >>> ((i276 & 103819299) | (i276 ^ 103819299)));
                                                                        } else {
                                                                            int i277 = (-103819300) | byteArrayInputStream;
                                                                            i9 = (((i263 - (~(((i277 & i27) | (i277 ^ i27)) * (-216)))) - 1) - (~(((~((byteArrayInputStream & i27) | ((i27 ^ byteArrayInputStream) == true ? 1 : 0))) | 103819299) * 216))) - 1;
                                                                        }
                                                                        int iIndexOf = TextUtils.indexOf("", "");
                                                                        int i278 = i9;
                                                                        int i279 = ~i;
                                                                        int i280 = ~((i279 & 30972949) | (30972949 ^ i279));
                                                                        int i281 = ~((30972949 ^ iIndexOf) | (30972949 & iIndexOf));
                                                                        int i282 = (((iIndexOf * 50) - 1290591146) - (~(((i280 & i281) | (i280 ^ i281)) * 98))) - 1;
                                                                        int i283 = ~((~iIndexOf) | i27);
                                                                        int i284 = (i283 & 30972949) | (30972949 ^ i283);
                                                                        int i285 = ~((iIndexOf ^ i) | (iIndexOf & i));
                                                                        int i286 = ((i284 & i285) | (i284 ^ i285)) * (-49);
                                                                        int i287 = (i282 & i286) + (i282 | i286);
                                                                        int i288 = ~((30972949 ^ i) | (30972949 & i));
                                                                        int i289 = f257a + 11;
                                                                        asInterface = i289 % 128;
                                                                        int i290 = i289 % 2;
                                                                        int i291 = ((iIndexOf & (-30972950)) | (iIndexOf ^ (-30972950))) ^ (-1);
                                                                        int i292 = 49 * ((i288 & i291) | (i288 ^ i291));
                                                                        int i293 = (i287 ^ i292) + ((i292 & i287) << 1);
                                                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i294 = (iIndexOf2 * 302) + 39195;
                                                                        int i295 = ~iIndexOf2;
                                                                        int i296 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                                        int i297 = ~(i295 | i296);
                                                                        int i298 = ((i297 & 65) | (i297 ^ 65)) * (-602);
                                                                        int i299 = (i294 & i298) + (i294 | i298);
                                                                        int i300 = ~((i295 ^ (-66)) | (i295 & (-66)));
                                                                        int i301 = ~iIndexOf2;
                                                                        int i302 = i300 | (~((i301 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (i301 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13)));
                                                                        int i303 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
                                                                        int i304 = (i303 & iIndexOf2) | (i303 ^ iIndexOf2);
                                                                        int i305 = -(-(((~((i304 & 65) | (i304 ^ 65))) | i302) * (-301)));
                                                                        short s8 = (short) ((((i299 | i305) << 1) - (i305 ^ i299)) + ((~((i296 ^ 65) | (i296 & 65))) * 301));
                                                                        int i306 = (-13) - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                                                        int i307 = -TextUtils.indexOf("", "", 0, 0);
                                                                        byte b5 = (byte) ((i307 ^ (-79)) + ((i307 & (-79)) << 1));
                                                                        Object[] objArr26 = new Object[1];
                                                                        e(i278, i293, s8, i306, b5, objArr26);
                                                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                        char[] cArr5 = {23091, 39146, 7292, 21437};
                                                                        int i308 = asInterface;
                                                                        int i309 = (i308 & 69) + (i308 | 69);
                                                                        f257a = i309 % 128;
                                                                        int i310 = i309 % 2;
                                                                        char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                                                                        int i311 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                        Object[] objArr27 = new Object[1];
                                                                        c(cArr5, new char[]{21214, 63228, 11156, 30177}, offsetAfter2, (i311 ^ (-1795752878)) + ((i311 & (-1795752878)) << 1), new char[]{18565, 8889, 59007, 3457, 26930, 65082, 58388, 12457, 47966, 38880, 31705, 32935, 43899, 46698, 64003, 1454, 27889, 12163, 13166, 26540, 16162, 39915, 26084}, objArr27);
                                                                        Object objInvoke5 = cls8.getMethod((String) objArr27[0], null).invoke(objInvoke4, null);
                                                                        Object obj4 = obj2;
                                                                        if (!obj4.equals(objInvoke5)) {
                                                                            int i312 = asInterface;
                                                                            int i313 = ((i312 | 25) << 1) - (i312 ^ 25);
                                                                            f257a = i313 % 128;
                                                                            int i314 = i313 % 2;
                                                                            try {
                                                                                int i315 = -Color.rgb(0, 0, 0);
                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                int i316 = ~i315;
                                                                                int i317 = ((-87042084) & i316) | (i316 ^ (-87042084));
                                                                                int i318 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                                                                int i319 = (((i315 * 69) - 1536852265) - (~((((~(i315 | 87042083)) | (~((i317 & i318) | (i317 ^ i318)))) | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault14 ^ 87042083) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & 87042083)))) * (-68)))) - 1;
                                                                                int i320 = -(-((~(i316 | i318 | 87042083)) * (-68)));
                                                                                int i321 = ((i319 | i320) << 1) - (i319 ^ i320);
                                                                                int i322 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                                                                                int i323 = ~((i322 & (-87042084)) | ((-87042084) ^ i322));
                                                                                int i324 = -(-(((i323 & i316) | (i316 ^ i323)) * 68));
                                                                                int i325 = (i321 & i324) + (i324 | i321);
                                                                                int i326 = f257a + 69;
                                                                                asInterface = i326 % 128;
                                                                                int i327 = i326 % 2;
                                                                                int iLastIndexOf = (-30972951) - TextUtils.lastIndexOf("", '0', 0);
                                                                                int i328 = -TextUtils.getOffsetAfter("", 0);
                                                                                short s9 = (short) ((i328 & 64) + (i328 | 64));
                                                                                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                int i329 = pressedStateDuration * 375;
                                                                                int i330 = (i329 & 8217) + (i329 | 8217);
                                                                                int i331 = ~pressedStateDuration;
                                                                                int i332 = ~((i331 ^ (-11)) | (i331 & (-11)));
                                                                                int i333 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault15;
                                                                                int i334 = ~(i333 | pressedStateDuration);
                                                                                int i335 = ((i332 ^ i334) | (i332 & i334)) * (-374);
                                                                                int i336 = (i330 & i335) + (i330 | i335) + ((~((10 & pressedStateDuration) | (10 ^ pressedStateDuration))) * 748);
                                                                                int i337 = ((~(pressedStateDuration | i333)) | (~(i331 | 10))) * 374;
                                                                                int i338 = (i336 & i337) + (i337 | i336);
                                                                                int i339 = -TextUtils.indexOf("", "");
                                                                                byte b6 = (byte) ((i339 ^ (-79)) + ((i339 & (-79)) << 1));
                                                                                Object[] objArr28 = new Object[1];
                                                                                e(i325, iLastIndexOf, s9, i338, b6, objArr28);
                                                                                Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                                int i340 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                                                int i341 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                                Object[] objArr29 = new Object[1];
                                                                                c(new char[]{23091, 39146, 7292, 21437}, new char[]{21214, 63228, 11156, 30177}, (char) (((i340 | 1) << 1) - (i340 ^ 1)), ((i341 | (-1795752879)) << 1) - (i341 ^ (-1795752879)), new char[]{18565, 8889, 59007, 3457, 26930, 65082, 58388, 12457, 47966, 38880, 31705, 32935, 43899, 46698, 64003, 1454, 27889, 12163, 13166, 26540, 16162, 39915, 26084}, objArr29);
                                                                                Object objInvoke6 = cls9.getMethod((String) objArr29[0], null).invoke(objInvoke4, null);
                                                                                Object obj5 = obj;
                                                                                if (!obj5.equals(objInvoke6)) {
                                                                                    obj2 = obj4;
                                                                                    obj = obj5;
                                                                                    byteArrayInputStream = r17 == true ? 1 : 0;
                                                                                    i192 = ((i216 | 1) << 1) - (i216 ^ 1);
                                                                                    objArr16 = objArr20;
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                Throwable cause = th.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        int i342 = (i & (-2)) | (i27 & 1);
                                                                        Object[] objArr30 = new Object[4];
                                                                        int[] iArr = new int[1];
                                                                        objArr30[0] = iArr;
                                                                        objArr30[1] = new int[1];
                                                                        int[] iArr2 = new int[1];
                                                                        objArr30[2] = iArr2;
                                                                        int i343 = f257a;
                                                                        int i344 = (i343 & 61) + (i343 | 61);
                                                                        asInterface = i344 % 128;
                                                                        int i345 = i344 % 2;
                                                                        iArr[0] = i;
                                                                        iArr2[0] = i342;
                                                                        objArr30[3] = null;
                                                                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                                                        int i346 = ~iUptimeMillis;
                                                                        int i347 = 775293332 + ((iUptimeMillis | (-305322708)) * 140) + (((~((-305322708) | i346)) | 269537408) * (-280)) + (((~(iUptimeMillis | (-269537409))) | (~(345632936 | i346)) | (-381418236)) * 140);
                                                                        int i348 = f257a + 87;
                                                                        asInterface = i348 % 128;
                                                                        if (i348 % 2 == 0) {
                                                                            int i349 = i347 % 16;
                                                                            int i350 = (i2 & i349) + (i2 | i349);
                                                                            int i351 = i350 % 60;
                                                                            int i352 = ((~i350) & i351) | ((~i351) & i350);
                                                                            int i353 = i352 << 89;
                                                                            i10 = (i352 | i353) & (~(i352 & i353));
                                                                            i11 = i10 << 4;
                                                                        } else {
                                                                            int i354 = -(-(i347 + 16));
                                                                            int i355 = ((i2 | i354) << 1) - (i354 ^ i2);
                                                                            int i356 = i355 << 13;
                                                                            int i357 = (i356 & (~i355)) | ((~i356) & i355);
                                                                            int i358 = i357 >>> 17;
                                                                            i10 = ((~i357) & i358) | ((~i358) & i357);
                                                                            i11 = i10 << 5;
                                                                        }
                                                                        ((int[]) objArr30[1])[0] = i10 ^ i11;
                                                                        return objArr30;
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
                                                    byteArrayInputStream = i2;
                                                    i3 = 4;
                                                    r2 = byteArrayInputStream;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable cause7 = th.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause8 = th9.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause9 = th10.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th10;
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused2) {
                }
            } else {
                i3 = 4;
                r2 = byteArrayInputStream;
            }
            Object[] objArr31 = new Object[i3];
            objArr31[0] = new int[]{i};
            objArr31[1] = new int[1];
            int i359 = f257a;
            int i360 = (i359 & 53) + (i359 | 53);
            asInterface = i360 % 128;
            int i361 = i360 % 2;
            objArr31[2] = new int[]{i};
            int i362 = i359 + 101;
            asInterface = i362 % 128;
            int i363 = i362 % 2;
            objArr31[3] = null;
            int i364 = (((~(i | 940255422)) | (-899945194)) * 56) + 1073107260 + (((~((~i) | (-899945194))) | 940255422) * 56);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = R.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i365 = i364 * 866;
            int i366 = r2 * (-864);
            int i367 = (i365 ^ i366) + ((i365 & i366) << 1);
            int i368 = ~r2;
            int i369 = ~i364;
            int i370 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            int i371 = -(-(((~(i369 | i370)) | i368) * (-865)));
            int i372 = ((((i367 | i371) << 1) - (i371 ^ i367)) - (~((~(i364 | iTuitionPaymentFragmentspecialinlinedviewModeldefault16)) * 865))) - 1;
            int i373 = ~(i368 | i370);
            int i374 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            int i375 = -(-(((~((i374 & i364) | (i374 ^ i364))) | i373) * 865));
            int i376 = (i372 ^ i375) + ((i375 & i372) << 1);
            int i377 = i376 << 13;
            int i378 = (i377 | i376) & (~(i376 & i377));
            int i379 = i378 ^ (i378 >>> 17);
            int i380 = i379 << 5;
            ((int[]) objArr31[1])[0] = (i379 | i380) & (~(i379 & i380));
            return objArr31;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(int r6, short r7, short r8) {
            /*
                int r6 = 121 - r6
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r0 = android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r7]
            L24:
                int r6 = r6 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.$$c(int, short, short):java.lang.String");
        }
    }

    public static void sendCommand(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    public static String getPackageName(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    public static class PlaybackInfo {
        private static final int FLAG_SCO = 4;
        private static final int STREAM_BLUETOOTH_SCO = 6;
        private static final int STREAM_SYSTEM_ENFORCED = 7;

        public static int getPlaybackType(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        public static AudioAttributes getAudioAttributes(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int getLegacyAudioStream(Object obj) {
            return toLegacyStreamType(getAudioAttributes(obj));
        }

        public static int getVolumeControl(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }

        public static int getMaxVolume(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        public static int getCurrentVolume(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }

        private static int toLegacyStreamType(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }

        private PlaybackInfo() {
        }
    }

    static class CallbackProxy<T extends Callback> extends MediaController.Callback {
        protected final T mCallback;

        public CallbackProxy(T t) {
            this.mCallback = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.mCallback.onSessionDestroyed();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onSessionEvent(str, bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.mCallback.onPlaybackStateChanged(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.mCallback.onMetadataChanged(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.mCallback.onQueueChanged(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.mCallback.onQueueTitleChanged(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onExtrasChanged(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.mCallback.onAudioInfoChanged(playbackInfo.getPlaybackType(), PlaybackInfo.getLegacyAudioStream(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
    }

    private MediaControllerCompatApi21() {
    }
}
