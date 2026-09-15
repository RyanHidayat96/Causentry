package defpackage;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class observe {
    final getFlashType TuitionPaymentFragmentbindingInflater1;
    private final CurrentParsingState TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CurrentParsingState();
    private final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new StringBuilder();

    observe(getFlashType getflashtype) {
        this.TuitionPaymentFragmentbindingInflater1 = getflashtype;
    }

    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            forceEnableQuirks forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, str);
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = instance.TuitionPaymentFragmentspecialinlinedviewModeldefault1(forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            String strValueOf = forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? String.valueOf(forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) : null;
            if (i == forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return sb.toString();
            }
            i = forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            str = strValueOf;
        }
    }

    final forceEnableQuirks TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, String str) throws FormatException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setLength(0);
        if (str != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(str);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = i;
        forceEnableQuirks forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString(), forceenablequirksTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
        }
        return new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x030d  */
    /* JADX WARN: Code duplicated, block: B:156:0x031d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0335  */
    /* JADX WARN: Code duplicated, block: B:161:0x0355 A[LOOP:3: B:130:0x0284->B:161:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x036b  */
    /* JADX WARN: Code duplicated, block: B:167:0x036e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0376  */
    /* JADX WARN: Code duplicated, block: B:172:0x0386 A[LOOP:4: B:166:0x036c->B:172:0x0386, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0396 A[SYNTHETIC] */
    private forceEnableQuirks TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws FormatException {
        int i;
        isEnabledWhenDeviceHasQuirk isenabledwhendevicehasquirk;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        QuirkSettingsHolder quirkSettingsHolder;
        forceEnableQuirks forceenablequirks;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        char c;
        shouldEnableQuirk shouldenablequirk;
        shouldEnableQuirk shouldenablequirk2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        char c2;
        shouldEnableQuirk shouldenablequirk3;
        shouldEnableQuirk shouldenablequirk4;
        do {
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == CurrentParsingState.State.ALPHA) {
                while (true) {
                    int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    if (i7 + 5 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i7, 5)) < 5 || iTuitionPaymentFragmentspecialinlinedviewModeldefault7 >= 16) && (i7 + 6 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i7, 6)) < 16 || iTuitionPaymentFragmentspecialinlinedviewModeldefault8 >= 63))) {
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b)) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b += 3;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CurrentParsingState.State.NUMERIC;
                        } else if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b)) {
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b + 5 < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b += 5;
                            } else {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            }
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CurrentParsingState.State.ISO_IEC_646;
                        }
                        isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk();
                    } else {
                        int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i8, 5);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 == 15) {
                            shouldenablequirk4 = new shouldEnableQuirk(i8 + 5, Typography.dollar);
                        } else {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 >= 5 && iTuitionPaymentFragmentspecialinlinedviewModeldefault9 < 15) {
                                shouldenablequirk3 = new shouldEnableQuirk(i8 + 5, (char) (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 + 43));
                            } else {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i8, 6);
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 >= 32 && iTuitionPaymentFragmentspecialinlinedviewModeldefault10 < 58) {
                                    shouldenablequirk3 = new shouldEnableQuirk(i8 + 6, (char) (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 + 33));
                                } else {
                                    switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault10) {
                                        case 58:
                                            c2 = '*';
                                            break;
                                        case 59:
                                            c2 = ',';
                                            break;
                                        case 60:
                                            c2 = '-';
                                            break;
                                        case 61:
                                            c2 = '.';
                                            break;
                                        case 62:
                                            c2 = '/';
                                            break;
                                        default:
                                            throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault10)));
                                    }
                                    shouldenablequirk3 = new shouldEnableQuirk(i8 + 6, c2);
                                }
                            }
                            shouldenablequirk4 = shouldenablequirk3;
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = shouldenablequirk4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (shouldenablequirk4.b == '$') {
                            isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk(new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()), true);
                        } else {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(shouldenablequirk4.b);
                        }
                    }
                }
                z = isenabledwhendevicehasquirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == CurrentParsingState.State.ISO_IEC_646) {
                while (true) {
                    int i9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    if (i9 + 5 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i9, 5)) < 5 || iTuitionPaymentFragmentspecialinlinedviewModeldefault4 >= 16) && (i9 + 7 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i9, 7)) < 64 || iTuitionPaymentFragmentspecialinlinedviewModeldefault5 >= 116) && (i9 + 8 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i9, 8)) < 232 || iTuitionPaymentFragmentspecialinlinedviewModeldefault6 >= 253))))) {
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b)) {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b += 3;
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CurrentParsingState.State.NUMERIC;
                        } else if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b)) {
                            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b + 5 < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b += 5;
                            } else {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            }
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CurrentParsingState.State.ALPHA;
                        }
                        isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk();
                    } else {
                        int i10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i10, 5);
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 == 15) {
                            shouldenablequirk2 = new shouldEnableQuirk(i10 + 5, Typography.dollar);
                        } else {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 >= 5 && iTuitionPaymentFragmentspecialinlinedviewModeldefault11 < 15) {
                                shouldenablequirk = new shouldEnableQuirk(i10 + 5, (char) (iTuitionPaymentFragmentspecialinlinedviewModeldefault11 + 43));
                            } else {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i10, 7);
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 >= 64 && iTuitionPaymentFragmentspecialinlinedviewModeldefault12 < 90) {
                                    shouldenablequirk = new shouldEnableQuirk(i10 + 7, (char) (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 + 1));
                                } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 >= 90 && iTuitionPaymentFragmentspecialinlinedviewModeldefault12 < 116) {
                                    shouldenablequirk = new shouldEnableQuirk(i10 + 7, (char) (iTuitionPaymentFragmentspecialinlinedviewModeldefault12 + 7));
                                } else {
                                    switch (TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i10, 8)) {
                                        case 232:
                                            c = '!';
                                            break;
                                        case 233:
                                            c = Typography.quote;
                                            break;
                                        case 234:
                                            c = '%';
                                            break;
                                        case 235:
                                            c = Typography.amp;
                                            break;
                                        case 236:
                                            c = '\'';
                                            break;
                                        case 237:
                                            c = '(';
                                            break;
                                        case 238:
                                            c = ')';
                                            break;
                                        case 239:
                                            c = '*';
                                            break;
                                        case 240:
                                            c = '+';
                                            break;
                                        case 241:
                                            c = ',';
                                            break;
                                        case 242:
                                            c = '-';
                                            break;
                                        case 243:
                                            c = '.';
                                            break;
                                        case 244:
                                            c = '/';
                                            break;
                                        case 245:
                                            c = ':';
                                            break;
                                        case 246:
                                            c = ';';
                                            break;
                                        case 247:
                                            c = Typography.less;
                                            break;
                                        case 248:
                                            c = '=';
                                            break;
                                        case 249:
                                            c = Typography.greater;
                                            break;
                                        case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                            c = '?';
                                            break;
                                        case 251:
                                            c = '_';
                                            break;
                                        case 252:
                                            c = ' ';
                                            break;
                                        default:
                                            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                    }
                                    shouldenablequirk = new shouldEnableQuirk(i10 + 8, c);
                                }
                            }
                            shouldenablequirk2 = shouldenablequirk;
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = shouldenablequirk2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (shouldenablequirk2.b == '$') {
                            isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk(new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()), true);
                        } else {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(shouldenablequirk2.b);
                        }
                    }
                }
                z = isenabledwhendevicehasquirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                while (true) {
                    int i11 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    if (i11 + 7 <= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        int i12 = i11;
                        while (true) {
                            int i13 = i11 + 3;
                            if (i12 < i13) {
                                if ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i12 / 32] & (1 << (i12 & 31))) == 0) {
                                    i12++;
                                }
                            } else if ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i13 / 32] & (1 << (i13 & 31))) == 0) {
                                i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                                if (i + 1 <= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                    i2 = 0;
                                    while (true) {
                                        if (i2 >= 4) {
                                            i3 = i2 + i;
                                            if (i3 < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                                if ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 / 32] & (1 << (i3 & 31))) != 0) {
                                                    i2++;
                                                }
                                            }
                                        }
                                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CurrentParsingState.State.ALPHA;
                                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b += 4;
                                    }
                                }
                                isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk();
                            }
                            i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                            i5 = i4 + 7;
                            if (i5 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i4, 4);
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
                                    quirkSettingsHolder = new QuirkSettingsHolder(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 10, 10);
                                } else {
                                    quirkSettingsHolder = new QuirkSettingsHolder(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1, 10);
                                }
                            } else {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i4, 7) - 8;
                                quirkSettingsHolder = new QuirkSettingsHolder(i5, iTuitionPaymentFragmentspecialinlinedviewModeldefault13 / 11, iTuitionPaymentFragmentspecialinlinedviewModeldefault13 % 11);
                            }
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = quirkSettingsHolder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            if (quirkSettingsHolder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 10) {
                                if (quirkSettingsHolder.b == 10) {
                                    forceenablequirks = new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
                                } else {
                                    forceenablequirks = new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString(), quirkSettingsHolder.b);
                                }
                                isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk(forceenablequirks, true);
                            } else {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(quirkSettingsHolder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                if (quirkSettingsHolder.b == 10) {
                                    isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk(new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()), true);
                                } else {
                                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(quirkSettingsHolder.b);
                                }
                            }
                        }
                    } else if (i11 + 4 <= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                        i5 = i4 + 7;
                        if (i5 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i4, 4);
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
                                quirkSettingsHolder = new QuirkSettingsHolder(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 10, 10);
                            } else {
                                quirkSettingsHolder = new QuirkSettingsHolder(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1, 10);
                            }
                        } else {
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, i4, 7) - 8;
                            quirkSettingsHolder = new QuirkSettingsHolder(i5, iTuitionPaymentFragmentspecialinlinedviewModeldefault14 / 11, iTuitionPaymentFragmentspecialinlinedviewModeldefault14 % 11);
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b = quirkSettingsHolder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (quirkSettingsHolder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == 10) {
                            if (quirkSettingsHolder.b == 10) {
                                forceenablequirks = new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString());
                            } else {
                                forceenablequirks = new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString(), quirkSettingsHolder.b);
                            }
                            isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk(forceenablequirks, true);
                        } else {
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(quirkSettingsHolder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            if (quirkSettingsHolder.b == 10) {
                                isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk(new forceEnableQuirks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toString()), true);
                            } else {
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(quirkSettingsHolder.b);
                            }
                        }
                    } else {
                        i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                        if (i + 1 <= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            i2 = 0;
                            while (true) {
                                if (i2 >= 4) {
                                    i3 = i2 + i;
                                    if (i3 < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                        if ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 / 32] & (1 << (i3 & 31))) != 0) {
                                            i2++;
                                        }
                                    }
                                }
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CurrentParsingState.State.ALPHA;
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b += 4;
                            }
                        }
                        isenabledwhendevicehasquirk = new isEnabledWhenDeviceHasQuirk();
                    }
                    z = isenabledwhendevicehasquirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
            }
            if (i6 != this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b || z) {
            }
            return isenabledwhendevicehasquirk.b;
        } while (!z);
        return isenabledwhendevicehasquirk.b;
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        int i2;
        if (i + 1 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1; i3++) {
            if (i3 == 2) {
                int i4 = i + 2;
                if ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i4 / 32] & (1 << (i4 & 31))) == 0) {
                    return false;
                }
            } else if ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 / 32] & (1 << (i2 & 31))) != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2 = i + 3;
        if (i2 > this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return false;
        }
        while (i < i2) {
            if (((1 << (i & 31)) & this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i / 32]) != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlashType getflashtype, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if ((getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5 / 32] & (1 << (i5 & 31))) != 0) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }
}
