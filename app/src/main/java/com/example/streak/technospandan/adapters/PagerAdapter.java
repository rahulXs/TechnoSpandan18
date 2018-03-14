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
import android.widget.Toast;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.utils.MyAdapter;

/**
 * Created by PIYUSH on 12-03-2018.
 */

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.MyPagerAdapter>{
    String title;
    String technical[] = new String[]{"AIR STRIKE", "NIRMAAN", "THE ROBO KNIGHT", "ROBORACE", "FUMES" , "CHEMWIZZ" , "CODETREX","APP-ATHON", "RULE THE SKY", "LFR", "CRYPTO" , "PLAY WITH CODES", "ELECTRADE", "ELECTROMATRIX", "THE JUNKYARD" , "TATVA", "QUIZ" , "STARTUP"};
    String type;
    //String tlocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String tdates[]= new String[]{"22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018"};
    String tVenu[]= new String[]{"CSE Coridoor Area","Lecture Hall ","OT","OT","MEE Building ","Chemical Building","CSE Lab","IT Building","CSE Cooridate Area","Lecture Hall Complex","CSE Advance Lab","IT Building","ECE Building","ECE Building","Workshop","MSME Building","Lecture Hall","L1","... ","... ","... ","... ","... ","... ","... "};
    String tAbout[] = new String[]{" Rule the unbound sky with the RC Flyer"
            ,"Ever get fascinated by these excellent pieces of engineering and architecture? If yes, then lets bridge the gap between our knowledge and creativity and show the innovation and the engineer you have in you","The ultimate test of engineering excellence, teamwork, strategy and gaming. You have the chance to combat in the real steel style with your own combatant of steel. Only the toughest and the smartest shall survive! Sparks shall fly and temperature will soar in this battle of metallic knights.","Many of us would have seen humans race against each but what if man made machines race against each. It is indeed fascinating to see those little machines trying to race against each other, overcoming hurdles and finally achieving the glorious. Sounds interesting, Isn’t it ? So let’s try it out... ","Flying Machines fascinate everyone, Don’t they..?? So interested in making one of those balancing flying models..This is your event, people.","Unleash the chem wizard inside you to the full potential and let  your spell free. Use your logical ions to conduct yourself of the prize","  ","  "," Use the very basis of fluid mechanics principles and just make it fly."," Following a set path might seem easy for us, but making those toys of wires and circuits follow a line is indeed quite difficult. And if you think its child’s play, come into the arena show who’s the boss.."," If computer codes fascinates you and encoding and decoding an algorithm is what really interests you,then my friend this is an event for you "," If playing with the codes and knowing how to use them effectively is your cup of tea,then youre definately made for this event","If the world of electrons is your ideal place, then this event is for all those geeky nerds out there. Design your circuit on computer screen win adulation and of course, exciting prizes.","Tickling your brain cells to design an electronic circuit is what gives satisfaction then polish your skills ,revise your stuff to design some mind boggling electronic circuits.","Well, for us engineers nothing is a waste. We know how to make something useful from scrape material and this is exactly what this event is all about – Utilizing waste to materials to make something innovative and interesting.","This event is all about elements and materials present around us. And it will test ones knowledge about those everyday things we see in our surroundings.","The name says it all. One of the most sought after events of technical section of our fest the Quizomania tests ones general knowledge and mental abilities.","Workshop On Startup","..","..",".."};
    String torganiser[] = new String[]{"Harshit Verma (CSE) 9696621616\n" +
            "Avinash Tripathi (CSE) 7754884497"
            ,"Mohd Afzal (9565045929)\n" +
            "Shubhendra Singh Bhadauriya (9450553257)\n" +
            "Amit Kannaujia (7355481135)\n" +
            "Priyesh Singh (8874398822) "
            ,"Rahul Maurya (MEE) 8808767501\n" +
            "• Pratigya Jaiswal (MEE)\n" +
            "• Atul Yadav (MEE) 8317078435 "
            ,"Rahul gaur (MEE) 8439695289\n Anand Patel (MEE) 8931918550\n Anurag Singh (ECE) 9616480578\n Supriya pal (MEE) "

            ,"Anurag Singh (MEE) 8574371923\n" +
            "• Rainy Prajapati (MEE)\n" +
            "• Mansi Singh (CHE)\n" +
            "• Shivam Kumar (MEE) 8009637094"
            ,"Somya Srivastava (CHE)\n" +
            "• Deepak (CHE) 8800103146\n" +
            "• Vikas Patel (CHE) 8127116453\n" +
            "• Chandra Prakash (CHE) 8574203925\n" +
            "• Shashank Dubey (CHE) "

            ,"Shubhi Verma (CSE)\n" +
            "• Shivangi Gupta (CSE)\n" +
            "• Shubham Verma (CSE) 9457913530\n" +
            "• Rudra Ghosh (CSE) "

            ,"Vedant (CSE) +91 95575 87232\n" +
            "Chhaya Gupta (IT)\n" +
            "Shweta (CSE) 9695084650"
            ,"Swastik Sharma(IT) 8417883089\n Saumya Singh (IT)\n Nitin Suman (MEE) 8299189747\n Harshvardhan (CSE) "
            ,"Harshit Verma (CSE) 9696621616\n" +
            "• Shubhanshu Verma (CSE) 8574965908\n" +
            "• Saumya Sonkar (IT)\n" +
            "• Poonam Nishad (IT) "

            ,"Himanshu (CSE)\n" +
            "Aditya Parasar (CSE) 8865009044\n" +
            "Piyush Sharma (CSE)\n" +
            "Shivani Gupta(CSE) "

            ,"Maulik Verma (IT)\n" +
            "• Risham Pansari (IT) 9415533435\n" +
            "• Raja Babu (IT)\n" +
            "• Abhishek Patel (IT) "

            ,"Akanksha Singh (ECE)\n" +
            "• Akriti Srivastava (ECE)\n" +
            "• Nitish Singh (ECE) 7355437239\n" +
            "• Gaurav Srivastava (ECE) 8299708469\n" +
            "• Mahima Singh (ECE) "

            ,"Gaurav Katiyar (ECE) 7355928058\n" +
            "• Ashutosh Yadav (ECE) 9451671299\n" +
            "• Ananya Panwar (ECE)\n" +
            "• Yashi Rastogi (ECE)\n" +
            "• Shivam Singh (ECE) "

            ,"Saurabh Sharma (MEE) 8577088784\n" +
            "• Rahul Gangwar (MEE) 7398696337\n" +
            "• Mudit Pratap Singh (MEE) 9415423827\n" +
            "• Arvind (MSME)\n" +
            "• Sandeep Vishwakarma (MEE) 8853013361 "

            ,"Ajay (MSME)\n" +
            "• Sakshi (MSME)\n" +
            "• Sonali Johri (MSME)\n" +
            "• Ashish Kumar (MSME)\n" +
            "• Ajay (msme) 8052426163 "

            ,"• Saurav Gautam ( MSME) 7007896976\n" +
            "• Pushkal Pandey (CSE) 8090113467\n" +
            "• Mayank Gautam (ECE) 9721262240 "

            ,"Gaurav Porwal(8791009125)\n Sheetal Srivastava"

            ,"Anubhav Bajpeyee(9621674729)\n" +
            "Rajat Srivastava(8924996557)\n" +
            "Mohd Owais Naim (8303825201) "

            ,"Divyansh Kanodia (8808816065)\n" +
            "Kriti Singh\n" +
            "Anuj Tripathi (9454119305) "};
    String tEntryFee[]=new String[]{"Rs 300 including Workshop"
            ,"Rs 40 per head"
            ,"Rs 350 / team"
            ,"Rs 300 per team"
            ,"Rs 160 per team"
            ,"120 per group"
    ,"₹ 30/- participant"
    ," Rs 50 / team.\n"
    ,"₹ 40/- per head"
    ,"Rs 550, Rs 50"
    ,"Rs. 30\n"
    ,"Free"
    ," ₹40/ participant"
    ,"₹40/ participant."
    ,"Rs 40 per person"
    ,"check rules"
    ,"50 per head"
    ,"Rs.50 per head\n"

    ,"Rs.30\n"

    ,"₹40/- per member"};
    String tRules[]=new String[]{"Based on designing concepts of Aero Modelling"
            ,"Event Structure: The event will be conducted in 3 stages\n" +
            "1. Written Test: Time – 45 minutes Total marks – 30 In written test only two members of a team are allowed. Test will contain questions related to basic mechanics, history of different bridges and aptitude 8 teams will qualify for next round\n" +
            "2. Construction of bridge : The bridge is to be made by the materials provided Duration : 3 hours (max.) Venue : Below L1\n" +
            "3. Testing of Bridge : Finally the bridge will be tested in judged by faculty members. The bridge design which bears all the applied load wins.\n"
    ,"Task:\n" +
            "Design and construct a manually controlled wired or wireless robot that can destroy the bots of your opponents or can throw their bots out of the arena.\n" +
            "Robot Specifications:\n" +
            "1. The bot should completely fit in a box of dimensions 45cm X 40cm X 30cm (l X b X h) at the start of each round. The size of external controller used to control the machine is not included in this size constraint.\n" +
            "2. The maximum weight of the robot can be 13 kg.\n" +
            "3. The bot can be controlled by a wireless or a wired remote.\n" +
            "4. In case of a wired remote, the robot should have a pipe supporting the wires, so that the wires are not damaged by opponent bot. Minimum height of the pipes needs to be 60cm from the ground. The wires should be of sufficient length to cover the arena.\n" +
            "5. In case of wireless remote, the power supply should be on the bot itself.\n" +
            "6. The power supply on the bot will be counted in its weight.\n" +
            "7. Maximum voltage used by robot is 36 volts.\n" +
            "8. Bot can use any kind of magnetic weapons, spinning weapons, cutters, flippers, saws, lifting devices, spinning hammers , metal contraptions with spikes, circular saws, maces, cutters, flippers, drills, hammer, metallic armor and shield, high power magnet and electro -magnet, etc.\n" +
            "Arena:\n" +
            "1. The size of the square arena (grey color) is 8ft*8ft (l X b).\n" +
            "2. The arena will have walls of height 20cm and their will be gates in between each wall. The length of the gates wills 5ft.\n" +
            "3. The height of stage is 15cm and length breath is 90*55(l*b).\n" +
            "4. For more details see figure.\n" +
            "Game Play:\n" +
            "1. The most important rule is destroy the opponent bot.\n" +
            "2. The competition will be a knockout tournament consisting of elimination and finals.\n" +
            "3. There is two round of 4-4 min.\n" +
            "4. Two bots will compete with each other in each round.\n" +
            "5. Each round can last maximum of 4 minutes.\n" +
            "6 . The bots will try to either push the opponent bot out of the arena through gates or pit, or immobilize the opponent bot.\n" +
            "7. he weapon will be used after 2 minutes in first round and after 1 minute in second round.\n" +
            "General Rules:\n" +
            "1. Participants are not allowed to put anything inside the arena other than the bot.\n" +
            "2. In case of any disputes/discrepancies the organizers decision will be final and binding.\n" +
            "3. The organizers reserve the rights to change any or all of the above rules as they deem fit. Change in rules, if any will be highlighted on the website and notified to the registered teams. "
    ,"RULES & REGULATIONS: ∙ Maximum Members in a team : 5 ∙ Each member from same college is mandatory ∙ The robot should follow the robot specifications provided. Any deviation from the mentioned specifications will lead to disqualification. ∙ Once the race begins maximum 4 hand touches are allowed and on using those you have to start from the last check point. ∙ Only DC motors can be used, maximum 12V for each motor. ∙ The arena may subject to change before the commencement of any round. ∙ The decision of the coordinators will be final and abiding in case of any dispute.\n" +
            "ROBOT SPECIFICATIONS : ∙ Dimensions : 25×25×25 ( in cms)[max] 20×20×20(in cms)[min] ∙ Net weight should not exceed 4kgs. ∙ A tolerance of 5% is acceptable. ∙ Wired or wireless robots are allowed.\n" +
            "GENERAL RULES : ∙ The structure of the robot should not be changed during the competition. ∙ During the game play , if any part of a robot is destructed\\dismantled\\damaged the participant will be given a time out to repair at an expense of a penalty. ∙ If the robot by chances falls from the bridge, the robot will be kept back to the previous checkpoint crossed with a penalty. ∙ No readjustment is allowed during the run. ∙ Hand , robot enmesh and robot fall all penalties will be announced at the time of event. ∙ Arena will be released at the time of event.\n"
    ,"Team Members – 4 members per team\nThe event will be conducted in only one round. The participants have to lift the hovercraft and take it on a straight path. The participants will be given a workshop before the event so that they can get an idea about how to make the hovercraft After teams have showcased the hovercraft in action , a viva will take place by judges. The team that secures the highest marks wins. Also the participants must keep the cost of the hovercraft as nominal as possible. "
    ,"One group has maximum 2 or 3 members\n" +
            "Day 1 : Quiz will be conducted of 50 marks, in which maximum questions will be based on chemistry and the rest will be on aptitude.\n" +
            "Day 2 : Qualified groups will present a paper presentation on a chosen topic in front of the judges. Marks will be distributed on different parameters.\n"
    ,"Event Structure: It is a multi round event , in which 1st round is a quiz round where student are judged on the basis of basic knowledge of computer fundamentals and c programming. For every wrong answer there would be negative marking . Selection of students for 2nd round would be based on their marks scored in the 1st round . 2nd round is a programming contest which aims at testing participant’s problem solving skills and knowledge of algorithms . Winner will be decided on the basis of their performance in the 2nd round.\n" +
            "\n" +
            "Rounds : Event has two rounds.\n" +
            "No of participants :Team of two members.\n" +
            "Difficulty: Difficulty level for 1st & 2nd year students is different.\n"
    ,"• Students have to create android or iOS based application based on the theme of our fest or any other great idea.\n" +
            "• They will be given a time of 14 days for this.\n" +
            "• Team of 3\n" +
            "• Open to all\n" +
            "• Top 3 applications will be hosted on a server and will also be presented in the inauguration. "
    ,"Event Structure: It is a multi round event , in which 1st round is hitting the target round where student are judged and marked on the basis of the performance of hitting the best position on target . Selection of students for 2nd round would be based on their marks scored in the 1st round .\n" +
            "2nd round is a time of flight round where contestants are judged on the basis of minimum time of flight of parachute . Winner will be decided on the basis of their performance in the 2nd round.\n" +
            "Rounds:This Event has two rounds.\n" +
            "No of participants:Team of 3 to 4 members"
    ,"Registration Fee : 550 per head (for those who register for workshop) , 50 per head ( for those who don\"t attend workshop) LFR workshop will be provided. Date for workshop is 17 and 18 March, 2018\n" +
            "Team members : 4 ( Max.)\n" +
            "Event Structure: LFR will be conducted in two rounds 1st round will be a qualifying round. Participants will move their robot along the line thorough the arena. The teams that finish in less time qualify for the next round. 2nd round will be the final round. Participants will be judged on the basis of time and how they they tackle the obstacles. The team that finishes in least time wins.\n"

    ,"Event Structure:This event will contain answer for a certain question and the contestants will have to guess the best question. The best question which is most probable to the actual question will be selected\n" +
            "Round 1: • Different questions for first and second year\n" +
            "• Only Subjective questions\n" +
            "• Top 10 from first year and top 10 from second year\n" +
            "• Duration : 2 hours for 15-20 questions\n" +
            "Round 2: • Some codes will be given and the participants will have identify what the code is for\n" +
            "• Top 2 from first year and top 2 from second year\n" +
            "• Duration : 1.5 hours for 10-15 questions\n"

    ,"Structure: The entire event is an online coding event managed and organized in association with Codechef. Also, the prizes and goodies will be given by Codechef. No need of any venue as the event is an online event.\n"

    ,"Event Structure: This is the multiple round ‘on the spot’ event, in which 1st round is a theoretical MCQ test based on electronics & aptitude and every correct answer earns the participant a virtual money. Using this money participants will move in further rounds, where they will buy components and make the listed electronic circuits on bread board in a given time. Once a team completes the circuit , it can then sell the circuit, in return of more virtual money. A team can again buy new components and build a new circuit and sell it to earn the money. The team which has the maximum money at the end of predefined time is winner.\n" +
            "Rounds:Event has two rounds.\n" +
            "No of participants:Team of two members.\n" +
            "Difficulty:Difficulty level for 1st & 2nd year students is different. "

    ,"This is event will have two rounds, in which the 1st round will consist of objective type questions testing the participant’s knowledge on basic electronics & aptitude. According to the scores secured in the first round, 8 teams will qualify for the 2nd round. The 2nd round will test the software skills of the team in which the participants will be designing circuits on NI-MultiSim Software. The first team to design the correct circuit will be declared as the winner. The participants are expected to have some prior knowledge about working on the NI-MultiSim Software. Nevertheless the qualifying teams of the 1stroundwill be given a short tutorial teaching them about the software.\n" +
            "• Event has two rounds.\n" +
            "• Team of two members.\n" +
            "• Difficulty level for 1st & 2nd year students is different. "

    ,"Well, for us engineers nothing is a waste. We know how to make something useful from scrape material and this is exactly what this event is all about –Utilizing waste to materials to make something innovative and interesting. TechnoSpandan 18 gives you a wonderful opportunity to showcase your waste management skills and unleash the Engineer in you for the betterment of mankind.\n" +
            "\n" +
            "Registration Fee : Rs 40 per person One Group consists of 5 to 6 members. Participating groups have to make working model from the things given to them. No group is allowed to take any other things other than the things provided to them.\n" +
            "Timing – 2 to 4 pm\n" +
            "Venue – workshop After completion of project students will be present them in front of the judges. The judges will unanimously decide the winner.\n"

    ,"No. Of Rounds :\n" +
            "1) Elimination Round: This round will be a objective question paper roun.\n" +
            "2) Final Round: This round will have 3 sections namely:-\n" +
            "-Ques/Answer Round\n" +
            "-Define the picture\n" +
            "-choose the box and answer us\n" +
            "\n" +
            "Time Utilized :\n" +
            "1)first round will require 1 hour.\n" +
            "2)second round would take 1 hour and 30 minute.\n" +
            "\n" +
            "Registration fee:- for team of 2 charge would be 90 Rs.\n" +
            "- for team of 3 charge would be 130 Rs. "

    ,"Rules and regulations : 1. Participation is restricted to a team of 2 or less people. Cross college teams are allowed\n" +
            "2. The quiz consists of a written elimination round followed by on stage finals for 6 qualifying teams.\n" +
            "3. The finals structure will be decided by the quizmaster\n" +
            "4. The decision of the quizmaster will be final and binding "
    ,"First round: In this around the participants will have to submit an abstract of 500 words explaining their ideas and its viability.\n" +
            "Second round: In this round the shortlisted contestants will have to explain theirs ideas through a power point presentation of about 8-10 minutes.\n" +
            "No. of Participants: Maximum two participants can be in one team\n"

    ,"Event Description:\n" +
            "First round: It will comprise of a general question about life followed by a session of Group Discussion.\n" +
            "Second round: The shortlisted students will be called for personal interview.\n" +
            "No. Participants: Individual Event\n"

    ,"\n" +
            "The event comprises of two rounds.\n" +
            "The participants will form a team of 2, the fee being ₹40/- per member.\n" +
            "First round would be preliminary round having a general paper on aptitude analysis.\n" +
            "Teams selected through preliminary round would enter into next phase, that would be a surprise round.\n" +
            "Prize money:- Depends on no of participation."};

    String cultural[]=new String[]{"AD WAR", "OPEN MIC", "THE VOICE", "DANCE FEVER", "PARLIAMENT DIRECT", "ONCE UPON A TIME", "NUKKAD NATAK", "THE STAGE", "FASHIONOVA" , "KISINE KHOOB LIKHA HAI", "SHOWBUZZ", "PIXEL", "STOCK-KING" , "TREASURE HUNT","THE SPELLING BEE"};
    //String clocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String cVenu[] = new String[]{" L8","L1"," L1"," L1"," L1"," L1"," L1"," OT"," L1"," L1"," L1"," L1"," L1","L1","L1","UIET Campus","L1"};
    String cdates[]= new String[]{"22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018"};
    String corganiser[] = new String[]{"Shashank 9169379783\nAmit Singh 7678983861\nShivam Kumar 7080773143"

            ,"Shalini Singh\n" +
            "Mohd. Ziya (8574661156)\n" +
            "Manoj Kumar (8004973223)\n" +
            "Laraib Mujeeb (8299371557) "

            ,"Sumit Kumar 7071990902\n Haseeb Alam 9580365233"

            ,"Akil Mishra 8563079551\n Shubhangi Jaiswal\n Amitabh Singh 8532826584\n Shalini Chaturvedi"

            ,"Sameer (9793266226)\n" +
            "Deeksha (7651917006)\n" +
            "Rahul Pal (9005853722) "

            ,"Abhishek Garg (7310898869) Tejasva Singh (7844907434) "

            ,"Pratyksha Pathak (8601114060)\n Shipra Singh\n Rahul Kumar (9565063694)\n Pragati Pandey (7309676710)"

            ,"Shubham (9012770552)\n Vedant (9557587232)\n Sitanshu (7007319479) "

            ,"Rohan Singh (7309400273)\n Ramsha Alam (7081790193)\n Shubhi Verma\n Anushka Singh "

            ," Neha (8563087397)\n Shashank (9936285446) "

            ,"Garima Singh 9682412073\n" +
            "Sudhansu Kushwaha 8948623767"
            ,"Nisar (8787288870)\n Tanuja (9696671851)"
            ,"Deepak Dutt (7417867769)\n Sonam Priyadarshi (9519876471)\n Nitin Sehgal (9756094266)"
            ,"Jaswant (8081830815)\n Ajay (9457305942)\n Vipul (9118505814)\n Shivam (7408269555) "
            ,"Naman (8299807952)\n Vishal (8299846360) "
            ,""};
    String cAbout[] = new String[]{"You think you can sell! You think you can convince! Then prove yourself through this event. This event is all about it. Ad War requires the participants to be creative & develop a marketing Strategy for a product. Students will perform an advertisement & thus present their advertising ideas. The best idea will bag the title of AD-KING"

            ,"You can give witty replies!You can hold a group of people by your words? So welcome to this competition, you\"re indeed tailor made for it. And to those introverts like me, its time to show your peers that you are indeed made for the lime light by competing and winning this competition."

            ,"Musical Battle"

            ,"Dance Fever"

            ,"Parliament Direct"
            ,"This event is all about your creativity. Its all about How you can think... What you may think....Every team will be shown some random images & words, related to which story needs to be made in a given span of time."

            ,"Street Play at UIET"

            ,"Acting Skill"
            ," Fashionova It is said that it is important for us to know how to carry ourselves in public with grace and confidence and this event is all about expressing oneself in public.This is the trademark for a successful fashion model and so this event is for our future models who’ll set the stage on fire. Beauty with brains is a rare combination and indeed, difficult to find. So in this event we will be on our quest to find those special ones. "

            ,"Mijaaz hua Shayarana"

            ," Make a movie and rock it"

            ,"Photo Story"
            ,"Well, it is important to know where, what and how to invest something, be it in our own work, in our daily lives or in stock market. And if you really find the process of “Investing” interesting .Then this is the game for you. Playing this game, is all about stocks , market and investment. Where the smart meted out minds, compete against each other to design the most valuable portfolio from the provided stocks through exciting bidding. "

            ,"Go for Adventure"
            ,"A competition in which contestants have to spell a broad selection of words"};
    String cEntryFee[]=new String[]{"Rs 30","Rs 30","Rs 30","Rs 50/head \nRs 30 in group of 3 or more"

    ,"Rs 40 per head","Rs 30 per head where every team can comprise of maximum two members"
    ,"Rs 40 per head"
    ,"Rs 30 per member"
    ,"Rs 50"
    ,"Rs 30"
    ,"Rs 150 per team"
    ,"Rs 30 per head"
    ,"Rs 30 per head"
    ,"Rs 30 per head"
    ,"Rs 30 per head"};
    String cRules[]=new String[]{"No. of Participants : 3-6 Round 1: Ad Test This round will serve the purpose of testing the general awareness of common brand taglines of the participants. Only 2 members are allowed from each team. Round 2: Sell YOUR Product The advanced teams will be given 3 minutes on stage to sell their own predecided product through a prepared advertisement. Round 3: Sell OUR Product Team selected from the round 2 will now be vying for the top honours & would be given 20 minutes to make an advertisement on the product given by the event coordinators. Winners will be declared after this round. "

    ,"The event comprises of two rounds:\n" +
            "Round 1:\n" +
            "Preliminary Round In this round the interested participants will be asked to present a piece of their writing on the basis of which the selected participants will be allowed for the next round. Round 2:\n" +
            "On Stage In this round, winners will be declared on the basis of their complete performance, content & expressions. The decision of judges will be final."

    ,"Levels of battle The First level – all the participants will perform on stage. After the elimination, qualified participants will go on to the second level. The Second level - after performing, further elimination will take place and qualified participants will proceed to the third level. The Third level – this will be the final round, after which the winners will be declared. "

    ,"This event will be organized in three categories, Solo, Duet, and Group where participants will first go through an elimination round (Audition) being judged by the Organizing Team and a Cultural head. "

    ,"In this event participants will be given topics on the basis of current political or economical condition. Time span of 20 minutes will be provided to write in favour or against of the provided topic. First chance will be given to the opposition to ask questions in first 1 minute. Then chance to the government will be given to clarify their points convincingly introducing their policies within 2 minutes. After this chance will be given to opposition to counter the government & enquire about required changes."

    ,"Nil"
    ,"The theme of the street play should be socially relevant and highlight social issues. ● Maximum allowed time - 10-12 mins ● Team members allowed - 7-12 ● The costume and props are allowed. ● Theme and an abstract must be submitted in written to the organizer prior to the event. ● Organizing committee reserves the right to change the venue, time and rules if desired "
    ,"In this event participants will project their acting skills. Each registered team can have 5-10 participants who have to present 8-12 minutes of moralistic play. The team will best acting skills, moral & closeness to their theme will be awarded.   "

    ,"Event Structure: Audition will be taken for the students who are willing to participate in this event. Auditions will take place in two rounds. Ramp walk. Quick Introduction General questioning Maximum 12 students will be selected. "
    ,"Interested participants are required to go through audition with their poem or shayaris. If they are coming with their self composed poems or shayaris that is perfect otherwise material from other sources can also be considered After audition the selected participants will be allowed to perform in front of judges. Time limit is 6 mins.  "
    ,"The participants are required to shoot, direct and act in a short movie serving a noble cause that will be projected in front of an audience comprising of young students. The creativity and director skills in the movie will decide the winner. "
    ,"Round 1: Students/ participants will have to submit their 5 best stills on the given theme. Round 2: Best 5 participants will be asked instantaneously to click pictures on new provided themes. 20 minutes will be given for 2nd round. Round 2 will be conducted using mobile phone cameras, no editors allowed. Participants have to select their best picture from the collection on the basis of which winner will be decided. "
    ,"Event Structure: This is a single round event where teams will be given a certain amount of virtual currency at the beginning of the contest. Companies will be listed with a certain rating value & base price & auction of that company will start off between the teams. Naturally team with highest bid gets to keep the company. Teams having zero companies at the end of the first fifteen minutes would be disqualified from the event. At the end of the bidding round the team with the highest number of rating points will be declared a winner. "
    ,"This event will consist of three rounds. Round 1 – 3 clues (1,2,3) Round 2 – 2 clues (4,5) Round 3 – 2 clues (6,7) The clues will have numbers in them. After every round students/team have to meet the event coordinator to verify their clue number before proceeding to the next clue."
    ,"Event comprises of four sections : 1) Spell it right (dictation) 2) Jumbled words 3) Combine the roots (In this two roots of different origins are provided with their meanings & one has to combine them to form a word, whose meaning will already be given) 4) Word maze (Hints will be given for rows & columns) Overall time will be allotted will be of 1 hour. A 30 minute allowance is there for participant arrangements, submission alongwith providing some extra time to latecomers."};



    String sports[]=new String[]{"CHECKMATE", "TABLE TENNIS", "BADMINTON", "MARATHON", "STREET SOCCER" ,"LAN GAMING"};
    //String slocation[] = new String[]{" 7 PM - 9 PM ","10 AM - 12 PM "," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"," 10 AM - 2 PM"};
    String sVenu[] = new String[]{"IT Building","Multipurpose Hall"," Multipurpose Hall"," Boys Hotel to Lecture Hall"," Stadium"," IT Building"};
    String sdates[]=new String[]{"22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018","22-03-2018"};
    String sorganiser[] = new String[]{"Sachin Harsh 8299877796\n Nikunj Verma 9140764631\n Satyam Nigam 9936053575\n Kapil Visvkarma 7678967335\n Shweta Kumari"

            ,"Rishabh Gupta(MEE) +91 78 60 194659 "



            ,"Ashutosh Singh(ECE) +91 94 51 671299\n" +
            "Arti gupta (MEE)\n" +
            "Ananya Panwar(ECE)"

            ,"Raghvendra 8896990933\n Abhishek Kumar 8004744806\n Dharmendra"

            ,"Prashant Singh 7054133541\n Pankaj 9956242879\n Jaswant Pal 8081830815\n Quasim Sami 8853868193"

            ,"Shubham Vishwakarma 7785076362"};
    String sAbout[] = new String[]{"The chessboard is the world, the piece are the phenomenon of the universe.","TABLE TENNIS","Remove the bad in the badminton","Can you run long and fast??","Street Soccer","LAN GAMING"};
    String sEntryFee[]= new String[]{"Rs 30","Rs 30"," Rs 40"," Rs 30"," Rs 250 per team","Rs 30 per game"};
    String sRules[]= new String[]{"ELIMINATION ROUND:\n" +
            "1. This round will be of 20 minutes.\n" +
            "2. Each player will be given 30 seconds for his move, if he fails, +1 will be awarded to the opponent.\n" +
            "3. Player with the maximum points at the end of the game will be chosen as the winner.\n" +
            "After each round the players for the next round will be selected by random draw.\n" +
            "SEMI-FINAL & FINAL ROUND:\n" +
            "1. This round will be of 25 minutes.\n" +
            "2. Each player will be given 30 seconds for his move, if he fails, +1 will be awarded to the opponent.\n" +
            "3. Player with the maximum points at the end of the game will be chosen as the winner.\n" +
            "Chess piece relative value:\n" +
            "1. Pawn - 1\n" +
            "2. Knight- 4\n" +
            "3. Bishop- 3\n" +
            "4. Rook- 5\n" +
            "5. Queen- 9"

            ,"1. Each game will be played for 15 points.\n" +
            "2. The edges of the table are part of the table surface.\n" +
            "3. If the ball touches the top of the net and goes over and onto the table, there will be no point scored and the server will serve again.\n" +
            "4. Each player will serve 2 points alternately.\n" +
            "5. If a game reaches 14 all, each player serves 1 point alternately until the game is won by 2 clear points.\n" +
            "6. A point will be lost if a player fails to hit the ball onto their opponents side."

            ,"1. Each game will be played for 7 points.\n" +
            "2. Player will score a point at the end of each rally.\n" +
            "3. At the beginning of the game (0-0) and when the server’s score is even, the server serves from the right service court. When the server’s score is odd, the server serves from the left service court.\n" +
            "4. It is not a fault if you miss the shuttle while serving.\n" +
            "5. The faults in the game will be when:\n" +
            "• The shuttle does not land in the correct service court.\n" +
            "• A serve or shot that lands outside the court boundaries passes under or through the net, touches any other obstructions or a player’s body or clothing. The boundary and service lines are considered in play.\n" +
            "• Hitting the shuttle twice in succession by a player or team.\n" +
            "• A player touching the net or its supports with his body or racket while the shuttle is in play.\n" +
            "6. The inner line will be considered as the game line.\n" +
            "7. In case of conflicts Referee’s decision will be final decision."

            ,"1. The distance to be covered in marathon will be 3.5 kms for boys and 2.5 kms for girls.\n" +
            "2. There will be 4 checkpoints at which coordinators will be providing the participants coupons, for completing the race the participants must have all 4 coupons at the end of the race."

            ,"1. Team must have a minimum of 5 players including goalkeeper.\n" +
            "2. Goalkeeper is not allowed to touch the ball by hands.\n" +
            "3. No parts of the hand (below elbow) are allowed even for throw in.\n" +
            "4. We do appreciate attacking play, defensive plays is not allowed therefore on each 5th corner conceded a penalty will be awarded.\n" +
            "5. For a foul play if the referee deems necessary he can give a greencard to the player where the player will not be included in the game for 2 minutes.\n" +
            "6. On the 2nd greencard the player will be immediately given a redcard.\n" +
            "7. A straight redcard can also be awarded if deemed necessary.\n" +
            "8. In case of conflicts Referee’s decision will be final decision.\n" +
            "9. There will be 2 halves each of 15 minutes with 5 minutes break in between the halves."

            ,"lan gaming"};
    public static class MyPagerAdapter extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView mTextView,mTextView2,mTextView3,mTextView4, mTextView5,mTextView6;
        private MyPagerAdapter(View v) {
            super(v);

            mCardView = v.findViewById(R.id.card);
            mTextView = v.findViewById(R.id.about);
       //     mTextView2 =v.findViewById(R.id.location);
            mTextView4=v.findViewById(R.id.date);
            mTextView3=v.findViewById(R.id.organizer);
            mTextView2=v.findViewById(R.id.venue);
            mTextView5=v.findViewById(R.id.entryfee);
            mTextView6=v.findViewById(R.id.rules);
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


        if(type.equalsIgnoreCase("TECHNICAL")){
        for(int i=0;i<technical.length;i++) {
            if (title.equals(technical[i])) {
                holder.mTextView.setText(tAbout[i]);
                holder.mTextView2.setText(tVenu[i]);
                holder.mTextView3.setText(torganiser[i]);
                holder.mTextView4.setText(tdates[i]);
                holder.mTextView5.setText(tEntryFee[i]);
                holder.mTextView6.setText(tRules[i]);
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
                    holder.mTextView5.setText(cEntryFee[i]);
                    holder.mTextView6.setText(cRules[i]);
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
                        holder.mTextView5.setText(sEntryFee[i]);
                        holder.mTextView6.setText(sRules[i]);
                        break;
                    }}
            }

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
