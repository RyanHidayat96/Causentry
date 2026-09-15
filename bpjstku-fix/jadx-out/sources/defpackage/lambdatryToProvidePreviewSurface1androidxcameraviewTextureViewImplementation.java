package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import kotlin.collections.ArraysUtilJVM;
import kotlin.io.encoding.Base64;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public class lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation {
    private static boolean IconCompatParcelizer;
    private static final TextureViewImplementationExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
    private static final Map<Class<?>, List<Class<?>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static volatile lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation b;
    private static boolean connect;
    private static int disconnect;
    private static char[] read;
    private static int write;
    private final lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation INotificationSideChannel;
    private final onSurfaceTextureAvailable INotificationSideChannelDefault;
    private final Map<Class<?>, Object> INotificationSideChannelStub;
    private final boolean INotificationSideChannelStubProxy;
    private final Map<Object, List<Class<?>>> MediaBrowserCompat;
    private final Map<Class<?>, CopyOnWriteArrayList<onSurfaceTextureUpdated>> RemoteActionCompatParcelizer;
    final lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lambdaonSurfaceRequested0androidxcameraviewTextureViewImplementation f1271a;
    private final TextureViewImplementation asBinder;
    private final int asInterface;
    private final boolean cancel;
    private final boolean cancelAll;
    private final boolean d;
    private final ThreadLocal<TuitionPaymentFragmentspecialinlinedviewModeldefault1> g;
    private final boolean getInterfaceDescriptor;
    private final boolean notify;
    private final TextureViewImplementationExternalSyntheticLambda4 onTransact;
    private static final byte[] $$c = {12, 11, -9, -106};
    private static final int $$d = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 116;
    private static int getRoot = 0;
    private static int getNotifyChildrenChangedOptions = 1;
    private static int getItem = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = i7 | i6;
        int i9 = ~(i8 | i5);
        int i10 = (~i5) | (~((~i6) | i2));
        int i11 = (~(i5 | i6)) | (~(i7 | i5)) | (~i8);
        int i12 = i2 + i6 + i3 + ((-953487067) * i) + ((-1992133889) * i4);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i6) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i3) + ((-1703411712) * i) + (1961361408 * i4) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i6 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i3 * 272662391) + (i * 2077717299) + (i4 * 1957688713) + (i13 * 166854656);
        return i14 + ((i15 * i15) * (-213778432)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 84 - r8
            int r7 = r7 * 4
            int r7 = r7 + 53
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r5 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2e:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-11)
            r9 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.e(short, short, short, java.lang.Object[]):void");
    }

    static {
        disconnect = 0;
        TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentbindingInflater1 = new TextureViewImplementationExternalSyntheticLambda0();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();
        int i = getItem + 111;
        disconnect = i % 128;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }

    public static lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2 = b;
        if (lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2 != null) {
            return lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2;
        }
        synchronized (lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.class) {
            lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = b;
            if (lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation == null) {
                lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = new lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation();
                b = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
            }
        }
        return lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
    }

    public lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation() {
        this(TuitionPaymentFragmentbindingInflater1);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d A[PHI: r2
  0x008d: PHI (r2v5 TextureViewImplementationExternalSyntheticLambda4) = (r2v4 TextureViewImplementationExternalSyntheticLambda4), (r2v8 TextureViewImplementationExternalSyntheticLambda4) binds: [B:26:0x0098, B:22:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    private lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation(TextureViewImplementationExternalSyntheticLambda0 textureViewImplementationExternalSyntheticLambda0) {
        lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation tuitionPaymentFragmentbindingInflater1;
        lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2;
        this.g = new ThreadLocal<TuitionPaymentFragmentspecialinlinedviewModeldefault1>() { // from class: lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.1
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1 initialValue() {
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        };
        lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface2androidxcameraviewtextureviewimplementation = textureViewImplementationExternalSyntheticLambda0.f234a;
        if (!onSurfaceTextureSizeChanged.b() || lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b() == null) {
            tuitionPaymentFragmentbindingInflater1 = new lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentbindingInflater1();
            int i = getRoot + 49;
            getNotifyChildrenChangedOptions = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            tuitionPaymentFragmentbindingInflater1 = new onSurfaceTextureSizeChanged("EventBus");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        this.RemoteActionCompatParcelizer = new HashMap();
        this.MediaBrowserCompat = new HashMap();
        this.INotificationSideChannelStub = new ConcurrentHashMap();
        lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation lambdawaitfornextframe3androidxcameraviewtextureviewimplementation = textureViewImplementationExternalSyntheticLambda0.g;
        TextureViewImplementationExternalSyntheticLambda4 textureViewImplementationExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1 = null;
        if (onSurfaceTextureSizeChanged.b()) {
            int i4 = getRoot + 119;
            getNotifyChildrenChangedOptions = i4 % 128;
            if (i4 % 2 == 0) {
                TextureViewImplementationExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1();
                textureViewImplementationExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1.hashCode();
                throw null;
            }
            Object objTuitionPaymentFragmentbindingInflater1 = TextureViewImplementationExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1();
            if (objTuitionPaymentFragmentbindingInflater1 == null) {
                int i5 = 2 % 2;
                tuitionPaymentFragmentbindingInflater2 = null;
            } else {
                tuitionPaymentFragmentbindingInflater2 = new lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentbindingInflater1((Looper) objTuitionPaymentFragmentbindingInflater1);
                int i6 = 2 % 2;
            }
        } else {
            tuitionPaymentFragmentbindingInflater2 = null;
        }
        this.INotificationSideChannel = tuitionPaymentFragmentbindingInflater2;
        if (tuitionPaymentFragmentbindingInflater2 != null) {
            textureViewImplementationExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1(this);
            int i7 = getRoot + 11;
            getNotifyChildrenChangedOptions = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 / 5;
            } else {
                int i9 = 2 % 2;
            }
        } else {
            int i10 = getRoot + 103;
            getNotifyChildrenChangedOptions = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 2 % 2;
            }
        }
        this.onTransact = textureViewImplementationExternalSyntheticLambda4TuitionPaymentFragmentbindingInflater1;
        this.asBinder = new TextureViewImplementation(this);
        this.f1271a = new lambdaonSurfaceRequested0androidxcameraviewTextureViewImplementation(this);
        List<ZoomGestureDetector> list = textureViewImplementationExternalSyntheticLambda0.cancel;
        this.asInterface = 0;
        this.INotificationSideChannelDefault = new onSurfaceTextureAvailable(textureViewImplementationExternalSyntheticLambda0.cancel, textureViewImplementationExternalSyntheticLambda0.d, textureViewImplementationExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1);
        this.cancelAll = textureViewImplementationExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.notify = textureViewImplementationExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.getInterfaceDescriptor = textureViewImplementationExternalSyntheticLambda0.asInterface;
        this.cancel = textureViewImplementationExternalSyntheticLambda0.asBinder;
        this.INotificationSideChannelStubProxy = textureViewImplementationExternalSyntheticLambda0.cancelAll;
        this.d = textureViewImplementationExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = textureViewImplementationExternalSyntheticLambda0.b;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        List<onSurfaceTextureDestroyed> listTuitionPaymentFragmentbindingInflater1 = this.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1(obj.getClass());
        synchronized (this) {
            Iterator<onSurfaceTextureDestroyed> it = listTuitionPaymentFragmentbindingInflater1.iterator();
            while (it.hasNext()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, it.next());
            }
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, onSurfaceTextureDestroyed onsurfacetexturedestroyed) {
        int i = 2 % 2;
        Class<?> cls = onsurfacetexturedestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        onSurfaceTextureUpdated onsurfacetextureupdated = new onSurfaceTextureUpdated(obj, onsurfacetexturedestroyed);
        CopyOnWriteArrayList<onSurfaceTextureUpdated> copyOnWriteArrayList = this.RemoteActionCompatParcelizer.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.RemoteActionCompatParcelizer.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(onsurfacetextureupdated)) {
            StringBuilder sb = new StringBuilder("Subscriber ");
            sb.append(obj.getClass());
            sb.append(" already registered to event ");
            sb.append(cls);
            throw new EventBusException(sb.toString());
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 != size) {
                int i3 = getRoot + 85;
                getNotifyChildrenChangedOptions = i3 % 128;
                int i4 = i3 % 2;
                if (onsurfacetexturedestroyed.TuitionPaymentFragmentspecialinlinedviewModeldefault2 <= copyOnWriteArrayList.get(i2).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                }
            }
            copyOnWriteArrayList.add(i2, onsurfacetextureupdated);
            break;
        }
        List<Class<?>> arrayList = this.MediaBrowserCompat.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.MediaBrowserCompat.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (onsurfacetexturedestroyed.b) {
            int i5 = getRoot + 105;
            getNotifyChildrenChangedOptions = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (!this.d) {
                Object[] objArr = {this, onsurfacetextureupdated, this.INotificationSideChannelStub.get(cls)};
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1827485661, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1827485660, objArr);
                return;
            }
            int i6 = getRoot + 121;
            getNotifyChildrenChangedOptions = i6 % 128;
            int i7 = i6 % 2;
            for (Map.Entry<Class<?>, Object> entry : this.INotificationSideChannelStub.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    int i8 = getNotifyChildrenChangedOptions + 75;
                    getRoot = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object[] objArr2 = {this, onsurfacetextureupdated, entry.getValue()};
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1827485661, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1827485660, objArr2);
                        int i9 = 61 / 0;
                    } else {
                        Object[] objArr3 = {this, onsurfacetextureupdated, entry.getValue()};
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1827485661, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), -1827485660, objArr3);
                    }
                }
            }
        }
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = read;
        long j = 0;
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 31339);
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2994;
                        int i4 = 17 - (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1));
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maxKeyCode, i4, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(write)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            char c2 = '0';
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.MeasureSpec.getMode(0) + 43325), 252 - TextUtils.indexOf((CharSequence) "", '0'), 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i5 = 33603;
            int i6 = 1687675375;
            if (connect) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", c2) + 33603), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3085, TextUtils.getOffsetBefore("", 0) + 26, -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    c2 = '0';
                }
                objArr[0] = new String(cArr5);
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            if (!IconCompatParcelizer) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            int i9 = $11 + 77;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            } else {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            }
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3085, 26 - TextUtils.indexOf("", "", 0, 0), -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i5 = 33603;
                i6 = 1687675375;
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        boolean z = false;
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = (lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation) objArr[0];
        onSurfaceTextureUpdated onsurfacetextureupdated = (onSurfaceTextureUpdated) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 85;
        int i3 = i2 % 128;
        getRoot = i3;
        int i4 = i2 % 2;
        if (obj != null) {
            lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation lambdawaitfornextframe3androidxcameraviewtextureviewimplementation = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation.INotificationSideChannel;
            if (lambdawaitfornextframe3androidxcameraviewtextureviewimplementation != null) {
                int i5 = i3 + 87;
                getNotifyChildrenChangedOptions = i5 % 128;
                if (i5 % 2 == 0) {
                    lambdawaitfornextframe3androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentbindingInflater1();
                    throw null;
                }
                if (lambdawaitfornextframe3androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentbindingInflater1()) {
                    int i6 = getNotifyChildrenChangedOptions + 41;
                    getRoot = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                }
            } else {
                int i8 = getNotifyChildrenChangedOptions + 41;
                getRoot = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            }
            lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation.b(onsurfacetextureupdated, obj, z);
        }
        return null;
    }

    private void TuitionPaymentFragmentbindingInflater1(Object obj, Class<?> cls) {
        int i = 2 % 2;
        int i2 = getRoot + 57;
        getNotifyChildrenChangedOptions = i2 % 128;
        int i3 = i2 % 2;
        CopyOnWriteArrayList<onSurfaceTextureUpdated> copyOnWriteArrayList = this.RemoteActionCompatParcelizer.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = getNotifyChildrenChangedOptions + 73;
                getRoot = i5 % 128;
                int i6 = i5 % 2;
                onSurfaceTextureUpdated onsurfacetextureupdated = copyOnWriteArrayList.get(i4);
                if (onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == obj) {
                    onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                    copyOnWriteArrayList.remove(i4);
                    i4--;
                    size--;
                }
                i4++;
            }
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(Object obj) {
        synchronized (this) {
            List<Class<?>> list = this.MediaBrowserCompat.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    TuitionPaymentFragmentbindingInflater1(obj, it.next());
                }
                this.MediaBrowserCompat.remove(obj);
            } else {
                lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface2androidxcameraviewtextureviewimplementation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder("Subscriber to unregister was not registered before: ");
                sb.append(obj.getClass());
                lambdatrytoprovidepreviewsurface2androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(level, sb.toString());
            }
        }
    }

    public final void b(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 25;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.g.get();
        List<Object> list = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        list.add(obj);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) {
            return;
        }
        lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation lambdawaitfornextframe3androidxcameraviewtextureviewimplementation = this.INotificationSideChannel;
        if (lambdawaitfornextframe3androidxcameraviewtextureviewimplementation == null || lambdawaitfornextframe3androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentbindingInflater1()) {
            z = true;
        } else {
            int i4 = getNotifyChildrenChangedOptions + 33;
            getRoot = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = z;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = true;
        boolean z2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i6 = getNotifyChildrenChangedOptions + 13;
        getRoot = i6 % 128;
        int i7 = i6 % 2;
        while (!list.isEmpty()) {
            try {
                b(list.remove(0), tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } catch (Throwable th) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = false;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = false;
                throw th;
            }
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = false;
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = false;
    }

    private void b(Object obj, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) throws Error {
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List<Class<?>> listTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int size;
        int i;
        int i2 = 2 % 2;
        int i3 = getRoot + 113;
        getNotifyChildrenChangedOptions = i3 % 128;
        if (i3 % 2 == 0) {
            obj.getClass();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Class<?> cls = obj.getClass();
        if (this.d) {
            int i4 = getNotifyChildrenChangedOptions + 97;
            getRoot = i4 % 128;
            if (i4 % 2 != 0) {
                listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls);
                size = listTuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
                zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                i = 0;
            } else {
                listTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(cls);
                size = listTuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
                zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                i = 0;
            }
            while (i < size) {
                int i5 = getNotifyChildrenChangedOptions + 63;
                getRoot = i5 % 128;
                if (i5 % 2 != 0) {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault3 |= TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, tuitionPaymentFragmentspecialinlinedviewModeldefault1, listTuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i));
                    i += 108;
                } else {
                    zTuitionPaymentFragmentspecialinlinedviewModeldefault3 |= TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, tuitionPaymentFragmentspecialinlinedviewModeldefault1, listTuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i));
                    i++;
                }
            }
        } else {
            zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, tuitionPaymentFragmentspecialinlinedviewModeldefault1, cls);
        }
        if (zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return;
        }
        if (this.notify) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Level.FINE, "No subscribers registered for event ".concat(String.valueOf(cls)));
        }
        if (!this.cancel || cls == TextureViewImplementationExternalSyntheticLambda2.class) {
            return;
        }
        int i6 = getRoot + 41;
        getNotifyChildrenChangedOptions = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
            if (cls == TextureViewImplementation1.class) {
                return;
            }
        } else if (cls == TextureViewImplementation1.class) {
            return;
        }
        b(new TextureViewImplementationExternalSyntheticLambda2(this, obj));
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, Class<?> cls) {
        CopyOnWriteArrayList<onSurfaceTextureUpdated> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.RemoteActionCompatParcelizer.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (onSurfaceTextureUpdated onsurfacetextureupdated : copyOnWriteArrayList) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder = onsurfacetextureupdated;
            try {
                b(onsurfacetextureupdated, obj, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                boolean z = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder = null;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            } catch (Throwable th) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder = null;
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            b = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void b(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj, boolean z) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 41;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        int i4 = AnonymousClass5.b[onsurfacetextureupdated.TuitionPaymentFragmentbindingInflater1.asBinder.ordinal()];
        if (i4 == 1) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1545908961, new Object[]{this, onsurfacetextureupdated, obj});
            return;
        }
        if (i4 == 2) {
            if (z) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault6, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault5, -1545908961, new Object[]{this, onsurfacetextureupdated, obj});
                return;
            }
            this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onsurfacetextureupdated, obj);
            return;
        }
        int i5 = getRoot + 65;
        int i6 = i5 % 128;
        getNotifyChildrenChangedOptions = i6;
        int i7 = i5 % 2;
        if (i4 == 3) {
            TextureViewImplementationExternalSyntheticLambda4 textureViewImplementationExternalSyntheticLambda4 = this.onTransact;
            if (textureViewImplementationExternalSyntheticLambda4 != null) {
                textureViewImplementationExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onsurfacetextureupdated, obj);
                return;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault8, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault7, -1545908961, new Object[]{this, onsurfacetextureupdated, obj});
            return;
        }
        if (i4 == 4) {
            if (z) {
                this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(onsurfacetextureupdated, obj);
                return;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault10, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault9, -1545908961, new Object[]{this, onsurfacetextureupdated, obj});
            return;
        }
        int i8 = i6 + 13;
        getRoot = i8 % 128;
        if (i8 % 2 == 0 ? i4 == 5 : i4 == 5) {
            lambdaonSurfaceRequested0androidxcameraviewTextureViewImplementation lambdaonsurfacerequested0androidxcameraviewtextureviewimplementation = this.f1271a;
            lambdaonsurfacerequested0androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TextureViewImplementationExternalSyntheticLambda3.b(onsurfacetextureupdated, obj));
            lambdaonsurfacerequested0androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.execute(lambdaonsurfacerequested0androidxcameraviewtextureviewimplementation);
            return;
        }
        StringBuilder sb = new StringBuilder("Unknown thread mode: ");
        sb.append(onsurfacetextureupdated.TuitionPaymentFragmentbindingInflater1.asBinder);
        throw new IllegalStateException(sb.toString());
    }

    private static List<Class<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList, superclass.getInterfaces());
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<Class<?>> list, Class<?>[] clsArr) {
        int i = 2 % 2;
        int i2 = getNotifyChildrenChangedOptions + 63;
        getRoot = i2 % 128;
        int length = i2 % 2 != 0 ? clsArr.length : clsArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = getRoot + 87;
            getNotifyChildrenChangedOptions = i4 % 128;
            int i5 = i4 % 2;
            Class<?> cls = clsArr[i3];
            if (!list.contains(cls)) {
                list.add(cls);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(list, cls.getInterfaces());
                int i6 = getRoot + 3;
                getNotifyChildrenChangedOptions = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        boolean TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final List<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
        Object TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        onSurfaceTextureUpdated asBinder;
        boolean b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
        int i = 0;
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2 = (lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation) objArr[0];
        onSurfaceTextureUpdated onsurfacetextureupdated = (onSurfaceTextureUpdated) objArr[1];
        Object obj = objArr[2];
        int i2 = 2 % 2;
        int i3 = getNotifyChildrenChangedOptions + 89;
        getRoot = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46401 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 39 - TextUtils.lastIndexOf("", '0'), 19 - ExpandableListView.getPackedPositionType(0L), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr2 = new Object[1];
        c(null, null, TextUtils.getTrimmedLength("") + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j = 464;
        long j2 = -1;
        long j3 = j2 ^ (-1182955017554947347L);
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j4 = jElapsedRealtime ^ j2;
        long j5 = (j3 | 3280212192296906334L) ^ j2;
        long j6 = (((long) 465) * 3280212192296906334L) + (((long) (-463)) * (-1182955017554947347L)) + ((((j3 | j4) ^ j2) | j5 | ((j4 | 3280212192296906334L) ^ j2)) * j) + (((long) (-464)) * ((j2 ^ 3280212192296906334L) | jElapsedRealtime | j3)) + (j * (j5 | (j2 ^ (jElapsedRealtime | 3280212192296906334L))));
        int i6 = 0;
        long j7 = jLongValue;
        while (true) {
            if (i6 == 10) {
                lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2;
                Object[] objArr4 = new Object[1];
                c(null, null, Color.blue(i) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[i]);
                Object[] objArr5 = new Object[1];
                c(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr5);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr5[i], Object.class).invoke(null, lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation)).intValue();
                try {
                    Object[] objArr6 = {-1448365002};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46038 - TextUtils.indexOf("", "")), 1135 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 18 - TextUtils.indexOf("", "", 0), 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -773059584, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr6), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int iRed = 1031 - Color.red(0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 15;
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr8 = new Object[1];
                        e(b2, b3, b3, objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iRed, capsMode, 1298546779, false, (String) objArr8[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ExpandableListView.getPackedPositionType(0L) + 45993), (ViewConfiguration.getEdgeSlop() >> 16) + 1117, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
                    }
                    Object[] objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr7);
                    int i7 = ((int[]) objArr9[1])[0];
                    int i8 = ((int[]) objArr9[3])[0];
                    if (i8 == i7) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr9[0];
                    if (strArr != null) {
                        for (String str : strArr) {
                            int i9 = getNotifyChildrenChangedOptions + 119;
                            getRoot = i9 % 128;
                            int i10 = i9 % 2;
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37836 - KeyEvent.keyCodeFromString("")), 59 - View.resolveSizeAndState(i, i, i), 18 - TextUtils.getTrimmedLength(""), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            int i12 = getNotifyChildrenChangedOptions + 1;
            getRoot = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i;
            long j8 = j7;
            while (true) {
                int i15 = i;
                while (i15 != 8) {
                    i11 = (((((int) (j8 >> i15)) & 255) + (i11 << 6)) + (i11 << 16)) - i11;
                    i15++;
                    lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2 = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2;
                }
                lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2;
                if (i14 != 0) {
                    break;
                }
                i14++;
                j8 = j6;
                lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2 = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
                i = 0;
            }
            if (i11 == i5) {
                break;
            }
            int i16 = getNotifyChildrenChangedOptions + 47;
            getRoot = i16 % 128;
            if (i16 % 2 != 0) {
                j7 &= 1024;
                i6 += 110;
            } else {
                j7 -= 1024;
                i6++;
            }
            lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation2 = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
            i = 0;
        }
        try {
            onsurfacetextureupdated.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault3, obj);
            return null;
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        } catch (InvocationTargetException e3) {
            lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation.TuitionPaymentFragmentbindingInflater1(onsurfacetextureupdated, obj, e3.getCause());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r5.cancelAll != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        r1 = java.util.logging.Level.SEVERE;
        r2 = new java.lang.StringBuilder("SubscriberExceptionEvent subscriber ");
        r2.append(r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass());
        r2.append(" threw an exception");
        r0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1, r2.toString(), r8);
        r7 = (defpackage.TextureViewImplementation1) r7;
        r6 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        r8 = java.util.logging.Level.SEVERE;
        r0 = new java.lang.StringBuilder("Initial event ");
        r0.append(r7.b);
        r0.append(" caused exception in ");
        r0.append(r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8, r0.toString(), r7.TuitionPaymentFragmentbindingInflater1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r5.cancelAll != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void TuitionPaymentFragmentbindingInflater1(defpackage.onSurfaceTextureUpdated r6, java.lang.Object r7, java.lang.Throwable r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.getRoot
            int r1 = r1 + 95
            int r2 = r1 % 128
            defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.getNotifyChildrenChangedOptions = r2
            int r1 = r1 % r0
            boolean r1 = r7 instanceof defpackage.TextureViewImplementation1
            if (r1 == 0) goto L6c
            int r2 = r2 + 83
            int r1 = r2 % 128
            defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.getRoot = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L22
            boolean r1 = r5.cancelAll
            r2 = 9
            int r2 = r2 / 0
            if (r1 == 0) goto La9
            goto L26
        L22:
            boolean r1 = r5.cancelAll
            if (r1 == 0) goto La9
        L26:
            lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation r0 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SubscriberExceptionEvent subscriber "
            r2.<init>(r3)
            java.lang.Object r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Class r6 = r6.getClass()
            r2.append(r6)
            java.lang.String r6 = " threw an exception"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r1, r6, r8)
            TextureViewImplementation1 r7 = (defpackage.TextureViewImplementation1) r7
            lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation r6 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.logging.Level r8 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Initial event "
            r0.<init>(r1)
            java.lang.Object r1 = r7.b
            r0.append(r1)
            java.lang.String r1 = " caused exception in "
            r0.append(r1)
            java.lang.Object r1 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r7 = r7.TuitionPaymentFragmentbindingInflater1
            r6.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r8, r0, r7)
            return
        L6c:
            boolean r1 = r5.INotificationSideChannelStubProxy
            if (r1 != 0) goto Lb7
            boolean r1 = r5.cancelAll
            if (r1 == 0) goto L9b
            lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation r1 = r5.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Could not dispatch event: "
            r3.<init>(r4)
            java.lang.Class r4 = r7.getClass()
            r3.append(r4)
            java.lang.String r4 = " to subscribing class "
            r3.append(r4)
            java.lang.Object r4 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            java.lang.Class r4 = r4.getClass()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r2, r3, r8)
        L9b:
            boolean r1 = r5.getInterfaceDescriptor
            if (r1 == 0) goto La9
            TextureViewImplementation1 r1 = new TextureViewImplementation1
            java.lang.Object r6 = r6.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r1.<init>(r5, r8, r7, r6)
            r5.b(r1)
        La9:
            int r6 = defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.getRoot
            int r6 = r6 + 109
            int r7 = r6 % 128
            defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.getNotifyChildrenChangedOptions = r7
            int r6 = r6 % r0
            if (r6 == 0) goto Lb5
            return
        Lb5:
            r6 = 0
            throw r6
        Lb7:
            org.greenrobot.eventbus.EventBusException r6 = new org.greenrobot.eventbus.EventBusException
            java.lang.String r7 = "Invoking subscriber failed"
            r6.<init>(r7, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentbindingInflater1(onSurfaceTextureUpdated, java.lang.Object, java.lang.Throwable):void");
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("EventBus[indexCount=");
        sb.append(this.asInterface);
        sb.append(", eventInheritance=");
        sb.append(this.d);
        sb.append("]");
        String string = sb.toString();
        int i2 = getNotifyChildrenChangedOptions + 57;
        getRoot = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1827485661, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1827485660, new Object[]{this, onsurfacetextureupdated, obj});
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1545908961, new Object[]{this, onsurfacetextureupdated, obj});
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        read = new char[]{47234, 47285, 47295, 47281, 47284, 47290, 47221, 47280, 47248, 47274, 47279, 47294, 47286, 47200, 47287, 47232, 47288, 47283, 47249, 47289, 47277, 47292, 47259, 47291};
        write = 2047719459;
        IconCompatParcelizer = true;
        connect = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.$$c
            int r6 = r6 + 67
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.$$e(short, short, short):java.lang.String");
    }
}
