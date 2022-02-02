/* 
    delegating responsibility to other objects
*/


/*   WE HAVE BETTER OPTION AS KOTLIN NATIVLEY SUPPORTS DELEGATION 

interface Downloader{
    fun download()
}

interface Player{
    fun play()
}


class FileDownloader(private val file: String) : Downloader{
    override fun download(){
        println("$file downloaded")
    }
}

class FilePlayer(private val file: String) : Player{
    override fun play(){
        println("$file playing")
    }
}

class MediaFile(
    private val downloader: Downloader,                 // here inside the mediaFile we are delegating the responsibility to downloader object and player object
    private val player: Player
) : Downloader, Player{

    override fun download(){
        downloader.download()
    }

    override fun play(){
        player.play() 
    }
}

fun main(){
    
    val file: String = "file123.mp4"

    val mediaFile = MediaFile(FileDownloader(file),FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
} 
*/

interface Downloader{
    fun download()
}

interface Player{
    fun play()
}


class FileDownloader(private val file: String) : Downloader{
    override fun download(){
        println("$file downloaded")
    }
}

class FilePlayer(private val file: String) : Player{
    override fun play(){
        println("$file playing")
    }
}

class MediaFile(
    private val downloader: Downloader,                 // here inside the mediaFile we are delegating the responsibility to downloader object and player object
    private val player: Player
) : Downloader by downloader, Player by player

fun main(){
    
    val file: String = "file123.mp4"

    val mediaFile = MediaFile(FileDownloader(file),FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
} 

