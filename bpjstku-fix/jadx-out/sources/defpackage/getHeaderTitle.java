package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.domain.general.model.BaseModel;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getHeaderTitle extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentbindingInflater1;
    public final onBackPressedDispatcher_delegatelambda00 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<MotionLinkingResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<MotionCheckConnectResponse>> b;

    public getHeaderTitle(onBackPressedDispatcher_delegatelambda00 onbackpresseddispatcher_delegatelambda00, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(onbackpresseddispatcher_delegatelambda00, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = onbackpresseddispatcher_delegatelambda00;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<MotionLinkingResponse>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<MotionCheckConnectResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.b = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData3;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void b(MotionCheckConnectRequest motionCheckConnectRequest) {
        Intrinsics.checkNotNullParameter(motionCheckConnectRequest, "");
        MutableLiveData<VirtualCameraAdapter1<MotionCheckConnectResponse>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(motionCheckConnectRequest)));
        if (derivecodecB != null) {
            final Function1 function1 = new Function1() { // from class: getOptionalIconsVisible
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getHeaderTitle.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (MotionCheckConnectResponse) obj);
                }
            };
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString() { // from class: getRootMenu
                private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                private static long b;
                private static final byte[] $$c = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
                private static final int $$d = 119;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {57, -56, 23, -36};
                private static final int $$b = 61;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;

                /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                /* JADX WARN: Code duplicated, block: B:8:0x001a  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
                    /*
                        int r6 = r6 * 2
                        int r6 = 4 - r6
                        byte[] r0 = defpackage.getRootMenu.$$a
                        int r7 = 103 - r7
                        int r5 = r5 * 3
                        int r1 = r5 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L14
                        r4 = r6
                        r3 = r2
                        goto L26
                    L14:
                        r3 = r2
                    L15:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        if (r3 != r5) goto L22
                        java.lang.String r5 = new java.lang.String
                        r5.<init>(r1, r2)
                        r8[r2] = r5
                        return
                    L22:
                        int r3 = r3 + 1
                        r4 = r0[r6]
                    L26:
                        int r6 = r6 + 1
                        int r7 = r7 + r4
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getRootMenu.c(byte, int, short, java.lang.Object[]):void");
                }

                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    int i = 2 % 2;
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        function1.invoke(obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    function1.invoke(obj);
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                    int i4 = i3 % 2;
                }

                /* JADX WARN: Code duplicated, block: B:73:0x034c  */
                /* JADX WARN: Code duplicated, block: B:74:0x034d  */
                private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
                    Object obj;
                    Throwable cause;
                    int i3 = 2;
                    int i4 = 2 % 2;
                    lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                    long[] jArr = new long[i2];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (true) {
                        obj = null;
                        if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                            break;
                        }
                        int i5 = $11 + 53;
                        $10 = i5 % 128;
                        if (i5 % i3 != 0) {
                            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            try {
                                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i % i6])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 2187 - View.MeasureSpec.makeMeasureSpec(0, 0), 39 - TextUtils.indexOf((CharSequence) "", '0'), 841711447, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                                }
                                try {
                                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 3012, 25 - TextUtils.lastIndexOf("", '0', 0, 0), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                    }
                                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                                    try {
                                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            byte b6 = (byte) 0;
                                            byte b7 = b6;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 36506), 3375 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) KeyEvent.normalizeMetaState(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2187, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, 841711447, false, $$e(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(b), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (33018 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 3011, ImageFormat.getBitsPerPixel(0) + 27, 321985076, false, $$e(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36505), 3376 - KeyEvent.normalizeMetaState(0), 16 - ((byte) KeyEvent.getModifierMetaStateMask()), -968507904, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        }
                        i3 = 2;
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                    char[] cArr = new char[i2];
                    lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                        int i8 = $10 + 29;
                        $11 = i8 % 128;
                        if (i8 % 2 == 0) {
                            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                            Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                byte b14 = (byte) 0;
                                byte b15 = b14;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36506 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Color.red(0) + 3376, 17 - ExpandableListView.getPackedPositionGroup(0L), -968507904, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                            obj.hashCode();
                            throw null;
                        }
                        cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                        Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36505 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3376, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17, -968507904, false, $$e(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
                    }
                    objArr[0] = new String(cArr);
                }

                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                    	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                    */
                public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r71, int r72, int r73, int r74) {
                    /*
                        Method dump skipped, instruction units count: 14487
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getRootMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, int, int, int):java.lang.Object[]");
                }

                static {
                    char[] cArr = new char[2154];
                    ByteBuffer.wrap("çÐæ«åúä\u0019ã\u0010âhà°ïÃî\u001bí)ìvê\u009cé×èÐ÷>öKô\u009bó½òúñ\u001cðLÿPý¬üßû\u001eú,ùz±³°È³\u0099²zµs´\u000b¶Ó¹ ¸x»Jº\u0015¼ÿ¿´¾³¡L %¢ì¥É¤£§h¦,©\u001e«ßª¸\u00adx±³°È³\u0099²zµs´\u000b¶Ó¹ ¸x»Jº\u0015¼ÿ¿´¾³¡O 5¢ò¥Ï±³°ß³\u0085²\u007fµs´\u0001¶Ó¹¨¸i»@º\u0019¼£¿»¾\u0083¡P (¢ú¥Å¤\u008f§d¦\u0003©\u000e«Ýª¸\u00adh¬I¯\u000e\u0091õ±³°É³\u0088²oµs´\b¶Û¹â¸l»^º\u0013¼ü±³°É³\u0088²oµs´\u001f¶Õ¹¡¸2»\\º\u000e¼ã¿¬ÿpþ\u001cý[ü¬ûþúÝø\u001b÷ ö\u008dõ©ôòò ñiðJï»îîì+ë\u000e±³°È³\u009d²xµ=´C¶\u0092¹¯¸l»Yº\u0015¼â¿º¾\u0083yÙxô{åzY}\u0004|4~ÿqÕpYs~r/tÉw\u0084v²ioh$jÅmþl¿odn\u000fa5cøbÊ\u001d\u0016\u001c;\u001f*\u001e\u0096\u0019Ë\u0018û\u001a0\u0015\u001a\u0014\u0096\u0017±\u0016à\u0010\u0006\u0013K\u0012}\r \fë\u000e\n\t1\bp\u000b«\nÀ\u0005ú\u00077\u0006\u0006±³°ß³\u0085²\u007fµ(´\t¶Ñ¹ã¸p»Eº\u001e¼£¿°¾\u0085¡^ \"¢þ¥\u0082¤\u008f§c±þ°Å³\u009b²bµ3´\u0014À\u0094ÁøÂ¢ÃXÄ\u000fÅ.ÇöÈÄÉYÊbË5Í\u0084Î\u0095Ï®ÐvÑ\u001eÓíÔÆÕöÖE×\u001eØ&ÚîÛÆÜXÝdÞ5àßá\u0089â¤ãw±³°ß³\u0085²\u007fµ(´\t¶Ñ¹ã¸~»Eº\u0012¼£¿²¾\u0089¡Q 9¢Ê¥á¤Ñ§|¦.©\u0003«Ì¸º¹Öº\u008c»v¼!½\u0000¿Ø°ê±y²L³\u0017µª¶¹·\u008c¨W©+«ð¬È\u00ad\u0080®S¯\u0018 \u0015¢Ç£ª¤e¥\u000b¦\u0006\u0098ê±³°È³\u0099²zµs´\u0002¶Ù¹¡¸i»Kº\t¼é¿¯¾\u0098±î°Ã³Ò²nµ)´\u0005¶Ð¹¨¸2»Dº\u0013¼ÿ¿¨\u0087\u008f\u0086´\u0085à\u0084\u0002\u0083D\u0082?\u0080¯\u008fÔ\u008e\u0015¶Ò·½´ïµ\u0002²^³\"±»¾Ä¿\u0011¼(½n»\u0094¸Î¹ù¦8§@¥\u008e±ò°É³\u0091²yµ/´\n±î°Ã³Ò²|µ.´\u0003¶Ø¹¹¸\u007f»XºR¼á¿½¾\u0082¡I *¢ý¥Ï¤\u0088§y¦.©\t«Î±û°É³\u0092²u±ì°É³\u008e²\u007fµ5´\u001f¶È¹â¸o»Uº\u000f¼¢¿¾¾\u0088¡\u0012 (¢ù¥Î¤\u0089§k¦r©\u000b«Ìª¹\u00ad2¬J¯\u001d\u0091ç\u0090¹\u0093³\u0092[\u0095<\u0097é\u0096ó\u0099\u008e\u0098i\u009b2\u009a\b\u009cÙ\u009f¾\u009ey\u0081^8»9\u009e:Ù;(<b=H?\u009f0µ182\u00023X5õ6é7ß(E)\u007f+®,\u0099-Þ.</% \\\"\u009b#î$e%\u001d&J\u0018°\u0019î\u001aä\u001b\f\u001ck\u001e¾\u001f¤\u0010Ý\u0011>\u0012e\u0013_\u0015\u0084\u0016éz\\{yx>yÏ~\u0085\u007f¯}xrRsßpåq¿w\u0012t\u000eu8j¢k\u0098iIn~o9lÛmÂb®`caRfÏgíd¥\u0092t\u0093Q\u0090\u0016\u0091ç\u0096\u00ad\u0097\u0087\u0095P\u009az\u009b÷\u0098Í\u0099\u0097\u009f:\u009c&\u009d\u0010\u0082\u008a\u0083°\u0081a\u0086V\u0087\u0011\u0084ó\u0085ê\u008a\u0086\u0088K\u0089z\u008eè\u008fÕ\u008c\u0087±ì°É³\u008e²\u007fµ5´\u001f¶È¹â¸o»Uº\u000f¼¢¿¾¾\u0088¡\u0012 (¢ù¥Î¤\u0089§k¦r©\u001e«Óªâ\u00adq¬O¯\u001f\u009b\u000b\u009a.\u0099i\u0098\u0098\u009fÒ\u009eø\u009c/\u0093\u0005\u0092\u0088\u0091²\u0090è\u0096E\u0095Y\u0094o\u008bõ\u008aÏ\u0088\u001e\u008f)\u008en\u008d\u008c\u008c\u0095\u0083ù\u00814\u0080\u0005\u0087\u0096\u0086¥\u0085ø_Ç^ã]¾\\Y[\u0002Z'è½éÒê\u0080ëmì1íMïßà\u00adávâWã\u001eåçæ¡aK`oc2bÕe\u009ad¸fxi\u001ehÉÊ?ËSÈ\tÉóÎ¤Ï\u0085Í]ÂoÃöÀÒÁ\u0091ÇmÄ5Å\u0017ÚßÛ²Ù{Þ\u000fß\u0007ÜéÝ¾Ò\u0084Ð_Ñ7Öã×\u008dÔ\u0083êyë#è\u0014éÕî\u00adìOíSâ\u0015ãòà¦á\u0085çBänåúúÁû\u0082\u007f\u001f~v}5|Î{\u0094z¯xbwOvÜuét²r\u0016qDpooøn\u0097l\u001fkaj%iÄh\u0099g¯e>d\u0010cÂbéa½_A^\u0002]9\\¾[\u0097YYXnW4VÏU\u0087T³R>Q\u0013Pß¼q½\u0018¾[¿ ¸ú¹Á»\f´!µ²¶\u0087·Ü±x²*³\u0001¬\u0096\u00adù¯q¨\u0006©Iª\u00ad«ñ¤Ã¦\u000e§a \u00ad¡\u008b¢Ì\u009c`\u009di\u009eG\u009f\u0090\u0098ê\u009a1\u009b\u0019\u0094M\u0095à\u0096í\u0097Á±³°ß³\u0085²\u007fµ(´\t¶Ñ¹ã¸p»Eº\u001e¼º¿è¾Ã¡_  ¢ó¥Ù¤\u0098§S¦=©\u0005«Øª \u00adC¬E¯\u0012\u0091ø\u0090¹\u0093\u009e\u0092Z\u0095-\u0097ÿ\u0096É\u0099Ñ\u0098o\u009b,\u009a\u001c\u009c\u0092\u009f¿\u009esé\\è&ëgê\u0080í\u009cìêî=áJà\u0087ãìâúä\rçZæwùýøÀú\u001fý,üfÿ\u0087þÀñæó!òUõ\u009aô ÷öÉMÈAË`\u0085Õ\u0084Ç\u0087\u009c\u0086{\u0081?\u0080\r\u0082Æ\u008d«\u008c}\u008fL±é°Â³\u0097²bµ3´\u001b¶Ò±ÿ°Ä³\u008e²cµ1´\u0005¶É¹¡±î°Ã³Ò²|µ.´\u0003¶Ø¹¹¸\u007f»XºR¼è¿¹¾\u009a¡U /¢ù±ê°Î³\u0093²tµd´Z¶Ìå,ä\u001eçEæ¾áùàÒâ\b±û°É³\u0092²iµ.´\u0005¶ß¹\u0093¸d»\u0014ºJ±û°É³\u0092²iµ.´\u0005¶ß¹\u0093¸d»\u0014ºJ¼Ó¿ê¾Ø±î°Ã³Ò²|µ.´\u0003¶Ø¹¹¸\u007f»XºR¼á¿³¾\u0088¡Y  \u001fç\u001eÀ\u001d\u009f±ù°Á³\u0089²`µ=´\u0018¶Ó¹¾±Ý°Ü³\u008c²,µ\u000e´\u0019¶Ò¹¸¸u»Aº\u0019¼¬¿º¾\u0083¡N l¢ß¥Ä¤\u008e§c¦1©\t½\u008d¼\u0092¿È¾.¹c¸Uº\u0088µ¼´\u001f·8¶g°ü³î²É\u00ad\u0005¬p®¸©Ü¨Ê«3ª~¥\u001c§\u0094¦¤¡z±Ý°Â³\u0098²~µ3´\u0005¶Ø¹ì¸O»hº7¼¬¿¾¾\u0099¡U  ¢è¥\u008c¤\u009a§c¦.©L«Äªô\u00ad*¬s¯J\u0091¸±î°Ã³Ò²dµ=´\u001e¶Ø¹»¸}»^º\u0019jWkoh<iÄn\u0096o©mcb\b±ê°Î³\u0093²tµd´ZôFõeö:÷Çð\u009cñ±±î°Ã³Ò²|µ.´\u0003¶Ø¹¹¸\u007f»XºR¼î¿®¾\u008d¡R (±î°Ã³Ò²gµ9´\u001e¶Ò¹©¸p»\u0002º\r¼é¿±¾\u0099±\u00ad±î°Ã³Ò²\u007fµ9´\u000f¶É¹¾¸y±¬Ê´Ë\u0099È\u0088É4ÎsÏ_Í\u008aÂòÃhÀ\u0006ÁTÇ¹ÄâÅÃÚ\u0005Ûb+0*\u0013)Z(ª/É.Þ,N#0mÂlïoþnBi\u0005h)jüe\u0084d\u001egff9`Îc\u0097b¥}b|\u0010~Âyéx¾{T\u0091d\u0090V\u0093\r\u0092ö\u0095±\u0094\u009a\u0096@\u0099|\u0098ð\u009b×\u009a\u0088\u009c<\u009f$\u009e\u0016\u0081Í\u0080¶\u0082q\u0085Z\u0084\u0000\u0094/\u0095\u001d\u0096F\u0097½\u0090ú\u0091Ñ\u0093\u000b\u009cG\u009d°\u009eÀ\u009f\u009e\u0099w\u009a{\u009b\\\u0084\u0083\u0085Ç\u00870\u0080@\u0081\u001e\u0082÷\u0083ï\u008cÝ\u008e\u0006\u008f}\u0088º\u0089\u0091\u008aË´\u0007µp¶\u0000·Þö&÷\u0014ôOõ´òóóØñ\u0002þ>ÿ¦ü\u009eýÎû6ømùTæ¾çâå%â\u001aã\u000eà¶áäîßì\u0004ícê¨ë\u0092\u009aÉ\u009bû\u0098 \u0099[\u009e\u001c\u009f7\u009dí\u0092Ñ\u0093X\u0090|\u0091!\u0097Æ\u0094Ö\u0095è\u008a~\u008bQ\u0089Ø\u008eü\u008f¡\u008cF\u008dV\u0082h\u0080þ±û°Ã³\u0093²kµ0´\t¶\u0093¹¿¸x»Gº#¼ë¿¬¾\u0084¡S \"¢ù¥ó¤\u0084§4¦j©C«Ûª©\u00adr¬I¯\u000e\u0091å\u0090¿\u0093³\u0092D\u0095t\u0097ªß5Þ\u0018Ý\tÜµÛèÚØØ\u0013×{Ö¨Õ\u0096ÔÃÒ2Ñu±î°Ã³Ò²nµ3´\u0003¶È¹¥¸q»Mº\u001b¼é¿ò¾\u008e¡I %¢ð¥È¤Ò§j¦5©\u0002«Ûª©\u00adn¬\\¯\u000e\u0091å\u0090²\u0093\u0098ËYÊFÉ\u001cÈúÏ·Î\u0081Ì\\ÃeÂàÁ\u0090ÀÎ@\u0015A8B)C\u0095DÒEþG+HSIÉJ³KîM\u0004NWO{P¦QÎSIT>Uc±è°É³\u008f²xµq¾ú¿Í¼\u009a½wº}»\u0010¹Å¶ ·=´Rµ\u0016³î°¦±Î®C¯1\u00adüªÓ«\u0080±í°É³\u0091²yµr´\u0004¶Ë¹â¸q»Mº\u0015¼â¿·¾\u0089¡E ?±í°É³\u0091²yµr´\u001f¶Ú¹â¸z»Mº\u0017¼é¿\u0083¾\u008f¡] !¢ù¥Þ¤\u009d±í°É³\u0091²yµr´\u001f¶Ú¹â¸p»Oº\u0018¼Ó¿¸¾\u0089¡R ?¢õ¥Ø¤\u00859\u00008-;<:\u0089=×<ð><1G0\u009e3ì2ó4\f7V6p)½(Ë*\u0016-l,c/\u0087.ß!÷#6±\u0010°=³,²\u0090µÍ´ý¶6¹\u001c¸\u0093»·ºï¼\u0007¿\f¾s¡´ Ö¢=¥<¤c§\u009f¦Ç)â(Ï+Þ*o-4,\r.\u009e!¢ e#I\"\u001c$ä'þ&\u00869Y8.:÷=Å<\u0082?p>\"1\t3Þ2´±î°Ã³Ò²|µ.´\u0003¶Ø¹¹¸\u007f»XºR¼î¿©¾\u0085¡P (¢²¥Ê¤\u0095§b¦;©\t«Îª¼\u00adn¬E¯\u0012\u0091ø±î°Ã³Ò²\u007fµ%´\u001f¶È¹©¸q»\u0002º\u001e¼ù¿µ¾\u0080¡X b¢ú¥Å¤\u0092§k¦9©\u001e«Ìª¾\u00adu¬B¯\b±î°Ã³Ò²\u007fµ%´\u001f¶È¹©¸q»sº\u0019¼ô¿¨¾Â¡^ 9¢õ¥À¤\u0098§\"¦:©\u0005«Òª«\u00ady¬^¯\f\u0091þ\u0090µ\u0093\u0082\u0092H±î°Ã³Ò²zµ9´\u0002¶Ø¹£¸n»\u0002º\u001e¼ù¿µ¾\u0080¡X b¢ú¥Å¤\u0092§k¦9©\u001e«Ìª¾\u00adu¬B¯\bäCånæ\u007fç×à\u0094á¯ãuì\u000eíÃîÞïµéMê\u001aë,ô¿õ\u0083÷Dðhñ=òÅóßü§þxÿ\u000føÖùäú£ÄQÅ\u0003Æ(ÇÿÀ\u0095±´±°°\u008c\u008f¤±µ±³°È³\u0099²zµs´\u001d¶Ù¹¡¸i»sº\f¼å¿¬¾\u0089Ã»ÂÀÁ\u0091ÀrÇ{Æ\u0017ÄÛË§Ê\u007fÉAÈ\u0000Î«Í¶Ì\u0085ÓGÒ!Ðö×ÅÖ\u009aÕ`Ô\u000bÛ\u0003ÙÑØªßmÞ@±³°È³\u0099²zµs´\u001f¶Ó¹¯¸w»Iº\b¼£¿»¾\u0089¡R 5¢ø\u0017«\u0016Ð\u0015\u0081\u0014b\u0013k\u0012\u0007\u0010Ë\u001f·\u001eo\u001dQ\u001c\u0010\u001a»\u0019µ\u0018\u0091\u0007I\u0006!\u0004à±³°ß³\u0085²\u007fµs´\u001d¶Ù¹¡¸i»sº\b¼þ¿½¾\u008f¡Y±³°ß³\u0085²\u007fµ(´\t¶Ñ¹ã¸p»Eº\u001e¼£¿°¾\u0085¡^ /¢Ã¥Á¤\u009d§`¦0©\u0003«ßª\u0093\u00adx¬I¯\u001e\u0091ù\u0090»\u0093³\u0092M\u0095)\u0097ñ\u0096Ù\u0099Ò\u0098\u007f\u009b3\u0095\u0082\u0094ù\u0097¨\u0096K\u0091B\u0090?\u0092þ\u009d\u0089\u009cr\u009fz\u009e=\u0098Î±³°È³\u0099²zµs´\u000e¶Ï¹¸¸C»Xº\u0015¼á¿¹±³°È³\u0099²zµs´\u001f¶Ó¹¯¸w»Iº\b¼£¿¾¾\u009f¡H *¢ó¥À¤\u0098§i¦.©\b`\u0088aäb¾cDd\u0013e2gêhØiKj~k%m\u0098n\u008bo¾peq\u0015sÔtãu¡vXw\u000bx3zâ{\u0085|x}}~)@ÞAÉB¤Ch±³°È³\u0099²zµs´\u000e¶Ï¹¸¸}»Oº\u001f¼é±³°È³\u0099²zµs´\u000e¶Ï¹¸¸{»Uº\u000e¼ã9\u00958î;¿:\\=U<(>é1\u009e0W3o2=4Ä±³°È³\u0099²zµs´\u000e¶Ï¹¸¸s»^º\u0015¼éí\u0013ìhï9îÚéÓè®êoå\u0018äÊçáæ¯àK±³°È³\u0099²zµs´\u000e¶Ï¹¸¸l»Kº\u001d¼å¿¬¾\u008f+\u009c*ç)¶(U/\\.!,à#\u0097\"l!j >&Æ:·;Ì8\u00999|>9?G=Ü2§3o0F1\u00147ç4¹5\u008c*K+g)¶.Ð/\u009a,'-:\"\u001b Ì!£èÝé¯êüë\u0016ì\u001díuï»àÌá\u0016â-ãeå\u0091æ\u009dçÀø!ùVû¡üªýóþ\u0010ÿWðfò\u0094óÍô\u001eõ&öwÈ\u0090±³°Ü³\u008e²cµ?´C¶Õ¹£¸l»Cº\u000e¼ø¿¯±¬°Ê³\u009a²,µf\u0015E\u0014*\u0017x\u0016\u0095\u0011É\u0010µ\u00129\u001d_\u001c\u0086\u001f¼\u001e¥\u0018\u0017\u001bK\u001aj\u0005¹±û°Þ³\u009d²`µ0´\u0003¶ß¹â¸{»Cº\u0010¼è¿º¾\u0085¡O $¢²¥ß¤\u0093oînÛm\u0080lUk\u000ej7hñg\u008df`eAd\u0016b¼a±`\u009d±³°É³\u0088²oµs´\u0001¶Ù¹¨¸u»Mº#¼ï¿³¾\u0088¡Y /¢ï¥\u0082¤\u0084§a¦0dVehf!gÁ`\u0087a°cul\u0007mßn÷±³°É³\u0088²oµs´\u0001¶Ó¹¹¸r»Xº\u000f±³°È³\u009d²xµ=´C¶Ø¹£¸k»Bº\u0010¼ã¿½¾\u0088¡O c¢²¥È¤\u008c§#¦=©\u001c«Ìª¿\u00ad2¬T¯\u0011\u0091à¾\u007f¿\u0010¼B½¯ºó»\u008f¹\u0013¶p·¥´\u0089µÞ³&°\u007f±Û°Ã³\u0090²hµ:´\u0005¶Ï¹¤±³°È³\u009d²xµ=´C¶Ñ¹¥¸o»OºS¼ü¿®¾\u0083¡Z %¢ð¥É¤\u008f§#¦?©\u0019«Îªã\u00ad,¬\u0003¯\u001f\u0091ã\u0090±\u0093Â\u0092Q\u0095%\u0097ÿ\u0096Þ\u0099\u0093\u0098z\u009b5\u009a\u001e\u009cÈ\u009fâ\u009eq\u0081I\u0080\u0011\u0082ù\u0085µ\u0084\u0081\u0087Y".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
                    b = -9202669733710548820L;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$e(short r6, short r7, byte r8) {
                    /*
                        byte[] r0 = defpackage.getRootMenu.$$c
                        int r8 = r8 * 3
                        int r8 = 115 - r8
                        int r6 = r6 * 2
                        int r1 = r6 + 1
                        int r7 = r7 * 2
                        int r7 = 4 - r7
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r6
                        r4 = r2
                        goto L2a
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r8
                        r1[r3] = r4
                        if (r3 != r6) goto L22
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L22:
                        int r3 = r3 + 1
                        r4 = r0[r7]
                        r5 = r3
                        r3 = r8
                        r8 = r4
                        r4 = r5
                    L2a:
                        int r8 = -r8
                        int r8 = r8 + r3
                        int r7 = r7 + 1
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.getRootMenu.$$e(short, short, byte):java.lang.String");
                }
            }, new getHeaderView(new Function1() { // from class: getNonActionItems
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getHeaderTitle.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
                }
            })));
        }
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
    }

    public static /* synthetic */ Unit b(getHeaderTitle getheadertitle, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getHeaderTitle getheadertitle, MotionCheckConnectResponse motionCheckConnectResponse) {
        MutableLiveData<VirtualCameraAdapter1<MotionCheckConnectResponse>> mutableLiveData = getheadertitle.b;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(motionCheckConnectResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getHeaderTitle getheadertitle, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getheadertitle.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getHeaderTitle getheadertitle, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getHeaderTitle getheadertitle, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getheadertitle.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getHeaderTitle getheadertitle, MotionLinkingResponse motionLinkingResponse) {
        MutableLiveData<VirtualCameraAdapter1<MotionLinkingResponse>> mutableLiveData = getheadertitle.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(motionLinkingResponse));
        return Unit.INSTANCE;
    }
}
