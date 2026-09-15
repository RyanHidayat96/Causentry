package com.google.android.gms.internal.mlkit_common;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkInfo;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
final class zzbn implements ObjectEncoderContext {
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static final Charset zza;
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final ObjectEncoder zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzbr zzi = new zzbr(this);
    private static final byte[] $$c = {58, -103, 118, 14};
    private static final int $$f = 14;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {58, -103, 118, 14, 2, 31, -21, 54, 15, 12, 21, 15, -30, 57, 19, 11, 4, 35, -64, 64, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49, 49, 4, 27, 5, 22, 15, -14, 33, 40, 4, 8, 25, 22, -30, 60, -1, 22, 22, 8, 25, 22, -2, 23, 21, 6, 21, 21, 9, -14, 53, 8, 22, 5, 35, 1, 29, -49};
    private static final int $$e = 243;
    private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 142;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f776a = 1;
    private static int d = 1;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        zza = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = builder.withProperty(zzbhVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = builder2.withProperty(zzbhVar2.zzb()).build();
        zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbm
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                zzbn.zzg((Map.Entry) obj, objectEncoderContext);
            }
        };
        int i = d + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
    }

    zzbn(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    private static void c(short s, int i, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = i * 15;
        int i4 = 107 - (i2 * 52);
        int i5 = (s * 3) + 84;
        byte[] bArr2 = new byte[i3 + 38];
        int i6 = i3 + 37;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i6 + (-i5)) - 11;
            i4 = i4;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            int i9 = i4 + 1;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = (i5 + (-bArr[i9])) - 11;
            i4 = i9;
            i7 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 31
            int r7 = r7 + 84
            byte[] r0 = com.google.android.gms.internal.mlkit_common.zzbn.$$d
            int r9 = r9 * 16
            int r9 = r9 + 38
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-16)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzbn.f(short, int, byte, java.lang.Object[]):void");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        int i = 2 % 2;
        zzbi zzbiVar = new zzbi();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzbiVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzbiVar.zza();
                zzbiVar.close();
                int i2 = f776a + 33;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return jZza;
                }
                throw null;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzbiVar.close();
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
        int i3 = f776a + 29;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (i4 == 0) {
            return byteBufferAllocate.order(byteOrder);
        }
        byteBufferAllocate.order(byteOrder);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d2) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        f776a = i2 % 128;
        int i3 = i2 % 2;
        zza(fieldDescriptor, d2, true);
        int i4 = asInterface + 111;
        f776a = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzf(obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 23;
        f776a = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
        int i = 2 % 2;
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 85;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            objectEncoderContext.add(zzb, entry.getKey());
            objectEncoderContext.add(zzc, entry.getValue());
        } else {
            objectEncoderContext.add(zzb, entry.getKey());
            objectEncoderContext.add(zzc, entry.getValue());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        f776a = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        zzbl zzblVar = (zzbl) fieldDescriptor.getProperty(zzbl.class);
        if (zzblVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i3 = f776a + 33;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return zzblVar.zza();
        }
        zzblVar.zza();
        throw null;
    }

    private static zzbl zzj(FieldDescriptor fieldDescriptor) {
        int i = 2 % 2;
        int i2 = f776a + 75;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        zzbl zzblVar = (zzbl) fieldDescriptor.getProperty(zzbl.class);
        if (zzblVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i3 = asInterface + 19;
        f776a = i3 % 128;
        int i4 = i3 % 2;
        return zzblVar;
    }

    private final zzbn zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        f776a = i2 % 128;
        int i3 = i2 % 2;
        this.zzi.zza(fieldDescriptor, z);
        valueEncoder.encode(obj, this.zzi);
        int i4 = asInterface + 105;
        f776a = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    private final void zzn(int i) throws IOException {
        int i2 = 2 % 2;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            int i3 = f776a + 25;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                this.zze.write((i & 40) | 30887);
                i -= 2;
            } else {
                this.zze.write((i & 127) | 128);
                i >>>= 7;
            }
        }
        this.zze.write(i & 127);
        int i4 = asInterface + 123;
        f776a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    private final void zzo(long j) throws IOException {
        int i = 2 % 2;
        while (((-128) & j) != 0) {
            int i2 = asInterface + 37;
            f776a = i2 % 128;
            if (i2 % 2 == 0) {
                this.zze.write(3965);
                j >>= 26;
            } else {
                this.zze.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
            int i3 = asInterface + 43;
            f776a = i3 % 128;
            int i4 = i3 % 2;
        }
        this.zze.write(((int) j) & 127);
        int i5 = asInterface + 21;
        f776a = i5 % 128;
        int i6 = i5 % 2;
    }

    final ObjectEncoderContext zza(FieldDescriptor fieldDescriptor, double d2, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = f776a;
        int i3 = i2 + 103;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if ((!z) || d2 != 0.0d) {
            zzn((zzh(fieldDescriptor) << 3) | 1);
            this.zze.write(zzm(8).putDouble(d2).array());
            return this;
        }
        int i4 = i2 + 119;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    final ObjectEncoderContext zzb(FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        int i = 2 % 2;
        if (!(!z)) {
            int i2 = asInterface;
            int i3 = i2 + 123;
            f776a = i3 % 128;
            if (i3 % 2 != 0 ? f == 0.0f : f == 2.0f) {
                int i4 = i2 + 113;
                f776a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 14 / 0;
                }
                return this;
            }
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    final zzbn zzf(Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = f776a;
        int i3 = i2 + 117;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object obj2 = null;
        if (obj == null) {
            int i5 = i2 + 35;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            obj2.hashCode();
            throw null;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
        int i6 = f776a + 89;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            objectEncoder.encode(obj, this);
            return this;
        }
        objectEncoder.encode(obj, this);
        throw null;
    }

    private final zzbn zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        int i = 2 % 2;
        long jZzi = zzi(objectEncoder, obj);
        if (z) {
            int i2 = f776a + 111;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            if (jZzi == 0) {
                int i5 = i3 + 51;
                f776a = i5 % 128;
                if (i5 % 2 != 0) {
                    return this;
                }
                throw null;
            }
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        int i6 = asInterface + 55;
        f776a = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    final zzbn zzd(FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        zzbl zzblVarZzj;
        int iOrdinal;
        int i2;
        int i3 = 2 % 2;
        if (!z) {
            zzblVarZzj = zzj(fieldDescriptor);
            zzbk zzbkVar = zzbk.DEFAULT;
            iOrdinal = zzblVarZzj.zzb().ordinal();
            if (iOrdinal != 0) {
                zzn(zzblVarZzj.zza() << 3);
                zzn(i);
                return this;
            }
            int i4 = f776a;
            i2 = i4 + 99;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                zzn(zzblVarZzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            zzn(zzblVarZzj.zza() << 3);
            zzn((i + i) ^ (i >> 31));
            return this;
        }
        int i5 = asInterface + 67;
        f776a = i5 % 128;
        int i6 = i5 % 2;
        if (i != 0) {
            zzblVarZzj = zzj(fieldDescriptor);
            zzbk zzbkVar2 = zzbk.DEFAULT;
            iOrdinal = zzblVarZzj.zzb().ordinal();
            if (iOrdinal != 0) {
                zzn(zzblVarZzj.zza() << 3);
                zzn(i);
                return this;
            }
            int i7 = f776a;
            i2 = i7 + 99;
            asInterface = i2 % 128;
            if (i2 % 2 != 0 ? iOrdinal == 1 : iOrdinal == 1) {
                zzn(zzblVarZzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            int i8 = i7 + 9;
            asInterface = i8 % 128;
            if (i8 % 2 == 0 ? iOrdinal == 2 : iOrdinal == 3) {
                zzn((zzblVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    final zzbn zze(FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        zzbl zzblVarZzj;
        int iOrdinal;
        int i = 2 % 2;
        if (z) {
            int i2 = f776a + 37;
            asInterface = i2 % 128;
            if (i2 % 2 == 0 ? j != 0 : j != 0) {
                zzblVarZzj = zzj(fieldDescriptor);
                zzbk zzbkVar = zzbk.DEFAULT;
                iOrdinal = zzblVarZzj.zzb().ordinal();
                if (iOrdinal != 0) {
                    zzn(zzblVarZzj.zza() << 3);
                    zzo(j);
                    return this;
                }
                int i3 = asInterface + 37;
                f776a = i3 % 128;
                int i4 = i3 % 2;
                if (iOrdinal != 1) {
                    zzn(zzblVarZzj.zza() << 3);
                    zzo((j >> 63) ^ (j + j));
                    return this;
                }
                if (iOrdinal == 2) {
                    zzn((zzblVarZzj.zza() << 3) | 1);
                    this.zze.write(zzm(8).putLong(j).array());
                    return this;
                }
            }
        } else {
            zzblVarZzj = zzj(fieldDescriptor);
            zzbk zzbkVar2 = zzbk.DEFAULT;
            iOrdinal = zzblVarZzj.zzb().ordinal();
            if (iOrdinal != 0) {
                zzn(zzblVarZzj.zza() << 3);
                zzo(j);
                return this;
            }
            int i5 = asInterface + 37;
            f776a = i5 % 128;
            int i6 = i5 % 2;
            if (iOrdinal != 1) {
                zzn(zzblVarZzj.zza() << 3);
                zzo((j >> 63) ^ (j + j));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzblVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j).array());
                return this;
            }
        }
        int i7 = asInterface + 53;
        f776a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r6.length() == 0) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.firebase.encoders.ObjectEncoderContext zzc(com.google.firebase.encoders.FieldDescriptor r5, java.lang.Object r6, boolean r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzbn.zzc(com.google.firebase.encoders.FieldDescriptor, java.lang.Object, boolean):com.google.firebase.encoders.ObjectEncoderContext");
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
        int i3 = -1;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $10 + 69;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char packedPositionChild = (char) (31338 - ExpandableListView.getPackedPositionChild(j));
                        int i6 = 2995 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(j) + 18;
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionChild, i6, packedPositionChild2, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = -1;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 43325), MotionEvent.axisFromString("") + 254, (Process.myTid() >> 22) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i7 = 33602;
            int i8 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i9 = $10 + 97;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] << iIntValue);
                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (i7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 3085 - Color.red(0), (ViewConfiguration.getTapTimeout() >> 16) + 26, -2146875848, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                        Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i7 - ExpandableListView.getPackedPositionGroup(0L)), 3085 - Gravity.getAbsoluteGravity(0, 0), 26 - View.combineMeasuredStates(0, 0), -2146875848, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    i7 = 33602;
                    i8 = 1687675375;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    int i10 = $10 + 103;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 << getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] + iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    } else {
                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 33602), 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 25 - Process.getGidForName(""), -2146875848, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v113, types: [boolean, int] */
    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 107;
        f776a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43042);
            int i4 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[5], bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, i4, iLastIndexOf, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, Color.argb(0, 0, 0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) (43042 - TextUtils.getOffsetBefore("", 0));
            int keyRepeatTimeout = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int longPressTimeout = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, keyRepeatTimeout, longPressTimeout, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = asInterface + 85;
            f776a = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 43042);
                int maxKeyCode = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
                int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, maxKeyCode, i7, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = ~iIdentityHashCode;
            int i11 = ~(901692122 | i10);
            int i12 = 397324562 + ((172049408 | i11) * (-712)) + (((~(iIdentityHashCode | 1073741530)) | (~(i10 | (-172049409)))) * (-712)) + (((-803339337) | i11) * 712) + 1385721563;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
            objArr = new Object[]{new int[1], new int[]{i9}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, 127 - TextUtils.getOffsetBefore("", 0), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0'), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1385721563};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[54];
                Object[] objArr11 = new Object[1];
                f(b6, bArr3[35], b6, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr3[54];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr12 = new Object[1];
                f(b8, (byte) (b8 | 52), (byte) (b7 - 1), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cGreen = (char) (43042 - Color.green(0));
                    int keyRepeatTimeout2 = 3111 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i15 = 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr13 = new Object[1];
                    c(b9, b10, b10, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, keyRepeatTimeout2, i15, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(null, null, (ViewConfiguration.getTapTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(null, null, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char mode = (char) (View.MeasureSpec.getMode(0) + 43042);
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22;
                        byte[] bArr4 = $$a;
                        byte b11 = bArr4[7];
                        byte b12 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        c(b11, b12, b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mode, maxKeyCode2, minimumFlingVelocity, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 43042);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 3111;
                        int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr5[7], bArr5[5], bArr5[40], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, scrollBarSize, jumpTapTimeout, -1272852037, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i16 = asInterface + 95;
                f776a = i16 % 128;
                int i17 = i16 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw null;
        }
        int i18 = f776a + 21;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        int i20 = ((int[]) objArr[0])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i21};
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i23 = ~iFreeMemory;
        int i24 = i20 + (-1237472731) + (((~((-307568548) | i23)) | (~((-1397462912) | iFreeMemory))) * 217) + (((~(iFreeMemory | (-307568548))) | 306255651) * 217) + (((~((-1397462912) | i23)) | 307568547) * 217);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        Object obj = new Object[]{new int[1], new int[]{i22}, iArr2, strArr3}[0];
        ((int[]) obj)[0] = i26 ^ (i26 << 5);
        int i27 = ((int[]) obj)[0];
        int i28 = ((i27 * i27) - (~(-(38435202 * i27)))) - 1;
        int i29 = -(i27 * (-474905550));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        int i31 = (i30 ^ (-526823004)) + (((-526823004) & i30) << 1);
        int i32 = i31 >> 29;
        int i33 = (((i32 ^ (-15)) + ((i32 & (-15)) << 1)) / 8) + 1;
        int i34 = (i31 & i33) + (i33 | i31);
        int i35 = ((i31 >> 26) + ComposerKt.defaultsKey) / 64;
        int i36 = (-(i34 ^ (((i35 | 1) << 1) - (i35 ^ 1)))) + 4;
        int i37 = ((i36 >> 16) - 131071) / 65536;
        zzb(fieldDescriptor, f, 7052 / ((i36 & (-((((i37 | 1) << 1) - (i37 ^ 1)) + 1))) * 1763));
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 77;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ObjectEncoderContext objectEncoderContextNested = nested(FieldDescriptor.of(str));
        int i4 = asInterface + 121;
        f776a = i4 % 128;
        if (i4 % 2 != 0) {
            return objectEncoderContextNested;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 23;
        f776a = i3 % 128;
        int i4 = i3 % 2;
        zzd(fieldDescriptor, i, true);
        int i5 = asInterface + 77;
        f776a = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 97;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zze(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        f776a = i2 % 128;
        int i3 = i2 % 2;
        zzc(fieldDescriptor, obj, true);
        int i4 = asInterface + 5;
        f776a = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = asInterface + 59;
        f776a = i2 % 128;
        int i3 = i2 % 2;
        zzd(fieldDescriptor, z ? 1 : 0, true);
        int i4 = asInterface + 51;
        f776a = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d2) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zza(FieldDescriptor.of(str), d2, true);
        int i4 = asInterface + 79;
        f776a = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) throws IOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 57;
        f776a = i3 % 128;
        int i4 = i3 % 2;
        zzd(FieldDescriptor.of(str), i, true);
        int i5 = f776a + 9;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 95;
        asInterface = i2 % 128;
        zze(i2 % 2 != 0 ? FieldDescriptor.of(str) : FieldDescriptor.of(str), j, true);
        int i3 = f776a + 123;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) throws IOException {
        FieldDescriptor fieldDescriptorOf;
        boolean z;
        int i = 2 % 2;
        int i2 = asInterface + 65;
        f776a = i2 % 128;
        if (i2 % 2 == 0) {
            fieldDescriptorOf = FieldDescriptor.of(str);
            z = false;
        } else {
            fieldDescriptorOf = FieldDescriptor.of(str);
            z = true;
        }
        zzc(fieldDescriptorOf, obj, z);
        int i3 = asInterface + 85;
        f776a = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) throws IOException {
        int i = 2 % 2;
        int i2 = f776a + 43;
        asInterface = i2 % 128;
        zzd(i2 % 2 != 0 ? FieldDescriptor.of(str) : FieldDescriptor.of(str), z ? 1 : 0, true);
        return this;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47427, 47478, 47424, 47474, 47477, 47483, 47414, 47473, 47441, 47467, 47472, 47487, 47479, 47393, 47480, 47425, 47481, 47476, 47442, 47482, 47470, 47485, 47452, 47484};
        b = 2047719652;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r8 = 68 - r8
            byte[] r0 = com.google.android.gms.internal.mlkit_common.zzbn.$$c
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzbn.$$g(short, int, short):java.lang.String");
    }
}
