package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge extends hasProvider {
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    protected CRC32 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static short TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, ByteOrder byteOrder) {
        int i;
        byte b;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            i = bArr[0] << 8;
            b = bArr[1];
        } else {
            i = bArr[1] << 8;
            b = bArr[0];
        }
        return (short) ((b & UByte.MAX_VALUE) | i);
    }

    public lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge() {
        super(new Inflater(true));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CRC32();
    }

    @Override // defpackage.hasProvider, defpackage.lambdaexecuteSafely11, defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
    public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            lambdasnapshot7 lambdasnapshot7Var = new lambdasnapshot7(checkreadytorelease);
            lambdasnapshot7Var.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault1(10, new AnonymousClass5(checkreadytorelease, lambdasnapshot7Var)));
            return;
        }
        super.TuitionPaymentFragmentbindingInflater1(checkreadytorelease, autoValue_Packet);
    }

    /* JADX INFO: renamed from: lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge$5, reason: invalid class name */
    final class AnonymousClass5 implements lambdasnapshot7.b<byte[]> {
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final /* synthetic */ lambdasnapshot7 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final /* synthetic */ checkReadyToRelease TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean b;

        AnonymousClass5(checkReadyToRelease checkreadytorelease, lambdasnapshot7 lambdasnapshot7Var) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = checkreadytorelease;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdasnapshot7Var;
        }

        @Override // lambdasnapshot7.b
        public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            byte[] bArr2 = bArr;
            short sTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr2, ByteOrder.LITTLE_ENDIAN);
            if (sTuitionPaymentFragmentspecialinlinedviewModeldefault2 != -29921) {
                lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new IOException(String.format(Locale.ENGLISH, "unknown format (magic number %x)", Short.valueOf(sTuitionPaymentFragmentspecialinlinedviewModeldefault2))));
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                return;
            }
            byte b = bArr2[3];
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = b;
            boolean z = (b & 2) != 0;
            this.b = z;
            if (z) {
                lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.update(bArr2, 0, bArr2.length);
            }
            if ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 & 4) == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault1(2, new lambdasnapshot7.b<byte[]>() { // from class: lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.5.2
                    @Override // lambdasnapshot7.b
                    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr3) {
                        byte[] bArr4 = bArr3;
                        if (AnonymousClass5.this.b) {
                            lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.update(bArr4, 0, 2);
                        }
                        short sTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr4, ByteOrder.LITTLE_ENDIAN);
                        AnonymousClass5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sTuitionPaymentFragmentspecialinlinedviewModeldefault3 & UShort.MAX_VALUE, new lambdasnapshot7.b<byte[]>() { // from class: lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.5.2.4
                            @Override // lambdasnapshot7.b
                            public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr5) {
                                byte[] bArr6 = bArr5;
                                if (AnonymousClass5.this.b) {
                                    lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.update(bArr6, 0, bArr6.length);
                                }
                                AnonymousClass5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            }
                        }));
                    }
                }));
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            lambdasnapshot7 lambdasnapshot7Var = new lambdasnapshot7(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor = new lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor() { // from class: lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.5.5
                @Override // defpackage.lambdasnapshot8androidxcameracoreprocessingDefaultSurfaceProcessor
                public final void TuitionPaymentFragmentbindingInflater1(checkReadyToRelease checkreadytorelease, AutoValue_Packet autoValue_Packet) {
                    if (AnonymousClass5.this.b) {
                        while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                            ByteBuffer byteBufferRemove = autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove();
                            autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 -= byteBufferRemove.remaining();
                            lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.update(byteBufferRemove.array(), byteBufferRemove.arrayOffset() + byteBufferRemove.position(), byteBufferRemove.remaining());
                            AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteBufferRemove);
                        }
                    }
                    while (autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() > 0) {
                        AutoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove());
                    }
                    autoValue_Packet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                    AnonymousClass5.this.TuitionPaymentFragmentbindingInflater1();
                }
            };
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if ((i & 8) != 0) {
                lambdasnapshot7Var.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new lambdasnapshot7.TuitionPaymentFragmentbindingInflater1((byte) 0, lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor));
            } else if ((i & 16) == 0) {
                TuitionPaymentFragmentbindingInflater1();
            } else {
                lambdasnapshot7Var.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new lambdasnapshot7.TuitionPaymentFragmentbindingInflater1((byte) 0, lambdasnapshot8androidxcameracoreprocessingdefaultsurfaceprocessor));
            }
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            if (this.b) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(new lambdasnapshot7.TuitionPaymentFragmentspecialinlinedviewModeldefault1(2, new lambdasnapshot7.b<byte[]>() { // from class: lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.5.1
                    @Override // lambdasnapshot7.b
                    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
                        if (((short) lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()) != lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr, ByteOrder.LITTLE_ENDIAN)) {
                            lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new IOException("CRC mismatch"));
                            return;
                        }
                        lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
                        lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                        lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(AnonymousClass5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                }));
            } else {
                lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                lambdacreateSurfaceRequest1androidxcameracoreprocessingSurfaceEdge.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
    }
}
