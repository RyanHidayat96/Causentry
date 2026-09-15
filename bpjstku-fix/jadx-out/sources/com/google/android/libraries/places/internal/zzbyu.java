package com.google.android.libraries.places.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyu implements InvocationHandler {
    private final List zza;
    private boolean zzb;
    private String zzc;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = zzbyy.zza;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.zzb = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.zza;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.zza.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.zzc = str;
                        return str;
                    }
                }
                String str2 = (String) this.zza.get(0);
                this.zzc = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.zzc = (String) objArr[0];
        return null;
    }

    final /* synthetic */ boolean zza() throws IllegalAccessException {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 46400), 40 - TextUtils.indexOf("", "", 0, 0), 19 - (ViewConfiguration.getTapTimeout() >> 16), 1513912262, false, "b", null);
        }
        int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 37837), 59 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37835 - TextUtils.lastIndexOf("", '0', 0)), 59 - TextUtils.getOffsetBefore("", 0), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
        long j2 = 672;
        long jIdentityHashCode = System.identityHashCode(this);
        long j3 = -1;
        long j4 = jIdentityHashCode ^ j3;
        long j5 = (((long) 673) * 3154145082979021916L) + (((long) (-1343)) * 2365108414180764323L) + ((((jIdentityHashCode | 3154145082979021916L) ^ j3) | 2365108414180764323L) * j2) + (((long) (-672)) * ((((j3 ^ 3154145082979021916L) | j4) ^ j3) | ((jIdentityHashCode | 2365108414180764323L) ^ j3)));
        long j6 = j3 ^ 2365108414180764323L;
        long j7 = j5 + (j2 * (((j6 | 3154145082979021916L) ^ j3) | ((j6 | j4) ^ j3)));
        int i3 = 0;
        long j8 = j;
        int i4 = i2;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i4 = (((((int) (j8 >> i5)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i3 != 0) {
                break;
            }
            i3++;
            j8 = j7;
        }
        if (i4 != i) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 46400), View.resolveSize(0, 0) + 40, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            throw null;
        }
        return this.zzb;
    }

    public zzbyu(List list) {
        this.zza = list;
    }

    final /* synthetic */ String zzb() {
        return this.zzc;
    }
}
