package defpackage;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
final class getPostviewOutputConfig {
    private static final char[] TuitionPaymentFragmentbindingInflater1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARN: Code duplicated, block: B:156:0x0280 A[Catch: IllegalArgumentException -> 0x036a, TryCatch #2 {IllegalArgumentException -> 0x036a, blocks: (B:3:0x001a, B:5:0x0029, B:7:0x0034, B:9:0x0038, B:11:0x003c, B:14:0x0042, B:16:0x0048, B:18:0x0054, B:198:0x0341, B:19:0x0061, B:20:0x0065, B:21:0x0066, B:23:0x006a, B:25:0x0072, B:32:0x0093, B:35:0x009d, B:36:0x00a1, B:26:0x0075, B:28:0x007b, B:29:0x0084, B:31:0x008a, B:37:0x00a2, B:38:0x00a6, B:39:0x00a7, B:41:0x00ad, B:43:0x00bb, B:45:0x00c9, B:47:0x00d0, B:51:0x00e6, B:53:0x00f8, B:55:0x0103, B:56:0x0107, B:57:0x0108, B:58:0x010c, B:59:0x010d, B:63:0x011e, B:65:0x012a, B:67:0x0132, B:69:0x0139, B:71:0x0144, B:73:0x014e, B:74:0x0159, B:75:0x015d, B:76:0x015e, B:77:0x0162, B:78:0x0163, B:79:0x0167, B:80:0x0168, B:81:0x016c, B:82:0x016d, B:83:0x0171, B:86:0x0175, B:88:0x0184, B:90:0x018c, B:92:0x0193, B:94:0x019d, B:95:0x01a4, B:96:0x01a8, B:97:0x01a9, B:98:0x01ad, B:99:0x01ae, B:100:0x01b2, B:101:0x01b3, B:102:0x01b7, B:105:0x01bb, B:107:0x01ca, B:109:0x01d0, B:111:0x01d5, B:112:0x01dc, B:113:0x01e0, B:114:0x01e1, B:115:0x01e5, B:116:0x01e6, B:117:0x01ea, B:118:0x01eb, B:120:0x01ef, B:123:0x01f6, B:125:0x0206, B:127:0x0211, B:129:0x021b, B:130:0x0223, B:131:0x0227, B:132:0x0228, B:133:0x022c, B:134:0x022d, B:135:0x0231, B:137:0x0234, B:139:0x0243, B:141:0x024c, B:142:0x0252, B:143:0x0256, B:144:0x0257, B:145:0x025b, B:147:0x025e, B:149:0x0264, B:151:0x026c, B:153:0x0274, B:155:0x027c, B:158:0x0287, B:156:0x0280, B:160:0x028d, B:162:0x0292, B:164:0x02a2, B:166:0x02a7, B:168:0x02b5, B:170:0x02c2, B:171:0x02ca, B:172:0x02cf, B:173:0x02d3, B:169:0x02bc, B:174:0x02d4, B:175:0x02d8, B:176:0x02d9, B:178:0x02df, B:180:0x02ef, B:182:0x02f6, B:186:0x0310, B:188:0x0321, B:190:0x032c, B:191:0x0330, B:192:0x0331, B:193:0x0335, B:194:0x0336, B:195:0x033a, B:6:0x002c), top: B:216:0x001a, inners: #0, #1, #3 }] */
    static getCaptureBundle TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, SessionConfigBuilder sessionConfigBuilder, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        Mode modeTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i;
        String strName;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        ImageCaptureConfig imageCaptureConfig = new ImageCaptureConfig(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i2 = 1;
        ArrayList arrayList = new ArrayList(1);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = -1;
        CharacterSetECI characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        boolean z = false;
        while (true) {
            try {
                int i3 = 8;
                if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 4) {
                    modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Mode.TERMINATOR;
                } else {
                    modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Mode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4));
                }
                if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 == Mode.TERMINATOR) {
                    i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 == Mode.FNC1_FIRST_POSITION || modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 == Mode.FNC1_SECOND_POSITION) {
                    i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    z = true;
                } else {
                    if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 != Mode.STRUCTURED_APPEND) {
                        if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 != Mode.ECI) {
                            int i4 = 13;
                            if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 == Mode.HANZI) {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(modeTuitionPaymentFragmentspecialinlinedviewModeldefault1.b(sessionConfigBuilder));
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 == i2) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 * 13 > ((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b) {
                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                    byte[] bArr2 = new byte[iTuitionPaymentFragmentspecialinlinedviewModeldefault6 * 2];
                                    int i5 = 0;
                                    while (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 > 0) {
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4);
                                        int i6 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault7 % 96) | ((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 / 96) << 8);
                                        int i7 = i6 + (i6 < 959 ? 41377 : 42657);
                                        bArr2[i5] = (byte) (i7 >> 8);
                                        bArr2[i5 + 1] = (byte) i7;
                                        i5 += 2;
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault6--;
                                        i4 = 13;
                                    }
                                    try {
                                        sb.append(new String(bArr2, "GB2312"));
                                    } catch (UnsupportedEncodingException unused) {
                                        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                }
                            } else {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(modeTuitionPaymentFragmentspecialinlinedviewModeldefault1.b(sessionConfigBuilder));
                                if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 == Mode.NUMERIC) {
                                    while (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 >= 3) {
                                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * i3) - imageCaptureConfig.b < 10) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(10);
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 >= 1000) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int i8 = iTuitionPaymentFragmentspecialinlinedviewModeldefault9 / 100;
                                        char[] cArr = TuitionPaymentFragmentbindingInflater1;
                                        if (i8 < cArr.length) {
                                            sb.append(cArr[i8]);
                                            int i9 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 / 10) % 10;
                                            if (i9 < cArr.length) {
                                                sb.append(cArr[i9]);
                                                int i10 = iTuitionPaymentFragmentspecialinlinedviewModeldefault9 % 10;
                                                if (i10 < cArr.length) {
                                                    sb.append(cArr[i10]);
                                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault8 -= 3;
                                                    i3 = 8;
                                                } else {
                                                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                                }
                                            } else {
                                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            }
                                        } else {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    }
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 == 2) {
                                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 7) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(7);
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 >= 100) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int i11 = iTuitionPaymentFragmentspecialinlinedviewModeldefault10 / 10;
                                        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                                        if (i11 < cArr2.length) {
                                            sb.append(cArr2[i11]);
                                            int i12 = iTuitionPaymentFragmentspecialinlinedviewModeldefault10 % 10;
                                            if (i12 < cArr2.length) {
                                                sb.append(cArr2[i12]);
                                            } else {
                                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            }
                                        } else {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 == 1) {
                                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 4) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(4);
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 >= 10) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 < cArr3.length) {
                                            sb.append(cArr3[iTuitionPaymentFragmentspecialinlinedviewModeldefault11]);
                                        } else {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    }
                                } else if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 != Mode.ALPHANUMERIC) {
                                    if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 != Mode.BYTE) {
                                        if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 != Mode.KANJI) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 * 13 > ((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        byte[] bArr3 = new byte[iTuitionPaymentFragmentspecialinlinedviewModeldefault8 * 2];
                                        int i13 = 0;
                                        while (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 > 0) {
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(13);
                                            int i14 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 / DerHeader.TAG_CLASS_PRIVATE) << 8) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 % DerHeader.TAG_CLASS_PRIVATE);
                                            int i15 = i14 + (i14 < 7936 ? 33088 : 49472);
                                            bArr3[i13] = (byte) (i15 >> 8);
                                            bArr3[i13 + 1] = (byte) i15;
                                            i13 += 2;
                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault8--;
                                        }
                                        try {
                                            sb.append(new String(bArr3, "SJIS"));
                                        } catch (UnsupportedEncodingException unused2) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    } else {
                                        int i16 = 8;
                                        if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 << 3) > ((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        byte[] bArr4 = new byte[iTuitionPaymentFragmentspecialinlinedviewModeldefault8];
                                        int i17 = 0;
                                        while (i17 < iTuitionPaymentFragmentspecialinlinedviewModeldefault8) {
                                            bArr4[i17] = (byte) imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i16);
                                            i17++;
                                            i16 = 8;
                                        }
                                        if (characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            strName = hasDynamicRange.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr4, map);
                                        } else {
                                            strName = characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault3.name();
                                        }
                                        try {
                                            sb.append(new String(bArr4, strName));
                                            arrayList.add(bArr4);
                                        } catch (UnsupportedEncodingException unused3) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    }
                                } else {
                                    while (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 > 1) {
                                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 11) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(11);
                                        int i18 = iTuitionPaymentFragmentspecialinlinedviewModeldefault13 / 45;
                                        char[] cArr4 = TuitionPaymentFragmentbindingInflater1;
                                        if (i18 < cArr4.length) {
                                            sb.append(cArr4[i18]);
                                            int i19 = iTuitionPaymentFragmentspecialinlinedviewModeldefault13 % 45;
                                            if (i19 < cArr4.length) {
                                                sb.append(cArr4[i19]);
                                                iTuitionPaymentFragmentspecialinlinedviewModeldefault8 -= 2;
                                            } else {
                                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                            }
                                        } else {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    }
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 == 1) {
                                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 6) {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(6);
                                        char[] cArr5 = TuitionPaymentFragmentbindingInflater1;
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault14 < cArr5.length) {
                                            sb.append(cArr5[iTuitionPaymentFragmentspecialinlinedviewModeldefault14]);
                                        } else {
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        }
                                    }
                                    if (z) {
                                        for (int length = sb.length(); length < sb.length(); length++) {
                                            if (sb.charAt(length) == '%') {
                                                if (length < sb.length() - 1) {
                                                    int i20 = length + 1;
                                                    if (sb.charAt(i20) == '%') {
                                                        sb.deleteCharAt(i20);
                                                    } else {
                                                        sb.setCharAt(length, (char) 29);
                                                    }
                                                } else {
                                                    sb.setCharAt(length, (char) 29);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                            if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 128) == 0) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 127;
                            } else if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & DerHeader.TAG_CLASS_PRIVATE) == 128) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8) | ((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 63) << 8);
                            } else if ((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 224) == 192) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 31) << 16) | imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(16);
                            } else {
                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                            characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault3 = CharacterSetECI.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            if (characterSetECITuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                        }
                    } else {
                        if (((imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length - imageCaptureConfig.TuitionPaymentFragmentbindingInflater1) * 8) - imageCaptureConfig.b < 16) {
                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        }
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = imageCaptureConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2(8);
                    }
                    i = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
                if (modeTuitionPaymentFragmentspecialinlinedviewModeldefault1 == Mode.TERMINATOR) {
                    return new getCaptureBundle(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, errorCorrectionLevel == null ? null : errorCorrectionLevel.toString(), i, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                }
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
                i2 = 1;
            } catch (IllegalArgumentException unused4) {
                throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }
}
