package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.work.WorkInfo;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
final class zzcw implements ObjectEncoderContext {
    private static int TuitionPaymentFragmentbindingInflater1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final Charset zza;
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final ObjectEncoder zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzda zzi = new zzda(this);
    private static final byte[] $$c = {21, -108, 100, 114};
    private static final int $$f = 193;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {109, 48, -62, 38, -2, 21, -2, 11, 6, 11, 24, -4, 5, 28, -6, -9, 43, 6, -3, 4, 11, 11, -10, 28, 21, 13, -7, 23, 10, -59, 58, 22, -1, 23, 6, 3, 4, 29, -12, 7, 21, 1, 22, -8, 11, 21, 12, -4, 20, 11, 6, -3, 11, 23, 9, -1, 14, 2, -11, 43, 6, -3, 4, 11, 11, -23, 40, 12, 7, -56, 22, 42, -3, 20, -2, 15, 8, -21, 26, 33, -3, 1, 18, 15, -37, 53, -8, 15, 15, 1, 18, 15, -9, 16, 14, -1, 14, 14, 2, -21, 46, 1, 15, -2, 28, -6, 22, -56};
    private static final int $$e = 251;
    private static final byte[] $$a = {27, -8, 5, 78, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 143;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = builder2.withProperty(zzcqVar2.zzb()).build();
        zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcv
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                zzcw.zzg((Map.Entry) obj, objectEncoderContext);
            }
        };
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    zzcw(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r0 = 53 - r5
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = com.google.android.gms.internal.mlkit_vision_face.zzcw.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r5
            r3 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r7]
        L29:
            int r7 = r7 + 1
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzcw.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 67
            int r6 = r6 + 4
            int r8 = r8 * 24
            int r8 = r8 + 84
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzcw.$$d
            int r7 = r7 * 30
            int r1 = r7 + 38
            byte[] r1 = new byte[r1]
            int r7 = r7 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2e:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + (-9)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzcw.d(short, byte, short, java.lang.Object[]):void");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        int i = 2 % 2;
        zzcr zzcrVar = new zzcr();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzcrVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzcrVar.zza();
                zzcrVar.close();
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
                b = i2 % 128;
                int i3 = i2 % 2;
                return jZza;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzcrVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static ByteBuffer zzm(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        b = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        if (i4 == 0) {
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            throw null;
        }
        ByteBuffer byteBufferOrder = byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        int i5 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return byteBufferOrder;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        zza(fieldDescriptor, d, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzf(obj);
        if (i3 == 0) {
            return this;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
        int i = 2 % 2;
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        int i3 = i2 % 2;
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zzcuVar.zza();
    }

    private static zzcu zzj(FieldDescriptor fieldDescriptor) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        int i5 = i4 % 128;
        b = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i5 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return zzcuVar;
        }
        obj.hashCode();
        throw null;
    }

    private final zzcw zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = b + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zzi.zza(fieldDescriptor, z);
        valueEncoder.encode(obj, this.zzi);
        int i4 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    private final void zzn(int i) throws IOException {
        int i2 = 2 % 2;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            int i3 = b + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                this.zze.write(26751);
                i -= 11;
            } else {
                this.zze.write((i & 127) | 128);
                i >>>= 7;
            }
        }
        this.zze.write(i & 127);
        int i4 = b + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void zzo(long j) throws IOException {
        int i = 2 % 2;
        while (((-128) & j) != 0) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
            b = i2 % 128;
            int i3 = i2 % 2;
            this.zze.write((((int) j) & 127) | 128);
            j >>>= 7;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        this.zze.write(((int) j) & 127);
    }

    final ObjectEncoderContext zza(FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        int i = 2 % 2;
        if (!z || d != 0.0d) {
            zzn((zzh(fieldDescriptor) << 3) | 1);
            this.zze.write(zzm(8).putDouble(d).array());
            return this;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 49;
        b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    final ObjectEncoderContext zzb(FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        int i;
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
            if (z) {
                int i6 = i3 + 39;
                i = i6 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
                int i7 = i6 % 2;
                if (f == 0.0f) {
                    int i8 = i + 123;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    return this;
                }
            }
        } else if (z) {
            int i10 = i3 + 39;
            i = i10 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            int i11 = i10 % 2;
            if (f == 0.0f) {
                int i12 = i + 123;
                b = i12 % 128;
                int i13 = i12 % 2;
                return this;
            }
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    private final zzcw zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        int i = 2 % 2;
        long jZzi = zzi(objectEncoder, obj);
        Object obj2 = null;
        if (z) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
            int i3 = i2 % 128;
            b = i3;
            int i4 = i2 % 2;
            if (jZzi == 0) {
                int i5 = i3 + 35;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return this;
                }
                throw null;
            }
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        int i6 = b + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            return this;
        }
        obj2.hashCode();
        throw null;
    }

    final zzcw zzd(FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        int i2 = 2 % 2;
        int i3 = b + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (!z || i != 0) {
            zzcu zzcuVarZzj = zzj(fieldDescriptor);
            zzct zzctVar = zzct.DEFAULT;
            int iOrdinal = zzcuVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzn(i);
                int i5 = b + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            b = i6 % 128;
            if (i6 % 2 != 0 ? iOrdinal == 1 : iOrdinal == 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzcuVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    final zzcw zze(FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        zzcu zzcuVarZzj;
        int iOrdinal;
        int i;
        int i2 = 2 % 2;
        if (z) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
            b = i3 % 128;
            int i4 = i3 % 2;
            if (j != 0) {
                zzcuVarZzj = zzj(fieldDescriptor);
                zzct zzctVar = zzct.DEFAULT;
                iOrdinal = zzcuVarZzj.zzb().ordinal();
                if (iOrdinal != 0) {
                    zzn(zzcuVarZzj.zza() << 3);
                    zzo(j);
                    i = b + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                    if (i % 2 != 0) {
                        int i5 = 7 / 0;
                    }
                    return this;
                }
                int i6 = b + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                if (iOrdinal != 1) {
                    zzn(zzcuVarZzj.zza() << 3);
                    zzo((j >> 63) ^ (j + j));
                    return this;
                }
                if (iOrdinal == 2) {
                    zzn((zzcuVarZzj.zza() << 3) | 1);
                    this.zze.write(zzm(8).putLong(j).array());
                    return this;
                }
            }
        } else {
            zzcuVarZzj = zzj(fieldDescriptor);
            zzct zzctVar2 = zzct.DEFAULT;
            iOrdinal = zzcuVarZzj.zzb().ordinal();
            if (iOrdinal != 0) {
                zzn(zzcuVarZzj.zza() << 3);
                zzo(j);
                i = b + 105;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
                if (i % 2 != 0) {
                    int i8 = 7 / 0;
                }
                return this;
            }
            int i9 = b + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            int i10 = i9 % 2;
            if (iOrdinal != 1) {
                zzn(zzcuVarZzj.zza() << 3);
                zzo((j >> 63) ^ (j + j));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzcuVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    final ObjectEncoderContext zzc(FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        int i = 2 % 2;
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                b = i2 % 128;
                while (true) {
                    int i3 = i2 % 2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
                    i2 = b + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                }
            } else {
                if (obj instanceof Double) {
                    int i4 = b + 77;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                    zza(fieldDescriptor, ((Double) obj).doubleValue(), z);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(fieldDescriptor, ((Float) obj).floatValue(), z);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(fieldDescriptor, ((Number) obj).longValue(), z);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
                    if (objectEncoder != null) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
                        b = i6 % 128;
                        if (i6 % 2 != 0) {
                            zzk(objectEncoder, fieldDescriptor, obj, z);
                            return this;
                        }
                        zzk(objectEncoder, fieldDescriptor, obj, z);
                        int i7 = 18 / 0;
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
                    if (valueEncoder != null) {
                        zzl(valueEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    if (obj instanceof zzcs) {
                        zzd(fieldDescriptor, ((zzcs) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, fieldDescriptor, obj, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    zzn((zzh(fieldDescriptor) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 29;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $10 + 111;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1356 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 38, 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetBefore("", 0) + 47773), 468 - (Process.myTid() >> 22), 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzb(fieldDescriptor, f, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        b = i2 % 128;
        int i3 = i2 % 2;
        ObjectEncoderContext objectEncoderContextNested = nested(FieldDescriptor.of(str));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return objectEncoderContextNested;
        }
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = b + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        zzd(fieldDescriptor, i, i3 % 2 == 0);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final zzcw zzf(Object obj) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31533);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
            int mode = 28 - View.MeasureSpec.getMode(0);
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 52, bArr[80], bArr[7], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, iResolveOpacity, mode, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{34579, 34674, 20216, 36492, 63866, 31018, 22702, 6290, 34580, 36371, 63954, 6198, 34732, 36449, 63488, 6627, 34386, 36825, 63538, 6477, 34526, 36609, 63634, 6447, 34168, 36017}, TextUtils.getOffsetAfter("", 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{52982, 52883, 65204, 16066, 62823, 30002, 9159, 25593, 52973, 15955, 62922, 25379, 52803, 15935, 62554, 25261, 53159, 16267, 62523}, View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
            int mode2 = View.MeasureSpec.getMode(0) + 28;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[80];
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionGroup, deadChar, mode2, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                int mirror = 969 - AndroidCharacter.getMirror('0');
                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a((byte) (-bArr3[33]), bArr3[7], bArr3[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, mirror, iResolveOpacity2, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i4 = ~startUptimeMillis;
            int i5 = (~((-649208625) | i4)) | 615645200;
            int i6 = ~(startUptimeMillis | (-1091307596));
            int i7 = (((1929208392 + ((i5 | i6) * (-713))) + (i6 * 1426)) + ((~((-1124871020) | i4)) * 713)) - 1431268715;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{49154, 49251, 27003, 43279, 23026, 55714, 30689, 14301, 49157, 43408, 22874, 14201, 49331, 43489, 22742, 14033, 49531, 43082, 22714, 13838, 49620, 43176, 22530, 13942, 49758, 43825, 23532, 13778, 49683, 43925}, MotionEvent.axisFromString("") + 1, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{41022, 41053, 61086, 12017, 38443, 5741, 36910, 53266, 41011, 11890, 38533, 53465, 41118, 11780, 38661, 53593, 41317, 12205, 38773, 53697, 41457, 12106}, ExpandableListView.getPackedPositionType(0L), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new char[]{59674, 59760, 13762, 62905, 60009, 27179, 23392, 6991, 59740, 62764, 60118, 7096, 59821, 62726, 60284, 6663, 59473, 62692, 60194, 6795}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new char[]{49926, 50031, 18145, 34463, 25715, 58402, 12367, 28783, 49946, 34314, 25802, 28800, 50078, 34410, 25941, 28985, 49789, 34780, 25898, 29100}, KeyEvent.getDeadChar(0, 0), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1431268715};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[41];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr14 = new Object[1];
                d(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr4[41];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr15 = new Object[1];
                d(b7, b8, b8, objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 31533);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                    int offsetAfter = 28 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr5 = $$a;
                    Object[] objArr17 = new Object[1];
                    a((byte) (-bArr5[33]), bArr5[7], bArr5[80], objArr17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup2, iLastIndexOf, offsetAfter, -1142834547, false, (String) objArr17[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                try {
                    Object[] objArr18 = new Object[1];
                    c(new char[]{34579, 34674, 20216, 36492, 63866, 31018, 22702, 6290, 34580, 36371, 63954, 6198, 34732, 36449, 63488, 6627, 34386, 36825, 63538, 6477, 34526, 36609, 63634, 6447, 34168, 36017}, TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr18);
                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    c(new char[]{52982, 52883, 65204, 16066, 62823, 30002, 9159, 25593, 52973, 15955, 62922, 25379, 52803, 15935, 62554, 25261, 53159, 16267, 62523}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr19);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) (31534 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int size = 921 - View.MeasureSpec.getSize(0);
                        int i10 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[80];
                        byte b10 = bArr6[7];
                        Object[] objArr20 = new Object[1];
                        a(b9, b10, b10, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, size, i10, -778300370, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int size2 = 921 - View.MeasureSpec.getSize(0);
                        int gidForName = 27 - Process.getGidForName("");
                        byte[] bArr7 = $$a;
                        Object[] objArr21 = new Object[1];
                        a((byte) 52, bArr7[80], bArr7[7], objArr21);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMakeMeasureSpec, size2, gidForName, -1048449946, false, (String) objArr21[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = b + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    int i12 = i11 % 2;
                    objArr = objArr16;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i16 = (int) Runtime.getRuntime().totalMemory();
            int i17 = ~((-172426913) | i16);
            int i18 = ~i16;
            int i19 = i15 + 1708380563 + ((i17 | (~((-1410334994) | i18))) * 920) + (((~((-191317739) | i18)) | 172426912) * 920) + (((~(i16 | (-1410334994))) | (~((-172426913) | i18)) | (~((-18890827) | i16))) * 920);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr2[0])[0] = i21 ^ (i21 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                b = i22 % 128;
                int i23 = 2;
                int i24 = i22 % 2;
                int i25 = 0;
                while (i25 < strArr.length) {
                    int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                    b = i26 % 128;
                    if (i26 % i23 == 0) {
                        arrayList.add(strArr[i25]);
                        i25 += 100;
                    } else {
                        arrayList.add(strArr[i25]);
                        i25++;
                    }
                    i23 = 2;
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            int i27 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i28 = ~startElapsedRealtime;
            int i29 = i27 + (((~((-1480526614) | i28)) | (~(startElapsedRealtime | 293553030))) * 959) + 1632747945 + (((~(startElapsedRealtime | (-1480526614))) | (~(i28 | 293553030))) * 959);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr2[0])[0] = i31 ^ (i31 << 5);
        }
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder != null) {
            int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            b = i32 % 128;
            int i33 = i32 % 2;
            objectEncoder.encode(obj, this);
            return this;
        }
        String strConcat = "31|".concat("No encoder for ");
        int i34 = ((int[]) objArr2[0])[0];
        int i35 = i34 * i34;
        int i36 = -(38502869 * i34);
        int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
        int i38 = -(i34 * (-1122798025));
        int i39 = (i37 & i38) + (i38 | i37);
        int i40 = ((i39 | 1078579236) << 1) - (1078579236 ^ i39);
        int i41 = i40 >> 17;
        int i42 = (((i41 ^ (-65535)) + ((i41 & (-65535)) << 1)) / 32768) + 1;
        int i43 = (i40 & i42) + (i40 | i42);
        int i44 = i40 >> 29;
        int i45 = ((i44 & (-15)) + (i44 | (-15))) / 8;
        int i46 = -(i43 ^ ((i45 ^ 1) + ((i45 & 1) << 1)));
        int i47 = ((i46 | 2) << 1) - (i46 ^ 2);
        int i48 = i47 >> 18;
        int i49 = (((i48 | (-32767)) << 1) - (i48 ^ (-32767))) / 16384;
        throw new EncodingException(strConcat.substring(714 / (((-(((i49 & 1) + (i49 | 1)) + 1)) & i47) * 119)).concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) throws IOException {
        int i = 2 % 2;
        int i2 = b + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zze(fieldDescriptor, j, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzc(fieldDescriptor, obj, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzd(fieldDescriptor, z ? 1 : 0, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) throws IOException {
        FieldDescriptor fieldDescriptorOf;
        boolean z;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            fieldDescriptorOf = FieldDescriptor.of(str);
            z = false;
        } else {
            fieldDescriptorOf = FieldDescriptor.of(str);
            z = true;
        }
        zza(fieldDescriptorOf, d, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = b + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        zzd(FieldDescriptor.of(str), i, true);
        int i5 = b + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        b = i2 % 128;
        int i3 = i2 % 2;
        zze(FieldDescriptor.of(str), j, true);
        int i4 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 71;
        b = i2 % 128;
        int i3 = i2 % 2;
        zzc(FieldDescriptor.of(str), obj, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = b + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzd(FieldDescriptor.of(str), z ? 1 : 0, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6468600338463926908L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, int r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_face.zzcw.$$c
            int r9 = r9 * 3
            int r9 = 107 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face.zzcw.$$g(short, int, int):java.lang.String");
    }
}
