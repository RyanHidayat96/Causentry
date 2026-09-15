package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    interface GeneratedValue {
        float value();
    }

    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    public static class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        public String getId() {
            return this.mId;
        }

        public String getType() {
            return this.mType;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        DesignElement(String str, String str2, HashMap<String, String> map) {
            this.mId = str;
            this.mType = str2;
            this.mParams = map;
        }
    }

    public static class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        void put(String str, int i) {
            this.mMargins.put(str, Integer.valueOf(i));
        }

        void put(String str, float f, float f2) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            this.mGenerators.put(str, new Generator(f, f2));
        }

        void put(String str, float f, float f2, float f3, String str2, String str3) {
            if (this.mGenerators.containsKey(str) && (this.mGenerators.get(str) instanceof OverrideValue)) {
                return;
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f, f2, f3, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        public void putOverride(String str, float f) {
            this.mGenerators.put(str, new OverrideValue(f));
        }

        float get(Object obj) {
            if (obj instanceof CLString) {
                String strContent = ((CLString) obj).content();
                if (this.mGenerators.containsKey(strContent)) {
                    return this.mGenerators.get(strContent).value();
                }
                if (this.mMargins.containsKey(strContent)) {
                    return this.mMargins.get(strContent).floatValue();
                }
                return 0.0f;
            }
            if (obj instanceof CLNumber) {
                return ((CLNumber) obj).getFloat();
            }
            return 0.0f;
        }

        ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    static class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        Generator(float f, float f2) {
            this.mStart = f;
            this.mIncrementBy = f2;
            this.mCurrent = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    static class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        FiniteGenerator(float f, float f2, float f3, String str, String str2) {
            this.mFrom = f;
            this.mTo = f2;
            this.mStep = f3;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f2;
            this.mInitial = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f = this.mCurrent;
            if (f >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f + this.mStep;
            }
            return this.mCurrent;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i = (int) this.mInitial;
            int i2 = (int) this.mMax;
            int i3 = i;
            while (i <= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.mPrefix);
                sb.append(i3);
                sb.append(this.mPostfix);
                arrayList.add(sb.toString());
                i3 += (int) this.mStep;
                i++;
            }
            return arrayList;
        }
    }

    static class OverrideValue implements GeneratedValue {
        float mValue;

        OverrideValue(float f) {
            this.mValue = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            return this.mValue;
        }
    }

    public static void parseJSON(String str, Transition transition, int i) {
        CLObject objectOrNull;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames != null) {
                for (String str2 : arrayListNames) {
                    CLElement cLElement = cLObject.get(str2);
                    if ((cLElement instanceof CLObject) && (objectOrNull = ((CLObject) cLElement).getObjectOrNull("custom")) != null) {
                        for (String str3 : objectOrNull.names()) {
                            CLElement cLElement2 = objectOrNull.get(str3);
                            if (cLElement2 instanceof CLNumber) {
                                transition.addCustomFloat(i, str2, str3, cLElement2.getFloat());
                            } else if (cLElement2 instanceof CLString) {
                                long colorString = parseColorString(cLElement2.content());
                                if (colorString != -1) {
                                    transition.addCustomColor(i, str2, str3, (int) colorString);
                                }
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e2) {
            System.err.println("Error parsing JSON ".concat(String.valueOf(e2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    public static void parseMotionSceneJSON(CoreMotionScene coreMotionScene, String str) {
        byte b;
        try {
            CLObject cLObject = CLParser.parse(str);
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames != null) {
                for (String str2 : arrayListNames) {
                    CLElement cLElement = cLObject.get(str2);
                    if (cLElement instanceof CLObject) {
                        CLObject cLObject2 = (CLObject) cLElement;
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -2137403731) {
                            if (iHashCode != -241441378) {
                                if (iHashCode == 1101852654 && str2.equals("ConstraintSets")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals(TypedValues.TransitionType.NAME)) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals("Header")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            parseConstraintSets(coreMotionScene, cLObject2);
                        } else if (b == 1) {
                            parseTransitions(coreMotionScene, cLObject2);
                        } else if (b == 2) {
                            parseHeader(coreMotionScene, cLObject2);
                        }
                    }
                }
            }
        } catch (CLParsingException e2) {
            System.err.println("Error parsing JSON ".concat(String.valueOf(e2)));
        }
    }

    static void parseConstraintSets(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            for (String str : arrayListNames) {
                CLObject object = cLObject.getObject(str);
                String stringOrNull = object.getStringOrNull("Extends");
                if (stringOrNull != null && !stringOrNull.isEmpty()) {
                    String constraintSet = coreMotionScene.getConstraintSet(stringOrNull);
                    if (constraintSet != null) {
                        CLObject cLObject2 = CLParser.parse(constraintSet);
                        ArrayList<String> arrayListNames2 = object.names();
                        if (arrayListNames2 != null) {
                            for (String str2 : arrayListNames2) {
                                CLElement cLElement = object.get(str2);
                                if (cLElement instanceof CLObject) {
                                    override(cLObject2, str2, (CLObject) cLElement);
                                }
                            }
                            coreMotionScene.setConstraintSetContent(str, cLObject2.toJSON());
                        }
                    }
                } else {
                    coreMotionScene.setConstraintSetContent(str, object.toJSON());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    static void override(CLObject cLObject, String str, CLObject cLObject2) throws CLParsingException {
        byte b;
        if (!cLObject.has(str)) {
            cLObject.put(str, cLObject2);
            return;
        }
        CLObject object = cLObject.getObject(str);
        for (String str2 : cLObject2.names()) {
            if (!str2.equals("clear")) {
                object.put(str2, cLObject2.get(str2));
            } else {
                CLArray array = cLObject2.getArray("clear");
                for (int i = 0; i < array.size(); i++) {
                    String stringOrNull = array.getStringOrNull(i);
                    if (stringOrNull != null) {
                        stringOrNull.hashCode();
                        int iHashCode = stringOrNull.hashCode();
                        if (iHashCode != -1727069561) {
                            if (iHashCode != -1606703562) {
                                if (iHashCode == 414334925 && stringOrNull.equals("dimensions")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (stringOrNull.equals("constraints")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (stringOrNull.equals("transforms")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            object.remove("visibility");
                            object.remove("alpha");
                            object.remove("pivotX");
                            object.remove("pivotY");
                            object.remove("rotationX");
                            object.remove("rotationY");
                            object.remove("rotationZ");
                            object.remove("scaleX");
                            object.remove("scaleY");
                            object.remove("translationX");
                            object.remove("translationY");
                        } else if (b == 1) {
                            object.remove("start");
                            object.remove("end");
                            object.remove("top");
                            object.remove("bottom");
                            object.remove("baseline");
                            object.remove("center");
                            object.remove("centerHorizontally");
                            object.remove("centerVertically");
                        } else if (b == 2) {
                            object.remove("width");
                            object.remove("height");
                        } else {
                            object.remove(stringOrNull);
                        }
                    }
                }
            }
        }
    }

    static void parseTransitions(CoreMotionScene coreMotionScene, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            for (String str : arrayListNames) {
                coreMotionScene.setTransitionContent(str, cLObject.getObject(str).toJSON());
            }
        }
    }

    static void parseHeader(CoreMotionScene coreMotionScene, CLObject cLObject) {
        String stringOrNull = cLObject.getStringOrNull("export");
        if (stringOrNull != null) {
            coreMotionScene.setDebugName(stringOrNull);
        }
    }

    public static void parseJSON(String str, State state, LayoutVariables layoutVariables) throws CLParsingException {
        try {
            populateState(CLParser.parse(str), state, layoutVariables);
        } catch (CLParsingException e2) {
            System.err.println("Error parsing JSON ".concat(String.valueOf(e2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    public static void populateState(CLObject cLObject, State state, LayoutVariables layoutVariables) throws CLParsingException {
        byte b;
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            for (String str : arrayListNames) {
                CLElement cLElement = cLObject.get(str);
                str.hashCode();
                int iHashCode = str.hashCode();
                byte b2 = -1;
                if (iHashCode != -1824489883) {
                    if (iHashCode != 1875016085) {
                        if (iHashCode == 1921490263 && str.equals("Variables")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("Generate")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("Helpers")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2) {
                            if (cLElement instanceof CLObject) {
                                parseVariables(state, layoutVariables, (CLObject) cLElement);
                            }
                        } else if (cLElement instanceof CLObject) {
                            CLObject cLObject2 = (CLObject) cLElement;
                            String strLookForType = lookForType(cLObject2);
                            if (strLookForType != null) {
                                strLookForType.hashCode();
                                switch (strLookForType.hashCode()) {
                                    case -1785507558:
                                        if (strLookForType.equals("vGuideline")) {
                                            b2 = 0;
                                        }
                                        break;
                                    case -1354837162:
                                        if (strLookForType.equals("column")) {
                                            b2 = 1;
                                        }
                                        break;
                                    case -1252464839:
                                        if (strLookForType.equals("hChain")) {
                                            b2 = 2;
                                        }
                                        break;
                                    case -851656725:
                                        if (strLookForType.equals("vChain")) {
                                            b2 = 3;
                                        }
                                        break;
                                    case -333143113:
                                        if (strLookForType.equals("barrier")) {
                                            b2 = 4;
                                        }
                                        break;
                                    case 113114:
                                        if (strLookForType.equals("row")) {
                                            b2 = 5;
                                        }
                                        break;
                                    case 3181382:
                                        if (strLookForType.equals("grid")) {
                                            b2 = 6;
                                        }
                                        break;
                                    case 98238902:
                                        if (strLookForType.equals("hFlow")) {
                                            b2 = 7;
                                        }
                                        break;
                                    case 111168196:
                                        if (strLookForType.equals("vFlow")) {
                                            b2 = 8;
                                        }
                                        break;
                                    case 965681512:
                                        if (strLookForType.equals("hGuideline")) {
                                            b2 = 9;
                                        }
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        parseGuidelineParams(1, state, str, cLObject2);
                                        break;
                                    case 1:
                                    case 5:
                                    case 6:
                                        parseGridType(strLookForType, state, str, layoutVariables, cLObject2);
                                        break;
                                    case 2:
                                    case 3:
                                        parseChainType(strLookForType, state, str, layoutVariables, cLObject2);
                                        break;
                                    case 4:
                                        parseBarrier(state, str, cLObject2);
                                        break;
                                    case 7:
                                    case 8:
                                        parseFlowType(strLookForType, state, str, layoutVariables, cLObject2);
                                        break;
                                    case 9:
                                        parseGuidelineParams(0, state, str, cLObject2);
                                        break;
                                }
                            } else {
                                parseWidget(state, layoutVariables, str, cLObject2);
                            }
                        } else if (cLElement instanceof CLNumber) {
                            layoutVariables.put(str, cLElement.getInt());
                        }
                    } else if (cLElement instanceof CLObject) {
                        parseGenerate(state, layoutVariables, (CLObject) cLElement);
                    }
                } else if (cLElement instanceof CLArray) {
                    parseHelpers(state, layoutVariables, (CLArray) cLElement);
                }
            }
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            for (String str : arrayListNames) {
                CLElement cLElement = cLObject.get(str);
                if (cLElement instanceof CLNumber) {
                    layoutVariables.put(str, cLElement.getInt());
                } else if (cLElement instanceof CLObject) {
                    CLObject cLObject2 = (CLObject) cLElement;
                    if (cLObject2.has("from") && cLObject2.has(TypedValues.TransitionType.S_TO)) {
                        layoutVariables.put(str, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get(TypedValues.TransitionType.S_TO)), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                    } else if (cLObject2.has("from") && cLObject2.has("step")) {
                        layoutVariables.put(str, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("step")));
                    } else if (cLObject2.has("ids")) {
                        CLArray array = cLObject2.getArray("ids");
                        ArrayList<String> arrayList = new ArrayList<>();
                        for (int i = 0; i < array.size(); i++) {
                            arrayList.add(array.getString(i));
                        }
                        layoutVariables.put(str, arrayList);
                    } else if (cLObject2.has("tag")) {
                        layoutVariables.put(str, state.getIdsForTag(cLObject2.getString("tag")));
                    }
                }
            }
        }
    }

    public static void parseDesignElementsJSON(String str, ArrayList<DesignElement> arrayList) throws CLParsingException {
        CLObject cLObject = CLParser.parse(str);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null || arrayListNames.size() <= 0) {
            return;
        }
        String str2 = arrayListNames.get(0);
        CLElement cLElement = cLObject.get(str2);
        str2.hashCode();
        if (str2.equals("Design") && (cLElement instanceof CLObject)) {
            CLObject cLObject2 = (CLObject) cLElement;
            ArrayList<String> arrayListNames2 = cLObject2.names();
            for (int i = 0; i < arrayListNames2.size(); i++) {
                String str3 = arrayListNames2.get(i);
                CLObject cLObject3 = (CLObject) cLObject2.get(str3);
                System.out.printf("element found ".concat(String.valueOf(str3)), new Object[0]);
                String stringOrNull = cLObject3.getStringOrNull("type");
                if (stringOrNull != null) {
                    HashMap map = new HashMap();
                    int size = cLObject3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        CLKey cLKey = (CLKey) cLObject3.get(i);
                        String strContent = cLKey.content();
                        String strContent2 = cLKey.getValue().content();
                        if (strContent2 != null) {
                            map.put(strContent, strContent2);
                        }
                    }
                    arrayList.add(new DesignElement(str2, stringOrNull, map));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        byte b;
        for (int i = 0; i < cLArray.size(); i++) {
            CLElement cLElement = cLArray.get(i);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string = cLArray2.getString(0);
                    string.hashCode();
                    switch (string.hashCode()) {
                        case -1785507558:
                            if (string.equals("vGuideline")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                            break;
                        case -1252464839:
                            if (string.equals("hChain")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            break;
                        case -851656725:
                            if (string.equals("vChain")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                            break;
                        case 965681512:
                            if (string.equals("hGuideline")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        parseGuideline(1, state, cLArray2);
                    } else if (b == 1) {
                        parseChain(0, state, layoutVariables, cLArray2);
                    } else if (b == 2) {
                        parseChain(1, state, layoutVariables, cLArray2);
                    } else if (b == 3) {
                        parseGuideline(0, state, cLArray2);
                    }
                }
            }
        }
    }

    static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            for (String str : arrayListNames) {
                CLElement cLElement = cLObject.get(str);
                ArrayList<String> list = layoutVariables.getList(str);
                if (list != null && (cLElement instanceof CLObject)) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        parseWidget(state, layoutVariables, it.next(), (CLObject) cLElement);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    static void parseChain(int i, State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        String strContent;
        ChainReference chainReferenceHorizontalChain = i == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.size() <= 0) {
                return;
            }
            for (int i2 = 0; i2 < cLArray2.size(); i2++) {
                chainReferenceHorizontalChain.add(cLArray2.getString(i2));
            }
            if (cLArray.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement2;
                    for (String str : cLObject.names()) {
                        str.hashCode();
                        if (str.equals("style")) {
                            CLElement cLElement3 = cLObject.get(str);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    strContent = cLArray3.getString(0);
                                    chainReferenceHorizontalChain.bias(cLArray3.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                            } else {
                                strContent = cLElement3.content();
                            }
                            strContent.hashCode();
                            if (strContent.equals("packed")) {
                                chainReferenceHorizontalChain.style(State.Chain.PACKED);
                            } else if (strContent.equals("spread_inside")) {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                            } else {
                                chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                            }
                        } else {
                            parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, str);
                        }
                    }
                }
            }
        }
    }

    private static float toPix(State state, float f) {
        return state.getDpToPixel().toPixels(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    private static void parseChainType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        int i;
        int i2;
        float f;
        float pix;
        float f2;
        float pix2;
        String strContent;
        int i3 = 0;
        ChainReference chainReferenceHorizontalChain = str.charAt(0) == 'h' ? state.horizontalChain() : state.verticalChain();
        chainReferenceHorizontalChain.setKey(str2);
        for (String str3 : cLObject.names()) {
            str3.hashCode();
            int i4 = 6;
            int i5 = 3;
            int i6 = 2;
            int i7 = 1;
            switch (str3.hashCode()) {
                case -1383228885:
                    if (str3.equals("bottom")) {
                        i = i3;
                    } else {
                        i = -1;
                    }
                    break;
                case -567445985:
                    if (str3.equals("contains")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    break;
                case 100571:
                    if (str3.equals("end")) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                    break;
                case 115029:
                    if (str3.equals("top")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case 3317767:
                    if (str3.equals("left")) {
                        i = 4;
                    } else {
                        i = -1;
                    }
                    break;
                case 108511772:
                    if (str3.equals("right")) {
                        i = 5;
                    } else {
                        i = -1;
                    }
                    break;
                case 109757538:
                    if (str3.equals("start")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case 109780401:
                    if (str3.equals("style")) {
                        i = 7;
                    } else {
                        i = -1;
                    }
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, str3);
                    i3 = 0;
                    break;
                case 1:
                    CLElement cLElement = cLObject.get(str3);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 0) {
                            int i8 = i3;
                            while (i8 < cLArray.size()) {
                                CLElement cLElement2 = cLArray.get(i8);
                                if (cLElement2 instanceof CLArray) {
                                    CLArray cLArray2 = (CLArray) cLElement2;
                                    if (cLArray2.size() > 0) {
                                        String strContent2 = cLArray2.get(i3).content();
                                        int size = cLArray2.size();
                                        float pix3 = Float.NaN;
                                        if (size == i6) {
                                            f = cLArray2.getFloat(i7);
                                        } else {
                                            if (size == i5) {
                                                i5 = i5;
                                                f = cLArray2.getFloat(i7);
                                                pix2 = toPix(state, cLArray2.getFloat(i6));
                                                f2 = Float.NaN;
                                                pix = Float.NaN;
                                                pix3 = pix2;
                                            } else if (size == 4) {
                                                f = cLArray2.getFloat(i7);
                                                i6 = 2;
                                                pix2 = toPix(state, cLArray2.getFloat(2));
                                                i5 = 3;
                                                f2 = Float.NaN;
                                                pix = Float.NaN;
                                                pix3 = toPix(state, cLArray2.getFloat(3));
                                            } else if (size != i4) {
                                                f = Float.NaN;
                                            } else {
                                                f = cLArray2.getFloat(i7);
                                                float pix4 = toPix(state, cLArray2.getFloat(i6));
                                                float pix5 = toPix(state, cLArray2.getFloat(i5));
                                                float pix6 = toPix(state, cLArray2.getFloat(4));
                                                pix = toPix(state, cLArray2.getFloat(5));
                                                pix3 = pix5;
                                                f2 = pix6;
                                                pix2 = pix4;
                                                i6 = 2;
                                                i5 = 3;
                                            }
                                            float f3 = pix3;
                                            i2 = i6;
                                            chainReferenceHorizontalChain.addChainElement(strContent2, f, pix2, f3, f2, pix);
                                        }
                                        pix2 = Float.NaN;
                                        f2 = Float.NaN;
                                        pix = Float.NaN;
                                        float f4 = pix3;
                                        i2 = i6;
                                        chainReferenceHorizontalChain.addChainElement(strContent2, f, pix2, f4, f2, pix);
                                    } else {
                                        i2 = i6;
                                        i5 = i5;
                                    }
                                } else {
                                    i2 = i6;
                                    i5 = i5;
                                    chainReferenceHorizontalChain.add(cLElement2.content());
                                }
                                i8++;
                                cLArray = cLArray;
                                i5 = i5;
                                i6 = i2;
                                i7 = i7;
                                i3 = 0;
                                i4 = 6;
                            }
                            i3 = 0;
                            break;
                        }
                    }
                    PrintStream printStream = System.err;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" contains should be an array \"");
                    sb.append(cLElement.content());
                    sb.append("\"");
                    printStream.println(sb.toString());
                    break;
                case 7:
                    CLElement cLElement3 = cLObject.get(str3);
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray3 = (CLArray) cLElement3;
                        if (cLArray3.size() > 1) {
                            strContent = cLArray3.getString(i3);
                            chainReferenceHorizontalChain.bias(cLArray3.getFloat(1));
                        } else {
                            strContent = cLElement3.content();
                        }
                    } else {
                        strContent = cLElement3.content();
                    }
                    strContent.hashCode();
                    if (strContent.equals("packed")) {
                        chainReferenceHorizontalChain.style(State.Chain.PACKED);
                    } else if (strContent.equals("spread_inside")) {
                        chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                    } else {
                        chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                    }
                    break;
                default:
                    i3 = 0;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        byte b;
        float f;
        float f2;
        float f3;
        float f4;
        GridReference grid = state.getGrid(str2, str);
        for (String str3 : cLObject.names()) {
            str3.hashCode();
            int i = 0;
            switch (str3.hashCode()) {
                case -1439500848:
                    if (str3.equals("orientation")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -806339567:
                    if (str3.equals("padding")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case -567445985:
                    if (str3.equals("contains")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case 3169614:
                    if (str3.equals("hGap")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 3506649:
                    if (str3.equals("rows")) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case 3586688:
                    if (str3.equals("vGap")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    break;
                case 97513095:
                    if (str3.equals("flags")) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case 109497044:
                    if (str3.equals("skips")) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                case 109638249:
                    if (str3.equals("spans")) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                case 144441793:
                    if (str3.equals("rowWeights")) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    break;
                case 949721053:
                    if (str3.equals("columns")) {
                        b = 10;
                    } else {
                        b = -1;
                    }
                    break;
                case 2033353925:
                    if (str3.equals("columnWeights")) {
                        b = 11;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    grid.setOrientation(cLObject.get(str3).getInt());
                    break;
                case 1:
                    CLElement cLElement = cLObject.get(str3);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            f = cLArray.getInt(0);
                            f4 = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f3 = cLArray.getInt(2);
                                try {
                                    f2 = ((CLArray) cLElement).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f2 = 0.0f;
                                }
                            } else {
                                f2 = f4;
                                f3 = f;
                            }
                        } else {
                            f = cLElement.getInt();
                            f2 = f;
                            f3 = f2;
                            f4 = f3;
                        }
                    } else {
                        f = cLElement.getInt();
                        f2 = f;
                        f3 = f2;
                        f4 = f3;
                    }
                    grid.setPaddingStart(Math.round(toPix(state, f)));
                    grid.setPaddingTop(Math.round(toPix(state, f4)));
                    grid.setPaddingEnd(Math.round(toPix(state, f3)));
                    grid.setPaddingBottom(Math.round(toPix(state, f2)));
                    break;
                case 2:
                    CLArray arrayOrNull = cLObject.getArrayOrNull(str3);
                    if (arrayOrNull != null) {
                        while (i < arrayOrNull.size()) {
                            grid.add(state.constraints(arrayOrNull.get(i).content()));
                            i++;
                        }
                    }
                    break;
                case 3:
                    grid.setHorizontalGaps(toPix(state, cLObject.get(str3).getFloat()));
                    break;
                case 4:
                    int i2 = cLObject.get(str3).getInt();
                    if (i2 > 0) {
                        grid.setRowsSet(i2);
                    }
                    break;
                case 5:
                    grid.setVerticalGaps(toPix(state, cLObject.get(str3).getFloat()));
                    break;
                case 6:
                    String strContent = "";
                    try {
                        CLElement cLElement2 = cLObject.get(str3);
                        if (cLElement2 instanceof CLNumber) {
                            i = cLElement2.getInt();
                        } else {
                            strContent = cLElement2.content();
                        }
                    } catch (Exception e2) {
                        System.err.println("Error parsing grid flags ".concat(String.valueOf(e2)));
                    }
                    if (strContent != null && !strContent.isEmpty()) {
                        grid.setFlags(strContent);
                    } else {
                        grid.setFlags(i);
                    }
                    break;
                case 7:
                    String strContent2 = cLObject.get(str3).content();
                    if (strContent2 != null && strContent2.contains(":")) {
                        grid.setSkips(strContent2);
                    }
                    break;
                case 8:
                    String strContent3 = cLObject.get(str3).content();
                    if (strContent3 != null && strContent3.contains(":")) {
                        grid.setSpans(strContent3);
                    }
                    break;
                case 9:
                    String strContent4 = cLObject.get(str3).content();
                    if (strContent4 != null && strContent4.contains(",")) {
                        grid.setRowWeights(strContent4);
                    }
                    break;
                case 10:
                    int i3 = cLObject.get(str3).getInt();
                    if (i3 > 0) {
                        grid.setColumnsSet(i3);
                    }
                    break;
                case 11:
                    String strContent5 = cLObject.get(str3).content();
                    if (strContent5 != null && strContent5.contains(",")) {
                        grid.setColumnWeights(strContent5);
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, str3);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x026f  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:167:0x038c  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    private static void parseFlowType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        byte b;
        String strContent;
        String string;
        String string2;
        Float fValueOf;
        String strContent2;
        String string3;
        String string4;
        float f;
        float f2;
        float f3;
        float f4;
        Float fValueOf2;
        float pix;
        float pix2;
        FlowReference flow = state.getFlow(str2, str.charAt(0) == 'v');
        for (String str3 : cLObject.names()) {
            str3.hashCode();
            byte b2 = -1;
            switch (str3.hashCode()) {
                case -1254185091:
                    b = str3.equals("hAlign") ? (byte) 0 : (byte) -1;
                    break;
                case -1237307863:
                    b = str3.equals("hStyle") ? (byte) 1 : (byte) -1;
                    break;
                case -1198076529:
                    b = str3.equals("hFlowBias") ? (byte) 2 : (byte) -1;
                    break;
                case -853376977:
                    b = str3.equals("vAlign") ? (byte) 3 : (byte) -1;
                    break;
                case -836499749:
                    b = str3.equals("vStyle") ? (byte) 4 : (byte) -1;
                    break;
                case -806339567:
                    b = str3.equals("padding") ? (byte) 5 : (byte) -1;
                    break;
                case -732635235:
                    b = str3.equals("vFlowBias") ? (byte) 6 : (byte) -1;
                    break;
                case -567445985:
                    b = str3.equals("contains") ? (byte) 7 : (byte) -1;
                    break;
                case -488900360:
                    b = str3.equals("maxElement") ? (byte) 8 : (byte) -1;
                    break;
                case 3169614:
                    b = str3.equals("hGap") ? (byte) 9 : (byte) -1;
                    break;
                case 3575610:
                    b = str3.equals("type") ? (byte) 10 : (byte) -1;
                    break;
                case 3586688:
                    b = str3.equals("vGap") ? (byte) 11 : (byte) -1;
                    break;
                case 3657802:
                    b = str3.equals("wrap") ? (byte) 12 : (byte) -1;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    String strContent3 = cLObject.get(str3).content();
                    strContent3.hashCode();
                    if (strContent3.equals("end")) {
                        flow.setHorizontalAlign(1);
                    } else if (strContent3.equals("start")) {
                        flow.setHorizontalAlign(0);
                    } else {
                        flow.setHorizontalAlign(2);
                    }
                    break;
                case 1:
                    CLElement cLElement = cLObject.get(str3);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            string = cLArray.getString(0);
                            strContent = cLArray.getString(1);
                            if (cLArray.size() > 2) {
                                string2 = cLArray.getString(2);
                            } else {
                                string2 = "";
                            }
                        } else {
                            strContent = cLElement.content();
                            string = "";
                            string2 = string;
                        }
                    } else {
                        strContent = cLElement.content();
                        string = "";
                        string2 = string;
                    }
                    if (!strContent.equals("")) {
                        flow.setHorizontalStyle(State.Chain.getValueByString(strContent));
                    }
                    if (!string.equals("")) {
                        flow.setFirstHorizontalStyle(State.Chain.getValueByString(string));
                    }
                    if (!string2.equals("")) {
                        flow.setLastHorizontalStyle(State.Chain.getValueByString(string2));
                    }
                    break;
                case 2:
                    CLElement cLElement2 = cLObject.get(str3);
                    Float fValueOf3 = Float.valueOf(0.5f);
                    Float fValueOf4 = Float.valueOf(0.5f);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray2 = (CLArray) cLElement2;
                        if (cLArray2.size() > 1) {
                            fValueOf3 = Float.valueOf(cLArray2.getFloat(0));
                            fValueOf = Float.valueOf(cLArray2.getFloat(1));
                            if (cLArray2.size() > 2) {
                                fValueOf4 = Float.valueOf(cLArray2.getFloat(2));
                            }
                        } else {
                            fValueOf = Float.valueOf(cLElement2.getFloat());
                        }
                    } else {
                        fValueOf = Float.valueOf(cLElement2.getFloat());
                    }
                    flow.horizontalBias(fValueOf.floatValue());
                    if (fValueOf3.floatValue() != 0.5f) {
                        flow.setFirstHorizontalBias(fValueOf3.floatValue());
                    }
                    if (fValueOf4.floatValue() != 0.5f) {
                        flow.setLastHorizontalBias(fValueOf4.floatValue());
                    }
                    break;
                case 3:
                    String strContent4 = cLObject.get(str3).content();
                    strContent4.hashCode();
                    int iHashCode = strContent4.hashCode();
                    if (iHashCode != -1720785339) {
                        if (iHashCode != -1383228885) {
                            if (iHashCode == 115029 && strContent4.equals("top")) {
                                b2 = 2;
                            }
                        } else if (strContent4.equals("bottom")) {
                            b2 = 1;
                        }
                    } else if (strContent4.equals("baseline")) {
                        b2 = 0;
                    }
                    if (b2 == 0) {
                        flow.setVerticalAlign(3);
                    } else if (b2 == 1) {
                        flow.setVerticalAlign(1);
                    } else if (b2 == 2) {
                        flow.setVerticalAlign(0);
                    } else {
                        flow.setVerticalAlign(2);
                    }
                    break;
                case 4:
                    CLElement cLElement3 = cLObject.get(str3);
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray3 = (CLArray) cLElement3;
                        if (cLArray3.size() > 1) {
                            string3 = cLArray3.getString(0);
                            strContent2 = cLArray3.getString(1);
                            if (cLArray3.size() > 2) {
                                string4 = cLArray3.getString(2);
                            } else {
                                string4 = "";
                            }
                        } else {
                            strContent2 = cLElement3.content();
                            string3 = "";
                            string4 = string3;
                        }
                    } else {
                        strContent2 = cLElement3.content();
                        string3 = "";
                        string4 = string3;
                    }
                    if (!strContent2.equals("")) {
                        flow.setVerticalStyle(State.Chain.getValueByString(strContent2));
                    }
                    if (!string3.equals("")) {
                        flow.setFirstVerticalStyle(State.Chain.getValueByString(string3));
                    }
                    if (!string4.equals("")) {
                        flow.setLastVerticalStyle(State.Chain.getValueByString(string4));
                    }
                    break;
                case 5:
                    CLElement cLElement4 = cLObject.get(str3);
                    if (cLElement4 instanceof CLArray) {
                        CLArray cLArray4 = (CLArray) cLElement4;
                        if (cLArray4.size() > 1) {
                            f = cLArray4.getInt(0);
                            f4 = cLArray4.getInt(1);
                            if (cLArray4.size() > 2) {
                                f3 = cLArray4.getInt(2);
                                try {
                                    f2 = ((CLArray) cLElement4).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f2 = 0.0f;
                                }
                            } else {
                                f3 = f;
                                f2 = f4;
                            }
                        } else {
                            f = cLElement4.getInt();
                            f2 = f;
                            f3 = f2;
                            f4 = f3;
                        }
                    } else {
                        f = cLElement4.getInt();
                        f2 = f;
                        f3 = f2;
                        f4 = f3;
                    }
                    flow.setPaddingLeft(Math.round(toPix(state, f)));
                    flow.setPaddingTop(Math.round(toPix(state, f4)));
                    flow.setPaddingRight(Math.round(toPix(state, f3)));
                    flow.setPaddingBottom(Math.round(toPix(state, f2)));
                    break;
                case 6:
                    CLElement cLElement5 = cLObject.get(str3);
                    Float fValueOf5 = Float.valueOf(0.5f);
                    Float fValueOf6 = Float.valueOf(0.5f);
                    if (cLElement5 instanceof CLArray) {
                        CLArray cLArray5 = (CLArray) cLElement5;
                        if (cLArray5.size() > 1) {
                            fValueOf5 = Float.valueOf(cLArray5.getFloat(0));
                            fValueOf2 = Float.valueOf(cLArray5.getFloat(1));
                            if (cLArray5.size() > 2) {
                                fValueOf6 = Float.valueOf(cLArray5.getFloat(2));
                            }
                        } else {
                            fValueOf2 = Float.valueOf(cLElement5.getFloat());
                        }
                    } else {
                        fValueOf2 = Float.valueOf(cLElement5.getFloat());
                    }
                    try {
                        flow.verticalBias(fValueOf2.floatValue());
                        if (fValueOf5.floatValue() != 0.5f) {
                            flow.setFirstVerticalBias(fValueOf5.floatValue());
                        }
                        if (fValueOf6.floatValue() != 0.5f) {
                            flow.setLastVerticalBias(fValueOf6.floatValue());
                        }
                    } catch (NumberFormatException unused2) {
                    }
                    break;
                case 7:
                    CLElement cLElement6 = cLObject.get(str3);
                    if (cLElement6 instanceof CLArray) {
                        CLArray cLArray6 = (CLArray) cLElement6;
                        if (cLArray6.size() > 0) {
                            for (int i = 0; i < cLArray6.size(); i++) {
                                CLElement cLElement7 = cLArray6.get(i);
                                if (cLElement7 instanceof CLArray) {
                                    CLArray cLArray7 = (CLArray) cLElement7;
                                    if (cLArray7.size() > 0) {
                                        String strContent5 = cLArray7.get(0).content();
                                        int size = cLArray7.size();
                                        float f5 = Float.NaN;
                                        if (size != 2) {
                                            if (size == 3) {
                                                f5 = cLArray7.getFloat(1);
                                                pix2 = toPix(state, cLArray7.getFloat(2));
                                            } else if (size != 4) {
                                                pix2 = Float.NaN;
                                            } else {
                                                f5 = cLArray7.getFloat(1);
                                                float pix3 = toPix(state, cLArray7.getFloat(2));
                                                pix = toPix(state, cLArray7.getFloat(3));
                                                pix2 = pix3;
                                            }
                                            pix = pix2;
                                        } else {
                                            pix = Float.NaN;
                                            f5 = cLArray7.getFloat(1);
                                            pix2 = Float.NaN;
                                        }
                                        flow.addFlowElement(strContent5, f5, pix2, pix);
                                    }
                                } else {
                                    flow.add(cLElement7.content());
                                }
                            }
                            break;
                        }
                    }
                    PrintStream printStream = System.err;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" contains should be an array \"");
                    sb.append(cLElement6.content());
                    sb.append("\"");
                    printStream.println(sb.toString());
                    return;
                case 8:
                    flow.setMaxElementsWrap(cLObject.get(str3).getInt());
                    break;
                case 9:
                    flow.setHorizontalGap(cLObject.get(str3).getInt());
                    break;
                case 10:
                    if (cLObject.get(str3).content().equals("hFlow")) {
                        flow.setOrientation(0);
                    } else {
                        flow.setOrientation(1);
                    }
                    break;
                case 11:
                    flow.setVerticalGap(cLObject.get(str3).getInt());
                    break;
                case 12:
                    flow.setWrapMode(State.Wrap.getValueByString(cLObject.get(str3).content()));
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, str3);
                    break;
            }
        }
    }

    static void parseGuideline(int i, State state, CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if (!(cLElement instanceof CLObject) || (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) == null) {
            return;
        }
        parseGuidelineParams(i, state, stringOrNull, cLObject);
    }

    static void parseGuidelineParams(int i, State state, String str, CLObject cLObject) throws CLParsingException {
        byte b;
        byte b2;
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (i == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z = !state.isRtl() || i == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraintReferenceConstraints.getFacade();
        Iterator<String> it = arrayListNames.iterator();
        float pix = 0.0f;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            while (true) {
                if (!it.hasNext()) {
                    if (z2) {
                        if (z3) {
                            guidelineReference.percent(pix);
                            return;
                        } else {
                            guidelineReference.percent(1.0f - pix);
                            return;
                        }
                    }
                    if (z3) {
                        guidelineReference.start(Float.valueOf(pix));
                        return;
                    } else {
                        guidelineReference.end(Float.valueOf(pix));
                        return;
                    }
                }
                String next = it.next();
                next.hashCode();
                switch (next.hashCode()) {
                    case -678927291:
                        b = !next.equals("percent") ? (byte) -1 : (byte) 0;
                        break;
                    case 100571:
                        b = !next.equals("end") ? (byte) -1 : (byte) 1;
                        break;
                    case 3317767:
                        b = !next.equals("left") ? (byte) -1 : (byte) 2;
                        break;
                    case 108511772:
                        b = !next.equals("right") ? (byte) -1 : (byte) 3;
                        break;
                    case 109757538:
                        b = !next.equals("start") ? (byte) -1 : (byte) 4;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull == null) {
                        pix = cLObject.getFloat(next);
                        z2 = true;
                        break;
                    }
                    if (arrayOrNull.size() > 1) {
                        String string = arrayOrNull.getString(0);
                        float f = arrayOrNull.getFloat(1);
                        string.hashCode();
                        switch (string.hashCode()) {
                            case 100571:
                                b2 = !string.equals("end") ? (byte) -1 : (byte) 0;
                                break;
                            case 3317767:
                                b2 = !string.equals("left") ? (byte) -1 : (byte) 1;
                                break;
                            case 108511772:
                                b2 = !string.equals("right") ? (byte) -1 : (byte) 2;
                                break;
                            case 109757538:
                                b2 = !string.equals("start") ? (byte) -1 : (byte) 3;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            z3 = !z;
                        } else if (b2 == 1) {
                            z3 = true;
                            pix = f;
                            z2 = true;
                        } else if (b2 == 2) {
                            z3 = false;
                        } else if (b2 == 3) {
                            z3 = z;
                        }
                        pix = f;
                    }
                    z2 = true;
                } else if (b == 1) {
                    pix = toPix(state, cLObject.getFloat(next));
                    z3 = !z;
                } else if (b == 2) {
                    pix = toPix(state, cLObject.getFloat(next));
                    break;
                } else if (b == 3) {
                    pix = toPix(state, cLObject.getFloat(next));
                    z3 = false;
                } else if (b == 4) {
                    pix = toPix(state, cLObject.getFloat(next));
                    z3 = z;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    static void parseBarrier(State state, String str, CLObject cLObject) throws CLParsingException {
        byte b;
        CLArray arrayOrNull;
        boolean zIsRtl = state.isRtl();
        BarrierReference barrierReferenceBarrier = state.barrier(str, State.Direction.END);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            for (String str2 : arrayListNames) {
                str2.hashCode();
                int iHashCode = str2.hashCode();
                byte b2 = -1;
                if (iHashCode != -1081309778) {
                    if (iHashCode != -962590849) {
                        if (iHashCode == -567445985 && str2.equals("contains")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals("direction")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals("margin")) {
                    b = 0;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    float floatOrNaN = cLObject.getFloatOrNaN(str2);
                    if (!Float.isNaN(floatOrNaN)) {
                        barrierReferenceBarrier.margin(Float.valueOf(toPix(state, floatOrNaN)));
                    }
                } else if (b == 1) {
                    String string = cLObject.getString(str2);
                    string.hashCode();
                    switch (string.hashCode()) {
                        case -1383228885:
                            if (string.equals("bottom")) {
                                b2 = 0;
                            }
                            break;
                        case 100571:
                            if (string.equals("end")) {
                                b2 = 1;
                            }
                            break;
                        case 115029:
                            if (string.equals("top")) {
                                b2 = 2;
                            }
                            break;
                        case 3317767:
                            if (string.equals("left")) {
                                b2 = 3;
                            }
                            break;
                        case 108511772:
                            if (string.equals("right")) {
                                b2 = 4;
                            }
                            break;
                        case 109757538:
                            if (string.equals("start")) {
                                b2 = 5;
                            }
                            break;
                    }
                    if (b2 == 0) {
                        barrierReferenceBarrier.setBarrierDirection(State.Direction.BOTTOM);
                    } else if (b2 != 1) {
                        if (b2 == 2) {
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.TOP);
                        } else if (b2 == 3) {
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                        } else if (b2 == 4) {
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                        } else if (b2 == 5) {
                            if (!zIsRtl) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                            } else {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                            }
                        }
                    } else if (!zIsRtl) {
                        barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                    } else {
                        barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                    }
                } else if (b == 2 && (arrayOrNull = cLObject.getArrayOrNull(str2)) != null) {
                    for (int i = 0; i < arrayOrNull.size(); i++) {
                        barrierReferenceBarrier.add(state.constraints(arrayOrNull.get(i).content()));
                    }
                }
            }
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    static void applyAttribute(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject, String str) throws CLParsingException {
        byte b;
        ConstraintReference constraintReferenceConstraints;
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1448775240:
                b = !str.equals("centerVertically") ? (byte) -1 : (byte) 0;
                break;
            case -1364013995:
                b = !str.equals("center") ? (byte) -1 : (byte) 1;
                break;
            case -1349088399:
                b = !str.equals("custom") ? (byte) -1 : (byte) 2;
                break;
            case -1249320806:
                b = !str.equals("rotationX") ? (byte) -1 : (byte) 3;
                break;
            case -1249320805:
                b = !str.equals("rotationY") ? (byte) -1 : (byte) 4;
                break;
            case -1249320804:
                b = !str.equals("rotationZ") ? (byte) -1 : (byte) 5;
                break;
            case -1225497657:
                b = !str.equals("translationX") ? (byte) -1 : (byte) 6;
                break;
            case -1225497656:
                b = !str.equals("translationY") ? (byte) -1 : (byte) 7;
                break;
            case -1225497655:
                b = !str.equals("translationZ") ? (byte) -1 : (byte) 8;
                break;
            case -1221029593:
                b = !str.equals("height") ? (byte) -1 : (byte) 9;
                break;
            case -1068318794:
                b = !str.equals("motion") ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b = !str.equals("pivotX") ? (byte) -1 : (byte) 11;
                break;
            case -987906985:
                b = !str.equals("pivotY") ? (byte) -1 : (byte) 12;
                break;
            case -908189618:
                b = !str.equals("scaleX") ? (byte) -1 : (byte) 13;
                break;
            case -908189617:
                b = !str.equals("scaleY") ? (byte) -1 : (byte) 14;
                break;
            case -247669061:
                b = !str.equals("hRtlBias") ? (byte) -1 : (byte) 15;
                break;
            case -61505906:
                b = !str.equals("vWeight") ? (byte) -1 : (byte) 16;
                break;
            case 92909918:
                b = !str.equals("alpha") ? (byte) -1 : (byte) 17;
                break;
            case 98116417:
                b = !str.equals("hBias") ? (byte) -1 : (byte) 18;
                break;
            case 111045711:
                b = !str.equals("vBias") ? (byte) -1 : (byte) 19;
                break;
            case 113126854:
                b = !str.equals("width") ? (byte) -1 : (byte) 20;
                break;
            case 398344448:
                b = !str.equals("hWeight") ? (byte) -1 : (byte) 21;
                break;
            case 1404070310:
                b = !str.equals("centerHorizontally") ? (byte) -1 : (byte) 22;
                break;
            case 1941332754:
                b = !str.equals("visibility") ? (byte) -1 : (byte) 23;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                Object string = cLObject.getString(str);
                if (string.equals("parent")) {
                    string = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints2 = state.constraints(string);
                constraintReference.topToTop(constraintReferenceConstraints2);
                constraintReference.bottomToBottom(constraintReferenceConstraints2);
                break;
            case 1:
                String string2 = cLObject.getString(str);
                if (string2.equals("parent")) {
                    constraintReferenceConstraints = state.constraints(State.PARENT);
                } else {
                    constraintReferenceConstraints = state.constraints(string2);
                }
                constraintReference.startToStart(constraintReferenceConstraints);
                constraintReference.endToEnd(constraintReferenceConstraints);
                constraintReference.topToTop(constraintReferenceConstraints);
                constraintReference.bottomToBottom(constraintReferenceConstraints);
                break;
            case 2:
                parseCustomProperties(cLObject, constraintReference, str);
                break;
            case 3:
                constraintReference.rotationX(layoutVariables.get(cLObject.get(str)));
                break;
            case 4:
                constraintReference.rotationY(layoutVariables.get(cLObject.get(str)));
                break;
            case 5:
                constraintReference.rotationZ(layoutVariables.get(cLObject.get(str)));
                break;
            case 6:
                constraintReference.translationX(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case 7:
                constraintReference.translationY(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case 8:
                constraintReference.translationZ(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case 9:
                constraintReference.setHeight(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case 10:
                parseMotionProperties(cLObject.get(str), constraintReference);
                break;
            case 11:
                constraintReference.pivotX(layoutVariables.get(cLObject.get(str)));
                break;
            case 12:
                constraintReference.pivotY(layoutVariables.get(cLObject.get(str)));
                break;
            case 13:
                constraintReference.scaleX(layoutVariables.get(cLObject.get(str)));
                break;
            case 14:
                constraintReference.scaleY(layoutVariables.get(cLObject.get(str)));
                break;
            case 15:
                float f = layoutVariables.get(cLObject.get(str));
                if (state.isRtl()) {
                    f = 1.0f - f;
                }
                constraintReference.horizontalBias(f);
                break;
            case 16:
                constraintReference.setVerticalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case 17:
                constraintReference.alpha(layoutVariables.get(cLObject.get(str)));
                break;
            case 18:
                constraintReference.horizontalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case 19:
                constraintReference.verticalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case 20:
                constraintReference.setWidth(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case 21:
                constraintReference.setHorizontalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case 22:
                Object string3 = cLObject.getString(str);
                if (string3.equals("parent")) {
                    string3 = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints3 = state.constraints(string3);
                constraintReference.startToStart(constraintReferenceConstraints3);
                constraintReference.endToEnd(constraintReferenceConstraints3);
                break;
            case 23:
                String string4 = cLObject.getString(str);
                string4.hashCode();
                int iHashCode = string4.hashCode();
                if (iHashCode != -1901805651) {
                    if (iHashCode != 3178655) {
                        if (iHashCode == 466743410 && string4.equals("visible")) {
                            b2 = 2;
                        }
                    } else if (string4.equals("gone")) {
                        b2 = 1;
                    }
                } else if (string4.equals("invisible")) {
                    b2 = 0;
                }
                if (b2 == 0) {
                    constraintReference.visibility(4);
                    constraintReference.alpha(0.0f);
                    break;
                } else if (b2 == 1) {
                    constraintReference.visibility(8);
                    break;
                } else if (b2 == 2) {
                    constraintReference.visibility(0);
                    break;
                }
                break;
            default:
                parseConstraint(state, layoutVariables, cLObject, constraintReference, str);
                break;
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) throws CLParsingException {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames != null) {
            Iterator<String> it = arrayListNames.iterator();
            while (it.hasNext()) {
                applyAttribute(state, layoutVariables, constraintReference, cLObject, it.next());
            }
        }
    }

    static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> arrayListNames;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (arrayListNames = objectOrNull.names()) == null) {
            return;
        }
        for (String str2 : arrayListNames) {
            CLElement cLElement = objectOrNull.get(str2);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(str2, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                long colorString = parseColorString(cLElement.content());
                if (colorString != -1) {
                    constraintReference.addCustomColor(str2, (int) colorString);
                }
            }
        }
    }

    private static int indexOf(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) throws CLParsingException {
        byte b;
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            for (String str : arrayListNames) {
                str.hashCode();
                switch (str.hashCode()) {
                    case -1897525331:
                        b = str.equals("stagger") ? (byte) 0 : (byte) -1;
                        break;
                    case -1310311125:
                        b = str.equals("easing") ? (byte) 1 : (byte) -1;
                        break;
                    case -1285003983:
                        b = str.equals("quantize") ? (byte) 2 : (byte) -1;
                        break;
                    case -791482387:
                        b = str.equals("pathArc") ? (byte) 3 : (byte) -1;
                        break;
                    case -236944793:
                        b = str.equals("relativeTo") ? (byte) 4 : (byte) -1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    typedBundle.add(600, cLObject.getFloat(str));
                } else if (b == 1) {
                    typedBundle.add(TypedValues.MotionType.TYPE_EASING, cLObject.getString(str));
                } else if (b == 2) {
                    CLElement cLElement2 = cLObject.get(str);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement2;
                        int size = cLArray.size();
                        if (size > 0) {
                            typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                            if (size > 1) {
                                typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                if (size > 2) {
                                    typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, cLArray.getFloat(2));
                                }
                            }
                        }
                    } else {
                        typedBundle.add(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject.getInt(str));
                    }
                } else if (b == 3) {
                    String string = cLObject.getString(str);
                    int iIndexOf = indexOf(string, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    if (iIndexOf == -1) {
                        PrintStream printStream = System.err;
                        StringBuilder sb = new StringBuilder();
                        sb.append(cLObject.getLine());
                        sb.append(" pathArc = '");
                        sb.append(string);
                        sb.append("'");
                        printStream.println(sb.toString());
                    } else {
                        typedBundle.add(TypedValues.MotionType.TYPE_PATHMOTION_ARC, iIndexOf);
                    }
                } else if (b == 4) {
                    typedBundle.add(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, cLObject.getString(str));
                }
            }
            constraintReference.mMotionProperties = typedBundle;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:126:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    static void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ConstraintReference constraintReferenceConstraints;
        byte b;
        ConstraintReference constraintReferenceConstraints2;
        byte b2;
        boolean z;
        boolean z2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        boolean z3;
        boolean zIsRtl = state.isRtl();
        boolean z4 = !zIsRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull != null && arrayOrNull.size() > 1) {
            String string = arrayOrNull.getString(0);
            String stringOrNull = arrayOrNull.getStringOrNull(1);
            float pix = arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f;
            float pix2 = arrayOrNull.size() > 3 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(3))) : 0.0f;
            if (string.equals("parent")) {
                constraintReferenceConstraints2 = state.constraints(State.PARENT);
            } else {
                constraintReferenceConstraints2 = state.constraints(string);
            }
            str.hashCode();
            float f = pix2;
            switch (str.hashCode()) {
                case -1720785339:
                    b2 = !str.equals("baseline") ? (byte) -1 : (byte) 0;
                    break;
                case -1498085729:
                    b2 = !str.equals("circular") ? (byte) -1 : (byte) 1;
                    break;
                case -1383228885:
                    b2 = !str.equals("bottom") ? (byte) -1 : (byte) 2;
                    break;
                case 100571:
                    b2 = !str.equals("end") ? (byte) -1 : (byte) 3;
                    break;
                case 115029:
                    b2 = !str.equals("top") ? (byte) -1 : (byte) 4;
                    break;
                case 3317767:
                    b2 = !str.equals("left") ? (byte) -1 : (byte) 5;
                    break;
                case 108511772:
                    b2 = !str.equals("right") ? (byte) -1 : (byte) 6;
                    break;
                case 109757538:
                    b2 = !str.equals("start") ? (byte) -1 : (byte) 7;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    stringOrNull.hashCode();
                    int iHashCode = stringOrNull.hashCode();
                    if (iHashCode != -1720785339) {
                        if (iHashCode != -1383228885) {
                            if (iHashCode == 115029 && stringOrNull.equals("top")) {
                                b3 = 2;
                            } else {
                                b3 = -1;
                            }
                        } else if (stringOrNull.equals("bottom")) {
                            b3 = 1;
                        } else {
                            b3 = -1;
                        }
                    } else if (stringOrNull.equals("baseline")) {
                        b3 = 0;
                    } else {
                        b3 = -1;
                    }
                    if (b3 == 0) {
                        state.baselineNeededFor(constraintReference.getKey());
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.baselineToBaseline(constraintReferenceConstraints2);
                    } else if (b3 == 1) {
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToBottom(constraintReferenceConstraints2);
                    } else if (b3 == 2) {
                        state.baselineNeededFor(constraintReference.getKey());
                        constraintReference.baselineToTop(constraintReferenceConstraints2);
                    }
                    z = true;
                    z2 = false;
                    break;
                case 1:
                    constraintReference.circularConstraint(constraintReferenceConstraints2, layoutVariables.get(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f);
                    z = true;
                    z2 = false;
                    break;
                case 2:
                    stringOrNull.hashCode();
                    int iHashCode2 = stringOrNull.hashCode();
                    if (iHashCode2 != -1720785339) {
                        if (iHashCode2 != -1383228885) {
                            if (iHashCode2 == 115029 && stringOrNull.equals("top")) {
                                b4 = 2;
                            } else {
                                b4 = -1;
                            }
                        } else if (stringOrNull.equals("bottom")) {
                            b4 = 1;
                        } else {
                            b4 = -1;
                        }
                    } else if (stringOrNull.equals("baseline")) {
                        b4 = 0;
                    } else {
                        b4 = -1;
                    }
                    if (b4 == 0) {
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.bottomToBaseline(constraintReferenceConstraints2);
                    } else if (b4 == 1) {
                        constraintReference.bottomToBottom(constraintReferenceConstraints2);
                    } else if (b4 == 2) {
                        constraintReference.bottomToTop(constraintReferenceConstraints2);
                    }
                    z = true;
                    z2 = false;
                    break;
                case 3:
                    z = zIsRtl;
                    z2 = true;
                    break;
                case 4:
                    stringOrNull.hashCode();
                    int iHashCode3 = stringOrNull.hashCode();
                    if (iHashCode3 != -1720785339) {
                        if (iHashCode3 != -1383228885) {
                            if (iHashCode3 == 115029 && stringOrNull.equals("top")) {
                                b5 = 2;
                            } else {
                                b5 = -1;
                            }
                        } else if (stringOrNull.equals("bottom")) {
                            b5 = 1;
                        } else {
                            b5 = -1;
                        }
                    } else if (stringOrNull.equals("baseline")) {
                        b5 = 0;
                    } else {
                        b5 = -1;
                    }
                    if (b5 == 0) {
                        state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                        constraintReference.topToBaseline(constraintReferenceConstraints2);
                    } else if (b5 == 1) {
                        constraintReference.topToBottom(constraintReferenceConstraints2);
                    } else if (b5 == 2) {
                        constraintReference.topToTop(constraintReferenceConstraints2);
                    }
                    z = true;
                    z2 = false;
                    break;
                case 5:
                    z = true;
                    z2 = true;
                    break;
                case 6:
                    z = false;
                    z2 = true;
                    break;
                case 7:
                    z = z4;
                    z2 = true;
                    break;
                default:
                    z = true;
                    z2 = false;
                    break;
            }
            if (z2) {
                stringOrNull.hashCode();
                switch (stringOrNull.hashCode()) {
                    case 100571:
                        b6 = !stringOrNull.equals("end") ? (byte) -1 : (byte) 0;
                        break;
                    case 3317767:
                        b6 = !stringOrNull.equals("left") ? (byte) -1 : (byte) 1;
                        break;
                    case 108511772:
                        b6 = !stringOrNull.equals("right") ? (byte) -1 : (byte) 2;
                        break;
                    case 109757538:
                        b6 = !stringOrNull.equals("start") ? (byte) -1 : (byte) 3;
                        break;
                    default:
                        b6 = -1;
                        break;
                }
                if (b6 != 0) {
                    z3 = b6 != 2 ? b6 != 3 ? true : z4 : false;
                }
                if (z) {
                    if (z3) {
                        constraintReference.leftToLeft(constraintReferenceConstraints2);
                    } else {
                        constraintReference.leftToRight(constraintReferenceConstraints2);
                    }
                } else if (z3) {
                    constraintReference.rightToLeft(constraintReferenceConstraints2);
                } else {
                    constraintReference.rightToRight(constraintReferenceConstraints2);
                }
            }
            constraintReference.margin(Float.valueOf(pix)).marginGone(Float.valueOf(f));
            return;
        }
        String stringOrNull2 = cLObject.getStringOrNull(str);
        if (stringOrNull2 != null) {
            if (stringOrNull2.equals("parent")) {
                constraintReferenceConstraints = state.constraints(State.PARENT);
            } else {
                constraintReferenceConstraints = state.constraints(stringOrNull2);
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1720785339:
                    b = !str.equals("baseline") ? (byte) -1 : (byte) 0;
                    break;
                case -1383228885:
                    b = !str.equals("bottom") ? (byte) -1 : (byte) 1;
                    break;
                case 100571:
                    b = !str.equals("end") ? (byte) -1 : (byte) 2;
                    break;
                case 115029:
                    b = !str.equals("top") ? (byte) -1 : (byte) 3;
                    break;
                case 109757538:
                    b = !str.equals("start") ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                state.baselineNeededFor(constraintReference.getKey());
                state.baselineNeededFor(constraintReferenceConstraints.getKey());
                constraintReference.baselineToBaseline(constraintReferenceConstraints);
                return;
            }
            if (b == 1) {
                constraintReference.bottomToBottom(constraintReferenceConstraints);
                return;
            }
            if (b == 2) {
                if (!zIsRtl) {
                    constraintReference.rightToRight(constraintReferenceConstraints);
                    return;
                } else {
                    constraintReference.leftToLeft(constraintReferenceConstraints);
                    return;
                }
            }
            if (b == 3) {
                constraintReference.topToTop(constraintReferenceConstraints);
            } else {
                if (b != 4) {
                    return;
                }
                if (!zIsRtl) {
                    constraintReference.leftToLeft(constraintReferenceConstraints);
                } else {
                    constraintReference.rightToRight(constraintReferenceConstraints);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    static Dimension parseDimensionMode(String str) {
        byte b;
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        str.hashCode();
        switch (str.hashCode()) {
            case -1460244870:
                if (!str.equals("preferWrap")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -995424086:
                if (!str.equals("parent")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -895684237:
                if (!str.equals("spread")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3657802:
                if (!str.equals("wrap")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
        }
        if (b == 1) {
            return Dimension.createParent();
        }
        if (b == 2) {
            return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
        }
        if (b == 3) {
            return Dimension.createWrap();
        }
        if (str.endsWith("%")) {
            return Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0);
        }
        return str.contains(":") ? Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION) : dimensionCreateFixed;
    }

    static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                dimensionCreateFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    dimensionCreateFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof CLString) {
                    dimensionCreateFixed.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull("max");
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    dimensionCreateFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
                    return dimensionCreateFixed;
                }
                if (orNull2 instanceof CLString) {
                    dimensionCreateFixed.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return dimensionCreateFixed;
    }

    static long parseColorString(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF".concat(String.valueOf(strSubstring));
        }
        return Long.parseLong(strSubstring, 16);
    }

    static String lookForType(CLObject cLObject) throws CLParsingException {
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }
}
