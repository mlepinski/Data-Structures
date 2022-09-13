**Assignment #2**

**Due: Wednesday,‌ ‌September‌ ‌21‌ ‌at‌ ‌11:59pm**
 
The‌ ‌goal‌ ‌of‌ ‌this‌ ‌assignment‌ ‌is‌ ‌to‌ ‌use‌ ‌Java‌ ‌arrays‌ ‌as‌ ‌a‌ ‌tool‌ ‌to‌ ‌implement‌ ‌data‌ ‌structures‌ ‌
that‌ ‌store‌ ‌sequential‌ ‌data.‌ ‌In‌ ‌particular,‌ ‌we‌ ‌will‌ ‌implement‌ ‌a‌ ‌Stack‌ ‌of‌ ‌integers‌ ‌and‌ ‌a‌ ‌
Queue‌ ‌of‌ ‌integers.‌ ‌ ‌
 
**High‌ ‌Level:**
 
With‌ ‌a‌ ‌Stack,‌ ‌you‌ ‌add‌ ‌and‌ ‌remove‌ ‌elements‌ ‌from‌ ‌the‌ ‌same‌ ‌end‌ ‌of‌ ‌the‌ ‌sequence.‌ ‌(Also‌ ‌
known‌ ‌as:‌ ‌First‌ ‌in,‌ ‌Last‌ ‌Out)‌ ‌
 
With‌ ‌a‌ ‌Queue,‌ ‌you‌ ‌add‌ ‌elements‌ ‌at‌ ‌one‌ ‌end‌ ‌of‌ ‌the‌ ‌sequence‌ ‌and‌ ‌remove‌ ‌them‌ ‌from‌ ‌the‌ ‌
other‌ ‌end.‌ ‌(Also‌ ‌known‌ ‌as:‌ ‌First‌ ‌in,‌ ‌First‌ ‌Out)‌ ‌
 
The‌ ‌textbook‌ ‌has‌ ‌separate‌ ‌implementations‌ ‌of‌ ‌a‌ ‌Stack‌ ‌and‌ ‌a‌ ‌Queue.‌ ‌ ‌
 
For‌ ‌this‌ ‌assignment,‌ ‌we‌ ‌will‌ ‌create‌ ‌an‌ ‌UnlimitedArray‌ ‌data‌ ‌structure‌ ‌that‌ ‌allows‌ ‌you‌ ‌to‌ ‌
add‌ ‌elements‌ ‌on‌ ‌one‌ ‌end‌ ‌but‌ ‌you‌ ‌can‌ ‌remove‌ ‌elements‌ ‌from‌ ‌either‌ ‌end‌ ‌(You‌ ‌can‌ ‌only‌ ‌
add‌ ‌to‌ ‌the‌ ‌front‌ ‌but‌ ‌you‌ ‌can‌ ‌remove‌ ‌from‌ ‌the‌ ‌front‌ ‌or‌ ‌the‌ ‌back.)‌ ‌If‌ ‌we‌ ‌have‌ ‌this‌ ‌data‌ ‌
structure‌ ‌it‌ ‌will‌ ‌be‌ ‌easy‌ ‌to‌ ‌make‌ ‌either‌ ‌a‌ ‌Stack‌ ‌or‌ ‌a‌ ‌Queue.‌ ‌Indeed,‌ ‌I‌ ‌provide‌ ‌you‌ ‌with‌ ‌
Stack‌ ‌and‌ ‌Queue‌ ‌code‌ ‌that‌ ‌uses‌ ‌this‌ ‌data‌ ‌structure.‌ ‌ 
 
 
**Detailed‌ ‌Instructions:**
 
As‌ ‌indicated‌ ‌in‌ ‌the‌ ‌syllabus,‌ ‌you‌ ‌are‌ ‌welcome‌ ‌to‌ ‌collaborate‌ ‌and‌ ‌discuss‌ ‌these‌ ‌
assignments‌ ‌with‌ ‌others‌ ‌in‌ ‌the‌ ‌class,‌  ‌but‌ ‌everyone‌ ‌should‌ ‌submit‌ ‌their‌ ‌own‌ ‌code.‌ ‌
Additionally,‌ ‌in‌ ‌a‌ ‌comment‌ ‌at‌ ‌the‌ ‌top‌ ‌of‌ ‌your‌ ‌files,‌ ‌please‌ ‌include:‌ ‌

--‌ ‌Your‌ ‌Name‌ ‌

--‌ ‌The‌ ‌names‌ ‌of‌ ‌anyone‌ ‌that‌ ‌you‌ ‌collaborated‌ ‌with‌ ‌

--‌ ‌Any‌ ‌resources‌ ‌other‌ ‌than‌ ‌the‌ ‌textbook‌ ‌that‌ ‌were‌ ‌particularly‌ ‌helpful‌ ‌(Youtube‌ ‌videos,‌ ‌
online‌ ‌examples,‌ ‌etc)‌ ‌ ‌
 
You‌ ‌can‌ ‌find‌ ‌the‌ ‌code‌ ‌for‌ ‌in‌ ‌the‌ ‌course‌ ‌GitHub‌ ‌repository‌ ‌
(‌ ‌‌https://github.com/mlepinski/Data-Structures‌‌ ‌)‌ ‌
 
 
**Part‌ ‌A:‌**
 
In‌ ‌the‌ ‌GitHub‌ ‌you‌ ‌should‌ ‌find‌ ‌an‌ ‌interface‌ ‌‌UnlimitedArray.‌ ‌‌This‌ ‌is‌ ‌a‌ ‌Data‌ ‌Structure‌ ‌that‌ ‌allows‌ ‌
one‌ ‌to‌ ‌store‌ ‌a‌ ‌sequence‌ ‌of‌ ‌integers‌ ‌and‌ ‌add‌ ‌or‌ ‌remove‌ ‌elements‌ ‌from‌ ‌either‌ ‌end‌ ‌of‌ ‌the‌ ‌
sequence.‌ ‌ ‌
 
You‌ ‌should‌ ‌implement‌ ‌UnlimitedArray‌ ‌using‌ ‌a‌ ‌Java‌ ‌array‌ ‌of‌ ‌integers.‌ ‌ ‌You MUST NOT use an ArrayList for this assignment.
I‌ ‌would‌ ‌recommend‌ ‌that‌ ‌you‌ ‌start‌ ‌with‌ ‌a‌ ‌small‌ ‌size‌ ‌array‌ ‌
                  ‌E.g.,‌ ‌start‌ ‌with‌ ‌an‌ ‌array‌ ‌of‌ ‌four‌ ‌integers‌ ‌
                               ‌my_array‌ ‌=‌ ‌new‌ ‌int[4]‌ ‌
 
When‌ ‌you‌ ‌run‌ ‌out‌ ‌of‌ ‌space‌ ‌in‌ ‌your‌ ‌array,‌ ‌you‌ ‌should‌ ‌create‌ ‌a‌ ‌new,‌ ‌larger‌ ‌array‌ ‌
…‌ ‌then‌ ‌copy‌ ‌over‌ ‌your‌ ‌data‌ ‌into‌ ‌the‌ ‌new‌ ‌array‌ ‌
I‌ ‌would‌ ‌recommend‌ ‌that‌ ‌you‌ ‌put‌ ‌this‌ ‌code‌ ‌into‌ ‌a‌ ‌function‌ ‌called‌ ‌resize‌ ‌
 
Write‌ ‌two‌ ‌implementations‌ ‌of‌ ‌‌UnlimitedArray‌ ‌‌that‌ ‌are‌ ‌exactly‌ ‌the‌ ‌same‌ ‌except‌ ‌for‌ ‌the‌ ‌way‌ ‌they‌ ‌
handle‌ ‌"resizing".‌ ‌In‌ ‌the‌ ‌first‌ ‌implementation‌ ‌‌UnlimitedArraySlow,‌ ‌‌every‌‌ ‌‌time‌ ‌you‌ ‌run‌ ‌out‌ ‌of‌ ‌
space,‌ ‌you‌ ‌should‌ ‌add‌ ‌one‌ ‌more‌ ‌spot‌ ‌to‌ ‌your‌ ‌array.‌ ‌(That‌ ‌is,‌ ‌go‌ ‌from‌ ‌size‌ ‌4,‌ ‌to‌ ‌size‌ ‌5,‌ ‌to‌ ‌size‌ ‌6,‌ ‌
etc).‌ ‌In‌ ‌the‌ ‌second‌ ‌implementation‌ ‌‌UnlimitedArrayFast,‌ ‌‌every‌ ‌time‌ ‌you‌ ‌run‌ ‌out‌ ‌of‌ ‌space,‌ ‌you‌ ‌
should‌ ‌double‌ ‌the‌ ‌size‌ ‌of‌ ‌the‌ ‌array.‌ ‌(That‌ ‌is,‌ ‌go‌ ‌from‌ ‌size‌ ‌4,‌ ‌to‌ ‌size‌ ‌8,‌ ‌to‌ ‌size‌ ‌16,‌ ‌etc)‌ ‌ ‌
 
Note:‌ ‌‌There‌ ‌is‌ ‌nothing‌ ‌special‌ ‌about‌ ‌doubling,‌ ‌if‌ ‌you‌ ‌want‌ ‌to‌ ‌try‌ ‌1.5‌ ‌times‌ ‌bigger,‌ ‌or‌ ‌tripling‌ ‌the‌ ‌
size‌ ‌that‌ ‌is‌ ‌fine.‌ ‌
 
Run‌ ‌the‌ ‌test‌ ‌code‌ ‌to‌ ‌make‌ ‌sure‌ ‌that‌ ‌the‌ ‌Stack‌ ‌and‌ ‌Queue‌ ‌work‌ ‌using‌ ‌your‌ ‌implementations‌ ‌of‌ ‌
UnlimitedArrayFast‌ ‌and‌ ‌UnlimitedArraySlow‌ ‌
 
Use‌ ‌the‌ ‌Part‌ ‌A‌ ‌timing‌ ‌code‌ ‌to‌ ‌get‌ ‌runtime‌ ‌measurements‌ ‌for‌ ‌both‌‌ ‌UnlimitedArraySlow‌‌ ‌and‌ ‌
UnlimitedArrayFast‌.‌ ‌Your‌ ‌goal‌ ‌is‌ ‌to‌ ‌observe‌ ‌that‌ ‌UnlimitedArraySlow‌ ‌has‌ ‌substantially‌ ‌worse‌ ‌
runtime‌ ‌growth‌ ‌(longer‌ ‌runtimes)‌ ‌than‌ ‌UnlimitedArrayFast.‌ ‌Depending‌ ‌on‌ ‌your‌ ‌computer,‌ ‌you‌ ‌
will‌ ‌need‌ ‌to‌ ‌pick‌ ‌sufficiently‌ ‌large‌ ‌values‌ ‌for‌ ‌the‌ ‌amount‌ ‌of‌ ‌data‌ ‌to‌ ‌observe‌ ‌these‌ ‌trends.‌ ‌ ‌
 
Please‌ ‌create‌ ‌a‌ ‌graph‌ ‌or‌ ‌chart‌ ‌that‌ ‌shows‌ ‌N‌ ‌on‌ ‌the‌ ‌X-axis‌ ‌and‌ ‌Runtime‌ ‌/‌ ‌N‌ ‌on‌ ‌the‌ ‌Y-axis.‌ ‌I‌ ‌
recommend‌ ‌Google‌ ‌Sheets‌ ‌or‌ ‌Excel‌ ‌or‌ ‌Open‌ ‌Office‌ ‌to‌ ‌produce‌ ‌this‌ ‌graph,‌ ‌but‌ ‌any‌ ‌tool‌ ‌is‌ ‌fine.‌ ‌ ‌
 

**Part‌ ‌B:**

The‌ ‌textbook‌ ‌(in‌ ‌the‌ ‌queue‌ ‌chapters)‌ ‌discusses‌ ‌creating‌ ‌"circular"‌ ‌array‌ ‌structure.‌ ‌The‌ ‌core‌ ‌idea‌ ‌
is‌ ‌the‌ ‌following:‌ ‌
Suppose‌ ‌the‌ ‌array‌ ‌is‌ ‌100‌ ‌long‌ ‌and‌ ‌the‌ ‌data‌ ‌is‌ ‌currently‌ ‌goes‌ ‌from‌ ‌slot‌ ‌50‌ ‌to‌ ‌100‌ ‌
…‌ ‌for‌ ‌example‌ ‌you‌ ‌had‌ ‌100‌ ‌items‌ ‌in‌ ‌the‌ ‌array‌ ‌and‌ ‌then‌ ‌removed‌ ‌50‌ ‌items‌ ‌from‌ ‌the‌ ‌front‌ ‌
Then‌ ‌if‌ ‌you‌ ‌add‌ ‌a‌ ‌new‌ ‌item‌ ‌to‌ ‌the‌ ‌end‌ ‌of‌ ‌the‌ ‌array,‌ ‌you‌ ‌don't‌ ‌need‌ ‌more‌ ‌space‌ ‌
            ‌…‌ ‌You‌ ‌can‌ ‌just‌ ‌"wrap‌ ‌around"‌ ‌and‌ ‌use‌ ‌the‌ ‌empty‌ ‌spots‌ ‌at‌ ‌the‌ ‌beginning‌ ‌of‌ ‌the‌ ‌array‌ ‌
 
Write‌ ‌an‌ ‌implementation‌ ‌of‌ ‌‌UnlimitedArray‌ ‌‌called‌ ‌‌UnlimitedArrayCircle,‌ ‌‌that‌ ‌uses‌ ‌this‌ ‌
"wrap-around"‌ ‌approach.‌ ‌
 
Use‌ ‌the‌ ‌Part‌ ‌B‌ ‌timing‌ ‌code‌ ‌to‌ ‌get‌ ‌runtime‌ ‌measurements‌ ‌for‌ ‌both‌‌ ‌UnlimitedArrayFast‌‌ ‌and‌ ‌
UnlimitedArrayCircle‌.‌ ‌Again‌ ‌you‌ ‌should‌ ‌pick‌ ‌very large‌ ‌sizes‌ ‌to‌ ‌try‌ ‌and‌ ‌see‌ ‌the‌ ‌difference‌ ‌between‌ ‌
the‌ ‌two‌ ‌approaches.‌ ‌
 
Please‌ ‌create‌ ‌a‌ ‌graph‌ ‌or‌ ‌chart‌ ‌that‌ ‌shows‌ ‌N‌ ‌on‌ ‌the‌ ‌X-axis‌ ‌and‌ ‌Runtime‌ ‌/‌ ‌N‌ ‌on‌ ‌the‌ ‌Y-axis.‌ ‌I‌ ‌
recommend‌ ‌Google‌ ‌Sheets‌ ‌or‌ ‌Excel‌ ‌or‌ ‌Open‌ ‌Office‌ ‌to‌ ‌produce‌ ‌this‌ ‌graph,‌ ‌but‌ ‌any‌ ‌tool‌ ‌is‌ ‌fine.‌ ‌ ‌
 
 
**Submission:**
 
After‌ ‌you‌ ‌have‌ ‌completed‌ ‌the‌ ‌assignment,‌ ‌please‌ ‌submit‌ ‌a‌ ‌zip‌ ‌file‌ ‌containing‌ ‌three java‌ ‌files:‌ ‌

* UnlimitedArraySlow.java‌ 
* UnlimitedArrayFast.java‌ ‌
* UnlimitedArrayCircle.java‌ ‌
* A‌ ‌file‌ ‌containing‌ ‌a‌ ‌graph/chart‌ ‌of‌ ‌your‌ ‌runtime‌ ‌measurements‌ ‌for‌ ‌Part‌ ‌A‌ ‌
* A‌ ‌file‌ ‌containing‌ ‌a‌ ‌graph/chart‌ ‌of‌ ‌your‌ ‌runtime‌ ‌measurements‌ ‌for‌ ‌Part‌ ‌B‌ ‌
 
 
