package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class canProvideSurface {
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString byteString, RotationProviderListenerWrapper rotationProviderListenerWrapper, int i, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "");
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(byteString.getData(), 0, i2);
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr) {
        byte b;
        int i;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i3 + 1;
                if (i3 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    return -1;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i3 = i5;
                    if (i2 >= length || (b = bArr[i2]) < 0) {
                        break;
                    }
                    i2++;
                    i5 = i3 + 1;
                    if (i3 == 64) {
                        return i4;
                    }
                    if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                        return -1;
                    }
                    i4 += b < 65536 ? 1 : 2;
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b2 << 6) ^ (b3 ^ ByteCompanionObject.MIN_VALUE);
                        if (i7 >= 128) {
                            if (i3 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                return -1;
                            }
                            i4 += i7 < 65536 ? 1 : 2;
                            Unit unit = Unit.INSTANCE;
                            i2 += 2;
                            i3++;
                        } else if (i3 != 64) {
                            return -1;
                        }
                    } else if (i3 != 64) {
                        return -1;
                    }
                } else if (i3 != 64) {
                    return -1;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = (b2 << 12) ^ ((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6));
                            if (i9 < 2048) {
                                if (i3 != 64) {
                                    return -1;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i3 + 1;
                                if (i3 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    return -1;
                                }
                                i4 += i9 < 65536 ? 1 : 2;
                                Unit unit2 = Unit.INSTANCE;
                                i2 += 3;
                                i3 = i;
                            } else if (i3 != 64) {
                                return -1;
                            }
                        } else if (i3 != 64) {
                            return -1;
                        }
                    } else if (i3 != 64) {
                        return -1;
                    }
                } else if (i3 != 64) {
                    return -1;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (b2 << 18) ^ (((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12));
                                if (i11 > 1114111) {
                                    if (i3 != 64) {
                                        return -1;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i3 + 1;
                                        if (i3 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            return -1;
                                        }
                                        i4 += i11 < 65536 ? 1 : 2;
                                        Unit unit3 = Unit.INSTANCE;
                                        i2 += 4;
                                        i3 = i;
                                    } else if (i3 != 64) {
                                        return -1;
                                    }
                                } else if (i3 != 64) {
                                    return -1;
                                }
                            } else if (i3 != 64) {
                                return -1;
                            }
                        } else if (i3 != 64) {
                            return -1;
                        }
                    } else if (i3 != 64) {
                        return -1;
                    }
                } else if (i3 != 64) {
                    return -1;
                }
            } else if (i3 != 64) {
                return -1;
            }
        }
        return i4;
    }

    public static final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            throw new IllegalArgumentException("Unexpected hex digit: ".concat(String.valueOf(c)));
        }
        return c - '7';
    }
}
