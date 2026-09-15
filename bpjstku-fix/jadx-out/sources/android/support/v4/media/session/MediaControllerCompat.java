package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.BundleCompat;
import androidx.core.app.ComponentActivity;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.cloudmessaging.zzu;
import com.google.android.gms.internal.mlkit_vision_face.zzee;
import com.google.android.gms.internal.mlkit_vision_face.zznv;
import defpackage.SessionProcessor;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.onCaptureSessionEnd;
import defpackage.setOrVerifyExpectFrameRateRange;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaControllerCompat {
    public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    static final String TAG = "MediaControllerCompat";
    private final MediaControllerImpl mImpl;
    private final HashSet<Callback> mRegisteredCallbacks = new HashSet<>();
    private final MediaSessionCompat.Token mToken;

    /* JADX INFO: loaded from: classes5.dex */
    interface MediaControllerImpl {
        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i);

        void adjustVolume(int i, int i2);

        boolean dispatchMediaButtonEvent(KeyEvent keyEvent);

        Bundle getExtras();

        long getFlags();

        Object getMediaController();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        PlaybackInfo getPlaybackInfo();

        PlaybackStateCompat getPlaybackState();

        List<MediaSessionCompat.QueueItem> getQueue();

        CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        PendingIntent getSessionActivity();

        int getShuffleMode();

        TransportControls getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(Callback callback, Handler handler);

        void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        void setVolumeTo(int i, int i2);

        void unregisterCallback(Callback callback);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class TransportControlsApi21 extends TransportControls {
        private static long TuitionPaymentFragmentbindingInflater1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        protected final Object mControlsObj;
        private static final byte[] $$c = {90, 46, 113, 8};
        private static final int $$d = 190;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {81, -102, -70, -91};
        private static final int $$b = 70;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int b = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 4
                int r9 = r9 + 4
                byte[] r0 = android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21.$$a
                int r8 = r8 * 3
                int r8 = 1 - r8
                int r7 = 103 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2c
            L14:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r3
                r3 = r7
                r7 = r6
            L2c:
                int r7 = -r7
                int r9 = r9 + r7
                int r7 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21.c(int, short, short, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int iIndexOf = 2187 - TextUtils.indexOf("", "", 0, 0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 40;
                        byte b2 = (byte) ($$d & 3);
                        byte b3 = (byte) (b2 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iIndexOf, longPressTimeout, 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-16744199) - Color.rgb(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 3012, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.MeasureSpec.getSize(0) + 36505), 3376 - (Process.myPid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 17, -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i5 = $10 + 55;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 1;
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 3376 - ((Process.getThreadPriority(0) + 20) >> 6), ((Process.getThreadPriority(0) + 20) >> 6) + 17, -968507904, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i6 = 60 / 0;
                } else {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (b10 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36505 - KeyEvent.keyCodeFromString("")), Color.argb(0, 0, 0, 0) + 3376, 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -968507904, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                int i7 = $10 + 67;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 4;
                }
            }
            objArr[0] = new String(cArr);
        }

        public TransportControlsApi21(Object obj) {
            this.mControlsObj = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            int i = 2 % 2;
            int i2 = b + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE, (Bundle) null);
            int i4 = b + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            int i = 2 % 2;
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID, str);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID, bundle2);
            int i2 = b + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            int i = 2 % 2;
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_QUERY, str);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH, bundle2);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            int i = 2 % 2;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_URI, bundle2);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.play(this.mControlsObj);
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            int i = 2 % 2;
            int i2 = b + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.pause(this.mControlsObj);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            int i = 2 % 2;
            int i2 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.stop(this.mControlsObj);
            if (i3 != 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.seekTo(this.mControlsObj, j);
            if (i3 == 0) {
                int i4 = 25 / 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            int i = 2 % 2;
            int i2 = b + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.fastForward(this.mControlsObj);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 27;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.rewind(this.mControlsObj);
            if (i3 == 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.skipToNext(this.mControlsObj);
            int i4 = b + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.skipToPrevious(this.mControlsObj);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
            b = i2 % 128;
            Object rating = null;
            if (i2 % 2 == 0) {
                rating.hashCode();
                throw null;
            }
            Object obj = this.mControlsObj;
            if (ratingCompat != null) {
                rating = ratingCompat.getRating();
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
                b = i3 % 128;
                int i4 = i3 % 2;
            }
            MediaControllerCompatApi21.TransportControls.setRating(obj, rating);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat, Bundle bundle) {
            int i = 2 % 2;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_SET_RATING, bundle2);
            int i2 = b + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 95 / 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            int i = 2 % 2;
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED, z);
            sendCustomAction(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED, bundle);
            int i2 = b + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            int i2 = 2 % 2;
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, i);
            sendCustomAction(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
            b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 60 / 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            int i2 = 2 % 2;
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, i);
            sendCustomAction(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
            int i3 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            b = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                MediaControllerCompatApi21.TransportControls.playFromMediaId(this.mControlsObj, str, bundle);
                obj.hashCode();
                throw null;
            }
            MediaControllerCompatApi21.TransportControls.playFromMediaId(this.mControlsObj, str, bundle);
            int i3 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.playFromSearch(this.mControlsObj, str, bundle);
            if (i3 == 0) {
                throw null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i3 = i2 + 85;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (uri != null) {
                int i5 = i2 + 9;
                b = i5 % 128;
                int i6 = i5 % 2;
                if (!Uri.EMPTY.equals(uri)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
                    bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
                    sendCustomAction(MediaSessionCompat.ACTION_PLAY_FROM_URI, bundle2);
                    return;
                }
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            b = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompatApi21.TransportControls.skipToQueueItem(this.mControlsObj, j);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);
                MediaControllerCompatApi21.TransportControls.sendCustomAction(this.mControlsObj, customAction.getAction(), bundle);
                int i3 = 68 / 0;
            } else {
                MediaControllerCompat.validateCustomAction(customAction.getAction(), bundle);
                MediaControllerCompatApi21.TransportControls.sendCustomAction(this.mControlsObj, customAction.getAction(), bundle);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = b + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            MediaControllerCompat.validateCustomAction(str, bundle);
            MediaControllerCompatApi21.TransportControls.sendCustomAction(this.mControlsObj, str, bundle);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:135:0x0c26  */
        /* JADX WARN: Code duplicated, block: B:208:0x10a3  */
        /* JADX WARN: Code duplicated, block: B:313:0x26ed  */
        /* JADX WARN: Code duplicated, block: B:315:0x26f1  */
        /* JADX WARN: Code duplicated, block: B:318:0x26fb A[LOOP:14: B:314:0x26ef->B:318:0x26fb, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:319:0x2709 A[PHI: r12
  0x2709: PHI (r12v240 int) = (r12v225 int), (r12v241 int) binds: [B:312:0x26eb, B:309:0x26e6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:322:0x2712  */
        /* JADX WARN: Code duplicated, block: B:323:0x2742  */
        /* JADX WARN: Code duplicated, block: B:341:0x28f9 A[Catch: all -> 0x01d6, TryCatch #16 {all -> 0x01d6, blocks: (B:6:0x00e8, B:8:0x00f5, B:9:0x012f, B:21:0x0266, B:23:0x0273, B:24:0x02b4, B:31:0x03a5, B:33:0x03b2, B:34:0x03e6, B:64:0x0608, B:66:0x060e, B:67:0x064f, B:69:0x076a, B:71:0x0777, B:72:0x07bf, B:77:0x093d, B:79:0x094a, B:80:0x098c, B:87:0x0a85, B:89:0x0a92, B:90:0x0ad4, B:148:0x0cc5, B:150:0x0cd2, B:151:0x0d0c, B:159:0x0efb, B:161:0x0f08, B:162:0x0f46, B:220:0x1118, B:222:0x1125, B:223:0x1160, B:233:0x12c0, B:235:0x12cd, B:236:0x130d, B:246:0x1446, B:248:0x1453, B:249:0x1492, B:256:0x1565, B:258:0x156b, B:259:0x159c, B:262:0x162d, B:264:0x163f, B:266:0x1678, B:272:0x17c7, B:274:0x17d4, B:275:0x1814, B:277:0x181d, B:279:0x1835, B:280:0x187a, B:339:0x28ec, B:341:0x28f9, B:342:0x293b, B:358:0x2ed2, B:360:0x2edf, B:361:0x2f1a, B:369:0x30ba, B:371:0x30c7, B:372:0x3106, B:391:0x3471, B:393:0x347e, B:395:0x34ce, B:449:0x3745, B:451:0x3752, B:452:0x3781, B:345:0x2947, B:347:0x295f, B:348:0x29a5, B:290:0x25f4, B:292:0x2601, B:294:0x2654, B:297:0x266b, B:299:0x2678, B:301:0x26be, B:39:0x04d5, B:41:0x04e2, B:43:0x052c, B:49:0x0574, B:51:0x0581, B:52:0x05c3), top: B:490:0x00e8 }] */
        /* JADX WARN: Code duplicated, block: B:344:0x2944  */
        /* JADX WARN: Code duplicated, block: B:345:0x2947 A[Catch: all -> 0x01d6, TryCatch #16 {all -> 0x01d6, blocks: (B:6:0x00e8, B:8:0x00f5, B:9:0x012f, B:21:0x0266, B:23:0x0273, B:24:0x02b4, B:31:0x03a5, B:33:0x03b2, B:34:0x03e6, B:64:0x0608, B:66:0x060e, B:67:0x064f, B:69:0x076a, B:71:0x0777, B:72:0x07bf, B:77:0x093d, B:79:0x094a, B:80:0x098c, B:87:0x0a85, B:89:0x0a92, B:90:0x0ad4, B:148:0x0cc5, B:150:0x0cd2, B:151:0x0d0c, B:159:0x0efb, B:161:0x0f08, B:162:0x0f46, B:220:0x1118, B:222:0x1125, B:223:0x1160, B:233:0x12c0, B:235:0x12cd, B:236:0x130d, B:246:0x1446, B:248:0x1453, B:249:0x1492, B:256:0x1565, B:258:0x156b, B:259:0x159c, B:262:0x162d, B:264:0x163f, B:266:0x1678, B:272:0x17c7, B:274:0x17d4, B:275:0x1814, B:277:0x181d, B:279:0x1835, B:280:0x187a, B:339:0x28ec, B:341:0x28f9, B:342:0x293b, B:358:0x2ed2, B:360:0x2edf, B:361:0x2f1a, B:369:0x30ba, B:371:0x30c7, B:372:0x3106, B:391:0x3471, B:393:0x347e, B:395:0x34ce, B:449:0x3745, B:451:0x3752, B:452:0x3781, B:345:0x2947, B:347:0x295f, B:348:0x29a5, B:290:0x25f4, B:292:0x2601, B:294:0x2654, B:297:0x266b, B:299:0x2678, B:301:0x26be, B:39:0x04d5, B:41:0x04e2, B:43:0x052c, B:49:0x0574, B:51:0x0581, B:52:0x05c3), top: B:490:0x00e8 }] */
        /* JADX WARN: Code duplicated, block: B:347:0x295f A[Catch: all -> 0x01d6, TryCatch #16 {all -> 0x01d6, blocks: (B:6:0x00e8, B:8:0x00f5, B:9:0x012f, B:21:0x0266, B:23:0x0273, B:24:0x02b4, B:31:0x03a5, B:33:0x03b2, B:34:0x03e6, B:64:0x0608, B:66:0x060e, B:67:0x064f, B:69:0x076a, B:71:0x0777, B:72:0x07bf, B:77:0x093d, B:79:0x094a, B:80:0x098c, B:87:0x0a85, B:89:0x0a92, B:90:0x0ad4, B:148:0x0cc5, B:150:0x0cd2, B:151:0x0d0c, B:159:0x0efb, B:161:0x0f08, B:162:0x0f46, B:220:0x1118, B:222:0x1125, B:223:0x1160, B:233:0x12c0, B:235:0x12cd, B:236:0x130d, B:246:0x1446, B:248:0x1453, B:249:0x1492, B:256:0x1565, B:258:0x156b, B:259:0x159c, B:262:0x162d, B:264:0x163f, B:266:0x1678, B:272:0x17c7, B:274:0x17d4, B:275:0x1814, B:277:0x181d, B:279:0x1835, B:280:0x187a, B:339:0x28ec, B:341:0x28f9, B:342:0x293b, B:358:0x2ed2, B:360:0x2edf, B:361:0x2f1a, B:369:0x30ba, B:371:0x30c7, B:372:0x3106, B:391:0x3471, B:393:0x347e, B:395:0x34ce, B:449:0x3745, B:451:0x3752, B:452:0x3781, B:345:0x2947, B:347:0x295f, B:348:0x29a5, B:290:0x25f4, B:292:0x2601, B:294:0x2654, B:297:0x266b, B:299:0x2678, B:301:0x26be, B:39:0x04d5, B:41:0x04e2, B:43:0x052c, B:49:0x0574, B:51:0x0581, B:52:0x05c3), top: B:490:0x00e8 }] */
        /* JADX WARN: Code duplicated, block: B:385:0x3204  */
        /* JADX WARN: Code duplicated, block: B:388:0x3454  */
        /* JADX WARN: Code duplicated, block: B:390:0x3463  */
        /* JADX WARN: Code duplicated, block: B:393:0x347e A[Catch: all -> 0x01d6, TryCatch #16 {all -> 0x01d6, blocks: (B:6:0x00e8, B:8:0x00f5, B:9:0x012f, B:21:0x0266, B:23:0x0273, B:24:0x02b4, B:31:0x03a5, B:33:0x03b2, B:34:0x03e6, B:64:0x0608, B:66:0x060e, B:67:0x064f, B:69:0x076a, B:71:0x0777, B:72:0x07bf, B:77:0x093d, B:79:0x094a, B:80:0x098c, B:87:0x0a85, B:89:0x0a92, B:90:0x0ad4, B:148:0x0cc5, B:150:0x0cd2, B:151:0x0d0c, B:159:0x0efb, B:161:0x0f08, B:162:0x0f46, B:220:0x1118, B:222:0x1125, B:223:0x1160, B:233:0x12c0, B:235:0x12cd, B:236:0x130d, B:246:0x1446, B:248:0x1453, B:249:0x1492, B:256:0x1565, B:258:0x156b, B:259:0x159c, B:262:0x162d, B:264:0x163f, B:266:0x1678, B:272:0x17c7, B:274:0x17d4, B:275:0x1814, B:277:0x181d, B:279:0x1835, B:280:0x187a, B:339:0x28ec, B:341:0x28f9, B:342:0x293b, B:358:0x2ed2, B:360:0x2edf, B:361:0x2f1a, B:369:0x30ba, B:371:0x30c7, B:372:0x3106, B:391:0x3471, B:393:0x347e, B:395:0x34ce, B:449:0x3745, B:451:0x3752, B:452:0x3781, B:345:0x2947, B:347:0x295f, B:348:0x29a5, B:290:0x25f4, B:292:0x2601, B:294:0x2654, B:297:0x266b, B:299:0x2678, B:301:0x26be, B:39:0x04d5, B:41:0x04e2, B:43:0x052c, B:49:0x0574, B:51:0x0581, B:52:0x05c3), top: B:490:0x00e8 }] */
        /* JADX WARN: Code duplicated, block: B:394:0x34ca  */
        /* JADX WARN: Code duplicated, block: B:399:0x358f A[LOOP:8: B:389:0x3461->B:399:0x358f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:405:0x362c  */
        /* JADX WARN: Code duplicated, block: B:411:0x3658  */
        /* JADX WARN: Code duplicated, block: B:417:0x367c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:420:0x3685  */
        /* JADX WARN: Code duplicated, block: B:422:0x3688 A[Catch: all -> 0x36bf, IOException -> 0x36ca, TRY_ENTER, TRY_LEAVE, TryCatch #20 {IOException -> 0x36ca, all -> 0x36bf, blocks: (B:408:0x364e, B:409:0x3652, B:414:0x365e, B:422:0x3688), top: B:504:0x364e }] */
        /* JADX WARN: Code duplicated, block: B:425:0x36a5 A[LOOP:12: B:421:0x3686->B:425:0x36a5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:431:0x36b4  */
        /* JADX WARN: Code duplicated, block: B:432:0x36b6  */
        /* JADX WARN: Code duplicated, block: B:446:0x36cf  */
        /* JADX WARN: Code duplicated, block: B:451:0x3752 A[Catch: all -> 0x01d6, TryCatch #16 {all -> 0x01d6, blocks: (B:6:0x00e8, B:8:0x00f5, B:9:0x012f, B:21:0x0266, B:23:0x0273, B:24:0x02b4, B:31:0x03a5, B:33:0x03b2, B:34:0x03e6, B:64:0x0608, B:66:0x060e, B:67:0x064f, B:69:0x076a, B:71:0x0777, B:72:0x07bf, B:77:0x093d, B:79:0x094a, B:80:0x098c, B:87:0x0a85, B:89:0x0a92, B:90:0x0ad4, B:148:0x0cc5, B:150:0x0cd2, B:151:0x0d0c, B:159:0x0efb, B:161:0x0f08, B:162:0x0f46, B:220:0x1118, B:222:0x1125, B:223:0x1160, B:233:0x12c0, B:235:0x12cd, B:236:0x130d, B:246:0x1446, B:248:0x1453, B:249:0x1492, B:256:0x1565, B:258:0x156b, B:259:0x159c, B:262:0x162d, B:264:0x163f, B:266:0x1678, B:272:0x17c7, B:274:0x17d4, B:275:0x1814, B:277:0x181d, B:279:0x1835, B:280:0x187a, B:339:0x28ec, B:341:0x28f9, B:342:0x293b, B:358:0x2ed2, B:360:0x2edf, B:361:0x2f1a, B:369:0x30ba, B:371:0x30c7, B:372:0x3106, B:391:0x3471, B:393:0x347e, B:395:0x34ce, B:449:0x3745, B:451:0x3752, B:452:0x3781, B:345:0x2947, B:347:0x295f, B:348:0x29a5, B:290:0x25f4, B:292:0x2601, B:294:0x2654, B:297:0x266b, B:299:0x2678, B:301:0x26be, B:39:0x04d5, B:41:0x04e2, B:43:0x052c, B:49:0x0574, B:51:0x0581, B:52:0x05c3), top: B:490:0x00e8 }] */
        /* JADX WARN: Code duplicated, block: B:498:0x3638 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:531:0x35b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:532:0x3584 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:534:0x36b2 A[EDGE_INSN: B:534:0x36b2->B:430:0x36b2 BREAK  A[LOOP:9: B:409:0x3652->B:429:0x36af], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:537:0x367e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:538:0x36ac A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:539:0x36aa A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:540:0x3664 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:541:0x36a8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:551:0x2789 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:552:0x26f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x05e4  */
        /* JADX WARN: Code duplicated, block: B:61:0x05ea  */
        /* JADX WARN: Code duplicated, block: B:95:0x0b1b  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            String str;
            int i6;
            String str2;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            int i12;
            boolean z;
            int i13;
            BufferedInputStream bufferedInputStream3;
            BufferedInputStream bufferedInputStream4;
            int i14;
            int i15;
            int i16;
            byte[] bArr;
            int i17;
            byte[] bArr2;
            String str3;
            int i18;
            int i19;
            String[] strArr;
            String str4;
            int i20;
            int i21;
            int i22;
            String str5;
            long j;
            int i23;
            int i24;
            Object[] objArr;
            Object obj;
            String[] strArr2;
            String[] strArr3;
            String str6;
            int i25;
            int length;
            int i26;
            int i27;
            int i28;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objInvoke;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i29;
            float f;
            int i30;
            char c;
            String[][] strArr4;
            int i31;
            int i32;
            int i33;
            String str7;
            int i34;
            int i35;
            String str8;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            String str9;
            byte[] bytes;
            int length2;
            BufferedInputStream bufferedInputStream5;
            byte[] bArr3;
            int i36;
            int i37;
            int i38;
            boolean z2;
            int i39;
            int i40;
            int i41;
            int i42;
            int i43;
            String str10;
            String[] strArr5;
            int length3;
            int i44;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            int i45;
            String str11;
            int i46;
            int i47;
            int i48;
            int i49;
            int i50;
            int i51 = i;
            int i52 = 2 % 2;
            String str12 = "";
            int i53 = 0;
            int i54 = 907 - (~(-(-TextUtils.indexOf("", "", 0, 0))));
            int i55 = 7 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16))));
            int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
            int i56 = 1;
            Object[] objArr2 = new Object[1];
            a(i54, i55, (char) ((iKeyCodeFromString ^ 26735) + ((iKeyCodeFromString & 26735) << 1)), objArr2);
            String str13 = (String) objArr2[0];
            new ArrayList();
            int iBlue = Color.blue(0);
            int i57 = -View.MeasureSpec.getSize(0);
            Object[] objArr3 = new Object[1];
            a(iBlue, (i57 ^ 27) + ((i57 & 27) << 1), (char) (49553 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr3);
            String str14 = (String) objArr3[0];
            int i58 = 26 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
            int i59 = 25 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
            int i60 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr4 = new Object[1];
            a(i58, i59, (char) ((i60 & 29276) + (i60 | 29276)), objArr4);
            String str15 = (String) objArr4[0];
            int touchSlop = 52 - (ViewConfiguration.getTouchSlop() >> 8);
            int i61 = (-16777199) - (~(-Color.rgb(0, 0, 0)));
            int i62 = -TextUtils.getTrimmedLength("");
            Object[] objArr5 = new Object[1];
            a(touchSlop, i61, (char) ((i62 & 62563) + (i62 | 62563)), objArr5);
            String str16 = (String) objArr5[0];
            int i63 = 69 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
            int i64 = 26 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))));
            int i65 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr6 = new Object[1];
            a(i63, i64, (char) (((i65 | 1) << 1) - (i65 ^ 1)), objArr6);
            String[] strArr6 = {str14, str15, str16, (String) objArr6[0]};
            int i66 = 0;
            while (true) {
                if (i66 >= 4) {
                    i4 = i51;
                    break;
                }
                try {
                    Object[] objArr7 = {strArr6[i66]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(i53, i53);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 993;
                        int offsetAfter = 8 - TextUtils.getOffsetAfter("", i53);
                        byte b2 = (byte) i53;
                        Object[] objArr8 = new Object[1];
                        c((byte) ($$b & 31), b2, b2, objArr8);
                        String str17 = (String) objArr8[i53];
                        Class[] clsArr = new Class[1];
                        clsArr[i53] = String.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, maximumDrawingCacheSize, offsetAfter, 349342683, false, str17, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr7)).longValue();
                    long j2 = -304341494;
                    String[] strArr7 = strArr6;
                    long j3 = 253;
                    long j4 = (j3 * j2) + (j3 * jLongValue);
                    long j5 = -252;
                    int i67 = i66;
                    long j6 = -1;
                    long j7 = jLongValue ^ j6;
                    long j8 = ((j2 ^ j6) | j7) ^ j6;
                    long j9 = i51;
                    long j10 = j7 | (j9 ^ j6);
                    long j11 = jLongValue | j2;
                    long j12 = (j9 | j11) ^ j6;
                    long j13 = j4 + ((j8 | (j10 ^ j6) | j12) * j5) + (j5 * j11) + (((long) 252) * ((j6 ^ (j10 | j2)) | j12)) + ((long) (-542737111));
                    int iMyPid = Process.myPid();
                    int i68 = ((int) (j13 >> 32)) & ((((~(1610608637 | iMyPid)) | 136971336) * 449) + 304823704 + (((~((~iMyPid) | 1610608637)) | 136971336) * 449));
                    int i69 = ~i51;
                    int i70 = ((int) j13) & ((((-1807147136) + (((-142868546) | i51) * (-381))) + (((~(1366384142 | i69)) | (-160764490)) * 381)) - 1401659203);
                    if (((i70 & i68) | (i68 ^ i70)) != 0) {
                        int i71 = ((i67 | 190) << 1) - (i67 ^ 190);
                        i4 = ((~i71) & i51) | (i71 & i69);
                        i53 = 0;
                        break;
                    }
                    i66 = i67 + 1;
                    strArr6 = strArr7;
                    i53 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i72 = -Color.rgb(i53, i53, i53);
            int i73 = ((i72 | (-16777118)) << 1) - (i72 ^ (-16777118));
            int i74 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i75 = ((i74 | 13) << 1) - (i74 ^ 13);
            char c2 = '0';
            Object[] objArr9 = new Object[1];
            a(i73, i75, (char) (55569 - TextUtils.lastIndexOf("", '0')), objArr9);
            String str18 = (String) objArr9[0];
            int i76 = 110 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int offsetAfter2 = 13 - TextUtils.getOffsetAfter("", 0);
            int i77 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr10 = new Object[1];
            a(i76, offsetAfter2, (char) ((i77 ^ 42206) + ((i77 & 42206) << 1)), objArr10);
            String str19 = (String) objArr10[0];
            int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
            int i78 = ((tapTimeout | 123) << 1) - (tapTimeout ^ 123);
            int i79 = -KeyEvent.normalizeMetaState(0);
            Object[] objArr11 = new Object[1];
            a(i78, ((i79 | 18) << 1) - (i79 ^ 18), (char) TextUtils.indexOf("", "", 0, 0), objArr11);
            String[] strArr8 = {str18, str19, (String) objArr11[0]};
            int i80 = 0;
            while (true) {
                if (i80 >= 3) {
                    i5 = i4;
                    str = str12;
                    i6 = i51;
                    break;
                }
                Object[] objArr12 = {strArr8[i80]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf(str12, c2, 0) + i56);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                    int scrollBarFadeDuration = 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b3 = (byte) 0;
                    Object[] objArr13 = new Object[i56];
                    c((byte) ($$b & 31), b3, b3, objArr13);
                    String str20 = (String) objArr13[0];
                    Class[] clsArr2 = new Class[i56];
                    clsArr2[0] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, minimumFlingVelocity, scrollBarFadeDuration, 349342683, false, str20, clsArr2);
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr12)).longValue();
                long j14 = -50169593;
                long j15 = -103;
                long j16 = (j15 * j14) + (j15 * jLongValue2);
                long j17 = 104;
                String[] strArr9 = strArr8;
                long j18 = -1;
                long j19 = jLongValue2 ^ j18;
                long startUptimeMillis = (int) Process.getStartUptimeMillis();
                i5 = i4;
                str = str12;
                long j20 = j16 + (((((j14 ^ j18) | j19) ^ j18) | ((j19 | startUptimeMillis) ^ j18)) * j17) + (((long) (-104)) * ((((startUptimeMillis ^ j18) | j14) | jLongValue2) ^ j18)) + (j17 * (j14 | startUptimeMillis)) + ((long) (-796909012));
                int iMyUid = Process.myUid();
                int i81 = ~(779718191 | (~iMyUid));
                int i82 = ((int) (j20 >> 32)) & (((((69304842 | i81) | (~((-779718192) | iMyUid))) * (-338)) - 907540770) + (((~(iMyUid | (-710413350))) | i81) * 338));
                int i83 = ~i51;
                int i84 = ((int) j20) & (546629560 + ((~((-65541) | i83)) * (-783)) + (((~(i83 | 1697815017)) | (-1159925869)) * 783));
                if (((i84 & i82) | (i82 ^ i84)) != 0) {
                    int i85 = (i80 & 270) + (i80 | 270);
                    i6 = (i85 | i51) & (~(i51 & i85));
                    break;
                }
                i80++;
                str12 = str;
                i4 = i5;
                strArr8 = strArr9;
                c2 = '0';
                i56 = 1;
            }
            int i86 = i51 ^ i5;
            int i87 = -i86;
            int i88 = ((i86 & i87) | (i86 ^ i87)) >> 31;
            int i89 = (i6 & (~i88)) | (i88 & i5);
            int i90 = -(ViewConfiguration.getTouchSlop() >> 8);
            int iIndexOf = TextUtils.indexOf((CharSequence) str, '0', 0);
            Object[] objArr14 = new Object[1];
            a((i90 & 141) + (i90 | 141), ((iIndexOf | 15) << 1) - (iIndexOf ^ 15), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr14);
            Object[] objArr15 = {(String) objArr14[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(str);
                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 993;
                int windowTouchSlop = 8 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr16 = new Object[1];
                c(b4, b5, b5, objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, scrollBarFadeDuration2, windowTouchSlop, -545305915, false, (String) objArr16[0], new Class[]{String.class});
            }
            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr15)).longValue();
            long j21 = -1283092523;
            long j22 = 398;
            long j23 = -396;
            long j24 = (j22 * j21) + (j23 * jLongValue3);
            long j25 = -397;
            long j26 = -1;
            long j27 = j21 ^ j26;
            String str21 = str;
            long j28 = i51;
            long j29 = j28 ^ j26;
            long j30 = (j27 | j29) ^ j26;
            long j31 = (j27 | jLongValue3) ^ j26;
            long j32 = j24 + ((j30 | j31 | ((j29 | jLongValue3) ^ j26)) * j25) + (j25 * j31);
            long j33 = 397;
            long j34 = j32 + ((j28 | j31 | (((jLongValue3 ^ j26) | j21) ^ j26)) * j33) + ((long) 1903551807);
            int i91 = ~i51;
            int i92 = ((int) (j34 >> 32)) & ((-2038453146) + (((~(i91 | (-11740441))) | 1448966851) * (-1042)) + (((-11740441) | i51) * 521) + (((~((-1448966852) | i51)) | 1447844547 | (~((-10618137) | i91))) * 521));
            int i93 = ((int) j34) & (355699302 + ((~((-143196162) | i51)) * 623) + ((1090553216 | i91) * (-623)) + (((~(1192291732 | i51)) | 143196161 | (~((-244934678) | i51))) * 623));
            if (((i92 & i93) | (i92 ^ i93)) != 0) {
                str13 = str13;
                i7 = (~(i51 & 266)) & (i51 | 266);
                j33 = j33;
                str2 = str21;
            } else {
                int i94 = 153 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                str2 = str21;
                int i95 = 22 - (~(-TextUtils.indexOf((CharSequence) str2, '0', 0, 0)));
                int i96 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr17 = new Object[1];
                a(i94, i95, (char) (((i96 | 1) << 1) - (i96 ^ 1)), objArr17);
                Object[] objArr18 = {(String) objArr17[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char windowTouchSlop2 = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 33602);
                    int offsetAfter3 = 3085 - TextUtils.getOffsetAfter(str2, 0);
                    int iBlue2 = Color.blue(0) + 26;
                    byte b6 = (byte) 5;
                    byte b7 = (byte) (b6 - 5);
                    Object[] objArr19 = new Object[1];
                    c(b6, b7, b7, objArr19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(windowTouchSlop2, offsetAfter3, iBlue2, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
                }
                String str22 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr18);
                if (str22 == null || str22.isEmpty()) {
                    int i97 = -(-ExpandableListView.getPackedPositionType(0L));
                    int i98 = ((i97 | 179) << 1) - (i97 ^ 179);
                    int i99 = 23 - (~(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int i100 = -(-ExpandableListView.getPackedPositionType(0L));
                    Object[] objArr20 = new Object[1];
                    a(i98, i99, (char) ((i100 & 54901) + (i100 | 54901)), objArr20);
                    Object[] objArr21 = {(String) objArr20[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 33601);
                        int iLastIndexOf = 3084 - TextUtils.lastIndexOf(str2, '0', 0, 0);
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 26;
                        byte b8 = (byte) 5;
                        byte b9 = (byte) (b8 - 5);
                        Object[] objArr22 = new Object[1];
                        c(b8, b9, b9, objArr22);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c3, iLastIndexOf, absoluteGravity2, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
                    }
                    String str23 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr21);
                    int i101 = b;
                    int i102 = (i101 & 77) + (i101 | 77);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i102 % 128;
                    if (i102 % 2 != 0) {
                        int i103 = 22 / 0;
                        if (str23 != null) {
                            if (!str23.isEmpty()) {
                                i7 = (~(i51 & 267)) & (i51 | 267);
                            }
                        }
                    } else if (str23 != null) {
                        if (!str23.isEmpty()) {
                            i7 = (~(i51 & 267)) & (i51 | 267);
                        }
                    }
                    i7 = i51;
                } else {
                    i7 = (i51 & (-268)) | (i91 & 267);
                }
            }
            int i104 = ((~i89) & i51) | (i89 & i91);
            int i105 = -i104;
            int i106 = ((i104 & i105) | (i104 ^ i105)) >> 31;
            int i107 = i7 & (~i106);
            int i108 = i89 & i106;
            int i109 = (i107 & i108) | (i107 ^ i108);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 56826);
                int iLastIndexOf2 = 2813 - TextUtils.lastIndexOf(str2, '0', 0);
                int i110 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9;
                byte b10 = (byte) 5;
                byte b11 = (byte) (b10 - 5);
                Object[] objArr23 = new Object[1];
                c(b10, b11, b11, objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c4, iLastIndexOf2, i110, -1639816125, false, (String) objArr23[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, null)).longValue();
            long j35 = 1466050791;
            long j36 = 569;
            long j37 = j35 ^ j26;
            long j38 = jLongValue4 ^ j26;
            long j39 = j37 | j38;
            long j40 = (j36 * j35) + (j36 * jLongValue4) + (((long) (-1136)) * ((j39 ^ j26) | ((j37 | j29) ^ j26) | ((j38 | j29) ^ j26)));
            long j41 = j29 | j35;
            long j42 = j40 + (((long) (-568)) * (((j37 | j28) ^ j26) | ((j38 | j28) ^ j26) | ((j41 | jLongValue4) ^ j26))) + (((long) 568) * (((j29 | jLongValue4) ^ j26) | (j41 ^ j26) | ((j39 | j28) ^ j26))) + ((long) 647305715);
            int i111 = ~((int) Runtime.getRuntime().totalMemory());
            int i112 = (((int) j42) & (1882148783 + (((~(1439168801 | i51)) | (~((-1438799873) | i91))) * (-406)) + ((~(1440742263 | i91)) * (-406)) + (((~((-1942392) | i51)) | (~((-1439168802) | i91))) * 406))) | (((int) (j42 >> 32)) & (288366914 + (((-676397331) | i111) * 494) + (((~(i111 | (-684918132))) | 1454268013) * 494)));
            int i113 = (i112 + 199) ^ i51;
            int i114 = -i112;
            int i115 = ((i112 & i114) | (i112 ^ i114)) >> 31;
            int i116 = (~i115) & i51;
            int i117 = i115 & i113;
            int i118 = (i117 & i116) | (i116 ^ i117);
            int i119 = ((~i109) & i51) | (i109 & i91);
            int i120 = -i119;
            int i121 = ((i119 & i120) | (i119 ^ i120)) >> 31;
            int i122 = (i109 & i121) | (i118 & (~i121));
            int iResolveSize = View.resolveSize(0, 0) + 203;
            int i123 = -Color.argb(0, 0, 0, 0);
            Object[] objArr24 = new Object[1];
            a(iResolveSize, (i123 ^ 20) + ((i123 & 20) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr24);
            String str24 = (String) objArr24[0];
            int i124 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i125 = ((i124 | 223) << 1) - (i124 ^ 223);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
            Object[] objArr25 = new Object[1];
            a(i125, (bitsPerPixel ^ 7) + ((bitsPerPixel & 7) << 1), (char) Color.alpha(0), objArr25);
            Object[] objArr26 = {str24, (String) objArr25[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c5 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int i126 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2384;
                int i127 = 33 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b12 = (byte) 5;
                byte b13 = (byte) (b12 - 5);
                Object[] objArr27 = new Object[1];
                c(b12, b13, b13, objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c5, i126, i127, -1207062455, false, (String) objArr27[0], new Class[]{String.class, String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr26)).longValue();
            long j43 = 282957154;
            long j44 = 521;
            long j45 = j43 ^ j26;
            long j46 = (((long) 522) * j43) + (((long) (-520)) * jLongValue5) + (((long) (-1042)) * (j43 | ((j29 | jLongValue5) ^ j26))) + ((jLongValue5 | j28) * j44) + (j44 * (((j45 | (jLongValue5 ^ j26)) ^ j26) | ((j45 | j28) ^ j26) | ((jLongValue5 | (j29 | j43)) ^ j26))) + ((long) 1694086174);
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i128 = ((int) (j46 >> 32)) & ((((-1771464918) + (((~((-2122651783) | iElapsedRealtime)) | 1443174404) * 576)) + (((~((~iElapsedRealtime) | (-679477379))) | (-2128599776)) * 576)) - 1955198720);
            int i129 = (-1905160647) + (((~(147811575 | i91)) | (-1289743608) | (~(1289414834 | i91)) | (~((-147482803) | i51))) * (-84));
            int i130 = (~(1289414834 | i51)) | (-147811576);
            int i131 = ~((-1289414835) | i91);
            int i132 = i128 | (((int) j46) & (i129 + ((i130 | i131) * (-84)) + ((147482802 | i131) * 84)));
            int i133 = (~(i51 & 262)) & (i51 | 262);
            int i134 = (i132 | (-i132)) >> 31;
            int i135 = (~i134) & i51;
            int i136 = i134 & i133;
            int i137 = (i136 & i135) | (i135 ^ i136);
            int i138 = ((~i122) & i51) | (i122 & i91);
            int i139 = -i138;
            int i140 = ((i138 & i139) | (i138 ^ i139)) >> 31;
            int i141 = i137 & (~i140);
            int i142 = i122 & i140;
            int i143 = (i142 & i141) | (i141 ^ i142);
            int i144 = 228 - (~(-View.combineMeasuredStates(0, 0)));
            int i145 = -TextUtils.lastIndexOf(str2, '0');
            Object[] objArr28 = new Object[1];
            a(i144, (i145 & 30) + (i145 | 30), (char) (51936 - (~TextUtils.indexOf(str2, str2, 0))), objArr28);
            String str25 = (String) objArr28[0];
            int i146 = -View.combineMeasuredStates(0, 0);
            Object[] objArr29 = new Object[1];
            a(((i146 | 260) << 1) - (i146 ^ 260), 21 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18700), objArr29);
            String str26 = (String) objArr29[0];
            Object[] objArr30 = new Object[1];
            a(283 - View.MeasureSpec.getSize(0), 28 - (Process.myPid() >> 22), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr30);
            String str27 = (String) objArr30[0];
            int i147 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            int i148 = (i147 & 311) + (i147 | 311);
            int i149 = -TextUtils.getOffsetBefore(str2, 0);
            Object[] objArr31 = new Object[1];
            a(i148, ((i149 | 14) << 1) - (i149 ^ 14), (char) (8946 - (~(-TextUtils.lastIndexOf(str2, '0', 0, 0)))), objArr31);
            String[] strArr10 = {str25, str26, str27, (String) objArr31[0]};
            int i150 = 0;
            while (true) {
                if (i150 >= 4) {
                    i8 = i143;
                    i9 = i51;
                    i10 = i9;
                    break;
                }
                Object[] objArr32 = {strArr10[i150]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 993;
                    int fadingEdgeLength = 8 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b14 = (byte) 0;
                    Object[] objArr33 = new Object[1];
                    c((byte) ($$b & 31), b14, b14, objArr33);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop3, touchSlop2, fadingEdgeLength, 349342683, false, (String) objArr33[0], new Class[]{String.class});
                }
                long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr32)).longValue();
                long j47 = -130022406;
                int i151 = i150;
                long j48 = 765;
                long j49 = j47 ^ j26;
                long j50 = jLongValue6 ^ j26;
                long j51 = j49 | j50;
                String[] strArr11 = strArr10;
                long jMyTid = Process.myTid();
                long j52 = jMyTid ^ j26;
                i8 = i143;
                long j53 = (((long) (-1529)) * j47) + (((long) (-764)) * jLongValue6) + ((((j51 | j52) ^ j26) | (((j49 | jLongValue6) | jMyTid) ^ j26) | (((j50 | j47) | jMyTid) ^ j26)) * j48) + (((long) 1530) * ((j51 ^ j26) | ((j49 | j52) ^ j26))) + (j48 * (((j49 | jMyTid) ^ j26) | (((j50 | j52) | j47) ^ j26))) + ((long) (-717056199));
                i9 = i;
                int i152 = ((int) (j53 >> 32)) & ((-2005432166) + (((~(1644227122 | i9)) | (-1783949875)) * 104) + ((~((-1073791011) | i91)) * (-104)) + (((-1213513763) | i9) * 104));
                int i153 = ((int) j53) & ((-365757873) + (((-301995017) | i91) * 494) + (((~((-1941115913) | i91)) | 1841015382) * 494));
                if (((i152 & i153) | (i152 ^ i153)) != 0) {
                    i10 = i9 ^ (i151 + 252);
                    break;
                }
                i150 = i151 + 1;
                i51 = i9;
                strArr10 = strArr11;
                i143 = i8;
            }
            int i154 = (~(i9 & i8)) & (i9 | i8);
            int i155 = -i154;
            int i156 = ((i154 & i155) | (i154 ^ i155)) >> 31;
            int i157 = i10 & (~i156);
            int i158 = i8 & i156;
            int i159 = (i157 & i158) | (i157 ^ i158);
            Object[] objArr34 = new Object[1];
            a(324 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16)))), 12 - Process.getGidForName(str2), (char) (50146 - TextUtils.indexOf((CharSequence) str2, '0', 0)), objArr34);
            Object[] objArr35 = {(String) objArr34[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char cRed = (char) (33602 - Color.red(0));
                int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 3085;
                int iLastIndexOf3 = 25 - TextUtils.lastIndexOf(str2, '0');
                byte b15 = (byte) 5;
                byte b16 = (byte) (b15 - 5);
                Object[] objArr36 = new Object[1];
                c(b15, b16, b16, objArr36);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, touchSlop3, iLastIndexOf3, 1411172903, false, (String) objArr36[0], new Class[]{String.class});
            }
            String str28 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr35);
            if (str28 != null) {
                int i160 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 339;
                int i161 = 8 - (~View.MeasureSpec.getMode(0));
                int i162 = b;
                int i163 = (i162 & 61) + (i162 | 61);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i163 % 128;
                int i164 = i163 % 2;
                Object[] objArr37 = new Object[1];
                a(i160, i161, (char) ((-ImageFormat.getBitsPerPixel(0)) - 1), objArr37);
                if (!(!str28.contains((String) objArr37[0]))) {
                    i11 = i9 ^ ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
                } else {
                    i11 = i9;
                }
            } else {
                i11 = i9;
            }
            int i165 = i9 ^ i159;
            int i166 = -i165;
            int i167 = ((i165 & i166) | (i165 ^ i166)) >> 31;
            int i168 = (i159 & i167) | (i11 & (~i167));
            int iRed = 347 - Color.red(0);
            int i169 = 16 - (~Color.blue(0));
            int i170 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr38 = new Object[1];
            a(iRed, i169, (char) ((i170 ^ 38218) + ((i170 & 38218) << 1)), objArr38);
            String str29 = (String) objArr38[0];
            int i171 = -Color.red(0);
            Object[] objArr39 = new Object[1];
            a(((i171 | 364) << 1) - (i171 ^ 364), TextUtils.indexOf(str2, str2, 0, 0) + 6, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr39);
            byte[] bytes2 = ((String) objArr39[0]).getBytes();
            int length4 = bytes2.length;
            if (length4 == 0) {
                i12 = i9 ^ 251;
            } else {
                try {
                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str29));
                    int i172 = 4096;
                    try {
                        byte[] bArr4 = new byte[4096];
                        int i173 = b;
                        int i174 = (i173 ^ 7) + ((i173 & 7) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i174 % 128;
                        int i175 = i174 % 2;
                        int i176 = 0;
                        while (true) {
                            int i177 = bufferedInputStream2.read(bArr4, 0, i172);
                            if (i177 <= 0) {
                                break;
                            }
                            int i178 = 0;
                            while (i176 < length4 && i178 < i177) {
                                if (bArr4[i178] != bytes2[i176]) {
                                    if (i176 != 0) {
                                        int i179 = (i176 ^ (-1)) + (i176 << 1);
                                        while (true) {
                                            if (i179 <= 0) {
                                                i176 = 0;
                                                break;
                                            }
                                            int i180 = 0;
                                            while (true) {
                                                if (i180 < i179) {
                                                    int i181 = i176;
                                                    if (bytes2[i180] != bytes2[(i176 - i179) + i180]) {
                                                        int i182 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        int i183 = ((i182 | 1) << 1) - (i182 ^ 1);
                                                        b = i183 % 128;
                                                        if (i183 % 2 != 0) {
                                                            i179 = (i179 << 1) + (~i179);
                                                            i176 = i181;
                                                        }
                                                    } else {
                                                        i180++;
                                                        i176 = i181;
                                                    }
                                                }
                                                i176 = i179;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    i176 = (i176 | 1) + (i176 & 1);
                                }
                                int i184 = (i178 ^ (-46)) + ((i178 & (-46)) << 1);
                                i178 = (i184 ^ 47) + ((i184 & 47) << 1);
                            }
                            i176 = i176;
                            i172 = 4096;
                        }
                        if (i176 == length4) {
                            int i185 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i186 = (i185 ^ 81) + ((i185 & 81) << 1);
                            b = i186 % 128;
                            int i187 = i186 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        if (z) {
                            i12 = i9 ^ 251;
                        } else {
                            i12 = i9;
                        }
                    } catch (IOException unused2) {
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused5) {
                    bufferedInputStream2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
            }
            int i188 = ((~i168) & i9) | (i168 & i91);
            int i189 = -i188;
            int i190 = ((i188 & i189) | (i188 ^ i189)) >> 31;
            int i191 = (i168 & i190) | (i12 & (~i190));
            int i192 = 369 - (~(-(-(ViewConfiguration.getJumpTapTimeout() >> 16))));
            int iIndexOf2 = TextUtils.indexOf(str2, str2, 0, 0);
            int iB = zzee.b();
            int i193 = iIndexOf2 * 303;
            int i194 = (i193 & (-6923)) + (i193 | (-6923));
            int i195 = ~iIndexOf2;
            int i196 = ~iB;
            int i197 = (i195 & i196) | (i195 ^ i196);
            int i198 = ~((i197 & 23) | (i197 ^ 23));
            int i199 = (iIndexOf2 ^ 23) | (iIndexOf2 & 23);
            int i200 = ~((i199 & iB) | (i199 ^ iB));
            int i201 = ((i198 & i200) | (i198 ^ i200)) * (-302);
            int i202 = (i194 & i201) + (i201 | i194);
            int i203 = ~iIndexOf2;
            int i204 = (i203 & 23) | (i203 ^ 23);
            int i205 = -(-((~((i204 & iB) | (i204 ^ iB))) * (-604)));
            int i206 = (i202 ^ i205) + ((i205 & i202) << 1);
            int i207 = ~((iIndexOf2 & (-24)) | ((-24) ^ iIndexOf2));
            int i208 = ~(iB | 23);
            Object[] objArr40 = new Object[1];
            a(i192, (i206 - (~(((i207 & i208) | (i207 ^ i208)) * 302))) - 1, (char) (AndroidCharacter.getMirror('0') + 37962), objArr40);
            Object[] objArr41 = {(String) objArr40[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf(str2, '0', 0, 0) + 33603);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 3085;
                int i209 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b17 = (byte) 5;
                byte b18 = (byte) (b17 - 5);
                Object[] objArr42 = new Object[1];
                c(b17, b18, b18, objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, iResolveOpacity, i209, 1411172903, false, (String) objArr42[0], new Class[]{String.class});
            }
            String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr41)).toLowerCase();
            int i210 = -Color.red(0);
            int i211 = (i210 ^ 393) + ((i210 & 393) << 1);
            int i212 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr43 = new Object[1];
            a(i211, ((i212 | 4) << 1) - (i212 ^ 4), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr43);
            int i213 = !(lowerCase.contains((String) objArr43[0]) ^ true) ? i9 ^ 264 : i9;
            int i214 = ((~i191) & i9) | (i191 & i91);
            int i215 = -i214;
            int i216 = ((i214 & i215) | (i214 ^ i215)) >> 31;
            int i217 = i213 & (~i216);
            int i218 = i191 & i216;
            int i219 = (i218 & i217) | (i217 ^ i218);
            int i220 = 396 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
            int i221 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr44 = new Object[1];
            a(i220, (i221 & 42) + (i221 | 42), (char) (TextUtils.lastIndexOf(str2, '0', 0) + 1), objArr44);
            int i222 = -TextUtils.getOffsetBefore(str2, 0);
            int iB2 = zzee.b();
            int i223 = (i222 * 659) - 288423;
            int i224 = ~i222;
            int i225 = ~((i224 & 439) | (i224 ^ 439));
            int i226 = ((-440) & i222) | ((-440) ^ i222);
            int i227 = ~i226;
            int i228 = (i225 & i227) | (i225 ^ i227);
            int i229 = ~(i222 | iB2);
            int i230 = ((i228 & i229) | (i228 ^ i229)) * (-658);
            int i231 = (i223 & i230) + (i223 | i230);
            int i232 = (~(((-440) & i222) | ((-440) ^ i222))) * 658;
            int i233 = (i231 ^ i232) + ((i232 & i231) << 1);
            int i234 = ~i226;
            int i235 = ~((i222 & iB2) | (i222 ^ iB2));
            int i236 = ((i235 & i234) | (i234 ^ i235)) * 658;
            int size = 40 - View.MeasureSpec.getSize(0);
            int i237 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            Object[] objArr45 = new Object[1];
            a((i233 ^ i236) + ((i236 & i233) << 1), size, (char) ((i237 & 14213) + (i237 | 14213)), objArr45);
            int iMyTid = 479 - (Process.myTid() >> 22);
            int i238 = b + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i238 % 128;
            int i239 = i238 % 2;
            int iResolveSize2 = View.resolveSize(0, 0);
            Object[] objArr46 = new Object[1];
            a(iMyTid, (27 & iResolveSize2) + (iResolveSize2 | 27), (char) (10885 - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr46);
            int i240 = -Process.getGidForName(str2);
            Object[] objArr47 = new Object[1];
            a((i240 ^ TypedValues.PositionType.TYPE_SIZE_PERCENT) + ((i240 & TypedValues.PositionType.TYPE_SIZE_PERCENT) << 1), Process.getGidForName(str2) + 28, (char) (6512 - Color.alpha(0)), objArr47);
            String str30 = (String) objArr47[0];
            int i241 = b;
            int i242 = (i241 & 17) + (i241 | 17);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i242 % 128;
            int i243 = i242 % 2;
            int i244 = -ExpandableListView.getPackedPositionType(0L);
            int i245 = -TextUtils.indexOf((CharSequence) str2, '0', 0);
            Object[] objArr48 = new Object[1];
            a((i244 & 533) + (i244 | 533), (i245 & 26) + (i245 | 26), (char) TextUtils.getTrimmedLength(str2), objArr48);
            int i246 = 559 - (~(-View.resolveSizeAndState(0, 0, 0)));
            int i247 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iB3 = zzee.b();
            int i248 = ~iB3;
            int i249 = ~i247;
            int i250 = ((i247 * (-661)) - 17847) + ((i248 | (~((i249 ^ (-28)) | (i249 & (-28))))) * 1324);
            int i251 = ~(i247 | iB3);
            int i252 = ~((iB3 & 27) | (iB3 ^ 27));
            int i253 = ((i252 & i251) | (i251 ^ i252)) * (-1324);
            int i254 = (i250 & i253) + (i253 | i250);
            int i255 = ~((i249 ^ 27) | (i249 & 27));
            int i256 = ~((i247 & (-28)) | ((-28) ^ i247));
            int i257 = ((i256 & i255) | (i255 ^ i256)) * 662;
            Object[] objArr49 = new Object[1];
            a(i246, (i254 & i257) + (i257 | i254), (char) View.getDefaultSize(0, 0), objArr49);
            String[] strArr12 = {(String) objArr44[0], (String) objArr45[0], (String) objArr46[0], str30, (String) objArr48[0], (String) objArr49[0]};
            int i258 = 6;
            int i259 = 0;
            while (true) {
                if (i259 >= i258) {
                    i13 = i9;
                    break;
                }
                Object[] objArr50 = {strArr12[i259]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char packedPositionGroup = (char) (33602 - ExpandableListView.getPackedPositionGroup(0L));
                    int packedPositionGroup2 = 3085 - ExpandableListView.getPackedPositionGroup(0L);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                    byte b19 = (byte) 5;
                    byte b20 = (byte) (b19 - 5);
                    Object[] objArr51 = new Object[1];
                    c(b19, b20, b20, objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionGroup, packedPositionGroup2, iNormalizeMetaState, 1411172903, false, (String) objArr51[0], new Class[]{String.class});
                }
                String str31 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr50);
                if (str31 != null) {
                    int i260 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                    b = i260 % 128;
                    if (i260 % 2 == 0) {
                        str31.isEmpty();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (!str31.isEmpty()) {
                        i13 = (i9 & (-266)) | (i91 & 265);
                        break;
                    }
                }
                i259 = ((i259 | 1) << 1) - (i259 ^ 1);
                i258 = 6;
            }
            int i261 = (~(i9 & i219)) & (i9 | i219);
            int i262 = -i261;
            int i263 = ((i261 & i262) | (i261 ^ i262)) >> 31;
            int i264 = i13 & (~i263);
            int i265 = i219 & i263;
            int i266 = (i265 & i264) | (i264 ^ i265);
            int defaultSize = View.getDefaultSize(0, 0);
            int i267 = ((defaultSize | 347) << 1) - (defaultSize ^ 347);
            int i268 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            Object[] objArr52 = new Object[1];
            a(i267, (i268 ^ 17) + ((i268 & 17) << 1), (char) (38217 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr52);
            String str32 = (String) objArr52[0];
            int i269 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i270 = ((i269 | 587) << 1) - (i269 ^ 587);
            int i271 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i272 = ((i271 | 7) << 1) - (i271 ^ 7);
            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str2);
            Object[] objArr53 = new Object[1];
            a(i270, i272, (char) ((iKeyCodeFromString2 ^ 53887) + ((iKeyCodeFromString2 & 53887) << 1)), objArr53);
            byte[] bytes3 = ((String) objArr53[0]).getBytes();
            int length5 = bytes3.length;
            if (length5 == 0) {
                i14 = i91;
                int i273 = i9;
                i16 = (~(i9 & 260)) & (i9 | 260);
                i15 = i273;
            } else {
                try {
                    bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str32));
                    int i274 = 4096;
                    try {
                        byte[] bArr5 = new byte[4096];
                        int i275 = 0;
                        while (true) {
                            int i276 = bufferedInputStream4.read(bArr5, 0, i274);
                            if (i276 <= 0) {
                                break;
                            }
                            int i277 = 0;
                            while (i275 < length5 && i277 < i276) {
                                if (bArr5[i277] == bytes3[i275]) {
                                    i275 = ((i275 & 1) << 1) + (i275 ^ 1);
                                } else {
                                    if (i275 != 0) {
                                        int i278 = i275 - 1;
                                        while (true) {
                                            if (i278 <= 0) {
                                                bArr = bArr5;
                                                i275 = 0;
                                                break;
                                            }
                                            int i279 = 0;
                                            while (true) {
                                                if (i279 >= i278) {
                                                    bArr = bArr5;
                                                    i275 = i278;
                                                    break;
                                                }
                                                i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                int i280 = ((i17 | 21) << 1) - (i17 ^ 21);
                                                bArr2 = bArr5;
                                                b = i280 % 128;
                                                int i281 = i280 % 2;
                                                int i282 = -i278;
                                                if (bytes3[i279] != bytes3[(((i275 ^ i282) + ((i282 & i275) << 1)) - (~(-(-i279)))) - 1]) {
                                                    break;
                                                }
                                                i279++;
                                                bArr5 = bArr2;
                                            }
                                            int i283 = ((i17 | 103) << 1) - (i17 ^ 103);
                                            b = i283 % 128;
                                            int i284 = i283 % 2;
                                            i278--;
                                            bArr5 = bArr2;
                                        }
                                    }
                                    bArr5 = bArr;
                                }
                                bArr = bArr5;
                                int i285 = ((i277 | 107) << 1) - (i277 ^ 107);
                                i277 = (i285 & (-106)) + (i285 | (-106));
                                bArr5 = bArr;
                            }
                            bArr5 = bArr5;
                            i274 = 4096;
                        }
                        boolean z3 = i275 == length5;
                        try {
                            bufferedInputStream4.close();
                        } catch (IOException unused6) {
                        }
                        if (z3) {
                            i14 = i91;
                            int i2710 = i9;
                            i16 = (~(i9 & 260)) & (i9 | 260);
                            i15 = i2710;
                        } else {
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 593;
                            int capsMode = TextUtils.getCapsMode(str2, 0, 0);
                            int i286 = (capsMode ^ 13) + ((capsMode & 13) << 1);
                            int i287 = -ExpandableListView.getPackedPositionGroup(0L);
                            Object[] objArr54 = new Object[1];
                            a(scrollBarSize, i286, (char) ((i287 ^ 40909) + ((i287 & 40909) << 1)), objArr54);
                            String str33 = (String) objArr54[0];
                            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                            Object[] objArr55 = new Object[1];
                            a((packedPositionGroup3 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + (packedPositionGroup3 | TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO), 8 - (~View.resolveSize(0, 0)), (char) ((-16734528) - (~(-Color.rgb(0, 0, 0)))), objArr55);
                            Object[] objArr56 = {str33, (String) objArr55[0]};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                                int fadingEdgeLength2 = 2385 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int iAxisFromString = 31 - MotionEvent.axisFromString(str2);
                                byte b21 = (byte) 5;
                                byte b22 = (byte) (b21 - 5);
                                Object[] objArr57 = new Object[1];
                                c(b21, b22, b22, objArr57);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(deadChar, fadingEdgeLength2, iAxisFromString, -1207062455, false, (String) objArr57[0], new Class[]{String.class, String.class});
                            }
                            long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr56)).longValue();
                            long j54 = 741112274;
                            long j55 = 988;
                            long j56 = jLongValue7 ^ j26;
                            long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                            long j57 = startUptimeMillis2 ^ j26;
                            i14 = i91;
                            long j58 = (((long) 989) * j54) + (((long) (-987)) * jLongValue7) + (((((j56 | j57) | j54) ^ j26) | (((j54 | jLongValue7) | startUptimeMillis2) ^ j26)) * j55) + (((long) (-988)) * (j54 | j56)) + (j55 * (((j56 | startUptimeMillis2) ^ j26) | (((j54 ^ j26) | j56) ^ j26) | (((j57 | j54) | jLongValue7) ^ j26))) + ((long) 1235931054);
                            int iMyPid2 = Process.myPid();
                            int i288 = ((int) (j58 >> 32)) & (100111074 + (((~(612167065 | iMyPid2)) | 2049393476) * (-366)) + (((~(iMyPid2 | 2122313693)) | 539246848) * 366));
                            int iMyTid2 = Process.myTid();
                            int i289 = ~iMyTid2;
                            int i290 = ((int) j58) & ((-501357939) + (((~((-495772272) | i289)) | 210289254) * 168) + ((~((-210289255) | iMyTid2)) * 168) + (((~(iMyTid2 | (-285483018))) | (~(i289 | 1932998681)) | (-2143287936)) * 168));
                            if (((i288 & i290) | (i288 ^ i290)) != 0) {
                                i15 = i;
                                i16 = (~(i15 & 261)) & (i15 | 261);
                            } else {
                                i15 = i;
                                i16 = i15;
                            }
                        }
                    } catch (IOException unused7) {
                        if (bufferedInputStream4 != null) {
                            try {
                                bufferedInputStream4.close();
                            } catch (IOException unused8) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream3 = bufferedInputStream4;
                        if (bufferedInputStream3 != null) {
                            try {
                                bufferedInputStream3.close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused10) {
                    bufferedInputStream4 = null;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedInputStream3 = null;
                }
            }
            int i291 = (~(i15 & i266)) & (i15 | i266);
            int i292 = -i291;
            int i293 = ((i291 & i292) | (i291 ^ i292)) >> 31;
            int i294 = i16 & (~i293);
            int i295 = i266 & i293;
            int i296 = (i295 & i294) | (i294 ^ i295);
            if ((i2 & 8) == 0) {
                int i297 = 613 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                int i298 = -View.getDefaultSize(0, 0);
                Object[] objArr58 = new Object[1];
                a(i297, ((i298 | 43) << 1) - (i298 ^ 43), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr58);
                String str34 = (String) objArr58[0];
                int i299 = -(-Drawable.resolveOpacity(0, 0));
                int i300 = (i299 & 658) + (i299 | 658);
                int i301 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr59 = new Object[1];
                a(i300, ((i301 | 41) << 1) - (i301 ^ 41), (char) KeyEvent.keyCodeFromString(str2), objArr59);
                String str35 = (String) objArr59[0];
                int iResolveSizeAndState = 699 - View.resolveSizeAndState(0, 0, 0);
                int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                int i302 = (maxKeyCode ^ 38) + ((maxKeyCode & 38) << 1);
                int i303 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                Object[] objArr60 = new Object[1];
                a(iResolveSizeAndState, i302, (char) ((i303 ^ 44933) + ((i303 & 44933) << 1)), objArr60);
                String[] strArr13 = {str34, str35, (String) objArr60[0]};
                int i304 = 3;
                int i305 = 0;
                while (true) {
                    if (i305 >= i304) {
                        i50 = i15;
                        break;
                    }
                    Object[] objArr61 = {strArr13[i305]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
                        int iLastIndexOf4 = TextUtils.lastIndexOf(str2, '0', 0) + 9;
                        byte b23 = (byte) 0;
                        Object[] objArr62 = new Object[1];
                        c((byte) ($$b & 31), b23, b23, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(minimumFlingVelocity2, minimumFlingVelocity3, iLastIndexOf4, 349342683, false, (String) objArr62[0], new Class[]{String.class});
                    }
                    long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr61)).longValue();
                    long j59 = 376142678;
                    long j60 = -496;
                    long j61 = (j60 * j59) + (j60 * jLongValue8);
                    long j62 = 497;
                    long j63 = j59 ^ j26;
                    long j64 = jLongValue8 ^ j26;
                    long j65 = j63 | j64;
                    long j66 = j61 + ((j65 ^ j26) * j62) + ((((j65 | j28) ^ j26) | (((j64 | j29) | j59) ^ j26)) * j62) + (j62 * (((j63 | j29) ^ j26) | ((j63 | jLongValue8) ^ j26) | (((j64 | j59) | j28) ^ j26))) + ((long) (-1223221283));
                    int i306 = ((int) (j66 >> 32)) & (889882412 + (((~(1782148980 | i15)) | (-1782415349) | (~(i14 | (-1075325537)))) * 886) + (((~(i14 | (-1782148981))) | (-1075591905)) * (-1772)) + ((~(i14 | (-1075591905))) * 886));
                    int i307 = ~Process.myPid();
                    int i308 = ((int) j66) & ((-404634679) + ((~(2142959603 | i307)) * 52) + (((~(716879714 | i307)) | (~((-2140861172) | i307)) | 1426079889) * (-52)) + (((~(i307 | (-716879715))) | 2098432) * 52));
                    if (((i306 & i308) | (i306 ^ i308)) != 0) {
                        i50 = ((i305 & 280) + (i305 | 280)) ^ i15;
                        break;
                    }
                    i305++;
                    i304 = 3;
                }
                int i309 = (~(i15 & i296)) & (i15 | i296);
                int i310 = -i309;
                int i311 = ((i309 & i310) | (i309 ^ i310)) >> 31;
                int i312 = i50 & (~i311);
                int i313 = i296 & i311;
                i296 = (i313 & i312) | (i312 ^ i313);
            }
            int i314 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i315 = (i314 ^ 737) + ((i314 & 737) << 1);
            int capsMode2 = TextUtils.getCapsMode(str2, 0, 0);
            Object[] objArr63 = new Object[1];
            a(i315, (capsMode2 & 41) + (capsMode2 | 41), (char) (32927 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr63);
            String str36 = (String) objArr63[0];
            int i316 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
            Object[] objArr64 = new Object[1];
            a((i316 & 778) + (i316 | 778), 29 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16)), (char) (Gravity.getAbsoluteGravity(0, 0) + 43020), objArr64);
            String[] strArr14 = {str36, (String) objArr64[0]};
            int i317 = 2;
            int i318 = 0;
            while (true) {
                if (i318 >= i317) {
                    str3 = str2;
                    i18 = i15;
                    break;
                }
                Object[] objArr65 = {strArr14[i318]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char cAxisFromString = (char) (MotionEvent.axisFromString(str2) + 1);
                    int windowTouchSlop4 = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 8;
                    byte b24 = (byte) 0;
                    Object[] objArr66 = new Object[1];
                    c((byte) ($$b & 31), b24, b24, objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cAxisFromString, windowTouchSlop4, absoluteGravity3, 349342683, false, (String) objArr66[0], new Class[]{String.class});
                }
                long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr65)).longValue();
                long j67 = -72813155;
                String[] strArr15 = strArr14;
                long j68 = jLongValue9 ^ j26;
                str3 = str2;
                long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                long j69 = startUptimeMillis3 ^ j26;
                long j70 = (((long) 50) * j67) + (((long) (-97)) * jLongValue9) + (((long) 98) * (((j68 | j69) ^ j26) | ((j68 | j67) ^ j26))) + (((long) (-49)) * (j68 | (((j67 ^ j26) | j69) ^ j26) | ((j67 | startUptimeMillis3) ^ j26))) + (((long) 49) * (((jLongValue9 | j67) ^ j26) | ((j68 | startUptimeMillis3) ^ j26))) + ((long) (-774265450));
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i319 = ((int) (j70 >> 32)) & ((-1755333414) + (((~((-1281889033) | startElapsedRealtime)) | (-1575851853)) * (-756)) + (((~startElapsedRealtime) | (-1281889033)) * 756));
                int iMyPid3 = Process.myPid();
                int i320 = ~((-310750297) | iMyPid3);
                int i321 = ~iMyPid3;
                int i322 = ((int) j70) & ((-276196824) + ((i320 | (~((-21626913) | i321))) * 497) + (((~(iMyPid3 | (-21626913))) | (~(1769603618 | i321)) | (-2080353915)) * 497));
                if (((i319 & i322) | (i319 ^ i322)) != 0) {
                    i18 = ((i318 ^ 288) + ((i318 & 288) << 1)) ^ i15;
                    break;
                }
                i318++;
                strArr14 = strArr15;
                str2 = str3;
                i317 = 2;
            }
            int i323 = (~(i15 & i296)) & (i15 | i296);
            int i324 = -i323;
            int i325 = ((i323 & i324) | (i323 ^ i324)) >> 31;
            int i326 = (i296 & i325) | (i18 & (~i325));
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cBlue = (char) Color.blue(0);
                int longPressTimeout = 3526 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iResolveSize3 = View.resolveSize(0, 0) + 23;
                byte b25 = (byte) 5;
                byte b26 = (byte) (b25 - 5);
                Object[] objArr67 = new Object[1];
                c(b25, b26, b26, objArr67);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cBlue, longPressTimeout, iResolveSize3, 980946500, false, (String) objArr67[0], new Class[0]);
            }
            long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, null)).longValue();
            long j71 = 961251855;
            long j72 = -560;
            long j73 = (((long) (-559)) * j71) + (((long) 561) * jLongValue10) + (((j29 | j71) ^ j26) * j72) + (j72 * ((((jLongValue10 ^ j26) | j71) | j28) ^ j26)) + (((long) 560) * (((j29 | jLongValue10) ^ j26) | (((j71 ^ j26) | jLongValue10) ^ j26))) + ((long) (-1141574493));
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i327 = ((int) (j73 >> 32)) & ((-2011586686) + (((~((-40383106) | iMaxMemory)) | 1477609516) * (-756)) + (((~iMaxMemory) | (-40383106)) * 756));
            int iMyPid4 = Process.myPid();
            if ((i327 | (((int) j73) & ((-910617403) + (((~(1336552825 | (~iMyPid4))) | (~((-100673585) | iMyPid4))) * (-272)) + (((~(243935545 | iMyPid4)) | 1092617280) * (-272)) + (((~(iMyPid4 | (-243935546))) | (-1193290865)) * 272)))) != 1) {
                Object[] objArr68 = {1};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    str4 = str3;
                    char capsMode3 = (char) TextUtils.getCapsMode(str4, 0, 0);
                    int iResolveSizeAndState2 = 2673 - View.resolveSizeAndState(0, 0, 0);
                    int i328 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15;
                    byte b27 = (byte) 5;
                    byte b28 = (byte) (b27 - 5);
                    Object[] objArr69 = new Object[1];
                    c(b27, b28, b28, objArr69);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(capsMode3, iResolveSizeAndState2, i328, -1409439630, false, (String) objArr69[0], new Class[]{Integer.TYPE});
                } else {
                    str4 = str3;
                }
                long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr68)).longValue();
                long j74 = 1688852834;
                long j75 = 983;
                long j76 = jLongValue11 ^ j26;
                long j77 = (((long) (-1965)) * j74) + (((long) 984) * jLongValue11) + ((j74 | j76) * j75);
                long j78 = j74 ^ j26;
                long jNextInt = ((long) new Random().nextInt()) ^ j26;
                long j79 = j77 + (((long) (-983)) * (j78 | ((j76 | jNextInt) ^ j26))) + (j75 * (((jNextInt | j78) ^ j26) | ((j78 | jLongValue11) ^ j26))) + ((long) 178845846);
                i15 = i;
                int i329 = ~i15;
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i330 = ~iUptimeMillis;
                int i331 = ((int) (j79 >> 32)) & ((-1453938172) + (((~(2124097780 | i330)) | (-733643105)) * 519) + (((~(i330 | (-18907393))) | (~((-714735713) | iUptimeMillis))) * (-519)) + (((~(iUptimeMillis | (-733643105))) | (-2124097781)) * 519));
                int iNextInt = new Random().nextInt();
                int i332 = ~iNextInt;
                int i333 = ((int) j79) & (502627057 + ((iNextInt | (-1476362236)) * 988) + (((~((-1466529108) | i332)) | 19469569) * (-1976)) + (((~(iNextInt | (-29302698))) | (-1476362236) | (~(29302697 | i332))) * 988));
                if (((i331 & i333) | (i331 ^ i333)) != 0) {
                    i20 = i14;
                    i21 = (i15 & (-221)) | (i20 & 220);
                } else {
                    i20 = i14;
                    i21 = i15;
                }
                int i334 = (~(i15 & i326)) & (i15 | i326);
                int i335 = -i334;
                int i336 = ((i334 & i335) | (i334 ^ i335)) >> 31;
                int i337 = i21 & (~i336);
                int i338 = i326 & i336;
                int i339 = (i337 & i338) | (i337 ^ i338);
                int doubleTapTimeout = ViewConfiguration.getDoubleTapTimeout() >> 16;
                int i340 = (doubleTapTimeout & 370) + (doubleTapTimeout | 370);
                int i341 = 21 - (~(-TextUtils.lastIndexOf(str4, '0')));
                int offsetAfter4 = TextUtils.getOffsetAfter(str4, 0);
                int i342 = offsetAfter4 * 1773;
                int i343 = ((i342 | (-33638850)) << 1) - (i342 ^ (-33638850));
                int i344 = ~((~offsetAfter4) | (-38011));
                int i345 = ~(((-38011) & i15) | ((-38011) ^ i15));
                int i346 = (i344 & i345) | (i344 ^ i345);
                int i347 = (i20 ^ offsetAfter4) | (i20 & offsetAfter4);
                int i348 = ~((i347 ^ 38010) | (i347 & 38010));
                int i349 = -(-(((i346 ^ i348) | (i346 & i348)) * 886));
                int i350 = ((i343 | i349) << 1) - (i349 ^ i343);
                int i351 = ~(i20 | 38010);
                int i352 = ((offsetAfter4 & i351) | (offsetAfter4 ^ i351)) * (-1772);
                int i353 = (i350 & i352) + (i352 | i350);
                int i354 = -(-((~i347) * 886));
                Object[] objArr70 = new Object[1];
                a(i340, i341, (char) ((i353 ^ i354) + ((i354 & i353) << 1)), objArr70);
                Object[] objArr71 = {(String) objArr70[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char c6 = (char) (33603 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int iIndexOf3 = TextUtils.indexOf(str4, str4, 0) + 3085;
                    int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    byte b29 = (byte) 5;
                    byte b30 = (byte) (b29 - 5);
                    Object[] objArr72 = new Object[1];
                    c(b29, b30, b30, objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c6, iIndexOf3, iMakeMeasureSpec, 1411172903, false, (String) objArr72[0], new Class[]{String.class});
                }
                Object objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr71);
                try {
                    if (objInvoke2 != null) {
                        Object[] objArr73 = {objInvoke2, 42};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                            char c7 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int modifierMetaStateMask = 3392 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 10;
                            byte b31 = (byte) 5;
                            byte b32 = (byte) (b31 - 5);
                            Object[] objArr74 = new Object[1];
                            c(b31, b32, b32, objArr74);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c7, modifierMetaStateMask, bitsPerPixel2, 1203525406, false, (String) objArr74[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr73)).longValue();
                        long j80 = 1827976088;
                        i22 = i20;
                        long j81 = j80 ^ j26;
                        long j82 = 191;
                        long startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                        long j83 = (((long) (-381)) * j80) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue12) + (((long) (-191)) * j81) + ((j80 | ((jLongValue12 | startUptimeMillis4) ^ j26)) * j82) + (j82 * ((((startUptimeMillis4 ^ j26) | jLongValue12) ^ j26) | ((j81 | jLongValue12) ^ j26))) + ((long) (-1830045965));
                        int i355 = ~((int) Runtime.getRuntime().freeMemory());
                        int i356 = ((int) (j83 >> 32)) & ((-1019427974) + (((~(i355 | 1996390391)) | (~(i355 | (-5409)))) * (-184)) + ((1716805697 | (~((-1716811106) | i355)) | (~(279584694 | i355))) * 184) + 97018744);
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i357 = ~elapsedCpuTime;
                        int i358 = ((int) j83) & (697315584 + (((~((-275676657) | i357)) | 1712903066) * (-865)) + ((~(elapsedCpuTime | 275676656)) * 865) + (((~(1712903066 | i357)) | (~(i357 | 275676656))) * 865));
                        if (((i356 & i358) | (i356 ^ i358)) == 1986687685) {
                            i23 = i329;
                            str5 = str4;
                            i24 = i22;
                            strArr2 = null;
                            j = j26;
                        }
                        int gidForName = 888 - Process.getGidForName(str5);
                        int iRed2 = Color.red(0) + 16;
                        int i359 = -MotionEvent.axisFromString(str5);
                        Object[] objArr75 = new Object[1];
                        a(gidForName, iRed2, (char) ((i359 ^ 49243) + ((i359 & 49243) << 1)), objArr75);
                        Object[] objArr76 = {(String) objArr75[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cCombineMeasuredStates = (char) (33602 - View.combineMeasuredStates(0, 0));
                            int iMyTid3 = (Process.myTid() >> 22) + 3085;
                            int i360 = 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            byte b33 = (byte) 5;
                            byte b34 = (byte) (b33 - 5);
                            Object[] objArr77 = new Object[1];
                            c(b33, b34, b34, objArr77);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iMyTid3, i360, 1411172903, false, (String) objArr77[0], new Class[]{String.class});
                        }
                        objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr76);
                        if (objInvoke == null) {
                            i29 = 0;
                        } else {
                            Object[] objArr78 = {objInvoke, 42};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                int windowTouchSlop5 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 3393;
                                int absoluteGravity4 = 9 - Gravity.getAbsoluteGravity(0, 0);
                                byte b35 = (byte) 5;
                                byte b36 = (byte) (b35 - 5);
                                Object[] objArr79 = new Object[1];
                                c(b35, b36, b36, objArr79);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration3, windowTouchSlop5, absoluteGravity4, 1203525406, false, (String) objArr79[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr78)).longValue();
                            long j84 = 2000699244;
                            long j85 = -754;
                            long j86 = j84 ^ j;
                            long j87 = j86 | jLongValue13;
                            long j88 = (((long) 755) * j84) + (((long) (-753)) * jLongValue13) + (((j87 ^ j) | ((j86 | j28) ^ j) | ((jLongValue13 | j28) ^ j)) * j85) + (j85 * (((jLongValue13 | (j29 | j84)) ^ j) | ((j87 | j28) ^ j))) + (((long) 754) * (j86 | j29)) + ((long) (-2002769121));
                            int i361 = ~(1745127336 | i24);
                            int i362 = ((int) (j88 >> 32)) & (((671384832 | i361 | (~((-1745127337) | i15))) * (-338)) + 732032938 + ((i361 | (~((-1073742505) | i15))) * 338));
                            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                            int i363 = ((int) j88) & (1561102589 + (((~(1259138917 | iUptimeMillis2)) | (-1598601969)) * (-668)) + ((1259138917 | (~((-1598601969) | iUptimeMillis2))) * 1336) + ((iUptimeMillis2 | (-339742865)) * 668));
                            i29 = (i362 ^ i363) | (i362 & i363);
                        }
                        if (i29 != 1986687685 || i29 == -1514516938) {
                            f = 0.0f;
                        } else {
                            int i364 = 19;
                            int i365 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            int i366 = ((i365 | 1608) << 1) - (i365 ^ 1608);
                            int i367 = -(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0));
                            Object[] objArr80 = new Object[1];
                            a(i366, (i367 & 15) + (i367 | 15), (char) TextUtils.getTrimmedLength(str5), objArr80);
                            int iIndexOf4 = TextUtils.indexOf((CharSequence) str5, '0');
                            int i368 = ((iIndexOf4 | 1623) << 1) - (iIndexOf4 ^ 1623);
                            int i369 = -ExpandableListView.getPackedPositionType(0L);
                            int i370 = (i369 ^ 26) + ((i369 & 26) << 1);
                            int i371 = -ImageFormat.getBitsPerPixel(0);
                            Object[] objArr81 = new Object[1];
                            a(i368, i370, (char) ((i371 ^ 15929) + ((i371 & 15929) << 1)), objArr81);
                            int i372 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i373 = ((i372 | 1648) << 1) - (i372 ^ 1648);
                            int i374 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i375 = (i374 & 16) + (i374 | 16);
                            int i376 = -(-MotionEvent.axisFromString(str5));
                            Object[] objArr82 = new Object[1];
                            a(i373, i375, (char) ((i376 & 64465) + (i376 | 64465)), objArr82);
                            int i377 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iB4 = zzee.b();
                            int i378 = (i377 * TypedValues.Custom.TYPE_DIMENSION) - 1504398;
                            int i379 = ~i377;
                            int i380 = ~((i379 ^ iB4) | (i379 & iB4));
                            int i381 = ~iB4;
                            int i382 = ~((i381 ^ 1666) | (i381 & 1666));
                            int i383 = ((i380 & i382) | (i380 ^ i382)) * (-1808);
                            int i384 = ((i378 | i383) << 1) - (i378 ^ i383);
                            int i385 = (i379 ^ (-1667)) | (i379 & (-1667));
                            int i386 = ~((i385 & iB4) | (i385 ^ iB4));
                            int i387 = ~iB4;
                            int i388 = (i387 & i377) | (i387 ^ i377);
                            int i389 = (i384 - (~((i386 | (~((i388 & 1666) | (i388 ^ 1666)))) * TypedValues.Custom.TYPE_BOOLEAN))) - 1;
                            int i390 = ~((~i377) | 1666);
                            int i391 = ~(iB4 | (-1667));
                            int i392 = (i391 & i390) | (i390 ^ i391);
                            int i393 = ~(i377 | i381);
                            Object[] objArr83 = new Object[1];
                            a((i389 - (~(-(-(((i393 & i392) | (i392 ^ i393)) * TypedValues.Custom.TYPE_BOOLEAN))))) - 1, 16 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (char) (Process.myTid() >> 22), objArr83);
                            int keyRepeatDelay = 1682 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i394 = 13 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int iLastIndexOf5 = TextUtils.lastIndexOf(str5, '0', 0, 0);
                            Object[] objArr84 = new Object[1];
                            a(keyRepeatDelay, i394, (char) ((iLastIndexOf5 ^ 56104) + ((56104 & iLastIndexOf5) << 1)), objArr84);
                            int iNormalizeMetaState2 = 1697 - KeyEvent.normalizeMetaState(0);
                            int i395 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i396 = ~i395;
                            int i397 = ~((i396 & 37) | (i396 ^ 37));
                            int i398 = ~(((-38) ^ i395) | ((-38) & i395));
                            int i399 = (i397 & i398) | (i397 ^ i398);
                            int i400 = (i395 ^ i15) | (i395 & i15);
                            int i401 = ~i400;
                            int i402 = ((i395 * 659) - 24309) + (((i399 & i401) | (i399 ^ i401)) * (-658)) + ((~((-38) | i395)) * 658);
                            int i403 = ~((i395 & (-38)) | ((-38) ^ i395));
                            int i404 = ~i400;
                            int i405 = -(-(((i403 & i404) | (i403 ^ i404)) * 658));
                            int i406 = (i402 & i405) + (i402 | i405);
                            int i407 = -(-Color.green(0));
                            Object[] objArr85 = new Object[1];
                            a(iNormalizeMetaState2, i406, (char) ((i407 ^ 27416) + ((i407 & 27416) << 1)), objArr85);
                            int i408 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i409 = ((i408 | 1734) << 1) - (i408 ^ 1734);
                            int i410 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i411 = ((i410 | 12) << 1) - (i410 ^ 12);
                            int i412 = -TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                            int i413 = i412 * 284;
                            int i414 = (i413 & (-13941234)) + (i413 | (-13941234));
                            int i415 = ~i412;
                            int i416 = ~((49437 & i415) | (i415 ^ 49437));
                            int i417 = ~((i415 ^ i15) | (i415 & i15));
                            int i418 = ((i416 & i417) | (i416 ^ i417)) * (-283);
                            int i419 = (i414 ^ i418) + ((i418 & i414) << 1);
                            int i420 = (~(i412 | (-49438))) * 283;
                            Object[] objArr86 = new Object[1];
                            a(i409, i411, (char) ((((i419 & i420) + (i420 | i419)) - (~((~((i415 | (-49438)) | i15)) * 283))) - 1), objArr86);
                            int mode = View.MeasureSpec.getMode(0);
                            Object[] objArr87 = new Object[1];
                            a((mode ^ 1746) + ((mode & 1746) << 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 52606), objArr87);
                            int iAlpha = Color.alpha(0);
                            int i421 = ((iAlpha | 1759) << 1) - (iAlpha ^ 1759);
                            int i422 = -Color.rgb(0, 0, 0);
                            int i423 = ((i422 | (-16777194)) << 1) - (i422 ^ (-16777194));
                            int i424 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                            Object[] objArr88 = new Object[1];
                            a(i421, i423, (char) ((i424 & 63665) + (i424 | 63665)), objArr88);
                            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout();
                            int i425 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i426 = (i425 ^ 33) + ((i425 & 33) << 1);
                            b = i426 % 128;
                            int i427 = i426 % 2;
                            int i428 = jumpTapTimeout >> 16;
                            int i429 = (1781 & i428) + (i428 | 1781);
                            int i430 = 30 - (~(-(-(ViewConfiguration.getWindowTouchSlop() >> 8))));
                            int threadPriority = Process.getThreadPriority(0);
                            Object[] objArr89 = new Object[1];
                            a(i429, i430, (char) (29439 - (~(((threadPriority & 20) + (threadPriority | 20)) >> 6))), objArr89);
                            int i431 = 1811 - (~(-(-Color.blue(0))));
                            int i432 = -(-KeyEvent.keyCodeFromString(str5));
                            Object[] objArr90 = new Object[1];
                            a(i431, (i432 & 12) + (i432 | 12), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr90);
                            int i433 = -TextUtils.lastIndexOf(str5, '0', 0);
                            int i434 = (i433 & 1823) + (i433 | 1823);
                            int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                            int i435 = (scrollDefaultDelay & 12) + (scrollDefaultDelay | 12);
                            int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                            Object[] objArr91 = new Object[1];
                            a(i434, i435, (char) ((scrollBarSize2 & 14140) + (scrollBarSize2 | 14140)), objArr91);
                            int iIndexOf5 = TextUtils.indexOf((CharSequence) str5, '0');
                            Object[] objArr92 = new Object[1];
                            a((iIndexOf5 ^ 1837) + ((iIndexOf5 & 1837) << 1), 10 - (~(-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr92);
                            int scrollBarSize3 = 1848 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i436 = -Gravity.getAbsoluteGravity(0, 0);
                            int i437 = ((i436 | 12) << 1) - (i436 ^ 12);
                            int i438 = -ImageFormat.getBitsPerPixel(0);
                            Object[] objArr93 = new Object[1];
                            a(scrollBarSize3, i437, (char) ((i438 ^ (-1)) + (i438 << 1)), objArr93);
                            int i439 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i440 = ((i439 | 1861) << 1) - (i439 ^ 1861);
                            int iResolveSizeAndState3 = 12 - View.resolveSizeAndState(0, 0, 0);
                            int i441 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            Object[] objArr94 = new Object[1];
                            a(i440, iResolveSizeAndState3, (char) (((i441 | 52441) << 1) - (i441 ^ 52441)), objArr94);
                            int i442 = 1871 - (~(-(-TextUtils.indexOf(str5, str5, 0, 0))));
                            int i443 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int i444 = (i443 ^ 14) + ((i443 & 14) << 1);
                            int i445 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            Object[] objArr95 = new Object[1];
                            a(i442, i444, (char) (((i445 | 39916) << 1) - (i445 ^ 39916)), objArr95);
                            float f2 = 0.0f;
                            int i446 = 1885 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                            int i447 = (-37) - (~(-(-AndroidCharacter.getMirror('0'))));
                            int i448 = -(-AndroidCharacter.getMirror('0'));
                            Object[] objArr96 = new Object[1];
                            a(i446, i447, (char) ((i448 ^ 48983) + ((i448 & 48983) << 1)), objArr96);
                            int i449 = -TextUtils.getOffsetAfter(str5, 0);
                            int i450 = (i449 & 1898) + (i449 | 1898);
                            int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0);
                            int i451 = ((iNormalizeMetaState3 | 24) << 1) - (iNormalizeMetaState3 ^ 24);
                            int i452 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr97 = new Object[1];
                            a(i450, i451, (char) ((i452 & 42344) + (i452 | 42344)), objArr97);
                            int i453 = -(Process.myPid() >> 22);
                            int i454 = (i453 ^ 1922) + ((i453 & 1922) << 1);
                            int i455 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int i456 = ((i455 | 28) << 1) - (i455 ^ 28);
                            int i457 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr98 = new Object[1];
                            a(i454, i456, (char) ((i457 ^ 10122) + ((i457 & 10122) << 1)), objArr98);
                            String[] strArr16 = {(String) objArr80[0], (String) objArr81[0], (String) objArr82[0], (String) objArr83[0], (String) objArr84[0], (String) objArr85[0], (String) objArr86[0], (String) objArr87[0], (String) objArr88[0], (String) objArr89[0], (String) objArr90[0], (String) objArr91[0], (String) objArr92[0], (String) objArr93[0], (String) objArr94[0], (String) objArr95[0], (String) objArr96[0], (String) objArr97[0], (String) objArr98[0]};
                            int i458 = 0;
                            while (true) {
                                if (i458 >= i364) {
                                    f = f2;
                                    i458 = -1;
                                    break;
                                }
                                String str37 = strArr16[i458];
                                Object[] objArr99 = {str37};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                                    char cIndexOf2 = (char) TextUtils.indexOf(str5, str5, 0, 0);
                                    int scrollBarFadeDuration4 = 993 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int iNormalizeMetaState4 = 8 - KeyEvent.normalizeMetaState(0);
                                    byte b37 = (byte) 0;
                                    byte b38 = b37;
                                    Object[] objArr100 = new Object[1];
                                    c(b37, b38, b38, objArr100);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cIndexOf2, scrollBarFadeDuration4, iNormalizeMetaState4, -545305915, false, (String) objArr100[0], new Class[]{String.class});
                                }
                                long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr99)).longValue();
                                long j89 = -965242184;
                                long j90 = -496;
                                long j91 = (j90 * j89) + (j90 * jLongValue14);
                                long j92 = 497;
                                long j93 = j89 ^ j;
                                long j94 = jLongValue14 ^ j;
                                long j95 = j93 | j94;
                                long jNextInt2 = new Random().nextInt(726998651);
                                long j96 = jNextInt2 ^ j;
                                long j97 = j91 + ((j95 ^ j) * j92) + ((((j95 | jNextInt2) ^ j) | (((j94 | j96) | j89) ^ j)) * j92) + (j92 * (((jNextInt2 | (j94 | j89)) ^ j) | ((j93 | j96) ^ j) | ((j93 | jLongValue14) ^ j))) + ((long) 1585701468);
                                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                int i459 = ((int) (j97 >> 32)) & (1116977382 + (((~((-800217411) | iElapsedRealtime2)) | 2057523474) * (-668)) + (((-800217411) | (~(2057523474 | iElapsedRealtime2))) * 1336) + ((iElapsedRealtime2 | (-84936769)) * 668));
                                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                int i460 = ~startElapsedRealtime2;
                                int i461 = (~(723141669 | i460)) | 8393088;
                                int i462 = ~(startElapsedRealtime2 | (-17450018));
                                int i463 = ((int) j97) & (695117804 + ((i461 | i462) * (-713)) + (i462 * 1426) + ((~(714084740 | i460)) * 713));
                                if (((i463 & i459) | (i459 ^ i463)) == 0) {
                                    int scrollBarFadeDuration5 = 1872 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                    int i464 = 13 - (~(-(KeyEvent.getMaxKeyCode() >> 16)));
                                    int iIndexOf6 = TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                                    int i465 = (iIndexOf6 ^ 39917) + ((39917 & iIndexOf6) << 1);
                                    int i466 = ~(((-840113484) & i24) | ((-840113484) ^ i24));
                                    int i467 = (1184843 & i466) | (i466 ^ 1184843);
                                    int i468 = ~((i23 & (-167384796)) | (i23 ^ (-167384796)));
                                    int i469 = (i467 & i468) | (i467 ^ i468);
                                    int i470 = ~((1006313435 & i15) | (1006313435 ^ i15));
                                    int i471 = (-1903740847) + (((i469 & i470) | (i469 ^ i470)) * 590) + ((i466 | 1184843 | i468) * (-1180));
                                    int i472 = ~((167384795 & i24) | (167384795 ^ i24));
                                    int i473 = ~((i24 & 840113483) | (i24 ^ 840113483));
                                    int i474 = ((i472 & i473) | (i472 ^ i473)) * 590;
                                    int i475 = ((i471 | i474) << 1) - (i474 ^ i471);
                                    int iB5 = zzee.b();
                                    int i476 = ~((-480919526) | iB5);
                                    int i477 = (-1388469395) - (~(((211947072 ^ i476) | (i476 & 211947072)) * (-814)));
                                    int i478 = ~iB5;
                                    int i479 = (~(((-217304641) ^ i478) | ((-217304641) & i478))) | (-486277094);
                                    int i480 = ~(((-480919526) ^ iB5) | ((-480919526) & iB5));
                                    int i481 = ((i479 ^ i480) | (i480 & i479)) * 407;
                                    int i482 = (i477 ^ i481) + ((i481 & i477) << 1);
                                    int i483 = ~((480919525 & iB5) | (480919525 ^ iB5));
                                    int i484 = ((-486277094) ^ i483) | (i483 & (-486277094));
                                    int i485 = ~((217304640 ^ iB5) | (iB5 & 217304640));
                                    if (i475 <= i482 + (((i485 & i484) | (i484 ^ i485)) * 407)) {
                                        Object[] objArr101 = new Object[1];
                                        a(scrollBarFadeDuration5, i464, (char) i465, objArr101);
                                        str37.equals((String) objArr101[0]);
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    char c8 = (char) i465;
                                    Object[] objArr102 = new Object[1];
                                    a(scrollBarFadeDuration5, i464, c8, objArr102);
                                    if (str37.equals((String) objArr102[0])) {
                                        Object[] objArr103 = {str37};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                                            char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            int packedPositionGroup4 = ExpandableListView.getPackedPositionGroup(0L) + 993;
                                            int capsMode4 = TextUtils.getCapsMode(str5, 0, 0) + 8;
                                            byte b39 = (byte) 0;
                                            Object[] objArr104 = new Object[1];
                                            c((byte) ($$b & 31), b39, b39, objArr104);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(doubleTapTimeout2, packedPositionGroup4, capsMode4, 349342683, false, (String) objArr104[0], new Class[]{String.class});
                                        }
                                        long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr103)).longValue();
                                        long j98 = 41794009;
                                        long j99 = j98 ^ j;
                                        long j100 = (j99 | j29) ^ j;
                                        long j101 = (j99 | jLongValue15) ^ j;
                                        long j102 = (j22 * j98) + (j23 * jLongValue15) + ((j100 | j101 | ((j29 | jLongValue15) ^ j)) * j25) + (j25 * j101) + (j33 * ((((jLongValue15 ^ j) | j98) ^ j) | j28 | j101)) + ((long) (-888872614));
                                        int iNextInt2 = new Random().nextInt(2031941421);
                                        int i486 = ~iNextInt2;
                                        int i487 = ((int) (j102 >> 32)) & (1967493218 + (((~((-512860594) | i486)) | (-924365818)) * (-865)) + ((~(iNextInt2 | 512860593)) * 865) + (((~((-924365818) | i486)) | (~(i486 | 512860593))) * 865));
                                        int i488 = ~((int) SystemClock.elapsedRealtime());
                                        int i489 = ((int) j102) & (2027363627 + ((~(2078005950 | i488)) * (-783)) + (((~(i488 | 467223180)) | 1904449590) * 783));
                                        if (((i487 & i489) | (i487 ^ i489)) != 0) {
                                        }
                                    }
                                    int i490 = (i458 & 113) + (i458 | 113);
                                    i458 = (i490 & (-112)) + (i490 | (-112));
                                    i364 = 19;
                                    f2 = 0.0f;
                                }
                                f = 0.0f;
                                break;
                            }
                            int i491 = (i458 & 130) + (i458 | 130);
                            int i492 = (i491 | i15) & (~(i15 & i491));
                            int i493 = ~i458;
                            int i494 = -i493;
                            int i495 = ((i493 & i494) | (i493 ^ i494)) >> 31;
                            int i496 = ~i495;
                            int i497 = b;
                            int i498 = (i497 ^ 57) + ((i497 & 57) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i498 % 128;
                            if (i498 % 2 != 0) {
                                throw null;
                            }
                            int i499 = i496 & i15;
                            int i500 = i492 & i495;
                            int i501 = (i500 & i499) | (i499 ^ i500);
                            int i502 = (~(i15 & i339)) & (i15 | i339);
                            int i503 = -i502;
                            int i504 = ((i502 & i503) | (i502 ^ i503)) >> 31;
                            int i505 = i501 & (~i504);
                            int i506 = i339 & i504;
                            i339 = (i506 & i505) | (i505 ^ i506);
                        }
                        int i507 = -(AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                        int i508 = ((i507 | 1951) << 1) - (i507 ^ 1951);
                        int i509 = -ExpandableListView.getPackedPositionGroup(0L);
                        Object[] objArr105 = new Object[1];
                        a(i508, ((i509 | 13) << 1) - (i509 ^ 13), (char) (33389 - (~(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0)))), objArr105);
                        String str38 = (String) objArr105[0];
                        int i510 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 1963;
                        int offsetAfter5 = 5 - TextUtils.getOffsetAfter(str5, 0);
                        int i511 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        Object[] objArr106 = new Object[1];
                        a(i510, offsetAfter5, (char) ((i511 ^ 61611) + ((i511 & 61611) << 1)), objArr106);
                        String[] strArr17 = {str38, (String) objArr106[0]};
                        int deadChar2 = KeyEvent.getDeadChar(0, 0);
                        Object[] objArr107 = new Object[1];
                        a((deadChar2 ^ 1968) + ((deadChar2 & 1968) << 1), 15 - TextUtils.indexOf(str5, str5, 0), (char) (16054 - (~(-TextUtils.getTrimmedLength(str5)))), objArr107);
                        String str39 = (String) objArr107[0];
                        int i512 = -(-(TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)));
                        int i513 = (i512 ^ 1983) + ((i512 & 1983) << 1);
                        int i514 = -View.getDefaultSize(0, 0);
                        int i515 = ((i514 | 19) << 1) - (i514 ^ 19);
                        int i516 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr108 = new Object[1];
                        a(i513, i515, (char) ((i516 & 26650) + (i516 | 26650)), objArr108);
                        String str40 = (String) objArr108[0];
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                        Object[] objArr109 = new Object[1];
                        a((packedPositionChild & 2003) + (packedPositionChild | 2003), 13 - (~(-(-(AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1))))), (char) (55138 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr109);
                        String[] strArr18 = {str39, str40, (String) objArr109[0]};
                        int i517 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 2016;
                        int i518 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr110 = new Object[1];
                        a(i517, ((i518 | 21) << 1) - (i518 ^ 21), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 17552), objArr110);
                        String str41 = (String) objArr110[0];
                        int i519 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr111 = new Object[1];
                        a((i519 & 2038) + (i519 | 2038), Drawable.resolveOpacity(0, 0) + 10, (char) (TextUtils.getOffsetAfter(str5, 0) + 63948), objArr111);
                        String[] strArr19 = {str41, (String) objArr111[0]};
                        int i520 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
                        int i521 = ((i520 | 2046) << 1) - (i520 ^ 2046);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11;
                        int i522 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Object[] objArr112 = new Object[1];
                        a(i521, keyRepeatTimeout, (char) ((i522 ^ 1) + ((i522 & 1) << 1)), objArr112);
                        String str42 = (String) objArr112[0];
                        int iIndexOf7 = TextUtils.indexOf(str5, str5, 0, 0);
                        int i523 = (iIndexOf7 ^ 587) + ((iIndexOf7 & 587) << 1);
                        int i524 = -TextUtils.getCapsMode(str5, 0, 0);
                        Object[] objArr113 = new Object[1];
                        a(i523, ((i524 | 6) << 1) - (i524 ^ 6), (char) (KeyEvent.normalizeMetaState(0) + 53887), objArr113);
                        String[] strArr20 = {str42, (String) objArr113[0]};
                        int doubleTapTimeout3 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                        Object[] objArr114 = new Object[1];
                        a((doubleTapTimeout3 ^ 2058) + ((doubleTapTimeout3 & 2058) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, (char) View.MeasureSpec.getSize(0), objArr114);
                        String str43 = (String) objArr114[0];
                        int i525 = -ImageFormat.getBitsPerPixel(0);
                        int i526 = (i525 ^ 2036) + ((i525 & 2036) << 1);
                        int i527 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                        int touchSlop4 = ViewConfiguration.getTouchSlop() >> 8;
                        int i528 = (touchSlop4 * 615) - 39200124;
                        int i529 = ~touchSlop4;
                        int i530 = ~((i529 ^ 63948) | (i529 & 63948));
                        int i531 = (i15 ^ i530) | (i530 & i15);
                        int i532 = ~(((-63949) ^ touchSlop4) | ((-63949) & touchSlop4));
                        int i533 = ((i531 ^ i532) | (i531 & i532)) * 614;
                        int i534 = (i528 ^ i533) + ((i533 & i528) << 1);
                        int i535 = ~(i529 | i23);
                        int i536 = ~touchSlop4;
                        String[] strArr21 = strArr2;
                        int i537 = ~(i536 | 63948);
                        int i538 = (i535 ^ i537) | (i535 & i537);
                        int i539 = ~(i24 | 63948);
                        int i540 = ((i538 & i539) | (i538 ^ i539)) * (-1228);
                        int i541 = ((i534 | i540) << 1) - (i540 ^ i534);
                        int i542 = (-63949) | i536;
                        int i543 = ~((i542 & i24) | (i542 ^ i24));
                        int i544 = i24 | touchSlop4;
                        int i545 = ~((i544 & 63948) | (i544 ^ 63948));
                        char c9 = (char) (i541 + (((i543 & i545) | (i543 ^ i545)) * 614));
                        i30 = 1;
                        Object[] objArr115 = new Object[1];
                        a(i526, i527, c9, objArr115);
                        c = 0;
                        strArr4 = new String[][]{strArr17, strArr18, strArr19, strArr20, new String[]{str43, (String) objArr115[0]}};
                        i31 = 0;
                        i32 = 5;
                        i33 = -1;
                        loop7: while (true) {
                            if (i31 < i32) {
                                str7 = str5;
                                i34 = i15;
                                break;
                            }
                            String[] strArr22 = strArr4[i31];
                            str10 = strArr22[c];
                            strArr5 = (String[]) Arrays.copyOfRange(strArr22, i30, strArr22.length);
                            length3 = strArr5.length;
                            i44 = 0;
                            while (i44 < length3) {
                                int i546 = (i33 ^ (-2)) + ((i33 & (-2)) << i30);
                                i33 = ((i546 | 3) << i30) - (i546 ^ 3);
                                Object[] objArr116 = {str10, strArr5[i44]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str5, '0', 0));
                                    int iIndexOf8 = TextUtils.indexOf(str5, str5) + 2385;
                                    int i547 = 33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    byte b40 = (byte) 5;
                                    byte b41 = (byte) (b40 - 5);
                                    Object[] objArr117 = new Object[1];
                                    c(b40, b41, b41, objArr117);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf3, iIndexOf8, i547, -1207062455, false, (String) objArr117[0], new Class[]{String.class, String.class});
                                }
                                long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr116)).longValue();
                                long j103 = 1532879348;
                                i45 = length3;
                                str11 = str10;
                                long j104 = 672;
                                i46 = i31;
                                long jMyTid2 = Process.myTid();
                                i47 = i44;
                                str7 = str5;
                                long j105 = jMyTid2 ^ j;
                                long j106 = (((long) 673) * j103) + (((long) (-1343)) * jLongValue16) + ((jLongValue16 | ((j103 | jMyTid2) ^ j)) * j104) + (((long) (-672)) * ((((j103 ^ j) | j105) ^ j) | ((jMyTid2 | jLongValue16) ^ j)));
                                long j107 = jLongValue16 ^ j;
                                long j108 = j106 + (j104 * (((j107 | j103) ^ j) | ((j107 | j105) ^ j))) + ((long) 444163980);
                                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                int i548 = ~iFreeMemory;
                                i48 = ((int) (j108 >> 32)) & ((((~(133975142 | i548)) | (~(1571201553 | iFreeMemory))) * 959) + 319139057 + (((~(iFreeMemory | 133975142)) | (~(i548 | 1571201553))) * 959));
                                i49 = ((int) j108) & (1019428157 + (((~(i24 | (-268451969))) | (~(i24 | 2142763774))) * (-184)) + (((~((-486994667) | i24)) | 218542698 | (~(1924221076 | i24))) * 184) + 281161960);
                                if (((i48 & i49) | (i48 ^ i49)) != 0) {
                                    int i549 = (i33 & 170) + (i33 | 170);
                                    i34 = (i549 & i24) | ((~i549) & i15);
                                    break loop7;
                                }
                                i44 = (i47 & 1) + (i47 | 1);
                                strArr4 = strArr4;
                                strArr5 = strArr5;
                                str10 = str11;
                                i31 = i46;
                                length3 = i45;
                                str5 = str7;
                                i30 = 1;
                            }
                            i31++;
                            i32 = 5;
                            c = 0;
                            i30 = 1;
                        }
                        int i550 = ((~i339) & i15) | (i339 & i24);
                        int i551 = -i550;
                        int i552 = ((i550 & i551) | (i550 ^ i551)) >> 31;
                        int i553 = i34 & (~i552);
                        int i554 = i339 & i552;
                        int i555 = (i553 ^ i554) | (i554 & i553);
                        int i556 = -(-Color.blue(0));
                        int i557 = (i556 ^ 2086) + ((i556 & 2086) << 1);
                        int defaultSize2 = View.getDefaultSize(0, 0) + 13;
                        int threadPriority2 = Process.getThreadPriority(0);
                        Object[] objArr118 = new Object[1];
                        a(i557, defaultSize2, (char) (((threadPriority2 & 20) + (threadPriority2 | 20)) >> 6), objArr118);
                        str9 = (String) objArr118[0];
                        int i558 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i559 = ((i558 | 2100) << 1) - (i558 ^ 2100);
                        int i560 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                        Object[] objArr119 = new Object[1];
                        a(i559, ((i560 | 8) << 1) - (i560 ^ 8), (char) (KeyEvent.keyCodeFromString(str7) + 34863), objArr119);
                        bytes = ((String) objArr119[0]).getBytes();
                        length2 = bytes.length;
                        if (length2 == 0) {
                            int i561 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                            b = i561 % 128;
                            int i562 = i561 % 2;
                        } else {
                            try {
                                bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str9));
                                int i563 = b + 27;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i563 % 128;
                                int i564 = i563 % 2;
                                try {
                                    bArr3 = new byte[4096];
                                    i36 = 0;
                                    i37 = 0;
                                    while (true) {
                                        i38 = bufferedInputStream5.read(bArr3, i36, 4096);
                                        if (i38 > 0) {
                                            break;
                                        }
                                        i39 = i37;
                                        i40 = 0;
                                        while (i39 < length2 && i40 < i38) {
                                            if (bArr3[i40] == bytes[i39]) {
                                                int i565 = b + 119;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i565 % 128;
                                                int i566 = i565 % 2;
                                                int i567 = (i39 ^ (-38)) + ((i39 & (-38)) << 1);
                                                i39 = ((i567 | 39) << 1) - (i567 ^ 39);
                                            } else if (i39 != 0) {
                                                i41 = (i39 ^ (-1)) + (i39 << 1);
                                                while (true) {
                                                    if (i41 > 0) {
                                                        i39 = 0;
                                                        break;
                                                    }
                                                    i42 = 0;
                                                    while (true) {
                                                        if (i42 < i41) {
                                                            i39 = i41;
                                                            break;
                                                        }
                                                        i43 = -i41;
                                                        if (bytes[i42] != bytes[(((i39 | i43) << 1) - (i43 ^ i39)) + i42]) {
                                                            break;
                                                        }
                                                        i42++;
                                                    }
                                                    int i568 = (i41 & 88) + (i41 | 88);
                                                    i41 = ((i568 | (-89)) << 1) - (i568 ^ (-89));
                                                }
                                            }
                                            i40++;
                                        }
                                        i37 = i39;
                                        i36 = 0;
                                    }
                                    if (i37 == length2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    try {
                                        bufferedInputStream5.close();
                                    } catch (IOException unused11) {
                                    }
                                    if (z2) {
                                        i35 = i15;
                                    }
                                } catch (IOException unused12) {
                                    if (bufferedInputStream5 != null) {
                                        try {
                                            bufferedInputStream5.close();
                                        } catch (IOException unused13) {
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (bufferedInputStream5 != null) {
                                        try {
                                            bufferedInputStream5.close();
                                        } catch (IOException unused14) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException unused15) {
                                bufferedInputStream5 = null;
                            } catch (Throwable th7) {
                                th = th7;
                                bufferedInputStream5 = null;
                            }
                            int i569 = ((~i555) & i15) | (i555 & i24);
                            int i570 = -i569;
                            int i571 = ((i569 & i570) | (i569 ^ i570)) >> 31;
                            int i572 = i35 & (~i571);
                            int i573 = i555 & i571;
                            int i574 = (i572 & i573) | (i572 ^ i573);
                            str8 = str7;
                            int iIndexOf9 = TextUtils.indexOf((CharSequence) str8, '0') + 2108;
                            int i575 = -Color.red(0);
                            int i576 = i575 * (-500);
                            int i577 = (i576 & (-23500)) + (i576 | (-23500));
                            int i578 = ~(((-48) & i575) | ((-48) ^ i575));
                            int i579 = ~i575;
                            int i580 = ((i577 + ((i578 | (~(((i579 ^ 47) | (i579 & 47)) | i15))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - (~((~((i579 ^ (-48)) | (i579 & (-48)))) * 1002))) - 1;
                            int i581 = (i579 & i23) | (i579 ^ i23);
                            int i582 = (~((i581 & 47) | (i581 ^ 47))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                            Object[] objArr120 = new Object[1];
                            a(iIndexOf9, ((i580 | i582) << 1) - (i582 ^ i580), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr120);
                            Object[] objArr121 = {(String) objArr120[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                int iResolveSizeAndState4 = 993 - View.resolveSizeAndState(0, 0, 0);
                                int iLastIndexOf6 = 7 - TextUtils.lastIndexOf(str8, '0');
                                byte b42 = (byte) 0;
                                byte b43 = b42;
                                Object[] objArr122 = new Object[1];
                                c(b42, b43, b43, objArr122);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iResolveSizeAndState4, iLastIndexOf6, -545305915, false, (String) objArr122[0], new Class[]{String.class});
                            }
                            long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr121)).longValue();
                            long j109 = -1195104307;
                            long j110 = -495;
                            long j111 = j109 ^ j;
                            long j112 = ((j111 | j28) ^ j) | (((jLongValue17 ^ j) | j111) ^ j);
                            long j113 = (j110 * j109) + (j110 * jLongValue17) + (((long) 992) * j112) + (((long) (-496)) * ((((j29 | j109) | jLongValue17) ^ j) | j112)) + (((long) 496) * (jLongValue17 | j28)) + ((long) 1815563591);
                            int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                            int i583 = ((int) (j113 >> 32)) & (1520786966 + (((~((~startElapsedRealtime3) | (-1754298183))) | 1082143494) * 529) + (((~(startElapsedRealtime3 | (-1754298183))) | 1103442702) * 529));
                            int iNextInt3 = new Random().nextInt(2103255027);
                            int i584 = ~iNextInt3;
                            int i585 = ((int) j113) & ((-1687905466) + (((~((-1265715872) | i584)) | 1592025014) * (-90)) + (((~((-1265715872) | iNextInt3)) | (-1609916352)) * (-45)) + (((~(iNextInt3 | (-1592025015))) | (-1265715872) | (~(i584 | 1592025014))) * 45));
                            int i586 = ((i583 & i585) | (i583 ^ i585)) * 263;
                            int i587 = (i586 & i24) | ((~i586) & i15);
                            int i588 = ((~i574) & i15) | (i574 & i24);
                            int i589 = -i588;
                            int i590 = ((i588 & i589) | (i588 ^ i589)) >> 31;
                            int i591 = i587 & (~i590);
                            int i592 = i574 & i590;
                            i326 = (i592 & i591) | (i591 ^ i592);
                            strArr = strArr21;
                            i19 = 5;
                        }
                        i35 = i15 ^ 150;
                        int i5610 = ((~i555) & i15) | (i555 & i24);
                        int i5710 = -i5610;
                        int i5711 = ((i5610 & i5710) | (i5610 ^ i5710)) >> 31;
                        int i5712 = i35 & (~i5711);
                        int i5713 = i555 & i5711;
                        int i5714 = (i5712 & i5713) | (i5712 ^ i5713);
                        str8 = str7;
                        int iIndexOf10 = TextUtils.indexOf((CharSequence) str8, '0') + 2108;
                        int i5715 = -Color.red(0);
                        int i5716 = i5715 * (-500);
                        int i5717 = (i5716 & (-23500)) + (i5716 | (-23500));
                        int i5718 = ~(((-48) & i5715) | ((-48) ^ i5715));
                        int i5719 = ~i5715;
                        int i5810 = ((i5717 + ((i5718 | (~(((i5719 ^ 47) | (i5719 & 47)) | i15))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - (~((~((i5719 ^ (-48)) | (i5719 & (-48)))) * 1002))) - 1;
                        int i5811 = (i5719 & i23) | (i5719 ^ i23);
                        int i5812 = (~((i5811 & 47) | (i5811 ^ 47))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        Object[] objArr123 = new Object[1];
                        a(iIndexOf10, ((i5810 | i5812) << 1) - (i5812 ^ i5810), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr123);
                        Object[] objArr124 = {(String) objArr123[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                            int iResolveSizeAndState5 = 993 - View.resolveSizeAndState(0, 0, 0);
                            int iLastIndexOf7 = 7 - TextUtils.lastIndexOf(str8, '0');
                            byte b44 = (byte) 0;
                            byte b45 = b44;
                            Object[] objArr125 = new Object[1];
                            c(b44, b45, b45, objArr125);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState2, iResolveSizeAndState5, iLastIndexOf7, -545305915, false, (String) objArr125[0], new Class[]{String.class});
                        }
                        long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr124)).longValue();
                        long j1010 = -1195104307;
                        long j114 = -495;
                        long j115 = j1010 ^ j;
                        long j116 = ((j115 | j28) ^ j) | (((jLongValue18 ^ j) | j115) ^ j);
                        long j117 = (j114 * j1010) + (j114 * jLongValue18) + (((long) 992) * j116) + (((long) (-496)) * ((((j29 | j1010) | jLongValue18) ^ j) | j116)) + (((long) 496) * (jLongValue18 | j28)) + ((long) 1815563591);
                        int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                        int i5813 = ((int) (j117 >> 32)) & (1520786966 + (((~((~startElapsedRealtime4) | (-1754298183))) | 1082143494) * 529) + (((~(startElapsedRealtime4 | (-1754298183))) | 1103442702) * 529));
                        int iNextInt4 = new Random().nextInt(2103255027);
                        int i5814 = ~iNextInt4;
                        int i5815 = ((int) j117) & ((-1687905466) + (((~((-1265715872) | i5814)) | 1592025014) * (-90)) + (((~((-1265715872) | iNextInt4)) | (-1609916352)) * (-45)) + (((~(iNextInt4 | (-1592025015))) | (-1265715872) | (~(i5814 | 1592025014))) * 45));
                        int i5816 = ((i5813 & i5815) | (i5813 ^ i5815)) * 263;
                        int i5817 = (i5816 & i24) | ((~i5816) & i15);
                        int i5818 = ((~i5714) & i15) | (i5714 & i24);
                        int i5819 = -i5818;
                        int i593 = ((i5818 & i5819) | (i5818 ^ i5819)) >> 31;
                        int i594 = i5817 & (~i593);
                        int i595 = i5714 & i593;
                        i326 = (i595 & i594) | (i594 ^ i595);
                        strArr = strArr21;
                        i19 = 5;
                    } else {
                        i22 = i20;
                    }
                    int i5510 = -(-Color.blue(0));
                    int i5511 = (i5510 ^ 2086) + ((i5510 & 2086) << 1);
                    int defaultSize3 = View.getDefaultSize(0, 0) + 13;
                    int threadPriority3 = Process.getThreadPriority(0);
                    Object[] objArr1110 = new Object[1];
                    a(i5511, defaultSize3, (char) (((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6), objArr1110);
                    str9 = (String) objArr1110[0];
                    int i5512 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i5513 = ((i5512 | 2100) << 1) - (i5512 ^ 2100);
                    int i5611 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                    Object[] objArr1111 = new Object[1];
                    a(i5513, ((i5611 | 8) << 1) - (i5611 ^ 8), (char) (KeyEvent.keyCodeFromString(str7) + 34863), objArr1111);
                    bytes = ((String) objArr1111[0]).getBytes();
                    length2 = bytes.length;
                    if (length2 == 0) {
                        int i5612 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                        b = i5612 % 128;
                        int i5613 = i5612 % 2;
                    } else {
                        bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str9));
                        int i5614 = b + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5614 % 128;
                        int i5615 = i5614 % 2;
                        bArr3 = new byte[4096];
                        i36 = 0;
                        i37 = 0;
                        while (true) {
                            i38 = bufferedInputStream5.read(bArr3, i36, 4096);
                            if (i38 > 0) {
                                break;
                                break;
                            }
                            i39 = i37;
                            i40 = 0;
                            while (i39 < length2) {
                                if (bArr3[i40] == bytes[i39]) {
                                    int i5616 = b + 119;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5616 % 128;
                                    int i5617 = i5616 % 2;
                                    int i5618 = (i39 ^ (-38)) + ((i39 & (-38)) << 1);
                                    i39 = ((i5618 | 39) << 1) - (i5618 ^ 39);
                                } else if (i39 != 0) {
                                    i41 = (i39 ^ (-1)) + (i39 << 1);
                                    while (true) {
                                        if (i41 > 0) {
                                            i39 = 0;
                                            break;
                                            break;
                                        }
                                        i42 = 0;
                                        while (true) {
                                            if (i42 < i41) {
                                                i39 = i41;
                                                break;
                                                break;
                                            }
                                            i43 = -i41;
                                            if (bytes[i42] != bytes[(((i39 | i43) << 1) - (i43 ^ i39)) + i42]) {
                                                break;
                                            }
                                            i42++;
                                        }
                                        int i5619 = (i41 & 88) + (i41 | 88);
                                        i41 = ((i5619 | (-89)) << 1) - (i5619 ^ (-89));
                                    }
                                }
                                i40++;
                            }
                            i37 = i39;
                            i36 = 0;
                        }
                        if (i37 == length2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bufferedInputStream5.close();
                        if (z2) {
                            i35 = i15;
                        }
                        int i56110 = ((~i555) & i15) | (i555 & i24);
                        int i57110 = -i56110;
                        int i57111 = ((i56110 & i57110) | (i56110 ^ i57110)) >> 31;
                        int i57112 = i35 & (~i57111);
                        int i57113 = i555 & i57111;
                        int i57114 = (i57112 & i57113) | (i57112 ^ i57113);
                        str8 = str7;
                        int iIndexOf11 = TextUtils.indexOf((CharSequence) str8, '0') + 2108;
                        int i57115 = -Color.red(0);
                        int i57116 = i57115 * (-500);
                        int i57117 = (i57116 & (-23500)) + (i57116 | (-23500));
                        int i57118 = ~(((-48) & i57115) | ((-48) ^ i57115));
                        int i57119 = ~i57115;
                        int i58110 = ((i57117 + ((i57118 | (~(((i57119 ^ 47) | (i57119 & 47)) | i15))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - (~((~((i57119 ^ (-48)) | (i57119 & (-48)))) * 1002))) - 1;
                        int i58111 = (i57119 & i23) | (i57119 ^ i23);
                        int i58112 = (~((i58111 & 47) | (i58111 ^ 47))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        Object[] objArr126 = new Object[1];
                        a(iIndexOf11, ((i58110 | i58112) << 1) - (i58112 ^ i58110), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr126);
                        Object[] objArr127 = {(String) objArr126[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveSizeAndState3 = (char) View.resolveSizeAndState(0, 0, 0);
                            int iResolveSizeAndState6 = 993 - View.resolveSizeAndState(0, 0, 0);
                            int iLastIndexOf8 = 7 - TextUtils.lastIndexOf(str8, '0');
                            byte b46 = (byte) 0;
                            byte b47 = b46;
                            Object[] objArr128 = new Object[1];
                            c(b46, b47, b47, objArr128);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState3, iResolveSizeAndState6, iLastIndexOf8, -545305915, false, (String) objArr128[0], new Class[]{String.class});
                        }
                        long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr127)).longValue();
                        long j1011 = -1195104307;
                        long j118 = -495;
                        long j119 = j1011 ^ j;
                        long j1110 = ((j119 | j28) ^ j) | (((jLongValue19 ^ j) | j119) ^ j);
                        long j1111 = (j118 * j1011) + (j118 * jLongValue19) + (((long) 992) * j1110) + (((long) (-496)) * ((((j29 | j1011) | jLongValue19) ^ j) | j1110)) + (((long) 496) * (jLongValue19 | j28)) + ((long) 1815563591);
                        int startElapsedRealtime5 = (int) Process.getStartElapsedRealtime();
                        int i58113 = ((int) (j1111 >> 32)) & (1520786966 + (((~((~startElapsedRealtime5) | (-1754298183))) | 1082143494) * 529) + (((~(startElapsedRealtime5 | (-1754298183))) | 1103442702) * 529));
                        int iNextInt5 = new Random().nextInt(2103255027);
                        int i58114 = ~iNextInt5;
                        int i58115 = ((int) j1111) & ((-1687905466) + (((~((-1265715872) | i58114)) | 1592025014) * (-90)) + (((~((-1265715872) | iNextInt5)) | (-1609916352)) * (-45)) + (((~(iNextInt5 | (-1592025015))) | (-1265715872) | (~(i58114 | 1592025014))) * 45));
                        int i58116 = ((i58113 & i58115) | (i58113 ^ i58115)) * 263;
                        int i58117 = (i58116 & i24) | ((~i58116) & i15);
                        int i58118 = ((~i57114) & i15) | (i57114 & i24);
                        int i58119 = -i58118;
                        int i596 = ((i58118 & i58119) | (i58118 ^ i58119)) >> 31;
                        int i597 = i58117 & (~i596);
                        int i598 = i57114 & i596;
                        i326 = (i598 & i597) | (i597 ^ i598);
                        strArr = strArr21;
                        i19 = 5;
                    }
                    i35 = i15 ^ 150;
                } catch (Exception unused16) {
                    i35 = (~(i15 & 151)) & (i15 | 151);
                }
                int i599 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i600 = (i599 ^ 371) + ((i599 & 371) << 1);
                int i601 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                Object[] objArr129 = new Object[1];
                a(i600, (i601 & 22) + (i601 | 22), (char) (38009 - (~(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), objArr129);
                String str44 = (String) objArr129[0];
                int i602 = 808 - (~TextUtils.lastIndexOf(str4, '0', 0, 0));
                int i603 = -(-Color.alpha(0));
                Object[] objArr130 = new Object[1];
                a(i602, (i603 ^ 10) + ((i603 & 10) << 1), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr130);
                String str45 = (String) objArr130[0];
                Object[] objArr131 = new Object[1];
                a(817 - ImageFormat.getBitsPerPixel(0), 6 - (~(-Color.argb(0, 0, 0, 0))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr131);
                String str46 = (String) objArr131[0];
                int scrollBarFadeDuration6 = 825 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int i604 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i605 = (i604 ^ 8) + ((i604 & 8) << 1);
                int i606 = -(-TextUtils.getOffsetAfter(str4, 0));
                Object[] objArr132 = new Object[1];
                a(scrollBarFadeDuration6, i605, (char) ((i606 & 20863) + (i606 | 20863)), objArr132);
                String[] strArr23 = {str44, str45, str46, (String) objArr132[0]};
                int i607 = -Color.blue(0);
                int i608 = ((i607 | 833) << 1) - (i607 ^ 833);
                int i609 = -View.resolveSize(0, 0);
                int i610 = (i609 & 17) + (i609 | 17);
                int i611 = -(-Color.blue(0));
                Object[] objArr133 = new Object[1];
                a(i608, i610, (char) ((38055 ^ i611) + ((i611 & 38055) << 1)), objArr133);
                String str47 = (String) objArr133[0];
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 850;
                int i612 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr134 = new Object[1];
                a(maximumDrawingCacheSize2, ((i612 | 8) << 1) - (i612 ^ 8), (char) (Process.myTid() >> 22), objArr134);
                String str48 = (String) objArr134[0];
                int i613 = 856 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                int i614 = -TextUtils.indexOf((CharSequence) str4, '0', 0, 0);
                Object[] objArr135 = new Object[1];
                a(i613, (i614 & 6) + (i614 | 6), (char) View.MeasureSpec.getMode(0), objArr135);
                String str49 = (String) objArr135[0];
                int iAlpha2 = Color.alpha(0);
                int i615 = (iAlpha2 ^ 864) + ((iAlpha2 & 864) << 1);
                int i616 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                int i617 = (i616 & 11) + (i616 | 11);
                int i618 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr136 = new Object[1];
                a(i615, i617, (char) ((i618 & 3901) + (i618 | 3901)), objArr136);
                String str50 = (String) objArr136[0];
                int fadingEdgeLength3 = ViewConfiguration.getFadingEdgeLength() >> 16;
                int i619 = (fadingEdgeLength3 ^ 875) + ((fadingEdgeLength3 & 875) << 1);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
                int iB6 = zzee.b();
                int i620 = (iCombineMeasuredStates * 569) + 7966;
                int i621 = ~iCombineMeasuredStates;
                int i622 = ~(i621 | (-15));
                int i623 = ~iCombineMeasuredStates;
                int i624 = ~iB6;
                int i625 = i622 | (~(i623 | i624));
                int i626 = ~(((-15) ^ i624) | ((-15) & i624));
                int i627 = ((i625 ^ i626) | (i625 & i626)) * (-1136);
                int i628 = (i620 & i627) + (i627 | i620);
                int i629 = (~((i621 ^ iB6) | (i621 & iB6))) | (~(((-15) ^ iB6) | ((-15) & iB6)));
                int i630 = (iCombineMeasuredStates & i624) | (i624 ^ iCombineMeasuredStates);
                int i631 = ~((i630 ^ 14) | (i630 & 14));
                int i632 = ((i629 & i631) | (i629 ^ i631)) * (-568);
                int i633 = ((i628 | i632) << 1) - (i632 ^ i628);
                int i634 = ~i630;
                int i635 = ~((~iB6) | 14);
                int i636 = (i634 & i635) | (i634 ^ i635);
                int i637 = (i621 & (-15)) | (i621 ^ (-15));
                int i638 = ~((i637 & iB6) | (i637 ^ iB6));
                Object[] objArr137 = new Object[1];
                a(i619, (i633 - (~(-(-(((i638 & i636) | (i636 ^ i638)) * 568))))) - 1, (char) ((-2) - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))), objArr137);
                String[] strArr24 = {str47, str48, str49, str50, (String) objArr137[0]};
                int iIndexOf12 = TextUtils.indexOf(str4, str4) + 889;
                int offsetAfter6 = TextUtils.getOffsetAfter(str4, 0);
                int i639 = (offsetAfter6 ^ 16) + ((offsetAfter6 & 16) << 1);
                int i640 = -Color.green(0);
                Object[] objArr138 = new Object[1];
                a(iIndexOf12, i639, (char) (((49244 | i640) << 1) - (i640 ^ 49244)), objArr138);
                String str51 = (String) objArr138[0];
                int i641 = -Color.blue(0);
                Object[] objArr139 = new Object[1];
                a((i641 & TypedValues.Custom.TYPE_DIMENSION) + (i641 | TypedValues.Custom.TYPE_DIMENSION), 3 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), (char) (TextUtils.getOffsetBefore(str4, 0) + 16650), objArr139);
                String str52 = (String) objArr139[0];
                Object[] objArr140 = new Object[1];
                a(915 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)))), 22 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((-TextUtils.lastIndexOf(str4, '0')) - 1), objArr140);
                String str53 = (String) objArr140[0];
                int iIndexOf13 = TextUtils.indexOf((CharSequence) str4, '0', 0);
                int i642 = ((iIndexOf13 | 939) << 1) - (iIndexOf13 ^ 939);
                int i643 = -TextUtils.indexOf(str4, str4);
                Object[] objArr141 = new Object[1];
                a(i642, (i643 ^ 25) + ((i643 & 25) << 1), (char) (0 - (~ExpandableListView.getPackedPositionChild(0L))), objArr141);
                String str54 = (String) objArr141[0];
                int i644 = -(ViewConfiguration.getScrollBarSize() >> 8);
                Object[] objArr142 = new Object[1];
                a(((i644 | 963) << 1) - (i644 ^ 963), 27 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))), (char) TextUtils.getOffsetAfter(str4, 0), objArr142);
                str5 = str4;
                j = j26;
                String[] strArr25 = {str51, str52, str13, str53, str54, (String) objArr142[0]};
                Object[] objArr143 = new Object[1];
                a(990 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16)), 10 - (~ExpandableListView.getPackedPositionType(0L)), (char) (33120 - TextUtils.lastIndexOf(str5, '0', 0)), objArr143);
                String str55 = (String) objArr143[0];
                int i645 = -(KeyEvent.getMaxKeyCode() >> 16);
                Object[] objArr144 = new Object[1];
                a((i645 ^ 1002) + ((i645 & 1002) << 1), 7 - (~(ViewConfiguration.getMaximumFlingVelocity() >> 16)), (char) TextUtils.getCapsMode(str5, 0, 0), objArr144);
                String str56 = (String) objArr144[0];
                int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + PointerIconCompat.TYPE_ALIAS;
                int i646 = -TextUtils.indexOf(str5, str5, 0);
                Object[] objArr145 = new Object[1];
                a(keyRepeatDelay2, (i646 & 6) + (i646 | 6), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr145);
                String str57 = (String) objArr145[0];
                int i647 = -(-Color.blue(0));
                Object[] objArr146 = new Object[1];
                a((i647 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + (i647 | PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW), 6 - View.resolveSize(0, 0), (char) Color.blue(0), objArr146);
                String[] strArr26 = {str55, str56, str57, (String) objArr146[0]};
                int i648 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i649 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16;
                int iIndexOf14 = TextUtils.indexOf(str5, str5, 0);
                int i650 = (iIndexOf14 * 51) - 1357594;
                int i651 = -(-(((iIndexOf14 ^ i15) | (iIndexOf14 & i15)) * (-50)));
                int i652 = ((i650 | i651) << 1) - (i650 ^ i651);
                int i653 = ~iIndexOf14;
                int i654 = (i653 & (-27707)) | (i653 ^ (-27707));
                int i655 = ~((i654 & i15) | (i654 ^ i15));
                int i656 = ((-27707) ^ i329) | ((-27707) & i329);
                int i657 = ~((i656 & iIndexOf14) | (i656 ^ iIndexOf14));
                int i658 = ((i655 & i657) | (i655 ^ i657)) * 50;
                int i659 = (i652 & i658) + (i658 | i652);
                int i660 = (~(((-27707) ^ i22) | ((-27707) & i22))) | (~((-27707) | iIndexOf14));
                int i661 = ~((iIndexOf14 & i329) | (i329 ^ iIndexOf14));
                int i662 = ((i661 & i660) | (i660 ^ i661)) * 50;
                Object[] objArr147 = new Object[1];
                a(((i648 | 1023) << 1) - (i648 ^ 1023), i649, (char) ((i659 ^ i662) + ((i662 & i659) << 1)), objArr147);
                String str58 = (String) objArr147[0];
                int i663 = 855 - (~(-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))));
                int i664 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6;
                int i665 = -(-Process.getGidForName(str5));
                Object[] objArr148 = new Object[1];
                a(i663, i664, (char) ((i665 & 1) + (i665 | 1)), objArr148);
                String str59 = (String) objArr148[0];
                int i666 = -View.getDefaultSize(0, 0);
                int i667 = ((i666 | 825) << 1) - (i666 ^ 825);
                int windowTouchSlop6 = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i668 = ((windowTouchSlop6 | 8) << 1) - (windowTouchSlop6 ^ 8);
                int touchSlop5 = ViewConfiguration.getTouchSlop() >> 8;
                Object[] objArr149 = new Object[1];
                a(i667, i668, (char) (((touchSlop5 | 20863) << 1) - (touchSlop5 ^ 20863)), objArr149);
                String[] strArr27 = {str58, str59, (String) objArr149[0]};
                int i669 = 1038 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                int i670 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                Object[] objArr150 = new Object[1];
                a(i669, (i670 & 14) + (i670 | 14), (char) (17055 - (~(-(-(ViewConfiguration.getTouchSlop() >> 8))))), objArr150);
                String str60 = (String) objArr150[0];
                int i671 = -TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                int i672 = (i671 & 1051) + (i671 | 1051);
                int i673 = -ImageFormat.getBitsPerPixel(0);
                int iResolveSize4 = View.resolveSize(0, 0);
                Object[] objArr151 = new Object[1];
                a(i672, i673, (char) ((iResolveSize4 & 7781) + (iResolveSize4 | 7781)), objArr151);
                String[] strArr28 = {str60, (String) objArr151[0]};
                int i674 = -TextUtils.lastIndexOf(str5, '0');
                int i675 = -(-TextUtils.lastIndexOf(str5, '0', 0, 0));
                Object[] objArr152 = new Object[1];
                a((i674 & 1052) + (i674 | 1052), (i675 ^ 10) + ((i675 & 10) << 1), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr152);
                String str61 = (String) objArr152[0];
                int i676 = 1061 - (~View.combineMeasuredStates(0, 0));
                int i677 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                Object[] objArr153 = new Object[1];
                a(i676, (i677 ^ 1) + ((i677 & 1) << 1), (char) View.combineMeasuredStates(0, 0), objArr153);
                String[] strArr29 = {str61, (String) objArr153[0]};
                int i678 = -(Process.myTid() >> 22);
                int i679 = i678 * (-183);
                int i680 = (((-194529) | i679) << 1) - (i679 ^ (-194529));
                int i681 = ~i678;
                int i682 = i681 | i329;
                int i683 = (i680 - (~(-(-(((~((i682 & 1063) | (i682 ^ 1063))) | (~(((-1064) | i22) | i678))) * (-184)))))) - 1;
                int i684 = ~i678;
                int i685 = i683 + (((~(i681 | i22)) | (~((i684 & (-1064)) | (i684 ^ (-1064)))) | (~(((-1064) ^ i329) | ((-1064) & i329)))) * 184) + ((i678 | 1063) * 184);
                int i686 = -(-Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr154 = new Object[1];
                a(i685, ((i686 | 16) << 1) - (i686 ^ 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr154);
                String str62 = (String) objArr154[0];
                int i687 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i688 = (i687 & TypedValues.Custom.TYPE_BOOLEAN) + (i687 | TypedValues.Custom.TYPE_BOOLEAN);
                int maximumFlingVelocity = 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iLastIndexOf9 = TextUtils.lastIndexOf(str5, '0');
                char c10 = (char) (((iLastIndexOf9 | 16651) << 1) - (iLastIndexOf9 ^ 16651));
                Object[] objArr155 = new Object[1];
                a(i688, maximumFlingVelocity, c10, objArr155);
                String str63 = (String) objArr155[0];
                int i689 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 850;
                int offsetBefore = TextUtils.getOffsetBefore(str5, 0);
                Object[] objArr156 = new Object[1];
                a(i689, (offsetBefore & 7) + (offsetBefore | 7), (char) View.MeasureSpec.getSize(0), objArr156);
                String str64 = (String) objArr156[0];
                int i690 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int i691 = (i690 ^ 1078) + ((i690 & 1078) << 1);
                int i692 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int i693 = i692 * (-391);
                int i694 = (i693 & (-1560)) + (i693 | (-1560));
                int i695 = ~(((-9) ^ i692) | ((-9) & i692));
                int i696 = ~((i15 ^ 8) | (i15 & 8));
                int i697 = i694 + (((i695 ^ i696) | (i695 & i696)) * (-196));
                int i698 = -(-(((i692 ^ 8) | (i692 & 8)) * 392));
                int i699 = ~i692;
                int i700 = (i697 ^ i698) + ((i698 & i697) << 1) + (((~((i699 & (-9)) | (i699 ^ (-9)))) | i696) * 196);
                int i701 = -(-TextUtils.indexOf((CharSequence) str5, '0'));
                Object[] objArr157 = new Object[1];
                a(i691, i700, (char) ((i701 ^ 1) + ((i701 & 1) << 1)), objArr157);
                String str65 = (String) objArr157[0];
                int i702 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i703 = ((i702 | 864) << 1) - (i702 ^ 864);
                int i704 = -KeyEvent.normalizeMetaState(0);
                int i705 = (i704 & 11) + (i704 | 11);
                int i706 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr158 = new Object[1];
                a(i703, i705, (char) ((i706 & 3902) + (i706 | 3902)), objArr158);
                String str66 = (String) objArr158[0];
                int iIndexOf15 = TextUtils.indexOf(str5, str5) + 875;
                int i707 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int iB7 = zzee.b();
                int i708 = i707 * 483;
                int i709 = ((i708 | 3388) << 1) - (i708 ^ 3388);
                int i710 = ~i707;
                int i711 = ~(i710 | (-15));
                int i712 = ~((~iB7) | i710);
                int i713 = ((i711 ^ i712) | (i711 & i712)) * (-241);
                int i714 = (i709 & i713) + (i713 | i709);
                int i715 = (i707 | 14) * (-482);
                int i716 = ((i714 | i715) << 1) - (i715 ^ i714);
                int i717 = ~((-15) | i707);
                int i718 = ~iB7;
                int i719 = (i710 & i718) | (i710 ^ i718);
                int i720 = ~((i719 & 14) | (i719 ^ 14));
                Object[] objArr159 = new Object[1];
                a(iIndexOf15, i716 + (((i717 & i720) | (i717 ^ i720)) * 241), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr159);
                String[] strArr30 = {str62, str63, str64, str65, str66, (String) objArr159[0]};
                int i721 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr160 = new Object[1];
                a((i721 & 1087) + (i721 | 1087), 20 - Drawable.resolveOpacity(0, 0), (char) (57861 - (ViewConfiguration.getEdgeSlop() >> 16)), objArr160);
                String str67 = (String) objArr160[0];
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1107;
                int i722 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20;
                int i723 = -TextUtils.getTrimmedLength(str5);
                Object[] objArr161 = new Object[1];
                a(longPressTimeout2, i722, (char) ((58151 & i723) + (i723 | 58151)), objArr161);
                String str68 = (String) objArr161[0];
                int iMyPid5 = (Process.myPid() >> 22) + 1126;
                int packedPositionGroup5 = ExpandableListView.getPackedPositionGroup(0L) + 31;
                int i724 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr162 = new Object[1];
                a(iMyPid5, packedPositionGroup5, (char) (((i724 | 26894) << 1) - (i724 ^ 26894)), objArr162);
                String str69 = (String) objArr162[0];
                Object[] objArr163 = new Object[1];
                a(1157 - Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, (char) (AndroidCharacter.getMirror('0') + 57502), objArr163);
                String str70 = (String) objArr163[0];
                int i725 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr164 = new Object[1];
                a(((i725 | 1182) << 1) - (i725 ^ 1182), 23 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr164);
                String str71 = (String) objArr164[0];
                int i726 = -View.combineMeasuredStates(0, 0);
                Object[] objArr165 = new Object[1];
                a(((i726 | 1206) << 1) - (i726 ^ 1206), 33 - TextUtils.getCapsMode(str5, 0, 0), (char) TextUtils.indexOf(str5, str5), objArr165);
                String[] strArr31 = {str67, str68, str69, str70, str71, (String) objArr165[0], str13};
                int iRed3 = Color.red(0);
                int i727 = ((iRed3 | 1239) << 1) - (iRed3 ^ 1239);
                int i728 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                Object[] objArr166 = new Object[1];
                a(i727, (i728 ^ 12) + ((i728 & 12) << 1), (char) TextUtils.indexOf(str5, str5), objArr166);
                String str72 = (String) objArr166[0];
                int i729 = -Color.argb(0, 0, 0, 0);
                int iB8 = zzee.b();
                int i730 = i729 * (-751);
                int i731 = ((-614318) ^ i730) + ((i730 & (-614318)) << 1);
                int i732 = ~i729;
                int i733 = ~((i732 ^ (-819)) | (i732 & (-819)));
                int i734 = ~((i732 ^ iB8) | (i732 & iB8));
                int i735 = i731 + (((i733 & i734) | (i733 ^ i734)) * 1504);
                int i736 = ~i729;
                int i737 = (i736 & 818) | (i736 ^ 818);
                int i738 = i735 + ((~((iB8 & i737) | (i737 ^ iB8))) * (-1504));
                int i739 = ~(i732 | 818);
                int i740 = ~(i729 | (-819));
                Object[] objArr167 = new Object[1];
                a((i738 - (~(-(-(((i740 & i739) | (i739 ^ i740)) * 752))))) - 1, 6 - TextUtils.lastIndexOf(str5, '0', 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr167);
                String[] strArr32 = {str72, (String) objArr167[0]};
                int iNormalizeMetaState5 = KeyEvent.normalizeMetaState(0);
                int i741 = iNormalizeMetaState5 * 221;
                int i742 = ((-274188) ^ i741) + ((i741 & (-274188)) << 1);
                int i743 = ~iNormalizeMetaState5;
                int i744 = ~((i743 & (-1253)) | (i743 ^ (-1253)));
                int i745 = (i22 ^ iNormalizeMetaState5) | (i22 & iNormalizeMetaState5);
                int i746 = ~((i745 & 1252) | (i745 ^ 1252));
                int i747 = ((i744 & i746) | (i744 ^ i746)) * 220;
                int i748 = (i742 ^ i747) + ((i747 & i742) << 1);
                int i749 = i22;
                int i750 = ~((i749 ^ 1252) | (i749 & 1252));
                int i751 = -(-(((i750 & iNormalizeMetaState5) | (iNormalizeMetaState5 ^ i750)) * (-440)));
                int i752 = (iNormalizeMetaState5 & 1252) | (iNormalizeMetaState5 ^ 1252);
                Object[] objArr168 = new Object[1];
                a((((i748 | i751) << 1) - (i751 ^ i748)) + (((i752 & i15) | (i752 ^ i15)) * 220), 29 - ExpandableListView.getPackedPositionChild(0L), (char) (49292 - (~(-(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))))), objArr168);
                String str73 = (String) objArr168[0];
                int i753 = -(-Drawable.resolveOpacity(0, 0));
                Object[] objArr169 = new Object[1];
                a(((i753 | 1282) << 1) - (i753 ^ 1282), 11 - Color.alpha(0), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr169);
                String[] strArr33 = {str73, (String) objArr169[0]};
                int i754 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1292;
                int i755 = -TextUtils.getCapsMode(str5, 0, 0);
                int iB9 = zzee.b();
                int i756 = ~iB9;
                int i757 = (i755 ^ 19) | (i755 & 19);
                int i758 = (-20) | i755;
                int i759 = ((((i755 * (-830)) + 15808) - (~(((~(((-20) ^ i756) | ((-20) & i756))) | (~((i757 & iB9) | (i757 ^ iB9)))) * (-831)))) - 1) + ((~((i758 & iB9) | (i758 ^ iB9))) * (-1662));
                int i760 = ~i755;
                int i761 = (~((i755 & iB9) | (i755 ^ iB9))) | (~((i756 & i760) | (i760 ^ i756)));
                int i762 = ~(iB9 | 19);
                int i763 = (i759 - (~(-(-(((i761 & i762) | (i761 ^ i762)) * 831))))) - 1;
                int i764 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr170 = new Object[1];
                a(i754, i763, (char) (((51612 | i764) << 1) - (i764 ^ 51612)), objArr170);
                String str74 = (String) objArr170[0];
                int i765 = 1311 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))));
                int i766 = -Process.getGidForName(str5);
                Object[] objArr171 = new Object[1];
                a(i765, ((i766 | 4) << 1) - (i766 ^ 4), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr171);
                String[] strArr34 = {str74, (String) objArr171[0]};
                int i767 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int i768 = (i767 ^ 1316) + ((i767 & 1316) << 1);
                int i769 = -ExpandableListView.getPackedPositionChild(0L);
                int i770 = (i769 & 18) + (i769 | 18);
                int i771 = -TextUtils.indexOf(str5, str5);
                Object[] objArr172 = new Object[1];
                a(i768, i770, (char) (((39725 | i771) << 1) - (i771 ^ 39725)), objArr172);
                String[] strArr35 = {(String) objArr172[0]};
                int i772 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i773 = (i772 & 1335) + (i772 | 1335);
                int i774 = 15 - (~Drawable.resolveOpacity(0, 0));
                int iLastIndexOf10 = TextUtils.lastIndexOf(str5, '0', 0);
                char c11 = (char) (((iLastIndexOf10 | 1) << 1) - (iLastIndexOf10 ^ 1));
                Object[] objArr173 = new Object[1];
                a(i773, i774, c11, objArr173);
                String[] strArr36 = {(String) objArr173[0]};
                int i775 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                int i776 = ((i775 | 1352) << 1) - (i775 ^ 1352);
                int offsetBefore2 = TextUtils.getOffsetBefore(str5, 0);
                int i777 = (offsetBefore2 & 19) + (offsetBefore2 | 19);
                int i778 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
                Object[] objArr174 = new Object[1];
                a(i776, i777, (char) ((i778 ^ 29166) + ((i778 & 29166) << 1)), objArr174);
                String[] strArr37 = {(String) objArr174[0]};
                int i779 = -(-Color.argb(0, 0, 0, 0));
                int i780 = (i779 & 1371) + (i779 | 1371);
                int iMyTid4 = Process.myTid() >> 22;
                Object[] objArr175 = new Object[1];
                a(i780, (iMyTid4 & 19) + (iMyTid4 | 19), (char) (43142 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)))), objArr175);
                String[] strArr38 = {(String) objArr175[0]};
                int iIndexOf16 = TextUtils.indexOf(str5, str5, 0, 0) + 1390;
                int i781 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr176 = new Object[1];
                a(iIndexOf16, (i781 & 23) + (i781 | 23), (char) KeyEvent.keyCodeFromString(str5), objArr176);
                String[] strArr39 = {(String) objArr176[0]};
                int offsetAfter7 = TextUtils.getOffsetAfter(str5, 0);
                Object[] objArr177 = new Object[1];
                a((offsetAfter7 & 1413) + (offsetAfter7 | 1413), MotionEvent.axisFromString(str5) + 22, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr177);
                String[] strArr40 = {(String) objArr177[0]};
                Object[] objArr178 = new Object[1];
                a(1434 - View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 24, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr178);
                String str75 = str13;
                String[] strArr41 = {(String) objArr178[0], str75};
                int iLastIndexOf11 = 1457 - TextUtils.lastIndexOf(str5, '0');
                int i782 = -(ViewConfiguration.getTouchSlop() >> 8);
                int i783 = -(-TextUtils.lastIndexOf(str5, '0', 0, 0));
                Object[] objArr179 = new Object[1];
                a(iLastIndexOf11, (i782 & 28) + (i782 | 28), (char) ((62427 & i783) + (i783 | 62427)), objArr179);
                String[] strArr42 = {(String) objArr179[0], str75};
                int i784 = 1486 - (~(-(-MotionEvent.axisFromString(str5))));
                int i785 = 26 - (~(-((Process.getThreadPriority(0) + 20) >> 6)));
                int i786 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                Object[] objArr180 = new Object[1];
                a(i784, i785, (char) (((58244 | i786) << 1) - (i786 ^ 58244)), objArr180);
                String[] strArr43 = {(String) objArr180[0], str75};
                int i787 = -Color.argb(0, 0, 0, 0);
                int iB10 = zzee.b();
                int i788 = (i787 * 960) - 2900421;
                int i789 = ~iB10;
                int i790 = ~(((-1514) ^ i789) | ((-1514) & i789));
                int i791 = ~((i787 ^ iB10) | (i787 & iB10));
                int i792 = -(-(((i790 & i791) | (i790 ^ i791)) * 959));
                int i793 = (i788 & i792) + (i788 | i792);
                int i794 = ~((iB10 & (-1514)) | ((-1514) ^ iB10));
                int i795 = ~((i787 & i789) | (i789 ^ i787));
                Object[] objArr181 = new Object[1];
                a((1451926 & i793) + (1451926 | i793) + (((i795 & i794) | (i794 ^ i795)) * 959), View.MeasureSpec.getSize(0) + 31, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr181);
                String[] strArr44 = {(String) objArr181[0], str75};
                int i796 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                int i797 = (i796 ^ 1543) + ((i796 & 1543) << 1);
                int i798 = -(ViewConfiguration.getEdgeSlop() >> 16);
                int iB11 = zzee.b();
                int i799 = (i798 * (-183)) + 4995;
                int i800 = ~i798;
                int i801 = ~(i800 | 27);
                int i802 = ~iB11;
                int i803 = ~((i802 & 27) | (i802 ^ 27));
                int i804 = ((i801 & i803) | (i801 ^ i803)) * 184;
                int i805 = ((i799 | i804) << 1) - (i799 ^ i804);
                int i806 = ~((i798 & (-28)) | ((-28) ^ i798));
                int i807 = -(-(((i806 & iB11) | (iB11 ^ i806)) * (-184)));
                int i808 = (i805 ^ i807) + ((i807 & i805) << 1);
                int i809 = ~iB11;
                Object[] objArr182 = new Object[1];
                a(i797, (i808 - (~((~((i809 & i800) | (i800 ^ i809))) * 184))) - 1, (char) (29927 - (~Color.alpha(0))), objArr182);
                String[] strArr45 = {(String) objArr182[0], str75};
                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                int i810 = (pressedStateDuration ^ 1571) + ((pressedStateDuration & 1571) << 1);
                int i811 = 31 - (~(-(-View.MeasureSpec.getSize(0))));
                int capsMode5 = TextUtils.getCapsMode(str5, 0, 0);
                Object[] objArr183 = new Object[1];
                a(i810, i811, (char) (((36157 | capsMode5) << 1) - (capsMode5 ^ 36157)), objArr183);
                String[][] strArr46 = {strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, new String[]{(String) objArr183[0], str75}};
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr184 = new Object[1];
                a(((iMakeMeasureSpec2 | 1603) << 1) - (iMakeMeasureSpec2 ^ 1603), (-16777215) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr184);
                StringBuilder sb = new StringBuilder((String) objArr184[0]);
                int i812 = i15;
                int i813 = 0;
                int i814 = 0;
                for (int i815 = 24; i813 < i815; i815 = 24) {
                    int iB12 = zzee.b();
                    int i816 = ~(((-726213479) & iB12) | ((-726213479) ^ iB12));
                    int i817 = ~iB12;
                    int i818 = ~((i817 & (-1354159114)) | (i817 ^ (-1354159114)) | 996143975);
                    int i819 = (-285942341) + (((i816 & i818) | (i816 ^ i818)) * (-318));
                    int i820 = ~((-1354159114) | iB12);
                    int i821 = ((i820 & 269930497) | (269930497 ^ i820)) * (-318);
                    int i822 = ~(iB12 | 1354159113);
                    int i823 = (((i819 & i821) + (i821 | i819)) - (~(-(-(((i822 & (-996143976)) | ((-996143976) ^ i822)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
                    int iB13 = zzee.b();
                    int i824 = ~iB13;
                    int i825 = ~((i824 & (-1906721552)) | ((-1906721552) ^ i824));
                    int i826 = ((1212405910 + (((i825 & 539247366) | (i825 ^ 539247366)) * (-245))) - (~((~(((-1906721552) & iB13) | ((-1906721552) ^ iB13))) * (-245)))) - 1;
                    int i827 = ~((iB13 & (-1906721552)) | ((-1906721552) ^ iB13));
                    int i828 = -(-(((i827 & 1371709465) | (1371709465 ^ i827)) * 245));
                    if (i823 <= (i826 & i828) + (i828 | i826)) {
                        String[] strArr47 = strArr46[i813];
                        Object[] objArr185 = {strArr47[0]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char c12 = (char) (33603 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 3085;
                            int windowTouchSlop7 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 26;
                            byte b48 = (byte) 5;
                            byte b49 = (byte) (b48 - 5);
                            Object[] objArr186 = new Object[1];
                            c(b48, b49, b49, objArr186);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c12, maxKeyCode2, windowTouchSlop7, 1411172903, false, (String) objArr186[0], new Class[]{String.class});
                        }
                        str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr185);
                        strArr3 = strArr47;
                        strArr46 = strArr46;
                    } else {
                        i329 = i329;
                        i749 = i749;
                        strArr3 = strArr46[i813];
                        Object[] objArr187 = {strArr3[0]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char edgeSlop = (char) (33602 - (ViewConfiguration.getEdgeSlop() >> 16));
                            int packedPositionGroup6 = 3085 - ExpandableListView.getPackedPositionGroup(0L);
                            int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                            byte b50 = (byte) 5;
                            byte b51 = (byte) (b50 - 5);
                            Object[] objArr188 = new Object[1];
                            c(b50, b51, b51, objArr188);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(edgeSlop, packedPositionGroup6, keyRepeatDelay3, 1411172903, false, (String) objArr188[0], new Class[]{String.class});
                        }
                        str6 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr187);
                    }
                    String[] strArr48 = (String[]) Arrays.copyOfRange(strArr3, 1, strArr3.length);
                    if (str6 != null && !str6.isEmpty()) {
                        int i829 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                        b = i829 % 128;
                        if (i829 % 2 == 0) {
                            i25 = 1;
                            if (strArr3.length != 1) {
                                length = strArr48.length;
                                i26 = 0;
                                while (true) {
                                    if (i26 >= length) {
                                        if (str6.contains(strArr48[i26])) {
                                            i27 = 1;
                                        } else {
                                            int i830 = (i26 & (-15)) + (i26 | (-15));
                                            i26 = ((i830 | 16) << 1) - (i830 ^ 16);
                                        }
                                    }
                                }
                            } else {
                                i27 = i25;
                            }
                            i812 = i15 ^ (i813 + 10);
                            i814++;
                            if (i814 > i27) {
                                int i831 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i832 = (i831 ^ 1604) + ((i831 & 1604) << i27);
                                i28 = 0;
                                int iIndexOf17 = TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                                Object[] objArr189 = new Object[i27];
                                a(i832, (iIndexOf17 ^ 3) + ((iIndexOf17 & 3) << i27), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr189);
                                sb.append((String) objArr189[0]);
                            } else {
                                i28 = 0;
                            }
                            sb.append(strArr3[i28]);
                            int minimumFlingVelocity4 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                            double dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(i28);
                            zzee.b();
                            zzee.b();
                            int i833 = -(dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1));
                            int i834 = (1 ^ i833) + ((i833 & 1) << 1);
                            int i835 = -AndroidCharacter.getMirror('0');
                            Object[] objArr190 = new Object[1];
                            a((minimumFlingVelocity4 & 1606) + (minimumFlingVelocity4 | 1606), i834, (char) (((i835 | 42429) << 1) - (i835 ^ 42429)), objArr190);
                            sb.append((String) objArr190[0]);
                            sb.append(str6);
                        } else {
                            i25 = 1;
                            if (strArr3.length != 1) {
                                length = strArr48.length;
                                i26 = 0;
                                while (true) {
                                    if (i26 >= length) {
                                        if (str6.contains(strArr48[i26])) {
                                            i27 = 1;
                                        } else {
                                            int i836 = (i26 & (-15)) + (i26 | (-15));
                                            i26 = ((i836 | 16) << 1) - (i836 ^ 16);
                                        }
                                    }
                                }
                            } else {
                                i27 = i25;
                            }
                            i812 = i15 ^ (i813 + 10);
                            i814++;
                            if (i814 > i27) {
                                int i837 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                int i838 = (i837 ^ 1604) + ((i837 & 1604) << i27);
                                i28 = 0;
                                int iIndexOf18 = TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                                Object[] objArr1810 = new Object[i27];
                                a(i838, (iIndexOf18 ^ 3) + ((iIndexOf18 & 3) << i27), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr1810);
                                sb.append((String) objArr1810[0]);
                            } else {
                                i28 = 0;
                            }
                            sb.append(strArr3[i28]);
                            int minimumFlingVelocity5 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                            double dConvertQuartSecToDecDegrees2 = CdmaCellLocation.convertQuartSecToDecDegrees(i28);
                            zzee.b();
                            zzee.b();
                            int i839 = -(dConvertQuartSecToDecDegrees2 > 0.0d ? 1 : (dConvertQuartSecToDecDegrees2 == 0.0d ? 0 : -1));
                            int i8310 = (1 ^ i839) + ((i839 & 1) << 1);
                            int i8311 = -AndroidCharacter.getMirror('0');
                            Object[] objArr191 = new Object[1];
                            a((minimumFlingVelocity5 & 1606) + (minimumFlingVelocity5 | 1606), i8310, (char) (((i8311 | 42429) << 1) - (i8311 ^ 42429)), objArr191);
                            sb.append((String) objArr191[0]);
                            sb.append(str6);
                        }
                    }
                    int i840 = (i813 ^ 22) + ((i813 & 22) << 1);
                    i813 = (i840 & (-21)) + (i840 | (-21));
                    strArr46 = strArr46;
                    i329 = i329;
                    i749 = i749;
                }
                i23 = i329;
                i24 = i749;
                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                int i841 = (jumpTapTimeout2 & 1607) + (jumpTapTimeout2 | 1607);
                int i842 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                Object[] objArr192 = new Object[1];
                a(i841, (i842 ^ 1) + ((i842 & 1) << 1), (char) ((-2) - ((-TextUtils.lastIndexOf(str5, '0')) ^ (-1))), objArr192);
                char c13 = 0;
                sb.append((String) objArr192[0]);
                if (i814 > 2) {
                    objArr = new Object[2];
                    objArr[0] = new int[1];
                    int i843 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i844 = (i843 ^ 41) + ((i843 & 41) << 1);
                    b = i844 % 128;
                    int i845 = i844 % 2;
                    String[] strArr49 = {sb.toString()};
                    int[] iArr = (int[]) objArr[0];
                    int i846 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i847 = (i846 ^ 47) + ((i846 & 47) << 1);
                    b = i847 % 128;
                    c13 = 0;
                    if (i847 % 2 == 0) {
                        iArr[0] = i812;
                        objArr[0] = strArr49;
                    } else {
                        iArr[0] = i812;
                        objArr[1] = strArr49;
                    }
                } else {
                    objArr = new Object[]{new int[]{i15}, new String[0]};
                }
                int i848 = ((int[]) objArr[c13])[c13];
                int i849 = (~(i15 & i339)) & (i15 | i339);
                int i850 = -i849;
                int i851 = ((i849 & i850) | (i849 ^ i850)) >> 31;
                int i852 = i24 | (-1950892792);
                int i853 = ~((i852 & 360766052) | (i852 ^ 360766052));
                int i854 = -(-(((i853 & 25204736) | (25204736 ^ i853)) * (-828)));
                int i855 = (((339892412 ^ i854) + ((i854 & 339892412) << 1)) - (~(-(-((((-1615331476) & i24) | ((-1615331476) ^ i24)) * (-828)))))) - 1;
                int i856 = ((i855 | 1759632244) << 1) - (i855 ^ 1759632244);
                int iB14 = zzee.b();
                int i857 = ~iB14;
                int i858 = (i857 & (-632704019)) | (i857 ^ (-632704019));
                int i859 = (-1290480290) + ((~((i858 & (-1410189207)) | (i858 ^ (-1410189207)))) * (-116)) + ((((-632704019) ^ iB14) | ((-632704019) & iB14)) * 116);
                int i860 = ~((iB14 & 1410189206) | (1410189206 ^ iB14));
                int i861 = -(-(((i860 & (-1975504791)) | ((-1975504791) ^ i860)) * 116));
                if (i856 <= (i859 & i861) + (i861 | i859)) {
                    int i862 = i848 & (~i851);
                    int i863 = i339 & i851;
                    i339 = (i863 & i862) | (i862 ^ i863);
                    obj = objArr[1];
                } else {
                    int i864 = i848 & (~i851);
                    int i865 = i339 & i851;
                    i339 = (i865 & i864) | (i864 ^ i865);
                    obj = objArr[1];
                }
                strArr2 = (String[]) obj;
                int gidForName2 = 888 - Process.getGidForName(str5);
                int iRed4 = Color.red(0) + 16;
                int i3510 = -MotionEvent.axisFromString(str5);
                Object[] objArr710 = new Object[1];
                a(gidForName2, iRed4, (char) ((i3510 ^ 49243) + ((i3510 & 49243) << 1)), objArr710);
                Object[] objArr711 = {(String) objArr710[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cCombineMeasuredStates2 = (char) (33602 - View.combineMeasuredStates(0, 0));
                    int iMyTid5 = (Process.myTid() >> 22) + 3085;
                    int i3610 = 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    byte b310 = (byte) 5;
                    byte b311 = (byte) (b310 - 5);
                    Object[] objArr712 = new Object[1];
                    c(b310, b311, b311, objArr712);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates2, iMyTid5, i3610, 1411172903, false, (String) objArr712[0], new Class[]{String.class});
                }
                objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr711);
                if (objInvoke == null) {
                    i29 = 0;
                } else {
                    Object[] objArr713 = {objInvoke, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char scrollBarFadeDuration7 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int windowTouchSlop8 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 3393;
                        int absoluteGravity5 = 9 - Gravity.getAbsoluteGravity(0, 0);
                        byte b312 = (byte) 5;
                        byte b313 = (byte) (b312 - 5);
                        Object[] objArr714 = new Object[1];
                        c(b312, b313, b313, objArr714);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration7, windowTouchSlop8, absoluteGravity5, 1203525406, false, (String) objArr714[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr713)).longValue();
                    long j810 = 2000699244;
                    long j811 = -754;
                    long j812 = j810 ^ j;
                    long j813 = j812 | jLongValue110;
                    long j814 = (((long) 755) * j810) + (((long) (-753)) * jLongValue110) + (((j813 ^ j) | ((j812 | j28) ^ j) | ((jLongValue110 | j28) ^ j)) * j811) + (j811 * (((jLongValue110 | (j29 | j810)) ^ j) | ((j813 | j28) ^ j))) + (((long) 754) * (j812 | j29)) + ((long) (-2002769121));
                    int i3611 = ~(1745127336 | i24);
                    int i3612 = ((int) (j814 >> 32)) & (((671384832 | i3611 | (~((-1745127337) | i15))) * (-338)) + 732032938 + ((i3611 | (~((-1073742505) | i15))) * 338));
                    int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
                    int i3613 = ((int) j814) & (1561102589 + (((~(1259138917 | iUptimeMillis3)) | (-1598601969)) * (-668)) + ((1259138917 | (~((-1598601969) | iUptimeMillis3))) * 1336) + ((iUptimeMillis3 | (-339742865)) * 668));
                    i29 = (i3612 ^ i3613) | (i3612 & i3613);
                }
                if (i29 != 1986687685) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                }
                int i5010 = -(AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1));
                int i5011 = ((i5010 | 1951) << 1) - (i5010 ^ 1951);
                int i5012 = -ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr1010 = new Object[1];
                a(i5011, ((i5012 | 13) << 1) - (i5012 ^ 13), (char) (33389 - (~(-TextUtils.indexOf((CharSequence) str5, '0', 0, 0)))), objArr1010);
                String str310 = (String) objArr1010[0];
                int i5110 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 1963;
                int offsetAfter8 = 5 - TextUtils.getOffsetAfter(str5, 0);
                int i5111 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                Object[] objArr1011 = new Object[1];
                a(i5110, offsetAfter8, (char) ((i5111 ^ 61611) + ((i5111 & 61611) << 1)), objArr1011);
                String[] strArr110 = {str310, (String) objArr1011[0]};
                int deadChar3 = KeyEvent.getDeadChar(0, 0);
                Object[] objArr1012 = new Object[1];
                a((deadChar3 ^ 1968) + ((deadChar3 & 1968) << 1), 15 - TextUtils.indexOf(str5, str5, 0), (char) (16054 - (~(-TextUtils.getTrimmedLength(str5)))), objArr1012);
                String str311 = (String) objArr1012[0];
                int i5112 = -(-(TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)));
                int i5113 = (i5112 ^ 1983) + ((i5112 & 1983) << 1);
                int i5114 = -View.getDefaultSize(0, 0);
                int i5115 = ((i5114 | 19) << 1) - (i5114 ^ 19);
                int i5116 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr1013 = new Object[1];
                a(i5113, i5115, (char) ((i5116 & 26650) + (i5116 | 26650)), objArr1013);
                String str410 = (String) objArr1013[0];
                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr1014 = new Object[1];
                a((packedPositionChild2 & 2003) + (packedPositionChild2 | 2003), 13 - (~(-(-(AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1))))), (char) (55138 - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr1014);
                String[] strArr111 = {str311, str410, (String) objArr1014[0]};
                int i5117 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 2016;
                int i5118 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                Object[] objArr1112 = new Object[1];
                a(i5117, ((i5118 | 21) << 1) - (i5118 ^ 21), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 17552), objArr1112);
                String str411 = (String) objArr1112[0];
                int i5119 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr1113 = new Object[1];
                a((i5119 & 2038) + (i5119 | 2038), Drawable.resolveOpacity(0, 0) + 10, (char) (TextUtils.getOffsetAfter(str5, 0) + 63948), objArr1113);
                String[] strArr112 = {str411, (String) objArr1113[0]};
                int i5210 = -TextUtils.lastIndexOf(str5, '0', 0, 0);
                int i5211 = ((i5210 | 2046) << 1) - (i5210 ^ 2046);
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11;
                int i5212 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr1114 = new Object[1];
                a(i5211, keyRepeatTimeout2, (char) ((i5212 ^ 1) + ((i5212 & 1) << 1)), objArr1114);
                String str412 = (String) objArr1114[0];
                int iIndexOf19 = TextUtils.indexOf(str5, str5, 0, 0);
                int i5213 = (iIndexOf19 ^ 587) + ((iIndexOf19 & 587) << 1);
                int i5214 = -TextUtils.getCapsMode(str5, 0, 0);
                Object[] objArr1115 = new Object[1];
                a(i5213, ((i5214 | 6) << 1) - (i5214 ^ 6), (char) (KeyEvent.normalizeMetaState(0) + 53887), objArr1115);
                String[] strArr210 = {str412, (String) objArr1115[0]};
                int doubleTapTimeout4 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                Object[] objArr1116 = new Object[1];
                a((doubleTapTimeout4 ^ 2058) + ((doubleTapTimeout4 & 2058) << 1), (ViewConfiguration.getLongPressTimeout() >> 16) + 28, (char) View.MeasureSpec.getSize(0), objArr1116);
                String str413 = (String) objArr1116[0];
                int i5215 = -ImageFormat.getBitsPerPixel(0);
                int i5216 = (i5215 ^ 2036) + ((i5215 & 2036) << 1);
                int i5217 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                int touchSlop6 = ViewConfiguration.getTouchSlop() >> 8;
                int i5218 = (touchSlop6 * 615) - 39200124;
                int i5219 = ~touchSlop6;
                int i5310 = ~((i5219 ^ 63948) | (i5219 & 63948));
                int i5311 = (i15 ^ i5310) | (i5310 & i15);
                int i5312 = ~(((-63949) ^ touchSlop6) | ((-63949) & touchSlop6));
                int i5313 = ((i5311 ^ i5312) | (i5311 & i5312)) * 614;
                int i5314 = (i5218 ^ i5313) + ((i5313 & i5218) << 1);
                int i5315 = ~(i5219 | i23);
                int i5316 = ~touchSlop6;
                String[] strArr211 = strArr2;
                int i5317 = ~(i5316 | 63948);
                int i5318 = (i5315 ^ i5317) | (i5315 & i5317);
                int i5319 = ~(i24 | 63948);
                int i5410 = ((i5318 & i5319) | (i5318 ^ i5319)) * (-1228);
                int i5411 = ((i5314 | i5410) << 1) - (i5410 ^ i5314);
                int i5412 = (-63949) | i5316;
                int i5413 = ~((i5412 & i24) | (i5412 ^ i24));
                int i5414 = i24 | touchSlop6;
                int i5415 = ~((i5414 & 63948) | (i5414 ^ 63948));
                char c14 = (char) (i5411 + (((i5413 & i5415) | (i5413 ^ i5415)) * 614));
                i30 = 1;
                Object[] objArr1117 = new Object[1];
                a(i5216, i5217, c14, objArr1117);
                c = 0;
                strArr4 = new String[][]{strArr110, strArr111, strArr112, strArr210, new String[]{str413, (String) objArr1117[0]}};
                i31 = 0;
                i32 = 5;
                i33 = -1;
                loop7: while (true) {
                    if (i31 < i32) {
                        str7 = str5;
                        i34 = i15;
                        break;
                    }
                    String[] strArr212 = strArr4[i31];
                    str10 = strArr212[c];
                    strArr5 = (String[]) Arrays.copyOfRange(strArr212, i30, strArr212.length);
                    length3 = strArr5.length;
                    i44 = 0;
                    while (i44 < length3) {
                        int i5416 = (i33 ^ (-2)) + ((i33 & (-2)) << i30);
                        i33 = ((i5416 | 3) << i30) - (i5416 ^ 3);
                        Object[] objArr1118 = {str10, strArr5[i44]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) str5, '0', 0));
                            int iIndexOf20 = TextUtils.indexOf(str5, str5) + 2385;
                            int i5417 = 33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b410 = (byte) 5;
                            byte b411 = (byte) (b410 - 5);
                            Object[] objArr1119 = new Object[1];
                            c(b410, b411, b411, objArr1119);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf4, iIndexOf20, i5417, -1207062455, false, (String) objArr1119[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1118)).longValue();
                        long j1012 = 1532879348;
                        i45 = length3;
                        str11 = str10;
                        long j1013 = 672;
                        i46 = i31;
                        long jMyTid3 = Process.myTid();
                        i47 = i44;
                        str7 = str5;
                        long j1014 = jMyTid3 ^ j;
                        long j1015 = (((long) 673) * j1012) + (((long) (-1343)) * jLongValue111) + ((jLongValue111 | ((j1012 | jMyTid3) ^ j)) * j1013) + (((long) (-672)) * ((((j1012 ^ j) | j1014) ^ j) | ((jMyTid3 | jLongValue111) ^ j)));
                        long j1016 = jLongValue111 ^ j;
                        long j1017 = j1015 + (j1013 * (((j1016 | j1012) ^ j) | ((j1016 | j1014) ^ j))) + ((long) 444163980);
                        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                        int i5418 = ~iFreeMemory2;
                        i48 = ((int) (j1017 >> 32)) & ((((~(133975142 | i5418)) | (~(1571201553 | iFreeMemory2))) * 959) + 319139057 + (((~(iFreeMemory2 | 133975142)) | (~(i5418 | 1571201553))) * 959));
                        i49 = ((int) j1017) & (1019428157 + (((~(i24 | (-268451969))) | (~(i24 | 2142763774))) * (-184)) + (((~((-486994667) | i24)) | 218542698 | (~(1924221076 | i24))) * 184) + 281161960);
                        if (((i48 & i49) | (i48 ^ i49)) != 0) {
                            int i5419 = (i33 & 170) + (i33 | 170);
                            i34 = (i5419 & i24) | ((~i5419) & i15);
                            break loop7;
                        }
                        i44 = (i47 & 1) + (i47 | 1);
                        strArr4 = strArr4;
                        strArr5 = strArr5;
                        str10 = str11;
                        i31 = i46;
                        length3 = i45;
                        str5 = str7;
                        i30 = 1;
                    }
                    i31++;
                    i32 = 5;
                    c = 0;
                    i30 = 1;
                }
                int i5514 = ((~i339) & i15) | (i339 & i24);
                int i5515 = -i5514;
                int i5516 = ((i5514 & i5515) | (i5514 ^ i5515)) >> 31;
                int i5517 = i34 & (~i5516);
                int i5518 = i339 & i5516;
                int i5519 = (i5517 ^ i5518) | (i5518 & i5517);
                int i56111 = ((~i5519) & i15) | (i5519 & i24);
                int i571110 = -i56111;
                int i571111 = ((i56111 & i571110) | (i56111 ^ i571110)) >> 31;
                int i571112 = i35 & (~i571111);
                int i571113 = i5519 & i571111;
                int i571114 = (i571112 & i571113) | (i571112 ^ i571113);
                str8 = str7;
                int iIndexOf110 = TextUtils.indexOf((CharSequence) str8, '0') + 2108;
                int i571115 = -Color.red(0);
                int i571116 = i571115 * (-500);
                int i571117 = (i571116 & (-23500)) + (i571116 | (-23500));
                int i571118 = ~(((-48) & i571115) | ((-48) ^ i571115));
                int i571119 = ~i571115;
                int i581110 = ((i571117 + ((i571118 | (~(((i571119 ^ 47) | (i571119 & 47)) | i15))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) - (~((~((i571119 ^ (-48)) | (i571119 & (-48)))) * 1002))) - 1;
                int i581111 = (i571119 & i23) | (i571119 ^ i23);
                int i581112 = (~((i581111 & 47) | (i581111 ^ 47))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                Object[] objArr1210 = new Object[1];
                a(iIndexOf110, ((i581110 | i581112) << 1) - (i581112 ^ i581110), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr1210);
                Object[] objArr1211 = {(String) objArr1210[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSizeAndState4 = (char) View.resolveSizeAndState(0, 0, 0);
                    int iResolveSizeAndState7 = 993 - View.resolveSizeAndState(0, 0, 0);
                    int iLastIndexOf12 = 7 - TextUtils.lastIndexOf(str8, '0');
                    byte b412 = (byte) 0;
                    byte b413 = b412;
                    Object[] objArr1212 = new Object[1];
                    c(b412, b413, b413, objArr1212);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState4, iResolveSizeAndState7, iLastIndexOf12, -545305915, false, (String) objArr1212[0], new Class[]{String.class});
                }
                long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1211)).longValue();
                long j1018 = -1195104307;
                long j1112 = -495;
                long j1113 = j1018 ^ j;
                long j1114 = ((j1113 | j28) ^ j) | (((jLongValue112 ^ j) | j1113) ^ j);
                long j1115 = (j1112 * j1018) + (j1112 * jLongValue112) + (((long) 992) * j1114) + (((long) (-496)) * ((((j29 | j1018) | jLongValue112) ^ j) | j1114)) + (((long) 496) * (jLongValue112 | j28)) + ((long) 1815563591);
                int startElapsedRealtime6 = (int) Process.getStartElapsedRealtime();
                int i581113 = ((int) (j1115 >> 32)) & (1520786966 + (((~((~startElapsedRealtime6) | (-1754298183))) | 1082143494) * 529) + (((~(startElapsedRealtime6 | (-1754298183))) | 1103442702) * 529));
                int iNextInt6 = new Random().nextInt(2103255027);
                int i581114 = ~iNextInt6;
                int i581115 = ((int) j1115) & ((-1687905466) + (((~((-1265715872) | i581114)) | 1592025014) * (-90)) + (((~((-1265715872) | iNextInt6)) | (-1609916352)) * (-45)) + (((~(iNextInt6 | (-1592025015))) | (-1265715872) | (~(i581114 | 1592025014))) * 45));
                int i581116 = ((i581113 & i581115) | (i581113 ^ i581115)) * 263;
                int i581117 = (i581116 & i24) | ((~i581116) & i15);
                int i581118 = ((~i571114) & i15) | (i571114 & i24);
                int i581119 = -i581118;
                int i5910 = ((i581118 & i581119) | (i581118 ^ i581119)) >> 31;
                int i5911 = i581117 & (~i5910);
                int i5912 = i571114 & i5910;
                i326 = (i5912 & i5911) | (i5911 ^ i5912);
                strArr = strArr211;
                i19 = 5;
            } else {
                i19 = 5;
                strArr = null;
            }
            Object[] objArr193 = new Object[i19];
            objArr193[0] = new int[1];
            objArr193[1] = new int[]{i326};
            objArr193[3] = new int[]{i15};
            int i866 = (~(i15 & i326)) & (i15 | i326);
            int i867 = -i866;
            objArr193[4] = strArr;
            objArr193[2] = null;
            int i868 = (int) Runtime.getRuntime().totalMemory();
            int i869 = ~i868;
            int i870 = (i3 - (~(-(-((((3284954 + (((~((-771728303) | i869)) | 1002351341) * (-90))) + (((~((-771728303) | i868)) | (-1073720304)) * (-45))) + ((((~(i868 | (-1002351342))) | (-771728303)) | (~(i869 | 1002351341))) * 45)) + ((((i866 & i867) | (i866 ^ i867)) >> 31) & 16)))))) - 1;
            int i871 = i870 ^ (i870 << 13);
            int i872 = i871 ^ (i871 >>> 17);
            int i873 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i874 = ((i873 | 109) << 1) - (i873 ^ 109);
            b = i874 % 128;
            if (i874 % 2 == 0) {
                int i875 = ((i872 | 3) << 1) - (i872 ^ 3);
                ((int[]) objArr193[0])[1] = ((~i872) & i875) | ((~i875) & i872);
                return objArr193;
            }
            int i876 = i872 << 5;
            ((int[]) objArr193[0])[0] = (i872 | i876) & (~(i872 & i876));
            return objArr193;
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("p!ÕË;)\u0080\u009bæ¥LL\u0091§÷\u0005]b¢Á\b-m\u0096³ê\u0019|~¡Ä\u0005*z\u008fÍÕ9:\u008e\u0080éædK«\u0091\t÷w\\Ô¢1Ãîf\u0004\u0088æ3TUjÿ\u0083\"hDÊî\u00ad\u0011\u000e»âÞY\u0000%ª³Í\u007fwÇ\u0099¡<\u0015fÌ\u0089V3%U\u0086øt\"ÂD½EÐà:\u000eØµjÓTy½¤VÂôh\u0093\u00970=ÜXg\u0086\u001b,\u008dKBñé\u001f\u0081º-±³\u0014Nú§A\f'7\u008dÔP56\u009f\u009cácYÉ³¬XrwØÞ¿>\u0005\u0097ëêND\u0014½û\u0007AW'Ë\u008a+P\u009f6ð\u009d@c´Æ\u001eh¡ÍJ#¸\u0098\u000eþ%TÏ\u0089/ïÇEöºU\u0010«u\u0015\u0015l°\u0087^uåÃ\u0083è)\u0015ôì\u0092I8eÇ\u009am{\bÇÖ¿±³\u0014NúºA\u001c'y\u008dËP>6Ô\u009cÆcsÉ\u009b¬\u0018rfØÔ¿\u0016\u0005\u0092ëøNL±³\u0014Yú¿A\u000b'y\u008d\u0096Pt6\u0098\u009cäc@É¿¬\u0019rvØÞ±î\u0014RúðA\u001d'w\u008dÖP.6Õ\u009cæcPÉ²¬\u0005r\u007fØØ¿6\u0005¬ëâNH\u0014ºû0Al'Ç\u008a9PÚg\u009bÂ',\u0085\u0097hñ\u0002[£\u0086[à J\u0093µ%\u001fÇzp¤\n\u000e\u00adiCÓÙ=\u0097\u0098=ÂÏ-E\u0097\u0019ñ²\\L\u0086¬±³\u0014Nú§A\f'l\u008dÜP76Ô\u009cøc\\É´¬Xr|ØØ¿0\u0005\u009dëîN\u0003\u0014½û\u0000±þ\u0014Tú¹A\u0011'w\u008dÁ{RÞ¯0F\u008bíí\u008dG=\u009aÖü5V\u0017©½\u0003Yf¹¸\u009f\u00125uÞÏg!;\u0084\u0081Þ\u00021à\u008b\u008cí%@Þ\u009a'ü\u0006W«©I\fòf\u0093¸/\u0013Ïø¿]B³«\b\u0000n`ÄÐ\u0019;\u007fØÕú*P\u0080´åT;r\u0091Øö3L\u008a¢Ö\u0007l]ï²\u0013\bvnÊÃ6±³\u0014Nú§A\f'l\u008dÜP76Ô\u009cøc\\É´¬Xr|ØØ¿0\u0005\u009dëéN@\u0014»û9AE'Ù\u008a8P\u00846ô\u009d\u000bcµÆ\b\u0093G6\u00adØOcý\u0005Ã¯#rË\u0014b¾\u0015A¦ëW\u008eæP\u0097ú1r\r×±9\u0013\u0082þä\u008eN3\u0093Õõ|_Y ¾\nZoç±\u0087±ò\u0014Xú¿A\f'}\u008d\u0097P46\u009e\u009cà$ù\u0081\u0007oæÔZ²1\u0018ÜÅv£Ø\t²ö\u001a\\ï9Dç)M\u008f*}\u0090Ô~µ±ò\u0014Xú³A\n'k\u008dß%\u0094\u0080(n\u008aÕu³\u0010\u0019¬ÄD¢ô\b\u008d÷;]\u00828`æ\u000bL¥+]\u0091ï\u007f\u0097Ú4\u0080Ào`Õ\u0000³¶\u001eB±û\u0014Xú°A\u0006±ì\u0014Xú¬A\f'q\u008dÊP.6Õ\u009cçcLÉ¥¬YrrØÕ¿|\u0005\u0097ëéNO\u0014»û\bA&'Î\u008a:P\u009e6ª\u009dCc§Æ\f¬erþÙ%¿\u0093\u0005Éè\u0002N\u008c\u0014úûVA½$\u001f\u008aiPÑ7'\u0086i#ÝÍ)v\u0089\u0010ôºOg«\u0001P«bTÉþ \u009bÜE÷ïP\u0088ù2\u0012ÜlyÊ#>Ì\u008dv£\u0010K½¿g\u001b\u0001/ªÆT\"ñ\u0089\u009bàE{î \u0088\u00162Lß\u0087y\r#\u007fÌÓv8\u0013\u0090½ì\u009bk>ßÐ+k\u008b\rö§Mz©\u001cR¶`IËã\"\u0086ÞXõòR\u0095û/\u0010ÁndÈ><Ñ\u008fk¡\r\\ ¢zB\u001c`·ÓI(¨\u009c\r(ãÜX|>\u0001\u0094ºI^/¥\u0085\u0097z<ÐÕµ)k\u0002Á¥¦\f\u001cçò\u0099W?\rËâxXV>«\u0093UIµ/\u0098\u00844zÕ±ì\u0014Xú¬A\f'q\u008dÊP.6Õ\u009cçcLÉ¥¬YrrØÕ¿|\u0005\u0097ëéNO\u0014»û\bA&'Û\u008a%PÅ6é\u009dFc¥±ì\u0014Xú¬A\f'q\u008dÊP.6Õ\u009cçcLÉ¥¬YrrØÕ¿|\u0005\u0097ëéNO\u0014»û\bA&'Û\u008a%PÅ6é\u009dKc¥c\u0095Æ (Î\u0093xõ\u0014_ .~\u008b\u0080eaÞÝ¸¶\u0012[Ïú©Y\u0003=ü\u008dVw3ßí®\u0017+²\u009e\\pçÆ\u0081¾+\röþ\u0090I:!±³\u0014Nú§A\f'l\u008dÜP76Ô\u009còcGÉ·¬\u001aruØÆ¿=\u0005\u0081ëçN\u0002\u0014¹û\u0006Af'Í\u008a%P\u009c6÷\u009d\bcµÆ\u001e¬srÕÙ'¿\u008e\u0005ãè.N\u009b\u0014íûNA¼$\b\u008a5PÞ74\u009d\u0084±³\u0014Kú»A\u0011'|\u008dÖP(6Ô\u009cøc\\É´¬Ar$Ø\u009e¿:\u0005\u0084ë£NL\u0014»û\u000bAa'Æ\u008adP\u009b6ö\u009dLc«Æ\u0006¬rrØÙl¿\u0094\u0005Õè3N\u009a\u0014ðûOAª$T\u008ahPÛ\u001e6»ÎU>î\u0094\u0088ù\"Sÿ\u00ad\u0099Q3}ÌÙf1\u0003ÄÝ¡w\u001b\u0010¿ª\u0001D&áÀ»<T\u0089îâ\u0088A%¿ÿ\u0001\u0099r2ÅÌ1iÌ\u0003òÝMv©\u0010\u0002ªVG¯á\b»4TÎî31,\u0094Ñz8Á\u0093§ó\rCÐ¨¶K\u001cgãÃI+,Þò»X\u0001?®\u0085\u0000k|ÎÇ\u00945{¯Áö§_\n±Ð\u0018¶D\u001dÓã7F\u008c,úòLY»?\u001d\u0085@h§ÎL\u0094c{×Á6¤Ë\n÷ÐD\u0019¿¼TR¦é\u0010\u008f;%Üø8\u009e\u009e4ìË\u0016a³\u0004\u0015ÚupÉ\u0017p\u00ad\u009cCìæN¼·S\u0007éw\u008fÀ\"4ø\u0091\u009eá5JË¯nE\u0004~ÚÎ±Û\u0014Xú°A\u0006'u\u008dÖP.6\u0092\u009cûc[±é\u0014SúµA\u0011'w\u008dÎP4à\u0080E*«Ó\u0010ov\nÜ¯\u0001Pgé%I\u0080õnWÕ¨³Í\u0019qÄ\u0099¢)\bP÷æ]_8´æÒL`+\u009c\u00917\u007fN±ê\u0014_ú±A\u0007' \u008d\u008fP*±û\u0014Xú°A\u001a'j\u008dÐP9¾Æ\u001beõ\u008dN'(W\u0082í_\u00049\u0099\u0093Ñl0ÆÝ±û\u0014Xú°A\u001a'j\u008dÐP96¤\u009cìc\rÉà¬(r&Ø\u0085q²Ô\u000e:¬\u0081Sç6M\u008a\u0090böÒ\\«£\u001d\t¤lF²#\u0018\u0089\u007fkÅÃðåUS»¿Ù\u0096|?\u0092Ä)|O\u0016å¢8Z^æ±Ý\u0014Mú®A_'J\u008dÌP46\u008f\u009cýcXÉ³¬WrvØÞ¿ \u0005ÓëÏNE\u0014¼û\u0000Ae'Ì±Ý\u0014SúºA\r'w\u008dÐP>6Û\u009cÇcqÉ\u009d¬WrrØÄ¿;\u0005\u009fëøN\r\u0014¨û\u0000Az'\u0089\u008a2PÓ6²±Ý\u0014SúºA\r'w\u008dÐP>6Û\u009cÇcqÉ\u009d¬WrrØÄ¿;\u0005\u009fëøN\r\u0014¨û\u0000Az'\u0089\u008a2PÓ6²\u009dzcðÆS0\u008f\u00953{\u0091Àv¦\u0018\fªÑ_·í\u001d\u0094â&HÒ±û\u0014Rú²A\u001b'~\u008dÐP)6\u0093±ê\u0014_ú±A\u0007' \u008d\u008f±î\u0014\\ú°A\u001c'p\u008dÌÝÔxh\u0096Ê-5KPáì<\u0004Z´ðÍ\u000f{¥ÂÀ/\u001eX´êÓ\u0006i\u00adóNVò¸P\u0003´eÝÏk\u0012\u0094t>ÞX!»\u008b\u0007î²0Ý\u009ad¯È±î\u0014RúðA\f'}\u008dÚP/6\u0089\u009cñ±¬±î\u0014RúðA\u001d'm\u008dÐP66\u009f\u009cºcEÉ¤¬\u0018rtØÄ¿1\u0005\u0087±ú\u0014Hú²A\u0013'G\u008dÁPb6ÍSëöW\u0018õ£\u0018ÅhoÕ²3Ô\u009a~¿\u0081V+ºN\u001c\u0090r:Ñ]%ç\u0086\tû¬Aö¥\u0019\u001eRÜ÷\u007f\u0019\u0097¢=ÄMn÷³\u001eÕó\u007fÀ\u0080v*\u009aO\u007f\u0091P;ó\\\u001bæ±\bÙ\u00adc÷\u008aØõ}V\u0093¾(\u0014NdäÞ97_ªõâ\n\u0003 îÅV\u001bm±ÛÖ7l¢\u0082ú'\u001b}ö\u0092N(aNÂã*9\u0080_øôB\n«¯6Åv\u001b\u0097°zQ5ô\u0096\u001a~¡ÔÇ¤m\u001e°÷Ö\u001a|=\u0083\u0094)wLÞ\u0092²8\u001a_ÃåN\u000b&®\u0088ô/\u001bÆ¡£Ç\tjá°WÖ#}\u0088±û\u0014Xú°A\u001a'j\u008dÐP96Ô\u009câcWÉ¹¬\u000fr(Ø\u0087¿\"\u0005ÜëúNO\u0014¡û\u0017A0'\u009f\u008a:±û\u0014Rú±A\u0018't\u008dÜPu6\u0088\u009cðc^É\u0089¬\u0010r`ØÙ¿=\u0005\u009dëéNr\u0014¶ûWA>'\u0086\u008a-P\u008e6ê\u009d@c´Æ\u000e¬crþÙ:¿Û\u0005\u008a±î\u0014RúðA\u001d'w\u008dÖP.6\u0097\u009cûcTÉ²¬\u0012rbq`ÔÜ:~\u0081\u0093çùMX\u0090 ö\u001c\\w£Ú\t?l\u009c²°\u0018]\u007f©Å\u0014+n\u008eÇÔn;\u0087\u0081ïçIJ£\u0090\u0000öx]Û£:\u0006\u0080là²[±Ý\u0014SúºA\r'w\u008dÐP>6Ö\u009cìc\rÉàxsÝÏ3m\u0088\u0080îðDM\u0099«ÿ\u0002U'ªÌ\u0000\"e\u0099»ý\u0011@v®Ì\u0017\"?\u0087ÙÝ7±è\u0014Xú\u00adA\u000b'5*Ø\u008f~a\u009aÚ&¼\u001b\u0016çË\u0001\u00adµ\u0007\u0097øiR\u009e77éHC±$\u000f\u009e¬pÎÕp\u008f\u0090±í\u0014Xú³A\n'6\u008dÑP-6Õ\u009cùcTÉ¿¬\u0019r{ØÔ¿+\u0005\u0080À\u0003e¶\u008b]0äVØü$!ÒG;í\u001c\u0012º¸SÝü\u0003¡©<ÎÝtp\u009a\u0007?±eA\u0019j¼ßR4é\u008d\u008f±%Mø»\u009eR4\u007fËÑa5\u0004¯ÚópS\u0017»\u00ad\u0007CbæÞ¼0±î\u0014RúðA\u0014'}\u008dËP46\u009e\u009cøc\u001bÉ·¬\u0019rtØÃ¿=\u0005\u009aëèN\u0003\u0014¿û\nAe'Ü\u008a.±î\u0014RúðA\u001d'w\u008dÖP.6Õ\u009cåcPÉ»¬\u0002r>ØÐ¿$\u0005\u0097ëÓNC\u0014¯û\u0002Am±î\u0014RúðA\u0010'|\u008dÔPt6\u0099\u009các\\Éº¬\u0013r>Ø×¿;\u0005\u009dëëNH\u0014¼û\u001fAz'À\u008a$P\u009fB4ç\u0088\t*²ÕÔ°~\f£äÅTo-\u0090\u009b:\"_Ï\u0081¿+\u0002LäöM\u0018x½\u0091ç}\bÛ²µÔ\u0016yâ£AÅ,n\u0096\u0090r5ÉRk÷×\u0019u¢\u0089ÄänO³«Õ\u001b\u007f|\u0080\u009e*1O\u0087\u0091ü;X\\³æX\bo\u00adÁ÷%\u0018\u008d¢èÄ^i¿³\u001cÕh~Î\u00807±î\u0014RúðA\f'a\u008dÊP.6\u009e\u009cùcjÉ³¬\u000frdØ\u009f¿0\u0005\u0086ëåNA\u0014ªûAAn'À\u008a$P\u008c6á\u009dWc¶Æ\u0015¬irÏÙ6Å\u0006`º\u008e\u00185áS\u0095ù?$ÖB|è\u000e\u0017ó½\\Øê\u0006\u0091¬5ËÞq5\u009f\u0002:¬`H\u008fà5\u0085S3þÒ$qB\u0005é£\u0017Z<Ó\u0099owÍÌ4ª@\u0000êÝ\u0003»©\u0011ÛîWD\u008f!&ÿFUá2A\u0088¬fÄÃy\u0099\u009fv6Ì\u001bªò\u0007\u001eÝ¸»Þ\u0010}î\u0089K*!OÿõT\u00112ª±´±°\u0014\u001d\u0014+±µ±³\u0014Yú»A\t'7\u008dÈP?6\u0096\u009cácjÉ¦¬\u001er`ØÔ\u008f\u0089*cÄ\u0081\u007f3\u0019\r³ðn\u000f\b¢¢Å]j÷\u0098\u0092bLHæê\u0081\u001b;¬ÕÔpv*\u009aÅ1\u007fm\u0019ô´\u0015n¿\bÇ£{Jcï\u0089\u0001kºÙÜçv\u001a«åÍHg/\u0098\u00802rW\u0088\u0089§#\u0004DìþZ\u00108±³\u0014Yú»A\t'7\u008dÊP56\u0098\u009cÿcPÉ¢¬XraØÔ¿?\u0005\u0086ëèj\u0094Ïi!\u0080\u009a+ü\u0010Vï\u008b\u0018í±GÆ¸M\u0012\u0085w\"©V\u0003õd\u0010Ú«\u007fV\u0091¿*\u0014LtæÄ;/]Ì÷à\bD¢¬Ç@\u0019d³ÀÔ(n\u0088\u0080Ë%X\u007f·\u0090\u001b*|LÞá1;¬]øöX\b¼\u00ad\nÇ\u007f\u0019æ²+Ô\u009enÉ\u00830%È\u007fô\u0090Op\u00adÕG;¥\u0080\u0017æ)LÅ\u00917÷\u0091]Õ¢L\b¸m\u001a|ÌÙ&7Ä\u008cvêH@¤\u009dVûðQ´®>\u0004Àae¿\nI\u0002ìè\u0002\n¹¸ß\u0086u{¨\u0084Î)dN\u009bá1\u0013Té\u008aÃ sG\u0097ý$\u0013R¶ðì\u001b\u0003»¹Ëß|Â³gN\u0089§2\fTlþÜ#7EÔïø\u0010\\º´ßX\u0001|«ØÌ0v\u0091\u0098ÿ=Yg¨\u0088\u00002dTÍù/#\u0099EÛîO\u0010¨µ\u000eß.\u0001Òª-±³\u0014Yú»A\t'7\u008dÛP)6\u008f\u009cõcVÉµ¬\u0012\u0086\u008f#eÍ\u0087v5\u0010\u000bºçg\u0015\u0001³«ÏTpþ\u0098\u009b$±³\u0014Yú»A\t'7\u008dÛP)6\u008f\u009cùcPÉ±¬\u0019±³\u0014Yú»A\t'7\u008dÛP)6\u008f\u009cûcGÉ¿¬\u0012}iØ\u00836a\u008dÓëíA\u0001\u009cóúUP8¯\u0082\u0005\u007f`Ê*_\u008fµaWÚå¼Û\u00167ËÅ\u00adc\u0007\bø¾R[7òé\u008cC>\u000e4«ÞE<þ\u008e\u0098°2\\ï®\u0089\b#LÜÛv<\u0013\u0095\u0014Ô±>_Øäl\u0082\u001e(ñõY\u0093ó9\u0084Æ<lÝ\t\u007f×\u0016}²\u001aF »NÅë2±Ë^'ä\r\u0082½/Yõç\u009693ÚÝ:f\u0081\u0000½ªDw¹\u0011\u001f»zDÐî+\u008b\u008eUµÿy\u0098«\"\rÌUiÏ3%Ü\u0097fç\u0000G\u00ad\u0086w\u000e\u0011bºËD)á\u009f3Ü\u0096\"xÃÃ\u007f¥\u0014\u000fùÒ\\´û\u001e\u008bá5KË.lð\fA\u0007äð\n\u0013±ô×\u0089\u008f\u0004*úÄ\u001b\u007f§\u0019Ì³!n\u009e\b)¢O]ä÷N\u0092\u00adLÆæv\u0081\u0096Ùá|U\u0092¥)\tOnåÌ8#^Ïôé\u000b@¡ Ä\t\u001al°Â×;m\u0081\u0083¸&D|»f\u0094Ã0-Ø\u0096\\ð0Z\u0098\u0087máÀK\u0092´\"\u001eÆ{=¥\u0007\u000fºõ#PÈ¾:\u0005\u008cc§ÉD\u0014¯r\u000fØm'Ä\u008d\u0019è\u00846ï\u009cEû§A\u0000¯o\n\u0093P&¿\u0092\u0005ôH2í\u009d\u0003g¸ÖÞ§t\u0001©÷ÏTe3\u009a\u008a±³\u0014XúªA\u001c'7\u008dÔP56\u008e\u009cúcAÉ¥±³\u0014Yú¿A\u000b'y\u008d\u0096P>6\u0094\u009cãc[Éº¬\u0018rqØÕ¿!\u0005Üë¢NI\u0014¾û@Ai'Ù\u008a:P\u00986ª\u009d]c«Æ\u000b±³\u0014Mú¬A\u0010'{\u008d\u0096P96\u008b\u009các\\É¸¬\u0011r\u007f9ô\u009c}r\u009dÉ4¯Q\u0005ÿØ\u0006¾¼±³\u0014Yú¿A\u000b'y\u008d\u0096P76\u0092\u009cçcVÉù¬\u0007rbØÞ¿4\u0005\u009aëàNH\u0014½û@Ak'Ü\u008a8PÄ6´\u009d\nc¥Æ\b¬mr\u008fÙ/¿\u008a\u0005ßè/N\u0091\u0014éûQA«$\u000e\u008a5PÙ70\u009d\u009bcâÆY¬¼s\u0017".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
            TuitionPaymentFragmentbindingInflater1 = 6773693708907779133L;
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
        private static java.lang.String $$e(int r5, short r6, int r7) {
            /*
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r5 = r5 * 3
                int r5 = 115 - r5
                int r6 = r6 * 2
                int r0 = 1 - r6
                byte[] r1 = android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L18
                r3 = r6
                r4 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L26:
                r3 = r1[r7]
            L28:
                int r7 = r7 + 1
                int r5 = r5 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21.$$e(int, short, int):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class Callback implements IBinder.DeathRecipient {
        final Object mCallbackObj = MediaControllerCompatApi21.createCallback(new StubApi21(this));
        MessageHandler mHandler;
        IMediaControllerCallback mIControllerCallback;
        private static final byte[] $$c = {48, -110, 22, 55};
        private static final int $$d = 78;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {108, -26, -110, 50, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 236;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f256a = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 22335;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 41194;
        private static char b = 54438;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 64586;

        private static void d(byte b2, short s, short s2, Object[] objArr) {
            int i = (s * 2) + 4;
            int i2 = (b2 * 14) + 84;
            int i3 = s2 * 52;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                int i5 = i3 + i;
                i++;
                i2 = i5 - 11;
                i4 = -1;
            }
            while (true) {
                int i6 = i4 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i++;
                i2 = (i2 + bArr[i]) - 11;
                i4 = i6;
            }
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    int i4 = 58224;
                    int i5 = 0;
                    while (i5 < 16) {
                        int i6 = $11 + 59;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[i3];
                        int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                        int i9 = c2 >>> 5;
                        try {
                            Object[] objArr2 = new Object[4];
                            objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            objArr2[2] = Integer.valueOf(i9);
                            objArr2[1] = Integer.valueOf(i8);
                            objArr2[i3] = Integer.valueOf(c);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char windowTouchSlop = (char) (47773 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                int offsetAfter = 468 - TextUtils.getOffsetAfter("", i3);
                                int iIndexOf = 13 - TextUtils.indexOf("", "");
                                Class[] clsArr = new Class[4];
                                clsArr[i3] = Integer.TYPE;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(windowTouchSlop, offsetAfter, iIndexOf, -2007001706, false, "o", clsArr);
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            int i10 = i5;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.getOffsetAfter("", 0)), 467 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - ((byte) KeyEvent.getModifierMetaStateMask()), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i4 -= 40503;
                            i5 = i10 + 1;
                            i3 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 2323 - ExpandableListView.getPackedPositionType(0L), 43 - TextUtils.lastIndexOf("", '0', 0), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    objArr[0] = new String(cArr2, 0, i);
                    int i11 = $10 + 109;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    return;
                }
            }
        }

        public static class StubApi21 implements MediaControllerCompatApi21.Callback {
            private final WeakReference<Callback> mCallback;
            private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
            private static final int $$f = 10;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {57, -56, 23, -36, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            private static final int $$e = 176;
            private static final byte[] $$a = {119, -103, 14, -22, 1, 31, -11, 33, -64, 63, 25, 17, 1, 14, 5, -55, 31, 48, 17, 2, 7, 23, 8, 25, -33, 47, 15, 11, -9, 23, -1, 12};
            private static final int $$b = 114;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60060, 60046, 60034, 59745, 60053, 60085, 59747, 60043, 60086, 59751, 60079, 59753, 60050, 60061, 59748, 60054, 60056, 60063, 60058, 60041, 60062, 60047, 60055, 59752, 60045, 60075, 59746, 59750, 59744, 60051, 60040, 60052, 59749, 60073, 60117, 60049};
            private static char b = 57191;

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = r7 + 103
                    int r6 = r6 * 8
                    int r6 = r6 + 11
                    int r5 = r5 * 18
                    int r5 = 22 - r5
                    byte[] r0 = android.support.v4.media.session.MediaControllerCompat.Callback.StubApi21.$$a
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r7 = r5
                    r4 = r6
                    r3 = r2
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L27:
                    r4 = r0[r5]
                L29:
                    int r5 = r5 + 1
                    int r7 = r7 + r4
                    int r7 = r7 + (-10)
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat.Callback.StubApi21.a(short, short, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r6, short r7, int r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = android.support.v4.media.session.MediaControllerCompat.Callback.StubApi21.$$d
                    int r8 = 103 - r8
                    int r7 = r7 * 52
                    int r7 = 53 - r7
                    int r6 = r6 * 52
                    int r6 = 56 - r6
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r7
                    r4 = r2
                    goto L26
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    r3 = r0[r6]
                L26:
                    int r3 = -r3
                    int r6 = r6 + 1
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat.Callback.StubApi21.c(int, short, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:37:0x011c  */
            /* JADX WARN: Code duplicated, block: B:39:0x013a  */
            /* JADX WARN: Code duplicated, block: B:41:0x0140  */
            /* JADX WARN: Code duplicated, block: B:45:0x018a A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #1 {all -> 0x006c, blocks: (B:7:0x001c, B:9:0x002a, B:10:0x0057, B:42:0x0142, B:45:0x018a, B:46:0x01fa, B:50:0x020f, B:52:0x024a, B:54:0x02b3), top: B:77:0x001c }] */
            /* JADX WARN: Code duplicated, block: B:49:0x020d  */
            /* JADX WARN: Code duplicated, block: B:52:0x024a A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:7:0x001c, B:9:0x002a, B:10:0x0057, B:42:0x0142, B:45:0x018a, B:46:0x01fa, B:50:0x020f, B:52:0x024a, B:54:0x02b3), top: B:77:0x001c }] */
            /* JADX WARN: Code duplicated, block: B:53:0x02b2  */
            /* JADX WARN: Code duplicated, block: B:56:0x02d4  */
            /* JADX WARN: Code duplicated, block: B:58:0x02dc  */
            /* JADX WARN: Code duplicated, block: B:59:0x0304  */
            private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
                int i2;
                int i3;
                char c;
                Object obj;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i4 = 2 % 2;
                deInitSession deinitsession = new deInitSession();
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i5 = 1770390596;
                Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), ImageFormat.getBitsPerPixel(0) + 2268, 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                            i6++;
                            i5 = 1770390596;
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
                    Object[] objArr4 = {Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.blue(0), Color.blue(0) + 2267, 33 - (Process.myPid() >> 22), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                    char[] cArr4 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr4[i2] = (char) (cArr[i2] - b2);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        int i7 = $10 + 31;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        int i9 = $10 + 85;
                        $11 = i9 % 128;
                        char c2 = 4;
                        if (i9 % 2 == 0) {
                            int i10 = 3 % 4;
                        }
                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                            int i11 = $11 + 23;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 << 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                    i3 = $10 + 1;
                                    $11 = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i12 = 2 / 5;
                                    }
                                    c = c2;
                                    obj = obj2;
                                } else {
                                    objArr2 = new Object[13];
                                    objArr2[12] = deinitsession;
                                    objArr2[11] = Integer.valueOf(cCharValue);
                                    objArr2[10] = deinitsession;
                                    objArr2[9] = deinitsession;
                                    objArr2[8] = Integer.valueOf(cCharValue);
                                    objArr2[7] = deinitsession;
                                    objArr2[6] = deinitsession;
                                    objArr2[5] = Integer.valueOf(cCharValue);
                                    objArr2[c2] = deinitsession;
                                    objArr2[3] = deinitsession;
                                    objArr2[2] = Integer.valueOf(cCharValue);
                                    objArr2[1] = deinitsession;
                                    objArr2[0] = deinitsession;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b7 = (byte) 1;
                                        byte b8 = (byte) (b7 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 49267), Process.getGidForName("") + 3262, 30 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b9 = (byte) 3;
                                            byte b10 = (byte) (b9 - 3);
                                            c = 4;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 594 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        } else {
                                            c = 4;
                                        }
                                        obj = null;
                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                        int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                                    } else {
                                        obj = null;
                                        c = 4;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                                        } else {
                                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                                        }
                                    }
                                }
                            } else {
                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                    i3 = $10 + 1;
                                    $11 = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i18 = 2 / 5;
                                    }
                                    c = c2;
                                    obj = obj2;
                                } else {
                                    objArr2 = new Object[13];
                                    objArr2[12] = deinitsession;
                                    objArr2[11] = Integer.valueOf(cCharValue);
                                    objArr2[10] = deinitsession;
                                    objArr2[9] = deinitsession;
                                    objArr2[8] = Integer.valueOf(cCharValue);
                                    objArr2[7] = deinitsession;
                                    objArr2[6] = deinitsession;
                                    objArr2[5] = Integer.valueOf(cCharValue);
                                    objArr2[c2] = deinitsession;
                                    objArr2[3] = deinitsession;
                                    objArr2[2] = Integer.valueOf(cCharValue);
                                    objArr2[1] = deinitsession;
                                    objArr2[0] = deinitsession;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        byte b11 = (byte) 1;
                                        byte b12 = (byte) (b11 - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 49267), Process.getGidForName("") + 3262, 30 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -127612708, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                    }
                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b13 = (byte) 3;
                                            byte b14 = (byte) (b13 - 3);
                                            c = 4;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22878 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 594 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 17, 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        } else {
                                            c = 4;
                                        }
                                        obj = null;
                                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                    } else {
                                        obj = null;
                                        c = 4;
                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                            int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                            int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i110];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i111];
                                        } else {
                                            int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                            int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i112];
                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                                        }
                                    }
                                }
                            }
                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                            obj2 = obj;
                            c2 = c;
                        }
                    }
                    for (int i20 = 0; i20 < i; i20++) {
                        cArr4[i20] = (char) (cArr4[i20] ^ 13722);
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

            StubApi21(Callback callback) {
                this.mCallback = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onSessionDestroyed() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    int i5 = i4 % 2;
                    callback.onSessionDestroyed();
                    if (i5 == 0) {
                        int i6 = 22 / 0;
                    }
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    this.mCallback.get();
                    throw null;
                }
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        IMediaControllerCallback iMediaControllerCallback = callback.mIControllerCallback;
                        callback.onSessionEvent(str, bundle);
                    } else {
                        IMediaControllerCallback iMediaControllerCallback2 = callback.mIControllerCallback;
                        callback.onSessionEvent(str, bundle);
                        obj.hashCode();
                        throw null;
                    }
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onPlaybackStateChanged(Object obj) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.mCallback.get();
                    throw null;
                }
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 55;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        IMediaControllerCallback iMediaControllerCallback = callback.mIControllerCallback;
                        throw null;
                    }
                    if (callback.mIControllerCallback == null) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
                        } else {
                            callback.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
                            int i5 = 45 / 0;
                        }
                    }
                }
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onMetadataChanged(Object obj) {
                int i = 2 % 2;
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                    int i3 = i2 % 2;
                    callback.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
                    if (i3 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onQueueChanged(List<?> list) {
                int i = 2 % 2;
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    callback.onQueueTitleChanged(charSequence);
                    if (i5 != 0) {
                        int i6 = 19 / 0;
                    }
                }
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onExtrasChanged(Bundle bundle) {
                Callback callback;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    callback = this.mCallback.get();
                    int i3 = 35 / 0;
                    if (callback == null) {
                        return;
                    }
                } else {
                    callback = this.mCallback.get();
                    if (callback == null) {
                        return;
                    }
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                callback.onExtrasChanged(bundle);
                if (i5 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.support.v4.media.session.MediaControllerCompatApi21.Callback
            public void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5) {
                int i6 = 2 % 2;
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.onAudioInfoChanged(new PlaybackInfo(i, i2, i3, i4, i5));
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0909  */
            /* JADX WARN: Code duplicated, block: B:103:0x0924  */
            /* JADX WARN: Code duplicated, block: B:104:0x0931  */
            /* JADX WARN: Code duplicated, block: B:107:0x0946  */
            /* JADX WARN: Code duplicated, block: B:108:0x0952  */
            /* JADX WARN: Code duplicated, block: B:111:0x0968  */
            /* JADX WARN: Code duplicated, block: B:112:0x0976  */
            /* JADX WARN: Code duplicated, block: B:125:0x05c7 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:129:0x06ce A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:130:0x06ce A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:131:0x06ce A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:32:0x042a  */
            /* JADX WARN: Code duplicated, block: B:47:0x052f  */
            /* JADX WARN: Code duplicated, block: B:50:0x054b  */
            /* JADX WARN: Code duplicated, block: B:55:0x05d0  */
            /* JADX WARN: Code duplicated, block: B:58:0x061d  */
            /* JADX WARN: Code duplicated, block: B:62:0x067b A[Catch: all -> 0x09ad, TryCatch #1 {all -> 0x09ad, blocks: (B:60:0x0664, B:62:0x067b, B:63:0x06bf, B:76:0x073a, B:78:0x0747, B:79:0x0786, B:81:0x07a5, B:82:0x07f0), top: B:122:0x0664 }] */
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) throws Throwable {
                int i;
                int i2;
                int i3;
                String string;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                Method method;
                Method[] declaredMethods;
                int length;
                Method[] methodArr;
                Object[] objArr;
                Object[] objArr2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i11 = 2;
                int i12 = 2 % 2;
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
                int i14 = i13 % 2;
                int i15 = 1;
                byte[] bArr = $$a;
                byte b2 = bArr[4];
                byte b3 = b2;
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                char c = 0;
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b4 = (byte) (bArr[4] - 1);
                byte b5 = b4;
                Object[] objArr4 = new Object[1];
                a(b4, b5, b5, objArr4);
                String str = (String) objArr4[0];
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i17 = (i16 ^ 7) + ((i16 & 7) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                int i18 = i17 % 2;
                Method[] methodArr2 = {cls.getMethod(str, String.class, Provider.class)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int gidForName = 2822 - Process.getGidForName("");
                    int defaultSize = View.getDefaultSize(0, 0) + 22;
                    byte[] bArr2 = $$d;
                    Object[] objArr5 = new Object[1];
                    c(bArr2[5], bArr2[7], bArr2[10], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(absoluteGravity, gidForName, defaultSize, 1814927978, false, (String) objArr5[0], null);
                }
                long j = 0;
                int i19 = 24;
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                    if (i20 % 2 != 0) {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ('0' - AndroidCharacter.getMirror('0')), 2823 - TextUtils.getCapsMode("", 0, 0), 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getDeclaredMethods();
                        length = declaredMethods.length;
                    } else {
                        declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.argb(0, 0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822, 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredMethods();
                        length = declaredMethods.length;
                    }
                    int i21 = 0;
                    while (i21 < length) {
                        Method method2 = declaredMethods[i21];
                        try {
                            char[] cArr = new char[i19];
                            // fill-array-data instruction
                            cArr[0] = 30;
                            cArr[1] = 23;
                            cArr[2] = 30;
                            cArr[3] = 24;
                            cArr[4] = 4;
                            cArr[5] = 28;
                            cArr[6] = 22;
                            cArr[7] = 0;
                            cArr[8] = 4;
                            cArr[9] = 30;
                            cArr[10] = 20;
                            cArr[11] = 21;
                            cArr[12] = 16;
                            cArr[13] = 19;
                            cArr[14] = 22;
                            cArr[15] = 14;
                            cArr[16] = 22;
                            cArr[17] = '!';
                            cArr[18] = 14;
                            cArr[19] = 26;
                            cArr[20] = 23;
                            cArr[21] = 27;
                            cArr[22] = '#';
                            cArr[23] = '\r';
                            int i22 = -(-TextUtils.lastIndexOf("", '0'));
                            int i23 = -TextUtils.indexOf((CharSequence) "", '0');
                            Object[] objArr6 = new Object[i15];
                            d(cArr, (byte) ((i22 ^ 34) + ((i22 & 34) << i15)), (i23 & 23) + (i23 | 23), objArr6);
                            Class<?> cls2 = Class.forName((String) objArr6[c]);
                            char[] cArr2 = {2, 18, 20, '\t', '#', '\r', '\r', 14, 14, 18, 18, 31};
                            byte b6 = (byte) (94 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16))));
                            int i24 = -ExpandableListView.getPackedPositionChild(j);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i25 = (i24 * 46) + TypedValues.PositionType.TYPE_PERCENT_X;
                            int i26 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i27 = ~(((-12) ^ i26) | ((-12) & i26));
                            int i28 = -(-(((i24 ^ i27) | (i27 & i24)) * (-90)));
                            int i29 = (i25 ^ i28) + ((i28 & i25) << i15);
                            int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                            int i31 = i30 % i11;
                            int i32 = (-45) * ((~((-12) | iTuitionPaymentFragmentspecialinlinedviewModeldefault3)) | (~((i24 ^ 11) | (i24 & 11))));
                            int i33 = (i29 & i32) + (i29 | i32);
                            int i34 = ~i24;
                            int i35 = ~((i34 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i34 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i36 = ((-12) & i35) | ((-12) ^ i35);
                            int i37 = ~((i26 & i24) | (i26 ^ i24));
                            int i38 = (i33 - (~(-(-(((i36 & i37) | (i36 ^ i37)) * 45))))) - 1;
                            Object[] objArr7 = new Object[1];
                            d(cArr2, b6, i38, objArr7);
                            Object[] objArr8 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr7[0], null).invoke(method2, null)).intValue())};
                            char[] cArr3 = {30, 23, 30, 24, 4, 28, 22, 0, 4, 30, 20, 21, 16, 19, 22, 14, 22, '!', 7, ' ', '\f', '\r', 14, '\r', 21, 20};
                            int i39 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i40 = i39 * (-103);
                            int i41 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i42 = (i41 ^ 31) + ((i41 & 31) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i42 % 128;
                            int i43 = i42 % i11;
                            int i44 = (i40 & (-1133)) + (i40 | (-1133));
                            int i45 = ~i39;
                            int i46 = ~((i45 & (-12)) | (i45 ^ (-12)));
                            int i47 = ~(((-12) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-12) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i48 = -(-(((i46 & i47) | (i46 ^ i47)) * 104));
                            int i49 = (i44 ^ i48) + ((i48 & i44) << 1);
                            int i50 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | i39;
                            int i51 = (i49 - (~((~((i50 & 11) | (i50 ^ 11))) * (-104)))) - 1;
                            int i52 = ((i39 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i39 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)) * 104;
                            byte b7 = (byte) (((i51 | i52) << 1) - (i52 ^ i51));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            int i53 = iIndexOf * (-103);
                            int i54 = (i53 & (-2781)) + (i53 | (-2781));
                            int i55 = ~iIndexOf;
                            int i56 = ~((i55 & (-28)) | (i55 ^ (-28)));
                            int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i58 = ((i57 | 93) << 1) - (i57 ^ 93);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i58 % 128;
                            int i59 = i58 % i11;
                            int i60 = ~(((-28) & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | ((-28) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                            int i61 = 104 * ((i56 & i60) | (i56 ^ i60));
                            int i62 = ((i54 | i61) << 1) - (i54 ^ i61);
                            int i63 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i64 = (i63 & iIndexOf) | (i63 ^ iIndexOf);
                            int i65 = ((i62 + ((~((i64 & 27) | (i64 ^ 27))) * (-104))) - (~((iIndexOf | iTuitionPaymentFragmentspecialinlinedviewModeldefault5) * 104))) - 1;
                            Object[] objArr9 = new Object[1];
                            d(cArr3, b7, i65, objArr9);
                            Class<?> cls3 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            d(new char[]{18, 0, 0, 23, 18, 15, 26, 18}, (byte) ((Process.myTid() >> 22) + 68), 8 - (~ImageFormat.getBitsPerPixel(0)), objArr10);
                            if (((Boolean) cls3.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue()) {
                                Class cls4 = Long.TYPE;
                                char[] cArr4 = {30, 23, 30, 24, 4, 28, 22, 0, 4, 30, 20, 21, 16, 19, 22, 14, 22, '!', 14, 26, 23, 27, '#', '\r'};
                                int i66 = -KeyEvent.getDeadChar(0, 0);
                                byte b8 = (byte) (((i66 | 33) << 1) - (i66 ^ 33));
                                int offsetAfter = TextUtils.getOffsetAfter("", 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i68 = (i67 ^ 97) + ((i67 & 97) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i68 % 128;
                                int i69 = i68 % i11;
                                int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                int i71 = (~((-25) | offsetAfter)) | (~(((-25) ^ i70) | ((-25) & i70)));
                                int i72 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                methodArr = declaredMethods;
                                int i73 = i71 | (~((i72 ^ offsetAfter) | (i72 & offsetAfter)));
                                int i74 = ~((~offsetAfter) | 24 | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                int i75 = (offsetAfter * (-589)) + 14184 + (590 * ((i73 & i74) | (i73 ^ i74)));
                                int i76 = ((i67 | 101) << 1) - (i67 ^ 101);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i76 % 128;
                                int i77 = i76 % 2;
                                int i78 = i75 + ((-1180) * ((~(((-25) & i72) | ((-25) ^ i72))) | (~(((-25) ^ offsetAfter) | ((-25) & offsetAfter))) | (~((i72 ^ offsetAfter) | (i72 & offsetAfter)))));
                                int i79 = ~offsetAfter;
                                int i80 = ~((i79 & i72) | (i79 ^ i72));
                                int i81 = (i67 & 67) + (i67 | 67);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i81 % 128;
                                int i82 = i81 % 2;
                                Object[] objArr11 = new Object[1];
                                d(cArr4, b8, i78 + (590 * (i80 | (~((i70 ^ 24) | (i70 & 24))))), objArr11);
                                Class<?> cls5 = Class.forName((String) objArr11[0]);
                                char[] cArr5 = {2, 18, 27, 3, 21, 22, 7, 25, '\n', 16, 1, '\b', 13839};
                                int i83 = -Process.getGidForName("");
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i84 = i83 * (-501);
                                int i85 = ~(((-16) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-16) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i86 = ~(i83 | 15);
                                int i87 = (((i84 ^ 7545) + ((i84 & 7545) << 1)) - (~(-(-(((i85 & i86) | (i85 ^ i86)) * (-502)))))) - 1;
                                int i88 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i89 = (i88 & (-16)) | ((-16) ^ i88);
                                int i90 = (i87 - (~(-(-((~((i89 & i83) | (i89 ^ i83))) * (-502)))))) - 1;
                                int i91 = ~i83;
                                int i92 = ((~((i91 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i91 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) | (-16)) * TypedValues.PositionType.TYPE_DRAWPATH;
                                byte b9 = (byte) (((i90 | i92) << 1) - (i92 ^ i90));
                                int i93 = -View.combineMeasuredStates(0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                int i94 = i93 * 595;
                                int i95 = (i94 & (-15431)) + (i94 | (-15431));
                                int i96 = ~i93;
                                int i97 = ~((i96 ^ 13) | (i96 & 13));
                                int i98 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i99 = ~(i98 | 13);
                                int i100 = ((i97 ^ i99) | (i97 & i99)) * (-1188);
                                int i101 = (i95 & i100) + (i95 | i100);
                                int i102 = ~(i96 | 13);
                                int i103 = ~((-14) | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                                int i104 = (i102 & i103) | (i102 ^ i103);
                                int i105 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i106 = ~((i105 ^ i93) | (i105 & i93));
                                int i107 = i101 + (((i104 & i106) | (i104 ^ i106)) * 594);
                                int i108 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i108 % 128;
                                if (i108 % 2 == 0) {
                                    int i109 = ~((i105 & (-14)) | ((-14) ^ i105));
                                    int i110 = ~((i93 & (-14)) | ((-14) ^ i93));
                                    int i111 = (i110 & i109) | (i109 ^ i110);
                                    Object[] objArr12 = new Object[1];
                                    d(cArr5, b9, i107 >> (594 << ((i111 & i106) | (i111 ^ i106))), objArr12);
                                    if (cls4.equals(cls5.getMethod((String) objArr12[0], null).invoke(method2, null))) {
                                        char[] cArr6 = {30, 23, 30, 24, 4, 28, 22, 0, 4, 30, 20, 21, 16, 19, 22, 14, 22, '!', 14, 26, 23, 27, '#', '\r'};
                                        int i112 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i114 = i113 + 57;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i114 % 128;
                                        int i115 = i114 % 2;
                                        int i116 = (i112 * (-1939)) - (-33014);
                                        int i117 = ~(((-35) & i112) | ((-35) ^ i112));
                                        int i118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                        int i119 = (i117 | (~((i118 & 34) | (i118 ^ 34)))) * (-970);
                                        int i120 = (i116 & i119) + (i116 | i119);
                                        int i121 = ~i112;
                                        int i122 = (~((i121 ^ 34) | (i121 & 34))) * 1940;
                                        int i123 = ~((i121 & (-35)) | (i121 ^ (-35)));
                                        int i124 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                        int i125 = ~((i124 & 34) | (i124 ^ 34));
                                        byte b10 = (byte) ((((i120 | i122) << 1) - (i122 ^ i120)) + (((i123 & i125) | (i123 ^ i125)) * 970));
                                        int i126 = i113 + 1;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i126 % 128;
                                        int i127 = i126 % 2;
                                        int i128 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                        int i129 = (i128 ^ 24) + ((i128 & 24) << 1);
                                        Object[] objArr13 = new Object[1];
                                        d(cArr6, b10, i129, objArr13);
                                        Class<?> cls6 = Class.forName((String) objArr13[0]);
                                        char[] cArr7 = {2, 18, 19, 27, 19, 20, 21, '\f', 21, 22, 21, 20, '\b', 4, '\b', 19, 13894};
                                        int i130 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i130 % 128;
                                        int i131 = i130 % 2;
                                        int i132 = -TextUtils.getOffsetBefore("", 0);
                                        int i133 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                                        Object[] objArr14 = new Object[1];
                                        d(cArr7, (byte) (((i132 | 93) << 1) - (i132 ^ 93)), (i133 & 18) + (i133 | 18), objArr14);
                                        String str2 = (String) objArr14[0];
                                        int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i134 % 128;
                                        int i135 = i134 % 2;
                                        objArr = (Object[]) cls6.getMethod(str2, null).invoke(method2, null);
                                        if (objArr.length == 2) {
                                            int i136 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i137 = (i136 ^ 61) + ((i136 & 61) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i137 % 128;
                                            int i138 = i137 % 2;
                                            if (!(!Long.TYPE.equals(objArr[0]))) {
                                                continue;
                                            } else {
                                                byte b11 = (byte) (32 - (~(-(-KeyEvent.getDeadChar(0, 0)))));
                                                int i139 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                int i140 = ~i139;
                                                int i141 = (((i139 * (-209)) - 5225) - (~((~(i140 | (-26))) * 210))) - 1;
                                                int i142 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                int i143 = ~(((-26) & i142) | ((-26) ^ i142));
                                                int i144 = ~((i140 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i140 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                int i145 = ((i143 & i144) | (i143 ^ i144)) * 210;
                                                int i146 = (i141 ^ i145) + ((i141 & i145) << 1);
                                                int i147 = i140 | i142;
                                                int i148 = ~((i147 & 25) | (i147 ^ 25));
                                                int i149 = ~((i139 & (-26)) | ((-26) ^ i139) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                                int i150 = -(-(((i149 & i148) | (i148 ^ i149)) * 210));
                                                int i151 = (i146 ^ i150) + ((i150 & i146) << 1);
                                                objArr2 = new Object[1];
                                                d(new char[]{30, 23, 30, 24, 4, 28, 22, 0, 4, 30, 20, 21, 16, 19, 22, 14, 22, '!', 14, 26, 23, 27, '#', '\r'}, b11, i151, objArr2);
                                                if (!Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i152 = 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int i153 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        byte[] bArr3 = $$d;
                                                        Object[] objArr15 = new Object[1];
                                                        c(bArr3[5], bArr3[7], bArr3[10], objArr15);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i152, i153, 1814927978, false, (String) objArr15[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i154 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        byte[] bArr4 = $$d;
                                                        Object[] objArr16 = new Object[1];
                                                        c(bArr4[5], bArr4[7], bArr4[10], objArr16);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, i154, keyRepeatDelay, 1814927978, false, (String) objArr16[0], null);
                                                    }
                                                    try {
                                                        Object[] objArr17 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                                            int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                                            byte[] bArr5 = $$d;
                                                            byte b12 = bArr5[7];
                                                            Object[] objArr18 = new Object[1];
                                                            c(b12, bArr5[5], b12, objArr18);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror, pressedStateDuration, keyRepeatDelay2, -2137287382, false, (String) objArr18[0], new Class[]{Long.TYPE, Method.class});
                                                        }
                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr17)).longValue();
                                                        break;
                                                    } catch (Throwable th) {
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    int i155 = ~(((-14) ^ i98) | (i98 & (-14)));
                                    int i156 = ~(i93 | (-14));
                                    int i157 = -(-(((i156 & i155) | (i155 ^ i156) | i106) * 594));
                                    int i158 = (i107 ^ i157) + ((i157 & i107) << 1);
                                    Object[] objArr19 = new Object[1];
                                    d(cArr5, b9, i158, objArr19);
                                    if (cls4.equals(cls5.getMethod((String) objArr19[0], null).invoke(method2, null))) {
                                        char[] cArr8 = {30, 23, 30, 24, 4, 28, 22, 0, 4, 30, 20, 21, 16, 19, 22, 14, 22, '!', 14, 26, 23, 27, '#', '\r'};
                                        int i1110 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        int i1111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i1112 = i1111 + 57;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1112 % 128;
                                        int i1113 = i1112 % 2;
                                        int i1114 = (i1110 * (-1939)) - (-33014);
                                        int i1115 = ~(((-35) & i1110) | ((-35) ^ i1110));
                                        int i1116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i1117 = (i1115 | (~((i1116 & 34) | (i1116 ^ 34)))) * (-970);
                                        int i1210 = (i1114 & i1117) + (i1114 | i1117);
                                        int i1211 = ~i1110;
                                        int i1212 = (~((i1211 ^ 34) | (i1211 & 34))) * 1940;
                                        int i1213 = ~((i1211 & (-35)) | (i1211 ^ (-35)));
                                        int i1214 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                        int i1215 = ~((i1214 & 34) | (i1214 ^ 34));
                                        byte b13 = (byte) ((((i1210 | i1212) << 1) - (i1212 ^ i1210)) + (((i1213 & i1215) | (i1213 ^ i1215)) * 970));
                                        int i1216 = i1111 + 1;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1216 % 128;
                                        int i1217 = i1216 % 2;
                                        int i1218 = -(-(ViewConfiguration.getEdgeSlop() >> 16));
                                        int i1219 = (i1218 ^ 24) + ((i1218 & 24) << 1);
                                        Object[] objArr110 = new Object[1];
                                        d(cArr8, b13, i1219, objArr110);
                                        Class<?> cls7 = Class.forName((String) objArr110[0]);
                                        char[] cArr9 = {2, 18, 19, 27, 19, 20, 21, '\f', 21, 22, 21, 20, '\b', 4, '\b', 19, 13894};
                                        int i1310 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1310 % 128;
                                        int i1311 = i1310 % 2;
                                        int i1312 = -TextUtils.getOffsetBefore("", 0);
                                        int i1313 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                                        Object[] objArr111 = new Object[1];
                                        d(cArr9, (byte) (((i1312 | 93) << 1) - (i1312 ^ 93)), (i1313 & 18) + (i1313 | 18), objArr111);
                                        String str3 = (String) objArr111[0];
                                        int i1314 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1314 % 128;
                                        int i1315 = i1314 % 2;
                                        objArr = (Object[]) cls7.getMethod(str3, null).invoke(method2, null);
                                        if (objArr.length == 2) {
                                            int i1316 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            int i1317 = (i1316 ^ 61) + ((i1316 & 61) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1317 % 128;
                                            int i1318 = i1317 % 2;
                                            if (!(!Long.TYPE.equals(objArr[0]))) {
                                                byte b14 = (byte) (32 - (~(-(-KeyEvent.getDeadChar(0, 0)))));
                                                int i1319 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                int i1410 = ~i1319;
                                                int i1411 = (((i1319 * (-209)) - 5225) - (~((~(i1410 | (-26))) * 210))) - 1;
                                                int i1412 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
                                                int i1413 = ~(((-26) & i1412) | ((-26) ^ i1412));
                                                int i1414 = ~((i1410 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | (i1410 & iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
                                                int i1415 = ((i1413 & i1414) | (i1413 ^ i1414)) * 210;
                                                int i1416 = (i1411 ^ i1415) + ((i1411 & i1415) << 1);
                                                int i1417 = i1410 | i1412;
                                                int i1418 = ~((i1417 & 25) | (i1417 ^ 25));
                                                int i1419 = ~((i1319 & (-26)) | ((-26) ^ i1319) | iTuitionPaymentFragmentspecialinlinedviewModeldefault12);
                                                int i159 = -(-(((i1419 & i1418) | (i1418 ^ i1419)) * 210));
                                                int i1510 = (i1416 ^ i159) + ((i159 & i1416) << 1);
                                                objArr2 = new Object[1];
                                                d(new char[]{30, 23, 30, 24, 4, 28, 22, 0, 4, 30, 20, 21, 16, 19, 22, 14, 22, '!', 14, 26, 23, 27, '#', '\r'}, b14, i1510, objArr2);
                                                if (!Class.forName((String) objArr2[0]).equals(objArr[1])) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i1511 = 2824 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                        int i1512 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        byte[] bArr6 = $$d;
                                                        Object[] objArr112 = new Object[1];
                                                        c(bArr6[5], bArr6[7], bArr6[10], objArr112);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, i1511, i1512, 1814927978, false, (String) objArr112[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i1513 = 2824 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                        int keyRepeatDelay3 = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                        byte[] bArr7 = $$d;
                                                        Object[] objArr113 = new Object[1];
                                                        c(bArr7[5], bArr7[7], bArr7[10], objArr113);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, i1513, keyRepeatDelay3, 1814927978, false, (String) objArr113[0], null);
                                                    }
                                                    Object[] objArr114 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                                                        int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 2823;
                                                        int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22;
                                                        byte[] bArr8 = $$d;
                                                        byte b15 = bArr8[7];
                                                        Object[] objArr115 = new Object[1];
                                                        c(b15, bArr8[5], b15, objArr115);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(mirror2, pressedStateDuration2, keyRepeatDelay4, -2137287382, false, (String) objArr115[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr114)).longValue();
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                methodArr = declaredMethods;
                            }
                            i21 = ((i21 & 54) + (i21 | 54)) - 53;
                            declaredMethods = methodArr;
                            i11 = 2;
                            i15 = 1;
                            c = 0;
                            j = 0;
                            i19 = 24;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int gidForName2 = Process.getGidForName("") + 2824;
                    int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr9 = $$d;
                    Object[] objArr20 = new Object[1];
                    c(bArr9[5], bArr9[7], bArr9[10], objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, gidForName2, threadPriority, 1814927978, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int maximumDrawingCacheSize = 2823 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i160 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                    byte[] bArr10 = $$d;
                    byte b16 = bArr10[7];
                    byte b17 = bArr10[5];
                    Object[] objArr22 = new Object[1];
                    c(b16, b17, (byte) (b17 + 4), objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration3, maximumDrawingCacheSize, i160, 1025296417, false, (String) objArr22[0], new Class[]{Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr21);
                Object[] objArr23 = {0, methodArr2, null};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cCombineMeasuredStates = (char) (37657 - View.combineMeasuredStates(0, 0));
                    int absoluteGravity2 = 2720 - Gravity.getAbsoluteGravity(0, 0);
                    int i161 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18;
                    byte[] bArr11 = $$d;
                    byte b18 = bArr11[7];
                    byte b19 = bArr11[5];
                    Object[] objArr24 = new Object[1];
                    c(b18, b19, (byte) (b19 + 4), objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, absoluteGravity2, i161, -1568796068, false, (String) objArr24[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr23)).longValue();
                long j2 = -1618690458;
                long j3 = -919;
                long j4 = (j3 * j2) + (j3 * jLongValue);
                long j5 = 920;
                long j6 = -1;
                long j7 = j2 ^ j6;
                long j8 = jLongValue ^ j6;
                long j9 = j7 | j8;
                long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                long j10 = jFreeMemory ^ j6;
                long j11 = j4 + ((((j9 | jFreeMemory) ^ j6) | (((j8 | j10) | j2) ^ j6)) * j5) + (((j9 ^ j6) | ((j7 | j10) ^ j6)) * j5) + (j5 * ((((j2 | j8) | jFreeMemory) ^ j6) | ((j9 | j10) ^ j6) | (((jLongValue | j7) | jFreeMemory) ^ j6))) + ((long) (-191715387));
                int i162 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i163 = ((i162 | 41) << 1) - (i162 ^ 41);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i163 % 128;
                int i164 = i163 % 2;
                int i165 = ~((int) Process.getStartElapsedRealtime());
                int i166 = ((int) (j11 >> 32)) & (1754752898 + (((~(754962327 | i165)) | 682264083) * (-828)) + ((i165 | 754962327) * (-828)) + 1956417632);
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i167 = ((int) j11) & ((-1086463768) + (((-98306) | elapsedCpuTime) * (-381)) + (((~((~elapsedCpuTime) | (-430694446))) | (-576034130)) * 381) + 37454205);
                int i168 = (i166 & i167) | (i166 ^ i167);
                int i169 = i168 >>> 24;
                int i170 = i168 & ViewCompat.MEASURED_SIZE_MASK;
                if (i169 != 0) {
                    int i171 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i172 = i171 + 73;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i172 % 128;
                    int i173 = i172 % 2;
                    int i174 = i171 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i174 % 128;
                    int i175 = i174 % 2;
                    i = 1;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    int i176 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i2 = 1;
                    int i177 = (i176 ^ 17) + ((i176 & 17) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i177 % 128;
                    if (i177 % 2 == 0) {
                        i3 = 1;
                    }
                    if (i == i2 || i170 >= i2 || (method = methodArr2[i170]) == null) {
                        string = null;
                    } else {
                        int i178 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i179 = (i178 & 71) + (i178 | 71);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i179 % 128;
                        int i180 = i179 % 2;
                        string = method.toString();
                        int i181 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i182 = (i181 & 61) + (i181 | 61);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i182 % 128;
                        int i183 = i182 % 2;
                    }
                    list.add(string);
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i184 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    i4 = (i184 ^ 97) + ((i184 & 97) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i185 = -i169;
                        i5 = 67108856 - (~(((i185 | (-195)) << 1) - (i185 ^ (-195))));
                    } else {
                        int i186 = i169 * (-195);
                        i5 = ((-2346) ^ i186) + ((i186 & (-2346)) << 1);
                    }
                    i6 = i184 + 11;
                    int i187 = i6 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i187;
                    if (i6 % 2 == 0) {
                        int i188 = ~i169;
                        i7 = ~((i188 & 6) | (i188 ^ 6));
                        int i189 = 97 / 0;
                    } else {
                        int i190 = ~i169;
                        i7 = ~((i190 & 6) | (i190 ^ 6));
                    }
                    i8 = (i187 & 51) + (i187 | 51);
                    int i191 = i8 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i191;
                    if (i8 % 2 != 0) {
                        int i192 = ~(i169 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        i10 = i5 >>> ((-196) << ((i7 & i192) | (i7 ^ i192)));
                        i9 = 1;
                    } else {
                        int i193 = ~((i169 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i169 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                        int i194 = i5 - (~((-196) * ((i7 & i193) | (i7 ^ i193))));
                        i9 = 1;
                        i10 = i194 - 1;
                    }
                    int i195 = (i10 - (~(392 * ((i169 ^ 6) | (i169 & 6))))) - i9;
                    int i196 = i191 + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i196 % 128;
                    int i197 = i196 % 2;
                    int i198 = ~i169;
                    int i199 = ~((i198 & (-7)) | ((-7) ^ i198));
                    int i200 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i169) | (i169 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    return (i195 + (((i200 & i199) | (i199 ^ i200)) * 196)) * i3;
                }
                i2 = 1;
                i3 = 0;
                if (i == i2) {
                    string = null;
                } else {
                    int i1710 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i1711 = (i1710 & 71) + (i1710 | 71);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1711 % 128;
                    int i1810 = i1711 % 2;
                    string = method.toString();
                    int i1811 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i1812 = (i1811 & 61) + (i1811 | 61);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1812 % 128;
                    int i1813 = i1812 % 2;
                }
                list.add(string);
                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ObservableTakeLastTimed.TakeLastTimedObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i1814 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i4 = (i1814 ^ 97) + ((i1814 & 97) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i1815 = -i169;
                    i5 = 67108856 - (~(((i1815 | (-195)) << 1) - (i1815 ^ (-195))));
                } else {
                    int i1816 = i169 * (-195);
                    i5 = ((-2346) ^ i1816) + ((i1816 & (-2346)) << 1);
                }
                i6 = i1814 + 11;
                int i1817 = i6 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1817;
                if (i6 % 2 == 0) {
                    int i1818 = ~i169;
                    i7 = ~((i1818 & 6) | (i1818 ^ 6));
                    int i1819 = 97 / 0;
                } else {
                    int i1910 = ~i169;
                    i7 = ~((i1910 & 6) | (i1910 ^ 6));
                }
                i8 = (i1817 & 51) + (i1817 | 51);
                int i1911 = i8 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1911;
                if (i8 % 2 != 0) {
                    int i1912 = ~(i169 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    i10 = i5 >>> ((-196) << ((i7 & i1912) | (i7 ^ i1912)));
                    i9 = 1;
                } else {
                    int i1913 = ~((i169 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i169 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                    int i1914 = i5 - (~((-196) * ((i7 & i1913) | (i7 ^ i1913))));
                    i9 = 1;
                    i10 = i1914 - 1;
                }
                int i1915 = (i10 - (~(392 * ((i169 ^ 6) | (i169 & 6))))) - i9;
                int i1916 = i1911 + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1916 % 128;
                int i1917 = i1916 % 2;
                int i1918 = ~i169;
                int i1919 = ~((i1918 & (-7)) | ((-7) ^ i1918));
                int i201 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i169) | (i169 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                return (i1915 + (((i201 & i1919) | (i1919 ^ i201)) * 196)) * i3;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r6, byte r7, short r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r6 = r6 + 113
                    byte[] r0 = android.support.v4.media.session.MediaControllerCompat.Callback.StubApi21.$$c
                    int r8 = r8 * 4
                    int r1 = 1 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    if (r0 != 0) goto L17
                    r3 = r7
                    r6 = r8
                    r4 = r2
                    goto L2b
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L23:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r3
                    r3 = r7
                    r7 = r4
                    r4 = r5
                L2b:
                    int r7 = -r7
                    int r6 = r6 + r7
                    int r7 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaControllerCompat.Callback.StubApi21.$$g(byte, byte, short):java.lang.String");
            }
        }

        public IMediaControllerCallback getIControllerCallback() {
            int i = 2 % 2;
            int i2 = f256a;
            int i3 = i2 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            IMediaControllerCallback iMediaControllerCallback = this.mIControllerCallback;
            int i5 = i2 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return iMediaControllerCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            int i = 2 % 2;
            int i2 = f256a + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            postToHandler(8, null, null);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            f256a = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
        }

        void setHandler(Handler handler) {
            int i = 2 % 2;
            int i2 = f256a + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            if (handler == null) {
                MessageHandler messageHandler = this.mHandler;
                if (messageHandler != null) {
                    messageHandler.mRegistered = false;
                    this.mHandler.removeCallbacksAndMessages(null);
                    this.mHandler = null;
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                f256a = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                return;
            }
            MessageHandler messageHandler2 = new MessageHandler(handler.getLooper());
            this.mHandler = messageHandler2;
            messageHandler2.mRegistered = true;
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            f256a = i5 % 128;
            int i6 = i5 % 2;
        }

        void postToHandler(int i, Object obj, Bundle bundle) {
            int i2 = 2 % 2;
            int i3 = f256a;
            int i4 = i3 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            MessageHandler messageHandler = this.mHandler;
            if (messageHandler != null) {
                int i6 = i3 + 7;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                Message messageObtainMessage = messageHandler.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
                f256a = i8 % 128;
                int i9 = i8 % 2;
            }
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            int i = 2 % 2;
            int i2 = f256a + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        }

        public void onCaptioningEnabledChanged(boolean z) {
            int i = 2 % 2;
            int i2 = f256a + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onExtrasChanged(Bundle bundle) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            f256a = i2 % 128;
            int i3 = i2 % 2;
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            int i = 2 % 2;
            int i2 = f256a + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            int i = 2 % 2;
            int i2 = f256a + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            f256a = i2 % 128;
            int i3 = i2 % 2;
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            int i = 2 % 2;
            int i2 = f256a + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onRepeatModeChanged(int i) {
            int i2 = 2 % 2;
            int i3 = f256a + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 10 / 0;
            }
        }

        public void onSessionDestroyed() {
            int i = 2 % 2;
            int i2 = f256a + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onSessionEvent(String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            f256a = i2 % 128;
            int i3 = i2 % 2;
        }

        public void onSessionReady() {
            int i = 2 % 2;
            int i2 = f256a + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public void onShuffleModeChanged(int i) {
            int i2 = 2 % 2;
            int i3 = f256a + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x0a60  */
        /* JADX WARN: Code duplicated, block: B:106:0x0a63  */
        /* JADX WARN: Code duplicated, block: B:109:0x0a80  */
        /* JADX WARN: Code duplicated, block: B:110:0x0a8b  */
        /* JADX WARN: Code duplicated, block: B:113:0x0ae3  */
        /* JADX WARN: Code duplicated, block: B:114:0x0af5  */
        /* JADX WARN: Code duplicated, block: B:117:0x0b6d  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class cls, int i, int i2, int i3) throws Throwable {
            String[][] strArr;
            CharSequence charSequence;
            CharSequence charSequence2;
            long j;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            Object[] objArr;
            int i10;
            char c;
            int i11;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i12;
            int i13;
            int i14;
            Class<?> cls2;
            char[] cArr;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            String string;
            int i20;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i21;
            int i22;
            String[] strArr2;
            char c2;
            char c3;
            int i23;
            int i24;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i25;
            int i26 = 2 % 2;
            if ((i2 & 2) != 0) {
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                f256a = i27 % 128;
                int i28 = i27 % 2;
                String[][] strArr3 = new String[1][];
                try {
                    int i29 = -ExpandableListView.getPackedPositionType(0L);
                    int i30 = i29 * (-115);
                    int i31 = (i30 ^ (-920)) + ((i30 & (-920)) << 1);
                    int i32 = ~i;
                    int i33 = (i32 ^ i29) | (i32 & i29);
                    int i34 = -(-((~((i33 ^ 8) | (i33 & 8))) * (-116)));
                    int i35 = (i31 ^ i34) + ((i31 & i34) << 1);
                    int i36 = -(-((i29 | i) * 116));
                    int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                    int i38 = ~i29;
                    int i39 = i37 + (((~((i38 & (-9)) | (i38 ^ (-9)))) | (~(((-9) ^ i) | ((-9) & i)))) * 116);
                    Object[] objArr2 = new Object[1];
                    c(new char[]{38826, 52517, 42773, 12226, 34172, 63824, 65164, 18713, 39913, 5506}, i39, objArr2);
                    Field declaredField = Class.class.getDeclaredField((String) objArr2[0]);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(cls);
                    Class<?> cls3 = obj.getClass();
                    Object[] objArr3 = new Object[1];
                    c(new char[]{29811, 7265, 37191, 14382, 24774, 46555, 548, 46643, 15339, 60145}, 16777222 - (~(-(-Color.rgb(0, 0, 0)))), objArr3);
                    Field declaredField2 = cls3.getDeclaredField((String) objArr3[0]);
                    declaredField2.setAccessible(true);
                    try {
                        Object[] objArr4 = {Long.valueOf(((Number) declaredField2.get(obj)).longValue() & 281474976710655L), strArr3};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486768121);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 41241);
                            int packedPositionChild = 1704 - ExpandableListView.getPackedPositionChild(0L);
                            int iMyTid = (Process.myTid() >> 22) + 21;
                            byte[] bArr = $$a;
                            byte b2 = (byte) (-bArr[5]);
                            byte b3 = bArr[7];
                            Object[] objArr5 = new Object[1];
                            d(b2, b3, b3, objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionChild, iMyTid, -107095506, false, (String) objArr5[0], new Class[]{Long.TYPE, String[][].class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).longValue();
                        long j2 = -145429340;
                        long j3 = -1;
                        long j4 = j2 ^ j3;
                        long j5 = i;
                        long j6 = (j4 | j5) ^ j3;
                        long j7 = 140;
                        long j8 = jLongValue ^ j3;
                        long j9 = (((long) 141) * j2) + (((long) (-139)) * jLongValue) + (((long) (-280)) * (((j4 | jLongValue) ^ j3) | j6)) + ((j6 | ((j8 | j5) ^ j3)) * j7);
                        long j10 = ((j4 | j8) | j5) ^ j3;
                        long j11 = j5 ^ j3;
                        long j12 = j9 + (j7 * (j10 | (((j4 | j11) | jLongValue) ^ j3) | (j3 ^ ((j8 | j11) | j2)))) + ((long) (-1960587721));
                        int i40 = (int) (j12 >> 32);
                        int iNextInt = new Random().nextInt();
                        int i41 = i40 & ((((-1320242614) + (((~((-1680332031) | iNextInt)) | 1610776748) * 1504)) + ((~(iNextInt | (-69555283))) * (-1504))) - 1784172320);
                        int i42 = (int) j12;
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i43 = i42 & ((-1634484649) + (((~(1391940517 | iFreeMemory)) | (~((~iFreeMemory) | (-45285893)))) * (-318)) + (((~((-49746821) | iFreeMemory)) | 4460928) * (-318)) + (((~(iFreeMemory | 49746820)) | 1387479589) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                        int i44 = (i41 & i43) | (i41 ^ i43);
                        if (i44 != 0) {
                            int i45 = f256a + 45;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i45 % 128;
                            if (i45 % 2 != 0) {
                                i22 = (i44 | i) & (~(i & i44));
                                strArr2 = new String[3];
                                strArr2[0] = cls.getName();
                                String[] strArr4 = strArr3[1];
                                strArr2[0] = strArr4[0];
                                strArr2[5] = strArr4[1];
                                c2 = 0;
                                c3 = 2;
                            } else {
                                i22 = (i44 | i) & (~(i & i44));
                                strArr2 = new String[4];
                                c2 = 0;
                                strArr2[0] = cls.getName();
                                String[] strArr5 = strArr3[0];
                                strArr2[1] = strArr5[0];
                                c3 = 2;
                                strArr2[2] = strArr5[1];
                            }
                            strArr2[3] = strArr3[c2][c3];
                            Object[] objArr6 = new Object[4];
                            objArr6[c2] = new int[1];
                            int[] iArr = new int[1];
                            objArr6[1] = iArr;
                            int i46 = f256a;
                            int i47 = ((i46 | 83) << 1) - (i46 ^ 83);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i47 % 128;
                            if (i47 % 2 != 0) {
                                objArr6[2] = new int[1];
                                i23 = 74;
                            } else {
                                objArr6[2] = new int[1];
                                i23 = 16;
                            }
                            ((int[]) objArr6[2])[0] = i;
                            iArr[0] = i22;
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i48 = ~startUptimeMillis;
                            int i49 = 308066652 + (((~((-648152965) | i48)) | (~((-1048601) | startUptimeMillis)) | (~((-407676931) | startUptimeMillis))) * 765) + (((~((-649201565) | i48)) | 648152964) * 1530) + (((~(startUptimeMillis | (-649201565))) | (~(i48 | (-407676931)))) * 765);
                            int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                            f256a = i50 % 128;
                            if (i50 % 2 == 0) {
                                i24 = i49 << i23;
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i25 = (((i24 | (-830)) << 1) - (i24 ^ (-830))) * (832 % i3);
                            } else {
                                int i51 = -(-i23);
                                i24 = (i51 | i49) + (i49 & i51);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i52 = i24 * (-830);
                                int i53 = -(-(i3 * 832));
                                i25 = (i52 | i53) + (i52 & i53);
                            }
                            int i54 = ~i3;
                            int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i56 = i55 + 121;
                            f256a = i56 % 128;
                            int i57 = i56 % 2;
                            int i58 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i59 = ~((i54 & i58) | (i54 ^ i58));
                            int i60 = (i24 ^ i3) | (i24 & i3);
                            int i61 = ~((i60 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i60 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                            int i62 = -(-((-831) * ((i59 & i61) | (i59 ^ i61))));
                            int i63 = ((i25 | i62) << 1) - (i25 ^ i62);
                            int i64 = ~i3;
                            int i65 = (i64 & i24) | (i64 ^ i24);
                            int i66 = -(-((~((i65 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i65 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * (-1662)));
                            int i67 = ((i63 | i66) << 1) - (i66 ^ i63);
                            int i68 = (i55 & 51) + (i55 | 51);
                            f256a = i68 % 128;
                            int i69 = i68 % 2;
                            int i70 = ~i24;
                            int i71 = (~((i24 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i24 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) | (~((i70 & i58) | (i70 ^ i58)));
                            int i72 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i3) | (i3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                            int i73 = -(-(((i71 & i72) | (i71 ^ i72)) * 831));
                            int i74 = (i67 ^ i73) + ((i73 & i67) << 1);
                            int i75 = i74 << 13;
                            int i76 = (i75 | i74) & (~(i74 & i75));
                            int i77 = i76 >>> 17;
                            int i78 = ((~i76) & i77) | ((~i77) & i76);
                            int i79 = i78 << 5;
                            ((int[]) objArr6[0])[0] = ((~i78) & i79) | ((~i79) & i78);
                            objArr6[3] = strArr2;
                            return objArr6;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        StringWriter stringWriter = new StringWriter();
                        try {
                            Object[] objArr7 = {new PrintWriter(stringWriter)};
                            int trimmedLength = TextUtils.getTrimmedLength("");
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i80 = trimmedLength * 677;
                            int i81 = (i80 ^ (-12825)) + ((i80 & (-12825)) << 1);
                            int i82 = (trimmedLength ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (trimmedLength & iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                            int i83 = i81 + (((i82 & (-20)) | (i82 ^ (-20))) * (-676));
                            int i84 = ~(((-20) ^ trimmedLength) | ((-20) & trimmedLength));
                            int i85 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                            int i86 = -(-((i84 | (~((i85 ^ trimmedLength) | (i85 & trimmedLength)))) * 676));
                            int i87 = (i83 ^ i86) + ((i86 & i83) << 1);
                            int i88 = ~((~trimmedLength) | (-20));
                            int i89 = ~(((-20) ^ i85) | (i85 & (-20)));
                            int i90 = (i88 & i89) | (i88 ^ i89);
                            int i91 = (trimmedLength & 19) | (trimmedLength ^ 19);
                            int i92 = ~((i91 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i91 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                            int i93 = -(-(((i92 & i90) | (i90 ^ i92)) * 676));
                            int i94 = (i87 ^ i93) + ((i93 & i87) << 1);
                            Object[] objArr8 = new Object[1];
                            c(new char[]{34714, 43733, 41599, 43405, 37361, 59532, 10116, 36890, 62758, 39292, 33794, 35712, 50266, 40160, 60833, 23399, 4867, 48029, 14415, 5144, 64679, 23540}, i94, objArr8);
                            Class<?> cls4 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            c(new char[]{32468, 47688, 52440, 2636, 45997, 8676, 60305, 45400, 3935, 61142, 9267, 62941, 65216, 28431, 21154, 19738, 58229, 27683}, View.MeasureSpec.getSize(0) + 15, objArr9);
                            cls4.getMethod((String) objArr9[0], PrintWriter.class).invoke(th2, objArr7);
                            string = stringWriter.toString();
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th3;
                        }
                    } catch (Throwable unused) {
                        Object[] objArr10 = new Object[1];
                        c(new char[]{42894, 40280, 64636, 19855}, 0 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr10);
                        string = (String) objArr10[0];
                    }
                    int i95 = ~i;
                    String[] strArr6 = {cls.getName(), string};
                    Object[] objArr11 = new Object[4];
                    objArr11[0] = new int[1];
                    objArr11[1] = new int[]{(i & (-32)) | (i95 & 31)};
                    objArr11[2] = new int[]{i};
                    int i96 = ~(1511596268 | i);
                    int i97 = 673861974 + (((-193435191) | i96) * (-220)) + ((i96 | (-1537193727)) * 220) + 305303980;
                    int i98 = i97 * 371;
                    int i99 = ((5936 | i98) << 1) - (i98 ^ 5936);
                    int i100 = ~((~i97) | i95);
                    int i101 = f256a;
                    int i102 = i101 + 37;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i102 % 128;
                    int i103 = i102 % 2;
                    int i104 = ~((-17) | i);
                    int i105 = -(-((-370) * ((i100 & i104) | (i100 ^ i104))));
                    int i106 = (i99 ^ i105) + ((i105 & i99) << 1);
                    int i107 = ~(((-17) & i95) | ((-17) ^ i95));
                    int i108 = ~i97;
                    int i109 = ~((i & i108) | (i108 ^ i));
                    int i110 = (i109 & i107) | (i107 ^ i109);
                    int i111 = (16 & i97) | (16 ^ i97);
                    int i112 = ~i111;
                    int i113 = i101 + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i113 % 128;
                    if (i113 % 2 != 0) {
                        i20 = (i106 - (((i110 & i112) | (i110 ^ i112)) * (-370))) % (370 >>> i112);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i114 = -i3;
                        i21 = ((-947) - i20) >>> (((i114 | 949) << 1) - (i114 ^ 949));
                    } else {
                        int i115 = ((i110 & i112) | (i110 ^ i112)) * (-370);
                        i20 = (((i106 ^ i115) + ((i115 & i106) << 1)) - (~((~i111) * 370))) - 1;
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i116 = i20 * (-947);
                        int i117 = -(-(i3 * 949));
                        i21 = ((i116 | i117) << 1) - (i116 ^ i117);
                    }
                    int i118 = ~i20;
                    int i119 = ~i3;
                    int i120 = ~((i119 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i119 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                    int i121 = (-948) * ((i118 & i120) | (i118 ^ i120));
                    int i122 = ((i21 | i121) << 1) - (i21 ^ i121);
                    int i123 = (~i20) | i119;
                    int i124 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i125 = -(-((~((i124 & i123) | (i123 ^ i124))) * (-948)));
                    int i126 = (i122 & i125) + (i125 | i122);
                    int i127 = f256a;
                    int i128 = (i127 & 99) + (i127 | 99);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i128 % 128;
                    if (i128 % 2 != 0) {
                        int i129 = (i20 ^ i119) | (i119 & i20);
                        int i130 = i126 * ((i129 & 948) + (i129 | 948));
                        int i131 = i130 * 70;
                        int i132 = (i131 & (~i130)) | ((~i131) & i130);
                        int i133 = i132 ^ (i132 - 86);
                        int i134 = i133 % 3;
                        ((int[]) objArr11[1])[0] = ((~i133) & i134) | ((~i134) & i133);
                        objArr11[4] = strArr6;
                    } else {
                        int i135 = (i126 - (~(-(-((i20 | i119) * 948))))) - 1;
                        int i136 = i135 << 13;
                        int i137 = (i136 | i135) & (~(i135 & i136));
                        int i138 = i137 >>> 17;
                        int i139 = ((~i137) & i138) | ((~i138) & i137);
                        int i140 = i139 << 5;
                        ((int[]) objArr11[0])[0] = ((~i139) & i140) | ((~i140) & i139);
                        objArr11[3] = strArr6;
                    }
                    return objArr11;
                }
            }
            int[] iArr2 = {-1844476378, 1276062274, -797088743, 965014536, -30564408, 800164665, 427080095, -63109426, -2128711273, 443823261, -421827424, -1596256068, -554832609, -49350782, -437871410, 1291703475, -587285223, 1359539528, -706062319, 1866472215};
            String[][] strArr7 = new String[1][];
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i141 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i142 = (i141 & 71) + (i141 | 71);
            f256a = i142 % 128;
            int i143 = i142 % 2;
            int i144 = ((~iCurrentTimeMillis) & 343337308) | ((-343337309) & iCurrentTimeMillis);
            int i145 = (~(i & i144)) & (i | i144);
            int i146 = i141 + 33;
            f256a = i146 % 128;
            try {
                if (i146 % 2 == 0) {
                    Object[] objArr12 = {Integer.valueOf(i145), iArr2, Integer.valueOf(i2), strArr7};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 43043);
                        int i147 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                        int i148 = 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte[] bArr2 = $$a;
                        byte b4 = (byte) (-bArr2[5]);
                        byte b5 = bArr2[7];
                        Object[] objArr13 = new Object[1];
                        d(b4, b5, b5, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(gidForName, i147, i148, 974412207, false, (String) objArr13[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                    }
                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr12)).longValue();
                    long j13 = -1287403685;
                    long j14 = 370;
                    long j15 = -369;
                    strArr = strArr7;
                    long j16 = i;
                    charSequence2 = "";
                    long j17 = -1;
                    long j18 = j16 ^ j17;
                    long j19 = (j13 ^ j17) | j18;
                    long j20 = (j14 * j13) + (j14 * jLongValue2) + ((j13 | jLongValue2 | j18) * j15) + (j15 * (jLongValue2 | (j19 ^ j17))) + (((long) 369) * ((((jLongValue2 ^ j17) | j13) ^ j17) | ((j16 | j13) ^ j17) | ((j19 | jLongValue2) ^ j17))) + ((long) 1391137750);
                    i4 = (int) (j20 >>> 27);
                    i5 = 2047544966 + (((~((-1264541083) | i)) | 1593199802) * (-668)) + (((-1264541083) | (~(1593199802 | i))) * 1336) + (((-17371393) | i) * 668);
                    j = j20;
                } else {
                    strArr = strArr7;
                    Object[] objArr14 = {Integer.valueOf(i145), iArr2, Integer.valueOf(i2), strArr};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-561316232);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char bitsPerPixel = (char) (43041 - ImageFormat.getBitsPerPixel(0));
                        charSequence = "";
                        int iIndexOf = TextUtils.indexOf(charSequence, '0') + 3112;
                        int trimmedLength2 = 22 - TextUtils.getTrimmedLength(charSequence);
                        byte[] bArr3 = $$a;
                        byte b6 = (byte) (-bArr3[5]);
                        byte b7 = bArr3[7];
                        Object[] objArr15 = new Object[1];
                        d(b6, b7, b7, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, iIndexOf, trimmedLength2, 974412207, false, (String) objArr15[0], new Class[]{Integer.TYPE, int[].class, Integer.TYPE, String[][].class});
                    } else {
                        charSequence = "";
                    }
                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr14)).longValue();
                    long j21 = -1529514879;
                    charSequence2 = charSequence;
                    long j22 = i;
                    long j23 = -1;
                    long j24 = j22 ^ j23;
                    long j25 = 521;
                    long j26 = j21 ^ j23;
                    j = ((long) 1633248944) + (((long) 522) * j21) + (((long) (-520)) * jLongValue3) + (((long) (-1042)) * (j21 | ((j24 | jLongValue3) ^ j23))) + ((jLongValue3 | j22) * j25) + (j25 * ((j23 ^ (jLongValue3 | (j24 | j21))) | ((j26 | (jLongValue3 ^ j23)) ^ j23) | ((j26 | j22) ^ j23)));
                    i4 = (int) (j >> 32);
                    int i149 = ~((int) Runtime.getRuntime().totalMemory());
                    i5 = 2107338503 + (((~((-777485217) | i149)) | (-659741195)) * (-983)) + (((~(i149 | (-659741195))) | 16809994) * 983);
                }
                int i150 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                f256a = i150 % 128;
                int i151 = i150 % 2;
                int i152 = i4 & i5;
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i153 = ((int) j) & (594153579 + (((~((-746962977) | elapsedCpuTime)) | (~((~elapsedCpuTime) | 2110777909))) * (-318)) + (((~(763873312 | elapsedCpuTime)) | 1346904597) * (-318)) + (((~(elapsedCpuTime | (-763873313))) | (-2093867574)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i154 = (i153 & i152) | (i152 ^ i153);
                int i155 = ((~i154) & i144) | ((~i144) & i154);
                if (i155 != i) {
                    String[] strArr8 = strArr[0];
                    Object[] objArr16 = new Object[4];
                    int i156 = f256a;
                    int i157 = (i156 ^ 29) + ((i156 & 29) << 1);
                    int i158 = i157 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i158;
                    int i159 = i157 % 2;
                    objArr16[0] = new int[1];
                    objArr16[1] = new int[]{i155};
                    objArr16[2] = new int[]{i};
                    int i160 = i158 + 115;
                    int i161 = i160 % 128;
                    f256a = i161;
                    int i162 = i160 % 2;
                    int i163 = i161 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i163 % 128;
                    int i164 = i163 % 2;
                    int i165 = ((i161 | 37) << 1) - (i161 ^ 37);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i165 % 128;
                    if (i165 % 2 != 0) {
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        int i166 = ~iMaxMemory;
                        i19 = ((((-204384348) + ((947706926 | i166) * (-757))) + ((~((-84083409) | iMaxMemory)) * 1514)) + (((~(iMaxMemory | 1031790334)) | ((~(i166 | (-757324533))) | 673241124)) * 757)) << 16;
                    } else {
                        i19 = 1035049378 + (((~((-639779110) | (~i))) | (~(1065252349 | i))) * (-272)) + (((~((-1064453478) | i)) | 424674368) * (-272)) + (((~(1064453477 | i)) | 640577981) * 272) + 16;
                    }
                    int i167 = -(-i19);
                    int i168 = ((i3 | i167) << 1) - (i167 ^ i3);
                    int i169 = i168 << 13;
                    int i170 = (i169 | i168) & (~(i168 & i169));
                    int i171 = i170 ^ (i170 >>> 17);
                    int i172 = i171 << 5;
                    ((int[]) objArr16[0])[0] = (i171 | i172) & (~(i171 & i172));
                    objArr16[3] = strArr8;
                    return objArr16;
                }
                try {
                    int i173 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr17 = new Object[1];
                    c(new char[]{57036, 63155, 49268, 6069, 23234, 19796, 2014, 59797, 34270, 29408, 48103, 49404, 61507, 35829, 56462, 23286, 41626, 58021, 31167, 43870, 52110, 63545, 51060, 17585, 41094, 37877, 53211, 23439}, (i173 & 26) + (i173 | 26), objArr17);
                    String str = (String) objArr17[0];
                    int i174 = ~i;
                    int i175 = ~(i174 | 1329273689);
                    int i176 = (-163940865) - (~(((i175 & 1077088344) | (1077088344 ^ i175)) * (-970)));
                    int i177 = (i176 ^ (-451948544)) + (((-451948544) & i176) << 1);
                    int i178 = ~i;
                    int i179 = ~((1329273689 & i178) | (i178 ^ 1329273689));
                    int i180 = ((i179 & 252185345) | (252185345 ^ i179)) * 970;
                    int i181 = (i177 & i180) + (i180 | i177);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i182 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i183 = 556785781 | i182;
                    int i184 = ~((i183 & (-168642310)) | (i183 ^ (-168642310)));
                    int i185 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                    int i186 = (i185 & 168642309) | (168642309 ^ i185);
                    int i187 = ((~((i186 & (-556785782)) | (i186 ^ (-556785782)))) | i184) * (-184);
                    int i188 = ((-390645340) ^ i187) + ((i187 & (-390645340)) << 1);
                    int i189 = ~(556785781 | i182);
                    int i190 = (i189 & (-724559734)) | ((-724559734) ^ i189);
                    int i191 = ~((i182 & 168642309) | (168642309 ^ i182));
                    int i192 = i188 + (((i190 & i191) | (i190 ^ i191)) * 184);
                    if (i181 > (i192 ^ (-159777872)) + (((-159777872) & i192) << 1)) {
                        cls2 = Class.forName(str);
                        cArr = new char[]{64644, 43214, 33011, 7197, 52101, 43372, 43863, 55202, 36693, 51432, 49481, 12500, 2907, 61174, 3117, 49142, 38486, 17698, 13468, 43313};
                        i15 = -(ViewConfiguration.getKeyRepeatTimeout() / 110);
                        i16 = 97;
                        i6 = 16;
                    } else {
                        cls2 = Class.forName(str);
                        cArr = new char[]{64644, 43214, 33011, 7197, 52101, 43372, 43863, 55202, 36693, 51432, 49481, 12500, 2907, 61174, 3117, 49142, 38486, 17698, 13468, 43313};
                        i6 = 16;
                        i15 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        i16 = 18;
                    }
                    int i193 = i15 * (-574);
                    int i194 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i195 = i194 + 43;
                    f256a = i195 % 128;
                    if (i195 % 2 == 0) {
                        int i196 = -(-i16);
                        i17 = i193 >> ((i196 & (-574)) + (i196 | (-574)));
                        int i197 = ~i15;
                        i18 = (i174 & i197) | (i197 ^ i174);
                    } else {
                        i17 = i193 + (i16 * (-574));
                        i18 = (~i15) | i178;
                    }
                    int i198 = i16 ^ (-1);
                    int i199 = i17 + (1150 * ((~i18) | (~((i198 & i) | (i198 ^ i)))));
                    int i200 = ~i16;
                    int i201 = ~((i200 & i) | (i200 ^ i));
                    int i202 = ~((i16 & i178) | (i178 ^ i16));
                    int i203 = ((i201 & i202) | (i201 ^ i202)) * (-575);
                    int i204 = (i199 & i203) + (i203 | i199);
                    int i205 = (i194 ^ 13) + ((i194 & 13) << 1);
                    f256a = i205 % 128;
                    int i206 = i205 % 2;
                    int i207 = ~i15;
                    int i208 = ~((i207 & i) | (i207 ^ i));
                    int i209 = ~((i178 & i15) | (i178 ^ i15));
                    int i210 = 575 * ((i208 & i209) | (i208 ^ i209));
                    int i211 = ((i204 | i210) << 1) - (i210 ^ i204);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(cArr, i211, objArr18);
                        if (cls2.getMethod((String) objArr18[0], new Class[0]).invoke(null, null) != null) {
                            int i212 = f256a;
                            int i213 = (i212 ^ 101) + ((i212 & 101) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i213 % 128;
                            int i214 = i213 % 2;
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                CharSequence charSequence3 = charSequence2;
                                char cIndexOf2 = (char) (TextUtils.indexOf(charSequence3, charSequence3) + 22878);
                                int i215 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 593;
                                int iMyPid = (Process.myPid() >> 22) + 17;
                                byte[] bArr4 = $$a;
                                byte b8 = bArr4[7];
                                Object[] objArr19 = new Object[1];
                                d(b8, b8, (byte) (-bArr4[5]), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i215, iMyPid, -1471475267, false, (String) objArr19[0], null);
                            }
                            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null) != 0) {
                                i7 = (~(i & 9)) & (i | 9);
                            }
                            if (i7 != i) {
                                i9 = i6;
                                i8 = 0;
                            } else {
                                i8 = 0;
                                i9 = 0;
                            }
                            String[] strArr9 = new String[i8];
                            objArr = new Object[4];
                            objArr[i8] = new int[1];
                            int i216 = f256a;
                            i10 = (i216 ^ 101) + ((i216 & 101) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                            if (i10 % 2 != 0) {
                                objArr[0] = new int[0];
                                objArr[3] = new int[0];
                                c = 1;
                            } else {
                                c = 1;
                                objArr[1] = new int[1];
                                objArr[2] = new int[1];
                            }
                            ((int[]) objArr[2])[0] = i;
                            ((int[]) objArr[c])[0] = i7;
                            int iMyTid2 = Process.myTid();
                            i11 = (-226833342) + (((~((-832649257) | (~iMyTid2))) | (~(872382202 | iMyTid2))) * (-272)) + (((~((-833174187) | iMyTid2)) | 524930) * (-272)) + (((~(iMyTid2 | 833174186)) | 871857272) * 272);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i217 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i12 = (i217 ^ 83) + ((i217 & 83) << 1);
                            int i218 = i12 % 128;
                            f256a = i218;
                            if (i12 % 2 == 0) {
                                int i219 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i9;
                                i13 = (((-51) >> i9) >>> (53 / i11)) / ((~((i219 & i11) | (i219 ^ i11))) + 52);
                            } else {
                                int i220 = ((i9 * (-51)) - (~(-(-(i11 * 53))))) - 1;
                                int i221 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i222 = (i221 & i9) | (i221 ^ i9);
                                int i223 = (~((i222 & i11) | (i222 ^ i11))) * 52;
                                i13 = ((i220 | i223) << 1) - (i220 ^ i223);
                            }
                            int i224 = ~i11;
                            int i225 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i226 = ~((i224 ^ i225) | (i224 & i225));
                            int i227 = ~((i224 & i9) | (i224 ^ i9));
                            int i228 = (i227 & i226) | (i226 ^ i227);
                            int i229 = ~((i225 & i9) | (i225 ^ i9));
                            int i230 = i13 + ((-52) * ((i228 & i229) | (i228 ^ i229)));
                            int i231 = ~i9;
                            int i232 = -(-(((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i231)) | (~((i11 & i231) | (i231 ^ i11)))) * 52));
                            int i233 = ((i230 | i232) << 1) - (i232 ^ i230);
                            int i234 = (i3 & i233) + (i3 | i233);
                            int i235 = i234 ^ (i234 << 13);
                            int i236 = i235 >>> 17;
                            int i237 = (i235 | i236) & (~(i235 & i236));
                            int i238 = i237 << 5;
                            ((int[]) objArr[0])[0] = ((~i237) & i238) | ((~i238) & i237);
                            objArr[3] = strArr9;
                            i14 = i218 + 23;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i239 = 35 / 0;
                            }
                            return objArr;
                        }
                        int i240 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i241 = i240 + 33;
                        f256a = i241 % 128;
                        int i242 = i241 % 2;
                        int i243 = i240 + 99;
                        f256a = i243 % 128;
                        int i244 = i243 % 2;
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    i6 = 16;
                }
                i7 = i;
                if (i7 != i) {
                    i9 = i6;
                    i8 = 0;
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                String[] strArr10 = new String[i8];
                objArr = new Object[4];
                objArr[i8] = new int[1];
                int i2110 = f256a;
                i10 = (i2110 ^ 101) + ((i2110 & 101) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                if (i10 % 2 != 0) {
                    objArr[0] = new int[0];
                    objArr[3] = new int[0];
                    c = 1;
                } else {
                    c = 1;
                    objArr[1] = new int[1];
                    objArr[2] = new int[1];
                }
                ((int[]) objArr[2])[0] = i;
                ((int[]) objArr[c])[0] = i7;
                int iMyTid3 = Process.myTid();
                i11 = (-226833342) + (((~((-832649257) | (~iMyTid3))) | (~(872382202 | iMyTid3))) * (-272)) + (((~((-833174187) | iMyTid3)) | 524930) * (-272)) + (((~(iMyTid3 | 833174186)) | 871857272) * 272);
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzu.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i2111 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                i12 = (i2111 ^ 83) + ((i2111 & 83) << 1);
                int i2112 = i12 % 128;
                f256a = i2112;
                if (i12 % 2 == 0) {
                    int i2113 = (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i9;
                    i13 = (((-51) >> i9) >>> (53 / i11)) / ((~((i2113 & i11) | (i2113 ^ i11))) + 52);
                } else {
                    int i2210 = ((i9 * (-51)) - (~(-(-(i11 * 53))))) - 1;
                    int i2211 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i2212 = (i2211 & i9) | (i2211 ^ i9);
                    int i2213 = (~((i2212 & i11) | (i2212 ^ i11))) * 52;
                    i13 = ((i2210 | i2213) << 1) - (i2210 ^ i2213);
                }
                int i2214 = ~i11;
                int i2215 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i2216 = ~((i2214 ^ i2215) | (i2214 & i2215));
                int i2217 = ~((i2214 & i9) | (i2214 ^ i9));
                int i2218 = (i2217 & i2216) | (i2216 ^ i2217);
                int i2219 = ~((i2215 & i9) | (i2215 ^ i9));
                int i2310 = i13 + ((-52) * ((i2218 & i2219) | (i2218 ^ i2219)));
                int i2311 = ~i9;
                int i2312 = -(-(((~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i2311)) | (~((i11 & i2311) | (i2311 ^ i11)))) * 52));
                int i2313 = ((i2310 | i2312) << 1) - (i2312 ^ i2310);
                int i2314 = (i3 & i2313) + (i3 | i2313);
                int i2315 = i2314 ^ (i2314 << 13);
                int i2316 = i2315 >>> 17;
                int i2317 = (i2315 | i2316) & (~(i2315 & i2316));
                int i2318 = i2317 << 5;
                ((int[]) objArr[0])[0] = ((~i2317) & i2318) | ((~i2318) & i2317);
                objArr[3] = strArr10;
                i14 = i2112 + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i2319 = 35 / 0;
                }
                return objArr;
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th4;
            }
        }

        private static String $$e(int i, int i2, int i3) {
            int i4 = (i3 * 4) + 108;
            byte[] bArr = $$c;
            int i5 = 3 - (i2 * 3);
            int i6 = i * 4;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            int i8 = -1;
            if (bArr == null) {
                i4 += i7;
            }
            while (true) {
                i8++;
                bArr2[i8] = (byte) i4;
                if (i8 == i7) {
                    return new String(bArr2, 0);
                }
                i5++;
                i4 += bArr[i5];
            }
        }

        static class StubCompat extends IMediaControllerCallback.Stub {
            private final WeakReference<Callback> mCallback;

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
            }

            StubCompat(Callback callback) {
                this.mCallback = new WeakReference<>(callback);
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(11, Boolean.valueOf(z), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onRepeatModeChanged(int i) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(9, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onShuffleModeChanged(int i) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(12, Integer.valueOf(i), null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(4, parcelableVolumeInfo != null ? new PlaybackInfo(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume) : null, null);
                }
            }

            @Override // android.support.v4.media.session.IMediaControllerCallback
            public void onSessionReady() throws RemoteException {
                Callback callback = this.mCallback.get();
                if (callback != null) {
                    callback.postToHandler(13, null, null);
                }
            }
        }

        class MessageHandler extends Handler {
            private static final int MSG_DESTROYED = 8;
            private static final int MSG_EVENT = 1;
            private static final int MSG_SESSION_READY = 13;
            private static final int MSG_UPDATE_CAPTIONING_ENABLED = 11;
            private static final int MSG_UPDATE_EXTRAS = 7;
            private static final int MSG_UPDATE_METADATA = 3;
            private static final int MSG_UPDATE_PLAYBACK_STATE = 2;
            private static final int MSG_UPDATE_QUEUE = 5;
            private static final int MSG_UPDATE_QUEUE_TITLE = 6;
            private static final int MSG_UPDATE_REPEAT_MODE = 9;
            private static final int MSG_UPDATE_SHUFFLE_MODE = 12;
            private static final int MSG_UPDATE_VOLUME = 4;
            boolean mRegistered;

            MessageHandler(Looper looper) {
                super(looper);
                this.mRegistered = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.mRegistered) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.ensureClassLoader(data);
                            Callback.this.onSessionEvent((String) message.obj, data);
                            break;
                        case 2:
                            Callback.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            Callback.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            Callback.this.onAudioInfoChanged((PlaybackInfo) message.obj);
                            break;
                        case 5:
                            Callback.this.onQueueChanged((List) message.obj);
                            break;
                        case 6:
                            Callback.this.onQueueTitleChanged((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.ensureClassLoader(bundle);
                            Callback.this.onExtrasChanged(bundle);
                            break;
                        case 8:
                            Callback.this.onSessionDestroyed();
                            break;
                        case 9:
                            Callback.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            Callback.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            Callback.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            Callback.this.onSessionReady();
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class MediaControllerImplApi24 extends MediaControllerImplApi23 {
        private static final byte[] $$a = {114, -115, 48, 84};
        private static final int $$b = 108;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int asBinder = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722267;
        private static long TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
        private static int b = 1381826873;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 34097;

        private static void c(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i4 = $11 + 15;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8328), Color.green(0) + 1235, 35 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -653973969, false, $$c(b2, (byte) (b2 | 18), b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2763, View.MeasureSpec.getSize(0) + 14, 1504416861, false, $$c(b3, (byte) (b3 | 16), b3), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - View.resolveSize(0, 0)), 252 - TextUtils.lastIndexOf("", '0', 0, 0), 22 - (ViewConfiguration.getFadingEdgeLength() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b4 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65200 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 2892 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 17 - TextUtils.indexOf("", "", 0), 2012627446, false, $$c(b4, (byte) (b4 | 17), b4), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = sessionProcessor.b;
                                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                                int i6 = $10 + 81;
                                $11 = i6 % 128;
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
            int i8 = $11 + 7;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }

        private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - Process.getGidForName("")), 3291 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetBefore("", 0) + 31, 1199271174, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) + 651, 44 - (Process.myTid() >> 22), -450685997, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i3 > 0) {
                int i6 = $10 + 7;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                int i8 = $11 + 69;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $11 + 1;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    try {
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 651 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, -450685997, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
            int i12 = $10 + 91;
            $11 = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public MediaControllerImplApi24(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi23, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public TransportControls getTransportControls() {
            int i = 2 % 2;
            int i2 = asBinder + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object transportControls = MediaControllerCompatApi21.getTransportControls(this.mControllerObj);
            if (transportControls != null) {
                return new TransportControlsApi24(transportControls);
            }
            int i4 = asBinder + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v155, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v107, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v111 */
        /* JADX WARN: Type inference failed for: r8v117, types: [char[]] */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v16, types: [char] */
        /* JADX WARN: Type inference failed for: r8v2, types: [int] */
        /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Class<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r8v33 */
        /* JADX WARN: Type inference failed for: r8v37 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v41, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r8v43 */
        /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v71 */
        /* JADX WARN: Type inference failed for: r8v90, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Class[]] */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2) {
            Object[] objArr;
            char[] cArr;
            char cIndexOf;
            char[] cArr2;
            char[] cArr3;
            int i3;
            int packedPositionChild;
            int iB;
            int i4;
            int iB2;
            int i5;
            int i6;
            int i7;
            int i8 = 2 % 2;
            int i9 = asBinder;
            int i10 = i9 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            int i11 = i10 % 2;
            ?? cls = 4;
            if (context != null) {
                int i12 = i9 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                int i13 = i12 % 2;
                try {
                    int size = View.MeasureSpec.getSize(0);
                    int i14 = (size * 495) - 108460;
                    int i15 = ((size ^ (-221)) | (size & (-221))) * (-988);
                    int i16 = (i14 & i15) + (i14 | i15);
                    int i17 = (~size) | 220;
                    int i18 = ~i;
                    int i19 = (i17 | i18) * 494;
                    int i20 = ((i16 | i19) << 1) - (i19 ^ i16);
                    int i21 = ~((~size) | (-221));
                    int i22 = ~((i18 & 220) | (i18 ^ 220));
                    int i23 = (i22 & i21) | (i21 ^ i22);
                    int i24 = ~(size | 220);
                    Object[] objArr2 = new Object[1];
                    a(true, i20 + (((i24 & i23) | (i23 ^ i24)) * 494), 31 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, new char[]{26, 29, 15, 25, 65516, 65512, 65529, 65518, 65534, 0, 65512, 65518, 65495, 15, 20, 26, 29, 15, 25, 65516, 65512, 65530, 65495, 18, ' ', '\r', 16, 65519, 65483, 15, 20}, objArr2);
                    String str = (String) objArr2[0];
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                    asBinder = i25 % 128;
                    try {
                        try {
                            if (i25 % 2 == 0) {
                                objArr = new Object[]{str};
                                cArr = new char[]{38285, 32955, 34951, 31721};
                                cIndexOf = (char) TextUtils.indexOf("", "");
                                cArr2 = new char[]{0, 0, 0, 0};
                                cArr3 = new char[]{4477, 24051, 57354, 28353, 46280, 22998, 34945, 17124, 3960, 4484, 3923, 9811, 26407, 22676, 27186, 19293, 40698, 60425, 55794, 20890, 12494, 29005, 25626, 49135, 29050, 34606, 60503, 31316, 62778, 52659, 19408, 56902, 12384, 38031, 45610, 7192, 27777, 56881};
                                i3 = 0;
                            } else {
                                objArr = new Object[]{str};
                                char[] cArr4 = {4477, 24051, 57354, 28353, 46280, 22998, 34945, 17124, 3960, 4484, 3923, 9811, 26407, 22676, 27186, 19293, 40698, 60425, 55794, 20890, 12494, 29005, 25626, 49135, 29050, 34606, 60503, 31316, 62778, 52659, 19408, 56902, 12384, 38031, 45610, 7192, 27777, 56881};
                                char[] cArr5 = {0, 0, 0, 0};
                                cArr = new char[]{38285, 32955, 34951, 31721};
                                cIndexOf = (char) TextUtils.indexOf("", "");
                                cArr2 = cArr5;
                                cArr3 = cArr4;
                                i3 = 1;
                            }
                            int i26 = asBinder;
                            int i27 = ((i26 | 97) << 1) - (i26 ^ 97);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                            if (i27 % 2 != 0) {
                                packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                iB = zznv.b();
                                i4 = 471 % packedPositionChild;
                            } else {
                                packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                iB = zznv.b();
                                i4 = packedPositionChild * 471;
                            }
                            int i28 = -(-(471 * i3));
                            int i29 = ((i4 | i28) << 1) - (i4 ^ i28);
                            int i30 = (packedPositionChild | i3) * (-470);
                            int i31 = (i29 & i30) + (i29 | i30);
                            int i32 = ~packedPositionChild;
                            int i33 = ~i3;
                            int i34 = i32 | i33;
                            int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i36 = (i35 & 125) + (i35 | 125);
                            asBinder = i36 % 128;
                            if (i36 % 2 != 0) {
                                int i37 = ~i34;
                                int i38 = ~(i33 | iB);
                                int i39 = (i37 & i38) | (i37 ^ i38);
                                int i40 = ~iB;
                                int i41 = ~((i40 & packedPositionChild) | (i40 ^ packedPositionChild) | i3);
                                int i42 = -(-((-470) * ((i39 & i41) | (i39 ^ i41))));
                                int i43 = ((i31 | i42) << 1) - (i31 ^ i42);
                                int i44 = ~i3;
                                int i45 = (i44 & packedPositionChild) | (i44 ^ packedPositionChild);
                                int i46 = ~((i45 & iB) | (i45 ^ iB));
                                int i47 = ~iB;
                                int i48 = (i43 - (~(-(-((i46 | (~(i3 | ((packedPositionChild & i47) | (i47 ^ packedPositionChild))))) * 470))))) - 1;
                                try {
                                    Object[] objArr3 = new Object[1];
                                    c(cArr3, cArr2, cIndexOf, cArr, i48, objArr3);
                                    Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr);
                                    try {
                                        int i49 = -(-TextUtils.indexOf((CharSequence) "", '0', 0));
                                        Object[] objArr4 = new Object[1];
                                        cls = (char) ((i49 ^ 128) + ((i49 & 128) << 1));
                                        c(new char[]{24923, 17432, 52129, 18842, 4896, 32598, 37581, 28867, 57048, 24064, 45056, 64462, 47720, 33728, 47585, 7970, 18353, 10593, 62113, 15883, 19930, 59288, 20023, 48868, 34976, 49725, 58711, 28641, 38000, 15338, 4947}, new char[]{0, 0, 0, 0}, cls, new char[]{6152, 12576, 32748, 32768}, (-332324841) - (~(-(-TextUtils.indexOf("", "")))), objArr4);
                                        try {
                                            Object[] objArr5 = {(String) objArr4[0]};
                                            Object[] objArr6 = new Object[1];
                                            c(new char[]{4477, 24051, 57354, 28353, 46280, 22998, 34945, 17124, 3960, 4484, 3923, 9811, 26407, 22676, 27186, 19293, 40698, 60425, 55794, 20890, 12494, 29005, 25626, 49135, 29050, 34606, 60503, 31316, 62778, 52659, 19408, 56902, 12384, 38031, 45610, 7192, 27777, 56881}, new char[]{0, 0, 0, 0}, (char) TextUtils.indexOf("", "", 0, 0), new char[]{38285, 32955, 34951, 31721}, Color.alpha(0), objArr6);
                                            ?? cls2 = Class.forName((String) objArr6[0]);
                                            ?? r9 = new Class[1];
                                            cls = String.class;
                                            int i50 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i51 = (i50 & 11) + (i50 | 11);
                                            asBinder = i51 % 128;
                                            int i52 = i51 % 2;
                                            r9[0] = cls;
                                            Object objNewInstance2 = cls2.getDeclaredConstructor(r9).newInstance(objArr5);
                                            try {
                                                int i53 = -TextUtils.getOffsetBefore("", 0);
                                                int i54 = ((i53 | 1262209714) << 1) - (i53 ^ 1262209714);
                                                Object[] objArr7 = new Object[1];
                                                c(new char[]{54568, 2546, 52993, 25549, 20656, 38543, 31986, 63946, 20174, 54242, 13406, 18803, 22264, 54867, 33119, 42020, 34138, 28347, 31943, 51642, 8751, 59718, 61204}, new char[]{0, 0, 0, 0}, (char) ((-2) - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))), new char[]{45642, 15306, 27211, 14965}, i54, objArr7);
                                                Class<?> cls3 = Class.forName((String) objArr7[0]);
                                                int i55 = -AndroidCharacter.getMirror('0');
                                                Object[] objArr8 = new Object[1];
                                                c(new char[]{17517, 8162, 815, 30973, 59868, 12639, 30707, 2195, 61471, 39507, 40000, 29107, 59705, 37196, 301, 57956, 24683}, new char[]{0, 0, 0, 0}, (char) ((i55 & 51) + (i55 | 51)), new char[]{38662, 14963, 1014, 53760}, View.MeasureSpec.getMode(0) - 163941481, objArr8);
                                                cls = 0;
                                                Object objInvoke = cls3.getMethod((String) objArr8[0], null).invoke(context, null);
                                                int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                int i57 = (i56 & 99) + (i56 | 99);
                                                asBinder = i57 % 128;
                                                int i58 = i57 % 2;
                                                cls = 23;
                                                try {
                                                    int i59 = -(-TextUtils.indexOf("", "", 0));
                                                    Object[] objArr9 = new Object[1];
                                                    c(new char[]{54568, 2546, 52993, 25549, 20656, 38543, 31986, 63946, 20174, 54242, 13406, 18803, 22264, 54867, 33119, 42020, 34138, 28347, 31943, 51642, 8751, 59718, 61204}, new char[]{0, 0, 0, 0}, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{45642, 15306, 27211, 14965}, (i59 & 1262209714) + (i59 | 1262209714), objArr9);
                                                    cls = Class.forName((String) objArr9[0]);
                                                    int i60 = -View.resolveSize(0, 0);
                                                    int iB3 = zznv.b();
                                                    int i61 = (i60 * (-501)) + 25234001;
                                                    int i62 = -(-(((~((i60 ^ 50167) | (i60 & 50167))) | (~(((-50168) ^ iB3) | ((-50168) & iB3)))) * (-502)));
                                                    int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                                                    int i64 = ~iB3;
                                                    int i65 = ((-50168) & i64) | ((-50168) ^ i64);
                                                    int i66 = (~((i65 & i60) | (i65 ^ i60))) * (-502);
                                                    int i67 = (i63 ^ i66) + ((i66 & i63) << 1);
                                                    int i68 = ~i60;
                                                    int i69 = -(-(((-50168) | (~((i68 & iB3) | (i68 ^ iB3)))) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                    int i70 = -Process.getGidForName("");
                                                    int i71 = ~i70;
                                                    int i72 = ~((~i71) | i71);
                                                    int i73 = ~i70;
                                                    int i74 = (i72 ^ i73) | (i72 & i73);
                                                    int i75 = ~((i70 ^ i) | (i70 & i));
                                                    int i76 = (i70 * 659) + 657 + (((i74 ^ i75) | (i74 & i75)) * (-658));
                                                    int i77 = (~i70) * 658;
                                                    int i78 = (i76 & i77) + (i77 | i76);
                                                    int i79 = ((~(i70 | i)) | i73) * 658;
                                                    int i80 = (i78 & i79) + (i79 | i78);
                                                    Object[] objArr10 = new Object[1];
                                                    c(new char[]{61644, 61960, 35151, 41136, 37754, 43191, 40027, 37903, 57782, 55489, 28398, 24292, 39102, 22339}, new char[]{0, 0, 0, 0}, (char) (((i67 | i69) << 1) - (i69 ^ i67)), new char[]{10365, 25902, 63427, 3523}, i80, objArr10);
                                                    Object objInvoke2 = cls.getMethod((String) objArr10[0], null).invoke(context, null);
                                                    int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                    cls = 17;
                                                    int i82 = ((i81 | 17) << 1) - (i81 ^ 17);
                                                    asBinder = i82 % 128;
                                                    int i83 = i82 % 2;
                                                    try {
                                                        Object[] objArr11 = {objInvoke2, 64};
                                                        char[] cArr6 = {5092, 17866, 42479, 54222, 4803, 54447, 61245, 27585, 3983, 36496, 49304, 44190, 23917, 27338, 39362, 43233, 27008, 10358, 51843, 36719, 54501, 17852, 11936, 4168, 36366, 9997, 47117, 22293, 13986, 55647, 59522, 2402, 59368};
                                                        char[] cArr7 = {0, 0, 0, 0};
                                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                        char[] cArr8 = {43282, 19272, 4897, 41101};
                                                        int i84 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i85 = (i84 * (-317)) + 2093976215;
                                                        int i86 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                                                        asBinder = i86 % 128;
                                                        int i87 = i86 % 2;
                                                        int i88 = ~i84;
                                                        int i89 = (i88 & (-558581930)) | (i88 ^ (-558581930));
                                                        int i90 = ~((i89 & i) | (i89 ^ i));
                                                        int i91 = (i18 ^ i84) | (i18 & i84);
                                                        int i92 = ~((i91 ^ 558581929) | (i91 & 558581929));
                                                        int i93 = -(-(((i90 & i92) | (i90 ^ i92)) * (-318)));
                                                        int i94 = (i85 & i93) + (i85 | i93);
                                                        int i95 = ~(((-558581930) ^ i84) | ((-558581930) & i84));
                                                        int i96 = ~(i84 | i);
                                                        int i97 = (i94 - (~(-(-(((i95 & i96) | (i95 ^ i96)) * (-318)))))) - 1;
                                                        int i98 = ~i84;
                                                        int i99 = -(-(((~((i98 & i) | (i98 ^ i))) | (-558581930)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                                        int i100 = ((i97 | i99) << 1) - (i99 ^ i97);
                                                        Object[] objArr12 = new Object[1];
                                                        c(cArr6, cArr7, cCombineMeasuredStates, cArr8, i100, objArr12);
                                                        Class<?> cls4 = Class.forName((String) objArr12[0]);
                                                        int i101 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                        int capsMode = TextUtils.getCapsMode("", 0, 0);
                                                        Object[] objArr13 = new Object[1];
                                                        a(true, (i101 & 235) + (i101 | 235), ((capsMode & 14) << 1) + (capsMode ^ 14), (ViewConfiguration.getScrollBarSize() >> 8) + 5, new char[]{65533, 65516, 16, 1, 3, 11, 2, '\n', 65509, 1, 3, 65533, 7, 65535}, objArr13);
                                                        cls = (String) objArr13[0];
                                                        Object objInvoke3 = cls4.getMethod(cls, String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                                        int deadChar = KeyEvent.getDeadChar(0, 0);
                                                        int iB4 = zznv.b();
                                                        int i102 = deadChar * (-419);
                                                        int i103 = ((((i102 | 25580802) << 1) - (i102 ^ 25580802)) - (~(-(-((~(iB4 | 60762)) * TypedValues.CycleType.TYPE_EASING))))) - 1;
                                                        int i104 = ~deadChar;
                                                        int i105 = ((i104 & 60762) | (i104 ^ 60762)) * (-420);
                                                        int i106 = ~deadChar;
                                                        int i107 = ~((i106 & (-60763)) | (i106 ^ (-60763)));
                                                        int i108 = ~iB4;
                                                        int i109 = ~((i108 & 60762) | (i108 ^ 60762));
                                                        int i110 = i107 ^ i109;
                                                        Object[] objArr14 = new Object[1];
                                                        c(new char[]{20139, 1634, 47608, 45144, 36130, 63854, 43040, 22466, 61411, 63362, 49622, 53056, 1158, 14463, 10703, 12646, 49901, 44667, 54723, 46211, 45505, 18702, 42695, 19634, 25947, 60513, 37962, 503, 49550, 21037}, new char[]{0, 0, 0, 0}, (char) ((i103 ^ i105) + ((i103 & i105) << 1) + (((i109 & i107) | i110) * TypedValues.CycleType.TYPE_EASING)), new char[]{40832, 53738, 23147, 12781}, View.MeasureSpec.getMode(0), objArr14);
                                                        Class<?> cls5 = Class.forName((String) objArr14[0]);
                                                        int i111 = 243 - (~Drawable.resolveOpacity(0, 0));
                                                        int iMyTid = Process.myTid() >> 22;
                                                        int i112 = iMyTid * (-300);
                                                        int i113 = (((i112 | 3020) << 1) - (i112 ^ 3020)) + ((~((iMyTid ^ 10) | (iMyTid & 10) | i)) * (-301));
                                                        int i114 = ~(((-11) ^ i) | ((-11) & i));
                                                        int i115 = ~i;
                                                        int i116 = ~(i115 | iMyTid);
                                                        int i117 = ((i114 & i116) | (i114 ^ i116)) * (-301);
                                                        int i118 = ~iMyTid;
                                                        int i119 = ~((i118 & i) | (i118 ^ i));
                                                        int i120 = (((i113 | i117) << 1) - (i113 ^ i117)) + (((i119 & (-11)) | ((-11) ^ i119)) * 301);
                                                        int threadPriority = Process.getThreadPriority(0);
                                                        int i121 = asBinder;
                                                        int i122 = (i121 & 87) + (i121 | 87);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i122 % 128;
                                                        int i123 = i122 % 2;
                                                        int i124 = -(((threadPriority & 20) + (threadPriority | 20)) >> 6);
                                                        int iB5 = zznv.b();
                                                        int i125 = (i124 * (-711)) + 7130;
                                                        int i126 = ~(((-11) ^ i124) | ((-11) & i124));
                                                        int i127 = ~iB5;
                                                        int i128 = ((~((i127 ^ i124) | (i127 & i124))) | i126) * (-712);
                                                        int i129 = ((i125 | i128) << 1) - (i125 ^ i128);
                                                        int i130 = ~iB5;
                                                        int i131 = ((-11) ^ i130) | ((-11) & i130);
                                                        int i132 = ~((i131 ^ i124) | (i131 & i124));
                                                        int i133 = (i124 ^ 10) | (i124 & 10);
                                                        int i134 = ~((i133 ^ iB5) | (i133 & iB5));
                                                        int i135 = -(-(((i132 ^ i134) | (i134 & i132)) * (-712)));
                                                        int i136 = (i129 & i135) + (i135 | i129);
                                                        int i137 = ~(i124 | i130);
                                                        int i138 = ((i137 & (-11)) | ((-11) ^ i137)) * 712;
                                                        Object[] objArr15 = new Object[1];
                                                        a(true, i111, i120, (i136 ^ i138) + ((i138 & i136) << 1), new char[]{6, 65528, 5, '\b', 7, 65524, 1, 65530, 65532, 6}, objArr15);
                                                        Object[] objArr16 = (Object[]) cls5.getField((String) objArr15[0]).get(objInvoke3);
                                                        int length = objArr16.length;
                                                        int i139 = 0;
                                                        while (true) {
                                                            if (i139 < length) {
                                                                Object obj = objArr16[i139];
                                                                int i140 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int i141 = ((i140 | 193) << 1) - (i140 ^ 193);
                                                                int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                int i142 = asBinder + 23;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i142 % 128;
                                                                if (i142 % 2 != 0) {
                                                                    iB2 = zznv.b();
                                                                    i5 = ((-300) % windowTouchSlop) << 307;
                                                                } else {
                                                                    iB2 = zznv.b();
                                                                    i5 = (windowTouchSlop * (-300)) + 1510;
                                                                }
                                                                int i143 = (windowTouchSlop ^ 5) | (windowTouchSlop & 5);
                                                                int i144 = ((i5 + ((-301) * (~((i143 & iB2) | (i143 ^ iB2))))) - (~(-(-(((~(((-6) & iB2) | ((-6) ^ iB2))) | (~((~iB2) | windowTouchSlop))) * (-301)))))) - 1;
                                                                int i145 = ~windowTouchSlop;
                                                                int i146 = ~((i145 & iB2) | (i145 ^ iB2));
                                                                int i147 = ((i146 & (-6)) | ((-6) ^ i146)) * 301;
                                                                int i148 = ((i144 | i147) << 1) - (i147 ^ i144);
                                                                int iResolveSize = View.resolveSize(0, 0);
                                                                int iB6 = zznv.b();
                                                                int i149 = ~(((-2) ^ iB6) | ((-2) & iB6));
                                                                int i150 = ~iB6;
                                                                int i151 = (i150 ^ iResolveSize) | (i150 & iResolveSize);
                                                                int i152 = (iResolveSize * (-405)) + 407 + ((i149 | (~((i151 ^ 1) | (i151 & 1)))) * (-406));
                                                                int i153 = asBinder;
                                                                int i154 = ((i153 | 79) << 1) - (i153 ^ 79);
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i154 % 128;
                                                                if (i154 % 2 != 0) {
                                                                    int i155 = ~iB6;
                                                                    int i156 = (i155 & (-2)) | ((-2) ^ i155);
                                                                    int i157 = -(~((i156 & iResolveSize) | (i156 ^ iResolveSize)));
                                                                    i6 = i152 >> ((i157 ^ (-406)) + ((i157 & (-406)) << 1));
                                                                } else {
                                                                    int i158 = ((-2) & i150) | ((-2) ^ i150);
                                                                    i6 = (i152 - (~((~((i158 & iResolveSize) | (i158 ^ iResolveSize))) * (-406)))) - 1;
                                                                }
                                                                int i159 = i6 + (406 * (((iB6 | (~iResolveSize)) ^ (-1)) | (~((i150 ^ 1) | (i150 & 1)))));
                                                                cls = 5;
                                                                Object[] objArr17 = new Object[1];
                                                                a(false, i141, i148, i159, new char[]{65535, 30, 65524, 65531, 65526}, objArr17);
                                                                String str2 = (String) objArr17[0];
                                                                int i160 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                int i161 = (i160 & 1) + (i160 | 1);
                                                                asBinder = i161 % 128;
                                                                int i162 = i161 % 2;
                                                                try {
                                                                    Object[] objArr18 = {str2};
                                                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                                                    int iB7 = zznv.b();
                                                                    int i163 = bitsPerPixel * (-159);
                                                                    int i164 = ((i163 | (-159)) << 1) - (i163 ^ (-159));
                                                                    int i165 = ~bitsPerPixel;
                                                                    int i166 = -(-(((i165 ^ 1) | (i165 & 1)) * 160));
                                                                    int i167 = (i164 & i166) + (i164 | i166);
                                                                    int i168 = ~iB7;
                                                                    int i169 = -(-(((~((i168 ^ bitsPerPixel) | (i168 & bitsPerPixel))) | (~((bitsPerPixel ^ 1) | (bitsPerPixel & 1)))) * (-160)));
                                                                    int i170 = ~(i168 | (-2));
                                                                    Object[] objArr19 = new Object[1];
                                                                    c(new char[]{13845, 8619, 14058, 48159, 54341, 21795, 58248, 51608, 9726, 5436, 20886, 64662, 35764, 62736, 25435, 23130, 56365, 55190, 17553, 23244, 45388, 60648, 9954, 7723, 45735, 11448, 55980, 48430, 41613, 50080, 17739, 41945, 15885, 50344, 62255, 53754, 3764}, new char[]{0, 0, 0, 0}, (char) ((((i167 | i169) << 1) - (i167 ^ i169)) + (((i170 & bitsPerPixel) | (bitsPerPixel ^ i170)) * 160)), new char[]{55204, 30052, 47957, 45475}, 1433756886 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr19);
                                                                    Class<?> cls6 = Class.forName((String) objArr19[0]);
                                                                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                                                                    zznv.b();
                                                                    int i171 = 236 - (~(-bitsPerPixel2));
                                                                    int i172 = -((byte) KeyEvent.getModifierMetaStateMask());
                                                                    int i173 = 1057 - (~(i172 * 530));
                                                                    int i174 = (i173 & 5300) + (i173 | 5300);
                                                                    int i175 = ~((i115 ^ i172) | (i115 & i172));
                                                                    int i176 = ~(i172 | 10);
                                                                    int i177 = i174 + (((i175 ^ i176) | (i175 & i176)) * 529);
                                                                    int i178 = ~((i172 & i) | (i172 ^ i));
                                                                    int i179 = -(-(((i178 & (-11)) | ((-11) ^ i178)) * 529));
                                                                    int i180 = (i177 & i179) + (i179 | i177);
                                                                    int i181 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                    Object[] objArr20 = new Object[1];
                                                                    a(true, i171, i180, ((i181 | 11) << 1) - (i181 ^ 11), new char[]{65534, 65532, 7, 65530, '\r', '\f', 7, 65506, '\r', 65534, 0}, objArr20);
                                                                    cls = cls6.getMethod((String) objArr20[0], String.class).invoke(null, objArr18);
                                                                    try {
                                                                        int iMyTid2 = Process.myTid() >> 22;
                                                                        Object[] objArr21 = objArr16;
                                                                        Object[] objArr22 = new Object[1];
                                                                        c(new char[]{63100, 43151, 57094, 27535, 46250, 3970, 46130, 47568, 28455, 14913, 52959, 7353, 56860, 1730, 53445, 44101, 36110, 53044, 30253, 53666, 34704, 13062, 33157, 45525, 46983, 56044, 29654, 61872}, new char[]{0, 0, 0, 0}, (char) ((iMyTid2 & 19904) + (iMyTid2 | 19904)), new char[]{45169, 65176, 49168, 53069}, 0 - (~(-(-TextUtils.lastIndexOf("", '0')))), objArr22);
                                                                        Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                                        int i182 = length;
                                                                        Object[] objArr23 = new Object[1];
                                                                        c(new char[]{22094, 55525, 16928, 58455, 48748, 36646, 4746, 44177, 1159, 62019, 6235}, new char[]{0, 0, 0, 0}, (char) KeyEvent.getDeadChar(0, 0), new char[]{14760, 2552, 15010, 37928}, KeyEvent.keyCodeFromString("") - 1576404935, objArr23);
                                                                        try {
                                                                            Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr23[0], null).invoke(obj, null))};
                                                                            int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                                                                            int i183 = (edgeSlop ^ 1433756887) + ((edgeSlop & 1433756887) << 1);
                                                                            Object[] objArr25 = new Object[1];
                                                                            c(new char[]{13845, 8619, 14058, 48159, 54341, 21795, 58248, 51608, 9726, 5436, 20886, 64662, 35764, 62736, 25435, 23130, 56365, 55190, 17553, 23244, 45388, 60648, 9954, 7723, 45735, 11448, 55980, 48430, 41613, 50080, 17739, 41945, 15885, 50344, 62255, 53754, 3764}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{55204, 30052, 47957, 45475}, i183, objArr25);
                                                                            Class<?> cls8 = Class.forName((String) objArr25[0]);
                                                                            int i184 = -TextUtils.lastIndexOf("", '0', 0);
                                                                            int iB8 = zznv.b();
                                                                            int i185 = i184 * (-1335);
                                                                            int i186 = (i185 ^ (-158079)) + ((i185 & (-158079)) << 1);
                                                                            int i187 = -(-(((~((i184 ^ iB8) | (i184 & iB8))) | (-238)) * (-668)));
                                                                            int i188 = (i186 ^ i187) + ((i187 & i186) << 1);
                                                                            int i189 = ~(((-238) & iB8) | ((-238) ^ iB8));
                                                                            int i190 = i188 + (((i189 & i184) | (i184 ^ i189)) * 1336);
                                                                            int i191 = i184 | iB8;
                                                                            int i192 = i190 + (((i191 & (-238)) | (i191 ^ (-238))) * 668);
                                                                            int i193 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                            int iB9 = zznv.b();
                                                                            int i194 = i193 * (-167);
                                                                            int i195 = ((i194 | (-3173)) << 1) - (i194 ^ (-3173));
                                                                            int i196 = ~i193;
                                                                            int i197 = ~((i196 ^ (-20)) | (i196 & (-20)));
                                                                            int i198 = ~iB9;
                                                                            int i199 = ~(((-20) ^ i198) | ((-20) & i198));
                                                                            int i200 = i195 + (((i197 ^ i199) | (i197 & i199)) * 168);
                                                                            int i201 = ~i193;
                                                                            int i202 = i201 | (-20);
                                                                            int i203 = (i200 - (~((~((i202 ^ iB9) | (i202 & iB9))) * 168))) - 1;
                                                                            int i204 = (~((i196 & i198) | (i196 ^ i198))) | (~(i201 | 19));
                                                                            int i205 = (i193 & (-20)) | ((-20) ^ i193);
                                                                            int i206 = ~((i205 & iB9) | (i205 ^ iB9));
                                                                            int i207 = i203 + (((i206 & i204) | (i204 ^ i206)) * 168);
                                                                            int size2 = View.MeasureSpec.getSize(0);
                                                                            int iB10 = zznv.b();
                                                                            int i208 = size2 * (-1975);
                                                                            int i209 = (i208 & 14835) + (i208 | 14835);
                                                                            int i210 = ~size2;
                                                                            int i211 = (i210 & 15) | (i210 ^ 15);
                                                                            int i212 = ~i211;
                                                                            int i213 = i209 + (((i212 & iB10) | (iB10 ^ i212)) * 988);
                                                                            int i214 = ~(((-16) & size2) | ((-16) ^ size2));
                                                                            int i215 = ~iB10;
                                                                            int i216 = ~(size2 | i215);
                                                                            int i217 = i213 + (((i216 & i214) | (i214 ^ i216)) * (-1976));
                                                                            int i218 = (~((iB10 & (-16)) | ((-16) ^ iB10))) | (~i211);
                                                                            int i219 = ~((i215 ^ 15) | (i215 & 15));
                                                                            Object[] objArr26 = new Object[1];
                                                                            a(true, i192, i207, i217 + (((i218 & i219) | (i218 ^ i219)) * 988), new char[]{2, 65535, 2, '\r', 11, 65534, 65500, 65534, '\r', 65530, 11, 65534, 7, 65534, 0, 65534, '\r', 65530, 65532}, objArr26);
                                                                            Object objInvoke4 = cls8.getMethod((String) objArr26[0], InputStream.class).invoke(cls, objArr24);
                                                                            int i220 = asBinder + 93;
                                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i220 % 128;
                                                                            int i221 = i220 % 2;
                                                                            try {
                                                                                Object[] objArr27 = new Object[1];
                                                                                c(new char[]{42807, 49128, 65043, 25532, 53841, 24835, 19893, 33120, 37024, 42938, 31884, 22649, 40108, 60480, 33500, 43499, 47729, 50298, 57994, '}', 12729, 49307, 38168, 40530, 63494, 3412, 4629, 64937, 745, 11475, 15443, 17291, 6716, 8284}, new char[]{0, 0, 0, 0}, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{5775, 31177, 45101, 36900}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr27);
                                                                                Class<?> cls9 = Class.forName((String) objArr27[0]);
                                                                                int iIndexOf = TextUtils.indexOf("", "");
                                                                                int i222 = ~iIndexOf;
                                                                                int i223 = iIndexOf | (-1990264077);
                                                                                int i224 = ((iIndexOf * (-755)) - 589175465) + ((~((i222 ^ 1990264076) | (1990264076 & i222))) * 1512) + (((~((i222 ^ 1990264076) | (i222 & 1990264076))) | (~((i223 ^ i) | (i223 & i)))) * (-756));
                                                                                int i225 = (iIndexOf & (-1990264077)) | (iIndexOf ^ (-1990264077));
                                                                                int i226 = -(-(((i225 & i18) | (i225 ^ i18)) * 756));
                                                                                int i227 = ((i224 | i226) << 1) - (i226 ^ i224);
                                                                                Object[] objArr28 = new Object[1];
                                                                                c(new char[]{53280, 36730, 51434, 58959, 17115, 57197, 35578, 14481, 37728, 5305, 9923, 38553, 25629, 40909, 10708, 64941, 42248, 25941, 31393, 58545, 46388, 18436, 15431}, new char[]{0, 0, 0, 0}, (char) TextUtils.indexOf("", "", 0), new char[]{62425, 24314, 55177, 53583}, i227, objArr28);
                                                                                cls = (String) objArr28[0];
                                                                                if (!objNewInstance.equals(cls9.getMethod(cls, null).invoke(objInvoke4, null))) {
                                                                                    int i228 = asBinder;
                                                                                    int i229 = (i228 & 9) + (i228 | 9);
                                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i229 % 128;
                                                                                    cls = 2;
                                                                                    int i230 = i229 % 2;
                                                                                    int i231 = ((i228 | 95) << 1) - (i228 ^ 95);
                                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i231 % 128;
                                                                                    int i232 = i231 % 2;
                                                                                    try {
                                                                                        Object[] objArr29 = new Object[1];
                                                                                        c(new char[]{42807, 49128, 65043, 25532, 53841, 24835, 19893, 33120, 37024, 42938, 31884, 22649, 40108, 60480, 33500, 43499, 47729, 50298, 57994, '}', 12729, 49307, 38168, 40530, 63494, 3412, 4629, 64937, 745, 11475, 15443, 17291, 6716, 8284}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{5775, 31177, 45101, 36900}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr29);
                                                                                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                                                                                        cls = new char[]{53280, 36730, 51434, 58959, 17115, 57197, 35578, 14481, 37728, 5305, 9923, 38553, 25629, 40909, 10708, 64941, 42248, 25941, 31393, 58545, 46388, 18436, 15431};
                                                                                        int i233 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                                                                                        int iB11 = zznv.b();
                                                                                        int i234 = i233 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                                                                        int i235 = (i234 & (-503)) + (i234 | (-503));
                                                                                        int i236 = ~i233;
                                                                                        int i237 = i236 | i233;
                                                                                        int i238 = i235 + (i237 * (-502));
                                                                                        Object obj2 = objNewInstance;
                                                                                        int i239 = (~((~iB11) | (~i233))) | (~i236);
                                                                                        int i240 = (i237 & iB11) | (i237 ^ iB11);
                                                                                        int i241 = ~i240;
                                                                                        int i242 = (i238 - (~(((i239 & i241) | (i239 ^ i241)) * (-502)))) - 1;
                                                                                        int i243 = (~iB11) | i236;
                                                                                        int i244 = ~(i243 | (~i243));
                                                                                        int i245 = ~i240;
                                                                                        int i246 = -(-(((i244 & i245) | (i244 ^ i245)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                                                        Object[] objArr30 = new Object[1];
                                                                                        c(cls, new char[]{0, 0, 0, 0}, (char) ((i242 & i246) + (i246 | i242)), new char[]{62425, 24314, 55177, 53583}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1990264077, objArr30);
                                                                                        if (!objNewInstance2.equals(cls10.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                                            i139 = (i139 & 1) + (i139 | 1);
                                                                                            objArr16 = objArr21;
                                                                                            length = i182;
                                                                                            objNewInstance = obj2;
                                                                                        }
                                                                                    } catch (Throwable th) {
                                                                                        Throwable cause = th.getCause();
                                                                                        if (cause != null) {
                                                                                            throw cause;
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                int i247 = (~(i & 1)) & (i | 1);
                                                                                Object[] objArr31 = new Object[4];
                                                                                int[] iArr = new int[1];
                                                                                objArr31[0] = iArr;
                                                                                objArr31[1] = new int[1];
                                                                                int i248 = asBinder;
                                                                                int i249 = (i248 ^ 11) + ((i248 & 11) << 1);
                                                                                int i250 = i249 % 128;
                                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i250;
                                                                                if (i249 % 2 != 0) {
                                                                                    objArr31[2] = new int[1];
                                                                                    i7 = 31;
                                                                                } else {
                                                                                    objArr31[2] = new int[1];
                                                                                    i7 = 16;
                                                                                }
                                                                                iArr[0] = i;
                                                                                ((int[]) objArr31[2])[0] = i247;
                                                                                objArr31[3] = null;
                                                                                int i251 = (((-942559356) + (((~(i18 | (-29624978))) | 69935206) * (-828))) + (((-29624978) | i18) * (-828))) - 1240322820;
                                                                                int i252 = -(-i7);
                                                                                int i253 = ((i251 | i252) << 1) - (i252 ^ i251);
                                                                                int i254 = ((i250 | 45) << 1) - (i250 ^ 45);
                                                                                asBinder = i254 % 128;
                                                                                int i255 = i254 % 2;
                                                                                int iB12 = zznv.b();
                                                                                int i256 = i253 * 673;
                                                                                int i257 = -(-(i2 * (-1343)));
                                                                                int i258 = (i256 ^ i257) + ((i256 & i257) << 1);
                                                                                int i259 = -(-(((~((i253 ^ iB12) | (i253 & iB12))) | i2) * 672));
                                                                                int i260 = ((i258 | i259) << 1) - (i259 ^ i258);
                                                                                int i261 = ~((~i253) | (~iB12));
                                                                                int i262 = ~((i2 ^ iB12) | (i2 & iB12));
                                                                                int i263 = ((i261 & i262) | (i261 ^ i262)) * (-672);
                                                                                int i264 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                                int i265 = (i264 ^ 47) + ((i264 & 47) << 1);
                                                                                asBinder = i265 % 128;
                                                                                int i266 = i265 % 2;
                                                                                int i267 = -(-i263);
                                                                                int i268 = (i260 & i267) + (i267 | i260);
                                                                                int i269 = ~i2;
                                                                                int i270 = ~iB12;
                                                                                int i271 = ~((i270 & i269) | (i269 ^ i270));
                                                                                int i272 = ~((i269 & i253) | (i269 ^ i253));
                                                                                int i273 = (i268 - (~(-(-(((i271 & i272) | (i271 ^ i272)) * 672))))) - 1;
                                                                                int i274 = (i264 & 39) + (i264 | 39);
                                                                                asBinder = i274 % 128;
                                                                                int i275 = i274 % 2;
                                                                                int i276 = (i273 << 13) ^ i273;
                                                                                int i277 = i276 >>> 17;
                                                                                int i278 = (i276 | i277) & (~(i276 & i277));
                                                                                int i279 = i278 << 5;
                                                                                ((int[]) objArr31[1])[0] = (i278 | i279) & (~(i278 & i279));
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
                                                            cls = i2;
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
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            } else {
                                try {
                                    throw null;
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable unused2) {
                    }
                    Throwable cause10 = th.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th;
                } catch (Throwable unused3) {
                    cls = i2;
                }
            } else {
                cls = i2;
            }
            Object[] objArr32 = {new int[]{i}, new int[1], new int[]{i}, null};
            int i280 = ~(i | (-950641670));
            int i281 = ((((-1002028512) | i280) * (-196)) - 270668948) + ((i280 | 51386842) * 196);
            int iB13 = zznv.b();
            int i282 = i281 * (-575);
            int i283 = cls * (-575);
            int i284 = (i282 & i283) + (i282 | i283);
            int i285 = ~i281;
            int i286 = ~cls;
            int i287 = ~((i286 & i285) | (i285 ^ i286));
            int i288 = ~cls;
            int i289 = -(-((i287 | (~((i288 ^ iB13) | (i288 & iB13)))) * 576));
            int i290 = (i284 ^ i289) + ((i289 & i284) << 1);
            int i291 = ~(i285 | cls);
            int i292 = asBinder + 99;
            int i293 = i292 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i293;
            int i294 = i292 % 2;
            int i295 = ~iB13;
            int i296 = (i295 & i288) | (i288 ^ i295);
            int i297 = ~((i296 & i281) | (i296 ^ i281));
            int i298 = i290 + (576 * ((i297 & i291) | (i291 ^ i297)));
            int i299 = ~i281;
            int i300 = ~((i299 & i288) | (i299 ^ i288));
            int i301 = (i293 ^ 21) + ((i293 & 21) << 1);
            int i302 = i301 % 128;
            asBinder = i302;
            int i303 = i301 % 2;
            int i304 = (i298 - (~(-(-(576 * i300))))) - 1;
            int i305 = i304 << 13;
            int i306 = (i305 & (~i304)) | ((~i305) & i304);
            int i307 = i306 ^ (i306 >>> 17);
            int i308 = i307 << 5;
            ((int[]) objArr32[1])[0] = ((~i307) & i308) | ((~i308) & i307);
            int i309 = (i302 & 107) + (i302 | 107);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i309 % 128;
            int i310 = i309 % 2;
            return objArr32;
        }

        private static String $$c(byte b2, int i, short s) {
            int i2 = s * 2;
            int i3 = 120 - i;
            byte[] bArr = $$a;
            int i4 = 3 - (b2 * 3);
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            int i6 = -1;
            if (bArr == null) {
                i6 = -1;
                i3 = i4 + i5;
                i4 = i4;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = i4 + 1;
                i6 = i7;
                i3 = bArr[i8] + i3;
                i4 = i8;
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class MediaControllerExtraData extends ComponentActivity.ExtraData {
        private final MediaControllerCompat mMediaController;

        MediaControllerExtraData(MediaControllerCompat mediaControllerCompat) {
            this.mMediaController = mediaControllerCompat;
        }

        MediaControllerCompat getMediaController() {
            return this.mMediaController;
        }
    }

    public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof ComponentActivity) {
            ((ComponentActivity) activity).putExtraData(new MediaControllerExtraData(mediaControllerCompat));
        }
        MediaControllerCompatApi21.setMediaController(activity, mediaControllerCompat != null ? MediaControllerCompatApi21.fromToken(activity, mediaControllerCompat.getSessionToken().getToken()) : null);
    }

    public static MediaControllerCompat getMediaController(Activity activity) {
        if (activity instanceof ComponentActivity) {
            MediaControllerExtraData mediaControllerExtraData = (MediaControllerExtraData) ((ComponentActivity) activity).getExtraData(MediaControllerExtraData.class);
            if (mediaControllerExtraData != null) {
                return mediaControllerExtraData.getMediaController();
            }
            return null;
        }
        Object mediaController = MediaControllerCompatApi21.getMediaController(activity);
        if (mediaController == null) {
            return null;
        }
        try {
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.fromToken(MediaControllerCompatApi21.getSessionToken(mediaController)));
        } catch (RemoteException unused) {
            return null;
        }
    }

    static void validateCustomAction(String str, Bundle bundle) {
        if (str != null) {
            str.hashCode();
            if (str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) {
                if (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {
                    StringBuilder sb = new StringBuilder("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ");
                    sb.append(str);
                    sb.append(".");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        MediaControllerImplApi24 mediaControllerImplApi24;
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
        this.mToken = sessionToken;
        try {
            mediaControllerImplApi24 = new MediaControllerImplApi24(context, sessionToken);
        } catch (RemoteException unused) {
            mediaControllerImplApi24 = null;
        }
        this.mImpl = mediaControllerImplApi24;
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) throws RemoteException {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.mToken = token;
        this.mImpl = new MediaControllerImplApi24(context, token);
    }

    public final TransportControls getTransportControls() {
        return this.mImpl.getTransportControls();
    }

    public final boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        return this.mImpl.dispatchMediaButtonEvent(keyEvent);
    }

    public final PlaybackStateCompat getPlaybackState() {
        return this.mImpl.getPlaybackState();
    }

    public final MediaMetadataCompat getMetadata() {
        return this.mImpl.getMetadata();
    }

    public final List<MediaSessionCompat.QueueItem> getQueue() {
        return this.mImpl.getQueue();
    }

    public final void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.addQueueItem(mediaDescriptionCompat);
    }

    public final void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        this.mImpl.addQueueItem(mediaDescriptionCompat, i);
    }

    public final void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.mImpl.removeQueueItem(mediaDescriptionCompat);
    }

    @Deprecated
    public final void removeQueueItemAt(int i) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue == null || i < 0 || i >= queue.size() || (queueItem = queue.get(i)) == null) {
            return;
        }
        removeQueueItem(queueItem.getDescription());
    }

    public final CharSequence getQueueTitle() {
        return this.mImpl.getQueueTitle();
    }

    public final Bundle getExtras() {
        return this.mImpl.getExtras();
    }

    public final int getRatingType() {
        return this.mImpl.getRatingType();
    }

    public final boolean isCaptioningEnabled() {
        return this.mImpl.isCaptioningEnabled();
    }

    public final int getRepeatMode() {
        return this.mImpl.getRepeatMode();
    }

    public final int getShuffleMode() {
        return this.mImpl.getShuffleMode();
    }

    public final long getFlags() {
        return this.mImpl.getFlags();
    }

    public final PlaybackInfo getPlaybackInfo() {
        return this.mImpl.getPlaybackInfo();
    }

    public final PendingIntent getSessionActivity() {
        return this.mImpl.getSessionActivity();
    }

    public final MediaSessionCompat.Token getSessionToken() {
        return this.mToken;
    }

    public final Bundle getSessionToken2Bundle() {
        return this.mToken.getSessionToken2Bundle();
    }

    public final void setVolumeTo(int i, int i2) {
        this.mImpl.setVolumeTo(i, i2);
    }

    public final void adjustVolume(int i, int i2) {
        this.mImpl.adjustVolume(i, i2);
    }

    public final void registerCallback(Callback callback) {
        registerCallback(callback, null);
    }

    public final void registerCallback(Callback callback, Handler handler) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (handler == null) {
            handler = new Handler();
        }
        callback.setHandler(handler);
        this.mImpl.registerCallback(callback, handler);
        this.mRegisteredCallbacks.add(callback);
    }

    public final void unregisterCallback(Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        try {
            this.mRegisteredCallbacks.remove(callback);
            this.mImpl.unregisterCallback(callback);
        } finally {
            callback.setHandler(null);
        }
    }

    public final void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.mImpl.sendCommand(str, bundle, resultReceiver);
    }

    public final boolean isSessionReady() {
        return this.mImpl.isSessionReady();
    }

    public final String getPackageName() {
        return this.mImpl.getPackageName();
    }

    public final Object getMediaController() {
        return this.mImpl.getMediaController();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static abstract class TransportControls {
        public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(String str, Bundle bundle);

        public abstract void playFromSearch(String str, Bundle bundle);

        public abstract void playFromUri(Uri uri, Bundle bundle);

        public abstract void prepare();

        public abstract void prepareFromMediaId(String str, Bundle bundle);

        public abstract void prepareFromSearch(String str, Bundle bundle);

        public abstract void prepareFromUri(Uri uri, Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long j);

        public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void sendCustomAction(String str, Bundle bundle);

        public abstract void setCaptioningEnabled(boolean z);

        public abstract void setRating(RatingCompat ratingCompat);

        public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);

        public abstract void setRepeatMode(int i);

        public abstract void setShuffleMode(int i);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long j);

        public abstract void stop();

        TransportControls() {
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class PlaybackInfo {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;
        private final int mAudioStream;
        private final int mCurrentVolume;
        private final int mMaxVolume;
        private final int mPlaybackType;
        private final int mVolumeControl;

        PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this.mPlaybackType = i;
            this.mAudioStream = i2;
            this.mVolumeControl = i3;
            this.mMaxVolume = i4;
            this.mCurrentVolume = i5;
        }

        public final int getPlaybackType() {
            return this.mPlaybackType;
        }

        public final int getAudioStream() {
            return this.mAudioStream;
        }

        public final int getVolumeControl() {
            return this.mVolumeControl;
        }

        public final int getMaxVolume() {
            return this.mMaxVolume;
        }

        public final int getCurrentVolume() {
            return this.mCurrentVolume;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class MediaControllerImplBase implements MediaControllerImpl {
        private IMediaSession mBinder;
        private TransportControls mTransportControls;

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Object getMediaController() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return true;
        }

        public MediaControllerImplBase(MediaSessionCompat.Token token) {
            this.mBinder = IMediaSession.Stub.asInterface((IBinder) token.getToken());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void registerCallback(Callback callback, Handler handler) {
            if (callback == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.mBinder.asBinder().linkToDeath(callback, 0);
                this.mBinder.registerCallbackListener((IMediaControllerCallback) callback.mCallbackObj);
                callback.postToHandler(13, null, null);
            } catch (RemoteException unused) {
                callback.postToHandler(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void unregisterCallback(Callback callback) {
            if (callback == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.mBinder.unregisterCallbackListener((IMediaControllerCallback) callback.mCallbackObj);
                this.mBinder.asBinder().unlinkToDeath(callback, 0);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.mBinder.sendMediaButton(keyEvent);
                return false;
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public TransportControls getTransportControls() {
            if (this.mTransportControls == null) {
                this.mTransportControls = new TransportControlsBase(this.mBinder);
            }
            return this.mTransportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackStateCompat getPlaybackState() {
            try {
                return this.mBinder.getPlaybackState();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public MediaMetadataCompat getMetadata() {
            try {
                return this.mBinder.getMetadata();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public List<MediaSessionCompat.QueueItem> getQueue() {
            try {
                return this.mBinder.getQueue();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.addQueueItem(mediaDescriptionCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.addQueueItemAt(mediaDescriptionCompat, i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.mBinder.getFlags() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.mBinder.removeQueueItem(mediaDescriptionCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public CharSequence getQueueTitle() {
            try {
                return this.mBinder.getQueueTitle();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Bundle getExtras() {
            try {
                return this.mBinder.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            try {
                return this.mBinder.getRatingType();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            try {
                return this.mBinder.isCaptioningEnabled();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            try {
                return this.mBinder.getRepeatMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            try {
                return this.mBinder.getShuffleMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            try {
                return this.mBinder.getFlags();
            } catch (RemoteException unused) {
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackInfo getPlaybackInfo() {
            try {
                ParcelableVolumeInfo volumeAttributes = this.mBinder.getVolumeAttributes();
                return new PlaybackInfo(volumeAttributes.volumeType, volumeAttributes.audioStream, volumeAttributes.controlType, volumeAttributes.maxVolume, volumeAttributes.currentVolume);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PendingIntent getSessionActivity() {
            try {
                return this.mBinder.getLaunchPendingIntent();
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            try {
                this.mBinder.setVolumeTo(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            try {
                this.mBinder.adjustVolume(i, i2, null);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.mBinder.sendCommand(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public String getPackageName() {
            try {
                return this.mBinder.getPackageName();
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TransportControlsBase extends TransportControls {
        private IMediaSession mBinder;

        public TransportControlsBase(IMediaSession iMediaSession) {
            this.mBinder = iMediaSession;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            try {
                this.mBinder.prepare();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            try {
                this.mBinder.prepareFromMediaId(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            try {
                this.mBinder.prepareFromSearch(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            try {
                this.mBinder.prepareFromUri(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void play() {
            try {
                this.mBinder.play();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromMediaId(String str, Bundle bundle) {
            try {
                this.mBinder.playFromMediaId(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromSearch(String str, Bundle bundle) {
            try {
                this.mBinder.playFromSearch(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            try {
                this.mBinder.playFromUri(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToQueueItem(long j) {
            try {
                this.mBinder.skipToQueueItem(j);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void pause() {
            try {
                this.mBinder.pause();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void stop() {
            try {
                this.mBinder.stop();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void seekTo(long j) {
            try {
                this.mBinder.seekTo(j);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void fastForward() {
            try {
                this.mBinder.fastForward();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToNext() {
            try {
                this.mBinder.next();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void rewind() {
            try {
                this.mBinder.rewind();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void skipToPrevious() {
            try {
                this.mBinder.previous();
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat) {
            try {
                this.mBinder.rate(ratingCompat);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRating(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.mBinder.rateWithExtras(ratingCompat, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setCaptioningEnabled(boolean z) {
            try {
                this.mBinder.setCaptioningEnabled(z);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setRepeatMode(int i) {
            try {
                this.mBinder.setRepeatMode(i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void setShuffleMode(int i) {
            try {
                this.mBinder.setShuffleMode(i);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            sendCustomAction(customAction.getAction(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void sendCustomAction(String str, Bundle bundle) {
            MediaControllerCompat.validateCustomAction(str, bundle);
            try {
                this.mBinder.sendCustomAction(str, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class MediaControllerImplApi21 implements MediaControllerImpl {
        protected final Object mControllerObj;
        final MediaSessionCompat.Token mSessionToken;
        final Object mLock = new Object();
        private final List<Callback> mPendingCallbacks = new ArrayList();
        private HashMap<Callback, ExtraCallback> mCallbackMap = new HashMap<>();

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.mSessionToken = token;
            Object objFromToken = MediaControllerCompatApi21.fromToken(context, token.getToken());
            this.mControllerObj = objFromToken;
            if (objFromToken == null) {
                throw new RemoteException();
            }
            if (token.getExtraBinder() == null) {
                requestExtraBinder();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void registerCallback(Callback callback, Handler handler) {
            MediaControllerCompatApi21.registerCallback(this.mControllerObj, callback.mCallbackObj, handler);
            synchronized (this.mLock) {
                if (this.mSessionToken.getExtraBinder() != null) {
                    ExtraCallback extraCallback = new ExtraCallback(callback);
                    this.mCallbackMap.put(callback, extraCallback);
                    callback.mIControllerCallback = extraCallback;
                    try {
                        this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
                        callback.postToHandler(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    callback.mIControllerCallback = null;
                    this.mPendingCallbacks.add(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public final void unregisterCallback(Callback callback) {
            MediaControllerCompatApi21.unregisterCallback(this.mControllerObj, callback.mCallbackObj);
            synchronized (this.mLock) {
                if (this.mSessionToken.getExtraBinder() != null) {
                    try {
                        ExtraCallback extraCallbackRemove = this.mCallbackMap.remove(callback);
                        if (extraCallbackRemove != null) {
                            callback.mIControllerCallback = null;
                            this.mSessionToken.getExtraBinder().unregisterCallbackListener(extraCallbackRemove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.mPendingCallbacks.remove(callback);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            return MediaControllerCompatApi21.dispatchMediaButtonEvent(this.mControllerObj, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public TransportControls getTransportControls() {
            Object transportControls = MediaControllerCompatApi21.getTransportControls(this.mControllerObj);
            if (transportControls != null) {
                return new TransportControlsApi21(transportControls);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackStateCompat getPlaybackState() {
            if (this.mSessionToken.getExtraBinder() != null) {
                try {
                    return this.mSessionToken.getExtraBinder().getPlaybackState();
                } catch (RemoteException unused) {
                }
            }
            Object playbackState = MediaControllerCompatApi21.getPlaybackState(this.mControllerObj);
            if (playbackState != null) {
                return PlaybackStateCompat.fromPlaybackState(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public MediaMetadataCompat getMetadata() {
            Object metadata = MediaControllerCompatApi21.getMetadata(this.mControllerObj);
            if (metadata != null) {
                return MediaMetadataCompat.fromMediaMetadata(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public List<MediaSessionCompat.QueueItem> getQueue() {
            List<Object> queue = MediaControllerCompatApi21.getQueue(this.mControllerObj);
            if (queue != null) {
                return MediaSessionCompat.QueueItem.fromQueueItemList(queue);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i);
            sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public CharSequence getQueueTitle() {
            return MediaControllerCompatApi21.getQueueTitle(this.mControllerObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Bundle getExtras() {
            return MediaControllerCompatApi21.getExtras(this.mControllerObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRatingType() {
            return MediaControllerCompatApi21.getRatingType(this.mControllerObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isCaptioningEnabled() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return false;
            }
            try {
                return this.mSessionToken.getExtraBinder().isCaptioningEnabled();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getRepeatMode() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.mSessionToken.getExtraBinder().getRepeatMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public int getShuffleMode() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.mSessionToken.getExtraBinder().getShuffleMode();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public long getFlags() {
            return MediaControllerCompatApi21.getFlags(this.mControllerObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PlaybackInfo getPlaybackInfo() {
            Object playbackInfo = MediaControllerCompatApi21.getPlaybackInfo(this.mControllerObj);
            if (playbackInfo != null) {
                return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(playbackInfo), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(playbackInfo));
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public PendingIntent getSessionActivity() {
            return MediaControllerCompatApi21.getSessionActivity(this.mControllerObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void setVolumeTo(int i, int i2) {
            MediaControllerCompatApi21.setVolumeTo(this.mControllerObj, i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void adjustVolume(int i, int i2) {
            MediaControllerCompatApi21.adjustVolume(this.mControllerObj, i, i2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaControllerCompatApi21.sendCommand(this.mControllerObj, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public boolean isSessionReady() {
            return this.mSessionToken.getExtraBinder() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public String getPackageName() {
            return MediaControllerCompatApi21.getPackageName(this.mControllerObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public Object getMediaController() {
            return this.mControllerObj;
        }

        private void requestExtraBinder() {
            sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new ExtraBinderRequestResultReceiver(this));
        }

        void processPendingCallbacksLocked() {
            if (this.mSessionToken.getExtraBinder() == null) {
                return;
            }
            for (Callback callback : this.mPendingCallbacks) {
                ExtraCallback extraCallback = new ExtraCallback(callback);
                this.mCallbackMap.put(callback, extraCallback);
                callback.mIControllerCallback = extraCallback;
                try {
                    this.mSessionToken.getExtraBinder().registerCallbackListener(extraCallback);
                    callback.postToHandler(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.mPendingCallbacks.clear();
        }

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> mMediaControllerImpl;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.mMediaControllerImpl = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.mMediaControllerImpl.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.mLock) {
                    mediaControllerImplApi21.mSessionToken.setExtraBinder(IMediaSession.Stub.asInterface(BundleCompat.getBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER)));
                    mediaControllerImplApi21.mSessionToken.setSessionToken2Bundle(bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE));
                    mediaControllerImplApi21.processPendingCallbacksLocked();
                }
            }
        }

        static class ExtraCallback extends Callback.StubCompat {
            ExtraCallback(Callback callback) {
                super(callback);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.Callback.StubCompat, android.support.v4.media.session.IMediaControllerCallback
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class MediaControllerImplApi23 extends MediaControllerImplApi21 {
        public MediaControllerImplApi23(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.MediaControllerImpl
        public TransportControls getTransportControls() {
            Object transportControls = MediaControllerCompatApi21.getTransportControls(this.mControllerObj);
            if (transportControls != null) {
                return new TransportControlsApi23(transportControls);
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TransportControlsApi23 extends TransportControlsApi21 {
        public TransportControlsApi23(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void playFromUri(Uri uri, Bundle bundle) {
            MediaControllerCompatApi23.TransportControls.playFromUri(this.mControlsObj, uri, bundle);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static class TransportControlsApi24 extends TransportControlsApi23 {
        public TransportControlsApi24(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepare() {
            MediaControllerCompatApi24.TransportControls.prepare(this.mControlsObj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromMediaId(String str, Bundle bundle) {
            MediaControllerCompatApi24.TransportControls.prepareFromMediaId(this.mControlsObj, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromSearch(String str, Bundle bundle) {
            MediaControllerCompatApi24.TransportControls.prepareFromSearch(this.mControlsObj, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.TransportControlsApi21, android.support.v4.media.session.MediaControllerCompat.TransportControls
        public void prepareFromUri(Uri uri, Bundle bundle) {
            MediaControllerCompatApi24.TransportControls.prepareFromUri(this.mControlsObj, uri, bundle);
        }
    }
}
