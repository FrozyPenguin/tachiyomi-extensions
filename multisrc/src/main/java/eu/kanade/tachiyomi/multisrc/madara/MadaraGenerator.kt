package eu.kanade.tachiyomi.multisrc.madara

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MadaraGenerator : ThemeSourceGenerator {

    override val themePkg = "madara"

    override val themeClass = "Madara"

    override val baseVersionCode: Int = 4

    override val sources = listOf(
            SingleLang("24hRomance", "https://24hromance.com", "en", className = "Romance24h"),
            SingleLang("Adonis Fansub", "https://manga.adonisfansub.com", "tr"),
            SingleLang("AkuManga", "https://akumanga.com", "ar"),
            SingleLang("AlianzaMarcial", "https://alianzamarcial.xyz", "es"),
            SingleLang("AllPornComic", "https://allporncomic.com", "en", isNsfw = true),
            SingleLang("Aloalivn", "https://aloalivn.com", "en", overrideVersionCode = 2),
            SingleLang("AniMangaEs", "https://animangaes.com", "en", overrideVersionCode = 1),
            SingleLang("Agent of Change Translations", "https://aoc.moe", "en", overrideVersionCode = 1),
            SingleLang("ApollComics", "https://apollcomics.xyz", "es"),
            SingleLang("Arang Scans", "https://arangscans.com", "en", overrideVersionCode = 2),
            SingleLang("ArazNovel", "https://www.araznovel.com", "tr"),
            SingleLang("Argos Scan", "https://argosscan.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("Asgard Team", "https://www.asgard1team.com", "ar", overrideVersionCode = 1),
            SingleLang("Astral Library", "https://www.astrallibrary.net", "en", overrideVersionCode = 1),
            SingleLang("Atikrost", "https://atikrost.com", "tr"),
            SingleLang("ATM-Subs", "https://atm-subs.fr", "fr", className = "ATMSubs"),
            SingleLang("AYATOON", "https://ayatoon.com", "tr"),
            SingleLang("Azora", "https://azoramanga.com", "ar", overrideVersionCode = 1),
            SingleLang("BL Manhwa Club", "https://blmanhwa.club", "pt-BR", isNsfw = true, className = "BlManhwaClub"),
            SingleLang("Banana Mecânica", "https://leitorbm.com", "pt-BR", isNsfw = true, pkgName = "bananamecanica", className = "BananaMecanica"),
            SingleLang("Bakaman", "https://bakaman.net", "th", overrideVersionCode = 1),
            SingleLang("BestManga", "https://bestmanga.club", "ru"),
            SingleLang("BestManhua", "https://bestmanhua.com", "en", overrideVersionCode = 1),
            SingleLang("BoysLove", "https://boyslove.me", "en"),
            SingleLang("Bread Factory", "https://www.breadfactory.site", "en"),
            SingleLang("Café com Yaoi", "http://cafecomyaoi.com.br", "pt-BR", pkgName = "cafecomyaoi", className = "CafeComYaoi", isNsfw = true),
            SingleLang("CatOnHeadTranslations", "https://catonhead.com", "en", overrideVersionCode = 1),
            SingleLang("CAT-translator", "https://cat-translator.com", "th", className = "CatTranslator"),
            SingleLang("Chibi Manga", "https://www.cmreader.info", "en"),
            SingleLang("Clover Manga", "https://clover-manga.com", "tr", overrideVersionCode = 1),
            SingleLang("ComicKiba", "https://comickiba.com", "en"),
            SingleLang("Comicdom", "https://comicdom.org", "en"),
            SingleLang("Comics Valley", "https://comicsvalley.com", "hi", isNsfw = true),
            SingleLang("CopyPasteScan", "https://copypastescan.xyz", "es"),
            SingleLang("Cutie Pie", "https://cutiepie.ga", "tr"),
            SingleLang("DarkYue Realm", "https://darkyuerealm.site/web", "pt-BR", pkgName = "darkyurealm", overrideVersionCode = 2),
            SingleLang("Decadence Scans", "https://reader.decadencescans.com", "en", overrideVersionCode = 1),
            SingleLang("شبكة كونان العربية", "https://www.manga.detectiveconanar.com", "ar", className = "DetectiveConanAr", overrideVersionCode = 1),
            SingleLang("DiamondFansub", "https://diamondfansub.com", "tr"),
            SingleLang("Disaster Scans", "https://disasterscans.com", "en", overrideVersionCode = 1),
            SingleLang("DoujinHentai", "https://doujinhentai.net", "es", isNsfw = true),
            SingleLang("DoujinYosh", "https://doujinyosh.work", "id"),
            SingleLang("Dream Manga", "https://en.ruyamanga.com", "en", overrideVersionCode = 1),
            SingleLang("Drope Scan", "https://dropescan.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("Einherjar Scan", "https://einherjarscans.space", "en"),
            SingleLang("FDM Scan", "https://fdmscan.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("1st Kiss", "https://1stkissmanga.com", "en", className = "FirstKissManga", overrideVersionCode = 1),
            SingleLang("1st Kiss Manhua", "https://1stkissmanhua.com", "en", className = "FirstKissManhua"),
            SingleLang("Fênix Scanlator", "https://fenixscanlator.xyz", "pt-BR", pkgName = "fenixscanlator", className = "FenixScanlator"),
            SingleLang("FreeWebtoonCoins", "https://freewebtooncoins.com", "en"),
            SingleLang("TheFluffyHangoutGroup", "https://www.fluffyhangout.club", "en"),
            SingleLang("Furio Scans", "https://furioscans.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("موقع لترجمة المانجا", "https://golden-manga.com", "ar", className = "GoldenManga"),
        	SingleLang("GalaxyDegenScans", "https://gdegenscans.xyz/", "en"),
            SingleLang("Glory Scans", "https://gloryscan.com", "pt-BR", isNsfw = true),
            SingleLang("Graze Scans", "https://grazescans.com/", "en", overrideVersionCode = 1),
            SingleLang("GuncelManga", "https://guncelmanga.com", "tr"),
            SingleLang("Hero Manhua", "https://heromanhua.com", "en"),
            SingleLang("Heroz Scanlation", "https://herozscans.com", "en", overrideVersionCode = 1),
            SingleLang("Himera Fansub", "https://himera-fansub.com", "tr"),
            SingleLang("Hiperdex", "https://hiperdex.com", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Hscans", "https://hscans.com", "en", overrideVersionCode = 1),
            SingleLang("Hunter Fansub", "https://hunterfansub.com", "es"),
            SingleLang("Ichirin No Hana Yuri", "https://ichirinnohanayuri.com.br", "pt-BR", overrideVersionCode = 1),
            SingleLang("Immortal Updates", "https://immortalupdates.com", "en", overrideVersionCode = 1),
            SingleLang("IsekaiScan.com", "https://isekaiscan.com", "en", className = "IsekaiScanCom", overrideVersionCode = 2),
            SingleLang("IsekaiScanManga (unoriginal)", "https://isekaiscanmanga.com", "en", className = "IsekaiScanManga"),
            SingleLang("Its Your Right Manhua", "https://itsyourightmanhua.com/", "en"),
            SingleLang("JJutsuScans", "https://jjutsuscans.com", "en", overrideVersionCode = 1),
            SingleLang("Just For Fun", "https://just-for-fun.ru", "ru"),
            SingleLang("KingzManga", "https://kingzmanga.com", "ar"),
            SingleLang("KisekiManga", "https://kisekimanga.com", "en"),
            SingleLang("Kissmanga.in", "https://kissmanga.in", "en", className= "KissmangaIn"),
            SingleLang("KlikManga", "https://klikmanga.com", "id"),
            SingleLang("Kombatch", "https://kombatch.com", "id"),
            SingleLang("Kun Manga", "https://kunmanga.com", "en"),
            SingleLang("Levelerscans", "https://levelerscans.xyz", "en"),
            SingleLang("Lily Manga", "https://lilymanga.com", "en"),
            SingleLang("LovableSubs", "https://lovablesubs.com", "tr"),
            SingleLang("Manga18 Fun", "https://manga18.fun", "en"),
            SingleLang("Manga18 Fx", "https://manga18fx.com", "en"),
            SingleLang("Manga347", "https://manga347.com", "en", overrideVersionCode = 2),
            SingleLang("مانجا العاشق", "https://3asq.org", "ar", className = "Manga3asq"),
            SingleLang("Manga3S", "https://manga3s.com", "en"),
            SingleLang("Manga68", "https://manga68.com", "en"),
            SingleLang("Manga Action", "https://manga-action.com", "ar", overrideVersionCode = 1),
            SingleLang("Manga Arab Online مانجا عرب اون لاين", "https://mangaarabonline.com", "ar", className = "MangaArabOnline"),
            SingleLang("مانجا عرب تيم Manga Arab Team", "https://mangaarabteam.com", "ar", className = "MangaArabTeam"),
            SingleLang("MangaBaz", "https://mangabaz.com", "tr"),
            SingleLang("Manga Bin", "https://mangabin.com/", "en"),
            SingleLang("MangaBob", "https://mangabob.com", "en"),
            SingleLang("Manga Chill", "https://mangachill.com/", "en"),
            SingleLang("Manga Clash", "https://mangaclash.com", "en"),
            SingleLang("MangaCultivator", "https://mangacultivator.com", "en"),
            SingleLang("MangaDods", "https://www.mangadods.com", "en"),
            SingleLang("Manga Drop Out", "https://www.mangadropout.xyz", "id", isNsfw = true),
            SingleLang("MangaEffect", "https://mangaeffect.com", "en"),
            SingleLang("MangaGreat", "https://mangagreat.com", "en"),
            SingleLang("Manga Hentai", "https://mangahentai.me", "en", isNsfw = true),
            SingleLang("Mangakik", "https://mangakik.com", "en"),
            SingleLang("Manga Kiss", "https://mangakiss.org", "en"),
            SingleLang("MangaKomi", "https://mangakomi.com", "en"),
            SingleLang("Manga Land Arabic", "https://mangalandarabic.com", "ar"),
            SingleLang("مانجا ليك", "https://mangalek.com", "ar", className = "Mangalek"),
            SingleLang("MangaLionz", "https://mangalionz.com", "ar"),
            SingleLang("Manga Lord", "https://mangalord.com", "en"),
            SingleLang("Manganelo.link", "https://manganelo.link", "en", className = "ManganeloLink"),
            SingleLang("Manga Nine", "https://manganine.com", "en"),
            SingleLang("Manga-Online.co", "https://www.manga-online.co", "th", className = "MangaOnlineCo"),
            SingleLang("Mangas Origines", "https://mangas-origines.fr", "fr" , true),
            SingleLang("Manga Diyari", "https://manga-diyari.com", "tr", overrideVersionCode = 1),
            SingleLang("MangaRave", "https://www.mangarave.com", "en", overrideVersionCode = 1),
            SingleLang("ManhwaLive", "https://manhwa.live", "en", overrideVersionCode = 1),
            SingleLang("Manga Read", "https://mangaread.co", "en"),
            SingleLang("MangaRead.org", "https://www.mangaread.org", "en", className = "MangaReadOrg"),
            SingleLang("Mangareceh", "https://mangareceh.id", "id"),
            SingleLang("Manga Rock Team", "https://mangarockteam.com", "en"),
            SingleLang("Manga Rocky", "https://mangarocky.com", "en"),
            SingleLang("MangaRoma", "https://mangaroma.com", "en"),
            SingleLang("Manga-Scantrad", "https://manga-scantrad.net", "fr", className = "MangaScantrad"),
            SingleLang("MangaSco", "https://mangasco.com", "en"),
            SingleLang("MangaSpark", "https://mangaspark.com", "ar"),
            SingleLang("Manga Starz", "https://mangastarz.com", "ar"),
            SingleLang("MangaStein", "https://mangastein.com", "tr"),
            SingleLang("Mangasushi", "https://mangasushi.net", "en", overrideVersionCode = 1),
            SingleLang("Manga SY", "https://www.mangasy.com", "en"),
            SingleLang("MangaTeca", "https://www.mangateca.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("Manga Too", "https://mangatoo.com/", "en"),
            SingleLang("Manga Turf", "https://mangaturf.com", "en"),
            SingleLang("MangaTX", "https://mangatx.com", "en"),
            SingleLang("Mangauptocats", "https://mangauptocats.online", "th"),
            SingleLang("MangaUS", "https://mangaus.xyz", "en", overrideVersionCode = 1),
            SingleLang("Manga Weebs", "https://mangaweebs.in", "en", overrideVersionCode = 1),
            SingleLang("MangaWT", "https://mangawt.com", "tr"),
            SingleLang("MangaYaku", "https://mangayaku.com", "id", overrideVersionCode = 1),
            SingleLang("MangaYosh", "https://mangayosh.xyz", "id"),
            MultiLang("Mangazuki.club", "https://mangazuki.club", listOf("ja", "ko"),
                className = "MangazukiClubFactory"),
            SingleLang("Mangazuki.me", "https://mangazuki.me", "en", className = "MangazukiMe", overrideVersionCode = 1),
            SingleLang("Mangazuki.online", "http://mangazukinew.online", "en", className = "MangazukiOnline"),
            SingleLang("Mangceh", "https://mangceh.com", "id", isNsfw = true),
            SingleLang("ManhuaBox", "https://manhuabox.net", "en"),
            SingleLang("Manhua ES", "https://manhuaes.com", "en", overrideVersionCode = 4),
            SingleLang("ManhuaFast", "https://manhuafast.com", "en"),
            SingleLang("Manhuaga", "https://manhuaga.com", "en", overrideVersionCode = 1),
            SingleLang("Manhualo", "https://manhualo.com", "en"),
            SingleLang("Manhua Plus", "https://manhuaplus.com", "en", overrideVersionCode = 3),
            SingleLang("Manhuas.net", "https://manhuas.net", "en", className = "Manhuasnet"),
            SingleLang("Manhuas World", "https://manhuasworld.com", "en"),
            SingleLang("Manhua SY", "https://www.manhuasy.com", "en"),
            SingleLang("ManhuaUS", "https://manhuaus.com", "en", overrideVersionCode = 2),
            SingleLang("Manhwa Raw", "https://manhwaraw.com", "ko"),
            SingleLang("Manhwa18.org", "https://manhwa18.org", "en", isNsfw = true, className = "Manhwa18Org"),
            SingleLang("مانجا العرب", "https://www.manhwa.ae", "ar", className = "ManhwaAe"),
            SingleLang("Manhwatop", "https://manhwatop.com", "en", overrideVersionCode = 1),
            SingleLang("Manwahentai.me", "https://manhwahentai.me", "en", className = "ManwahentaiMe", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Manhwa.club", "https://manhwa.club", "en", className="ManwhaClub", overrideVersionCode = 2), // wrong class name for backward compatibility
            SingleLang("ManyToon", "https://manytoon.com", "en", overrideVersionCode = 1),
            SingleLang("ManyToonClub", "https://manytoon.club", "ko"),
            SingleLang("ManyToon.me", "https://manytoon.me", "en", className = "ManyToonMe", overrideVersionCode = 1),
            SingleLang("Mark Scans", "https://markscans.online", "pt-BR", overrideVersionCode = 1),
            SingleLang("MG Komik", "https://mgkomik.my.id", "id"),
            SingleLang("Midnight Mess Scans", "https://midnightmess.org", "en"),
            SingleLang("Milftoon", "https://milftoon.xxx", "en", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Miracle Scans", "https://miraclescans.com", "en"),
            SingleLang("Mixed Manga", "https://mixedmanga.com", "en"),
            SingleLang("MMScans", "https://mm-scans.com/", "en", overrideVersionCode = 1),
            SingleLang("Mundo Wuxia", "https://mundowuxia.com", "es"),
            SingleLang("Mystical Merries", "https://mysticalmerries.com", "en"),
            SingleLang("Nazarick Scans", "https://nazarickscans.com", "en"),
            SingleLang("NeatManga", "https://neatmanga.com", "en"),
            SingleLang("NekoScan", "https://nekoscan.com", "en", overrideVersionCode = 1),
            SingleLang("Neox Scanlator", "https://neoxscans.net", "pt-BR", overrideVersionCode = 3),
            SingleLang("Night Comic", "https://www.nightcomic.com", "en"),
            SingleLang("Niji Translations", "https://niji-translations.com", "ar"),
            SingleLang("Ninjavi", "https://ninjavi.com", "ar", overrideVersionCode = 1),
            SingleLang("Nitro Scans", "https://nitroscans.com", "en"),
            SingleLang("NovelMic", "https://novelmic.com", "en"),
            SingleLang("Off Scan", "https://offscan.top", "pt-BR", overrideVersionCode = 1),
            SingleLang("مانجا اولاو", "https://olaoe.giize.com", "ar", className = "OlaoeManga"),
            SingleLang("OnManga", "https://onmanga.com", "en"),
            SingleLang("Origami Orpheans", "https://origami-orpheans.com.br", "pt-BR", overrideVersionCode = 1),
            SingleLang("Paean Scans", "https://paeanscans.com", "en"),
            SingleLang("Painful Nightz Scan", "https://painfulnightzscan.com", "en"),
            SingleLang("Platinum Crown", "https://platinumscans.com", "en"),
            SingleLang("Pojok Manga", "https://pojokmanga.com", "id", overrideVersionCode = 1),
            SingleLang("PornComix", "https://www.porncomixonline.net", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Prime Manga", "https://primemanga.com", "en"),
            SingleLang("Projeto Scanlator", "https://projetoscanlator.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("QueensManga ملكات المانجا", "https://queensmanga.com", "ar", className = "QueensManga"),
            SingleLang("Raider Scans", "https://raiderscans.com", "en"),
            SingleLang("Random Translations", "https://randomtranslations.com", "en"),
            SingleLang("RawDEX", "https://rawdex.net", "ko", isNsfw = true),
            SingleLang("Raw Mangas", "https://rawmangas.net", "ja", isNsfw = true, overrideVersionCode = 1),
            SingleLang("ReadManhua", "https://readmanhua.net", "en", overrideVersionCode = 2),
            SingleLang("Renascence Scans (Renascans)", "https://new.renascans.com", "en", className = "RenaScans"),
            SingleLang("Rüya Manga", "https://www.ruyamanga.com", "tr", className = "RuyaManga"),
            SingleLang("S2Manga", "https://s2manga.com", "en"),
            SingleLang("SamuraiScan", "https://samuraiscan.com", "es"),
            SingleLang("Setsu Scans", "https://setsuscans.com", "en"),
            SingleLang("Shield Manga", "https://shieldmanga.club", "en", overrideVersionCode = 2),
            SingleLang("Shinzoo Scan", "https://shinzooscan.xyz", "pt-BR", overrideVersionCode = 2),
            SingleLang("Shooting Star Scans", "https://shootingstarscans.xyz", "en"),
            SingleLang("ShoujoHearts", "https://shoujohearts.com", "en", overrideVersionCode = 1),
            SingleLang("SISI GELAP", "https://sisigelap.club/", "id"),
            SingleLang("SiXiang Scans", "http://www.sixiangscans.com", "en"),
            SingleLang("Siyahmelek", "https://siyahmelek.com", "tr", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Skymanga", "https://skymanga.co", "en", overrideVersionCode = 1),
            SingleLang("Sleepy Translations", "https://sleepytranslations.com/", "en"),
            SingleLang("SocialWeebs", "https://socialweebs.in/", "en"),
            SingleLang("SoloScanlation", "https://soloscanlation.site", "en"),
            SingleLang("Spooky Scanlations", "https://spookyscanlations.xyz", "es"),
            SingleLang("StageComics", "https://stagecomics.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("Sugar Babies", "https://sugarbscan.com", "en"),
            SingleLang("Sweet Time Scan", "https://sweetscan.net", "pt-BR"),
            SingleLang("TheTopComic", "https://thetopcomic.com", "en"),
            SingleLang("365Manga", "https://365manga.com", "en", className = "ThreeSixtyFiveManga"),
            SingleLang("ToonGod", "https://www.toongod.com", "en"),
            SingleLang("Toonily", "https://toonily.com", "en", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Toonily.net", "https://toonily.net", "en", isNsfw = true, className = "ToonilyNet", overrideVersionCode = 1),
            SingleLang("ToonPoint", "https://toonpoint.com", "en"),
            SingleLang("Top Manhua", "https://topmanhua.com", "en"),
            SingleLang("TritiniaScans", "https://tritinia.com", "en", overrideVersionCode = 1),
            SingleLang("TruyenTranhAudio.com", "https://truyentranhaudio.com", "vi", className = "TruyenTranhAudioCom"),
            SingleLang("TruyenTranhAudio.online", "https://truyentranhaudio.online", "vi", className = "TruyenTranhAudioOnline"),
            SingleLang("Tsubaki No Scan", "https://tsubakinoscan.com", "fr"),
            SingleLang("Tsundoku Traduções", "https://tsundokutraducoes.com.br", "pt-BR", pkgName = "tsundokutraducoes", className = "TsundokuTraducoes", overrideVersionCode = 1),
            SingleLang("Türkçe Manga", "https://turkcemanga.com", "tr", className = "TurkceManga"),
            SingleLang("Twilight Scans", "https://twilightscans.com", "en", overrideVersionCode = 1),
            SingleLang("Unemployed Scans", "https://unemployedscans.com", "en"),
            SingleLang("Uyuyan Balik", "https://uyuyanbalik.com/", "tr"),
            SingleLang("Vanguard Bun", "https://vanguardbun.com/", "en"),
            SingleLang("Volkan Scans", "https://volkanscans.com", "en"),
            SingleLang("Wakascan", "https://wakascan.com", "fr"),
            SingleLang("War Queen Scan", "https://wqscan.com", "pt-BR", overrideVersionCode = 1),
            SingleLang("WebNovel", "https://webnovel.live", "en", className = "WebNovelLive", overrideVersionCode = 1),
            SingleLang("WebToonily", "https://webtoonily.com", "en"),
            SingleLang("WebtoonUK", "https://webtoon.uk", "en"),
            SingleLang("WebtoonXYZ", "https://www.webtoon.xyz", "en"),
            SingleLang("WeScans", "https://wescans.xyz", "en"),
            SingleLang("WoopRead", "https://woopread.com", "en"),
            SingleLang("WuxiaWorld", "https://wuxiaworld.site", "en"),
            SingleLang("Yaoi Fan Clube", "https://yaoifanclube.com.br", "pt-BR", isNsfw = true),
            SingleLang("Yaoi Toshokan", "https://yaoitoshokan.net", "pt-BR", isNsfw = true, overrideVersionCode = 2),
            SingleLang("Yokai Jump", "https://yokaijump.fr", "fr"),
            SingleLang("Yuri Verso", "https://yuri.live", "pt-BR", overrideVersionCode = 1),
            SingleLang("Zin Translator", "https://zinmanga.com", "en"),
            SingleLang("ZManga", "https://zmanga.org", "es"),
            SingleLang("Sleeping Knight Scans", "https://skscans.com", "en", overrideVersionCode = 2),
            MultiLang("Leviatan Scans", "https://leviatanscans.com", listOf("en", "es"),
                className = "LeviatanScansFactory", overrideVersionCode = 3),
            SingleLang("Leviatan Scans X", "https://xxx.leviatanscans.com", "en", isNsfw = true),
            SingleLang("Manga1st", "https://manga1st.com", "en"),
            SingleLang("Manga1st.online", "https://manga1st.online", "en", className = "MangaFirstOnline"),
            SingleLang("Imperfect Comics", "https://imperfectcomic.com", "en"),
            SingleLang("Ookamii Manga", "https://manga.ookamii.xyz/", "en"),
            SingleLang("Mortals Groove", "https://mortalsgroove.com", "en"),
            SingleLang("Cervo Scanlator", "https://cervoscan.xyz", "pt-BR", overrideVersionCode = 1),
            SingleLang("Comic Star", "https://comicstar.org", "en"),
            SingleLang("Reset Scans", "https://reset-scans.com", "en", overrideVersionCode = 2),
            SingleLang("XuN Scans", "https://reader.xunscans.xyz", "en"),
            SingleLang("Sani-Go", "https://sani-go.net", "ar", className = "SaniGo"),
            SingleLang("Random Scan", "https://randomscan.online", "pt-BR", overrideVersionCode = 2),
            SingleLang("Fukushuu no Yuusha", "https://fny-scantrad.com", "fr"),
            SingleLang("Three Queens Scanlator", "https://tqscan.com.br", "pt-BR", overrideVersionCode = 1),
            SingleLang("Winter Scan", "https://winterscan.com.br", "pt-BR", overrideVersionCode = 1),
            SingleLang("Little Monster Scan", "https://littlemonsterscan.com.br", "pt-BR", overrideVersionCode = 1),
            SingleLang("Wonderland", "https://landwebtoons.site", "pt-BR", overrideVersionCode = 1),
            SingleLang("Pornwha", "https://pornwha.com", "en", isNsfw = true),
            SingleLang("Wakamics", "https://wakamics.net", "en"),
            SingleLang("Traducciones Amistosas", "https://nartag.com", "es"),
            SingleLang("MangaYami", "https://www.mangayami.club", "en", overrideVersionCode = 1),
            SingleLang("Manga Fenix", "https://manga-fenix.com", "es"),
            SingleLang("Manga Mitsu", "https://mangamitsu.com", "en", isNsfw = true, overrideVersionCode = 1),
            SingleLang("Fudido Scanlator", "https://fudidoscan.com", "pt-BR", isNsfw = true)
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MadaraGenerator().createAll()
        }
    }
}
