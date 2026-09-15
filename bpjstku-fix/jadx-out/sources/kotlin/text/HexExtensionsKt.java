package kotlin.text;

import androidx.collection.SieveCacheKt;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\r\n\u0002\u0010\n\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\t\u001a3\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a3\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u000e\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0017\u001a/\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a1\u0010\u001f\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001f\u0010!\u001a-\u0010\"\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\nH\u0003¢\u0006\u0004\b\"\u0010#\u001a-\u0010$\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\nH\u0003¢\u0006\u0004\b$\u0010#\u001a-\u0010%\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\nH\u0003¢\u0006\u0004\b%\u0010#\u001a+\u0010&\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\nH\u0003¢\u0006\u0004\b&\u0010#\u001a\u001b\u0010(\u001a\u00020'*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\u001aG\u0010*\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b*\u0010\u001b\u001a'\u0010+\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u0010-\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.\u001a#\u0010/\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u00100\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020'2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u00101\u001a\u001d\u00102\u001a\u00020'*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b2\u00103\u001a1\u00102\u001a\u00020'*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0004\b2\u00104\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0002052\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u00106\u001a\u001d\u00107\u001a\u000205*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b7\u00108\u001a1\u00107\u001a\u000205*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0004\b7\u00109\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010:\u001a\u001d\u0010;\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b;\u0010<\u001a1\u0010;\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b;\u0010=\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u001c2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010>\u001a\u001d\u0010?\u001a\u00020\u001c*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b?\u0010@\u001a1\u0010?\u001a\u00020\u001c*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b?\u0010A\u001a+\u0010C\u001a\u00020\u0003*\u00020\u001c2\u0006\u0010\u0002\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0003¢\u0006\u0004\bC\u0010D\u001a#\u0010E\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010F\u001a3\u0010G\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0003¢\u0006\u0004\bG\u0010H\u001a3\u0010I\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0003¢\u0006\u0004\bI\u0010J\u001aC\u0010M\u001a\u00020L*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020K2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u0010N\u001a+\u0010O\u001a\u00020L*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u0010P\u001a#\u0010Q\u001a\u00020L*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010R\u001a#\u0010S\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u00100\u001a#\u0010T\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bT\u0010U\u001a<\u0010V\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020K2\u0006\u0010\u0013\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\bV\u0010W\u001a\u001c\u0010X\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\bX\u0010Y\u001a\u001c\u0010Z\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\bZ\u0010[\u001a3\u0010\\\u001a\u00020L*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\\\u0010]\u001a3\u0010^\u001a\u00020L*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b^\u0010_\u001a3\u0010`\u001a\u00020L*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b`\u0010_\u001a\u001b\u0010b\u001a\u00020a*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010c\"\u0014\u0010d\u001a\u00020\u00038\u0002X\u0083T¢\u0006\u0006\n\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020\u00038\u0002X\u0083T¢\u0006\u0006\n\u0004\bf\u0010e\" \u0010g\u001a\u00020\u000b8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010j\"\u0014\u0010m\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010h\"\u0014\u0010n\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bn\u0010h\"\u0014\u0010p\u001a\u00020o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bp\u0010q"}, d2 = {"", "Lkotlin/text/HexFormat;", "p0", "", "toHexString", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "", "p1", "p2", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "Lkotlin/text/HexFormat$BytesHexFormat;", "", "p3", "toHexStringNoLineAndGroupSeparator", "([BIILkotlin/text/HexFormat$BytesHexFormat;[I)Ljava/lang/String;", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringSlowPath", "", "p4", "p5", "formatByteAt", "([BILjava/lang/String;Ljava/lang/String;[I[CI)I", "([BI[I[CI)I", "formattedStringLength", "(IIII)I", "p6", "(IIIIIII)I", "", "checkFormatLength", "(J)I", "hexToByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "(Ljava/lang/String;IILkotlin/text/HexFormat;)[B", "hexToByteArrayNoLineAndGroupSeparator", "(Ljava/lang/String;IILkotlin/text/HexFormat$BytesHexFormat;)[B", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArraySlowPath", "", "parseByteAt", "(Ljava/lang/String;I)B", "parsedByteArrayMaxSize", "charsPerSet", "(JII)J", "wholeElementsPerSet", "(JJI)J", "checkNewLineAt", "(Ljava/lang/String;II)I", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "(Ljava/lang/String;IILkotlin/text/HexFormat;)B", "", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "(Ljava/lang/String;IILkotlin/text/HexFormat;)S", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "(Ljava/lang/String;IILkotlin/text/HexFormat;)I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToLong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "(Ljava/lang/String;IILkotlin/text/HexFormat;)J", "Lkotlin/text/HexFormat$NumberHexFormat;", "toHexStringImpl", "(JLkotlin/text/HexFormat$NumberHexFormat;Ljava/lang/String;I)Ljava/lang/String;", "toCharArrayIfNotEmpty", "(Ljava/lang/String;[CI)I", "hexToIntImpl", "(Ljava/lang/String;IILkotlin/text/HexFormat;I)I", "hexToLongImpl", "(Ljava/lang/String;IILkotlin/text/HexFormat;I)J", "", "", "checkPrefixSuffixNumberOfDigits", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZI)V", "checkNumberOfDigits", "(Ljava/lang/String;III)V", "checkZeroDigits", "(Ljava/lang/String;II)V", "parseInt", "parseLong", "(Ljava/lang/String;II)J", "checkContainsAt", "(Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)I", "decimalFromHexDigitAt", "(Ljava/lang/String;I)I", "longDecimalFromHexDigitAt", "(Ljava/lang/String;I)J", "throwInvalidNumberOfDigits", "(Ljava/lang/String;IILjava/lang/String;I)V", "throwNotContainedAt", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "throwInvalidPrefixSuffix", "", "throwInvalidDigitAt", "(Ljava/lang/String;I)Ljava/lang/Void;", "LOWER_CASE_HEX_DIGITS", "Ljava/lang/String;", "UPPER_CASE_HEX_DIGITS", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "[I", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "", "HEX_DIGITS_TO_LONG_DECIMAL", "[J"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    public static /* synthetic */ void getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations() {
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return BYTE_TO_LOWER_CASE_HEX_DIGITS;
    }

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = LOWER_CASE_HEX_DIGITS.charAt(i2 & 15) | (LOWER_CASE_HEX_DIGITS.charAt(i2 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = UPPER_CASE_HEX_DIGITS.charAt(i3 & 15) | (UPPER_CASE_HEX_DIGITS.charAt(i3 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < str.length()) {
            iArr3[str.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < str.length()) {
            iArr3[str.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            jArr[str.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < str.length()) {
            jArr[str.charAt(i)] = i12;
            i++;
            i12++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    public static final String toHexString(byte[] bArr, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return toHexString(bArr, 0, bArr.length, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    public static final String toHexString(byte[] bArr, int i, int i2, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        int[] iArr = hexFormat.getUpperCase() ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        if (bytes.getNoLineAndGroupSeparator()) {
            return toHexStringNoLineAndGroupSeparator(bArr, i, i2, bytes, iArr);
        }
        return toHexStringSlowPath(bArr, i, i2, bytes, iArr);
    }

    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        if (bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix()) {
            return toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i, i2, bytesHexFormat, iArr);
        }
        return toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i, i2, bytesHexFormat, iArr);
    }

    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i2 - i;
        int byteAt = 0;
        if (length == 0) {
            char[] cArr = new char[checkFormatLength(((long) i3) * 2)];
            while (i < i2) {
                byteAt = formatByteAt(bArr, i, iArr, cArr, byteAt);
                i++;
            }
            return StringsKt.concatToString(cArr);
        }
        char[] cArr2 = new char[checkFormatLength((((long) i3) * 3) - 1)];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        int byteAt2 = formatByteAt(bArr, i, iArr, cArr2, 0);
        for (int i4 = i + 1; i4 < i2; i4++) {
            cArr2[byteAt2] = cCharAt;
            byteAt2 = formatByteAt(bArr, i4, iArr, cArr2, byteAt2 + 1);
        }
        return StringsKt.concatToString(cArr2);
    }

    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i2 - i, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i, bytePrefix, byteSuffix, iArr, cArr, 0);
        while (true) {
            i++;
            if (i < i2) {
                byteAt = formatByteAt(bArr, i, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
            } else {
                return StringsKt.concatToString(cArr);
            }
        }
    }

    private static final String toHexStringSlowPath(byte[] bArr, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i3;
        int i4;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        int i5 = formattedStringLength(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i5];
        int i6 = i;
        int charArrayIfNotEmpty = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i2) {
            if (i7 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i3 = 0;
                i4 = 0;
            } else if (i8 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = i8;
            }
            if (i4 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            charArrayIfNotEmpty = formatByteAt(bArr, i6, bytePrefix, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i6++;
            i8 = i4 + 1;
            i7 = i3 + 1;
        }
        if (charArrayIfNotEmpty != i5) {
            throw new IllegalStateException("Check failed.");
        }
        return StringsKt.concatToString(cArr);
    }

    private static final int formatByteAt(byte[] bArr, int i, String str, String str2, int[] iArr, char[] cArr, int i2) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i2)));
    }

    private static final int formatByteAt(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & UByte.MAX_VALUE];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    private static final int formattedStringLength(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j = i2;
        return checkFormatLength((((long) i) * (((((long) i3) + 2) + ((long) i4)) + j)) - j);
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i8 = i - 1;
        int i9 = i8 / i2;
        int i10 = (i2 - 1) / i3;
        int i11 = i % i2;
        if (i11 == 0) {
            i11 = i2;
        }
        int i12 = (i10 * i9) + ((i11 - 1) / i3);
        return checkFormatLength(((long) i9) + (((long) i12) * ((long) i4)) + (((long) ((i8 - i9) - i12)) * ((long) i5)) + (((long) i) * (((long) i6) + 2 + ((long) i7))));
    }

    private static final int checkFormatLength(long j) {
        if (0 <= j && j <= SieveCacheKt.NodeLinkMask) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder("The resulting string length is too big: ");
        sb.append((Object) ULong.m8249toStringimpl(ULong.m8203constructorimpl(j)));
        throw new IllegalArgumentException(sb.toString());
    }

    public static final byte[] hexToByteArray(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToByteArray(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByteArray(str, i, i2, hexFormat);
    }

    private static final byte[] hexToByteArray(String str, int i, int i2, HexFormat hexFormat) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (i == i2) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytes = hexFormat.getBytes();
        return (!bytes.getNoLineAndGroupSeparator() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i, i2, bytes)) == null) ? hexToByteArraySlowPath(str, i, i2, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        if (bytesHexFormat.getShortByteSeparatorNoPrefixAndSuffix()) {
            return hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i, i2, bytesHexFormat);
        }
        return hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i, i2, bytesHexFormat);
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i2 - i;
        int i4 = 2;
        if (length == 0) {
            if ((i3 & 1) != 0) {
                return null;
            }
            int i5 = i3 >> 1;
            byte[] bArr = new byte[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i7] = parseByteAt(str, i6);
                i6 += 2;
            }
            return bArr;
        }
        if (i3 % 3 != 2) {
            return null;
        }
        int i8 = (i3 / 3) + 1;
        byte[] bArr2 = new byte[i8];
        char cCharAt = bytesHexFormat.getByteSeparator().charAt(0);
        bArr2[0] = parseByteAt(str, 0);
        for (int i9 = 1; i9 < i8; i9++) {
            if (str.charAt(i4) != cCharAt) {
                String byteSeparator = bytesHexFormat.getByteSeparator();
                boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
                String str2 = byteSeparator;
                if (str2.length() != 0) {
                    int length2 = str2.length();
                    for (int i10 = 0; i10 < length2; i10++) {
                        if (!CharsKt.equals(byteSeparator.charAt(i10), str.charAt(i4 + i10), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, i4, i2, byteSeparator, "byte separator");
                        }
                    }
                }
            }
            bArr2[i9] = parseByteAt(str, i4 + 1);
            i4 += 3;
        }
        return bArr2;
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = ((long) bytePrefix.length()) + 2 + ((long) byteSuffix.length()) + length;
        long j = i2 - i;
        int i3 = (int) ((j + length) / length2);
        if ((((long) i3) * length2) - length != j) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        byte[] bArr = new byte[i3];
        String str2 = bytePrefix;
        if (str2.length() != 0) {
            int length3 = str2.length();
            for (int i4 = 0; i4 < length3; i4++) {
                if (!CharsKt.equals(bytePrefix.charAt(i4), str.charAt(i + i4), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i, i2, bytePrefix, "byte prefix");
                }
            }
            i += bytePrefix.length();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(byteSuffix);
        sb.append(byteSeparator);
        sb.append(bytePrefix);
        String string = sb.toString();
        int i5 = i3 - 1;
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = parseByteAt(str, i);
            i += 2;
            String str3 = string;
            if (str3.length() != 0) {
                int length4 = str3.length();
                for (int i7 = 0; i7 < length4; i7++) {
                    if (!CharsKt.equals(string.charAt(i7), str.charAt(i + i7), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i, i2, string, "byte suffix + byte separator + byte prefix");
                    }
                }
                i += string.length();
            }
        }
        bArr[i5] = parseByteAt(str, i);
        int i8 = i + 2;
        String str4 = byteSuffix;
        if (str4.length() == 0) {
            return bArr;
        }
        int length5 = str4.length();
        for (int i9 = 0; i9 < length5; i9++) {
            if (!CharsKt.equals(byteSuffix.charAt(i9), str.charAt(i8 + i9), ignoreCase$kotlin_stdlib)) {
                throwNotContainedAt(str, i8, i2, byteSuffix, "byte suffix");
            }
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe A[SYNTHETIC] */
    private static final byte[] hexToByteArraySlowPath(String str, int i, int i2, HexFormat.BytesHexFormat bytesHexFormat) {
        int i3;
        String str2;
        int length;
        int i4;
        int i5;
        int i6;
        String str3;
        int i7;
        int length2;
        int i8;
        int bytesPerLine = bytesHexFormat.getBytesPerLine();
        int bytesPerGroup = bytesHexFormat.getBytesPerGroup();
        String bytePrefix = bytesHexFormat.getBytePrefix();
        String byteSuffix = bytesHexFormat.getByteSuffix();
        String byteSeparator = bytesHexFormat.getByteSeparator();
        String groupSeparator = bytesHexFormat.getGroupSeparator();
        boolean ignoreCase$kotlin_stdlib = bytesHexFormat.getIgnoreCase();
        int i9 = parsedByteArrayMaxSize(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        byte[] bArr = new byte[i9];
        int length3 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (length3 < i2) {
            if (i11 == bytesPerLine) {
                length3 = checkNewLineAt(str, length3, i2);
                i11 = 0;
            } else {
                if (i12 == bytesPerGroup) {
                    String str4 = groupSeparator;
                    if (str4.length() != 0) {
                        int length4 = str4.length();
                        int i13 = 0;
                        while (i13 < length4) {
                            int i14 = i11;
                            int i15 = length4;
                            if (!CharsKt.equals(groupSeparator.charAt(i13), str.charAt(length3 + i13), ignoreCase$kotlin_stdlib)) {
                                throwNotContainedAt(str, length3, i2, groupSeparator, "group separator");
                            }
                            i13++;
                            length4 = i15;
                            i11 = i14;
                        }
                        length3 += groupSeparator.length();
                    }
                } else {
                    int i16 = i11;
                    if (i12 != 0) {
                        String str5 = byteSeparator;
                        if (str5.length() == 0) {
                            i11 = i16;
                            i12 = i12;
                        } else {
                            int length5 = str5.length();
                            int i17 = 0;
                            while (i17 < length5) {
                                int i18 = length5;
                                int i19 = i12;
                                if (!CharsKt.equals(byteSeparator.charAt(i17), str.charAt(length3 + i17), ignoreCase$kotlin_stdlib)) {
                                    throwNotContainedAt(str, length3, i2, byteSeparator, "byte separator");
                                }
                                i17++;
                                length5 = i18;
                                i12 = i19;
                            }
                            length3 += byteSeparator.length();
                            i11 = i16;
                        }
                    } else {
                        i11 = i16;
                        i12 = i12;
                    }
                }
                int i20 = i11 + 1;
                i3 = i12 + 1;
                str2 = bytePrefix;
                if (str2.length() == 0) {
                    i5 = i3;
                } else {
                    length = str2.length();
                    i4 = 0;
                    while (i4 < length) {
                        int i21 = length;
                        int i22 = i3;
                        if (!CharsKt.equals(bytePrefix.charAt(i4), str.charAt(length3 + i4), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length3, i2, bytePrefix, "byte prefix");
                        }
                        i4++;
                        length = i21;
                        i3 = i22;
                    }
                    i5 = i3;
                    length3 += bytePrefix.length();
                }
                if (i2 - 2 < length3) {
                    throwInvalidNumberOfDigits(str, length3, i2, "exactly", 2);
                }
                i6 = i10 + 1;
                bArr[i10] = parseByteAt(str, length3);
                length3 += 2;
                str3 = byteSuffix;
                if (str3.length() != 0) {
                    length2 = str3.length();
                    i8 = 0;
                    while (i8 < length2) {
                        int i23 = i6;
                        if (!CharsKt.equals(byteSuffix.charAt(i8), str.charAt(length3 + i8), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, length3, i2, byteSuffix, "byte suffix");
                        }
                        i8++;
                        i6 = i23;
                    }
                    i7 = i6;
                    length3 += byteSuffix.length();
                } else {
                    i7 = i6;
                }
                i11 = i20;
                i10 = i7;
                i12 = i5;
            }
            i12 = 0;
            int i24 = i11 + 1;
            i3 = i12 + 1;
            str2 = bytePrefix;
            if (str2.length() == 0) {
                i5 = i3;
            } else {
                length = str2.length();
                i4 = 0;
                while (i4 < length) {
                    int i25 = length;
                    int i26 = i3;
                    if (!CharsKt.equals(bytePrefix.charAt(i4), str.charAt(length3 + i4), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, length3, i2, bytePrefix, "byte prefix");
                    }
                    i4++;
                    length = i25;
                    i3 = i26;
                }
                i5 = i3;
                length3 += bytePrefix.length();
            }
            if (i2 - 2 < length3) {
                throwInvalidNumberOfDigits(str, length3, i2, "exactly", 2);
            }
            i6 = i10 + 1;
            bArr[i10] = parseByteAt(str, length3);
            length3 += 2;
            str3 = byteSuffix;
            if (str3.length() != 0) {
                length2 = str3.length();
                i8 = 0;
                while (i8 < length2) {
                    int i27 = i6;
                    if (!CharsKt.equals(byteSuffix.charAt(i8), str.charAt(length3 + i8), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, length3, i2, byteSuffix, "byte suffix");
                    }
                    i8++;
                    i6 = i27;
                }
                i7 = i6;
                length3 += byteSuffix.length();
            } else {
                i7 = i6;
            }
            i11 = i24;
            i10 = i7;
            i12 = i5;
        }
        if (i10 == i9) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jCharsPerSet;
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j = ((long) i6) + 2 + ((long) i7);
        long jCharsPerSet2 = charsPerSet(j, i3, i5);
        if (i2 <= i3) {
            jCharsPerSet = charsPerSet(j, i2, i5);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i2 / i3, i4);
            int i8 = i2 % i3;
            if (i8 != 0) {
                jCharsPerSet = jCharsPerSet + ((long) i4) + charsPerSet(j, i8, i5);
            }
        }
        long j2 = i;
        long jWholeElementsPerSet = wholeElementsPerSet(j2, jCharsPerSet, 1);
        long j3 = j2 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j3, jCharsPerSet2, i4);
        long j4 = j3 - ((jCharsPerSet2 + ((long) i4)) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j4, j, i5);
        return (int) ((jWholeElementsPerSet * ((long) i2)) + (jWholeElementsPerSet2 * ((long) i3)) + jWholeElementsPerSet3 + ((long) (j4 - ((j + ((long) i5)) * jWholeElementsPerSet3) > 0 ? 1 : 0)));
    }

    private static final long charsPerSet(long j, int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = i;
        return (j * j2) + (((long) i2) * (j2 - 1));
    }

    private static final long wholeElementsPerSet(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    private static final int checkNewLineAt(String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != '\n') ? i3 : i + 2;
        }
        if (str.charAt(i) == '\n') {
            return i + 1;
        }
        StringBuilder sb = new StringBuilder("Expected a new line at index ");
        sb.append(i);
        sb.append(", but was ");
        sb.append(str.charAt(i));
        throw new NumberFormatException(sb.toString());
    }

    public static /* synthetic */ String toHexString$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static final String toHexString(byte b, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((b >> 4) & 15), str.charAt(b & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(b & UByte.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return StringsKt.concatToString(cArr);
        }
        return toHexStringImpl(b, number, str, 8);
    }

    public static final byte hexToByte(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToByte(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    static /* synthetic */ byte hexToByte$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToByte(str, i, i2, hexFormat);
    }

    private static final byte hexToByte(String str, int i, int i2, HexFormat hexFormat) {
        return (byte) hexToIntImpl(str, i, i2, hexFormat, 2);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static final String toHexString(short s, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((s >> 12) & 15), str.charAt((s >> 8) & 15), str.charAt((s >> 4) & 15), str.charAt(s & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(cArr, RangesKt.coerceAtMost((Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16) >> 2, 3), 0, 2, null);
            }
            return StringsKt.concatToString(cArr);
        }
        return toHexStringImpl(s, number, str, 16);
    }

    public static final short hexToShort(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToShort(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    static /* synthetic */ short hexToShort$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToShort(str, i, i2, hexFormat);
    }

    private static final short hexToShort(String str, int i, int i2, HexFormat hexFormat) {
        return (short) hexToIntImpl(str, i, i2, hexFormat, 4);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static final String toHexString(int i, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(cArr, RangesKt.coerceAtMost(Integer.numberOfLeadingZeros(i) >> 2, 7), 0, 2, null);
            }
            return StringsKt.concatToString(cArr);
        }
        return toHexStringImpl(i, number, str, 32);
    }

    public static final int hexToInt(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToInt(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    public static /* synthetic */ int hexToInt$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    public static final int hexToInt(String str, int i, int i2, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToIntImpl(str, i, i2, hexFormat, 8);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    public static final String toHexString(long j, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(hexFormat, "");
        String str = hexFormat.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnlyAndNoPadding()) {
            char[] cArr = {str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (15 & j))};
            if (number.getRemoveLeadingZeros()) {
                return StringsKt.concatToString$default(cArr, RangesKt.coerceAtMost(Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, null);
            }
            return StringsKt.concatToString(cArr);
        }
        return toHexStringImpl(j, number, str, 64);
    }

    public static final long hexToLong(String str, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToLong(str, 0, str.length(), hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    public static /* synthetic */ long hexToLong$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    public static final long hexToLong(String str, int i, int i2, HexFormat hexFormat) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hexFormat, "");
        return hexToLongImpl(str, i, i2, hexFormat, 16);
    }

    private static final String toHexStringImpl(long j, HexFormat.NumberHexFormat numberHexFormat, String str, int i) {
        if ((i & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i >> 2;
        int minLength = numberHexFormat.getMinLength();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(minLength - i2, 0);
        String prefix = numberHexFormat.getPrefix();
        String suffix = numberHexFormat.getSuffix();
        boolean removeLeadingZeros = numberHexFormat.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(((long) prefix.length()) + ((long) iCoerceAtLeast) + ((long) i2) + ((long) suffix.length()));
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i3 = iCoerceAtLeast + charArrayIfNotEmpty;
            ArraysKt.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i3);
            charArrayIfNotEmpty = i3;
        }
        int i4 = i;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 -= 4;
            int i6 = (int) ((j >> i4) & 15);
            removeLeadingZeros = removeLeadingZeros && i6 == 0 && (i4 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i6);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? StringsKt.concatToString(cArr) : StringsKt.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length == 1) {
                cArr[i] = str.charAt(0);
            } else {
                int length2 = str.length();
                Intrinsics.checkNotNull(str, "");
                str.getChars(0, length2, cArr, i);
            }
        }
        return i + str.length();
    }

    private static final int hexToIntImpl(String str, int i, int i2, HexFormat hexFormat, int i3) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i, i2, i3);
            return parseInt(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i, i2, prefix, suffix, number.getIgnoreCase(), i3);
        return parseInt(str, i + prefix.length(), i2 - suffix.length());
    }

    private static final long hexToLongImpl(String str, int i, int i2, HexFormat hexFormat, int i3) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            checkNumberOfDigits(str, i, i2, i3);
            return parseLong(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i, i2, prefix, suffix, number.getIgnoreCase(), i3);
        return parseLong(str, i + prefix.length(), i2 - suffix.length());
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i, int i2, String str2, String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i, i2, str2, str3);
        }
        String str4 = str2;
        if (str4.length() != 0) {
            int length = str4.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!CharsKt.equals(str2.charAt(i4), str.charAt(i + i4), z)) {
                    throwNotContainedAt(str, i, i2, str2, "prefix");
                }
            }
            i += str2.length();
        }
        int length2 = i2 - str3.length();
        String str5 = str3;
        if (str5.length() != 0) {
            int length3 = str5.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!CharsKt.equals(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                    throwNotContainedAt(str, length2, i2, str3, DynamicLink.Builder.KEY_SUFFIX);
                }
            }
        }
        checkNumberOfDigits(str, i, length2, i3);
    }

    private static final void checkNumberOfDigits(String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 <= 0) {
            throwInvalidNumberOfDigits(str, i, i2, "at least", 1);
        } else if (i4 > i3) {
            checkZeroDigits(str, i, (i4 + i) - i3);
        }
    }

    private static final void checkZeroDigits(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) != '0') {
                StringBuilder sb = new StringBuilder("Expected the hexadecimal digit '0' at index ");
                sb.append(i);
                sb.append(", but was '");
                sb.append(str.charAt(i));
                sb.append("'.\nThe result won't fit the type being parsed.");
                throw new NumberFormatException(sb.toString());
            }
            i++;
        }
    }

    private static final int checkContainsAt(String str, int i, int i2, String str2, boolean z, String str3) {
        String str4 = str2;
        if (str4.length() == 0) {
            return i;
        }
        int length = str4.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!CharsKt.equals(str2.charAt(i3), str.charAt(i + i3), z)) {
                throwNotContainedAt(str, i, i2, str2, str3);
            }
        }
        return i + str2.length();
    }

    private static final int decimalFromHexDigitAt(String str, int i) {
        int i2;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') == 0 && (i2 = HEX_DIGITS_TO_DECIMAL[cCharAt]) >= 0) {
            return i2;
        }
        throwInvalidDigitAt(str, i);
        throw new KotlinNothingValueException();
    }

    private static final long longDecimalFromHexDigitAt(String str, int i) {
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') == 0) {
            long j = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
            if (j >= 0) {
                return j;
            }
        }
        throwInvalidDigitAt(str, i);
        throw new KotlinNothingValueException();
    }

    private static final void throwInvalidNumberOfDigits(String str, int i, int i2, String str2, int i3) {
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str2);
        sb.append(' ');
        sb.append(i3);
        sb.append(" hexadecimal digits at index ");
        sb.append(i);
        sb.append(", but was \"");
        sb.append(strSubstring);
        sb.append("\" of length ");
        sb.append(i2 - i);
        throw new NumberFormatException(sb.toString());
    }

    private static final void throwNotContainedAt(String str, int i, int i2, String str2, String str3) {
        int iCoerceAtMost = RangesKt.coerceAtMost(str2.length() + i, i2);
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(i, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i);
        sb.append(", but was ");
        sb.append(strSubstring);
        throw new NumberFormatException(sb.toString());
    }

    private static final void throwInvalidPrefixSuffix(String str, int i, int i2, String str2, String str3) {
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        StringBuilder sb = new StringBuilder("Expected a hexadecimal number with prefix \"");
        sb.append(str2);
        sb.append("\" and suffix \"");
        sb.append(str3);
        sb.append("\", but was ");
        sb.append(strSubstring);
        throw new NumberFormatException(sb.toString());
    }

    private static final Void throwInvalidDigitAt(String str, int i) {
        StringBuilder sb = new StringBuilder("Expected a hexadecimal digit at index ");
        sb.append(i);
        sb.append(", but was ");
        sb.append(str.charAt(i));
        throw new NumberFormatException(sb.toString());
    }

    private static final byte parseByteAt(String str, int i) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = HEX_DIGITS_TO_DECIMAL)[cCharAt]) < 0) {
            throwInvalidDigitAt(str, i);
            throw new KotlinNothingValueException();
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        throwInvalidDigitAt(str, i4);
        throw new KotlinNothingValueException();
    }

    private static final int parseInt(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') != 0 || (i3 = HEX_DIGITS_TO_DECIMAL[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i);
                throw new KotlinNothingValueException();
            }
            i4 = (i4 << 4) | i3;
            i++;
        }
        return i4;
    }

    private static final long parseLong(String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j2 = HEX_DIGITS_TO_LONG_DECIMAL[cCharAt];
                if (j2 >= 0) {
                    j = (j << 4) | j2;
                    i++;
                }
            }
            throwInvalidDigitAt(str, i);
            throw new KotlinNothingValueException();
        }
        return j;
    }
}
