package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfigOptionPriority {
    private static final traceState TuitionPaymentFragmentspecialinlinedviewModeldefault2 = traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault2('.');
    private static final traceState TuitionPaymentFragmentspecialinlinedviewModeldefault3 = traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(':');

    static {
    }

    private static InetAddress b(String str) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2((byte) 0);
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "'%s' is not an IP string literal.", str));
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, null) != null;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        String b;

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte b) {
            this();
        }
    }

    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i >= str.length()) {
                i = -1;
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != '.') {
                if (cCharAt != ':') {
                    if (cCharAt == '%') {
                        break;
                    }
                    if (Character.digit(cCharAt, 16) == -1) {
                        return null;
                    }
                } else {
                    if (z) {
                        return null;
                    }
                    z2 = true;
                }
            } else {
                z = true;
            }
            i++;
        }
        if (!z2) {
            if (z && i == -1) {
                return TuitionPaymentFragmentbindingInflater1(str);
            }
            return null;
        }
        if (z && (str = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str)) == null) {
            return null;
        }
        if (i != -1) {
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = str.substring(i + 1);
            }
            str = str.substring(0, i);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
    }

    private static byte[] TuitionPaymentFragmentbindingInflater1(String str) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIndexOf = str.indexOf(46, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int i3 = iIndexOf - i;
            if (i3 <= 0 || i3 > 3) {
                throw new NumberFormatException();
            }
            if (i3 > 1) {
                try {
                    if (str.charAt(i) == '0') {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            int i4 = 0;
            while (i < iIndexOf) {
                int iDigit = Character.digit(str.charAt(i), 10);
                if (iDigit < 0) {
                    throw new NumberFormatException();
                }
                i4 = (i4 * 10) + iDigit;
                i++;
            }
            if (i4 <= 255) {
                bArr[i2] = (byte) i4;
                i = iIndexOf + 1;
            } else {
                throw new NumberFormatException();
            }
        }
        return bArr;
    }

    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 2 && iTuitionPaymentFragmentspecialinlinedviewModeldefault1 <= 8) {
            int i = 1;
            int i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            int i3 = 8 - i2;
            boolean z = false;
            for (int i4 = 0; i4 < str.length() - 1; i4++) {
                if (str.charAt(i4) == ':' && str.charAt(i4 + 1) == ':') {
                    if (z) {
                        return null;
                    }
                    int i5 = i3 + 1;
                    if (i4 == 0) {
                        i5 = i3 + 2;
                    }
                    if (i4 == str.length() - 2) {
                        i5++;
                    }
                    i3 = i5;
                    z = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z && i3 <= 0) {
                return null;
            }
            if (!z && i2 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i = 0;
                }
                while (i < str.length()) {
                    int iIndexOf = str.indexOf(58, i);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i) == ':') {
                        for (int i6 = 0; i6 < i3; i6++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        int i7 = iIndexOf - i;
                        if (i7 > 0 && i7 <= 4) {
                            int iDigit = 0;
                            while (i < iIndexOf) {
                                iDigit = (iDigit << 4) | Character.digit(str.charAt(i), 16);
                                i++;
                            }
                            byteBufferAllocate.putShort((short) iDigit);
                        } else {
                            throw new NumberFormatException();
                        }
                    }
                    i = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(str.substring(iLastIndexOf));
        if (bArrTuitionPaymentFragmentbindingInflater1 == null) {
            return null;
        }
        String hexString = Integer.toHexString(((bArrTuitionPaymentFragmentbindingInflater1[0] & UByte.MAX_VALUE) << 8) | (bArrTuitionPaymentFragmentbindingInflater1[1] & UByte.MAX_VALUE));
        String hexString2 = Integer.toHexString((bArrTuitionPaymentFragmentbindingInflater1[3] & UByte.MAX_VALUE) | ((bArrTuitionPaymentFragmentbindingInflater1[2] & UByte.MAX_VALUE) << 8));
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append(hexString);
        sb.append(":");
        sb.append(hexString2);
        return sb.toString();
    }

    private static InetAddress TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, String str) {
        int iDigit;
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            if (byAddress instanceof Inet6Address) {
                Inet6Address inet6Address = (Inet6Address) byAddress;
                int length = str.length();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i <= 214748364 && (iDigit = Character.digit(str.charAt(i2), 10)) >= 0) {
                        i = (i * 10) + iDigit;
                    }
                    i = -1;
                }
                if (i != -1) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
                }
                try {
                    NetworkInterface byName = NetworkInterface.getByName(str);
                    if (byName == null) {
                        throw new IllegalArgumentException(String.format(Locale.ROOT, "No such interface: '%s'", str));
                    }
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                } catch (SocketException | UnknownHostException e2) {
                    StringBuilder sb = new StringBuilder("No such interface: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString(), e2);
                }
            }
            throw new IllegalArgumentException("Unexpected state, scope should only appear for ipv6");
        } catch (UnknownHostException e3) {
            throw new AssertionError(e3);
        }
    }
}
