package defpackage;

import defpackage.getAudioCodecMimeType.AnonymousClass3;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.UByte;

/* JADX INFO: loaded from: classes5.dex */
public final class EncoderProfilesProxyAudioProfileProxy {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public static getVideoCodecMimeType TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i, int i2) {
        getFlashType getflashtypeTuitionPaymentFragmentbindingInflater1;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        getFlashType getflashtypeTuitionPaymentFragmentbindingInflater2;
        int i9;
        int iAbs;
        getFlashType getflashtypeB;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        getAudioCodecMimeType getaudiocodecmimetype = new getAudioCodecMimeType(bArr);
        Collection<ExtendedCameraConfigProviderStore> collectionSingletonList = Collections.singletonList(ExtendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        int i17 = 0;
        while (true) {
            byte[] bArr2 = getaudiocodecmimetype.TuitionPaymentFragmentbindingInflater1;
            getflashtypeTuitionPaymentFragmentbindingInflater1 = null;
            i3 = 3;
            i4 = 2;
            i5 = 32;
            i6 = 1;
            if (i17 >= bArr2.length) {
                break;
            }
            int i18 = i17 + 1;
            byte b = i18 < bArr2.length ? bArr2[i18] : (byte) 0;
            byte b2 = bArr2[i17];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 == 58 && b == 32) {
                            i3 = 5;
                        } else {
                            i3 = 0;
                        }
                    } else if (b != 32) {
                        i3 = 0;
                    }
                } else if (b == 32) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
            } else if (b == 10) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                collectionSingletonList = getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault1(collectionSingletonList, i17, i3);
                i17 = i18;
            } else {
                LinkedList linkedList = new LinkedList();
                for (ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore : collectionSingletonList) {
                    char c = (char) (getaudiocodecmimetype.TuitionPaymentFragmentbindingInflater1[i17] & UByte.MAX_VALUE);
                    boolean z = getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault3[extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault3][c] > 0;
                    ExtendedCameraConfigProviderStore extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    for (int i19 = 0; i19 <= 4; i19++) {
                        int i20 = getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i19][c];
                        if (i20 > 0) {
                            if (extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2 = extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i17);
                            }
                            if (!z || i19 == extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault3 || i19 == 2) {
                                linkedList.add(extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i19, i20));
                            }
                            if (!z && getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault1[extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault3][i19] >= 0) {
                                linkedList.add(extendedCameraConfigProviderStoreTuitionPaymentFragmentspecialinlinedviewModeldefault2.b(i19, i20));
                            }
                        }
                    }
                    if (extendedCameraConfigProviderStore.b > 0 || getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault3[extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault3][c] == 0) {
                        linkedList.add(extendedCameraConfigProviderStore.TuitionPaymentFragmentbindingInflater1(i17));
                    }
                }
                collectionSingletonList = getAudioCodecMimeType.TuitionPaymentFragmentbindingInflater1(linkedList);
            }
            i17++;
        }
        ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore2 = (ExtendedCameraConfigProviderStore) Collections.min(collectionSingletonList, getaudiocodecmimetype.new AnonymousClass3());
        byte[] bArr3 = getaudiocodecmimetype.TuitionPaymentFragmentbindingInflater1;
        LinkedList linkedList2 = new LinkedList();
        for (EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyAudioProfileProxyAudioEncoder = extendedCameraConfigProviderStore2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr3.length).TuitionPaymentFragmentbindingInflater1; encoderProfilesProxyAudioProfileProxyAudioEncoder != null; encoderProfilesProxyAudioProfileProxyAudioEncoder = encoderProfilesProxyAudioProfileProxyAudioEncoder.b) {
            linkedList2.addFirst(encoderProfilesProxyAudioProfileProxyAudioEncoder);
        }
        getFlashType getflashtype = new getFlashType();
        Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            ((EncoderProfilesProxyAudioProfileProxyAudioEncoder) it.next()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, bArr3);
        }
        int i21 = ((getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i) / 100) + 11;
        int i22 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i2 != 0) {
            i9 = i2 < 0 ? 1 : 0;
            iAbs = Math.abs(i2);
            if (iAbs > (i9 != 0 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            i7 = ((i9 != 0 ? 88 : 112) + (iAbs << 4)) * iAbs;
            i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3[iAbs];
            getflashtypeTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(getflashtype, i8);
            if (getflashtypeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i21 > i7 - (i7 % i8)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (i9 != 0) {
                if (getflashtypeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > (i8 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
                i9 = 1;
            }
        } else {
            int i23 = 0;
            int i24 = 0;
            while (true) {
                if (i23 > i5) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                int i25 = i23 <= i3 ? i6 : 0;
                int i26 = i25 != 0 ? i23 + 1 : i23;
                i7 = ((i25 != 0 ? 88 : 112) + (i26 << 4)) * i26;
                if (i22 + i21 <= i7) {
                    i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3[i26];
                    if (i24 != i8) {
                        getflashtypeTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getflashtype, i8);
                    } else {
                        i8 = i24;
                    }
                    if ((i25 == 0 || getflashtypeTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 <= (i8 << 6)) && getflashtypeTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i21 <= i7 - (i7 % i8)) {
                        getflashtypeTuitionPaymentFragmentbindingInflater2 = getflashtypeTuitionPaymentFragmentbindingInflater1;
                        i9 = i25;
                        iAbs = i26;
                        break;
                    }
                    i24 = i8;
                }
                i23++;
                i4 = i4;
                i5 = i5;
                i6 = i6;
                i3 = 3;
            }
        }
        getFlashType getflashtypeB2 = b(getflashtypeTuitionPaymentFragmentbindingInflater2, i7, i8);
        int i27 = getflashtypeTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 / i8;
        getFlashType getflashtype2 = new getFlashType();
        if (i9 != 0) {
            getflashtype2.TuitionPaymentFragmentbindingInflater1(iAbs - 1, i4);
            getflashtype2.TuitionPaymentFragmentbindingInflater1(i27 - i6, 6);
            getflashtypeB = b(getflashtype2, 28, 4);
        } else {
            getflashtype2.TuitionPaymentFragmentbindingInflater1(iAbs - 1, 5);
            getflashtype2.TuitionPaymentFragmentbindingInflater1(i27 - i6, 11);
            getflashtypeB = b(getflashtype2, 40, 4);
        }
        int i28 = (i9 == 0 ? 14 : 11) + (iAbs << 2);
        int[] iArr = new int[i28];
        if (i9 != 0) {
            for (int i29 = 0; i29 < i28; i29++) {
                iArr[i29] = i29;
            }
            i10 = i28;
        } else {
            int i30 = i28 / 2;
            i10 = i28 + 1 + (((i30 - 1) / 15) * i4);
            int i31 = i10 / 2;
            for (int i32 = 0; i32 < i30; i32++) {
                int i33 = (i32 / 15) + i32;
                iArr[(i30 - i32) - 1] = (i31 - i33) - 1;
                iArr[i30 + i32] = i33 + i31 + i6;
            }
        }
        getBufferFormat getbufferformat = new getBufferFormat(i10);
        int i34 = 0;
        int i35 = 0;
        while (i34 < iAbs) {
            int i36 = ((iAbs - i34) << 2) + (i9 != 0 ? 9 : 12);
            int i37 = 0;
            while (i37 < i36) {
                int i38 = i37 << 1;
                int i39 = 0;
                while (i39 < i4) {
                    int i40 = i35 + i38 + i39;
                    if (((i6 << (i40 & 31)) & getflashtypeB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i40 / 32]) != 0) {
                        int i41 = i34 << 1;
                        int i42 = iArr[i41 + i39];
                        int i43 = (iArr[i41 + i37] * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i42 / 32);
                        int[] iArr2 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                        iArr2[i43] = (i6 << (i42 & 31)) | iArr2[i43];
                    }
                    int i44 = (i36 << 1) + i35 + i38 + i39;
                    if ((getflashtypeB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i44 / 32] & (i6 << (i44 & 31))) != 0) {
                        int i45 = i34 << 1;
                        int i46 = iArr[i45 + i37];
                        int i47 = (iArr[((i28 - 1) - i45) - i39] * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i46 / 32);
                        int[] iArr3 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                        iArr3[i47] = (1 << (i46 & 31)) | iArr3[i47];
                    }
                    int i48 = (i36 << 2) + i35 + i38 + i39;
                    if ((getflashtypeB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i48 / 32] & (1 << (i48 & 31))) != 0) {
                        int i49 = (i28 - 1) - (i34 << 1);
                        int i50 = iArr[i49 - i39];
                        int i51 = (iArr[i49 - i37] * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i50 / 32);
                        int[] iArr4 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                        iArr4[i51] = (1 << (i50 & 31)) | iArr4[i51];
                    }
                    int i52 = (i36 * 6) + i35 + i38 + i39;
                    if ((getflashtypeB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i52 / 32] & (1 << (i52 & 31))) != 0) {
                        int i53 = i34 << 1;
                        int i54 = iArr[((i28 - 1) - i53) - i37];
                        int i55 = (iArr[i53 + i39] * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i54 / 32);
                        int[] iArr5 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                        iArr5[i55] = (1 << (i54 & 31)) | iArr5[i55];
                    }
                    i39++;
                    i4 = 2;
                    i6 = 1;
                }
                i37++;
                i4 = 2;
                i6 = 1;
            }
            i35 += i36 << 3;
            i34++;
            i4 = 2;
            i6 = 1;
        }
        int i56 = i10 / 2;
        int i57 = 0;
        if (i9 != 0) {
            while (i57 < 7) {
                int i58 = (i56 - 3) + i57;
                if (((1 << (i57 & 31)) & getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i57 / 32]) != 0) {
                    int i59 = ((i56 - 5) * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i58 / 32);
                    int[] iArr6 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    i14 = 1;
                    iArr6[i59] = (1 << (i58 & 31)) | iArr6[i59];
                } else {
                    i14 = 1;
                }
                int i60 = i57 + 7;
                if ((getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i60 / 32] & (i14 << (i60 & 31))) != 0) {
                    int i61 = i56 + 5;
                    int i62 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i58) + (i61 / 32);
                    int[] iArr7 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    i15 = 1;
                    iArr7[i62] = (1 << (i61 & 31)) | iArr7[i62];
                } else {
                    i15 = 1;
                }
                int i63 = 20 - i57;
                if ((getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i63 / 32] & (i15 << (i63 & 31))) != 0) {
                    int i64 = ((i56 + 5) * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i58 / 32);
                    int[] iArr8 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    i16 = 1;
                    iArr8[i64] = (1 << (i58 & 31)) | iArr8[i64];
                } else {
                    i16 = 1;
                }
                int i65 = 27 - i57;
                if ((getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i65 / 32] & (i16 << (i65 & 31))) != 0) {
                    int i66 = i56 - 5;
                    int i67 = (i58 * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i66 / 32);
                    int[] iArr9 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr9[i67] = (1 << (i66 & 31)) | iArr9[i67];
                }
                i57++;
            }
        } else {
            while (i57 < 10) {
                int i68 = (i56 - 5) + i57 + (i57 / 5);
                if (((1 << (i57 & 31)) & getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i57 / 32]) != 0) {
                    int i69 = ((i56 - 7) * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i68 / 32);
                    int[] iArr10 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    i11 = 1;
                    iArr10[i69] = (1 << (i68 & 31)) | iArr10[i69];
                } else {
                    i11 = 1;
                }
                int i70 = i57 + 10;
                if ((getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i70 / 32] & (i11 << (i70 & 31))) != 0) {
                    int i71 = i56 + 7;
                    int i72 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i68) + (i71 / 32);
                    int[] iArr11 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    i12 = 1;
                    iArr11[i72] = (1 << (i71 & 31)) | iArr11[i72];
                } else {
                    i12 = 1;
                }
                int i73 = 29 - i57;
                if ((getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i73 / 32] & (i12 << (i73 & 31))) != 0) {
                    int i74 = ((i56 + 7) * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i68 / 32);
                    int[] iArr12 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    i13 = 1;
                    iArr12[i74] = (1 << (i68 & 31)) | iArr12[i74];
                } else {
                    i13 = 1;
                }
                int i75 = 39 - i57;
                if ((getflashtypeB.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i75 / 32] & (i13 << (i75 & 31))) != 0) {
                    int i76 = i56 - 7;
                    int i77 = (i68 * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + (i76 / 32);
                    int[] iArr13 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr13[i77] = (1 << (i76 & 31)) | iArr13[i77];
                }
                i57++;
            }
        }
        if (i9 != 0) {
            b(getbufferformat, i56, 5);
        } else {
            b(getbufferformat, i56, 7);
            int i78 = 0;
            int i79 = 0;
            while (i78 < (i28 / 2) - 1) {
                for (int i80 = i56 & 1; i80 < i10; i80 += 2) {
                    int i81 = i56 - i79;
                    int i82 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i80) + (i81 / 32);
                    int[] iArr14 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr14[i82] = (1 << (i81 & 31)) | iArr14[i82];
                    int i83 = i56 + i79;
                    int i84 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i80) + (i83 / 32);
                    int[] iArr15 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr15[i84] = (1 << (i83 & 31)) | iArr15[i84];
                    int i85 = i80 / 32;
                    int i86 = (i81 * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + i85;
                    int[] iArr16 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    int i87 = 1 << (i80 & 31);
                    iArr16[i86] = iArr16[i86] | i87;
                    int i88 = (i83 * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + i85;
                    int[] iArr17 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr17[i88] = iArr17[i88] | i87;
                }
                i78 += 15;
                i79 += 16;
            }
        }
        getVideoCodecMimeType getvideocodecmimetype = new getVideoCodecMimeType();
        getvideocodecmimetype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getbufferformat;
        return getvideocodecmimetype;
    }

    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlashType getflashtype, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = (i4 * i) + i6;
                i5 |= (getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i7 / 32] & (1 << (i7 & 31))) != 0 ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static ImageInputConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        if (i == 4) {
            return ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        if (i == 6) {
            return ImageInputConfigBuilder.b;
        }
        if (i == 8) {
            return ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (i == 10) {
            return ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (i == 12) {
            return ImageInputConfigBuilder.TuitionPaymentFragmentbindingInflater1;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    private static getFlashType TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype, int i) {
        getFlashType getflashtype2 = new getFlashType();
        int i2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 < i2) {
                    if ((getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i7 / 32] & (1 << (i7 & 31))) != 0) {
                        i5 |= 1 << ((i - 1) - i6);
                    }
                } else {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                getflashtype2.TuitionPaymentFragmentbindingInflater1(i8, i);
            } else {
                if (i8 == 0) {
                    getflashtype2.TuitionPaymentFragmentbindingInflater1(i5 | 1, i);
                } else {
                    getflashtype2.TuitionPaymentFragmentbindingInflater1(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return getflashtype2;
    }

    private static void b(getBufferFormat getbufferformat, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    int i7 = i5 / 32;
                    int i8 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i4) + i7;
                    int[] iArr = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    int i9 = 1 << (i5 & 31);
                    iArr[i8] = iArr[i8] | i9;
                    int i10 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i6) + i7;
                    int[] iArr2 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr2[i10] = iArr2[i10] | i9;
                    int i11 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i5) + (i4 / 32);
                    int[] iArr3 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr3[i11] = (1 << (i4 & 31)) | iArr3[i11];
                    int i12 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i5) + (i6 / 32);
                    int[] iArr4 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr4[i12] = (1 << (i6 & 31)) | iArr4[i12];
                    i5++;
                }
            }
        }
        int i13 = i - i2;
        int i14 = i13 / 32;
        int i15 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i13) + i14;
        int[] iArr5 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        int i16 = 1 << (i13 & 31);
        iArr5[i15] = iArr5[i15] | i16;
        int i17 = i13 + 1;
        int i18 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i13) + (i17 / 32);
        int[] iArr6 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        iArr6[i18] = (1 << (i17 & 31)) | iArr6[i18];
        int i19 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i17) + i14;
        int[] iArr7 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        iArr7[i19] = i16 | iArr7[i19];
        int i20 = i + i2;
        int i21 = i20 / 32;
        int i22 = (i13 * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + i21;
        int[] iArr8 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        int i23 = 1 << (i20 & 31);
        iArr8[i22] = iArr8[i22] | i23;
        int i24 = (i17 * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + i21;
        int[] iArr9 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        iArr9[i24] = iArr9[i24] | i23;
        int i25 = ((i20 - 1) * getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1) + i21;
        int[] iArr10 = getbufferformat.TuitionPaymentFragmentbindingInflater1;
        iArr10[i25] = iArr10[i25] | i23;
    }

    private static getFlashType b(getFlashType getflashtype, int i, int i2) {
        int i3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 / i2;
        getCustomOrderedResolutions getcustomorderedresolutions = new getCustomOrderedResolutions(TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2));
        int i4 = i / i2;
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, i2, i4);
        getcustomorderedresolutions.b(iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3, i4 - i3);
        getFlashType getflashtype2 = new getFlashType();
        getflashtype2.TuitionPaymentFragmentbindingInflater1(0, i % i2);
        for (int i5 : iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getflashtype2.TuitionPaymentFragmentbindingInflater1(i5, i2);
        }
        return getflashtype2;
    }
}
