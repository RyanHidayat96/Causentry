package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.Utils_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\r\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "p0", "Landroidx/compose/runtime/tooling/SourceInformation;", "parseSourceInformation", "(Ljava/lang/String;)Landroidx/compose/runtime/tooling/SourceInformation;", "parseSourceInformationInternal", "Landroidx/compose/runtime/tooling/SourceInfoParserState;", "", "hasSection", "(Landroidx/compose/runtime/tooling/SourceInfoParserState;)Z", "", "Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "parseParameterIndex", "(Landroidx/compose/runtime/tooling/SourceInfoParserState;)Ljava/util/List;", "parseParameterNames", "Landroidx/compose/runtime/tooling/LocationSourceInformation;", "parseLocations", "replaceComposePrefix", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SourceInformationKt {
    public static final SourceInformation parseSourceInformation(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return parseSourceInformationInternal(str);
        } catch (ParseException e2) {
            Utils_androidKt.logError(e2.getMessage(), e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0084 A[SYNTHETIC] */
    public static final SourceInformation parseSourceInformationInternal(String str) throws ParseException {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        List<ParameterSourceInformation> listEmptyList;
        List<LocationSourceInformation> listEmptyList2;
        String strTakeUntil;
        String str3;
        char cCurrent;
        int i;
        SourceInfoParserState sourceInfoParserState = new SourceInfoParserState(str);
        String strTakeUntilEnd = null;
        if (sourceInfoParserState.matches('C')) {
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            if (sourceInfoParserState.matches('C')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            if (sourceInfoParserState.matches('(')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                String strTakeUntil2 = sourceInfoParserState.takeUntil(")");
                sourceInfoParserState.expect(')');
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z3 = z;
                str2 = strTakeUntil2;
                z2 = true;
            } else {
                z2 = true;
            }
            listEmptyList = CollectionsKt.emptyList();
            while (hasSection(sourceInfoParserState)) {
                cCurrent = sourceInfoParserState.current();
                if (cCurrent != 'N') {
                    listEmptyList = parseParameterNames(sourceInfoParserState);
                } else if (cCurrent != 'P') {
                    listEmptyList = parseParameterIndex(sourceInfoParserState);
                } else {
                    sourceInfoParserState.advance(2);
                    i = 0;
                    while (true) {
                        if (i <= 0 || !sourceInfoParserState.matches(')')) {
                            if (!sourceInfoParserState.atEnd()) {
                                sourceInfoParserState.throwParseError("unexpected end");
                                throw new KotlinNothingValueException();
                            }
                            if (sourceInfoParserState.matches('(')) {
                                i++;
                            } else if (sourceInfoParserState.matches(')')) {
                                i--;
                            }
                            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                        } else {
                            sourceInfoParserState.expect(')');
                            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                            break;
                        }
                    }
                }
            }
            listEmptyList2 = CollectionsKt.emptyList();
            if (!sourceInfoParserState.matches(':')) {
                listEmptyList2 = parseLocations(sourceInfoParserState);
            } else {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
            List<LocationSourceInformation> list = listEmptyList2;
            strTakeUntil = sourceInfoParserState.takeUntil("#");
            if (strTakeUntil.length() <= 0) {
                str3 = null;
            } else {
                str3 = strTakeUntil;
            }
            if (sourceInfoParserState.matches('#')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                strTakeUntilEnd = sourceInfoParserState.takeUntilEnd();
            }
            return new SourceInformation(z2, z3, str2, str3, listEmptyList, strTakeUntilEnd, list, str);
        }
        z = false;
        z2 = false;
        z3 = z;
        str2 = null;
        listEmptyList = CollectionsKt.emptyList();
        while (hasSection(sourceInfoParserState)) {
            cCurrent = sourceInfoParserState.current();
            if (cCurrent != 'N') {
                listEmptyList = parseParameterNames(sourceInfoParserState);
            } else if (cCurrent != 'P') {
                listEmptyList = parseParameterIndex(sourceInfoParserState);
            } else {
                sourceInfoParserState.advance(2);
                i = 0;
                while (true) {
                    if (i <= 0) {
                    }
                    if (!sourceInfoParserState.atEnd()) {
                        sourceInfoParserState.throwParseError("unexpected end");
                        throw new KotlinNothingValueException();
                    }
                    if (sourceInfoParserState.matches('(')) {
                        i++;
                    } else if (sourceInfoParserState.matches(')')) {
                        i--;
                    }
                    SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                }
            }
        }
        listEmptyList2 = CollectionsKt.emptyList();
        if (!sourceInfoParserState.matches(':')) {
            listEmptyList2 = parseLocations(sourceInfoParserState);
        } else {
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        }
        List<LocationSourceInformation> list2 = listEmptyList2;
        strTakeUntil = sourceInfoParserState.takeUntil("#");
        if (strTakeUntil.length() <= 0) {
            str3 = null;
        } else {
            str3 = strTakeUntil;
        }
        if (sourceInfoParserState.matches('#')) {
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            strTakeUntilEnd = sourceInfoParserState.takeUntilEnd();
        }
        return new SourceInformation(z2, z3, str2, str3, listEmptyList, strTakeUntilEnd, list2, str);
    }

    private static final boolean hasSection(SourceInfoParserState sourceInfoParserState) {
        return sourceInfoParserState.getI() < sourceInfoParserState.getData().length() - 1 && Character.isLetter(sourceInfoParserState.getData().charAt(sourceInfoParserState.getI())) && sourceInfoParserState.getData().charAt(sourceInfoParserState.getI() + 1) == '(';
    }

    private static final List<ParameterSourceInformation> parseParameterIndex(SourceInfoParserState sourceInfoParserState) throws ParseException {
        String strReplaceComposePrefix;
        sourceInfoParserState.advance(2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
            if (sourceInfoParserState.matches('!')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                String strTakeUntil = sourceInfoParserState.takeUntil("!,)");
                if (strTakeUntil.length() != 0) {
                    int i = Integer.parseInt(strTakeUntil);
                    int i2 = 0;
                    while (i > 0) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                if (((ParameterSourceInformation) arrayList.get(i3)).getSortedIndex() == i2) {
                                    i2++;
                                    break;
                                }
                                i3++;
                            } else {
                                arrayList.add(new ParameterSourceInformation(i2, null, null, 6, null));
                                i--;
                                break;
                            }
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int iTakeIntUntil = sourceInfoParserState.takeIntUntil("!:,)");
                if (sourceInfoParserState.matches(':')) {
                    SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                    strReplaceComposePrefix = replaceComposePrefix(sourceInfoParserState.takeUntil("!,)"));
                } else {
                    strReplaceComposePrefix = null;
                }
                if (z) {
                    int i4 = 0;
                    while (i4 < iTakeIntUntil) {
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 < size2) {
                                if (((ParameterSourceInformation) arrayList.get(i5)).getSortedIndex() == i4) {
                                    i4++;
                                    break;
                                }
                                i5++;
                            } else {
                                arrayList.add(new ParameterSourceInformation(i4, null, null, 6, null));
                                break;
                            }
                        }
                    }
                    z = false;
                }
                arrayList.add(new ParameterSourceInformation(iTakeIntUntil, null, strReplaceComposePrefix, 2, null));
            }
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        sourceInfoParserState.expect(')');
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final List<ParameterSourceInformation> parseParameterNames(SourceInfoParserState sourceInfoParserState) throws ParseException {
        String strReplaceComposePrefix;
        sourceInfoParserState.advance(2);
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
            String strTakeUntil = sourceInfoParserState.takeUntil(":,)");
            if (sourceInfoParserState.matches(':')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                strReplaceComposePrefix = replaceComposePrefix(sourceInfoParserState.takeUntil(",)"));
            } else {
                strReplaceComposePrefix = null;
            }
            arrayList.add(new ParameterSourceInformation(arrayList.size(), strTakeUntil, strReplaceComposePrefix));
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        sourceInfoParserState.expect(')');
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final List<LocationSourceInformation> parseLocations(SourceInfoParserState sourceInfoParserState) throws ParseException {
        boolean z;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(':')) {
            if (sourceInfoParserState.matches('*')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf2 = !sourceInfoParserState.matches('@') ? Integer.valueOf(sourceInfoParserState.takeIntUntil("@") + 1) : null;
            SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            int iTakeIntUntil = sourceInfoParserState.takeIntUntil("L,:");
            if (sourceInfoParserState.matches('L')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
                numValueOf = Integer.valueOf(sourceInfoParserState.takeIntUntil(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new LocationSourceInformation(numValueOf2 != null ? numValueOf2.intValue() : -1, iTakeIntUntil, numValueOf != null ? numValueOf.intValue() : -1, z));
            if (sourceInfoParserState.matches(',')) {
                SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
            }
        }
        SourceInfoParserState.advance$default(sourceInfoParserState, 0, 1, null);
        return arrayList;
    }

    private static final String replaceComposePrefix(String str) {
        return StringsKt.replaceFirst$default(str, "c#", "androidx.compose.", false, 4, (Object) null);
    }
}
