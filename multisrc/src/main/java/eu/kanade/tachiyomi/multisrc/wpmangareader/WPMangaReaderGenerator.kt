package eu.kanade.tachiyomi.multisrc.wpmangareader

import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class WPMangaReaderGenerator : ThemeSourceGenerator {

    override val themePkg = "wpmangareader"

    override val themeClass = "WPMangaReader"

    override val baseVersionCode: Int = 6

    override val sources = listOf(

            SingleLang("KomikMama", "https://komikmama.net", "id"),
            SingleLang("MangaKita", "https://mangakita.net", "id"),
            SingleLang("Ngomik", "https://ngomik.net", "id"),
            SingleLang("Sekaikomik", "https://www.sekaikomik.fun", "id", isNsfw = true, overrideVersionCode = 4),
            SingleLang("Davey Scans", "https://daveyscans.com/", "id"),
            SingleLang("TurkToon", "https://turktoon.com", "tr"),
            SingleLang("Gecenin Lordu", "https://geceninlordu.com/", "tr", overrideVersionCode = 1),
            SingleLang("Flame Scans", "https://flamescans.org", "en", overrideVersionCode = 2),
            SingleLang("A Pair of 2+", "https://pairof2.com", "en", className = "APairOf2"),
            SingleLang("PMScans", "https://reader.pmscans.com", "en"),
            SingleLang("Skull Scans", "https://www.skullscans.com", "en"),
            SingleLang("Luminous Scans", "https://www.luminousscans.com", "en"),
            SingleLang("GS Nation", "https://gs-nation.fr", "fr", overrideVersionCode = 1),
            SingleLang("YugenMangas", "https://yugenmangas.com", "es"),
            SingleLang("DragonTranslation", "https://dragontranslation.com", "es", isNsfw = true)
        )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            WPMangaReaderGenerator().createAll()
        }
    }
}
