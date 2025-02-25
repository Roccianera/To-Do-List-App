import React from 'react';
import styled from 'styled-components';

const Card = () => {
  return (
    <StyledWrapper>
      <div className="card">
        <div className="card2">
            <h1>Hi</h1>
        </div>
      </div>
    </StyledWrapper>
  );
}

const StyledWrapper = styled.div`
  .card {
   width: 254px;
   height: 190px;
   background-image: linear-gradient(163deg, #00ff75 0%, #3700ff 100%);
   border-radius: 20px;
   transition: all .3s;
   margin-bottom: 0px;
  }

  .card2 {
   width: 254px;
   height: 190px;
   background-color: #1a1a1a;
   border-radius:;
   transition: all .2s;
   margin-bottom: 0px;

  }

  .card2:hover {
   transform: scale(0.98);
   border-radius: 20px;
  }

  .card:hover {
   box-shadow: 0px 0px 30px 1px rgba(0, 255, 117, 0.30);
  }`;

export default Card;
