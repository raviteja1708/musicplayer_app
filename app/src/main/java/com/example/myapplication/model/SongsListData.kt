package com.example.myapplication.model

class SongsListData {
    private var songsList = arrayListOf<Songs>()

    init {
        songsList.add(Songs("Hare Ram Hare Ram", "Unknown Artist"))
        songsList.add(Songs("Butta Bomma", "Armaan Malik"))
        songsList.add(Songs("Samajavaragamana", "Sid Sriram"))
        songsList.add(Songs("Inkem Inkem Inkem Kaavaale", "Sid Sriram"))
        songsList.add(Songs("Srivalli", "Sid Sriram"))
        songsList.add(Songs("Oo Antava Oo Oo Antava", "Indravathi Chauhan"))
        songsList.add(Songs("Vachadayyo Saami", "Sivam"))
        songsList.add(Songs("Ramuloo Ramulaa", "Anurag Kulkarni"))
        songsList.add(Songs("Mind Block", "Blaaze"))
        songsList.add(Songs("Nee Kallu Choodani", "Sid Sriram"))

        songsList.add(Songs("Yuvathaku Ra", "DSP"))
        songsList.add(Songs("Ala Vaikunta Puramuloo", "Rahul Sipligunj"))
        songsList.add(Songs("Prati Roju", "Sri Krishna"))
        songsList.add(Songs("Kopamga Kopamga", "Armaan Malik"))
        songsList.add(Songs("Pilla Raa", "Anurag Kulkarni"))
        songsList.add(Songs("Dear Comrade Anthem", "Vijay Deverakonda"))
        songsList.add(Songs("Dhoorame", "Karthik"))
        songsList.add(Songs("Nee Satyam", "Karthik"))
        songsList.add(Songs("Yenti Yenti", "Chinmayi"))
        songsList.add(Songs("Ranga Ranga Rangasthalana", "Rahul Sipligunj"))

        songsList.add(Songs("Jai Ho Janatha", "DSP"))
        songsList.add(Songs("Super Machi", "DSP"))
        songsList.add(Songs("Seeti Maar", "DSP"))
        songsList.add(Songs("Swing Zara", "Neha Bhasin"))
        songsList.add(Songs("Saami Saami", "Mounika Yadav"))
        songsList.add(Songs("Bhale Bhale Banjara", "Shankar Mahadevan"))
        songsList.add(Songs("Naguriki", "Anurag Kulkarni"))
        songsList.add(Songs("Chak De Chak De", "Aditya Iyengar"))
        songsList.add(Songs("Rowdy Baby (Telugu)", "Dhanush"))
        songsList.add(Songs("Padara Padara", "Shankar Mahadevan"))

        songsList.add(Songs("Jai Lava Kusa", "DSP"))
        songsList.add(Songs("Pakka Local", "Geetha Madhuri"))
        songsList.add(Songs("Vachadayyo Saami", "Sivam"))
        songsList.add(Songs("Yuvathaku Palikina", "DSP"))
        songsList.add(Songs("Sadda Haq (Telugu)", "Mohit Chauhan"))
        songsList.add(Songs("Top Lesi Poddi", "Sagar"))
        songsList.add(Songs("Blockbuster", "Nakash Aziz"))
        songsList.add(Songs("Down Down", "Thaman S"))
    }
    fun getSongDetails() = songsList
}