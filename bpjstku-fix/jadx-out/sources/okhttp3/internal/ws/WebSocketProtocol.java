package okhttp3.internal.ws;

import defpackage.RotationProviderListenerWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u001e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0014\u0010\"\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0014\u0010(\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\u00020\u001e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b)\u0010 R\u0014\u0010*\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b*\u0010\u0016R\u0014\u0010+\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0006\n\u0004\b+\u0010\u0016R\u0014\u0010,\u001a\u00020\u001e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b,\u0010 "}, d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", "", "<init>", "()V", "", "p0", "acceptHeader", "(Ljava/lang/String;)Ljava/lang/String;", "", "closeCodeExceptionMessage", "(I)Ljava/lang/String;", "LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;", "", "p1", "", "toggleMask", "(LRotationProviderListenerWrapper$TuitionPaymentFragmentbindingInflater1;[B)V", "validateCloseCode", "(I)V", "ACCEPT_MAGIC", "Ljava/lang/String;", "B0_FLAG_FIN", "I", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "B0_FLAG_RSV3", "B0_MASK_OPCODE", "B1_FLAG_MASK", "B1_MASK_LENGTH", "CLOSE_CLIENT_GOING_AWAY", "", "CLOSE_MESSAGE_MAX", "J", "CLOSE_NO_STATUS_CODE", "OPCODE_BINARY", "OPCODE_CONTINUATION", "OPCODE_CONTROL_CLOSE", "OPCODE_CONTROL_PING", "OPCODE_CONTROL_PONG", "OPCODE_FLAG_CONTROL", "OPCODE_TEXT", "PAYLOAD_BYTE_MAX", "PAYLOAD_LONG", "PAYLOAD_SHORT", "PAYLOAD_SHORT_MAX"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final void toggleMask(RotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1 p0, byte[] p1) {
        long j;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int length = p1.length;
        int i = 0;
        do {
            byte[] bArr = p0.TuitionPaymentFragmentbindingInflater1;
            int i2 = p0.asBinder;
            int i3 = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (bArr != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ p1[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = p0.b;
            RotationProviderListenerWrapper rotationProviderListenerWrapper = p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Intrinsics.checkNotNull(rotationProviderListenerWrapper);
            if (j2 == rotationProviderListenerWrapper.size) {
                throw new IllegalStateException("no more bytes".toString());
            }
            j = p0.b;
        } while (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j == -1 ? 0L : j + ((long) (p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - p0.asBinder))) != -1);
    }

    public final String closeCodeExceptionMessage(int p0) {
        if (p0 < 1000 || p0 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(p0));
        }
        if ((1004 > p0 || p0 >= 1007) && (1015 > p0 || p0 >= 3000)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Code ");
        sb.append(p0);
        sb.append(" is reserved and may not be used.");
        return sb.toString();
    }

    public final void validateCloseCode(int p0) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(p0);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        Intrinsics.checkNotNull(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }

    public final String acceptHeader(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ByteString.Companion companion = ByteString.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(p0);
        sb.append(ACCEPT_MAGIC);
        return ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString()).b("SHA-1").b();
    }
}
