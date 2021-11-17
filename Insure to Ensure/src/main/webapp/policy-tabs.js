var tabs=document.querySelectorAll("#tab-btn");
var content=document.getElementById("policy-data");
var myClients=document.getElementById("my-clients");
tabs.forEach(function(e){
	var name=e.textContent;
	e.addEventListener("click",function(){
		content.innerHTML=`<h2 style="margin-bottom: 2rem; text-transform: capitalize;">${name}</h2>
		<h3>About</h3>
		<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus, ut eveniet aperiam magnam debitis dolores vero est consequatur consequuntur aspernatur obcaecati hic fugit nulla non libero porro fuga fugiat maxime accusantium eaque? Ipsum assumenda placeat consequatur dicta rerum blanditiis iusto quod labore. Culpa harum impedit voluptas facilis nostrum velit magni?</p>
		<h3>Benefits</h3>
		<ol style="list-style-type: disc;">
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minima, quibusdam nemo assumenda rem voluptatibus vitae quo consequuntur delectus accusamus odit.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 2rem;">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minima, quibusdam nemo assumenda rem voluptatibus vitae quo consequuntur delectus accusamus odit.</li>
		</ol>
		<h3>From the Policy Makers</h3>
		<p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus, ut eveniet aperiam magnam debitis dolores vero est consequatur consequuntur aspernatur obcaecati hic fugit nulla non libero porro fuga fugiat maxime accusantium eaque? Ipsum assumenda placeat consequatur dicta rerum blanditiis iusto quod labore. Culpa harum impedit voluptas facilis nostrum velit magni?</p>
		<h3>Terms & Conditions</h3>
		<ol style="list-style-type: disc;">
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minima, quibusdam nemo assumenda rem voluptatibus vitae quo consequuntur delectus accusamus odit.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 2rem;">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minima, quibusdam nemo assumenda rem voluptatibus vitae quo consequuntur delectus accusamus odit.</li>
		</ol>
		<h3>Eligibility Criteria</h3>
		<ol style="list-style-type: disc;">
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minima, quibusdam nemo assumenda rem voluptatibus vitae quo consequuntur delectus accusamus odit.</li>
			<li style="margin-bottom: 1rem;">Lorem ipsum dolor sit amet consectetur adipisicing elit. Tempore, ea.</li>
			<li style="margin-bottom: 2rem;">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Minima, quibusdam nemo assumenda rem voluptatibus vitae quo consequuntur delectus accusamus odit.</li>
		</ol>
		<div class="generate-ref">
			<button class="generate-ref-btn">generate code <i class="fas fa-arrow-right" style="color: rgb(66, 192, 241); padding-left: 0.4rem;"></i></button>
			<p id="unique-ref-id">XXXXXX</p>
		</div>`;
	});
});
myClients.addEventListener("click",function(){
	content.innerHTML=`<h2 style="text-align: center;">My Clients</h2>
	<div class="divider" style="width: 10%; margin-bottom: 2rem;"></div>
	<div class="table-wrapper">
		<table>
			<tr>
				<th>S.no.</th>
				<th>Ref. Code</th>
				<th>Policy ID</th>
				<th>Name</th>
				<th>Agent Name</th>
			</tr>
			<tr>
				<td>1</td>
				<td>123456</td>
				<td>2</td>
				<td>Harsh Parwal</td>
				<td>Ishita Jain</td>
			</tr>
			<tr>
				<td>2</td>
				<td>654321</td>
				<td>4</td>
				<td>Vibhore Jain</td>
				<td>Shaily Bhaiya</td>
			</tr>
		</table>
	</div>`;
});