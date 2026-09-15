package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.pdf417.decoder.DecodedBitStreamParser;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class RequestProcessorCallback {
    private static final getTemplateId TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getTemplateId();

    /* JADX WARN: Code duplicated, block: B:119:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0294  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    public static getCaptureBundle TuitionPaymentFragmentspecialinlinedviewModeldefault1(getBufferFormat getbufferformat, DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, DeferrableSurfaces1 deferrableSurfaces3, DeferrableSurfaces1 deferrableSurfaces4, int i, int i2) throws NotFoundException, ChecksumException, FormatException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ReadableConfig readableConfig;
        int i8;
        int i9;
        int i10;
        ReadableConfig readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        buildQuirkSettings buildquirksettingsTuitionPaymentFragmentbindingInflater1;
        buildQuirkSettings buildquirksettingsTuitionPaymentFragmentbindingInflater2;
        Quirks quirks = new Quirks(getbufferformat, deferrableSurfaces1, deferrableSurfaces2, deferrableSurfaces3, deferrableSurfaces4);
        boolean z = false;
        RequestProcessorRequest requestProcessorRequestTuitionPaymentFragmentbindingInflater1 = null;
        RequestProcessorRequest requestProcessorRequestTuitionPaymentFragmentbindingInflater2 = null;
        QuirkSettingsLoaderMetadataHolderService quirkSettingsLoaderMetadataHolderService = null;
        for (int i11 = 0; i11 < 2; i11++) {
            if (deferrableSurfaces1 != null) {
                requestProcessorRequestTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getbufferformat, quirks, deferrableSurfaces1, true, i, i2);
            }
            if (deferrableSurfaces3 != null) {
                requestProcessorRequestTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(getbufferformat, quirks, deferrableSurfaces3, false, i, i2);
            }
            if (requestProcessorRequestTuitionPaymentFragmentbindingInflater1 == null && requestProcessorRequestTuitionPaymentFragmentbindingInflater2 == null) {
                quirkSettingsLoaderMetadataHolderService = null;
            } else {
                if (requestProcessorRequestTuitionPaymentFragmentbindingInflater1 == null || (buildquirksettingsTuitionPaymentFragmentbindingInflater1 = requestProcessorRequestTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1()) == null) {
                    if (requestProcessorRequestTuitionPaymentFragmentbindingInflater2 == null) {
                        buildquirksettingsTuitionPaymentFragmentbindingInflater1 = null;
                    } else {
                        buildquirksettingsTuitionPaymentFragmentbindingInflater1 = requestProcessorRequestTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1();
                    }
                } else if (requestProcessorRequestTuitionPaymentFragmentbindingInflater2 != null && (buildquirksettingsTuitionPaymentFragmentbindingInflater2 = requestProcessorRequestTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1()) != null && buildquirksettingsTuitionPaymentFragmentbindingInflater1.b != buildquirksettingsTuitionPaymentFragmentbindingInflater2.b && buildquirksettingsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != buildquirksettingsTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && buildquirksettingsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != buildquirksettingsTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    buildquirksettingsTuitionPaymentFragmentbindingInflater1 = null;
                }
                if (buildquirksettingsTuitionPaymentFragmentbindingInflater1 == null) {
                    quirkSettingsLoaderMetadataHolderService = null;
                } else {
                    Quirks quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestProcessorRequestTuitionPaymentFragmentbindingInflater1);
                    Quirks quirksTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(requestProcessorRequestTuitionPaymentFragmentbindingInflater2);
                    if (quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1 = quirksTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else if (quirksTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Quirks(quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1.g, quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, quirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder, quirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                    quirkSettingsLoaderMetadataHolderService = new QuirkSettingsLoaderMetadataHolderService(buildquirksettingsTuitionPaymentFragmentbindingInflater1, quirksTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
            if (quirkSettingsLoaderMetadataHolderService == null) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            if (i11 != 0 || quirkSettingsLoaderMetadataHolderService.b == null || (quirkSettingsLoaderMetadataHolderService.b.d >= quirks.d && quirkSettingsLoaderMetadataHolderService.b.b <= quirks.b)) {
                quirkSettingsLoaderMetadataHolderService.b = quirks;
                break;
            }
            quirks = quirkSettingsLoaderMetadataHolderService.b;
        }
        int i12 = 1;
        int i13 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[0] = requestProcessorRequestTuitionPaymentFragmentbindingInflater1;
        quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i13] = requestProcessorRequestTuitionPaymentFragmentbindingInflater2;
        boolean z2 = requestProcessorRequestTuitionPaymentFragmentbindingInflater1 != null;
        int i14 = i;
        int iMax = i2;
        int i15 = 1;
        while (i15 <= i13) {
            int i16 = z2 ? i15 : i13 - i15;
            if (quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i16] == null) {
                addQuirkForTesting requestProcessorRequest = (i16 == 0 || i16 == i13) ? new RequestProcessorRequest(quirks, i16 == 0 ? i12 : z) : new addQuirkForTesting(quirks);
                quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i16] = requestProcessorRequest;
                int i17 = quirks.d;
                int i18 = -1;
                while (i17 <= quirks.b) {
                    int i19 = z2 ? i12 : -1;
                    int i20 = i16 - i19;
                    if (i20 < 0 || i20 > quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i12) {
                        readableConfig = null;
                    } else {
                        addQuirkForTesting addquirkfortesting = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i20];
                        readableConfig = addquirkfortesting.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i17 - addquirkfortesting.b.d];
                    }
                    if (readableConfig != null) {
                        i9 = z2 ? readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        ReadableConfig readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i16].TuitionPaymentFragmentspecialinlinedviewModeldefault2(i17);
                        if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            i9 = z2 ? readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        } else {
                            if (i20 >= 0 && i20 <= quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i12) {
                                readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i20].TuitionPaymentFragmentspecialinlinedviewModeldefault2(i17);
                            }
                            if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                i9 = z2 ? readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            } else {
                                int i21 = i16;
                                int i22 = 0;
                                while (true) {
                                    i21 -= i19;
                                    if (i21 < 0 || i21 > quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i12) {
                                        i8 = i13;
                                        Quirks quirks2 = quirkSettingsLoaderMetadataHolderService.b;
                                        if (!z2) {
                                            i9 = quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            break;
                                        }
                                        i9 = quirks2.asInterface;
                                        break;
                                    }
                                    ReadableConfig[] readableConfigArr = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i21].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int length = readableConfigArr.length;
                                    i8 = i13;
                                    int i23 = 0;
                                    while (i23 < length) {
                                        int i24 = length;
                                        ReadableConfig readableConfig2 = readableConfigArr[i23];
                                        if (readableConfig2 != null) {
                                            i9 = (i19 * i22 * (readableConfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) + (z2 ? readableConfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : readableConfig2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                            break;
                                        }
                                        i23++;
                                        length = i24;
                                    }
                                    i22++;
                                    i13 = i8;
                                    i12 = 1;
                                }
                            }
                            if (i9 >= 0 || i9 > quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                if (i18 != -1) {
                                    i9 = i18;
                                    i10 = i17;
                                    readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, quirks.asInterface, quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z2, i9, i10, i14, iMax);
                                    if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                        requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i10 - requestProcessorRequest.b.d] = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int iMin = Math.min(i14, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        i18 = i9;
                                        iMax = Math.max(iMax, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                        i14 = iMin;
                                    }
                                } else {
                                    i10 = i17;
                                }
                                i18 = i18;
                            } else {
                                i10 = i17;
                                readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, quirks.asInterface, quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z2, i9, i10, i14, iMax);
                                if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                    requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i10 - requestProcessorRequest.b.d] = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    int iMin2 = Math.min(i14, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    i18 = i9;
                                    iMax = Math.max(iMax, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    i14 = iMin2;
                                } else {
                                    i18 = i18;
                                }
                            }
                            i17 = i10 + 1;
                            i13 = i8;
                            i12 = 1;
                        }
                    }
                    i8 = i13;
                    if (i9 >= 0) {
                        if (i18 != -1) {
                            i9 = i18;
                            i10 = i17;
                            readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, quirks.asInterface, quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z2, i9, i10, i14, iMax);
                            if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i10 - requestProcessorRequest.b.d] = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int iMin3 = Math.min(i14, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                i18 = i9;
                                iMax = Math.max(iMax, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                i14 = iMin3;
                            }
                            i17 = i10 + 1;
                            i13 = i8;
                            i12 = 1;
                        } else {
                            i10 = i17;
                        }
                    } else if (i18 != -1) {
                        i9 = i18;
                        i10 = i17;
                        readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, quirks.asInterface, quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z2, i9, i10, i14, iMax);
                        if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i10 - requestProcessorRequest.b.d] = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int iMin4 = Math.min(i14, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            i18 = i9;
                            iMax = Math.max(iMax, readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            i14 = iMin4;
                        }
                        i17 = i10 + 1;
                        i13 = i8;
                        i12 = 1;
                    } else {
                        i10 = i17;
                    }
                    i18 = i18;
                    i17 = i10 + 1;
                    i13 = i8;
                    i12 = 1;
                }
            }
            i15++;
            i13 = i13;
            z = false;
            i12 = 1;
        }
        RequestProcessor[][] requestProcessorArr = (RequestProcessor[][]) Array.newInstance((Class<?>) RequestProcessor.class, quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 2);
        for (RequestProcessor[] requestProcessorArr2 : requestProcessorArr) {
            int i25 = 0;
            while (true) {
                if (i25 < requestProcessorArr2.length) {
                    requestProcessorArr2[i25] = new RequestProcessor();
                    i25++;
                }
            }
        }
        char c = 0;
        quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1(quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[0]);
        int i26 = 1;
        quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1(quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1]);
        int i27 = 928;
        while (true) {
            addQuirkForTesting[] addquirkfortestingArr = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1;
            addQuirkForTesting addquirkfortesting2 = addquirkfortestingArr[c];
            if (addquirkfortesting2 != null && addquirkfortestingArr[quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i26] != null) {
                ReadableConfig[] readableConfigArr2 = addquirkfortesting2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ReadableConfig[] readableConfigArr3 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + i26].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                for (int i28 = 0; i28 < readableConfigArr2.length; i28++) {
                    ReadableConfig readableConfig3 = readableConfigArr2[i28];
                    if (readableConfig3 != null && readableConfigArr3[i28] != null && readableConfig3.b == readableConfigArr3[i28].b) {
                        for (int i29 = 1; i29 <= quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i29++) {
                            ReadableConfig readableConfig4 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i29].TuitionPaymentFragmentspecialinlinedviewModeldefault2[i28];
                            if (readableConfig4 != null) {
                                readableConfig4.b = readableConfigArr2[i28].b;
                                int i30 = readableConfig4.b;
                                if (i30 == -1 || readableConfig4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != (i30 % 3) * 3) {
                                    quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i29].TuitionPaymentFragmentspecialinlinedviewModeldefault2[i28] = null;
                                }
                            }
                        }
                    }
                }
            }
            addQuirkForTesting addquirkfortesting3 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[0];
            if (addquirkfortesting3 == null) {
                i3 = 0;
            } else {
                ReadableConfig[] readableConfigArr4 = addquirkfortesting3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i3 = 0;
                for (int i31 = 0; i31 < readableConfigArr4.length; i31++) {
                    ReadableConfig readableConfig5 = readableConfigArr4[i31];
                    if (readableConfig5 != null) {
                        int i32 = readableConfig5.b;
                        int i33 = i3;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                        for (int i34 = 1; i34 < quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1 && iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < 2; i34++) {
                            ReadableConfig readableConfig6 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i34].TuitionPaymentFragmentspecialinlinedviewModeldefault2[i31];
                            if (readableConfig6 != null) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = QuirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i32, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, readableConfig6);
                                int i35 = readableConfig6.b;
                                if (i35 == -1 || readableConfig6.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != (i35 % 3) * 3) {
                                    i33++;
                                }
                            }
                        }
                        i3 = i33;
                    }
                }
            }
            addQuirkForTesting addquirkfortesting4 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1];
            if (addquirkfortesting4 == null) {
                i4 = 0;
            } else {
                ReadableConfig[] readableConfigArr5 = addquirkfortesting4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i4 = 0;
                for (int i36 = 0; i36 < readableConfigArr5.length; i36++) {
                    ReadableConfig readableConfig7 = readableConfigArr5[i36];
                    if (readableConfig7 != null) {
                        int i37 = readableConfig7.b;
                        int i38 = i4;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = 0;
                        for (int i39 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1; i39 > 0 && iTuitionPaymentFragmentspecialinlinedviewModeldefault4 < 2; i39--) {
                            ReadableConfig readableConfig8 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i39].TuitionPaymentFragmentspecialinlinedviewModeldefault2[i36];
                            if (readableConfig8 != null) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = QuirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i37, iTuitionPaymentFragmentspecialinlinedviewModeldefault4, readableConfig8);
                                int i40 = readableConfig8.b;
                                if (i40 == -1 || readableConfig8.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != (i40 % 3) * 3) {
                                    i38++;
                                }
                            }
                        }
                        i4 = i38;
                    }
                }
            }
            int i41 = i3 + i4;
            if (i41 == 0) {
                i41 = 0;
            } else {
                for (int i42 = 1; i42 < quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1; i42++) {
                    ReadableConfig[] readableConfigArr6 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i42].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    for (int i43 = 0; i43 < readableConfigArr6.length; i43++) {
                        ReadableConfig readableConfig9 = readableConfigArr6[i43];
                        if (readableConfig9 != null && ((i5 = readableConfig9.b) == -1 || readableConfig9.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != (i5 % 3) * 3)) {
                            ReadableConfig readableConfig10 = readableConfigArr6[i43];
                            ReadableConfig[] readableConfigArr7 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i42 - 1].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            addQuirkForTesting addquirkfortesting5 = quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1[i42 + 1];
                            ReadableConfig[] readableConfigArr8 = addquirkfortesting5 != null ? addquirkfortesting5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : readableConfigArr7;
                            ReadableConfig[] readableConfigArr9 = new ReadableConfig[14];
                            readableConfigArr9[2] = readableConfigArr7[i43];
                            readableConfigArr9[3] = readableConfigArr8[i43];
                            if (i43 > 0) {
                                int i44 = i43 - 1;
                                readableConfigArr9[0] = readableConfigArr6[i44];
                                readableConfigArr9[4] = readableConfigArr7[i44];
                                readableConfigArr9[5] = readableConfigArr8[i44];
                            }
                            if (i43 > 1) {
                                int i45 = i43 - 2;
                                readableConfigArr9[8] = readableConfigArr6[i45];
                                readableConfigArr9[10] = readableConfigArr7[i45];
                                readableConfigArr9[11] = readableConfigArr8[i45];
                            }
                            if (i43 < readableConfigArr6.length - 1) {
                                int i46 = i43 + 1;
                                readableConfigArr9[1] = readableConfigArr6[i46];
                                readableConfigArr9[6] = readableConfigArr7[i46];
                                readableConfigArr9[7] = readableConfigArr8[i46];
                            }
                            if (i43 < readableConfigArr6.length - 2) {
                                int i47 = i43 + 2;
                                readableConfigArr9[9] = readableConfigArr6[i47];
                                readableConfigArr9[12] = readableConfigArr7[i47];
                                readableConfigArr9[13] = readableConfigArr8[i47];
                            }
                            for (int i48 = 0; i48 < 14; i48++) {
                                ReadableConfig readableConfig11 = readableConfigArr9[i48];
                                if (readableConfig11 != null && (i6 = readableConfig11.b) != -1 && readableConfig11.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == (i6 % 3) * 3 && readableConfig11.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == readableConfig10.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    readableConfig10.b = readableConfig11.b;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (i41 <= 0 || i41 >= i27) {
                break;
            }
            i27 = i41;
            c = 0;
            i26 = 1;
        }
        int i49 = 0;
        for (addQuirkForTesting addquirkfortesting6 : quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentbindingInflater1) {
            if (addquirkfortesting6 != null) {
                for (ReadableConfig readableConfig12 : addquirkfortesting6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    if (readableConfig12 != null && (i7 = readableConfig12.b) >= 0 && i7 < requestProcessorArr.length) {
                        requestProcessorArr[i7][i49].TuitionPaymentFragmentspecialinlinedviewModeldefault3(readableConfig12.TuitionPaymentFragmentbindingInflater1);
                    }
                }
            }
            i49++;
        }
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = requestProcessorArr[0][1].TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i50 = (quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) - (2 << quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length == 0) {
            if (i50 <= 0 || i50 > 928) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            requestProcessorArr[0][1].TuitionPaymentFragmentspecialinlinedviewModeldefault3(i50);
        } else if (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[0] != i50) {
            requestProcessorArr[0][1].TuitionPaymentFragmentspecialinlinedviewModeldefault3(i50);
        }
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i51 = 0; i51 < quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2; i51++) {
            int i52 = 0;
            while (i52 < quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i53 = i52 + 1;
                int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault4 = requestProcessorArr[i51][i53].TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i54 = (quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i51) + i52;
                if (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault4.length == 0) {
                    arrayList.add(Integer.valueOf(i54));
                } else if (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault4.length == 1) {
                    iArr[i54] = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault4[0];
                } else {
                    arrayList3.add(Integer.valueOf(i54));
                    arrayList2.add(iArrTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                }
                i52 = i53;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i55 = 0; i55 < size; i55++) {
            iArr2[i55] = (int[]) arrayList2.get(i55);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(quirkSettingsLoaderMetadataHolderService.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iArr, resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList), resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList3), iArr2);
    }

    private static RequestProcessorRequest TuitionPaymentFragmentbindingInflater1(getBufferFormat getbufferformat, Quirks quirks, DeferrableSurfaces1 deferrableSurfaces1, boolean z, int i, int i2) {
        int i3;
        RequestProcessorRequest requestProcessorRequest = new RequestProcessorRequest(quirks, z);
        int i4 = 0;
        while (i4 < 2) {
            int i5 = i4 == 0 ? 1 : -1;
            int i6 = (int) deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            for (int i7 = (int) deferrableSurfaces1.b; i7 <= quirks.b && i7 >= quirks.d; i7 += i5) {
                ReadableConfig readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getbufferformat, 0, getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3, z, i6, i7, i, i2);
                if (readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i7 - requestProcessorRequest.b.d] = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (z) {
                        i3 = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    } else {
                        i3 = readableConfigTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    i6 = i3;
                }
            }
            i4++;
        }
        return requestProcessorRequest;
    }

    private static getCaptureBundle TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, IOException, FormatException {
        int[] iArr5;
        int i2;
        int i3;
        RestrictedCameraControl restrictedCameraControl;
        int[] iArr6 = iArr3;
        int length = iArr6.length;
        int[] iArr7 = new int[length];
        int i4 = 100;
        loop0: while (true) {
            if (i4 <= 0) {
                throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            for (int i5 = 0; i5 < length; i5++) {
                iArr[iArr6[i5]] = iArr4[i5][iArr7[i5]];
            }
            int i6 = 1;
            try {
                if (iArr.length == 0) {
                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
                i3 = 1 << (i + 1);
                if ((iArr2 != null && iArr2.length > (i3 / 2) + 3) || i3 < 0 || i3 > 512) {
                    throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                getTemplateId gettemplateid = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                RestrictedCameraControl restrictedCameraControl2 = new RestrictedCameraControl(gettemplateid.b, iArr);
                int[] iArr8 = new int[i3];
                boolean z = false;
                for (int i7 = i3; i7 > 0; i7--) {
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = restrictedCameraControl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gettemplateid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i7]);
                    iArr8[i3 - i7] = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    break;
                }
                RestrictedCameraControl restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault3 = gettemplateid.b.b;
                if (iArr2 != null) {
                    for (int i8 : iArr2) {
                        int i9 = gettemplateid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(iArr.length - 1) - i8];
                        getParameters getparameters = gettemplateid.b;
                        int i10 = getparameters.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault3 = restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new RestrictedCameraControl(getparameters, new int[]{(i10 - i9) % i10, 1}));
                    }
                }
                RestrictedCameraControl restrictedCameraControl3 = new RestrictedCameraControl(gettemplateid.b, iArr8);
                RestrictedCameraControl restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2 = gettemplateid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i3, 1);
                if (restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1 < restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1) {
                    restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2 = restrictedCameraControl3;
                    restrictedCameraControl3 = restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                RestrictedCameraControl restrictedCameraControl4 = gettemplateid.b.g;
                RestrictedCameraControl restrictedCameraControl5 = gettemplateid.b.b;
                while (restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - i6 >= i3 / 2) {
                    if (restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] == 0) {
                        throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                    RestrictedCameraControl restrictedCameraControlTuitionPaymentFragmentbindingInflater1 = gettemplateid.b.g;
                    int length2 = restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - i6;
                    int[] iArr9 = restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i11 = iArr9[(iArr9.length - i6) - length2];
                    getParameters getparameters2 = gettemplateid.b;
                    if (i11 == 0) {
                        throw new ArithmeticException();
                    }
                    int[] iArr10 = getparameters2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i12 = getparameters2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - getparameters2.TuitionPaymentFragmentbindingInflater1[i11];
                    int i13 = iArr10[i12 - 1];
                    for (int i14 = 1; restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - i14 >= restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - i14 && restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] != 0; i14 = 1) {
                        int length3 = (restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1) - (restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1);
                        getParameters getparameters3 = gettemplateid.b;
                        int length4 = restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1;
                        i2 = i4;
                        try {
                            int[] iArr11 = restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            iArr5 = iArr7;
                            try {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getparameters3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr11[(iArr11.length - 1) - length4], i13);
                                restrictedCameraControlTuitionPaymentFragmentbindingInflater1 = restrictedCameraControlTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(gettemplateid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(length3, iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                if (length3 >= 0) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
                                        restrictedCameraControl = restrictedCameraControl3.b.g;
                                    } else {
                                        int length5 = restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
                                        int[] iArr12 = new int[length3 + length5];
                                        int i15 = 0;
                                        while (i15 < length5) {
                                            iArr12[i15] = restrictedCameraControl3.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(restrictedCameraControl3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i15], iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                            i15++;
                                            length5 = length5;
                                        }
                                        restrictedCameraControl = new RestrictedCameraControl(restrictedCameraControl3.b, iArr12);
                                    }
                                    restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2 = restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(restrictedCameraControl);
                                    i4 = i2;
                                    iArr7 = iArr5;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } catch (ChecksumException unused) {
                            }
                        } catch (ChecksumException unused2) {
                            iArr5 = iArr7;
                        }
                    }
                    RestrictedCameraControl restrictedCameraControlB = restrictedCameraControlTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(restrictedCameraControl5).TuitionPaymentFragmentspecialinlinedviewModeldefault1(restrictedCameraControl4).b();
                    restrictedCameraControl4 = restrictedCameraControl5;
                    i4 = i4;
                    iArr7 = iArr7;
                    i6 = 1;
                    restrictedCameraControl5 = restrictedCameraControlB;
                    RestrictedCameraControl restrictedCameraControl6 = restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    restrictedCameraControlTuitionPaymentFragmentspecialinlinedviewModeldefault2 = restrictedCameraControl3;
                    restrictedCameraControl3 = restrictedCameraControl6;
                }
                int[] iArr13 = restrictedCameraControl5.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i16 = iArr13[iArr13.length - 1];
                if (i16 == 0) {
                    throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
                getParameters getparameters4 = gettemplateid.b;
                if (i16 == 0) {
                    throw new ArithmeticException();
                }
                int i17 = getparameters4.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(getparameters4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - getparameters4.TuitionPaymentFragmentbindingInflater1[i16]) - 1];
                RestrictedCameraControl[] restrictedCameraControlArr = {restrictedCameraControl5.b(i17), restrictedCameraControl3.b(i17)};
                RestrictedCameraControl restrictedCameraControl7 = restrictedCameraControlArr[0];
                RestrictedCameraControl restrictedCameraControl8 = restrictedCameraControlArr[1];
                int length6 = restrictedCameraControl7.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1;
                int[] iArr14 = new int[length6];
                int i18 = 0;
                for (int i19 = 1; i19 < gettemplateid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && i18 < length6; i19++) {
                    if (restrictedCameraControl7.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i19) == 0) {
                        getParameters getparameters5 = gettemplateid.b;
                        if (i19 == 0) {
                            throw new ArithmeticException();
                        }
                        iArr14[i18] = getparameters5.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(getparameters5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - getparameters5.TuitionPaymentFragmentbindingInflater1[i19]) - 1];
                        i18++;
                    }
                }
                if (i18 == length6) {
                    int length7 = restrictedCameraControl7.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1;
                    int[] iArr15 = new int[length7];
                    for (int i20 = 1; i20 <= length7; i20++) {
                        getParameters getparameters6 = gettemplateid.b;
                        int[] iArr16 = restrictedCameraControl7.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        iArr15[length7 - i20] = getparameters6.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i20, iArr16[(iArr16.length - 1) - i20]);
                    }
                    RestrictedCameraControl restrictedCameraControl9 = new RestrictedCameraControl(gettemplateid.b, iArr15);
                    int[] iArr17 = new int[length6];
                    for (int i21 = 0; i21 < length6; i21++) {
                        getParameters getparameters7 = gettemplateid.b;
                        int i22 = iArr14[i21];
                        if (i22 == 0) {
                            throw new ArithmeticException();
                        }
                        int i23 = getparameters7.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(getparameters7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - getparameters7.TuitionPaymentFragmentbindingInflater1[i22]) - 1];
                        getParameters getparameters8 = gettemplateid.b;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = restrictedCameraControl8.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i23);
                        int i24 = getparameters8.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i25 = (i24 - iTuitionPaymentFragmentspecialinlinedviewModeldefault3) % i24;
                        getParameters getparameters9 = gettemplateid.b;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = restrictedCameraControl9.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i23);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 0) {
                            throw new ArithmeticException();
                        }
                        iArr17[i21] = gettemplateid.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i25, getparameters9.TuitionPaymentFragmentspecialinlinedviewModeldefault1[(getparameters9.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - getparameters9.TuitionPaymentFragmentbindingInflater1[iTuitionPaymentFragmentspecialinlinedviewModeldefault4]) - 1]);
                    }
                    for (int i26 = 0; i26 < length6; i26++) {
                        int length8 = iArr.length - 1;
                        getParameters getparameters10 = gettemplateid.b;
                        int i27 = iArr14[i26];
                        if (i27 == 0) {
                            throw new IllegalArgumentException();
                        }
                        int i28 = length8 - getparameters10.TuitionPaymentFragmentbindingInflater1[i27];
                        if (i28 < 0) {
                            throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        }
                        getParameters getparameters11 = gettemplateid.b;
                        int i29 = iArr[i28];
                        int i30 = iArr17[i26];
                        int i31 = getparameters11.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        iArr[i28] = ((i29 + i31) - i30) % i31;
                    }
                    break loop0;
                }
                throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } catch (ChecksumException unused3) {
                iArr5 = iArr7;
                i2 = i4;
            }
            if (length == 0) {
                throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
            for (int i32 = 0; i32 < length; i32++) {
                int i33 = iArr5[i32];
                if (i33 < iArr4[i32].length - 1) {
                    iArr5[i32] = i33 + 1;
                    break;
                }
                iArr5[i32] = 0;
                if (i32 == length - 1) {
                    throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
            i4 = i2 - 1;
            iArr6 = iArr3;
            iArr7 = iArr5;
        }
        if (iArr.length < 4) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        int i34 = iArr[0];
        if (i34 <= iArr.length) {
            if (i34 == 0) {
                if (i3 < iArr.length) {
                    iArr[0] = iArr.length - i3;
                } else {
                    throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
            getCaptureBundle getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DecodedBitStreamParser.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr, String.valueOf(i));
            int length9 = iArr2.length;
            return getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private static ReadableConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2(getBufferFormat getbufferformat, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(getbufferformat, i, i2, z, i3, i4);
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbufferformat, i, i2, z, iTuitionPaymentFragmentbindingInflater1, i4);
        if (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return null;
        }
        int i8 = 0;
        for (int i9 : iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            i8 += i9;
        }
        if (z) {
            i7 = iTuitionPaymentFragmentbindingInflater1 + i8;
        } else {
            for (int i10 = 0; i10 < iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length / 2; i10++) {
                int i11 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i10];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[i10] = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[(iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length - 1) - i10];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3[(iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3.length - 1) - i10] = i11;
            }
            iTuitionPaymentFragmentbindingInflater1 -= i8;
            i7 = iTuitionPaymentFragmentbindingInflater1;
        }
        if (i5 - 2 > i8 || i8 > i6 + 2 || (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = resolveQuirkNames.TuitionPaymentFragmentspecialinlinedviewModeldefault1((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getTargetOutputConfigIds.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3)))) == -1) {
            return null;
        }
        return new ReadableConfig(iTuitionPaymentFragmentbindingInflater1, i7, TuitionPaymentFragmentspecialinlinedviewModeldefault3(iTuitionPaymentFragmentspecialinlinedviewModeldefault1), iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:30:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x001b A[SYNTHETIC] */
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(getBufferFormat getbufferformat, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
                if (i6 < 8) {
                    break;
                    break;
                }
                if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            } else {
                if (i3 >= i2) {
                    break;
                }
                if (i6 < 8) {
                    break;
                }
                if (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (i3 != i || i6 != 7) {
                return null;
            }
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    private static int TuitionPaymentFragmentbindingInflater1(getBufferFormat getbufferformat, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z == getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i6, i4)) {
                        break;
                        break;
                    }
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                } else {
                    if (i6 < i) {
                        break;
                    }
                    if (z == getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i6, i4)) {
                        break;
                    }
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    private static int[] TuitionPaymentFragmentbindingInflater1(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i);
        return ((((iArrTuitionPaymentFragmentbindingInflater1[0] - iArrTuitionPaymentFragmentbindingInflater1[2]) + iArrTuitionPaymentFragmentbindingInflater1[4]) - iArrTuitionPaymentFragmentbindingInflater1[6]) + 9) % 9;
    }

    private static Quirks TuitionPaymentFragmentspecialinlinedviewModeldefault1(RequestProcessorRequest requestProcessorRequest) throws NotFoundException {
        DeferrableSurfaces1 deferrableSurfaces1;
        DeferrableSurfaces1 deferrableSurfaces2;
        int[] iArr;
        int i;
        DeferrableSurfaces1 deferrableSurfaces3;
        DeferrableSurfaces1 deferrableSurfaces4;
        DeferrableSurfaces1 deferrableSurfaces5;
        DeferrableSurfaces1 deferrableSurfaces6;
        if (requestProcessorRequest == null) {
            return null;
        }
        buildQuirkSettings buildquirksettingsTuitionPaymentFragmentbindingInflater1 = requestProcessorRequest.TuitionPaymentFragmentbindingInflater1();
        int iMax = -1;
        if (buildquirksettingsTuitionPaymentFragmentbindingInflater1 == null) {
            iArr = null;
        } else {
            Quirks quirks = requestProcessorRequest.b;
            if (requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                deferrableSurfaces1 = quirks.g;
            } else {
                deferrableSurfaces1 = quirks.asBinder;
            }
            if (requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                deferrableSurfaces2 = quirks.TuitionPaymentFragmentbindingInflater1;
            } else {
                deferrableSurfaces2 = quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i2 = ((int) deferrableSurfaces2.b) - requestProcessorRequest.b.d;
            ReadableConfig[] readableConfigArr = requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = -1;
            for (int i4 = ((int) deferrableSurfaces1.b) - requestProcessorRequest.b.d; i4 < i2; i4++) {
                ReadableConfig readableConfig = readableConfigArr[i4];
                if (readableConfig != null) {
                    readableConfig.b = ((readableConfig.TuitionPaymentFragmentbindingInflater1 / 30) * 3) + (readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 3);
                    int i5 = readableConfig.b - i3;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i3 = readableConfig.b;
                        } else if (readableConfig.b >= buildquirksettingsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            readableConfigArr[i4] = null;
                        } else {
                            i3 = readableConfig.b;
                        }
                    }
                }
            }
            int i6 = buildquirksettingsTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            iArr = new int[i6];
            for (ReadableConfig readableConfig2 : requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (readableConfig2 != null && (i = readableConfig2.b) < i6) {
                    iArr[i] = iArr[i] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        for (int i7 : iArr) {
            iMax = Math.max(iMax, i7);
        }
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += iMax - i9;
            if (i9 > 0) {
                break;
            }
        }
        ReadableConfig[] readableConfigArr2 = requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        for (int i10 = 0; i8 > 0 && readableConfigArr2[i10] == null; i10++) {
            i8--;
        }
        int i11 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i12 = iArr[length];
            i11 += iMax - i12;
            if (i12 > 0) {
                break;
            }
        }
        for (int length2 = readableConfigArr2.length - 1; i11 > 0 && readableConfigArr2[length2] == null; length2--) {
            i11--;
        }
        Quirks quirks2 = requestProcessorRequest.b;
        boolean z = requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        DeferrableSurfaces1 deferrableSurfaces7 = quirks2.g;
        DeferrableSurfaces1 deferrableSurfaces8 = quirks2.TuitionPaymentFragmentbindingInflater1;
        DeferrableSurfaces1 deferrableSurfaces9 = quirks2.asBinder;
        DeferrableSurfaces1 deferrableSurfaces10 = quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i8 <= 0) {
            deferrableSurfaces3 = deferrableSurfaces7;
            deferrableSurfaces4 = deferrableSurfaces9;
        } else {
            DeferrableSurfaces1 deferrableSurfaces11 = z ? deferrableSurfaces7 : deferrableSurfaces9;
            int i13 = ((int) deferrableSurfaces11.b) - i8;
            DeferrableSurfaces1 deferrableSurfaces12 = new DeferrableSurfaces1(deferrableSurfaces11.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i13 >= 0 ? i13 : 0);
            if (z) {
                deferrableSurfaces7 = deferrableSurfaces12;
                deferrableSurfaces3 = deferrableSurfaces7;
                deferrableSurfaces4 = deferrableSurfaces9;
            } else {
                deferrableSurfaces4 = deferrableSurfaces12;
                deferrableSurfaces3 = deferrableSurfaces7;
            }
        }
        if (i11 <= 0) {
            deferrableSurfaces5 = deferrableSurfaces8;
            deferrableSurfaces6 = deferrableSurfaces10;
        } else {
            DeferrableSurfaces1 deferrableSurfaces13 = z ? quirks2.TuitionPaymentFragmentbindingInflater1 : quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i14 = ((int) deferrableSurfaces13.b) + i11;
            if (i14 >= quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b) {
                i14 = quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b - 1;
            }
            DeferrableSurfaces1 deferrableSurfaces14 = new DeferrableSurfaces1(deferrableSurfaces13.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i14);
            if (z) {
                deferrableSurfaces8 = deferrableSurfaces14;
                deferrableSurfaces5 = deferrableSurfaces8;
                deferrableSurfaces6 = deferrableSurfaces10;
            } else {
                deferrableSurfaces6 = deferrableSurfaces14;
                deferrableSurfaces5 = deferrableSurfaces8;
            }
        }
        quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return new Quirks(quirks2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces3, deferrableSurfaces5, deferrableSurfaces4, deferrableSurfaces6);
    }
}
