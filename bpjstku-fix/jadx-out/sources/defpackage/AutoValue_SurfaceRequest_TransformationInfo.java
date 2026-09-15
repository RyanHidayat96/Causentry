package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoValue_SurfaceRequest_TransformationInfo implements getMirroring {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "StandardGifDecoder";
    private final int[] INotificationSideChannel;
    private Bitmap INotificationSideChannelDefault;
    private ByteBuffer INotificationSideChannelStub;
    private boolean INotificationSideChannelStubProxy;
    private byte[] MediaBrowserCompat;
    private int RemoteActionCompatParcelizer;
    private int[] TuitionPaymentFragmentbindingInflater1;
    private final getMirroring.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Bitmap.Config TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f86a;
    private int asBinder;
    private Boolean asInterface;
    private byte[] b;
    private byte[] cancel;
    private byte[] cancelAll;
    private int d;
    private AutoValue_SurfaceRequest_Result g;
    private int getInterfaceDescriptor;
    private short[] notify;
    private int[] onTransact;

    public AutoValue_SurfaceRequest_TransformationInfo(getMirroring.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, AutoValue_SurfaceRequest_Result autoValue_SurfaceRequest_Result, ByteBuffer byteBuffer, int i) {
        this(tuitionPaymentFragmentbindingInflater1);
        synchronized (this) {
            try {
                if (i <= 0) {
                    StringBuilder sb = new StringBuilder("Sample size must be >=0, not: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.RemoteActionCompatParcelizer = 0;
                this.g = autoValue_SurfaceRequest_Result;
                this.d = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.INotificationSideChannelStub = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.INotificationSideChannelStub.order(ByteOrder.LITTLE_ENDIAN);
                this.INotificationSideChannelStubProxy = false;
                Iterator<getSurfaceOutput> it = autoValue_SurfaceRequest_Result.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
                while (it.hasNext()) {
                    if (it.next().TuitionPaymentFragmentbindingInflater1 == 3) {
                        this.INotificationSideChannelStubProxy = true;
                        break;
                    }
                }
                this.getInterfaceDescriptor = iHighestOneBit;
                this.asBinder = autoValue_SurfaceRequest_Result.INotificationSideChannel / iHighestOneBit;
                this.f86a = autoValue_SurfaceRequest_Result.g / iHighestOneBit;
                this.cancel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_SurfaceRequest_Result.INotificationSideChannel * autoValue_SurfaceRequest_Result.g);
                this.onTransact = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(this.asBinder * this.f86a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private AutoValue_SurfaceRequest_TransformationInfo(getMirroring.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.INotificationSideChannel = new int[256];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bitmap.Config.ARGB_8888;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
        this.g = new AutoValue_SurfaceRequest_Result();
    }

    @Override // defpackage.getMirroring
    public final ByteBuffer TuitionPaymentFragmentbindingInflater1() {
        return this.INotificationSideChannelStub;
    }

    @Override // defpackage.getMirroring
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.d = (this.d + 1) % this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.getMirroring
    public final int asBinder() {
        int i;
        if (this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0 || (i = this.d) < 0) {
            return 0;
        }
        if (i < 0 || i >= this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return -1;
        }
        return this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.getMirroring
    public final int g() {
        return this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.getMirroring
    public final int b() {
        return this.d;
    }

    @Override // defpackage.getMirroring
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.INotificationSideChannelStub.limit() + this.cancel.length + (this.onTransact.length * 4);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v51, types: [short] */
    /* JADX WARN: Type inference failed for: r2v53 */
    @Override // defpackage.getMirroring
    public final Bitmap asInterface() {
        byte b;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short s;
        Bitmap bitmap;
        int i8;
        synchronized (this) {
            if (this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 0 || this.d < 0) {
                if (Log.isLoggable(TuitionPaymentFragmentspecialinlinedviewModeldefault2, 3)) {
                    int i9 = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
                this.RemoteActionCompatParcelizer = 1;
            }
            int i10 = this.RemoteActionCompatParcelizer;
            if (i10 == 1 || i10 == 2) {
                Log.isLoggable(TuitionPaymentFragmentspecialinlinedviewModeldefault2, 3);
                return null;
            }
            byte b2 = 0;
            this.RemoteActionCompatParcelizer = 0;
            byte[] bArr = this.b;
            byte b3 = UByte.MAX_VALUE;
            if (bArr == null) {
                this.b = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(255);
            }
            getSurfaceOutput getsurfaceoutput = this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(this.d);
            int i11 = this.d - 1;
            getSurfaceOutput getsurfaceoutput2 = i11 >= 0 ? this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i11) : null;
            int[] iArr2 = getsurfaceoutput.g != null ? getsurfaceoutput.g : this.g.f85a;
            this.TuitionPaymentFragmentbindingInflater1 = iArr2;
            if (iArr2 == null) {
                Log.isLoggable(TuitionPaymentFragmentspecialinlinedviewModeldefault2, 3);
                this.RemoteActionCompatParcelizer = 1;
                return null;
            }
            if (getsurfaceoutput.cancel) {
                int[] iArr3 = this.TuitionPaymentFragmentbindingInflater1;
                System.arraycopy(iArr3, 0, this.INotificationSideChannel, 0, iArr3.length);
                int[] iArr4 = this.INotificationSideChannel;
                this.TuitionPaymentFragmentbindingInflater1 = iArr4;
                iArr4[getsurfaceoutput.asBinder] = 0;
                if (getsurfaceoutput.TuitionPaymentFragmentbindingInflater1 == 2 && this.d == 0) {
                    this.asInterface = Boolean.TRUE;
                }
            }
            int[] iArr5 = this.onTransact;
            if (getsurfaceoutput2 == null) {
                Bitmap bitmap2 = this.INotificationSideChannelDefault;
                if (bitmap2 != null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap2);
                }
                this.INotificationSideChannelDefault = null;
                Arrays.fill(iArr5, 0);
            }
            if (getsurfaceoutput2 != null && getsurfaceoutput2.TuitionPaymentFragmentbindingInflater1 == 3 && this.INotificationSideChannelDefault == null) {
                Arrays.fill(iArr5, 0);
            }
            if (getsurfaceoutput2 != null && getsurfaceoutput2.TuitionPaymentFragmentbindingInflater1 > 0) {
                if (getsurfaceoutput2.TuitionPaymentFragmentbindingInflater1 == 2) {
                    if (getsurfaceoutput.cancel) {
                        i8 = 0;
                    } else {
                        i8 = this.g.TuitionPaymentFragmentbindingInflater1;
                        if (getsurfaceoutput.g != null && this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == getsurfaceoutput.asBinder) {
                            i8 = 0;
                        }
                    }
                    int i12 = getsurfaceoutput2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / this.getInterfaceDescriptor;
                    int i13 = getsurfaceoutput2.d / this.getInterfaceDescriptor;
                    int i14 = getsurfaceoutput2.asInterface / this.getInterfaceDescriptor;
                    int i15 = getsurfaceoutput2.f992a / this.getInterfaceDescriptor;
                    int i16 = this.asBinder;
                    int i17 = (i13 * i16) + i15;
                    int i18 = i17;
                    while (i18 < (i12 * i16) + i17) {
                        for (int i19 = i18; i19 < i18 + i14; i19++) {
                            iArr5[i19] = i8;
                        }
                        i18 += this.asBinder;
                    }
                } else if (getsurfaceoutput2.TuitionPaymentFragmentbindingInflater1 == 3 && (bitmap = this.INotificationSideChannelDefault) != null) {
                    int i20 = this.asBinder;
                    bitmap.getPixels(iArr5, 0, i20, 0, 0, i20, this.f86a);
                }
            }
            if (getsurfaceoutput != null) {
                this.INotificationSideChannelStub.position(getsurfaceoutput.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            int i21 = getsurfaceoutput == null ? this.g.INotificationSideChannel * this.g.g : getsurfaceoutput.asInterface * getsurfaceoutput.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            byte[] bArr2 = this.cancel;
            if (bArr2 == null || bArr2.length < i21) {
                this.cancel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i21);
            }
            byte[] bArr3 = this.cancel;
            if (this.notify == null) {
                this.notify = new short[4096];
            }
            short[] sArr = this.notify;
            if (this.MediaBrowserCompat == null) {
                this.MediaBrowserCompat = new byte[4096];
            }
            byte[] bArr4 = this.MediaBrowserCompat;
            if (this.cancelAll == null) {
                this.cancelAll = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
            }
            byte[] bArr5 = this.cancelAll;
            int i22 = this.INotificationSideChannelStub.get() & UByte.MAX_VALUE;
            int i23 = 1 << i22;
            int i24 = i23 + 2;
            int i25 = i22 + 1;
            int i26 = (1 << i25) - 1;
            for (int i27 = 0; i27 < i23; i27++) {
                sArr[i27] = 0;
                bArr4[i27] = (byte) i27;
            }
            byte[] bArr6 = this.b;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            int i36 = i25;
            int i37 = i24;
            int i38 = i26;
            int i39 = -1;
            while (true) {
                if (i28 >= i21) {
                    b = b2;
                    break;
                }
                if (i29 == 0) {
                    int i40 = this.INotificationSideChannelStub.get() & b3;
                    if (i40 > 0) {
                        ByteBuffer byteBuffer = this.INotificationSideChannelStub;
                        byteBuffer.get(this.b, 0, Math.min(i40, byteBuffer.remaining()));
                    }
                    if (i40 <= 0) {
                        this.RemoteActionCompatParcelizer = 3;
                        b = 0;
                        break;
                    }
                    i29 = i40;
                    i35 = 0;
                } else {
                    i28 = i28;
                }
                i31 += (bArr6[i35] & UByte.MAX_VALUE) << i34;
                i35++;
                i29--;
                int i41 = i39;
                int i42 = i33;
                int i43 = i34 + 8;
                int i44 = i36;
                i28 = i28;
                byte[] bArr7 = bArr6;
                int i45 = i37;
                while (true) {
                    if (i43 < i44) {
                        i7 = i25;
                        i34 = i43;
                        break;
                    }
                    i7 = i25;
                    int i46 = i31 & i38;
                    i31 >>= i44;
                    i43 -= i44;
                    if (i46 != i23) {
                        i34 = i43;
                        if (i46 == i23 + 1) {
                            break;
                        }
                        if (i41 == -1) {
                            bArr3[i30] = bArr4[i46];
                            i30++;
                            i28++;
                            i41 = i46;
                            i42 = i41;
                        } else {
                            if (i46 >= i45) {
                                bArr5[i32] = (byte) i42;
                                i32++;
                                s = i41;
                            } else {
                                s = i46;
                            }
                            while (s >= i23) {
                                bArr5[i32] = bArr4[s];
                                i32++;
                                s = sArr[s];
                            }
                            int i47 = bArr4[s] & UByte.MAX_VALUE;
                            byte b4 = (byte) i47;
                            bArr3[i30] = b4;
                            while (true) {
                                i30++;
                                i28++;
                                if (i32 <= 0) {
                                    break;
                                }
                                i32--;
                                bArr3[i30] = bArr5[i32];
                            }
                            if (i45 < 4096) {
                                sArr[i45] = (short) i41;
                                bArr4[i45] = b4;
                                i45++;
                                if ((i45 & i38) == 0 && i45 < 4096) {
                                    i44++;
                                    i38 += i45;
                                }
                            }
                            i41 = i46;
                            i42 = i47;
                        }
                        i25 = i7;
                        i43 = i34;
                    } else {
                        i45 = i24;
                        i38 = i26;
                        i44 = i7;
                        i25 = i44;
                        i41 = -1;
                    }
                }
                i37 = i45;
                i36 = i44;
                bArr6 = bArr7;
                i25 = i7;
                b3 = UByte.MAX_VALUE;
                i39 = i41;
                i33 = i42;
                b2 = 0;
            }
            Arrays.fill(bArr3, i30, i21, b);
            if (!getsurfaceoutput.b && this.getInterfaceDescriptor == 1) {
                int[] iArr6 = this.onTransact;
                int i48 = getsurfaceoutput.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i49 = getsurfaceoutput.d;
                int i50 = getsurfaceoutput.asInterface;
                int i51 = getsurfaceoutput.f992a;
                byte b5 = this.d == 0 ? (byte) 1 : b;
                int i52 = this.asBinder;
                byte[] bArr8 = this.cancel;
                int[] iArr7 = this.TuitionPaymentFragmentbindingInflater1;
                int i53 = b;
                byte b6 = -1;
                while (i53 < i48) {
                    int i54 = (i53 + i49) * i52;
                    int i55 = i54 + i51;
                    int i56 = i55 + i50;
                    int i57 = i54 + i52;
                    if (i57 < i56) {
                        i56 = i57;
                    }
                    int i58 = getsurfaceoutput.asInterface * i53;
                    int i59 = i48;
                    int i60 = i55;
                    while (i60 < i56) {
                        int i61 = i49;
                        byte b7 = bArr8[i58];
                        int i62 = i50;
                        int i63 = b7 & UByte.MAX_VALUE;
                        if (i63 != b6) {
                            int i64 = iArr7[i63];
                            if (i64 != 0) {
                                iArr6[i60] = i64;
                            } else {
                                b6 = b7;
                            }
                        }
                        i58++;
                        i60++;
                        i49 = i61;
                        i50 = i62;
                    }
                    i53++;
                    i48 = i59;
                }
                Boolean bool = this.asInterface;
                this.asInterface = Boolean.valueOf((bool != null && bool.booleanValue()) || !(this.asInterface != null || b5 == 0 || b6 == -1));
                iArr = iArr5;
            } else {
                int[] iArr8 = this.onTransact;
                int i65 = getsurfaceoutput.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / this.getInterfaceDescriptor;
                int i66 = getsurfaceoutput.d / this.getInterfaceDescriptor;
                int i67 = getsurfaceoutput.asInterface / this.getInterfaceDescriptor;
                int i68 = getsurfaceoutput.f992a;
                int i69 = this.getInterfaceDescriptor;
                int i70 = i68 / i69;
                int i71 = this.d;
                Boolean bool2 = Boolean.TRUE;
                boolean z = i71 == 0;
                int i72 = this.asBinder;
                int i73 = this.f86a;
                byte[] bArr9 = this.cancel;
                int[] iArr9 = this.TuitionPaymentFragmentbindingInflater1;
                Boolean bool3 = this.asInterface;
                int i74 = 8;
                int i75 = 0;
                int i76 = 0;
                int i77 = 1;
                while (i76 < i65) {
                    int[] iArr10 = iArr5;
                    if (getsurfaceoutput.b) {
                        if (i75 >= i65) {
                            int i78 = i77 + 1;
                            i = i65;
                            if (i78 == 2) {
                                i75 = 4;
                                i77 = i78;
                            } else if (i78 != 3) {
                                i77 = i78;
                                if (i78 == 4) {
                                    i75 = 1;
                                    i74 = 2;
                                }
                            } else {
                                i74 = 4;
                                i77 = i78;
                                i75 = 2;
                            }
                        } else {
                            i = i65;
                        }
                        i2 = i75 + i74;
                    } else {
                        i = i65;
                        i2 = i75;
                        i75 = i76;
                    }
                    int i79 = i75 + i66;
                    boolean z2 = i69 == 1;
                    if (i79 < i73) {
                        int i80 = i79 * i72;
                        int i81 = i80 + i70;
                        i3 = i2;
                        int i82 = i81 + i67;
                        int i83 = i80 + i72;
                        if (i83 < i82) {
                            i82 = i83;
                        }
                        int i84 = getsurfaceoutput.asInterface * i76 * i69;
                        if (z2) {
                            int i85 = i81;
                            while (i85 < i82) {
                                int i86 = i66;
                                int i87 = i67;
                                int i88 = iArr9[bArr9[i84] & UByte.MAX_VALUE];
                                if (i88 != 0) {
                                    iArr8[i85] = i88;
                                } else if (z && bool3 == null) {
                                    bool3 = bool2;
                                }
                                i84 += i69;
                                i85++;
                                i66 = i86;
                                i67 = i87;
                            }
                        } else {
                            i5 = i66;
                            i4 = i67;
                            int i89 = i84;
                            int i90 = i81;
                            while (i90 < i82) {
                                int i91 = ((i82 - i81) * i69) + i84;
                                int i92 = i82;
                                int i93 = getsurfaceoutput.asInterface;
                                int i94 = i70;
                                int i95 = i72;
                                int i96 = 0;
                                int i97 = 0;
                                int i98 = 0;
                                int i99 = 0;
                                int i100 = 0;
                                int i101 = i89;
                                while (true) {
                                    if (i101 >= this.getInterfaceDescriptor + i89) {
                                        i6 = i84;
                                        break;
                                    }
                                    byte[] bArr10 = this.cancel;
                                    i6 = i84;
                                    if (i101 >= bArr10.length || i101 >= i91) {
                                        break;
                                    }
                                    int i102 = i73;
                                    int i103 = this.TuitionPaymentFragmentbindingInflater1[bArr10[i101] & UByte.MAX_VALUE];
                                    if (i103 != 0) {
                                        i96 += (i103 >> 24) & 255;
                                        i97 += (i103 >> 16) & 255;
                                        i98 += (i103 >> 8) & 255;
                                        i99 += i103 & 255;
                                        i100++;
                                    }
                                    i101++;
                                    i84 = i6;
                                    i73 = i102;
                                }
                                int i104 = i73;
                                int i105 = i93 + i89;
                                for (int i106 = i105; i106 < this.getInterfaceDescriptor + i105; i106++) {
                                    byte[] bArr11 = this.cancel;
                                    if (i106 >= bArr11.length || i106 >= i91) {
                                        break;
                                    }
                                    int i107 = this.TuitionPaymentFragmentbindingInflater1[bArr11[i106] & UByte.MAX_VALUE];
                                    if (i107 != 0) {
                                        i96 += (i107 >> 24) & 255;
                                        i97 += (i107 >> 16) & 255;
                                        i98 += (i107 >> 8) & 255;
                                        i99 += i107 & 255;
                                        i100++;
                                    }
                                }
                                int i108 = i100 == 0 ? 0 : ((i96 / i100) << 24) | ((i97 / i100) << 16) | ((i98 / i100) << 8) | (i99 / i100);
                                if (i108 != 0) {
                                    iArr8[i90] = i108;
                                } else if (z && bool3 == null) {
                                    bool3 = bool2;
                                }
                                i89 += i69;
                                i90++;
                                i82 = i92;
                                i70 = i94;
                                i72 = i95;
                                i84 = i6;
                                i73 = i104;
                            }
                        }
                        i76++;
                        iArr5 = iArr10;
                        i65 = i;
                        i75 = i3;
                        i66 = i5;
                        i67 = i4;
                        i70 = i70;
                        i72 = i72;
                        i73 = i73;
                    } else {
                        i3 = i2;
                    }
                    i5 = i66;
                    i4 = i67;
                    i76++;
                    iArr5 = iArr10;
                    i65 = i;
                    i75 = i3;
                    i66 = i5;
                    i67 = i4;
                    i70 = i70;
                    i72 = i72;
                    i73 = i73;
                }
                iArr = iArr5;
                if (this.asInterface == null) {
                    this.asInterface = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
                }
            }
            if (this.INotificationSideChannelStubProxy && (getsurfaceoutput.TuitionPaymentFragmentbindingInflater1 == 0 || getsurfaceoutput.TuitionPaymentFragmentbindingInflater1 == 1)) {
                if (this.INotificationSideChannelDefault == null) {
                    this.INotificationSideChannelDefault = d();
                }
                Bitmap bitmap3 = this.INotificationSideChannelDefault;
                int i109 = this.asBinder;
                bitmap3.setPixels(iArr, 0, i109, 0, 0, i109, this.f86a);
            }
            Bitmap bitmapD = d();
            int i110 = this.asBinder;
            bitmapD.setPixels(iArr, 0, i110, 0, 0, i110, this.f86a);
            return bitmapD;
        }
    }

    @Override // defpackage.getMirroring
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.g = null;
        byte[] bArr = this.cancel;
        if (bArr != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(bArr);
        }
        int[] iArr = this.onTransact;
        if (iArr != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(iArr);
        }
        Bitmap bitmap = this.INotificationSideChannelDefault;
        if (bitmap != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmap);
        }
        this.INotificationSideChannelDefault = null;
        this.INotificationSideChannelStub = null;
        this.asInterface = null;
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(bArr2);
        }
    }

    @Override // defpackage.getMirroring
    public final void b(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            StringBuilder sb = new StringBuilder("Unsupported format: ");
            sb.append(config);
            sb.append(", must be one of ");
            sb.append(Bitmap.Config.ARGB_8888);
            sb.append(" or ");
            sb.append(Bitmap.Config.RGB_565);
            throw new IllegalArgumentException(sb.toString());
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = config;
    }

    private Bitmap d() {
        Boolean bool = this.asInterface;
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(this.asBinder, this.f86a, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        bitmapTuitionPaymentFragmentbindingInflater1.setHasAlpha(true);
        return bitmapTuitionPaymentFragmentbindingInflater1;
    }
}
