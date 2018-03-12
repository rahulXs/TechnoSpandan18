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
    String tlocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String tdates[]= new String[]{"23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018"};
    String tAbout[] = new String[]{"Rule the unbound sky with the RC Flyer ","Ever get fascinated by these excellent pieces of engineering and architecture? If yes, then lets bridge the gap between our knowledge and creativity and show the innovation and the engineer you have in you","The ultimate test of engineering excellence, teamwork, strategy and gaming. You have the chance to combat in the real steel style with your own combatant of steel. Only the toughest and the smartest shall survive! Sparks shall fly and temperature will soar in this battle of metallic knights.","Many of us would have seen humans race against each but what if man made machines race against each. It is indeed fascinating to see those little machines trying to race against each other, overcoming hurdles and finally achieving the glorious. Sounds interesting, Isn’t it ? So let’s try it out... ","Flying Machines fascinate everyone, Don’t they..?? So interested in making one of those balancing flying models..This is your event, people.","Unleash the chem wizard inside you to the full potential and let  your spell free. Use your logical ions to conduct yourself of the prize","  ","  "," Use the very basis of fluid mechanics principles and just make it fly."," Following a set path might seem easy for us, but making those toys of wires and circuits follow a line is indeed quite difficult. And if you think its child’s play, come into the arena show who’s the boss.."," If computer codes fascinates you and encoding and decoding an algorithm is what really interests you,then my friend this is an event for you "," If playing with the codes and knowing how to use them effectively is your cup of tea,then youre definately made for this event","If the world of electrons is your ideal place, then this event is for all those geeky nerds out there. Design your circuit on computer screen win adulation and of course, exciting prizes.","Tickling your brain cells to design an electronic circuit is what gives satisfaction then polish your skills ,revise your stuff to design some mind boggling electronic circuits.","Well, for us engineers nothing is a waste. We know how to make something useful from scrape material and this is exactly what this event is all about – Utilizing waste to materials to make something innovative and interesting.","This event is all about elements and materials present around us. And it will test ones knowledge about those everyday things we see in our surroundings.","The name says it all. One of the most sought after events of technical section of our fest the Quizomania tests ones general knowledge and mental abilities.","Workshop On Startup"};
    String torganiser[] = new String[]{"Avinash Tripathi\nHarshit Verma","dkjsfhksd","djsjhsdfjks","sjlj","hlele","sdhjflkj","gjkdskg","djgdjd","djgdkg","dgjdkjd","dgndgjidj","ddgfgg","b","fbdbff","fbfdfbdf","fbfbdbgg","trtrrtr","rtrbbdf","gfddhjd","dgvvdgd"," dfgdgdfgg","dgdfdffd ","dgdffdd ","dgfd  fdfd ","dfgdfdf d","dfgfddfdfdf","dfgdgfdf"};
    String type;

    String cultural[]=new String[]{"AD WAR", "BAND WAR", "OPEN MIC", "THE VOICE", "DANCE FEVER", "PARLIAMENT DIRECT", "ONCE UPON A TIME", "NUKKAD NATAK", "THE STAGE", "JALWA" , "RITAMBHARA", "KISINE KHOOB LIKHA HAI", "SHOWBUZZ", "PIXEL", "STOCK-KING" , "TREASURE HUNT","THE SPELLING BEE"};
    String clocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String cdates[]= new String[]{"23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018"};
    String cAbout[] = new String[]{" Remember the famous dialogue of Brad Pitt? Sell me this pen. This event focus on your selling techniques.. ","Ever get fascinated by these excellent pieces of engineering and architecture? If yes, then lets bridge the gap between our knowledge and creativity and show the innovation and the engineer you have in you","The ultimate test of engineering excellence, teamwork, strategy and gaming. You have the chance to combat in the real steel style with your own combatant of steel. Only the toughest and the smartest shall survive! Sparks shall fly and temperature will soar in this battle of metallic knights.","Many of us would have seen humans race against each but what if man made machines race against each. It is indeed fascinating to see those little machines trying to race against each other, overcoming hurdles and finally achieving the glorious. Sounds interesting, Isn’t it ? So let’s try it out... ","Flying Machines fascinate everyone, Don’t they..?? So interested in making one of those balancing flying models..This is your event, people.","Unleash the chem wizard inside you to the full potential and let  your spell free. Use your logical ions to conduct yourself of the prize","  ","  "," Use the very basis of fluid mechanics principles and just make it fly."," Following a set path might seem easy for us, but making those toys of wires and circuits follow a line is indeed quite difficult. And if you think its child’s play, come into the arena show who’s the boss.."," If computer codes fascinates you and encoding and decoding an algorithm is what really interests you,then my friend this is an event for you "," If playing with the codes and knowing how to use them effectively is your cup of tea,then youre definately made for this event","If the world of electrons is your ideal place, then this event is for all those geeky nerds out there. Design your circuit on computer screen win adulation and of course, exciting prizes.","Tickling your brain cells to design an electronic circuit is what gives satisfaction then polish your skills ,revise your stuff to design some mind boggling electronic circuits.","Well, for us engineers nothing is a waste. We know how to make something useful from scrape material and this is exactly what this event is all about – Utilizing waste to materials to make something innovative and interesting.","This event is all about elements and materials present around us. And it will test ones knowledge about those everyday things we see in our surroundings.","The name says it all. One of the most sought after events of technical section of our fest the Quizomania tests ones general knowledge and mental abilities.","Workshop On Startup"};
    String corganiser[] = new String[]{"Avinash Tripathi\nHarshit Verma","dkjsfhksd","djsjhsdfjks","sjlj","hlele","sdhjflkj","gjkdskg","djgdjd","djgdkg","dgjdkjd","dgndgjidj","ddgfgg","b","fbdbff","fbfdfbdf","fbfbdbgg","trtrrtr","rtrbbdf","gfddhjd","dgvvdgd"," dfgdgdfgg","dgdfdffd ","dgdffdd ","dgfd  fdfd ","dfgdfdf d","dfgfddfdfdf","dfgdgfdf"};


    String sports[]=new String[]{"CHECKMATE", "TABLE TENNIS", "BADMINTON", "MARATHON", "BASKETBALL" , "STREET SOCCER" , "CRICKET","COUNTER STRIKE", "NEED FOR SPEED", "TEST YOUR STRENGTH"};
    String slocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String sdates[]= new String[]{"23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018","23-03-2018"};
    String sAbout[] = new String[]{"Its the game between cheque and chequemate","Ever get fascinated by these excellent pieces of engineering and architecture? If yes, then lets bridge the gap between our knowledge and creativity and show the innovation and the engineer you have in you","The ultimate test of engineering excellence, teamwork, strategy and gaming. You have the chance to combat in the real steel style with your own combatant of steel. Only the toughest and the smartest shall survive! Sparks shall fly and temperature will soar in this battle of metallic knights.","Many of us would have seen humans race against each but what if man made machines race against each. It is indeed fascinating to see those little machines trying to race against each other, overcoming hurdles and finally achieving the glorious. Sounds interesting, Isn’t it ? So let’s try it out... ","Flying Machines fascinate everyone, Don’t they..?? So interested in making one of those balancing flying models..This is your event, people.","Unleash the chem wizard inside you to the full potential and let  your spell free. Use your logical ions to conduct yourself of the prize","  ","  "," Use the very basis of fluid mechanics principles and just make it fly."," Following a set path might seem easy for us, but making those toys of wires and circuits follow a line is indeed quite difficult. And if you think its child’s play, come into the arena show who’s the boss.."," If computer codes fascinates you and encoding and decoding an algorithm is what really interests you,then my friend this is an event for you "," If playing with the codes and knowing how to use them effectively is your cup of tea,then youre definately made for this event","If the world of electrons is your ideal place, then this event is for all those geeky nerds out there. Design your circuit on computer screen win adulation and of course, exciting prizes.","Tickling your brain cells to design an electronic circuit is what gives satisfaction then polish your skills ,revise your stuff to design some mind boggling electronic circuits.","Well, for us engineers nothing is a waste. We know how to make something useful from scrape material and this is exactly what this event is all about – Utilizing waste to materials to make something innovative and interesting.","This event is all about elements and materials present around us. And it will test ones knowledge about those everyday things we see in our surroundings.","The name says it all. One of the most sought after events of technical section of our fest the Quizomania tests ones general knowledge and mental abilities.","Workshop On Startup"};
    String sorganiser[] = new String[]{"Avinash Tripathi\nHarshit Verma","dkjsfhksd","djsjhsdfjks","sjlj","hlele","sdhjflkj","gjkdskg","djgdjd","djgdkg","dgjdkjd","dgndgjidj","ddgfgg","b","fbdbff","fbfdfbdf","fbfbdbgg","trtrrtr","rtrbbdf","gfddhjd","dgvvdgd"," dfgdgdfgg","dgdfdffd ","dgdffdd ","dgfd  fdfd ","dfgdfdf d","dfgfddfdfdf","dfgdgfdf"};

    public static class MyPagerAdapter extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView mTextView,mTextView2,mTextView3,mTextView4;
        private MyPagerAdapter(View v) {
            super(v);

            mCardView = v.findViewById(R.id.card);
            mTextView = v.findViewById(R.id.about);
            mTextView2 =v.findViewById(R.id.location);
            mTextView4=v.findViewById(R.id.date);
            mTextView3=v.findViewById(R.id.organizer);
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
                holder.mTextView2.setText(tlocation[i]);
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
                    holder.mTextView2.setText(clocation[i]);
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
                        holder.mTextView2.setText(slocation[i]);
                        holder.mTextView3.setText(sorganiser[i]);
                        holder.mTextView4.setText(sdates[i]);
                        break;
                    }}
            }
        /*
        holder.mTextView.setText(About[position]);
        holder.mTextView2.setText(location[position]);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = mDataset[position];
                    }
        });
        String s=mDataset[mDataset.length-1];
        if(s.equals("Chess"))
            holder.imageView.setImageResource(image[position]);
        else if(s.equals("BasketBall"))
            holder.imageView.setImageResource(image2[position]);
        else if(s.equals("Cricket"))
            holder.imageView.setImageResource(image3[position]);
        else if(s.equals("THE SPELLING BEE"))
            holder.imageView.setImageResource(image4[position]);
        else if(s.equals("Startup"))
            holder.imageView.setImageResource(image5[position]);
        else if(s.equals("TEST YOUR STRENGTH"))
            holder.imageView.setImageResource(image6[position]);
        else if(s.equals("CLOSING CEREMONY"))
            holder.imageView.setImageResource(image7[position]);
*/
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
