package kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0005\u0010\u0007\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\b\u0010\u0006\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\b\u0010\u0007\u001a'\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000e\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0012\u001a\u0014\u0010\u0015\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0013\u0010\u0017\u001a\u00020\u0000*\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0017\u001a\u00020\u0000*\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u0016*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0000*\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\u001d\u001a\u00020\u0000*\u00020\u001c2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u001c*\u00020\u0000H\u0007¢\u0006\u0004\b \u0010!\u001a1\u0010 \u001a\u00020\u001c*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b \u0010\"\u001a\u0014\u0010\u001a\u001a\u00020\u0016*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001a\u0010#\u001a:\u0010\u001a\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u001a\u0010%\u001a,\u0010(\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0087\b¢\u0006\u0004\b(\u0010)\u001a4\u0010(\u001a\u00020\u0000*\u00020*2\u0006\u0010\u0002\u001a\u00020\u00002\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0087\b¢\u0006\u0004\b(\u0010+\u001a6\u0010(\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010,2\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0087\b¢\u0006\u0004\b(\u0010-\u001a>\u0010(\u001a\u00020\u0000*\u00020*2\b\u0010\u0002\u001a\u0004\u0018\u00010,2\u0006\u0010\u0004\u001a\u00020\u00002\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&\"\u0004\u0018\u00010'H\u0087\b¢\u0006\u0004\b(\u0010.\u001a+\u00102\u001a\b\u0012\u0004\u0012\u00020\u000001*\u00020/2\u0006\u0010\u0002\u001a\u0002002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b2\u00103\u001a\u001c\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b4\u00105\u001a$\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b4\u00106\u001a#\u00107\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b7\u0010\u000b\u001a+\u00107\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b7\u00108\u001a#\u00109\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b9\u0010\u000b\u001a0\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010$\u001a\u00020:H\u0087\b¢\u0006\u0004\b;\u0010<\u001a \u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020:H\u0087\b¢\u0006\u0004\b;\u0010=\u001a(\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b;\u0010>\u001a\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0087\b¢\u0006\u0004\b;\u0010\u001e\u001a\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0016H\u0087\b¢\u0006\u0004\b;\u0010\u0018\u001a(\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b;\u0010\u0019\u001a(\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b;\u0010@\u001a\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020AH\u0087\b¢\u0006\u0004\b;\u0010B\u001a\u0018\u0010;\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020CH\u0087\b¢\u0006\u0004\b;\u0010D\u001a\u001c\u0010E\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010G\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bG\u0010F\u001a$\u0010H\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bH\u0010I\u001a#\u0010J\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\t¢\u0006\u0004\bJ\u0010K\u001a\u001c\u0010L\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020/H\u0087\b¢\u0006\u0004\bL\u0010M\u001a\u001c\u0010L\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020AH\u0087\b¢\u0006\u0004\bL\u0010N\u001a \u0010L\u001a\u00020\t*\u0004\u0018\u00010/2\b\u0010\u0002\u001a\u0004\u0018\u00010/H\u0087\u0004¢\u0006\u0004\bL\u0010O\u001a'\u0010L\u001a\u00020\t*\u0004\u0018\u00010/2\b\u0010\u0002\u001a\u0004\u0018\u00010/2\u0006\u0010\u0004\u001a\u00020\tH\u0007¢\u0006\u0004\bL\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\bQ\u0010\u0012\u001a$\u0010R\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bR\u0010I\u001a;\u0010T\u001a\u00020\t*\u00020/2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\t¢\u0006\u0004\bT\u0010U\u001a;\u0010T\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\t¢\u0006\u0004\bT\u0010V\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,H\u0087\b¢\u0006\u0004\b\u0014\u0010W\u001a\u001c\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,H\u0087\b¢\u0006\u0004\b\u0015\u0010W\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,H\u0087\b¢\u0006\u0004\b\u0011\u0010W\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,H\u0087\b¢\u0006\u0004\b\u0013\u0010W\u001a\u001e\u0010X\u001a\u00020\u001c*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020:H\u0087\b¢\u0006\u0004\bX\u0010Y\u001a\u001e\u0010Z\u001a\u000200*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bZ\u0010[\u001a\u0013\u0010\\\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\\\u0010\u0012\u001a\u001b\u0010\\\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,H\u0007¢\u0006\u0004\b\\\u0010W\u001a\u0013\u0010]\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b]\u0010\u0012\u001a\u001b\u0010]\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020,H\u0007¢\u0006\u0004\b]\u0010W\u001a\u001b\u0010^\u001a\u00020\u0000*\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b^\u0010_\"%\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u00000`j\b\u0012\u0004\u0012\u00020\u0000`a*\u00020*8G¢\u0006\u0006\u001a\u0004\bb\u0010c"}, d2 = {"", "", "p0", "", "p1", "nativeIndexOf", "(Ljava/lang/String;CI)I", "(Ljava/lang/String;Ljava/lang/String;I)I", "nativeLastIndexOf", "", "equals", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "p2", "replace", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "replaceFirst", "toUpperCase", "(Ljava/lang/String;)Ljava/lang/String;", "uppercase", "toLowerCase", "lowercase", "", "concatToString", "([C)Ljava/lang/String;", "([CII)Ljava/lang/String;", "toCharArray", "(Ljava/lang/String;II)[C", "", "decodeToString", "([B)Ljava/lang/String;", "([BIIZ)Ljava/lang/String;", "encodeToByteArray", "(Ljava/lang/String;)[B", "(Ljava/lang/String;IIZ)[B", "(Ljava/lang/String;)[C", "p3", "(Ljava/lang/String;[CIII)[C", "", "", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "", "Ljava/util/regex/Pattern;", "", "split", "(Ljava/lang/CharSequence;Ljava/util/regex/Pattern;I)Ljava/util/List;", "substring", "(Ljava/lang/String;I)Ljava/lang/String;", "(Ljava/lang/String;II)Ljava/lang/String;", "startsWith", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "endsWith", "Ljava/nio/charset/Charset;", "String", "([BIILjava/nio/charset/Charset;)Ljava/lang/String;", "([BLjava/nio/charset/Charset;)Ljava/lang/String;", "([BII)Ljava/lang/String;", "", "([III)Ljava/lang/String;", "Ljava/lang/StringBuffer;", "(Ljava/lang/StringBuffer;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "codePointAt", "(Ljava/lang/String;I)I", "codePointBefore", "codePointCount", "(Ljava/lang/String;II)I", "compareTo", "(Ljava/lang/String;Ljava/lang/String;Z)I", "contentEquals", "(Ljava/lang/String;Ljava/lang/CharSequence;)Z", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "intern", "offsetByCodePoints", "p4", "regionMatches", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "toByteArray", "(Ljava/lang/String;Ljava/nio/charset/Charset;)[B", "toPattern", "(Ljava/lang/String;I)Ljava/util/regex/Pattern;", "capitalize", "decapitalize", "repeat", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    private static final int nativeIndexOf(String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.indexOf(c, i);
    }

    private static final int nativeIndexOf(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.indexOf(str2, i);
    }

    private static final int nativeLastIndexOf(String str, char c, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.lastIndexOf(c, i);
    }

    private static final int nativeLastIndexOf(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str.lastIndexOf(str2, i);
    }

    public static /* synthetic */ boolean equals$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.equals(str, str2, z);
    }

    public static final boolean equals(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ String replace$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return StringsKt.replace(str, c, c2, z);
    }

    public static final String replace(String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            String strReplace = str.replace(c, c2);
            Intrinsics.checkNotNullExpressionValue(strReplace, "");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (CharsKt.equals(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ String replace$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return StringsKt.replace(str, str2, str3, z);
    }

    public static final String replace(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String str4 = str;
        int i = 0;
        int iIndexOf = StringsKt.indexOf(str4, str2, 0, z);
        if (iIndexOf < 0) {
            return str;
        }
        int length = str2.length();
        int iCoerceAtLeast = RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str4, i, iIndexOf);
            sb.append(str3);
            i = iIndexOf + length;
            if (iIndexOf >= str.length()) {
                break;
            }
            iIndexOf = StringsKt.indexOf(str4, str2, iIndexOf + iCoerceAtLeast, z);
        } while (iIndexOf > 0);
        sb.append((CharSequence) str4, i, str.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static /* synthetic */ String replaceFirst$default(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return StringsKt.replaceFirst(str, c, c2, z);
    }

    public static final String replaceFirst(String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default(str2, c, 0, z, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt.replaceRange((CharSequence) str2, iIndexOf$default, iIndexOf$default + 1, (CharSequence) String.valueOf(c2)).toString();
    }

    public static /* synthetic */ String replaceFirst$default(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return StringsKt.replaceFirst(str, str2, str3, z);
    }

    public static final String replaceFirst(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        String str4 = str;
        int iIndexOf$default = StringsKt.indexOf$default(str4, str2, 0, z, 2, (Object) null);
        return iIndexOf$default < 0 ? str : StringsKt.replaceRange((CharSequence) str4, iIndexOf$default, str2.length() + iIndexOf$default, (CharSequence) str3).toString();
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toUpperCase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String upperCase = str.toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    private static final String uppercase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toLowerCase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static final String lowercase(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final String concatToString(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new String(cArr);
    }

    public static /* synthetic */ String concatToString$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return StringsKt.concatToString(cArr, i, i2);
    }

    public static final String concatToString(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static /* synthetic */ char[] toCharArray$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return StringsKt.toCharArray(str, i, i2);
    }

    public static final char[] toCharArray(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static final String decodeToString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, Charsets.UTF_8);
    }

    public static /* synthetic */ String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.decodeToString(bArr, i, i2, z);
    }

    public static final String decodeToString(byte[] bArr, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, Charsets.UTF_8);
        }
        String string = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final byte[] encodeToByteArray(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return StringsKt.encodeToByteArray(str, i, i2, z);
    }

    public static final byte[] encodeToByteArray(String str, int i, int i2, boolean z) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (!z) {
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Charset charset = Charsets.UTF_8;
            Intrinsics.checkNotNull(strSubstring, "");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        }
        ByteBuffer byteBufferEncode = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    private static final char[] toCharArray(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        return charArray;
    }

    static /* synthetic */ char[] toCharArray$default(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    private static final char[] toCharArray(String str, char[] cArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    private static final String format(String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    private static final String format(StringCompanionObject stringCompanionObject, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    private static final String format(String str, Locale locale, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    private static final String format(StringCompanionObject stringCompanionObject, Locale locale, String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        String str2 = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return StringsKt.split(charSequence, pattern, i);
    }

    public static final List<String> split(CharSequence charSequence, Pattern pattern, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(pattern, "");
        StringsKt.requireNonNegativeLimit(i);
        if (i == 0) {
            i = -1;
        }
        String[] strArrSplit = pattern.split(charSequence, i);
        Intrinsics.checkNotNullExpressionValue(strArrSplit, "");
        return ArraysKt.asList(strArrSplit);
    }

    private static final String substring(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    private static final String substring(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.startsWith(str, str2, z);
    }

    public static final boolean startsWith(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2);
        }
        return StringsKt.regionMatches(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.startsWith(str, str2, i, z);
    }

    public static final boolean startsWith(String str, String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return StringsKt.regionMatches(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.endsWith(str, str2, z);
    }

    public static final boolean endsWith(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.endsWith(str2);
        }
        return StringsKt.regionMatches(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    private static final String String(byte[] bArr, int i, int i2, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new String(bArr, i, i2, charset);
    }

    private static final String String(byte[] bArr, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(charset, "");
        return new String(bArr, charset);
    }

    private static final String String(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, i, i2, Charsets.UTF_8);
    }

    private static final String String(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(bArr, Charsets.UTF_8);
    }

    private static final String String(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new String(cArr);
    }

    private static final String String(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "");
        return new String(cArr, i, i2);
    }

    private static final String String(int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new String(iArr, i, i2);
    }

    private static final String String(StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(stringBuffer, "");
        return new String(stringBuffer);
    }

    private static final String String(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        return new String(sb);
    }

    private static final int codePointAt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointAt(i);
    }

    private static final int codePointBefore(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointBefore(i);
    }

    private static final int codePointCount(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.codePointCount(i, i2);
    }

    public static /* synthetic */ int compareTo$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.compareTo(str, str2, z);
    }

    public static final int compareTo(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    private static final boolean contentEquals(String str, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return str.contentEquals(charSequence);
    }

    private static final boolean contentEquals(String str, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(stringBuffer, "");
        return str.contentEquals(stringBuffer);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    public static final boolean contentEquals(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (z) {
            return StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return StringsKt.contentEquals(charSequence, charSequence2);
    }

    private static final String intern(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strIntern = str.intern();
        Intrinsics.checkNotNullExpressionValue(strIntern, "");
        return strIntern;
    }

    private static final int offsetByCodePoints(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.offsetByCodePoints(i, i2);
    }

    public static /* synthetic */ boolean regionMatches$default(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return StringsKt.regionMatches(charSequence, i, charSequence2, i2, i3, z);
    }

    public static final boolean regionMatches(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.regionMatches((String) charSequence, i, (String) charSequence2, i2, i3, z);
        }
        return StringsKt.regionMatchesImpl(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return StringsKt.regionMatches(str, i, str2, i2, i3, z);
    }

    public static final boolean regionMatches(String str, int i, String str2, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toLowerCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private static final String lowercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "2.1", warningSince = "1.5")
    private static final String toUpperCase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    private static final String uppercase(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    private static final byte[] toByteArray(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    static /* synthetic */ Pattern toPattern$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }

    private static final Pattern toPattern(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str, i);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        return patternCompile;
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String capitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return StringsKt.capitalize(str, locale);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String capitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Intrinsics.checkNotNull(strSubstring, "");
            String upperCase = strSubstring.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Intrinsics.checkNotNull(strSubstring, "");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    public static final String decapitalize(String str, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        Intrinsics.checkNotNull(strSubstring, "");
        String lowerCase = strSubstring.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        String strSubstring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        return sb.toString();
    }

    public static final String repeat(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Count 'n' must be non-negative, but was ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i);
        if (i > 0) {
            while (true) {
                sb2.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public static final Comparator<String> getCASE_INSENSITIVE_ORDER(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(comparator, "");
        return comparator;
    }
}
