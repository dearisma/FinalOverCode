package dea.example.finalovercode.api.models;

public class Tracks {
    int duration,album_id,artist_id,position;
    String name,artis_name,artist_idstr,album_name,license_ccurl,releasedate,album_image,audio,audiodownload,prourl,shorturl,shareurl,image;

    public Tracks(int duration, int album_id, int artist_id, int position, String name, String artis_name, String artist_idstr, String album_name, String license_ccurl, String releasedate, String album_image, String audio, String audiodownload, String prourl, String shorturl, String shareurl, String image) {
        this.duration = duration;
        this.album_id = album_id;
        this.artist_id = artist_id;
        this.position = position;
        this.name = name;
        this.artis_name = artis_name;
        this.artist_idstr = artist_idstr;
        this.album_name = album_name;
        this.license_ccurl = license_ccurl;
        this.releasedate = releasedate;
        this.album_image = album_image;
        this.audio = audio;
        this.audiodownload = audiodownload;
        this.prourl = prourl;
        this.shorturl = shorturl;
        this.shareurl = shareurl;
        this.image = image;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtis_name() {
        return artis_name;
    }

    public void setArtis_name(String artis_name) {
        this.artis_name = artis_name;
    }

    public String getArtist_idstr() {
        return artist_idstr;
    }

    public void setArtist_idstr(String artist_idstr) {
        this.artist_idstr = artist_idstr;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getLicense_ccurl() {
        return license_ccurl;
    }

    public void setLicense_ccurl(String license_ccurl) {
        this.license_ccurl = license_ccurl;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getAlbum_image() {
        return album_image;
    }

    public void setAlbum_image(String album_image) {
        this.album_image = album_image;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getAudiodownload() {
        return audiodownload;
    }

    public void setAudiodownload(String audiodownload) {
        this.audiodownload = audiodownload;
    }

    public String getProurl() {
        return prourl;
    }

    public void setProurl(String prourl) {
        this.prourl = prourl;
    }

    public String getShorturl() {
        return shorturl;
    }

    public void setShorturl(String shorturl) {
        this.shorturl = shorturl;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
