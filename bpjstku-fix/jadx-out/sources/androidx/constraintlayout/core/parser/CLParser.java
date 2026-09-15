package androidx.constraintlayout.core.parser;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes5.dex */
public class CLParser {
    static boolean sDebug = false;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014a A[EDGE_INSN: B:104:0x014a->B:114:? BREAK  A[LOOP:1: B:13:0x0035->B:84:0x0144], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    public CLObject parse() throws CLParsingException {
        boolean z;
        char c;
        long j;
        CLToken cLToken;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.mLineNumber = 1;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c2 = charArray[i2];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.mLineNumber++;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.mLineNumber);
        cLObjectAllocate.setStart(i2);
        int i3 = i2 + 1;
        CLElement container = cLObjectAllocate;
        while (i3 < length) {
            char c3 = charArray[i3];
            if (c3 == '\n') {
                this.mLineNumber += i;
            }
            if (!this.mHasComment) {
                if (container != null) {
                    break;
                }
                if (container.isDone()) {
                    container = getNextJsonElement(i3, c3, container, charArray);
                } else if (container instanceof CLObject) {
                    if (c3 == '}') {
                        container.setEnd(i3 - 1);
                    } else {
                        container = getNextJsonElement(i3, c3, container, charArray);
                    }
                } else if (container instanceof CLArray) {
                    z = container instanceof CLString;
                    if (z) {
                        if (charArray[(int) container.mStart] == c3) {
                            container.setStart(container.mStart + 1);
                            container.setEnd(i3 - 1);
                        }
                    } else {
                        if (container instanceof CLToken) {
                            cLToken = (CLToken) container;
                            if (!cLToken.validate(c3, i3)) {
                                StringBuilder sb = new StringBuilder("parsing incorrect token ");
                                sb.append(cLToken.content());
                                sb.append(" at line ");
                                sb.append(this.mLineNumber);
                                throw new CLParsingException(sb.toString(), cLToken);
                            }
                        }
                        if ((!(container instanceof CLKey) || z) && (((c = charArray[(int) container.mStart]) == '\'' || c == '\"') && c == c3)) {
                            container.setStart(container.mStart + 1);
                            container.setEnd(i3 - 1);
                        }
                        if (!container.isDone() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                            j = i3 - 1;
                            container.setEnd(j);
                            if (c3 != '}' || c3 == ']') {
                                container = container.getContainer();
                                container.setEnd(j);
                                if (container instanceof CLKey) {
                                    container = container.getContainer();
                                    container.setEnd(j);
                                }
                            }
                        }
                    }
                } else if (c3 == ']') {
                    container.setEnd(i3 - 1);
                } else {
                    container = getNextJsonElement(i3, c3, container, charArray);
                }
                if (!container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).mElements.size() > 0)) {
                    container = container.getContainer();
                }
            } else if (c3 == '\n') {
                this.mHasComment = z2;
                if (container != null) {
                    break;
                    break;
                }
                if (container.isDone()) {
                    container = getNextJsonElement(i3, c3, container, charArray);
                } else if (container instanceof CLObject) {
                    if (c3 == '}') {
                        container.setEnd(i3 - 1);
                    } else {
                        container = getNextJsonElement(i3, c3, container, charArray);
                    }
                } else if (container instanceof CLArray) {
                    z = container instanceof CLString;
                    if (z) {
                        if (charArray[(int) container.mStart] == c3) {
                            container.setStart(container.mStart + 1);
                            container.setEnd(i3 - 1);
                        }
                    } else {
                        if (container instanceof CLToken) {
                            cLToken = (CLToken) container;
                            if (!cLToken.validate(c3, i3)) {
                                StringBuilder sb2 = new StringBuilder("parsing incorrect token ");
                                sb2.append(cLToken.content());
                                sb2.append(" at line ");
                                sb2.append(this.mLineNumber);
                                throw new CLParsingException(sb2.toString(), cLToken);
                            }
                        }
                        if (!(container instanceof CLKey)) {
                            container.setStart(container.mStart + 1);
                            container.setEnd(i3 - 1);
                        } else {
                            container.setStart(container.mStart + 1);
                            container.setEnd(i3 - 1);
                        }
                        if (!container.isDone()) {
                            j = i3 - 1;
                            container.setEnd(j);
                            if (c3 != '}') {
                                container = container.getContainer();
                                container.setEnd(j);
                                if (container instanceof CLKey) {
                                    container = container.getContainer();
                                    container.setEnd(j);
                                }
                            } else {
                                container = container.getContainer();
                                container.setEnd(j);
                                if (container instanceof CLKey) {
                                    container = container.getContainer();
                                    container.setEnd(j);
                                }
                            }
                        }
                    }
                } else if (c3 == ']') {
                    container.setEnd(i3 - 1);
                } else {
                    container = getNextJsonElement(i3, c3, container, charArray);
                }
                if (!container.isDone()) {
                }
            } else {
                continue;
            }
            i3++;
            i = 1;
            z2 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof CLString) {
                container.setStart(((int) container.mStart) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (sDebug) {
            PrintStream printStream = System.out;
            StringBuilder sb3 = new StringBuilder("Root: ");
            sb3.append(cLObjectAllocate.toJSON());
            printStream.println(sb3.toString());
        }
        return cLObjectAllocate;
    }

    private CLElement getNextJsonElement(int i, char c, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c == '\"' || c == '\'') {
                if (cLElement instanceof CLObject) {
                    return createElement(cLElement, i, TYPE.KEY, true, cArr);
                }
                return createElement(cLElement, i, TYPE.STRING, true, cArr);
            }
            if (c == '[') {
                return createElement(cLElement, i, TYPE.ARRAY, true, cArr);
            }
            if (c != ']') {
                if (c == '{') {
                    return createElement(cLElement, i, TYPE.OBJECT, true, cArr);
                }
                if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return createElement(cLElement, i, TYPE.NUMBER, true, cArr);
                        case '/':
                            int i2 = i + 1;
                            if (i2 < cArr.length && cArr[i2] == '/') {
                                this.mHasComment = true;
                                return cLElement;
                            }
                        case ',':
                        case ':':
                            return cLElement;
                        default:
                            if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                                CLElement cLElementCreateElement = createElement(cLElement, i, TYPE.TOKEN, true, cArr);
                                CLToken cLToken = (CLToken) cLElementCreateElement;
                                if (cLToken.validate(c, i)) {
                                    return cLElementCreateElement;
                                }
                                StringBuilder sb = new StringBuilder("incorrect token <");
                                sb.append(c);
                                sb.append("> at line ");
                                sb.append(this.mLineNumber);
                                throw new CLParsingException(sb.toString(), cLToken);
                            }
                            return createElement(cLElement, i, TYPE.KEY, true, cArr);
                    }
                }
            }
            cLElement.setEnd(i - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i);
            return container;
        }
        return cLElement;
    }

    private CLElement createElement(CLElement cLElement, int i, TYPE type, boolean z, char[] cArr) {
        CLElement cLElementAllocate;
        if (sDebug) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("CREATE ");
            sb.append(type);
            sb.append(" at ");
            sb.append(cArr[i]);
            printStream.println(sb.toString());
        }
        switch (type.ordinal()) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                cLElementAllocate = CLNumber.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = CLString.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.mLineNumber);
        if (z) {
            cLElementAllocate.setStart(i);
        }
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }
}
