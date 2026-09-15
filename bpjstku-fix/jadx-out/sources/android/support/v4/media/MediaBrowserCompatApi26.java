package android.support.v4.media;

import android.graphics.Color;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class MediaBrowserCompatApi26 {

    interface SubscriptionCallback extends MediaBrowserCompatApi21.SubscriptionCallback {
        void onChildrenLoaded(String str, List<?> list, Bundle bundle);

        void onError(String str, Bundle bundle);
    }

    static Object createSubscriptionCallback(SubscriptionCallback subscriptionCallback) {
        return new SubscriptionCallbackProxy(subscriptionCallback);
    }

    public static void subscribe(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void unsubscribe(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static class SubscriptionCallbackProxy<T extends SubscriptionCallback> extends MediaBrowserCompatApi21.SubscriptionCallbackProxy<T> {
        private static final byte[] $$c = {57, -50, -56, -93};
        private static final int $$d = 148;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {6, 51, 46, 31};
        private static final int $$b = 203;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int d = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 60796;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 41994;
        private static char b = 5285;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 42605;

        private static void c(int i, byte b2, short s, Object[] objArr) {
            int i2 = b2 * 2;
            int i3 = (s * 3) + 98;
            int i4 = 3 - (i * 3);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            int i6 = -1;
            if (bArr == null) {
                i3 += -i5;
            }
            while (true) {
                i6++;
                i4++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 += -bArr[i4];
            }
        }

        SubscriptionCallbackProxy(T t) {
            super(t);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
            int i = 2 % 2;
            int i2 = d + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                MediaSessionCompat.ensureClassLoader(bundle);
                ((SubscriptionCallback) this.mSubscriptionCallback).onChildrenLoaded(str, list, bundle);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MediaSessionCompat.ensureClassLoader(bundle);
            ((SubscriptionCallback) this.mSubscriptionCallback).onChildrenLoaded(str, list, bundle);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            d = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(String str, Bundle bundle) {
            int i = 2 % 2;
            int i2 = d + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            MediaSessionCompat.ensureClassLoader(bundle);
            ((SubscriptionCallback) this.mSubscriptionCallback).onError(str, bundle);
            int i4 = d + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i4 = $10 + 1;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    int i8 = $10 + 101;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cRed = (char) (Color.red(i3) + 47773);
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 468;
                            int i12 = (ExpandableListView.getPackedPositionForGroup(i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i3) == 0L ? 0 : -1)) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, doubleTapTimeout, i12, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i13 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 468, (ViewConfiguration.getScrollBarSize() >> 8) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i13 + 1;
                        int i14 = $11 + 13;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
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
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 2323, 43 - TextUtils.lastIndexOf("", '0', 0, 0), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r27, int r28) {
            /*
                Method dump skipped, instruction units count: 1896
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, int):java.lang.Object[]");
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
        private static java.lang.String $$e(byte r7, int r8, byte r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r7 = r7 * 3
                int r7 = r7 + 108
                int r9 = r9 * 4
                int r9 = 4 - r9
                byte[] r0 = android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallbackProxy.$$c
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2a:
                int r7 = r7 + r9
                int r9 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompatApi26.SubscriptionCallbackProxy.$$e(byte, int, byte):java.lang.String");
        }
    }

    private MediaBrowserCompatApi26() {
    }
}
