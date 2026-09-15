package com.google.common.net;

import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.traceState;
import defpackage.tryOpenCamera;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    public final String host;
    private final int port;

    private HostAndPort(String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static HostAndPort TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        String str2;
        boolean z;
        String strSubstring;
        String strSubstring2;
        boolean z2;
        String[] strArr;
        boolean z3 = false;
        int i = -1;
        if (!str.startsWith("[")) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i2 = iIndexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i2);
                }
                if (strSubstring != null && !strSubstring.isEmpty()) {
                    if (strSubstring.startsWith("+") && traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentbindingInflater1(strSubstring)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        try {
                            i = Integer.parseInt(strSubstring);
                            if (i >= 0 && i <= 65535) {
                                z3 = true;
                            }
                            if (!z3) {
                                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Port number out of range: %s", str));
                            }
                        } catch (NumberFormatException unused) {
                            throw new IllegalArgumentException("Unparseable port number: ".concat(String.valueOf(str)));
                        }
                    } else {
                        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Unparseable port number: %s", str));
                    }
                }
                return new HostAndPort(str2, i, z);
            }
            str2 = str;
            z = iIndexOf >= 0;
            strSubstring = null;
            if (strSubstring != null) {
                if (strSubstring.startsWith("+")) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i = Integer.parseInt(strSubstring);
                    if (i >= 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Port number out of range: %s", str));
                    }
                } else {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Unparseable port number: %s", str));
                }
            }
            return new HostAndPort(str2, i, z);
        }
        if (str.charAt(0) == '[') {
            int iIndexOf2 = str.indexOf(58);
            int iLastIndexOf = str.lastIndexOf(93);
            if (iIndexOf2 >= 0 && iLastIndexOf > iIndexOf2) {
                String strSubstring3 = str.substring(1, iLastIndexOf);
                int i3 = iLastIndexOf + 1;
                if (i3 == str.length()) {
                    strArr = new String[]{strSubstring3, ""};
                } else if (str.charAt(i3) == ':') {
                    int i4 = iLastIndexOf + 2;
                    for (int i5 = i4; i5 < str.length(); i5++) {
                        if (!Character.isDigit(str.charAt(i5))) {
                            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Port must be numeric: %s", str));
                        }
                    }
                    strArr = new String[]{strSubstring3, str.substring(i4)};
                } else {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Only a colon may follow a close bracket: %s", str));
                }
                strSubstring2 = strArr[0];
                strSubstring = strArr[1];
            } else {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Invalid bracketed host/port: %s", str));
            }
        } else {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Bracketed host-port string must start with a bracket: %s", str));
        }
        str2 = strSubstring2;
        z = false;
        if (strSubstring != null) {
            if (strSubstring.startsWith("+")) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (z2) {
                i = Integer.parseInt(strSubstring);
                if (i >= 0) {
                    z3 = true;
                }
                if (!z3) {
                    throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Port number out of range: %s", str));
                }
            } else {
                throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("Unparseable port number: %s", str));
            }
        }
        return new HostAndPort(str2, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        return tryOpenCamera.b(this.host, hostAndPort.host) && this.port == hostAndPort.port;
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.host, Integer.valueOf(this.port));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (this.port >= 0) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }
}
