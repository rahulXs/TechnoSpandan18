package com.example.streak.technospandan.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.utils.MyAdapter;

/**
 * Created by PIYUSH on 12-03-2018.
 */

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.MyPagerAdapter>{
    String title;
    String technical[] = new String[]{"Air Strike", "Nirmaan", "The Robo Knight", "Robo Race", "Fumes" , "Chemwizz" , "Codetrex","App-athon", "Rule the Sky", "LFR", "Crypto" , "Play with codes", "Electrade", "Electromatrix", "The Junkyard" , "Tatva", "Quiz" , "Startup"};
    //String tlocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String tdates[]= new String[]{"22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018"};
    String tVenu[]= new String[]{"CSE Coridoor Area","Lecture Hall ","OT","OT","MEE Building ","Chemical Building","CSE Lab","IT Building","CSE Cooridate Area","Lecture Hall Complex","CSE Advance Lab","IT Building","ECE Building","ECE Building","Workshop","MSME Building","Lecture Hall","L1"," "," "," "," "};
    String tAbout[] = new String[]{" Rule the unbound sky with the RC Flyer","Ever get fascinated by these excellent pieces of engineering and architecture? If yes, then lets bridge the gap between our knowledge and creativity and show the innovation and the engineer you have in you","The ultimate test of engineering excellence, teamwork, strategy and gaming. You have the chance to combat in the real steel style with your own combatant of steel. Only the toughest and the smartest shall survive! Sparks shall fly and temperature will soar in this battle of metallic knights.","Many of us would have seen humans race against each but what if man made machines race against each. It is indeed fascinating to see those little machines trying to race against each other, overcoming hurdles and finally achieving the glorious. Sounds interesting, Isn’t it ? So let’s try it out... ","Flying Machines fascinate everyone, Don’t they..?? So interested in making one of those balancing flying models..This is your event, people.","Unleash the chem wizard inside you to the full potential and let  your spell free. Use your logical ions to conduct yourself of the prize","  ","  "," Use the very basis of fluid mechanics principles and just make it fly."," Following a set path might seem easy for us, but making those toys of wires and circuits follow a line is indeed quite difficult. And if you think its child’s play, come into the arena show who’s the boss.."," If computer codes fascinates you and encoding and decoding an algorithm is what really interests you,then my friend this is an event for you "," If playing with the codes and knowing how to use them effectively is your cup of tea,then youre definately made for this event","If the world of electrons is your ideal place, then this event is for all those geeky nerds out there. Design your circuit on computer screen win adulation and of course, exciting prizes.","Tickling your brain cells to design an electronic circuit is what gives satisfaction then polish your skills ,revise your stuff to design some mind boggling electronic circuits.","Well, for us engineers nothing is a waste. We know how to make something useful from scrape material and this is exactly what this event is all about – Utilizing waste to materials to make something innovative and interesting.","This event is all about elements and materials present around us. And it will test ones knowledge about those everyday things we see in our surroundings.","The name says it all. One of the most sought after events of technical section of our fest the Quizomania tests ones general knowledge and mental abilities.","Workshop On Startup"};
    String torganiser[] = new String[]{"Avinash Tripathi\nHarshit Verma","Mohd. Ajzal\n Shubendra Singh\nAmit Kanaujia\n Priyesh Singh","Rahul Mauriya\nPratigya Jaiswal\nRahul Gangwar\n Pushkal Pandey","Rahul gaur (MEE) 8439695289\n Anand Patel (MEE) 8931918550\n Anurag Singh (ECE) 9616480578\n Supriya pal (MEE)","Anurag Singh\n Rainy Prajapati\nMansi Singh","Saumya Srivastava\n Deepak\n Vikas Patel\n Chandra Prakash\n Shashank Dubey","Shewta\n Vedant Sharma\n Chaya Gupta","Swastik Sharma(IT) 8417883089\n Saumya Singh (IT)\n Nitin Suman (MEE) 8299189747 \nHarshvardhan (CSE)","Anurag Singh Rajput\n Swastik Sharma\n Saumya Singh\n Nikunj","Harshit Verma\n Shubhankar Verma\n Saumya Sonkar\n Poonam Nishad","Aditya Parashar\n Piyush Sharma\n Himanshu ","Maulik Verma\n Risham Pansari\n Raja Babu\n Abhishek Patel","Akansha Singh\n Yashi Rastogi\n Shivam Singh\n Gaurav Srivatastava\n Mahima Singh","Ashutosh Yadav\n Ananya Panvar\n Akriti Srivatava\n Gaurav Katiyar","Saurav Sharma\n Mudit Pratap Singh\nAtul Yadav\n Arvind","Ajay\n Sonali Johari\n Shakshi \n Ashish Kumar","Mayank Gautam\n Divyansh Kanodiya\n Kriti Singh","Shubham Gupta"};
    String type;

    String cultural[]=new String[]{"AD WAR", "BAND WAR", "OPEN MIC", "THE VOICE", "DANCE FEVER", "PARLIAMENT DIRECT", "ONCE UPON A TIME", "NUKKAD NATAK", "THE STAGE", "JALWA" , "RITAMBHARA", "KISINE KHOOB LIKHA HAI", "SHOWBUZZ", "PIXEL", "STOCK-KING" , "TREASURE HUNT","THE SPELLING BEE"};
    //String clocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String cVenu[] = new String[]{" L8","L1"," L1"," L1"," L1"," L1"," L1"," OT"," L1"," L1"," L1"," L1"," L1","L1","L1","UIET Campus","L1"};
    String cdates[]= new String[]{"22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018"};
    String corganiser[] = new String[]{"Shashank\nAmit Singh","dkjsfhksd","Shalni Shing\n Mohm. Ziya \n Manoj Kumar\n Laraiv Mujeev","Sumit Kumar\n Hasib Alam","Akil Mishra\n Shubhangi Jaiswal\n Amitab Bhachan\n Shalni Chaturvedi","Sameer Shukla\n Diksha\n Rahul Pal","Abhishek Garg\n Tejasva Singh","Pratyksha Pathak\n Shipra Singh\n Rahul Kumar\n Pragati Pandey","Shubham\n Vedant Sharma\n Sitanshu","Rohan Singh\n Rashma Aalam \n Shubhi Verma\n Anushka Singh","dgndgjidj","Neha\n Shashank ","b","Nishar\n Tanuja"," Deepak Dutt\n Sonam Priya Darshi\n Nitin Sehegal","Jaswant\nAjay\nVipul\nShivam","Naman\n Vishal"};
    String cAbout[] = new String[]{"You think you can sell! You think you can convince! Then prove yourself through this event. This event is all about it. Ad War requires the participants to be creative & develop a marketing Strategy for a product. Students will perform an advertisement & thus present their advertising ideas. The best idea will bag the title of AD-KING","Live Rock Band and Live Performances..ARE YOU READY??","You can give witty replies!You can hold a group of people by your words? So welcome to this competition, you\"re indeed tailor made for it. And to those introverts like me, its time to show your peers that you are indeed made for the lime light by competing and winning this competition.","Musical Battle","This event will be organized in three categories, Solo, Duet, and Group where participants will first go through an elimination round (Audition) being judged by the Organizing Team and a Cultural head. ","In this event participants will be given topics on the basis of current political or economical condition. Time span of 20 minutes will be provided to write in favour or against of the provided topic. First chance will be given to the opposition to ask questions in first 1 minute. Then chance to the government will be given to clarify their points convincingly introducing their policies within 2 minutes. After this chance will be given to opposition to counter the government & enquire about required changes.","This event is all about your creativity. Its all about How you can think... What you may think....Every team will be shown some random images & words, related to which story needs to be made in a given span of time.","Street Play at UIET","In this event participants will project their acting skills. Each registered team can have 5-10 participants who have to present 8-12 minutes of moralistic play. The team will best acting skills, moral & closeness to their theme will be awarded.   "," Fashionova It is said that it is important for us to know how to carry ourselves in public with grace and confidence and this event is all about expressing oneself in public.This is the trademark for a successful fashion model and so this event is for our future models who’ll set the stage on fire. Beauty with brains is a rare combination and indeed, difficult to find. So in this event we will be on our quest to find those special ones. Event Structure: Audition will be taken for the students who are willing to participate in this event. Auditions will take place in two rounds. Ramp walk. Quick Introduction General questioning Maximum 12 students will be selected. ","Interested participants are required to go through audition with their poem or shayaris. If they are coming with their self composed poems or shayaris that is perfect otherwise material from other sources can also be considered After audition the selected participants will be allowed to perform in front of judges. Time limit is 6 mins.  "," Interested participants are required to go through audition with their poem or shayaris. If they are coming with their self composed poems or shayaris that is perfect otherwise material from other sources can also be considered After audition the selected participants will be allowed to perform in front of judges. Time limit is 6 mins. "," Make a movie and rock it","Round 1: Students/ participants will have to submit their 5 best stills on the given theme. Round 2: Best 5 participants will be asked instantaneously to click pictures on new provided themes. 20 minutes will be given for 2nd round. Round 2 will be conducted using mobile phone cameras, no editors allowed. Participants have to select their best picture from the collection on the basis of which winner will be decided. ","Well, it is important to know where, what and how to invest something, be it in our own work, in our daily lives or in stock market. And if you really find the process of “Investing” interesting .Then this is the game for you. Playing this game, is all about stocks , market and investment. Where the smart meted out minds, compete against each other to design the most valuable portfolio from the provided stocks through exciting bidding. ","This event will consist of three rounds. Round 1 – 3 clues (1,2,3) Round 2 – 2 clues (4,5) Round 3 – 2 clues (6,7) The clues will have numbers in them. After every round students/team have to meet the event coordinator to verify their clue number before proceeding to the next clue.","Event comprises of four sections : 1) Spell it right (dictation) 2) Jumbled words 3) Combine the roots (In this two roots of different origins are provided with their meanings & one has to combine them to form a word, whose meaning will already be given) 4) Word maze (Hints will be given for rows & columns) Overall time will be allotted will be of 1 hour. A 30 minute allowance is there for participant arrangements, submission alongwith providing some extra time to latecomers."};

    String sports[]=new String[]{"CHECKMATE", "TABLE TENNIS", "BADMINTON", "MARATHON", "BASKETBALL" , "STREET SOCCER" , "CRICKET","COUNTER STRIKE", "NEED FOR SPEED", "TEST YOUR STRENGTH"};
    //String slocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String sVenu[] = new String[]{"IT Building","Multipurpose Hall"," Multipurpose Hall"," Boys Hotel to Lecture Hall"," Stadium"," Stadium"," Stadium"," IT Building"," IT Building"};
    String sdates[]=new String[]{"22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018"};
    String sorganiser[] = new String[]{"Sachin Harsh\n Nikunj Verma\n Satyam Nigam \n Kapil Visvkarma\n Rishab Gupta","Ashutosh Singh\n Arti Gupta\n Annaniya Panwar","Ragvendra\n Abhishek Kumar\n Dharmendra","Ramesh Yadav\n Abhishek Patel","Prashant Singh\n Pankaj\n Jaswant Pal\n Quasim Sami","sdhjflkj","gjkdskg","",""};
    String sAbout[] = new String[]{"Its the game between cheque and chequemate","TABLE TENNIS","Remove the bad in the badminton","Can you run long and fast??","Put the Ball in the basket","Play like Messi show off like Ronaldo","Its Time to Play like God","ISIS Recruiter Wanted!!!!","Have Phenomenal Strenghth?? Come and Test it !!!"};

    public static class MyPagerAdapter extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView mTextView,mTextView2,mTextView3,mTextView4;
        private MyPagerAdapter(View v) {
            super(v);

            mCardView = v.findViewById(R.id.card);
            mTextView = v.findViewById(R.id.about);
       //     mTextView2 =v.findViewById(R.id.location);
            mTextView4=v.findViewById(R.id.date);
            mTextView3=v.findViewById(R.id.organizer);
            mTextView2=v.findViewById(R.id.venue);
        }
    }
    public PagerAdapter(String title,String type) {
        this.title=title;
        this.type=type;
    }



    @Override
    public PagerAdapter.MyPagerAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardn_item, parent, false);
        PagerAdapter.MyPagerAdapter vh = new MyPagerAdapter(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(PagerAdapter.MyPagerAdapter holder, int position) {
        if(type.equalsIgnoreCase("technical")){
        for(int i=0;i<technical.length;i++) {
            if (title.equals(technical[i])) {
                holder.mTextView.setText(tAbout[i]);
                holder.mTextView2.setText(tVenu[i]);
                holder.mTextView3.setText(torganiser[i]);
                holder.mTextView4.setText(tdates[i]);
                break;
            }
        }

        }
        else if(type.equalsIgnoreCase("Cultural")) {
            for (int i = 0; i < cultural.length; i++) {
                if (title.equals(cultural[i])) {
                    holder.mTextView.setText(cAbout[i]);
                    holder.mTextView2.setText(cVenu[i]);
                    holder.mTextView3.setText(corganiser[i]);
                    holder.mTextView4.setText(cdates[i]);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<sports.length;i++) {
                    if (title.equals(sports[i])) {
                        holder.mTextView.setText(sAbout[i]);
                        holder.mTextView2.setText(sVenu[i]);
                        holder.mTextView3.setText(sorganiser[i]);
                        holder.mTextView4.setText(sdates[i]);
                        break;
                    }}
            }

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
